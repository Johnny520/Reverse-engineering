package com.alibaba.fastjson2;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2882 extends AbstractC2880 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9113;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final double f9114;

    public C2882(String str, long j, JSONPathFilter$Operator jSONPathFilter$Operator, Double d) {
        super(str, j);
        this.f9113 = jSONPathFilter$Operator;
        this.f9114 = d.doubleValue();
    }

    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo5956() {
        return this.f9113 == JSONPathFilter$Operator.NE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005e A[RETURN] */
    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo5957(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L5f
        L4:
            boolean r1 = r4 instanceof java.lang.Boolean
            if (r1 == 0) goto L1a
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L13
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L15
        L13:
            r1 = 0
        L15:
            java.lang.Double r4 = java.lang.Double.valueOf(r1)
            goto L28
        L1a:
            boolean r1 = r4 instanceof java.lang.Number
            if (r1 == 0) goto L60
            java.lang.Number r4 = (java.lang.Number) r4
            double r1 = r4.doubleValue()
            java.lang.Double r4 = java.lang.Double.valueOf(r1)
        L28:
            double r1 = r3.f9114
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            int r4 = r4.compareTo(r1)
            com.alibaba.fastjson2.JSONPathFilter$Operator r3 = r3.f9113
            int r3 = r3.ordinal()
            r1 = 1
            if (r3 == 0) goto L5c
            if (r3 == r1) goto L59
            r2 = 2
            if (r3 == r2) goto L56
            r2 = 3
            if (r3 == r2) goto L53
            r2 = 4
            if (r3 == r2) goto L50
            r2 = 5
            if (r3 != r2) goto L4c
            if (r4 > 0) goto L5f
            goto L5e
        L4c:
            lin.xposed.hook.javaplugin.C5554.m10882()
            return r0
        L50:
            if (r4 >= 0) goto L5f
            goto L5e
        L53:
            if (r4 < 0) goto L5f
            goto L5e
        L56:
            if (r4 <= 0) goto L5f
            goto L5e
        L59:
            if (r4 == 0) goto L5f
            goto L5e
        L5c:
            if (r4 != 0) goto L5f
        L5e:
            return r1
        L5f:
            return r0
        L60:
            lin.xposed.hook.javaplugin.C5554.m10882()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2882.mo5957(java.lang.Object):boolean");
    }
}
