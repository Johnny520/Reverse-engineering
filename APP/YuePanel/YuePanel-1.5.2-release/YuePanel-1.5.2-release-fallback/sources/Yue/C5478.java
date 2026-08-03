package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5478<T> implements Yue.InterfaceC3574<T>, java.io.Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5478.C5479 f20292 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<Yue.C5478<?>, java.lang.Object> f20293 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public volatile Yue.InterfaceC2823<? extends T> f20294;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public volatile java.lang.Object f20295;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Object f20296;

    /* JADX INFO: renamed from: Yue.ۥۡۧۢۦ$ۥ, reason: contains not printable characters */
    public static final class C5479 {
        public C5479() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5479(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۡۧۢۦ$ۥ r0 = new Yue.ۥۡۧۢۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5478.f20292 = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "ۥ۟۟۠ۤ"
            java.lang.Class<Yue.ۥۡۧۢۦ> r2 = Yue.C5478.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            Yue.C5478.f20293 = r0
            return
    }

    public C5478(@Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "initializer"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20294 = r2
            Yue.ۥۢۢۧۧ r2 = Yue.C6551.f22943
            r1.f20295 = r2
            r1.f20296 = r2
            return
    }

    @Override // Yue.InterfaceC3574
    public T getValue() {
            r3 = this;
            java.lang.Object r0 = r3.f20295
            Yue.ۥۢۢۧۧ r1 = Yue.C6551.f22943
            if (r0 == r1) goto L7
            return r0
        L7:
            Yue.ۥۣ۠۠ۨ<? extends T> r0 = r3.f20294
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.invoke()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<Yue.ۥۡۧۢۦ<?>, java.lang.Object> r2 = Yue.C5478.f20293
            boolean r1 = Yue.C0084.m471(r2, r3, r1, r0)
            if (r1 == 0) goto L1b
            r1 = 0
            r3.f20294 = r1
            return r0
        L1b:
            java.lang.Object r0 = r3.f20295
            return r0
    }

    @Override // Yue.InterfaceC3574
    public boolean isInitialized() {
            r2 = this;
            java.lang.Object r0 = r2.f20295
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

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m20636() {
            r2 = this;
            Yue.ۥ۠ۥۢ۟ r0 = new Yue.ۥ۠ۥۢ۟
            java.lang.Object r1 = r2.getValue()
            r0.<init>(r1)
            return r0
    }
}
