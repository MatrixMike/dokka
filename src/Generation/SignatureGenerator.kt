package org.jetbrains.dokka

trait SignatureGenerator {
    fun render(node: DocumentationNode): String
    fun renderFunction(node: DocumentationNode): String
    fun renderClass(node: DocumentationNode): String
    fun renderTypeParametersForNode(node: DocumentationNode): String
    fun renderTypeParameter(node: DocumentationNode): String
    fun renderParameter(node: DocumentationNode): String
    fun renderType(node: DocumentationNode): String
    fun renderPackage(node: DocumentationNode): String
    fun renderProperty(node: DocumentationNode): String
}
