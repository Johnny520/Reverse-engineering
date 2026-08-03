package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSegmentIndex extends com.alibaba.fastjson2.JSONPathSegment {
    static final com.alibaba.fastjson2.JSONPathSegmentIndex ONE = null;
    static final com.alibaba.fastjson2.JSONPathSegmentIndex TWO = null;
    static final com.alibaba.fastjson2.JSONPathSegmentIndex ZERO = null;
    final int index;

    static {
            com.alibaba.fastjson2.JSONPathSegmentIndex r0 = new com.alibaba.fastjson2.JSONPathSegmentIndex
            r1 = 0
            r0.<init>(r1)
            com.alibaba.fastjson2.JSONPathSegmentIndex.ZERO = r0
            com.alibaba.fastjson2.JSONPathSegmentIndex r0 = new com.alibaba.fastjson2.JSONPathSegmentIndex
            r1 = 1
            r0.<init>(r1)
            com.alibaba.fastjson2.JSONPathSegmentIndex.ONE = r0
            com.alibaba.fastjson2.JSONPathSegmentIndex r0 = new com.alibaba.fastjson2.JSONPathSegmentIndex
            r1 = 2
            r0.<init>(r1)
            com.alibaba.fastjson2.JSONPathSegmentIndex.TWO = r0
            return
    }

    public JSONPathSegmentIndex(int r1) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto L8
            r0.index = r1
            return
        L8:
            java.lang.String r1 = "not support negative index"
            ah.a.w(r1)
            r1 = 0
            throw r1
    }

    private java.lang.Object eval(java.util.Map r8) {
            r7 = this;
            int r0 = r7.index
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r8.get(r0)
            if (r0 != 0) goto L16
            int r0 = r7.index
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.Object r0 = r8.get(r0)
        L16:
            if (r0 != 0) goto L96
            int r1 = r8.size()
            java.util.Set r2 = r8.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = 1
            if (r1 == r4) goto L64
            boolean r4 = r8 instanceof java.util.LinkedHashMap
            if (r4 != 0) goto L64
            boolean r4 = r8 instanceof java.util.SortedMap
            if (r4 == 0) goto L31
            goto L64
        L31:
            int r1 = r7.index
            if (r3 > r1) goto L96
            int r1 = r8.size()
            if (r3 >= r1) goto L96
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            boolean r5 = r4 instanceof java.lang.Long
            if (r5 == 0) goto L61
            int r5 = r7.index
            long r5 = (long) r5
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L61
            return r1
        L61:
            int r3 = r3 + 1
            goto L31
        L64:
            int r8 = r7.index
            if (r3 > r8) goto L96
            if (r3 >= r1) goto L96
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L96
            java.lang.Object r8 = r2.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r4 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            boolean r5 = r4 instanceof java.lang.Long
            int r6 = r7.index
            if (r5 == 0) goto L90
            long r5 = (long) r6
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L93
            return r8
        L90:
            if (r3 != r6) goto L93
            r0 = r8
        L93:
            int r3 = r3 + 1
            goto L64
        L96:
            return r0
    }

    public static com.alibaba.fastjson2.JSONPathSegmentIndex of(int r1) {
            if (r1 != 0) goto L5
            com.alibaba.fastjson2.JSONPathSegmentIndex r1 = com.alibaba.fastjson2.JSONPathSegmentIndex.ZERO
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            com.alibaba.fastjson2.JSONPathSegmentIndex r1 = com.alibaba.fastjson2.JSONPathSegmentIndex.ONE
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            com.alibaba.fastjson2.JSONPathSegmentIndex r1 = com.alibaba.fastjson2.JSONPathSegmentIndex.TWO
            return r1
        L11:
            com.alibaba.fastjson2.JSONPathSegmentIndex r0 = new com.alibaba.fastjson2.JSONPathSegmentIndex
            r0.<init>(r1)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void eval(com.alibaba.fastjson2.JSONPath.Context r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONPath$Context r0 = r6.parent
            if (r0 != 0) goto L7
            java.lang.Object r0 = r6.root
            goto L9
        L7:
            java.lang.Object r0 = r0.value
        L9:
            r1 = 1
            if (r0 != 0) goto Lf
            r6.eval = r1
            return
        Lf:
            boolean r2 = r0 instanceof java.util.List
            if (r2 == 0) goto L28
            java.util.List r0 = (java.util.List) r0
            int r2 = r5.index
            int r3 = r0.size()
            if (r2 >= r3) goto L25
            int r2 = r5.index
            java.lang.Object r0 = r0.get(r2)
            r6.value = r0
        L25:
            r6.eval = r1
            return
        L28:
            boolean r2 = r0 instanceof java.util.SortedSet
            if (r2 != 0) goto La1
            boolean r2 = r0 instanceof java.util.LinkedHashSet
            if (r2 != 0) goto La1
            int r2 = r5.index
            if (r2 != 0) goto L42
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L42
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            if (r2 != r1) goto L42
            goto La1
        L42:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L54
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r2 = r5.index
            int r3 = r0.length
            if (r2 >= r3) goto L51
            r0 = r0[r2]
            r6.value = r0
        L51:
            r6.eval = r1
            return
        L54:
            java.lang.Class r2 = r0.getClass()
            boolean r3 = r2.isArray()
            if (r3 == 0) goto L6f
            int r2 = java.lang.reflect.Array.getLength(r0)
            int r3 = r5.index
            if (r3 >= r2) goto L6c
            java.lang.Object r0 = java.lang.reflect.Array.get(r0, r3)
            r6.value = r0
        L6c:
            r6.eval = r1
            return
        L6f:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L82
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r5.eval(r0)
            r6.value = r0
            r6.eval = r1
            return
        L82:
            int r3 = r5.index
            if (r3 != 0) goto L8b
            r6.value = r0
            r6.eval = r1
            return
        L8b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "jsonpath not support operate : "
            r0.<init>(r1)
            com.alibaba.fastjson2.JSONPath r6 = r6.path
            r0.append(r6)
            java.lang.String r6 = ", objectClass"
            java.lang.String r1 = r2.getName()
            ah.a.s(r0, r6, r1)
            return
        La1:
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        La8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbc
            java.lang.Object r3 = r0.next()
            int r4 = r5.index
            if (r2 != r4) goto Lb9
            r6.value = r3
            goto Lbc
        Lb9:
            int r2 = r2 + 1
            goto La8
        Lbc:
            r6.eval = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.index
            int r0 = com.alibaba.fastjson2.util.IOUtils.stringSize(r0)
            int r1 = r0 + 2
            char[] r1 = new char[r1]
            r2 = 0
            r3 = 91
            r1[r2] = r3
            int r2 = r4.index
            r3 = 1
            com.alibaba.fastjson2.util.IOUtils.writeInt32(r1, r3, r2)
            int r0 = r0 + r3
            r2 = 93
            r1[r0] = r2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }
}
