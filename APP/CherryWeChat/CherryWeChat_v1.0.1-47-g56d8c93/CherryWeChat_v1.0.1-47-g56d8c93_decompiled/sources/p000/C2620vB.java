package p000;

/* JADX INFO: renamed from: vB */
/* JADX INFO: loaded from: classes.dex */
public final class C2620vB extends AbstractC1406fG {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9096g = 1;

    /* JADX INFO: renamed from: h */
    public boolean f9097h;

    /* JADX INFO: renamed from: i */
    public int f9098i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f9099j;

    public C2620vB(C2663wB c2663wB, int i) {
        super(21);
        this.f9099j = c2663wB;
        this.f9098i = i;
        this.f9097h = false;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0359IE
    /* JADX INFO: renamed from: C */
    public final void mo795C() {
        switch (this.f9096g) {
            case 0:
                ((C2663wB) this.f9099j).f9213a.setVisibility(0);
                break;
            default:
                if (!this.f9097h) {
                    this.f9097h = true;
                    InterfaceC0359IE interfaceC0359IE = ((C0316HE) this.f9099j).f1040d;
                    if (interfaceC0359IE != null) {
                        interfaceC0359IE.mo795C();
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: c */
    public final void mo796c() {
        switch (this.f9096g) {
            case 0:
                if (!this.f9097h) {
                    ((C2663wB) this.f9099j).f9213a.setVisibility(this.f9098i);
                }
                break;
            default:
                int i = this.f9098i + 1;
                this.f9098i = i;
                C0316HE c0316he = (C0316HE) this.f9099j;
                if (i == c0316he.f1037a.size()) {
                    InterfaceC0359IE interfaceC0359IE = c0316he.f1040d;
                    if (interfaceC0359IE != null) {
                        interfaceC0359IE.mo796c();
                    }
                    this.f9098i = 0;
                    this.f9097h = false;
                    c0316he.f1041e = false;
                }
                break;
        }
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0359IE
    /* JADX INFO: renamed from: d */
    public void mo797d() {
        switch (this.f9096g) {
            case 0:
                this.f9097h = true;
                break;
        }
    }

    public C2620vB(C0316HE c0316he) {
        super(21);
        this.f9099j = c0316he;
        this.f9097h = false;
        this.f9098i = 0;
    }
}
