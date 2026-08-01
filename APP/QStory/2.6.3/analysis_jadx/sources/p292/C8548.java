package p292;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8548 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8548 f23848 = new C8548(null, C8558.f23884);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final short[] f23849;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8558 f23850;

    public C8548(C8558 c8558, short[] sArr) {
        this.f23850 = c8558;
        this.f23849 = sArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        return androidx.window.area.AbstractC2567.m5093(r2.length, r6.f23849.length);
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r6) {
        /*
            r5 = this;
            飘花落叶言楪子哲兰苏世.飘花落叶言子楪兰苏世哲 r6 = (p292.C8548) r6
            r0 = 0
            r1 = r0
        L4:
            short[] r2 = r5.f23849
            int r3 = r2.length
            if (r1 >= r3) goto L26
            short[] r3 = r6.f23849
            int r4 = r3.length
            if (r1 >= r4) goto L26
            short r2 = r2[r1]
            short r3 = r3[r1]
            if (r2 == r3) goto L23
            if (r2 != r3) goto L17
            return r0
        L17:
            r5 = 65535(0xffff, float:9.1834E-41)
            r6 = r2 & r5
            r5 = r5 & r3
            if (r6 >= r5) goto L21
            r5 = -1
            return r5
        L21:
            r5 = 1
            return r5
        L23:
            int r1 = r1 + 1
            goto L4
        L26:
            int r5 = r2.length
            short[] r6 = r6.f23849
            int r6 = r6.length
            int r5 = androidx.window.area.AbstractC2567.m5093(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p292.C8548.compareTo(java.lang.Object):int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        short[] sArr = this.f23849;
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            C8558 c8558 = this.f23850;
            sb.append(c8558 != null ? c8558.f23885.get(sArr[i]) : Short.valueOf(sArr[i]));
        }
        sb.append(")");
        return sb.toString();
    }
}
