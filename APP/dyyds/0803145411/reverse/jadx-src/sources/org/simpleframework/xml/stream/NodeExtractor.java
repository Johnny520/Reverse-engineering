package org.simpleframework.xml.stream;

import java.util.LinkedList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class NodeExtractor extends LinkedList<org.w3c.dom.Node> {
    public NodeExtractor(Document document) {
        extract(document);
    }

    private void extract(org.w3c.dom.Node node) {
        NodeList childNodes = node.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            org.w3c.dom.Node nodeItem = childNodes.item(i);
            if (nodeItem.getNodeType() != 8) {
                offer(nodeItem);
                extract(nodeItem);
            }
        }
    }

    private void extract(Document document) {
        Element documentElement = document.getDocumentElement();
        if (documentElement != null) {
            offer(documentElement);
            extract(documentElement);
        }
    }
}
