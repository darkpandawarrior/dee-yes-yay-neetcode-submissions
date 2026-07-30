/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Codec {
    private val NULL_MARKER = "N"
    private val DELIMITTER = ","
    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        var builder = StringBuilder()
        fun buildString(node: TreeNode?){
            if(node == null){
                builder.append(NULL_MARKER).append(DELIMITTER)
                return
            }
            builder.append(node.`val`).append(DELIMITTER)
            buildString(node.left)
            buildString(node.right)
        }
        buildString(root)
        return builder.toString()  
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        if(data.isEmpty()) return null
        val nodes = data.split(DELIMITTER).iterator()

        fun buildTree() : TreeNode?{
            if(!nodes.hasNext()) return null
            val nodeStr = nodes.next()
            if(nodeStr == NULL_MARKER || nodeStr.isEmpty()){
                return null
            }
            val node = TreeNode(nodeStr.toInt())
            node.left = buildTree()
            node.right = buildTree()
            return node
        }
        return buildTree()
    }
}
