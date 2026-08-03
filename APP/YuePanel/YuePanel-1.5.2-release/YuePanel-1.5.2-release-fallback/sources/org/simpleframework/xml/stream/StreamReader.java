package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class StreamReader implements org.simpleframework.xml.stream.EventReader {
    private org.simpleframework.xml.stream.EventNode peek;
    private Yue.InterfaceC7148 reader;

    /* JADX INFO: renamed from: org.simpleframework.xml.stream.StreamReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class End extends org.simpleframework.xml.stream.EventToken {
        private End() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ End(org.simpleframework.xml.stream.StreamReader.AnonymousClass1 r1) {
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
        private final Yue.InterfaceC0645 entry;

        public Entry(Yue.InterfaceC0645 r1) {
                r0 = this;
                r0.<init>()
                r0.entry = r1
                return
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public java.lang.String getName() {
                r1 = this;
                Yue.ۥ۟ۢ۠ۡ r0 = r1.entry
                Yue.ۥۡۥۤۨ r0 = r0.getName()
                java.lang.String r0 = r0.m19420()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.String getPrefix() {
                r1 = this;
                Yue.ۥ۟ۢ۠ۡ r0 = r1.entry
                Yue.ۥۡۥۤۨ r0 = r0.getName()
                java.lang.String r0 = r0.m19422()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.String getReference() {
                r1 = this;
                Yue.ۥ۟ۢ۠ۡ r0 = r1.entry
                Yue.ۥۡۥۤۨ r0 = r0.getName()
                java.lang.String r0 = r0.m19421()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.Object getSource() {
                r1 = this;
                Yue.ۥ۟ۢ۠ۡ r0 = r1.entry
                return r0
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public java.lang.String getValue() {
                r1 = this;
                Yue.ۥ۟ۢ۠ۡ r0 = r1.entry
                java.lang.String r0 = r0.getValue()
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
        private final Yue.InterfaceC5922 element;
        private final Yue.InterfaceC3728 location;

        public Start(Yue.InterfaceC7142 r2) {
                r1 = this;
                r1.<init>()
                Yue.ۥۢ۟ۨۤ r0 = r2.mo4248()
                r1.element = r0
                Yue.ۥ۠ۧۧۧ r2 = r2.mo4237()
                r1.location = r2
                return
        }

        public java.util.Iterator<Yue.InterfaceC0645> getAttributes() {
                r1 = this;
                Yue.ۥۢ۟ۨۤ r0 = r1.element
                java.util.Iterator r0 = r0.getAttributes()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventElement, org.simpleframework.xml.stream.EventNode
        public int getLine() {
                r1 = this;
                Yue.ۥ۠ۧۧۧ r0 = r1.location
                int r0 = r0.mo4246()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getName() {
                r1 = this;
                Yue.ۥۢ۟ۨۤ r0 = r1.element
                Yue.ۥۡۥۤۨ r0 = r0.getName()
                java.lang.String r0 = r0.m19420()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getPrefix() {
                r1 = this;
                Yue.ۥۢ۟ۨۤ r0 = r1.element
                Yue.ۥۡۥۤۨ r0 = r0.getName()
                java.lang.String r0 = r0.m19422()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getReference() {
                r1 = this;
                Yue.ۥۢ۟ۨۤ r0 = r1.element
                Yue.ۥۡۥۤۨ r0 = r0.getName()
                java.lang.String r0 = r0.m19421()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.Object getSource() {
                r1 = this;
                Yue.ۥۢ۟ۨۤ r0 = r1.element
                return r0
        }
    }

    public static class Text extends org.simpleframework.xml.stream.EventToken {
        private final Yue.InterfaceC1093 text;

        public Text(Yue.InterfaceC7142 r1) {
                r0 = this;
                r0.<init>()
                Yue.ۥۣ۟ۤۥ r1 = r1.mo4247()
                r0.text = r1
                return
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public java.lang.Object getSource() {
                r1 = this;
                Yue.ۥۣ۟ۤۥ r0 = r1.text
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public java.lang.String getValue() {
                r1 = this;
                Yue.ۥۣ۟ۤۥ r0 = r1.text
                java.lang.String r0 = r0.getData()
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public StreamReader(Yue.InterfaceC7148 r1) {
            r0 = this;
            r0.<init>()
            r0.reader = r1
            return
    }

    private org.simpleframework.xml.stream.StreamReader.Entry attribute(Yue.InterfaceC0645 r2) {
            r1 = this;
            org.simpleframework.xml.stream.StreamReader$Entry r0 = new org.simpleframework.xml.stream.StreamReader$Entry
            r0.<init>(r2)
            return r0
    }

    private org.simpleframework.xml.stream.StreamReader.Start build(org.simpleframework.xml.stream.StreamReader.Start r4) {
            r3 = this;
            java.util.Iterator r0 = r4.getAttributes()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۢ۠ۡ r1 = (Yue.InterfaceC0645) r1
            org.simpleframework.xml.stream.StreamReader$Entry r1 = r3.attribute(r1)
            boolean r2 = r1.isReserved()
            if (r2 != 0) goto L4
            r4.add(r1)
            goto L4
        L1e:
            return r4
    }

    private org.simpleframework.xml.stream.StreamReader.End end() {
            r2 = this;
            org.simpleframework.xml.stream.StreamReader$End r0 = new org.simpleframework.xml.stream.StreamReader$End
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private org.simpleframework.xml.stream.EventNode read() throws java.lang.Exception {
            r2 = this;
            Yue.ۥۢۦۣۡ r0 = r2.reader
            Yue.ۥۢۦ۠ۨ r0 = r0.mo10309()
            boolean r1 = r0.mo4251()
            if (r1 != 0) goto L32
            boolean r1 = r0.mo4235()
            if (r1 == 0) goto L17
            org.simpleframework.xml.stream.StreamReader$Start r0 = r2.start(r0)
            return r0
        L17:
            boolean r1 = r0.mo4232()
            if (r1 == 0) goto L22
            org.simpleframework.xml.stream.StreamReader$Text r0 = r2.text(r0)
            return r0
        L22:
            boolean r0 = r0.mo4234()
            if (r0 == 0) goto L2d
            org.simpleframework.xml.stream.StreamReader$End r0 = r2.end()
            return r0
        L2d:
            org.simpleframework.xml.stream.EventNode r0 = r2.read()
            return r0
        L32:
            r0 = 0
            return r0
    }

    private org.simpleframework.xml.stream.StreamReader.Start start(Yue.InterfaceC7142 r2) {
            r1 = this;
            org.simpleframework.xml.stream.StreamReader$Start r0 = new org.simpleframework.xml.stream.StreamReader$Start
            r0.<init>(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L10
            org.simpleframework.xml.stream.StreamReader$Start r2 = r1.build(r0)
            return r2
        L10:
            return r0
    }

    private org.simpleframework.xml.stream.StreamReader.Text text(Yue.InterfaceC7142 r2) {
            r1 = this;
            org.simpleframework.xml.stream.StreamReader$Text r0 = new org.simpleframework.xml.stream.StreamReader$Text
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
