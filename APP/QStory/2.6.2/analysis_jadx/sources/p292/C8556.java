package p292;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8556 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8556 f23857 = new C8556(null, C8566.f23893);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final short[] f23858;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8566 f23859;

    public C8556(C8566 c8566, short[] sArr) {
        this.f23859 = c8566;
        this.f23858 = sArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        return p316.C8675.m14367(r2.length, r6.f23858.length);
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r6) {
        /*
            r5 = this;
            飘花落叶言楪子哲兰苏世.飘花落叶言子楪兰苏世哲 r6 = (p292.C8556) r6
            r0 = 0
            r1 = r0
        L4:
            short[] r2 = r5.f23858
            int r3 = r2.length
            if (r1 >= r3) goto L26
            short[] r3 = r6.f23858
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
            short[] r6 = r6.f23858
            int r6 = r6.length
            int r5 = p316.C8675.m14367(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p292.C8556.compareTo(java.lang.Object):int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        short[] sArr = this.f23858;
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            C8566 c8566 = this.f23859;
            sb.append(c8566 != null ? c8566.f23894.get(sArr[i]) : Short.valueOf(sArr[i]));
        }
        sb.append(")");
        return sb.toString();
    }
}
