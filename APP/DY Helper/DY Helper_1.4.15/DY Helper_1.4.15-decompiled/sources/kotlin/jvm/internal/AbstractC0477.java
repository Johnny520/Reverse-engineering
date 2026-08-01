package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0477 implements p000.io0, java.io.Serializable {
    public static final java.lang.Object NO_RECEIVER = null;
    private final boolean isTopLevel;
    private final java.lang.String name;
    private final java.lang.Class owner;
    protected final java.lang.Object receiver;
    private transient p000.io0 reflected;
    private final java.lang.String signature;

    static {
            ld r0 = p000.C0508ld.f6559
            kotlin.jvm.internal.AbstractC0477.NO_RECEIVER = r0
            return
    }

    public AbstractC0477(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.receiver = r1
            r0.owner = r2
            r0.name = r3
            r0.signature = r4
            r0.isTopLevel = r5
            return
    }

    @Override // p000.io0
    public java.lang.Object call(java.lang.Object... r1) {
            r0 = this;
            io0 r0 = r0.getReflected()
            java.lang.Object r0 = r0.call(r1)
            return r0
    }

    @Override // p000.io0
    public java.lang.Object callBy(java.util.Map r1) {
            r0 = this;
            io0 r0 = r0.getReflected()
            java.lang.Object r0 = r0.callBy(r1)
            return r0
    }

    public p000.io0 compute() {
            r1 = this;
            io0 r0 = r1.reflected
            if (r0 != 0) goto La
            io0 r0 = r1.computeReflected()
            r1.reflected = r0
        La:
            return r0
    }

    public abstract p000.io0 computeReflected();

    @Override // p000.ho0
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r0 = this;
            io0 r0 = r0.getReflected()
            java.util.List r0 = r0.getAnnotations()
            return r0
    }

    public java.lang.Object getBoundReceiver() {
            r0 = this;
            java.lang.Object r0 = r0.receiver
            return r0
    }

    public java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    public p000.jo0 getOwner() {
            r1 = this;
            java.lang.Class r0 = r1.owner
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            boolean r1 = r1.isTopLevel
            if (r1 == 0) goto L15
            wm1 r1 = p000.vm1.f11350
            r1.getClass()
            a91 r1 = new a91
            r1.<init>(r0)
            return r1
        L15:
            wf r1 = p000.vm1.m6272(r0)
            return r1
    }

    @Override // p000.io0
    public java.util.List<java.lang.Object> getParameters() {
            r0 = this;
            io0 r0 = r0.getReflected()
            java.util.List r0 = r0.getParameters()
            return r0
    }

    public abstract p000.io0 getReflected();

    @Override // p000.io0
    public p000.to0 getReturnType() {
            r0 = this;
            io0 r0 = r0.getReflected()
            r0.getReturnType()
            r0 = 0
            return r0
    }

    public java.lang.String getSignature() {
            r0 = this;
            java.lang.String r0 = r0.signature
            return r0
    }

    @Override // p000.io0
    public java.util.List<java.lang.Object> getTypeParameters() {
            r0 = this;
            io0 r0 = r0.getReflected()
            java.util.List r0 = r0.getTypeParameters()
            return r0
    }

    @Override // p000.io0
    public p000.uo0 getVisibility() {
            r0 = this;
            io0 r0 = r0.getReflected()
            uo0 r0 = r0.getVisibility()
            return r0
    }

    @Override // p000.io0
    public boolean isAbstract() {
            r0 = this;
            io0 r0 = r0.getReflected()
            boolean r0 = r0.isAbstract()
            return r0
    }

    @Override // p000.io0
    public boolean isFinal() {
            r0 = this;
            io0 r0 = r0.getReflected()
            boolean r0 = r0.isFinal()
            return r0
    }

    @Override // p000.io0
    public boolean isOpen() {
            r0 = this;
            io0 r0 = r0.getReflected()
            boolean r0 = r0.isOpen()
            return r0
    }
}
