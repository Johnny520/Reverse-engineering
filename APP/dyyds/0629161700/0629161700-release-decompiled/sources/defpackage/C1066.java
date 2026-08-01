package defpackage;

/* JADX INFO: renamed from: ᛶᛵᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1066 implements defpackage.InterfaceC2182 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f4743;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f4744;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2252 f4745;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f4746;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f4747;

    public C1066(defpackage.C2252 r1) {
            r0 = this;
            r0.<init>()
            r0.f4745 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᲈᛵᲈᛵ r0 = r0.f4745
            ᲈᛱᲇᛳ r0 = r0.f9579
            ᛶᛵᛸᛱ r0 = r0.mo1707()
            return r0
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r7, defpackage.C1569 r9) {
            r6 = this;
        L0:
            int r7 = r6.f4746
            ᲈᛵᲈᛵ r8 = r6.f4745
            r0 = -1
            if (r7 != 0) goto L76
            int r7 = r6.f4747
            long r2 = (long) r7
            r8.m3647(r2)
            r7 = 0
            r6.f4747 = r7
            int r7 = r6.f4744
            r7 = r7 & 4
            if (r7 == 0) goto L18
            goto L85
        L18:
            int r7 = r6.f4743
            int r0 = defpackage.AbstractC0709.m1602(r8)
            r6.f4746 = r0
            byte r1 = r8.m3641()
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = r8.m3641()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6.f4744 = r2
            java.util.logging.Logger r2 = defpackage.C1264.f5664
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r3 = r2.isLoggable(r3)
            if (r3 == 0) goto L46
            ᛶᛸᛸᛶ r3 = defpackage.AbstractC1853.f8093
            int r3 = r6.f4743
            int r4 = r6.f4744
            r5 = 1
            java.lang.String r0 = defpackage.AbstractC1853.m3269(r5, r3, r0, r1, r4)
            r2.fine(r0)
        L46:
            int r8 = r8.m3640()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r0
            r6.f4743 = r8
            r0 = 9
            if (r1 != r0) goto L5f
            if (r8 != r7) goto L57
            goto L0
        L57:
            java.lang.String r6 = "TYPE_CONTINUATION streamId changed"
            defpackage.C2264.m3682(r6)
            r6 = 0
            return r6
        L5f:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r8 = " != TYPE_CONTINUATION"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L76:
            long r2 = (long) r7
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r4, r2)
            long r7 = r8.mo782(r2, r9)
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 != 0) goto L86
        L85:
            return r0
        L86:
            int r9 = r6.f4746
            int r0 = (int) r7
            int r9 = r9 - r0
            r6.f4746 = r9
            return r7
    }
}
