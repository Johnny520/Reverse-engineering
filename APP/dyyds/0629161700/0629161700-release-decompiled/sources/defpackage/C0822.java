package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0822 implements defpackage.InterfaceC1901, defpackage.InterfaceC0545 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final defpackage.C1326 f3784 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f3785;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.InterfaceC1901 f3786;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0943 f3787;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f3788;

    static {
            ᲁᲁᛷᲈ r0 = new ᲁᲁᛷᲈ
            r1 = 0
            r0.<init>(r1)
            r1 = 20
            ᛷᛸᛱᛸ r0 = defpackage.AbstractC2346.m3841(r1, r0)
            defpackage.C0822.f3784 = r0
            return
    }

    public C0822() {
            r1 = this;
            r1.<init>()
            ᛵᛸᛴᛶ r0 = new ᛵᛸᛴᛶ
            r0.<init>()
            r1.f3787 = r0
            return
    }

    @Override // defpackage.InterfaceC1901
    public final java.lang.Object get() {
            r0 = this;
            ᲁᛸᛸ r0 = r0.f3786
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final synchronized void mo692() {
            r1 = this;
            monitor-enter(r1)
            ᛵᛸᛴᛶ r0 = r1.f3787     // Catch: java.lang.Throwable -> L1b
            r0.m1896()     // Catch: java.lang.Throwable -> L1b
            r0 = 1
            r1.f3788 = r0     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r1.f3785     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            ᲁᛸᛸ r0 = r1.f3786     // Catch: java.lang.Throwable -> L1b
            r0.mo692()     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            r1.f3786 = r0     // Catch: java.lang.Throwable -> L1b
            ᛷᛸᛱᛸ r0 = defpackage.C0822.f3784     // Catch: java.lang.Throwable -> L1b
            r0.mo914(r1)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r0 = move-exception
            goto L1f
        L1d:
            monitor-exit(r1)
            return
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final java.lang.Class mo693() {
            r0 = this;
            ᲁᛸᛸ r0 = r0.f3786
            java.lang.Class r0 = r0.mo693()
            return r0
    }

    @Override // defpackage.InterfaceC1901
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final int mo694() {
            r0 = this;
            ᲁᛸᛸ r0 = r0.f3786
            int r0 = r0.mo694()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final synchronized void m1749() {
            r2 = this;
            monitor-enter(r2)
            ᛵᛸᛴᛶ r0 = r2.f3787     // Catch: java.lang.Throwable -> L15
            r0.m1896()     // Catch: java.lang.Throwable -> L15
            boolean r0 = r2.f3785     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L19
            r0 = 0
            r2.f3785 = r0     // Catch: java.lang.Throwable -> L15
            boolean r0 = r2.f3788     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            r2.mo692()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L21
        L17:
            monitor-exit(r2)
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = "Already unlocked"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // defpackage.InterfaceC0545
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0943 mo1334() {
            r0 = this;
            ᛵᛸᛴᛶ r0 = r0.f3787
            return r0
    }
}
