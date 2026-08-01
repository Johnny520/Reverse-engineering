package com.alibaba.fastjson2;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2887 extends AbstractC2880 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9126;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object f9127;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2887(String str, long j, String[] strArr, long[] jArr, Object obj, int i) {
        super(str, j, strArr, jArr, null);
        this.f9126 = i;
        this.f9127 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo5957(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f9126
            java.lang.Object r12 = r12.f9127
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L23;
                default: goto L9;
            }
        L9:
            boolean r0 = r13 instanceof java.util.Collection
            if (r0 == 0) goto L21
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.String[] r12 = (java.lang.String[]) r12
            int r0 = r12.length
            r3 = r2
        L13:
            if (r3 >= r0) goto L22
            r4 = r12[r3]
            boolean r4 = r13.contains(r4)
            if (r4 != 0) goto L1e
            goto L21
        L1e:
            int r3 = r3 + 1
            goto L13
        L21:
            r1 = r2
        L22:
            return r1
        L23:
            boolean r0 = r13 instanceof java.util.Collection
            if (r0 == 0) goto Lb3
            java.util.Collection r13 = (java.util.Collection) r13
            long[] r12 = (long[]) r12
            int r0 = r12.length
            r3 = r2
        L2d:
            if (r3 >= r0) goto Lb4
            r4 = r12[r3]
            java.util.Iterator r6 = r13.iterator()
        L35:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb3
            java.lang.Object r7 = r6.next()
            boolean r8 = r7 instanceof java.lang.Byte
            if (r8 != 0) goto L4f
            boolean r8 = r7 instanceof java.lang.Short
            if (r8 != 0) goto L4f
            boolean r8 = r7 instanceof java.lang.Integer
            if (r8 != 0) goto L4f
            boolean r8 = r7 instanceof java.lang.Long
            if (r8 == 0) goto L5b
        L4f:
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L5b
            goto Laf
        L5b:
            boolean r8 = r7 instanceof java.lang.Float
            if (r8 == 0) goto L6c
            float r8 = (float) r4
            r9 = r7
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L6c
            goto Laf
        L6c:
            boolean r8 = r7 instanceof java.lang.Double
            if (r8 == 0) goto L7d
            double r8 = (double) r4
            r10 = r7
            java.lang.Double r10 = (java.lang.Double) r10
            double r10 = r10.doubleValue()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L7d
            goto Laf
        L7d:
            boolean r8 = r7 instanceof java.math.BigDecimal
            if (r8 == 0) goto L97
            r8 = r7
            java.math.BigDecimal r8 = (java.math.BigDecimal) r8
            long r9 = r8.longValue()
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 != 0) goto L97
            java.math.BigDecimal r9 = java.math.BigDecimal.valueOf(r4)
            int r8 = r8.compareTo(r9)
            if (r8 != 0) goto L97
            goto Laf
        L97:
            boolean r8 = r7 instanceof java.math.BigInteger
            if (r8 == 0) goto L35
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            long r8 = r7.longValue()
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 != 0) goto L35
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r4)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L35
        Laf:
            int r3 = r3 + 1
            goto L2d
        Lb3:
            r1 = r2
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2887.mo5957(java.lang.Object):boolean");
    }
}
