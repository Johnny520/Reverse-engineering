package com.alibaba.fastjson2.function.impl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class StringToAny implements java.util.function.Function {
    final java.lang.Object defaultValue;
    final java.lang.Class targetClass;

    public StringToAny(java.lang.Class r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.targetClass = r1
            r0.defaultValue = r2
            return
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object r4) {
            r3 = this;
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L102
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L102
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L16
            goto L102
        L16:
            java.lang.Class r0 = r3.targetClass
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 == r1) goto Lf9
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r0 != r1) goto L22
            goto Lf9
        L22:
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 == r1) goto Lf0
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r0 != r1) goto L2c
            goto Lf0
        L2c:
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 == r1) goto Le7
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 != r1) goto L36
            goto Le7
        L36:
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 == r1) goto Lc5
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r0 != r1) goto L40
            goto Lc5
        L40:
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 == r1) goto Lbc
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto L4a
            goto Lbc
        L4a:
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 == r1) goto Lb3
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto L53
            goto Lb3
        L53:
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 == r1) goto La9
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            if (r0 != r1) goto L5c
            goto La9
        L5c:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 == r1) goto L9e
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r0 != r1) goto L65
            goto L9e
        L65:
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r0 != r1) goto L6f
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r4)
            return r0
        L6f:
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            if (r0 != r1) goto L79
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r4)
            return r0
        L79:
            java.lang.Class<java.util.Collections> r1 = java.util.Collections.class
            if (r0 == r1) goto L85
            java.lang.Class<java.util.List> r1 = java.util.List.class
            if (r0 == r1) goto L85
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r1 = com.alibaba.fastjson2.JSONArray.class
            if (r0 != r1) goto L93
        L85:
            java.lang.String r0 = "[]"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L93
            com.alibaba.fastjson2.JSONArray r4 = new com.alibaba.fastjson2.JSONArray
            r4.<init>()
            return r4
        L93:
            java.lang.Class r0 = r3.targetClass
            java.lang.String r1 = ", value : "
            java.lang.String r2 = "can not convert to "
            ah.a.m(r2, r0, r1, r4)
            r4 = 0
            return r4
        L9e:
            java.lang.String r0 = "true"
            boolean r4 = r0.equals(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        La9:
            r0 = 0
            char r4 = r4.charAt(r0)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            return r4
        Lb3:
            double r0 = java.lang.Double.parseDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
        Lbc:
            float r4 = java.lang.Float.parseFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            return r4
        Lc5:
            boolean r0 = com.alibaba.fastjson2.util.IOUtils.isNumber(r4)
            if (r0 != 0) goto Lde
            int r0 = r4.length()
            r1 = 19
            if (r0 != r1) goto Lde
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r0 = com.alibaba.fastjson2.util.DateUtils.parseMillis(r4, r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        Lde:
            long r0 = java.lang.Long.parseLong(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        Le7:
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        Lf0:
            short r4 = java.lang.Short.parseShort(r4)
            java.lang.Short r4 = java.lang.Short.valueOf(r4)
            return r4
        Lf9:
            byte r4 = java.lang.Byte.parseByte(r4)
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            return r4
        L102:
            java.lang.Object r4 = r3.defaultValue
            return r4
    }
}
