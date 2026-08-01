package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛴᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0950 extends xhss.AbstractC0561 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f3085;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f3086;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f3087;

    public /* synthetic */ C0950(int r1) {
            r0 = this;
            r0.f3086 = r1
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final int mo135(xhss.C0099 r7) {
            r6 = this;
            int r0 = r6.f3086
            r1 = 4
            r2 = 1
            r3 = 2
            r4 = 0
            switch(r0) {
                case 0: goto L46;
                default: goto L9;
            }
        L9:
            int r0 = r6.f3085
            int r6 = r6.f3087
            r7.m258(r3)
            if (r6 == 0) goto L27
            r7.m255(r1, r4)
            java.nio.ByteBuffer r3 = r7.f458
            int r5 = r7.f455
            int r5 = r5 - r1
            r7.f455 = r5
            r3.putInt(r5, r6)
            int[] r6 = r7.f464
            int r3 = r7.m264()
            r6[r2] = r3
        L27:
            if (r0 == 0) goto L3e
            r7.m255(r1, r4)
            java.nio.ByteBuffer r6 = r7.f458
            int r2 = r7.f455
            int r2 = r2 - r1
            r7.f455 = r2
            r6.putInt(r2, r0)
            int[] r6 = r7.f464
            int r0 = r7.m264()
            r6[r4] = r0
        L3e:
            int r6 = r7.m257()
            r7.m259(r6)
            return r6
        L46:
            int r0 = r6.f3085
            if (r0 == 0) goto L7a
            int r6 = r6.f3087
            if (r6 == r2) goto L54
            if (r6 != r3) goto L52
            r6 = r2
            goto L55
        L52:
            r6 = 0
            throw r6
        L54:
            r6 = r4
        L55:
            r7.m258(r3)
            if (r0 == 0) goto L6f
            r7.m255(r1, r4)
            java.nio.ByteBuffer r3 = r7.f458
            int r5 = r7.f455
            int r5 = r5 - r1
            r7.f455 = r5
            r3.putInt(r5, r0)
            int[] r0 = r7.f464
            int r1 = r7.m264()
            r0[r4] = r1
        L6f:
            r7.m251(r2, r6)
            int r4 = r7.m257()
            r7.m259(r4)
            goto L7f
        L7a:
            java.lang.String r6 = "modifiers must not be 0"
            xhss.C0532.m959(r6)
        L7f:
            return r4
    }
}
