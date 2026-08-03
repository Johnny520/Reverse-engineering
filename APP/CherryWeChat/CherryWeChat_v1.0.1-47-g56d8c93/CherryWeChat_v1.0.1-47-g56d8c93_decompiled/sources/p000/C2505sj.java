package p000;

/* JADX INFO: renamed from: sj */
/* JADX INFO: loaded from: classes.dex */
public final class C2505sj implements InterfaceC0421Jr {

    /* JADX INFO: renamed from: b */
    public static final C2505sj f8792b = new C2505sj(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8793a;

    public /* synthetic */ C2505sj(int i) {
        this.f8793a = i;
    }

    @Override // p000.InterfaceC0421Jr
    /* JADX INFO: renamed from: a */
    public final C1236bv mo879a(Class cls) {
        switch (this.f8793a) {
            case 0:
                if (!AbstractC2634vj.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C1236bv) AbstractC2634vj.m5146j(cls.asSubclass(AbstractC2634vj.class)).mo44i(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // p000.InterfaceC0421Jr
    /* JADX INFO: renamed from: b */
    public final boolean mo880b(Class cls) {
        switch (this.f8793a) {
            case 0:
                return AbstractC2634vj.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
