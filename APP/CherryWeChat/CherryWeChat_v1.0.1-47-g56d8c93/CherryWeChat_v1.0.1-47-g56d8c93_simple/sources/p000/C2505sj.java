package p000;

/* JADX INFO: renamed from: sj */
/* JADX INFO: loaded from: classes.dex */
public final class C2505sj implements InterfaceC0421Jr {

    /* JADX INFO: renamed from: b */
    public static final C2505sj f8792b = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8793a;

    static {
        f8792b = new C2505sj(0);
    }

    public /* synthetic */ C2505sj(int r1) {
        this.f8793a = r1;
    }

    @Override // p000.InterfaceC0421Jr
    /* JADX INFO: renamed from: a */
    public final C1236bv mo879a(Class r4) {
        switch(this.f8793a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new IllegalStateException("This should never be called.");
    L7:
        if (AbstractC2634vj.class.isAssignableFrom(r4) == false) goto L14;
        return (C1236bv) AbstractC2634vj.m5146j(r4.asSubclass(AbstractC2634vj.class)).mo44i(3);
    L10:
        e = move-exception;
        throw new RuntimeException("Unable to get message info for ".concat(r4.getName()), e);
    L14:
        throw new IllegalArgumentException("Unsupported message type: ".concat(r4.getName()));
    }

    @Override // p000.InterfaceC0421Jr
    /* JADX INFO: renamed from: b */
    public final boolean mo880b(Class r2) {
        switch(this.f8793a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        return false;
    L7:
        return AbstractC2634vj.class.isAssignableFrom(r2);
    }
}
