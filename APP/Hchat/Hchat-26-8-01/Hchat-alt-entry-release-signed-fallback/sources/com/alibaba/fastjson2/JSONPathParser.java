package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class JSONPathParser {
    final boolean dollar;
    final com.alibaba.fastjson2.JSONReader jsonReader;
    final java.lang.String path;

    public JSONPathParser(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r2.path = r3
            com.alibaba.fastjson2.JSONReader$Context r0 = com.alibaba.fastjson2.JSONPath.PARSE_CONTEXT
            com.alibaba.fastjson2.JSONReader r3 = com.alibaba.fastjson2.JSONReader.of(r3, r0)
            r2.jsonReader = r3
            char r0 = r3.f1814ch
            r1 = 45
            if (r0 == r1) goto L22
            r1 = 36
            if (r0 != r1) goto L1e
            r3.next()
            r3 = 1
            r2.dollar = r3
            return
        L1e:
            r3 = 0
            r2.dollar = r3
            return
        L22:
            java.lang.String r3 = "not support '-'"
            ah.a.w(r3)
            r3 = 0
            throw r3
    }

    private com.alibaba.fastjson2.JSONPathSegment parseArrayAccess() {
            r5 = this;
            com.alibaba.fastjson2.JSONReader r0 = r5.jsonReader
            r0.next()
            com.alibaba.fastjson2.JSONReader r0 = r5.jsonReader
            char r1 = r0.f1814ch
            r2 = 34
            java.lang.String r3 = "TODO : "
            if (r1 == r2) goto L52
            r2 = 39
            if (r1 == r2) goto L52
            r2 = 42
            if (r1 == r2) goto L4c
            java.lang.String r2 = "not support range index ':'"
            switch(r1) {
                case 48: goto L2b;
                case 49: goto L2b;
                case 50: goto L2b;
                case 51: goto L2b;
                case 52: goto L2b;
                case 53: goto L2b;
                case 54: goto L2b;
                case 55: goto L2b;
                case 56: goto L2b;
                case 57: goto L2b;
                case 58: goto L27;
                default: goto L1c;
            }
        L1c:
            com.alibaba.fastjson2.JSONReader r0 = r5.jsonReader
            char r0 = r0.current()
            ah.a.t(r0, r3)
        L25:
            r0 = 0
            return r0
        L27:
            ah.a.w(r2)
            goto L25
        L2b:
            int r0 = r0.readInt32Value()
            com.alibaba.fastjson2.JSONReader r1 = r5.jsonReader
            char r3 = r1.f1814ch
            r4 = 58
            if (r3 == r4) goto L48
            boolean r1 = r1.isNumber()
            if (r1 != 0) goto L42
            com.alibaba.fastjson2.JSONPathSegmentIndex r0 = com.alibaba.fastjson2.JSONPathSegmentIndex.of(r0)
            goto L6a
        L42:
            java.lang.String r0 = "not support"
            ah.a.w(r0)
            goto L25
        L48:
            ah.a.w(r2)
            goto L25
        L4c:
            java.lang.String r0 = "not support *"
            ah.a.w(r0)
            goto L25
        L52:
            java.lang.String r0 = r0.readString()
            com.alibaba.fastjson2.JSONReader r1 = r5.jsonReader
            char r1 = r1.current()
            r2 = 93
            if (r1 != r2) goto L7f
            com.alibaba.fastjson2.JSONPathSegmentName r1 = new com.alibaba.fastjson2.JSONPathSegmentName
            long r2 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            r1.<init>(r0, r2)
            r0 = r1
        L6a:
            com.alibaba.fastjson2.JSONReader r1 = r5.jsonReader
            boolean r1 = r1.nextIfArrayEnd()
            if (r1 == 0) goto L73
            return r0
        L73:
            com.alibaba.fastjson2.JSONReader r0 = r5.jsonReader
            java.lang.String r1 = "jsonpath syntax error"
            java.lang.String r0 = r0.info(r1)
            ah.a.w(r0)
            goto L25
        L7f:
            com.alibaba.fastjson2.JSONReader r0 = r5.jsonReader
            boolean r0 = r0.isString()
            if (r0 == 0) goto L8d
            java.lang.String r0 = "not support multi name"
            ah.a.w(r0)
            goto L25
        L8d:
            com.alibaba.fastjson2.JSONReader r0 = r5.jsonReader
            char r0 = r0.current()
            ah.a.t(r0, r3)
            goto L25
    }

    private com.alibaba.fastjson2.JSONPathSegment parseProperty() {
            r5 = this;
            com.alibaba.fastjson2.JSONReader r0 = r5.jsonReader
            char r1 = r0.f1814ch
            r2 = 42
            if (r1 == r2) goto L31
            r2 = 46
            if (r1 == r2) goto L2b
            long r0 = r0.readFieldNameHashCodeUnquote()
            com.alibaba.fastjson2.JSONReader r2 = r5.jsonReader
            java.lang.String r2 = r2.getFieldName()
            com.alibaba.fastjson2.JSONReader r3 = r5.jsonReader
            char r3 = r3.f1814ch
            r4 = 40
            if (r3 == r4) goto L24
            com.alibaba.fastjson2.JSONPathSegmentName r3 = new com.alibaba.fastjson2.JSONPathSegmentName
            r3.<init>(r2, r0)
            return r3
        L24:
            java.lang.String r0 = "not support jsonpath function"
            ah.a.w(r0)
        L29:
            r0 = 0
            return r0
        L2b:
            java.lang.String r0 = "not support jsonpath .."
            ah.a.w(r0)
            goto L29
        L31:
            java.lang.String r0 = "not support *"
            ah.a.w(r0)
            goto L29
    }

    public com.alibaba.fastjson2.JSONPath parse() {
            r5 = this;
            boolean r0 = r5.dollar
            r1 = 26
            if (r0 == 0) goto Lf
            com.alibaba.fastjson2.JSONReader r0 = r5.jsonReader
            char r0 = r0.f1814ch
            if (r0 != r1) goto Lf
            com.alibaba.fastjson2.JSONPath r0 = com.alibaba.fastjson2.JSONPath.ROOT
            return r0
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L14:
            com.alibaba.fastjson2.JSONReader r2 = r5.jsonReader
            char r3 = r2.f1814ch
            if (r3 == r1) goto L5c
            r4 = 46
            if (r3 != r4) goto L26
            r2.next()
            com.alibaba.fastjson2.JSONPathSegment r2 = r5.parseProperty()
            goto L51
        L26:
            r4 = 91
            if (r3 != r4) goto L2f
            com.alibaba.fastjson2.JSONPathSegment r2 = r5.parseArrayAccess()
            goto L51
        L2f:
            r4 = 97
            if (r3 < r4) goto L37
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 <= r4) goto L43
        L37:
            r4 = 65
            if (r3 < r4) goto L3f
            r4 = 90
            if (r3 <= r4) goto L43
        L3f:
            r4 = 95
            if (r3 != r4) goto L48
        L43:
            com.alibaba.fastjson2.JSONPathSegment r2 = r5.parseProperty()
            goto L51
        L48:
            r4 = 64
            if (r3 != r4) goto L55
            r2.next()
            com.alibaba.fastjson2.JSONPathSegment$SelfSegment r2 = com.alibaba.fastjson2.JSONPathSegment.SelfSegment.INSTANCE
        L51:
            r0.add(r2)
            goto L14
        L55:
            java.lang.String r0 = "not support "
            ah.a.g(r3, r0)
            r0 = 0
            return r0
        L5c:
            com.alibaba.fastjson2.JSONPath r1 = new com.alibaba.fastjson2.JSONPath
            java.lang.String r2 = r5.path
            r3 = 0
            r1.<init>(r2, r0, r3, r3)
            return r1
    }
}
