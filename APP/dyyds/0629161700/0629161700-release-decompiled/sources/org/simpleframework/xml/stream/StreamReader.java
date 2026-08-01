package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class StreamReader implements org.simpleframework.xml.stream.EventReader {
    private org.simpleframework.xml.stream.EventNode peek;
    private defpackage.InterfaceC1076 reader;

    /* JADX INFO: renamed from: org.simpleframework.xml.stream.StreamReader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
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
                r0 = this;
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class Entry extends org.simpleframework.xml.stream.EventAttribute {
        private final defpackage.InterfaceC2114 entry;

        public Entry(defpackage.InterfaceC2114 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public java.lang.String getName() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.String getPrefix() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.String getReference() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public java.lang.Object getSource() {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public java.lang.String getValue() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
                r0 = this;
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class Start extends org.simpleframework.xml.stream.EventElement {
        private final defpackage.InterfaceC0779 element;
        private final defpackage.InterfaceC0983 location;

        public Start(defpackage.InterfaceC1068 r1) {
                r0 = this;
                r0.<init>()
                r1.m2029()
                r1.m2027()
                return
        }

        public java.util.Iterator<defpackage.InterfaceC2114> getAttributes() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventElement, org.simpleframework.xml.stream.EventNode
        public int getLine() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getName() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getPrefix() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.String getReference() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public java.lang.Object getSource() {
                r0 = this;
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
    public static class Text extends org.simpleframework.xml.stream.EventToken {
        private final defpackage.InterfaceC1816 text;

        public Text(defpackage.InterfaceC1068 r1) {
                r0 = this;
                r0.<init>()
                r1.m2028()
                return
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public java.lang.Object getSource() {
                r0 = this;
                r0 = 0
                return r0
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public java.lang.String getValue() {
                r0 = this;
                r0 = 0
                throw r0
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
                r0 = this;
                r0 = 1
                return r0
        }
    }

    public StreamReader(defpackage.InterfaceC1076 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private org.simpleframework.xml.stream.StreamReader.Entry attribute(defpackage.InterfaceC2114 r1) {
            r0 = this;
            org.simpleframework.xml.stream.StreamReader$Entry r0 = new org.simpleframework.xml.stream.StreamReader$Entry
            r0.<init>(r1)
            return r0
    }

    private org.simpleframework.xml.stream.StreamReader.Start build(org.simpleframework.xml.stream.StreamReader.Start r4) {
            r3 = this;
            java.util.Iterator r0 = r4.getAttributes()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            r2 = 0
            if (r1 != 0) goto L1f
            org.simpleframework.xml.stream.StreamReader$Entry r1 = r3.attribute(r2)
            boolean r2 = r1.isReserved()
            if (r2 != 0) goto L4
            r4.add(r1)
            goto L4
        L1f:
            defpackage.C2264.m3679()
            return r2
        L23:
            return r4
    }

    private org.simpleframework.xml.stream.StreamReader.End end() {
            r1 = this;
            org.simpleframework.xml.stream.StreamReader$End r1 = new org.simpleframework.xml.stream.StreamReader$End
            r0 = 0
            r1.<init>(r0)
            return r1
    }

    private org.simpleframework.xml.stream.EventNode read() {
            r0 = this;
            r0 = 0
            throw r0
    }

    private org.simpleframework.xml.stream.StreamReader.Start start(defpackage.InterfaceC1068 r2) {
            r1 = this;
            org.simpleframework.xml.stream.StreamReader$Start r0 = new org.simpleframework.xml.stream.StreamReader$Start
            r0.<init>(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L10
            org.simpleframework.xml.stream.StreamReader$Start r1 = r1.build(r0)
            return r1
        L10:
            return r0
    }

    private org.simpleframework.xml.stream.StreamReader.Text text(defpackage.InterfaceC1068 r1) {
            r0 = this;
            org.simpleframework.xml.stream.StreamReader$Text r0 = new org.simpleframework.xml.stream.StreamReader$Text
            r0.<init>(r1)
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public org.simpleframework.xml.stream.EventNode next() {
            r2 = this;
            org.simpleframework.xml.stream.EventNode r0 = r2.peek
            if (r0 != 0) goto L9
            org.simpleframework.xml.stream.EventNode r2 = r2.read()
            return r2
        L9:
            r1 = 0
            r2.peek = r1
            return r0
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public org.simpleframework.xml.stream.EventNode peek() {
            r1 = this;
            org.simpleframework.xml.stream.EventNode r0 = r1.peek
            if (r0 != 0) goto La
            org.simpleframework.xml.stream.EventNode r0 = r1.next()
            r1.peek = r0
        La:
            return r0
    }
}
