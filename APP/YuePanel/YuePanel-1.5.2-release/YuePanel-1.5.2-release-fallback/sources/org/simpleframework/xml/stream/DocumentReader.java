package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class DocumentReader implements org.simpleframework.xml.stream.EventReader {
    private static final java.lang.String RESERVED = "xml";
    private org.simpleframework.xml.stream.EventNode peek;
    private org.simpleframework.xml.stream.NodeExtractor queue;
    private org.simpleframework.xml.stream.NodeStack stack;

    /* JADX INFO: renamed from: org.simpleframework.xml.stream.DocumentReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class End extends org.simpleframework.xml.stream.EventToken {
        private End() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ End(org.simpleframework.xml.stream.DocumentReader.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isEnd() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public static class Entry extends org.simpleframework.xml.stream.EventAttribute {
        private final org.w3c.dom.Node node;

        public Entry(org.w3c.dom.Node r1) {
                r0 = this;
                r0.<init>()
                r0.node = r1
                return
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public java.lang.String getName() {
                r1 = this;
                org.w3c.dom.Node r0 = r1.node
                java.lang.String r0 = r0.getLocalName()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.String getPrefix() {
                r1 = this;
                org.w3c.dom.Node r0 = r1.node
                java.lang.String r0 = r0.getPrefix()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.String getReference() {
                r1 = this;
                org.w3c.dom.Node r0 = r1.node
                java.lang.String r0 = r0.getNamespaceURI()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.Object getSource() {
                r1 = this;
                org.w3c.dom.Node r0 = r1.node
                return r0
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public java.lang.String getValue() {
                r1 = this;
                org.w3c.dom.Node r0 = r1.node
                java.lang.String r0 = r0.getNodeValue()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
                r3 = this;
                java.lang.String r0 = r3.getPrefix()
                java.lang.String r1 = r3.getName()
                java.lang.String r2 = "xml"
                if (r0 == 0) goto L11
                boolean r0 = r0.startsWith(r2)
                return r0
            L11:
                boolean r0 = r1.startsWith(r2)
                return r0
        }
    }

    public static class Start extends org.simpleframework.xml.stream.EventElement {
        private final org.w3c.dom.Element element;

        public Start(org.w3c.dom.Node r1) {
                r0 = this;
                r0.<init>()
                org.w3c.dom.Element r1 = (org.w3c.dom.Element) r1
                r0.element = r1
                return
        }

        public org.w3c.dom.NamedNodeMap getAttributes() {
                r1 = this;
                org.w3c.dom.Element r0 = r1.element
                org.w3c.dom.NamedNodeMap r0 = r0.getAttributes()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getName() {
                r1 = this;
                org.w3c.dom.Element r0 = r1.element
                java.lang.String r0 = r0.getLocalName()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getPrefix() {
                r1 = this;
                org.w3c.dom.Element r0 = r1.element
                java.lang.String r0 = r0.getPrefix()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getReference() {
                r1 = this;
                org.w3c.dom.Element r0 = r1.element
                java.lang.String r0 = r0.getNamespaceURI()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.Object getSource() {
                r1 = this;
                org.w3c.dom.Element r0 = r1.element
                return r0
        }
    }

    public static class Text extends org.simpleframework.xml.stream.EventToken {
        private final org.w3c.dom.Node node;

        public Text(org.w3c.dom.Node r1) {
                r0 = this;
                r0.<init>()
                r0.node = r1
                return
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public java.lang.Object getSource() {
                r1 = this;
                org.w3c.dom.Node r0 = r1.node
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public java.lang.String getValue() {
                r1 = this;
                org.w3c.dom.Node r0 = r1.node
                java.lang.String r0 = r0.getNodeValue()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public DocumentReader(org.w3c.dom.Document r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.stream.NodeExtractor r0 = new org.simpleframework.xml.stream.NodeExtractor
            r0.<init>(r2)
            r1.queue = r0
            org.simpleframework.xml.stream.NodeStack r0 = new org.simpleframework.xml.stream.NodeStack
            r0.<init>()
            r1.stack = r0
            r0.push(r2)
            return
    }

    private org.simpleframework.xml.stream.DocumentReader.Entry attribute(org.w3c.dom.Node r2) {
            r1 = this;
            org.simpleframework.xml.stream.DocumentReader$Entry r0 = new org.simpleframework.xml.stream.DocumentReader$Entry
            r0.<init>(r2)
            return r0
    }

    private org.simpleframework.xml.stream.DocumentReader.Start build(org.simpleframework.xml.stream.DocumentReader.Start r6) {
            r5 = this;
            org.w3c.dom.NamedNodeMap r0 = r6.getAttributes()
            int r1 = r0.getLength()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1f
            org.w3c.dom.Node r3 = r0.item(r2)
            org.simpleframework.xml.stream.DocumentReader$Entry r3 = r5.attribute(r3)
            boolean r4 = r3.isReserved()
            if (r4 != 0) goto L1c
            r6.add(r3)
        L1c:
            int r2 = r2 + 1
            goto L9
        L1f:
            return r6
    }

    private org.simpleframework.xml.stream.EventNode convert(org.w3c.dom.Node r3) throws java.lang.Exception {
            r2 = this;
            short r0 = r3.getNodeType()
            r1 = 1
            if (r0 != r1) goto L11
            org.simpleframework.xml.stream.NodeStack r0 = r2.stack
            r0.push(r3)
            org.simpleframework.xml.stream.DocumentReader$Start r3 = r2.start(r3)
            return r3
        L11:
            org.simpleframework.xml.stream.DocumentReader$Text r3 = r2.text(r3)
            return r3
    }

    private org.simpleframework.xml.stream.DocumentReader.End end() {
            r2 = this;
            org.simpleframework.xml.stream.DocumentReader$End r0 = new org.simpleframework.xml.stream.DocumentReader$End
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private org.simpleframework.xml.stream.EventNode read() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.NodeExtractor r0 = r1.queue
            java.lang.Object r0 = r0.peek()
            org.w3c.dom.Node r0 = (org.w3c.dom.Node) r0
            if (r0 != 0) goto Lf
            org.simpleframework.xml.stream.DocumentReader$End r0 = r1.end()
            return r0
        Lf:
            org.simpleframework.xml.stream.EventNode r0 = r1.read(r0)
            return r0
    }

    private org.simpleframework.xml.stream.EventNode read(org.w3c.dom.Node r3) throws java.lang.Exception {
            r2 = this;
            org.w3c.dom.Node r0 = r3.getParentNode()
            org.simpleframework.xml.stream.NodeStack r1 = r2.stack
            java.lang.Object r1 = r1.top()
            org.w3c.dom.Node r1 = (org.w3c.dom.Node) r1
            if (r0 == r1) goto L1a
            if (r1 == 0) goto L15
            org.simpleframework.xml.stream.NodeStack r3 = r2.stack
            r3.pop()
        L15:
            org.simpleframework.xml.stream.DocumentReader$End r3 = r2.end()
            return r3
        L1a:
            org.simpleframework.xml.stream.NodeExtractor r0 = r2.queue
            r0.poll()
            org.simpleframework.xml.stream.EventNode r3 = r2.convert(r3)
            return r3
    }

    private org.simpleframework.xml.stream.DocumentReader.Start start(org.w3c.dom.Node r2) {
            r1 = this;
            org.simpleframework.xml.stream.DocumentReader$Start r0 = new org.simpleframework.xml.stream.DocumentReader$Start
            r0.<init>(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L10
            org.simpleframework.xml.stream.DocumentReader$Start r2 = r1.build(r0)
            return r2
        L10:
            return r0
    }

    private org.simpleframework.xml.stream.DocumentReader.Text text(org.w3c.dom.Node r2) {
            r1 = this;
            org.simpleframework.xml.stream.DocumentReader$Text r0 = new org.simpleframework.xml.stream.DocumentReader$Text
            r0.<init>(r2)
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public org.simpleframework.xml.stream.EventNode next() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.EventNode r0 = r2.peek
            if (r0 != 0) goto L9
            org.simpleframework.xml.stream.EventNode r0 = r2.read()
            goto Lc
        L9:
            r1 = 0
            r2.peek = r1
        Lc:
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public org.simpleframework.xml.stream.EventNode peek() throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.EventNode r0 = r1.peek
            if (r0 != 0) goto La
            org.simpleframework.xml.stream.EventNode r0 = r1.next()
            r1.peek = r0
        La:
            org.simpleframework.xml.stream.EventNode r0 = r1.peek
            return r0
    }
}
