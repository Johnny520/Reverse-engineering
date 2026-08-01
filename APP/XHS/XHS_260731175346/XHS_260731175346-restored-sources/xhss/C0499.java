package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛷᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0499 extends xhss.AbstractC0180 implements xhss.InterfaceC0654 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final android.os.Handler f1814;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0499 f1815;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean f1816;

    public C0499(android.os.Handler r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.f1814 = r2
            r1.f1816 = r3
            if (r3 == 0) goto Lb
            r3 = r1
            goto L11
        Lb:
            xhss.ᛵᛷᲈᛲ r3 = new xhss.ᛵᛷᲈᛲ
            r0 = 1
            r3.<init>(r2, r0)
        L11:
            r1.f1815 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof xhss.C0499
            if (r0 == 0) goto L14
            xhss.ᛵᛷᲈᛲ r3 = (xhss.C0499) r3
            android.os.Handler r0 = r3.f1814
            android.os.Handler r1 = r2.f1814
            if (r0 != r1) goto L14
            boolean r3 = r3.f1816
            boolean r2 = r2.f1816
            if (r3 != r2) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.f1814
            int r0 = java.lang.System.identityHashCode(r0)
            boolean r1 = r1.f1816
            if (r1 == 0) goto Ld
            r1 = 1231(0x4cf, float:1.725E-42)
            goto Lf
        Ld:
            r1 = 1237(0x4d5, float:1.733E-42)
        Lf:
            r1 = r1 ^ r0
            return r1
    }

    @Override // xhss.AbstractC0180
    public final java.lang.String toString() {
            r2 = this;
            xhss.ᛲᛱᛶᲇ r0 = xhss.AbstractC0326.f1237
            xhss.ᛵᛷᲈᛲ r0 = xhss.AbstractC0217.f799
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            goto L14
        L9:
            r1 = 0
            xhss.ᛵᛷᲈᛲ r0 = r0.f1815     // Catch: java.lang.UnsupportedOperationException -> Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r2 != r0) goto L13
            java.lang.String r0 = "Dispatchers.Main.immediate"
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 != 0) goto L32
            android.os.Handler r0 = r2.f1814
            java.lang.String r0 = r0.toString()
            boolean r2 = r2.f1816
            if (r2 == 0) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ".immediate"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r0 = r2
        L32:
            return r0
    }

    @Override // xhss.InterfaceC0654
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void mo903(long r5, xhss.C0172 r7) {
            r4 = this;
            xhss.ᛳᛵᛲᲇ r0 = new xhss.ᛳᛵᛲᲇ
            r1 = 1
            r0.<init>(r1, r7, r4)
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L10
            r5 = r1
        L10:
            android.os.Handler r1 = r4.f1814
            boolean r5 = r1.postDelayed(r0, r5)
            if (r5 == 0) goto L27
            xhss.ᛶᲀᲀᛵ r5 = new xhss.ᛶᲀᲀᛵ
            r6 = 0
            r5.<init>(r6, r4, r0)
            xhss.ᛵᲇᛶᛸ r4 = new xhss.ᛵᲇᛶᛸ
            r4.<init>(r6, r5)
            xhss.AbstractC0060.m186(r7, r4)
            return
        L27:
            xhss.ᛴᛵᛳᛵ r5 = r7.f691
            r4.m904(r5, r0)
            return
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final void m904(xhss.InterfaceC0362 r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The task was rejected, the handler underlying the dispatcher '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "' was closed"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            xhss.ᛳᛴᲀᲁ r3 = xhss.C0263.f977
            xhss.ᛳᛵᲈᛲ r3 = r4.mo442(r3)
            xhss.ᛸᛷᛳᲈ r3 = (xhss.AbstractC0784) r3
            if (r3 == 0) goto L25
            r3.m1352(r0)
        L25:
            xhss.ᛲᛱᛶᲇ r3 = xhss.AbstractC0326.f1237
            xhss.ᛳᛲᛳᛲ r3 = xhss.ExecutorC0237.f902
            r3.mo359(r4, r5)
            return
    }

    @Override // xhss.AbstractC0180
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final void mo359(xhss.InterfaceC0362 r2, java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.f1814
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.m904(r2, r3)
        Lb:
            return
    }

    @Override // xhss.AbstractC0180
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final boolean mo441(xhss.InterfaceC0362 r1) {
            r0 = this;
            boolean r1 = r0.f1816
            if (r1 == 0) goto L17
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Handler r0 = r0.f1814
            android.os.Looper r0 = r0.getLooper()
            boolean r0 = xhss.AbstractC0007.m97(r1, r0)
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }
}
