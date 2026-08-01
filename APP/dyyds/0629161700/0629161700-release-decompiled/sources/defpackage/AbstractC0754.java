package defpackage;

/* JADX INFO: renamed from: ᛴᲀᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0754 extends defpackage.AbstractRunnableC1247 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f3535;

    public AbstractC0754(int r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            r3.<init>(r0, r2)
            r3.f3535 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            ᛱᛸᛲᲀ r0 = r10.mo1674()     // Catch: java.lang.Throwable -> L1a
            ᛷᲇᲇᲇ r0 = (defpackage.C1395) r0     // Catch: java.lang.Throwable -> L1a
            ᛶᛱᲀᛶ r1 = r0.f6056     // Catch: java.lang.Throwable -> L1a
            ᛳᛵᲈᛵ r2 = r1.f4527     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.f6054     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = defpackage.C1825.m3215(r2, r0)     // Catch: java.lang.Throwable -> L1a
            ᛳᛴᛵᛱ r3 = defpackage.C1825.f7959     // Catch: java.lang.Throwable -> L1a
            r4 = 0
            if (r0 == r3) goto L1d
            ᲈᛷᛸᛸ r3 = defpackage.AbstractC0762.m1686(r1, r2, r0)     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r0 = move-exception
            goto L85
        L1d:
            r3 = r4
        L1e:
            java.lang.Object r5 = r10.mo1671()     // Catch: java.lang.Throwable -> L3d
            java.lang.Throwable r6 = r10.mo1669(r5)     // Catch: java.lang.Throwable -> L3d
            if (r6 != 0) goto L3f
            int r7 = r10.f3535     // Catch: java.lang.Throwable -> L3d
            r8 = 1
            if (r7 == r8) goto L32
            r9 = 2
            if (r7 != r9) goto L31
            goto L32
        L31:
            r8 = 0
        L32:
            if (r8 == 0) goto L3f
            ᛷᲈᲀ r4 = defpackage.C1403.f6097     // Catch: java.lang.Throwable -> L3d
            ᛶᲁᛳᲈ r4 = r2.mo970(r4)     // Catch: java.lang.Throwable -> L3d
            ᲇᛳᛸᛳ r4 = (defpackage.InterfaceC2023) r4     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r1 = move-exception
            goto L79
        L3f:
            if (r4 == 0) goto L59
            boolean r7 = r4.mo1449()     // Catch: java.lang.Throwable -> L3d
            if (r7 != 0) goto L59
            ᛴᛲᛵᛵ r4 = (defpackage.AbstractC0624) r4     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.CancellationException r4 = r4.m1448()     // Catch: java.lang.Throwable -> L3d
            r10.mo1673(r4)     // Catch: java.lang.Throwable -> L3d
            ᛴᛸᛲᲀ r5 = new ᛴᛸᛲᲀ     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            r1.mo662(r5)     // Catch: java.lang.Throwable -> L3d
            goto L6b
        L59:
            if (r6 == 0) goto L64
            ᛴᛸᛲᲀ r4 = new ᛴᛸᛲᲀ     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            r1.mo662(r4)     // Catch: java.lang.Throwable -> L3d
            goto L6b
        L64:
            java.lang.Object r4 = r10.mo1672(r5)     // Catch: java.lang.Throwable -> L3d
            r1.mo662(r4)     // Catch: java.lang.Throwable -> L3d
        L6b:
            if (r3 == 0) goto L75
            boolean r1 = r3.m3709()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L74
            goto L75
        L74:
            return
        L75:
            defpackage.C1825.m3216(r2, r0)     // Catch: java.lang.Throwable -> L1a
            return
        L79:
            if (r3 == 0) goto L81
            boolean r3 = r3.m3709()     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L84
        L81:
            defpackage.C1825.m3216(r2, r0)     // Catch: java.lang.Throwable -> L1a
        L84:
            throw r1     // Catch: java.lang.Throwable -> L1a
        L85:
            r10.m1670(r0)
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.Throwable mo1669(java.lang.Object r2) {
            r1 = this;
            boolean r1 = r2 instanceof defpackage.C0142
            r0 = 0
            if (r1 == 0) goto L8
            ᛱᛸᛳᛱ r2 = (defpackage.C0142) r2
            goto L9
        L8:
            r2 = r0
        L9:
            if (r2 == 0) goto Le
            java.lang.Throwable r1 = r2.f1092
            return r1
        Le:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void m1670(java.lang.Throwable r4) {
            r3 = this;
            ᲁᛵᛵᲀ r0 = new ᲁᛵᛵᲀ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fatal exception in coroutines machinery for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            ᛱᛸᛲᲀ r3 = r3.mo1674()
            ᛳᛵᲈᛵ r3 = r3.mo663()
            defpackage.AbstractC2279.m3703(r3, r0)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public abstract java.lang.Object mo1671();

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public java.lang.Object mo1672(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void mo1673(java.util.concurrent.CancellationException r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public abstract defpackage.InterfaceC0140 mo1674();
}
