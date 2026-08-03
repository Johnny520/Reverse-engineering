package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6599<T> implements Yue.InterfaceC3574<T>, java.io.Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC2823<? extends T> f23020;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.lang.Object f23021;

    public C6599(@Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "initializer"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f23020 = r2
            Yue.ۥۢۢۧۧ r2 = Yue.C6551.f22943
            r1.f23021 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    private final java.lang.Object m25391() {
            r2 = this;
            Yue.ۥ۠ۥۢ۟ r0 = new Yue.ۥ۠ۥۢ۟
            java.lang.Object r1 = r2.getValue()
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC3574
    public T getValue() {
            r2 = this;
            java.lang.Object r0 = r2.f23021
            Yue.ۥۢۢۧۧ r1 = Yue.C6551.f22943
            if (r0 != r1) goto L14
            Yue.ۥۣ۠۠ۨ<? extends T> r0 = r2.f23020
            Yue.C3329.m13903(r0)
            java.lang.Object r0 = r0.invoke()
            r2.f23021 = r0
            r0 = 0
            r2.f23020 = r0
        L14:
            java.lang.Object r0 = r2.f23021
            return r0
    }

    @Override // Yue.InterfaceC3574
    public boolean isInitialized() {
            r2 = this;
            java.lang.Object r0 = r2.f23021
            Yue.ۥۢۢۧۧ r1 = Yue.C6551.f22943
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L11
        Lf:
            java.lang.String r0 = "Lazy value not initialized yet."
        L11:
            return r0
    }
}
