package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class PullReader implements org.simpleframework.xml.stream.EventReader {
    private org.xmlpull.v1.XmlPullParser parser;
    private org.simpleframework.xml.stream.EventNode peek;

    /* JADX INFO: renamed from: org.simpleframework.xml.stream.PullReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class End extends org.simpleframework.xml.stream.EventToken {
        private End() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ End(org.simpleframework.xml.stream.PullReader.AnonymousClass1 r1) {
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
        private final java.lang.String name;
        private final java.lang.String prefix;
        private final java.lang.String reference;
        private final org.xmlpull.v1.XmlPullParser source;
        private final java.lang.String value;

        public Entry(org.xmlpull.v1.XmlPullParser r2, int r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.getAttributeNamespace(r3)
                r1.reference = r0
                java.lang.String r0 = r2.getAttributePrefix(r3)
                r1.prefix = r0
                java.lang.String r0 = r2.getAttributeValue(r3)
                r1.value = r0
                java.lang.String r3 = r2.getAttributeName(r3)
                r1.name = r3
                r1.source = r2
                return
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.String getPrefix() {
                r1 = this;
                java.lang.String r0 = r1.prefix
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.String getReference() {
                r1 = this;
                java.lang.String r0 = r1.reference
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.Object getSource() {
                r1 = this;
                org.xmlpull.v1.XmlPullParser r0 = r1.source
                return r0
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public static class Start extends org.simpleframework.xml.stream.EventElement {
        private final int line;
        private final java.lang.String name;
        private final java.lang.String prefix;
        private final java.lang.String reference;
        private final org.xmlpull.v1.XmlPullParser source;

        public Start(org.xmlpull.v1.XmlPullParser r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.getNamespace()
                r1.reference = r0
                int r0 = r2.getLineNumber()
                r1.line = r0
                java.lang.String r0 = r2.getPrefix()
                r1.prefix = r0
                java.lang.String r0 = r2.getName()
                r1.name = r0
                r1.source = r2
                return
        }

        @Override // org.simpleframework.xml.stream.EventElement, org.simpleframework.xml.stream.EventNode
        public int getLine() {
                r1 = this;
                int r0 = r1.line
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getPrefix() {
                r1 = this;
                java.lang.String r0 = r1.prefix
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getReference() {
                r1 = this;
                java.lang.String r0 = r1.reference
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.Object getSource() {
                r1 = this;
                org.xmlpull.v1.XmlPullParser r0 = r1.source
                return r0
        }
    }

    public static class Text extends org.simpleframework.xml.stream.EventToken {
        private final org.xmlpull.v1.XmlPullParser source;
        private final java.lang.String text;

        public Text(org.xmlpull.v1.XmlPullParser r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.getText()
                r1.text = r0
                r1.source = r2
                return
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public java.lang.Object getSource() {
                r1 = this;
                org.xmlpull.v1.XmlPullParser r0 = r1.source
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.text
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public PullReader(org.xmlpull.v1.XmlPullParser r1) {
            r0 = this;
            r0.<init>()
            r0.parser = r1
            return
    }

    private org.simpleframework.xml.stream.PullReader.Entry attribute(int r3) throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.PullReader$Entry r0 = new org.simpleframework.xml.stream.PullReader$Entry
            org.xmlpull.v1.XmlPullParser r1 = r2.parser
            r0.<init>(r1, r3)
            return r0
    }

    private org.simpleframework.xml.stream.PullReader.Start build(org.simpleframework.xml.stream.PullReader.Start r5) throws java.lang.Exception {
            r4 = this;
            org.xmlpull.v1.XmlPullParser r0 = r4.parser
            int r0 = r0.getAttributeCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            org.simpleframework.xml.stream.PullReader$Entry r2 = r4.attribute(r1)
            boolean r3 = r2.isReserved()
            if (r3 != 0) goto L16
            r5.add(r2)
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            return r5
    }

    private org.simpleframework.xml.stream.PullReader.End end() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.PullReader$End r0 = new org.simpleframework.xml.stream.PullReader$End
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private org.simpleframework.xml.stream.EventNode read() throws java.lang.Exception {
            r2 = this;
            org.xmlpull.v1.XmlPullParser r0 = r2.parser
            int r0 = r0.next()
            r1 = 1
            if (r0 == r1) goto L26
            r1 = 2
            if (r0 != r1) goto L11
            org.simpleframework.xml.stream.PullReader$Start r0 = r2.start()
            return r0
        L11:
            r1 = 4
            if (r0 != r1) goto L19
            org.simpleframework.xml.stream.PullReader$Text r0 = r2.text()
            return r0
        L19:
            r1 = 3
            if (r0 != r1) goto L21
            org.simpleframework.xml.stream.PullReader$End r0 = r2.end()
            return r0
        L21:
            org.simpleframework.xml.stream.EventNode r0 = r2.read()
            return r0
        L26:
            r0 = 0
            return r0
    }

    private org.simpleframework.xml.stream.PullReader.Start start() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.PullReader$Start r0 = new org.simpleframework.xml.stream.PullReader$Start
            org.xmlpull.v1.XmlPullParser r1 = r2.parser
            r0.<init>(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L11
            org.simpleframework.xml.stream.PullReader$Start r0 = r2.build(r0)
        L11:
            return r0
    }

    private org.simpleframework.xml.stream.PullReader.Text text() throws java.lang.Exception {
            r2 = this;
            org.simpleframework.xml.stream.PullReader$Text r0 = new org.simpleframework.xml.stream.PullReader$Text
            org.xmlpull.v1.XmlPullParser r1 = r2.parser
            r0.<init>(r1)
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
