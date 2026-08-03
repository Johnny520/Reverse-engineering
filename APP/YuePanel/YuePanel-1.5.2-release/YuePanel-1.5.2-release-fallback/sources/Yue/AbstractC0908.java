package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0908 implements Yue.InterfaceC3433, java.io.Serializable {

    @Yue.InterfaceC5792(version = "1.1")
    public static final java.lang.Object NO_RECEIVER = null;

    @Yue.InterfaceC5792(version = "1.4")
    private final boolean isTopLevel;

    @Yue.InterfaceC5792(version = "1.4")
    private final java.lang.String name;

    @Yue.InterfaceC5792(version = "1.4")
    private final java.lang.Class owner;

    @Yue.InterfaceC5792(version = "1.1")
    protected final java.lang.Object receiver;
    private transient Yue.InterfaceC3433 reflected;

    @Yue.InterfaceC5792(version = "1.4")
    private final java.lang.String signature;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5792(version = "1.2")
    public static class C0909 implements java.io.Serializable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.AbstractC0908.C0909 f2653 = null;

        static {
                Yue.ۥۣ۟ۦۦ$ۥ r0 = new Yue.ۥۣ۟ۦۦ$ۥ
                r0.<init>()
                Yue.AbstractC0908.C0909.f2653 = r0
                return
        }

        public C0909() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ Yue.AbstractC0908.C0909 m5249() {
                Yue.ۥۣ۟ۦۦ$ۥ r0 = Yue.AbstractC0908.C0909.f2653
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.Object m5250() throws java.io.ObjectStreamException {
                r1 = this;
                Yue.ۥۣ۟ۦۦ$ۥ r0 = Yue.AbstractC0908.C0909.f2653
                return r0
        }
    }

    static {
            Yue.ۥۣ۟ۦۦ$ۥ r0 = Yue.AbstractC0908.C0909.m5249()
            Yue.AbstractC0908.NO_RECEIVER = r0
            return
    }

    public AbstractC0908() {
            r1 = this;
            java.lang.Object r0 = Yue.AbstractC0908.NO_RECEIVER
            r1.<init>(r0)
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    public AbstractC0908(java.lang.Object r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Yue.InterfaceC5792(version = "1.4")
    public AbstractC0908(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.receiver = r1
            r0.owner = r2
            r0.name = r3
            r0.signature = r4
            r0.isTopLevel = r5
            return
    }

    @Override // Yue.InterfaceC3433
    public java.lang.Object call(java.lang.Object... r2) {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            java.lang.Object r2 = r0.call(r2)
            return r2
    }

    @Override // Yue.InterfaceC3433
    public java.lang.Object callBy(java.util.Map r2) {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            java.lang.Object r2 = r0.callBy(r2)
            return r2
    }

    @Yue.InterfaceC5792(version = "1.1")
    public Yue.InterfaceC3433 compute() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.reflected
            if (r0 != 0) goto La
            Yue.ۥ۠ۦۢۡ r0 = r1.computeReflected()
            r1.reflected = r0
        La:
            return r0
    }

    public abstract Yue.InterfaceC3433 computeReflected();

    @Override // Yue.InterfaceC3432
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            java.util.List r0 = r0.getAnnotations()
            return r0
    }

    @Yue.InterfaceC5792(version = "1.1")
    public java.lang.Object getBoundReceiver() {
            r1 = this;
            java.lang.Object r0 = r1.receiver
            return r0
    }

    @Override // Yue.InterfaceC3433
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public Yue.InterfaceC3440 getOwner() {
            r2 = this;
            java.lang.Class r0 = r2.owner
            if (r0 != 0) goto L6
            r0 = 0
            goto L13
        L6:
            boolean r1 = r2.isTopLevel
            if (r1 == 0) goto Lf
            Yue.ۥ۠ۦۢۦ r0 = Yue.C5277.m19891(r0)
            goto L13
        Lf:
            Yue.ۥ۠ۦۢۢ r0 = Yue.C5277.m19888(r0)
        L13:
            return r0
    }

    @Override // Yue.InterfaceC3433
    public java.util.List<Yue.InterfaceC3460> getParameters() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            java.util.List r0 = r0.getParameters()
            return r0
    }

    @Yue.InterfaceC5792(version = "1.1")
    public Yue.InterfaceC3433 getReflected() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.compute()
            if (r0 == r1) goto L7
            return r0
        L7:
            Yue.ۥ۠ۦۧۧ r0 = new Yue.ۥ۠ۦۧۧ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3433
    public Yue.InterfaceC3473 getReturnType() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            Yue.ۥ۠ۦۣۤ r0 = r0.getReturnType()
            return r0
    }

    public java.lang.String getSignature() {
            r1 = this;
            java.lang.String r0 = r1.signature
            return r0
    }

    @Override // Yue.InterfaceC3433
    @Yue.InterfaceC5792(version = "1.1")
    public java.util.List<Yue.InterfaceC3476> getTypeParameters() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            java.util.List r0 = r0.getTypeParameters()
            return r0
    }

    @Override // Yue.InterfaceC3433
    @Yue.InterfaceC5792(version = "1.1")
    public Yue.EnumC3481 getVisibility() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            Yue.ۥ۠ۦۤۨ r0 = r0.getVisibility()
            return r0
    }

    @Override // Yue.InterfaceC3433
    @Yue.InterfaceC5792(version = "1.1")
    public boolean isAbstract() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            boolean r0 = r0.isAbstract()
            return r0
    }

    @Override // Yue.InterfaceC3433
    @Yue.InterfaceC5792(version = "1.1")
    public boolean isFinal() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            boolean r0 = r0.isFinal()
            return r0
    }

    @Override // Yue.InterfaceC3433
    @Yue.InterfaceC5792(version = "1.1")
    public boolean isOpen() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            boolean r0 = r0.isOpen()
            return r0
    }

    @Override // Yue.InterfaceC3433
    @Yue.InterfaceC5792(version = "1.3")
    public boolean isSuspend() {
            r1 = this;
            Yue.ۥ۠ۦۢۡ r0 = r1.getReflected()
            boolean r0 = r0.isSuspend()
            return r0
    }
}
