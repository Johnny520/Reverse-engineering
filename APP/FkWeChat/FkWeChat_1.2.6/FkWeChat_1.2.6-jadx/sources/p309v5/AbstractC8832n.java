package p309v5;

/* JADX INFO: renamed from: v5.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8832n extends AbstractC8824f {

    /* JADX INFO: renamed from: s */
    public final C8829k f29365s;

    public AbstractC8832n(AbstractC8832n abstractC8832n) {
        super(abstractC8832n.size());
        this.f29365s = abstractC8832n.f29365s.m33910F();
        int size = abstractC8832n.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object objM33887w = abstractC8832n.m33887w(i10);
            if (objM33887w != null) {
                m33889y(i10, objM33887w);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m33921E(int i10, int i11) {
        int size = this.f29365s.size();
        int i12 = 0;
        while (true) {
            int i13 = i10 - size;
            C8829k c8829k = this.f29365s;
            if (i12 > i13) {
                c8829k.m33913I(i10, i11);
                return;
            } else {
                c8829k.m33917w(-1);
                i12++;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final int m33922F() {
        int size = this.f29365s.size() - 1;
        while (size >= 0 && this.f29365s.m33920z(size) < 0) {
            size--;
        }
        int i10 = size + 1;
        this.f29365s.m33914J(i10);
        return i10;
    }

    /* JADX INFO: renamed from: G */
    public final int m33923G(int i10) {
        if (i10 >= this.f29365s.size()) {
            return -1;
        }
        return this.f29365s.m33920z(i10);
    }

    /* JADX INFO: renamed from: H */
    public final void m33924H() {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC8831m interfaceC8831m = (InterfaceC8831m) m33887w(i10);
            if (interfaceC8831m != null) {
                this.f29365s.m33913I(interfaceC8831m.mo6715a(), i10);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m33925I(int i10) {
        this.f29365s.m33913I(i10, -1);
    }

    /* JADX INFO: renamed from: J */
    public void m33926J(int i10, InterfaceC8831m interfaceC8831m) {
        InterfaceC8831m interfaceC8831m2 = (InterfaceC8831m) m33888x(i10);
        m33889y(i10, interfaceC8831m);
        if (interfaceC8831m2 != null) {
            m33925I(interfaceC8831m2.mo6715a());
        }
        if (interfaceC8831m != null) {
            m33921E(interfaceC8831m.mo6715a(), i10);
        }
    }

    @Override // p309v5.AbstractC8824f
    /* JADX INFO: renamed from: z */
    public void mo33890z() {
        super.mo33890z();
        m33924H();
    }

    public AbstractC8832n(int i10) {
        super(i10);
        this.f29365s = new C8829k(i10);
    }
}
