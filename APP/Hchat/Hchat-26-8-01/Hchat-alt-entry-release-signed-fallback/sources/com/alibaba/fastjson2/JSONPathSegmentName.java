package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSegmentName extends com.alibaba.fastjson2.JSONPathSegment {
    final java.lang.String name;
    final long nameHashCode;

    public JSONPathSegmentName(java.lang.String r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.nameHashCode = r2
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L2d
            java.lang.Class<com.alibaba.fastjson2.JSONPathSegmentName> r2 = com.alibaba.fastjson2.JSONPathSegmentName.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L2d
        L10:
            com.alibaba.fastjson2.JSONPathSegmentName r7 = (com.alibaba.fastjson2.JSONPathSegmentName) r7
            long r2 = r6.nameHashCode
            long r4 = r7.nameHashCode
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L20
            java.lang.String r2 = r6.name
            java.lang.String r3 = r7.name
            if (r2 == r3) goto L2c
        L20:
            java.lang.String r2 = r6.name
            if (r2 == 0) goto L2d
            java.lang.String r7 = r7.name
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L2d
        L2c:
            return r0
        L2d:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void eval(com.alibaba.fastjson2.JSONPath.Context r9) {
            r8 = this;
            com.alibaba.fastjson2.JSONPath$Context r0 = r9.parent
            if (r0 != 0) goto L7
            java.lang.Object r0 = r9.root
            goto L9
        L7:
            java.lang.Object r0 = r0.value
        L9:
            if (r0 != 0) goto Ld
            goto Le5
        Ld:
            boolean r1 = r0 instanceof java.util.Map
            r2 = 0
            if (r1 == 0) goto L71
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r8.name
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L6e
            java.lang.String r3 = r8.name
            boolean r3 = com.alibaba.fastjson2.util.IOUtils.isNumber(r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            boolean r6 = r5 instanceof java.lang.Enum
            if (r6 == 0) goto L52
            r6 = r5
            java.lang.Enum r6 = (java.lang.Enum) r6
            java.lang.String r6 = r6.name()
            java.lang.String r7 = r8.name
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L52
            java.lang.Object r1 = r4.getValue()
            goto L6e
        L52:
            boolean r6 = r5 instanceof java.lang.Long
            if (r6 == 0) goto L2a
            if (r2 != 0) goto L64
            if (r3 == 0) goto L64
            java.lang.String r2 = r8.name
            long r6 = java.lang.Long.parseLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
        L64:
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L2a
            java.lang.Object r1 = r4.getValue()
        L6e:
            r9.value = r1
            return
        L71:
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto Lbe
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbb
            java.lang.Object r3 = r0.next()
            boolean r4 = r3 instanceof java.util.Map
            if (r4 == 0) goto L7f
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r4 = r8.name
            java.lang.Object r3 = r3.get(r4)
            if (r3 != 0) goto L98
            goto L7f
        L98:
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto Lb0
            r4 = 1
            if (r1 != r4) goto La3
            java.util.Collection r3 = (java.util.Collection) r3
            r2 = r3
            goto L7f
        La3:
            if (r2 != 0) goto Laa
            com.alibaba.fastjson2.JSONArray r2 = new com.alibaba.fastjson2.JSONArray
            r2.<init>(r1)
        Laa:
            java.util.Collection r3 = (java.util.Collection) r3
            r2.addAll(r3)
            goto L7f
        Lb0:
            if (r2 != 0) goto Lb7
            com.alibaba.fastjson2.JSONArray r2 = new com.alibaba.fastjson2.JSONArray
            r2.<init>(r1)
        Lb7:
            r2.add(r3)
            goto L7f
        Lbb:
            r9.value = r2
            return
        Lbe:
            java.lang.Class r1 = r0.getClass()
            com.alibaba.fastjson2.JSONPath r3 = r9.path
            com.alibaba.fastjson2.JSONWriter$Context r3 = r3.writerContext
            if (r3 == 0) goto Lcd
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r3.getObjectWriter(r1)
            goto Ld3
        Lcd:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r3 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r3.getObjectWriter(r1)
        Ld3:
            boolean r4 = r3 instanceof com.alibaba.fastjson2.writer.ObjectWriterAdapter
            if (r4 == 0) goto Le6
            long r1 = r8.nameHashCode
            com.alibaba.fastjson2.writer.FieldWriter r1 = r3.getFieldWriter(r1)
            if (r1 == 0) goto Le5
            java.lang.Object r0 = r1.getFieldValue(r0)
            r9.value = r0
        Le5:
            return
        Le6:
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 != 0) goto Lf9
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto Lef
            goto Lf9
        Lef:
            java.lang.String r9 = "not support : "
            java.lang.String r9 = p.a.k(r1, r9)
            ah.a.w(r9)
            return
        Lf9:
            r9.value = r2
            return
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.name
            long r1 = r3.nameHashCode
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }
}
