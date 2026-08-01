package defpackage;

/* JADX INFO: renamed from: ᛳᛶᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0506 implements defpackage.InterfaceC1152 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReference f2500;

    public C0506(defpackage.C0954 r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.f2500 = r0
            return
    }

    @Override // defpackage.InterfaceC1152
    public final java.util.Iterator iterator() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r1.f2500
            r0 = 0
            java.lang.Object r1 = r1.getAndSet(r0)
            ᛶᲁᛴ r1 = (defpackage.InterfaceC1152) r1
            if (r1 == 0) goto L10
            java.util.Iterator r1 = r1.iterator()
            return r1
        L10:
            java.lang.String r1 = "This sequence can be consumed only once."
            defpackage.C2264.m3676(r1)
            return r0
    }
}
