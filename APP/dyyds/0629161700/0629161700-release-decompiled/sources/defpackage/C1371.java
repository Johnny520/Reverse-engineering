package defpackage;

/* JADX INFO: renamed from: ᛷᲁᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1371 extends defpackage.AbstractC1805 implements defpackage.InterfaceC1925 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean f5997;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.os.Handler f5998;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1371 f5999;

    public C1371(android.os.Handler r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.f5998 = r2
            r1.f5997 = r3
            if (r3 == 0) goto Lb
            r3 = r1
            goto L11
        Lb:
            ᛷᲁᛷᛵ r3 = new ᛷᲁᛷᛵ
            r0 = 1
            r3.<init>(r2, r0)
        L11:
            r1.f5999 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C1371
            if (r0 == 0) goto L14
            ᛷᲁᛷᛵ r3 = (defpackage.C1371) r3
            android.os.Handler r0 = r3.f5998
            android.os.Handler r1 = r2.f5998
            if (r0 != r1) goto L14
            boolean r3 = r3.f5997
            boolean r2 = r2.f5997
            if (r3 != r2) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.f5998
            int r0 = java.lang.System.identityHashCode(r0)
            boolean r1 = r1.f5997
            if (r1 == 0) goto Ld
            r1 = 1231(0x4cf, float:1.725E-42)
            goto Lf
        Ld:
            r1 = 1237(0x4d5, float:1.733E-42)
        Lf:
            r1 = r1 ^ r0
            return r1
    }

    @Override // defpackage.AbstractC1805
    public final java.lang.String toString() {
            r2 = this;
            ᛶᛸᛳ r0 = defpackage.AbstractC1572.f6948
            ᛷᲁᛷᛵ r0 = defpackage.AbstractC1497.f6594
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            goto L14
        L9:
            r1 = 0
            ᛷᲁᛷᛵ r0 = r0.f5999     // Catch: java.lang.UnsupportedOperationException -> Ld
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
            android.os.Handler r0 = r2.f5998
            java.lang.String r0 = r0.toString()
            boolean r2 = r2.f5997
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

    @Override // defpackage.InterfaceC1925
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo571(long r6, defpackage.C2260 r8) {
            r5 = this;
            ᛱᲈᛷᲀ r0 = new ᛱᲈᛷᲀ
            r1 = 4
            r2 = 0
            r0.<init>(r8, r5, r1, r2)
            r3 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 <= 0) goto L11
            r6 = r3
        L11:
            android.os.Handler r1 = r5.f5998
            boolean r6 = r1.postDelayed(r0, r6)
            if (r6 == 0) goto L28
            ᛷᛷᲀᛳ r6 = new ᛷᛷᲀᛳ
            r6.<init>(r5, r2, r0)
            ᛱᲇᛷᛸ r5 = new ᛱᲇᛷᛸ
            r7 = 1
            r5.<init>(r7, r6)
            r8.m3667(r5)
            return
        L28:
            ᛳᛵᲈᛵ r6 = r8.f9598
            r5.m2541(r6, r0)
            return
    }

    @Override // defpackage.AbstractC1805
    /* JADX INFO: renamed from: ᛲᛲᛸᲈ */
    public final void mo572(defpackage.InterfaceC0493 r2, java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.f5998
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.m2541(r2, r3)
        Lb:
            return
    }

    @Override // defpackage.InterfaceC1925
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final defpackage.InterfaceC0843 mo573(long r4, defpackage.RunnableC1062 r6, defpackage.InterfaceC0493 r7) {
            r3 = this;
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto La
            r4 = r0
        La:
            android.os.Handler r0 = r3.f5998
            boolean r4 = r0.postDelayed(r6, r4)
            if (r4 == 0) goto L18
            ᛸᲇᛷᛲ r4 = new ᛸᲇᛷᛲ
            r4.<init>(r3, r6)
            return r4
        L18:
            r3.m2541(r7, r6)
            ᲈᛲᛴᛱ r3 = defpackage.C2187.f9280
            return r3
    }

    @Override // defpackage.AbstractC1805
    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public final boolean mo2540(defpackage.InterfaceC0493 r1) {
            r0 = this;
            boolean r1 = r0.f5997
            if (r1 == 0) goto L17
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Handler r0 = r0.f5998
            android.os.Looper r0 = r0.getLooper()
            boolean r0 = defpackage.AbstractC0498.m1280(r1, r0)
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public final void m2541(defpackage.InterfaceC0493 r4, java.lang.Runnable r5) {
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
            ᛷᲈᲀ r3 = defpackage.C1403.f6097
            ᛶᲁᛳᲈ r3 = r4.mo970(r3)
            ᲇᛳᛸᛳ r3 = (defpackage.InterfaceC2023) r3
            if (r3 == 0) goto L27
            ᛴᛲᛵᛵ r3 = (defpackage.AbstractC0624) r3
            r3.m1435(r0)
        L27:
            ᛶᛸᛳ r3 = defpackage.AbstractC1572.f6948
            ᛴᛵᲁᛳ r3 = defpackage.ExecutorC0679.f3269
            r3.mo572(r4, r5)
            return
    }
}
