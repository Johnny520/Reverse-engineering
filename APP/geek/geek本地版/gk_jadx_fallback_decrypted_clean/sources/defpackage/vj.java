package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vj extends defpackage.qz {
    public final /* synthetic */ defpackage.wj a;

    public vj(defpackage.wj r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.qz
    public final void b(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
            r8 = this;
            int r10 = r9.computeHorizontalScrollOffset()
            int r9 = r9.computeVerticalScrollOffset()
            wj r11 = r8.a
            int r0 = r11.a
            androidx.recyclerview.widget.RecyclerView r1 = r11.s
            int r1 = r1.computeVerticalScrollRange()
            int r2 = r11.r
            int r3 = r1 - r2
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L1e
            if (r2 < r0) goto L1e
            r3 = r5
            goto L1f
        L1e:
            r3 = r4
        L1f:
            r11.t = r3
            androidx.recyclerview.widget.RecyclerView r3 = r11.s
            int r3 = r3.computeHorizontalScrollRange()
            int r6 = r11.q
            int r7 = r3 - r6
            if (r7 <= 0) goto L31
            if (r6 < r0) goto L31
            r0 = r5
            goto L32
        L31:
            r0 = r4
        L32:
            r11.u = r0
            boolean r7 = r11.t
            if (r7 != 0) goto L42
            if (r0 != 0) goto L42
            int r9 = r11.v
            if (r9 == 0) goto L79
            r11.f(r4)
            return
        L42:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L5a
            float r9 = (float) r9
            float r4 = (float) r2
            float r7 = r4 / r0
            float r7 = r7 + r9
            float r7 = r7 * r4
            float r9 = (float) r1
            float r7 = r7 / r9
            int r9 = (int) r7
            r11.l = r9
            int r9 = r2 * r2
            int r9 = r9 / r1
            int r9 = java.lang.Math.min(r2, r9)
            r11.k = r9
        L5a:
            boolean r9 = r11.u
            if (r9 == 0) goto L72
            float r9 = (float) r10
            float r10 = (float) r6
            float r0 = r10 / r0
            float r0 = r0 + r9
            float r0 = r0 * r10
            float r9 = (float) r3
            float r0 = r0 / r9
            int r9 = (int) r0
            r11.o = r9
            int r9 = r6 * r6
            int r9 = r9 / r3
            int r9 = java.lang.Math.min(r6, r9)
            r11.n = r9
        L72:
            int r9 = r11.v
            if (r9 == 0) goto L7a
            if (r9 != r5) goto L79
            goto L7a
        L79:
            return
        L7a:
            r11.f(r5)
            return
    }
}
