package defpackage;

/* JADX INFO: renamed from: ᛴᛴᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0656 implements defpackage.InterfaceC0391 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f3182;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1459 f3183;

    public /* synthetic */ C0656(defpackage.C1459 r1, int r2) {
            r0 = this;
            r0.f3182 = r2
            r0.f3183 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.InterfaceC1901 mo382(java.lang.Object r7, int r8, int r9, defpackage.C0533 r10) {
            r6 = this;
            int r0 = r6.f3182
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            android.os.ParcelFileDescriptor r7 = (android.os.ParcelFileDescriptor) r7
            ᛷᛸᛱᛸ r1 = new ᛷᛸᛱᛸ
            ᛸᛳᲀᛱ r0 = r6.f3183
            java.util.ArrayList r6 = r0.f6413
            ᲇᛶᛳᛱ r2 = r0.f6414
            r1.<init>(r7, r6, r2)
            ᛸᛶᛱᛵ r5 = defpackage.C1459.f6409
            r2 = r8
            r3 = r9
            r4 = r10
            ᛱᲀᛴᲁ r6 = r0.m2660(r1, r2, r3, r4, r5)
            return r6
        L1c:
            r2 = r8
            r3 = r9
            r4 = r10
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            ᛷᛸᛱᛸ r1 = new ᛷᛸᛱᛸ
            ᛸᛳᲀᛱ r0 = r6.f3183
            java.util.ArrayList r6 = r0.f6413
            ᲇᛶᛳᛱ r8 = r0.f6414
            r9 = 15
            r1.<init>(r7, r6, r8, r9)
            ᛸᛶᛱᛵ r5 = defpackage.C1459.f6409
            ᛱᲀᛴᲁ r6 = r0.m2660(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // defpackage.InterfaceC0391
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final boolean mo383(java.lang.Object r3, defpackage.C0533 r4) {
            r2 = this;
            int r2 = r2.f3182
            switch(r2) {
                case 0: goto L32;
                default: goto L5;
            }
        L5:
            android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "HUAWEI"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 != 0) goto L19
            java.lang.String r4 = "HONOR"
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L24
        L19:
            long r2 = r3.getStatSize()
            r0 = 536870912(0x20000000, double:2.65249474E-315)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
        L24:
            java.lang.String r2 = "robolectric"
            java.lang.String r3 = android.os.Build.FINGERPRINT
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            return r2
        L32:
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r2 = 1
            return r2
    }
}
