package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
class Indenter {
    private org.simpleframework.xml.stream.Indenter.Cache cache;
    private int count;
    private int indent;
    private int index;

    public static class Cache {
        private int count;
        private java.lang.String[] list;

        public Cache(int r1) {
                r0 = this;
                r0.<init>()
                java.lang.String[] r1 = new java.lang.String[r1]
                r0.list = r1
                return
        }

        private void resize(int r4) {
                r3 = this;
                java.lang.String[] r4 = new java.lang.String[r4]
                r0 = 0
            L3:
                java.lang.String[] r1 = r3.list
                int r2 = r1.length
                if (r0 >= r2) goto Lf
                r1 = r1[r0]
                r4[r0] = r1
                int r0 = r0 + 1
                goto L3
            Lf:
                r3.list = r4
                return
        }

        public java.lang.String get(int r3) {
                r2 = this;
                java.lang.String[] r0 = r2.list
                int r1 = r0.length
                if (r3 >= r1) goto L8
                r3 = r0[r3]
                return r3
            L8:
                r3 = 0
                return r3
        }

        public void set(int r2, java.lang.String r3) {
                r1 = this;
                java.lang.String[] r0 = r1.list
                int r0 = r0.length
                if (r2 < r0) goto La
                int r0 = r2 * 2
                r1.resize(r0)
            La:
                int r0 = r1.count
                if (r2 <= r0) goto L10
                r1.count = r2
            L10:
                java.lang.String[] r0 = r1.list
                r0[r2] = r3
                return
        }

        public int size() {
                r1 = this;
                int r0 = r1.count
                return r0
        }
    }

    public Indenter() {
            r1 = this;
            org.simpleframework.xml.stream.Format r0 = new org.simpleframework.xml.stream.Format
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public Indenter(org.simpleframework.xml.stream.Format r2) {
            r1 = this;
            r0 = 16
            r1.<init>(r2, r0)
            return
    }

    private Indenter(org.simpleframework.xml.stream.Format r1, int r2) {
            r0 = this;
            r0.<init>()
            int r1 = r1.getIndent()
            r0.indent = r1
            org.simpleframework.xml.stream.Indenter$Cache r1 = new org.simpleframework.xml.stream.Indenter$Cache
            r1.<init>(r2)
            r0.cache = r1
            return
    }

    private java.lang.String create() {
            r3 = this;
            int r0 = r3.count
            int r1 = r0 + 1
            char[] r1 = new char[r1]
            if (r0 <= 0) goto L1f
            r0 = 0
            r2 = 10
            r1[r0] = r2
            r0 = 1
        Le:
            int r2 = r3.count
            if (r0 > r2) goto L19
            r2 = 32
            r1[r0] = r2
            int r0 = r0 + 1
            goto Le
        L19:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
        L1f:
            java.lang.String r0 = "\n"
            return r0
    }

    private java.lang.String indent(int r3) {
            r2 = this;
            int r0 = r2.indent
            if (r0 <= 0) goto L1e
            org.simpleframework.xml.stream.Indenter$Cache r0 = r2.cache
            java.lang.String r0 = r0.get(r3)
            if (r0 != 0) goto L15
            java.lang.String r0 = r2.create()
            org.simpleframework.xml.stream.Indenter$Cache r1 = r2.cache
            r1.set(r3, r0)
        L15:
            org.simpleframework.xml.stream.Indenter$Cache r3 = r2.cache
            int r3 = r3.size()
            if (r3 <= 0) goto L1e
            return r0
        L1e:
            java.lang.String r3 = ""
            return r3
    }

    public java.lang.String pop() {
            r3 = this;
            int r0 = r3.index
            int r0 = r0 + (-1)
            r3.index = r0
            java.lang.String r0 = r3.indent(r0)
            int r1 = r3.indent
            if (r1 <= 0) goto L13
            int r2 = r3.count
            int r2 = r2 - r1
            r3.count = r2
        L13:
            return r0
    }

    public java.lang.String push() {
            r3 = this;
            int r0 = r3.index
            int r1 = r0 + 1
            r3.index = r1
            java.lang.String r0 = r3.indent(r0)
            int r1 = r3.indent
            if (r1 <= 0) goto L13
            int r2 = r3.count
            int r2 = r2 + r1
            r3.count = r2
        L13:
            return r0
    }

    public java.lang.String top() {
            r1 = this;
            int r0 = r1.index
            java.lang.String r0 = r1.indent(r0)
            return r0
    }
}
