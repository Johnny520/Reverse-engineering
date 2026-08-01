package defpackage;

/* JADX INFO: renamed from: ᲁᲀᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1916 extends defpackage.AbstractC0288 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Thread f8329;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.AbstractC0092 f8330;

    public C1916(defpackage.InterfaceC0493 r2, java.lang.Thread r3, defpackage.AbstractC0092 r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.f8329 = r3
            r1.f8330 = r4
            return
    }

    @Override // defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final void mo1433(java.lang.Object r1) {
            r0 = this;
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r0.f8329
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r0)
            if (r1 != 0) goto Lf
            java.util.concurrent.locks.LockSupport.unpark(r0)
        Lf:
            return
    }
}
