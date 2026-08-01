package defpackage;

/* JADX INFO: renamed from: ᛷᲇᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1395 extends defpackage.AbstractC0754 implements defpackage.InterfaceC1735, defpackage.InterfaceC0140 {

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f6052 = 0;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.Object f6053;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final java.lang.Object f6054;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.AbstractC1805 f6055;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.AbstractC1016 f6056;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛷᲇᲇᲇ> r1 = defpackage.C1395.class
            java.lang.String r2 = "_reusableCancellableContinuation$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C1395.f6052 = r0
            return
    }

    public C1395(defpackage.AbstractC1805 r2, defpackage.AbstractC1016 r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.f6055 = r2
            r1.f6056 = r3
            ᛳᛴᛵᛱ r2 = defpackage.AbstractC1592.f7040
            r1.f6053 = r2
            ᛳᛵᲈᛵ r2 = r3.f4527
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            ᛷᛸᲁᛱ r0 = defpackage.C1825.f7962
            java.lang.Object r2 = r2.mo969(r3, r0)
            r1.f6054 = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DispatchedContinuation["
            r0.<init>(r1)
            ᲁᛲᛱᛵ r1 = r2.f6055
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            ᛶᛱᲀᛶ r2 = r2.f6056
            java.lang.String r2 = defpackage.AbstractC0762.m1683(r2)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.AbstractC0754
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final java.lang.Object mo1671() {
            r2 = this;
            java.lang.Object r0 = r2.f6053
            ᛳᛴᛵᛱ r1 = defpackage.AbstractC1592.f7040
            r2.f6053 = r1
            return r0
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo662(java.lang.Object r10) {
            r9 = this;
            java.lang.Throwable r0 = defpackage.C2165.m3569(r10)
            r1 = 0
            if (r0 != 0) goto L9
            r2 = r10
            goto Le
        L9:
            ᛱᛸᛳᛱ r2 = new ᛱᛸᛳᛱ
            r2.<init>(r0, r1)
        Le:
            ᛶᛱᲀᛶ r0 = r9.f6056
            ᛳᛵᲈᛵ r3 = r0.f4527
            ᲁᛲᛱᛵ r4 = r9.f6055
            boolean r5 = r4.mo2540(r3)
            if (r5 == 0) goto L22
            r9.f6053 = r2
            r9.f3535 = r1
            r4.mo572(r3, r9)
            return
        L22:
            ᛱᛵᛶᲇ r4 = defpackage.AbstractC1054.m2007()
            long r5 = r4.f887
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L44
            r9.f6053 = r2
            r9.f3535 = r1
            ᛶᲈᛷᛵ r10 = r4.f888
            if (r10 != 0) goto L40
            ᛶᲈᛷᛵ r10 = new ᛶᲈᛷᛵ
            r10.<init>()
            r4.f888 = r10
        L40:
            r10.addLast(r9)
            return
        L44:
            r1 = 1
            r4.m575(r1)
            java.lang.Object r2 = r9.f6054     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r2 = defpackage.C1825.m3215(r3, r2)     // Catch: java.lang.Throwable -> L5e
            r0.mo662(r10)     // Catch: java.lang.Throwable -> L60
            defpackage.C1825.m3216(r3, r2)     // Catch: java.lang.Throwable -> L5e
        L54:
            boolean r10 = r4.m577()     // Catch: java.lang.Throwable -> L5e
            if (r10 != 0) goto L54
        L5a:
            r4.m580(r1)
            goto L69
        L5e:
            r10 = move-exception
            goto L65
        L60:
            r10 = move-exception
            defpackage.C1825.m3216(r3, r2)     // Catch: java.lang.Throwable -> L5e
            throw r10     // Catch: java.lang.Throwable -> L5e
        L65:
            r9.m1670(r10)     // Catch: java.lang.Throwable -> L6a
            goto L5a
        L69:
            return
        L6a:
            r9 = move-exception
            r4.m580(r1)
            throw r9
    }

    @Override // defpackage.InterfaceC0140
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.InterfaceC0493 mo663() {
            r0 = this;
            ᛶᛱᲀᛶ r0 = r0.f6056
            ᛳᛵᲈᛵ r0 = r0.f4527
            return r0
    }

    @Override // defpackage.InterfaceC1735
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final defpackage.InterfaceC1735 mo1504() {
            r0 = this;
            ᛶᛱᲀᛶ r0 = r0.f6056
            return r0
    }

    @Override // defpackage.AbstractC0754
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final defpackage.InterfaceC0140 mo1674() {
            r0 = this;
            return r0
    }
}
