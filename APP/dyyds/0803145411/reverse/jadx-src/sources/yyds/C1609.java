package yyds;

/* JADX INFO: renamed from: yyds.ᛷᛸᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1609 extends AbstractC2408 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f8181;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f8182;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f8183;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f8184;

    public C1609(C2205 c2205) {
        this.f8182 = 1;
        this.f8181 = c2205;
        this.f8184 = false;
        this.f8183 = 0;
    }

    @Override // yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1183() {
        int i = this.f8182;
        Object obj = this.f8181;
        switch (i) {
            case 0:
                if (!this.f8184) {
                    ((C2780) obj).f13571.setVisibility(this.f8183);
                }
                break;
            default:
                int i2 = this.f8183 + 1;
                this.f8183 = i2;
                C2205 c2205 = (C2205) obj;
                if (i2 == c2205.f10899.size()) {
                    InterfaceC1824 interfaceC1824 = c2205.f10903;
                    if (interfaceC1824 != null) {
                        interfaceC1824.mo1183();
                    }
                    this.f8183 = 0;
                    this.f8184 = false;
                    c2205.f10898 = false;
                }
                break;
        }
    }

    @Override // yyds.AbstractC2408, yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void mo3309() {
        switch (this.f8182) {
            case 0:
                this.f8184 = true;
                break;
        }
    }

    @Override // yyds.AbstractC2408, yyds.InterfaceC1824
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo2973() {
        int i = this.f8182;
        Object obj = this.f8181;
        switch (i) {
            case 0:
                ((C2780) obj).f13571.setVisibility(0);
                break;
            default:
                if (!this.f8184) {
                    this.f8184 = true;
                    InterfaceC1824 interfaceC1824 = ((C2205) obj).f10903;
                    if (interfaceC1824 != null) {
                        interfaceC1824.mo2973();
                    }
                    break;
                }
                break;
        }
    }

    public C1609(C2780 c2780, int i) {
        this.f8182 = 0;
        this.f8181 = c2780;
        this.f8183 = i;
        this.f8184 = false;
    }
}
