package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JSONPath {
    static final com.alibaba.fastjson2.JSONReader.Context PARSE_CONTEXT = null;
    static final com.alibaba.fastjson2.JSONPath PREVIOUS = null;
    static final com.alibaba.fastjson2.JSONPath ROOT = null;
    final java.lang.String path;
    public final boolean previous;
    com.alibaba.fastjson2.JSONReader.Context readerContext;
    final boolean root;
    final java.util.List<com.alibaba.fastjson2.JSONPathSegment> segments;
    com.alibaba.fastjson2.JSONWriter.Context writerContext;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Context {
        final com.alibaba.fastjson2.JSONPathSegment current;
        boolean eval;
        final com.alibaba.fastjson2.JSONPathSegment next;
        final com.alibaba.fastjson2.JSONPath.Context parent;
        final com.alibaba.fastjson2.JSONPath path;
        final long readerFeatures;
        java.lang.Object root;
        java.lang.Object value;

        public Context(com.alibaba.fastjson2.JSONPath r1, com.alibaba.fastjson2.JSONPath.Context r2, com.alibaba.fastjson2.JSONPathSegment r3, com.alibaba.fastjson2.JSONPathSegment r4, long r5) {
                r0 = this;
                r0.<init>()
                r0.path = r1
                r0.current = r3
                r0.next = r4
                r0.parent = r2
                r0.readerFeatures = r5
                return
        }
    }

    static {
            com.alibaba.fastjson2.JSONPath r0 = new com.alibaba.fastjson2.JSONPath
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "$"
            r3 = 1
            r4 = 0
            r0.<init>(r2, r1, r3, r4)
            com.alibaba.fastjson2.JSONPath.ROOT = r0
            com.alibaba.fastjson2.JSONPath r0 = new com.alibaba.fastjson2.JSONPath
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "#-1"
            r0.<init>(r2, r1, r4, r3)
            com.alibaba.fastjson2.JSONPath.PREVIOUS = r0
            com.alibaba.fastjson2.JSONReader$Context r0 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONPath.PARSE_CONTEXT = r0
            return
    }

    public JSONPath(java.lang.String r1, java.util.List<com.alibaba.fastjson2.JSONPathSegment> r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.path = r1
            r0.segments = r2
            r0.root = r3
            r0.previous = r4
            return
    }

    public static com.alibaba.fastjson2.JSONPath of(java.lang.String r1) {
            java.lang.String r0 = "#-1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            com.alibaba.fastjson2.JSONPath r1 = com.alibaba.fastjson2.JSONPath.PREVIOUS
            return r1
        Lb:
            com.alibaba.fastjson2.JSONPathParser r0 = new com.alibaba.fastjson2.JSONPathParser
            r0.<init>(r1)
            com.alibaba.fastjson2.JSONPath r1 = r0.parse()
            return r1
    }

    public java.lang.Object eval(java.lang.Object r12) {
            r11 = this;
            boolean r0 = r11.root
            if (r0 == 0) goto L5
            goto Ld
        L5:
            java.util.List<com.alibaba.fastjson2.JSONPathSegment> r0 = r11.segments
            int r0 = r0.size()
            if (r0 != 0) goto Le
        Ld:
            return r12
        Le:
            r1 = 0
            r2 = 0
            r5 = r1
        L11:
            if (r2 >= r0) goto L3d
            java.util.List<com.alibaba.fastjson2.JSONPathSegment> r3 = r11.segments
            java.lang.Object r3 = r3.get(r2)
            r6 = r3
            com.alibaba.fastjson2.JSONPathSegment r6 = (com.alibaba.fastjson2.JSONPathSegment) r6
            int r10 = r2 + 1
            if (r10 >= r0) goto L2a
            java.util.List<com.alibaba.fastjson2.JSONPathSegment> r3 = r11.segments
            java.lang.Object r3 = r3.get(r10)
            com.alibaba.fastjson2.JSONPathSegment r3 = (com.alibaba.fastjson2.JSONPathSegment) r3
            r7 = r3
            goto L2b
        L2a:
            r7 = r1
        L2b:
            com.alibaba.fastjson2.JSONPath$Context r3 = new com.alibaba.fastjson2.JSONPath$Context
            r8 = 0
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            if (r2 != 0) goto L37
            r3.root = r12
        L37:
            r6.eval(r3)
            r5 = r3
            r2 = r10
            goto L11
        L3d:
            java.lang.Object r12 = r5.value
            return r12
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }
}
