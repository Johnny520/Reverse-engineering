package defpackage;

/* JADX INFO: renamed from: ᛵᛱᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0812 extends defpackage.AbstractC2012 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f3736;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f3737;

    public /* synthetic */ C0812(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f3736 = r1
            r0.f3737 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC2012
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo1746(defpackage.C0055 r10) {
            r9 = this;
            int r0 = r9.f3736
            java.lang.Object r9 = r9.f3737
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            ᲇᛳᛷᲇ r9 = (defpackage.RunnableC2022) r9
            r9.run()
            return
        Ld:
            ᲁᛴᛷᛴ r9 = (defpackage.C1848) r9
            int r0 = r10.computeHorizontalScrollOffset()
            int r10 = r10.computeVerticalScrollOffset()
            int r1 = r9.f8066
            ᛱᛳᛶᛱ r2 = r9.f8059
            int r2 = r2.computeVerticalScrollRange()
            int r3 = r9.f8073
            int r4 = r2 - r3
            r5 = 0
            r6 = 1
            if (r4 <= 0) goto L2b
            if (r3 < r1) goto L2b
            r4 = r6
            goto L2c
        L2b:
            r4 = r5
        L2c:
            r9.f8057 = r4
            ᛱᛳᛶᛱ r4 = r9.f8059
            int r4 = r4.computeHorizontalScrollRange()
            int r7 = r9.f8072
            int r8 = r4 - r7
            if (r8 <= 0) goto L3e
            if (r7 < r1) goto L3e
            r1 = r6
            goto L3f
        L3e:
            r1 = r5
        L3f:
            r9.f8056 = r1
            boolean r8 = r9.f8057
            if (r8 != 0) goto L4f
            if (r1 != 0) goto L4f
            int r10 = r9.f8064
            if (r10 == 0) goto L88
            r9.m3237(r5)
            goto L88
        L4f:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L67
            float r10 = (float) r10
            float r5 = (float) r3
            float r8 = r5 / r1
            float r8 = r8 + r10
            float r8 = r8 * r5
            float r10 = (float) r2
            float r8 = r8 / r10
            int r10 = (int) r8
            r9.f8054 = r10
            int r10 = r3 * r3
            int r10 = r10 / r2
            int r10 = java.lang.Math.min(r3, r10)
            r9.f8053 = r10
        L67:
            boolean r10 = r9.f8056
            if (r10 == 0) goto L7f
            float r10 = (float) r0
            float r0 = (float) r7
            float r1 = r0 / r1
            float r1 = r1 + r10
            float r1 = r1 * r0
            float r10 = (float) r4
            float r1 = r1 / r10
            int r10 = (int) r1
            r9.f8058 = r10
            int r10 = r7 * r7
            int r10 = r10 / r4
            int r10 = java.lang.Math.min(r7, r10)
            r9.f8068 = r10
        L7f:
            int r10 = r9.f8064
            if (r10 == 0) goto L85
            if (r10 != r6) goto L88
        L85:
            r9.m3237(r6)
        L88:
            return
    }
}
