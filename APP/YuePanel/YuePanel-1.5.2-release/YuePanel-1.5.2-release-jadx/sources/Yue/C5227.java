package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5227 extends AbstractC8432 {
    public C5227(C4128 c4128) {
        super(c4128);
        c4128.f8355.mo10132();
        c4128.f8356.mo10132();
        this.f25273 = ((C5226) c4128).m16003();
    }

    @Override // Yue.AbstractC8432, Yue.InterfaceC4369
    /* JADX INFO: renamed from: ۥ */
    public void mo767(InterfaceC4369 interfaceC4369) {
        C4371 c4371 = this.f25275;
        if (c4371.f8951 && !c4371.f8958) {
            this.f25275.mo12660((int) ((c4371.f8960.get(0).f8955 * ((C5226) this.f3497).m16007()) + 0.5f));
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo10130() {
        C5226 c5226 = (C5226) this.f3497;
        int iM16004 = c5226.m16004();
        int iM16006 = c5226.m16006();
        c5226.m16007();
        if (c5226.m16003() == 1) {
            if (iM16004 != -1) {
                this.f25275.f8960.add(this.f3497.f8398.f8355.f25275);
                this.f3497.f8398.f8355.f25275.f8959.add(this.f25275);
                this.f25275.f8954 = iM16004;
            } else if (iM16006 != -1) {
                this.f25275.f8960.add(this.f3497.f8398.f8355.f25276);
                this.f3497.f8398.f8355.f25276.f8959.add(this.f25275);
                this.f25275.f8954 = -iM16006;
            } else {
                C4371 c4371 = this.f25275;
                c4371.f847 = true;
                c4371.f8960.add(this.f3497.f8398.f8355.f25276);
                this.f3497.f8398.f8355.f25276.f8959.add(this.f25275);
            }
            m16019(this.f3497.f8355.f25275);
            m16019(this.f3497.f8355.f25276);
            return;
        }
        if (iM16004 != -1) {
            this.f25275.f8960.add(this.f3497.f8398.f8356.f25275);
            this.f3497.f8398.f8356.f25275.f8959.add(this.f25275);
            this.f25275.f8954 = iM16004;
        } else if (iM16006 != -1) {
            this.f25275.f8960.add(this.f3497.f8398.f8356.f25276);
            this.f3497.f8398.f8356.f25276.f8959.add(this.f25275);
            this.f25275.f8954 = -iM16006;
        } else {
            C4371 c43712 = this.f25275;
            c43712.f847 = true;
            c43712.f8960.add(this.f3497.f8398.f8356.f25276);
            this.f3497.f8398.f8356.f25276.f8959.add(this.f25275);
        }
        m16019(this.f3497.f8356.f25275);
        m16019(this.f3497.f8356.f25276);
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo10131() {
        if (((C5226) this.f3497).m16003() == 1) {
            this.f3497.m11967(this.f25275.f8955);
        } else {
            this.f3497.m11968(this.f25275.f8955);
        }
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo10132() {
        this.f25275.m12658();
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo10134() {
        this.f25275.f8958 = false;
        this.f25276.f8958 = false;
    }

    @Override // Yue.AbstractC8432
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public boolean mo10135() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m16019(C4371 c4371) {
        this.f25275.f8959.add(c4371);
        c4371.f8960.add(this.f25275);
    }
}
