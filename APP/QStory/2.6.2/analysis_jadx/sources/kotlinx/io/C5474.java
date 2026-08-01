package kotlinx.io;

/* JADX INFO: renamed from: kotlinx.io.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5474 implements InterfaceC5473 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f15134;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f15135;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f15136;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5476 f15137;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C5478 f15138;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5480 f15139;

    public C5474(InterfaceC5480 interfaceC5480) {
        this.f15139 = interfaceC5480;
        C5476 c5476Mo10600 = interfaceC5480.mo10600();
        this.f15137 = c5476Mo10600;
        C5478 c5478 = c5476Mo10600.f15143;
        this.f15138 = c5478;
        this.f15135 = c5478 != null ? c5478.f15149 : -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f15134 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r3 == r5.f15149) goto L15;
     */
    @Override // kotlinx.io.InterfaceC5473
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo10598(kotlinx.io.C5476 r12, long r13) {
        /*
            r11 = this;
            boolean r0 = r11.f15134
            r1 = 0
            if (r0 != 0) goto Lbc
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 < 0) goto Lb4
            kotlinx.io.飘花落叶言子楪苏世兰哲 r3 = r11.f15138
            kotlinx.io.飘花落叶言子楪世苏哲兰 r4 = r11.f15137
            if (r3 == 0) goto L24
            kotlinx.io.飘花落叶言子楪苏世兰哲 r5 = r4.f15143
            if (r3 != r5) goto L1e
            int r3 = r11.f15135
            r5.getClass()
            int r5 = r5.f15149
            if (r3 != r5) goto L1e
            goto L24
        L1e:
            java.lang.String r11 = "Peek source is invalid because upstream source was used"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r1
        L24:
            if (r0 != 0) goto L27
            return r1
        L27:
            long r5 = r11.f15136
            r7 = 1
            long r5 = r5 + r7
            kotlinx.io.飘花落叶言子楪苏兰世哲 r0 = r11.f15139
            boolean r0 = r0.mo10599(r5)
            if (r0 != 0) goto L37
            r11 = -1
            return r11
        L37:
            kotlinx.io.飘花落叶言子楪苏世兰哲 r0 = r11.f15138
            if (r0 != 0) goto L45
            kotlinx.io.飘花落叶言子楪苏世兰哲 r0 = r4.f15143
            if (r0 == 0) goto L45
            r11.f15138 = r0
            int r0 = r0.f15149
            r11.f15135 = r0
        L45:
            long r5 = r4.f15142
            long r7 = r11.f15136
            long r5 = r5 - r7
            long r13 = java.lang.Math.min(r13, r5)
            long r7 = r11.f15136
            long r9 = r7 + r13
            long r5 = r4.f15142
            kotlinx.io.AbstractC5477.m10617(r5, r7, r9)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L5c
            goto Lae
        L5c:
            long r9 = r9 - r7
            long r5 = r12.f15142
            long r5 = r5 + r9
            r12.f15142 = r5
            kotlinx.io.飘花落叶言子楪苏世兰哲 r0 = r4.f15143
        L64:
            r0.getClass()
            int r3 = r0.f15148
            int r4 = r0.f15149
            int r3 = r3 - r4
            long r3 = (long) r3
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L75
            long r7 = r7 - r3
            kotlinx.io.飘花落叶言子楪苏世兰哲 r0 = r0.f15145
            goto L64
        L75:
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lae
            r0.getClass()
            kotlinx.io.飘花落叶言子楪苏世兰哲 r3 = r0.m10630()
            int r4 = r3.f15149
            int r5 = (int) r7
            int r4 = r4 + r5
            r3.f15149 = r4
            int r5 = (int) r9
            int r4 = r4 + r5
            int r5 = r3.f15148
            int r4 = java.lang.Math.min(r4, r5)
            r3.f15148 = r4
            kotlinx.io.飘花落叶言子楪苏世兰哲 r4 = r12.f15143
            if (r4 != 0) goto L99
            r12.f15143 = r3
            r12.f15141 = r3
            goto La3
        L99:
            kotlinx.io.飘花落叶言子楪苏世兰哲 r4 = r12.f15141
            r4.getClass()
            r4.m10631(r3)
            r12.f15141 = r3
        La3:
            int r4 = r3.f15148
            int r3 = r3.f15149
            int r4 = r4 - r3
            long r3 = (long) r4
            long r9 = r9 - r3
            kotlinx.io.飘花落叶言子楪苏世兰哲 r0 = r0.f15145
            r7 = r1
            goto L75
        Lae:
            long r0 = r11.f15136
            long r0 = r0 + r13
            r11.f15136 = r0
            return r13
        Lb4:
            java.lang.String r11 = "byteCount ("
            java.lang.String r12 = ") < 0"
            io.ktor.util.C4210.m8619(r11, r13, r12)
            return r1
        Lbc:
            java.lang.String r11 = "Source is closed."
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.io.C5474.mo10598(kotlinx.io.飘花落叶言子楪世苏哲兰, long):long");
    }
}
