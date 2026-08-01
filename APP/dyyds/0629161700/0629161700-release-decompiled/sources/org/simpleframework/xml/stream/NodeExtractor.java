package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class NodeExtractor extends java.util.LinkedList<org.w3c.dom.Node> {
    public NodeExtractor(org.w3c.dom.Document r1) {
            r0 = this;
            r0.<init>()
            r0.extract(r1)
            return
    }

    private void extract(org.w3c.dom.Document r1) {
            r0 = this;
            org.w3c.dom.Element r1 = r1.getDocumentElement()
            if (r1 == 0) goto Lc
            r0.offer(r1)
            r0.extract(r1)
        Lc:
            return
    }

    private void extract(org.w3c.dom.Node r6) {
            r5 = this;
            org.w3c.dom.NodeList r6 = r6.getChildNodes()
            int r0 = r6.getLength()
            r1 = 0
        L9:
            if (r1 >= r0) goto L20
            org.w3c.dom.Node r2 = r6.item(r1)
            short r3 = r2.getNodeType()
            r4 = 8
            if (r3 == r4) goto L1d
            r5.offer(r2)
            r5.extract(r2)
        L1d:
            int r1 = r1 + 1
            goto L9
        L20:
            return
    }
}
