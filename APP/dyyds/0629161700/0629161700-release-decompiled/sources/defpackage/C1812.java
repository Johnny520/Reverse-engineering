package defpackage;

/* JADX INFO: renamed from: ᲁᛲᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1812 implements defpackage.InterfaceC0277, java.io.Serializable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f7935 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public volatile java.lang.Object f7936;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile defpackage.InterfaceC1781 f7937;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "ᛷᛲᲇᲈ"
            java.lang.Class<ᲁᛲᛶᛴ> r2 = defpackage.C1812.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            defpackage.C1812.f7935 = r0
            return
    }

    @Override // defpackage.InterfaceC0277
    public final java.lang.Object getValue() {
            r4 = this;
            java.lang.Object r0 = r4.f7936
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            if (r0 == r1) goto L7
            return r0
        L7:
            ᲀᲈᛵᲇ r0 = r4.f7937
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.mo1032()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.C1812.f7935
        L11:
            boolean r3 = r2.compareAndSet(r4, r1, r0)
            if (r3 == 0) goto L1b
            r1 = 0
            r4.f7937 = r1
            return r0
        L1b:
            java.lang.Object r3 = r2.get(r4)
            if (r3 == r1) goto L11
        L21:
            java.lang.Object r4 = r4.f7936
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.f7936
            ᛸᛶᛱᛵ r1 = defpackage.C1500.f6601
            if (r0 == r1) goto Lf
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            return r2
        Lf:
            java.lang.String r2 = "Lazy value not initialized yet."
            return r2
    }
}
