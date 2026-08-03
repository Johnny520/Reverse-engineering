package p000;

/* JADX INFO: renamed from: kq */
/* JADX INFO: loaded from: classes.dex */
public final class C2160kq implements InterfaceC0421Jr {

    /* JADX INFO: renamed from: a */
    public InterfaceC0421Jr[] f7538a;

    @Override // p000.InterfaceC0421Jr
    /* JADX INFO: renamed from: a */
    public final C1236bv mo879a(Class cls) {
        for (InterfaceC0421Jr interfaceC0421Jr : this.f7538a) {
            if (interfaceC0421Jr.mo880b(cls)) {
                return interfaceC0421Jr.mo879a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC0421Jr
    /* JADX INFO: renamed from: b */
    public final boolean mo880b(Class cls) {
        for (InterfaceC0421Jr interfaceC0421Jr : this.f7538a) {
            if (interfaceC0421Jr.mo880b(cls)) {
                return true;
            }
        }
        return false;
    }
}
