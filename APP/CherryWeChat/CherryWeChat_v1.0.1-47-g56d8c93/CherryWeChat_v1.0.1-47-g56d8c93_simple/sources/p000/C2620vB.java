package p000;

/* JADX INFO: renamed from: vB */
/* JADX INFO: loaded from: classes.dex */
public final class C2620vB extends AbstractC1406fG {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9096g;

    /* JADX INFO: renamed from: h */
    public boolean f9097h;

    /* JADX INFO: renamed from: i */
    public int f9098i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f9099j;

    public C2620vB(C2663wB r2, int r3) {
        this.f9096g = 0;
        super(21);
        this.f9099j = r2;
        this.f9098i = r3;
        this.f9097h = false;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0359IE
    /* JADX INFO: renamed from: C */
    public final void mo795C() {
        switch(this.f9096g) {
            case 0: goto L11;
            default: goto L5;
        };
    L11:
        ((C2663wB) this.f9099j).f9213a.setVisibility(0);
        return;
    L5:
        if (this.f9097h == true) goto L14;
        this.f9097h = true;
        InterfaceC0359IE r0 = ((C0316HE) this.f9099j).f1040d;
        if (r0 == null) goto L13;
        r0.mo795C();
        return;
    L13:
        return;
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: c */
    public final void mo796c() {
        switch(this.f9096g) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        int r0 = this.f9098i + 1;
        this.f9098i = r0;
        C0316HE r1 = (C0316HE) this.f9099j;
        if (r0 != r1.f1037a.size()) goto L15;
        InterfaceC0359IE r02 = r1.f1040d;
        if (r02 == null) goto L9;
        r02.mo796c();
    L9:
        this.f9098i = 0;
        this.f9097h = false;
        r1.f1041e = false;
        return;
    L15:
        return;
    L12:
        if (this.f9097h == true) goto L16;
        ((C2663wB) this.f9099j).f9213a.setVisibility(this.f9098i);
        return;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0359IE
    /* JADX INFO: renamed from: d */
    public void mo797d() {
        switch(this.f9096g) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.f9097h = true;
    }

    public C2620vB(C0316HE r2) {
        this.f9096g = 1;
        super(21);
        this.f9099j = r2;
        this.f9097h = false;
        this.f9098i = 0;
    }
}
