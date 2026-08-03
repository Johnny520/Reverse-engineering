package com.alibaba.fastjson2.function.impl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ToAny implements java.util.function.Function {
    private java.lang.Object defaultValue;
    private final java.lang.Class targetClass;

    public ToAny(java.lang.Class r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ToAny(java.lang.Class r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.targetClass = r1
            r0.defaultValue = r2
            return
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object r6) {
            r5 = this;
            if (r6 != 0) goto L5
            java.lang.Object r6 = r5.defaultValue
            return r6
        L5:
            java.lang.Class r0 = r5.targetClass
            boolean r0 = r0.isInstance(r6)
            if (r0 == 0) goto Le
            return r6
        Le:
            java.lang.Class r0 = r5.targetClass
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L19
            java.lang.String r6 = r6.toString()
            return r6
        L19:
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r0 != r1) goto L7f
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L2f
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L2c
            java.math.BigDecimal r6 = java.math.BigDecimal.ONE
            return r6
        L2c:
            java.math.BigDecimal r6 = java.math.BigDecimal.ZERO
            return r6
        L2f:
            boolean r0 = r6 instanceof java.lang.Byte
            if (r0 != 0) goto L74
            boolean r0 = r6 instanceof java.lang.Short
            if (r0 != 0) goto L74
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L74
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 != 0) goto L74
            boolean r0 = r6 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r0 != 0) goto L74
            boolean r0 = r6 instanceof java.util.concurrent.atomic.AtomicLong
            if (r0 == 0) goto L48
            goto L74
        L48:
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 != 0) goto L69
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L51
            goto L69
        L51:
            boolean r0 = r6 instanceof java.math.BigInteger
            if (r0 == 0) goto L5d
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            r0.<init>(r6)
            return r0
        L5d:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L30b
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r6 = (java.lang.String) r6
            r0.<init>(r6)
            return r0
        L69:
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            return r6
        L74:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L7f:
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            if (r0 != r1) goto Lcc
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L95
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L92
            java.math.BigInteger r6 = java.math.BigInteger.ONE
            return r6
        L92:
            java.math.BigInteger r6 = java.math.BigInteger.ZERO
            return r6
        L95:
            boolean r0 = r6 instanceof java.lang.Byte
            if (r0 != 0) goto Lc1
            boolean r0 = r6 instanceof java.lang.Short
            if (r0 != 0) goto Lc1
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto Lc1
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 != 0) goto Lc1
            boolean r0 = r6 instanceof java.util.concurrent.atomic.AtomicInteger
            if (r0 != 0) goto Lc1
            boolean r0 = r6 instanceof java.util.concurrent.atomic.AtomicLong
            if (r0 != 0) goto Lc1
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 != 0) goto Lc1
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto Lb6
            goto Lc1
        Lb6:
            boolean r0 = r6 instanceof java.math.BigDecimal
            if (r0 == 0) goto L30b
            java.math.BigDecimal r6 = (java.math.BigDecimal) r6
            java.math.BigInteger r6 = r6.toBigInteger()
            return r6
        Lc1:
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r0)
            return r6
        Lcc:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            r2 = 0
            if (r0 != r1) goto L1d7
            boolean r0 = r6 instanceof java.lang.Number
            r1 = 1
            if (r0 == 0) goto Le4
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r1) goto Ldf
            r2 = r1
        Ldf:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        Le4:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L30b
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            int r3 = r0.hashCode()
            r4 = -1
            switch(r3) {
                case 70: goto L1bf;
                case 78: goto L1b3;
                case 84: goto L1a7;
                case 89: goto L19b;
                case 2497: goto L18f;
                case 2529: goto L183;
                case 3521: goto L177;
                case 87751: goto L16b;
                case 88775: goto L15e;
                case 119527: goto L151;
                case 2583950: goto L144;
                case 2615726: goto L137;
                case 3392903: goto L12a;
                case 3569038: goto L11d;
                case 66658563: goto L110;
                case 67643651: goto L103;
                case 97196323: goto Lf6;
                default: goto Lf3;
            }
        Lf3:
            r2 = r4
            goto L1c9
        Lf6:
            java.lang.String r1 = "false"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lff
            goto Lf3
        Lff:
            r2 = 16
            goto L1c9
        L103:
            java.lang.String r1 = "False"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10c
            goto Lf3
        L10c:
            r2 = 15
            goto L1c9
        L110:
            java.lang.String r1 = "FALSE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L119
            goto Lf3
        L119:
            r2 = 14
            goto L1c9
        L11d:
            java.lang.String r1 = "true"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L126
            goto Lf3
        L126:
            r2 = 13
            goto L1c9
        L12a:
            java.lang.String r1 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L133
            goto Lf3
        L133:
            r2 = 12
            goto L1c9
        L137:
            java.lang.String r1 = "True"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L140
            goto Lf3
        L140:
            r2 = 11
            goto L1c9
        L144:
            java.lang.String r1 = "TRUE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14d
            goto Lf3
        L14d:
            r2 = 10
            goto L1c9
        L151:
            java.lang.String r1 = "yes"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15a
            goto Lf3
        L15a:
            r2 = 9
            goto L1c9
        L15e:
            java.lang.String r1 = "Yes"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L167
            goto Lf3
        L167:
            r2 = 8
            goto L1c9
        L16b:
            java.lang.String r1 = "YES"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L175
            goto Lf3
        L175:
            r2 = 7
            goto L1c9
        L177:
            java.lang.String r1 = "no"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L181
            goto Lf3
        L181:
            r2 = 6
            goto L1c9
        L183:
            java.lang.String r1 = "No"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18d
            goto Lf3
        L18d:
            r2 = 5
            goto L1c9
        L18f:
            java.lang.String r1 = "NO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L199
            goto Lf3
        L199:
            r2 = 4
            goto L1c9
        L19b:
            java.lang.String r1 = "Y"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a5
            goto Lf3
        L1a5:
            r2 = 3
            goto L1c9
        L1a7:
            java.lang.String r1 = "T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b1
            goto Lf3
        L1b1:
            r2 = 2
            goto L1c9
        L1b3:
            java.lang.String r2 = "N"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1bd
            goto Lf3
        L1bd:
            r2 = r1
            goto L1c9
        L1bf:
            java.lang.String r1 = "F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c9
            goto Lf3
        L1c9:
            switch(r2) {
                case 0: goto L1d4;
                case 1: goto L1d4;
                case 2: goto L1d1;
                case 3: goto L1d1;
                case 4: goto L1d4;
                case 5: goto L1d4;
                case 6: goto L1d4;
                case 7: goto L1d1;
                case 8: goto L1d1;
                case 9: goto L1d1;
                case 10: goto L1d1;
                case 11: goto L1d1;
                case 12: goto L1ce;
                case 13: goto L1d1;
                case 14: goto L1d4;
                case 15: goto L1d4;
                case 16: goto L1d4;
                default: goto L1cc;
            }
        L1cc:
            goto L30b
        L1ce:
            java.lang.Object r6 = r5.defaultValue
            return r6
        L1d1:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L1d4:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L1d7:
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r0 != r1) goto L1f9
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L1ea
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            return r6
        L1ea:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L30b
            java.lang.Number r6 = (java.lang.Number) r6
            byte r6 = r6.byteValue()
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            return r6
        L1f9:
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto L25e
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L20c
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            return r6
        L20c:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L224
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L21b
            java.lang.Object r6 = r5.defaultValue
            return r6
        L21b:
            double r0 = java.lang.Double.parseDouble(r6)
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            return r6
        L224:
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L248
            java.util.List r6 = (java.util.List) r6
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            int r1 = r6.size()
            r0.<init>(r1)
        L233:
            int r1 = r6.size()
            if (r2 >= r1) goto L247
            java.lang.Object r1 = r6.get(r2)
            java.lang.Object r1 = r5.apply(r1)
            r0.add(r1)
            int r2 = r2 + 1
            goto L233
        L247:
            return r0
        L248:
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L30b
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L257
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L259
        L257:
            r0 = 0
        L259:
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
            return r6
        L25e:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto L286
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L277
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L271
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L272
        L271:
            r6 = 0
        L272:
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            return r6
        L277:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L30b
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            return r6
        L286:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r0 != r1) goto L2a8
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L299
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L299:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L30b
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L2a8:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r0 != r1) goto L2d1
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L2c2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L2bb
            r0 = 1
            goto L2bd
        L2bb:
            r0 = 0
        L2bd:
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            return r6
        L2c2:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L30b
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            return r6
        L2d1:
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r0 != r1) goto L2f3
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L2e4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            return r6
        L2e4:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L30b
            java.lang.Number r6 = (java.lang.Number) r6
            short r6 = r6.shortValue()
            java.lang.Short r6 = java.lang.Short.valueOf(r6)
            return r6
        L2f3:
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            if (r0 != r1) goto L30b
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L306
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            return r6
        L306:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L30b
            return r6
        L30b:
            java.lang.Class r0 = r5.targetClass
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " "
            java.lang.Class r6 = r6.getClass()
            java.lang.String r2 = "can not cast to "
            ah.a.m(r2, r0, r1, r6)
            r6 = 0
            return r6
    }
}
