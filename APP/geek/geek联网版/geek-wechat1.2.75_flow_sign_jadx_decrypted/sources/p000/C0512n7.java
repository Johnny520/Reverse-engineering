package p000;

/* JADX INFO: renamed from: n7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0512n7 extends AbstractC0517nc {

    /* JADX INFO: renamed from: g */
    public int f3236g;

    /* JADX INFO: renamed from: h */
    public int f3237h;

    /* JADX INFO: renamed from: i */
    public C0549o7 f3238i;

    @Override // p000.AbstractC0517nc
    /* JADX INFO: renamed from: f */
    public final void mo191f(C0925yc c0925yc, boolean z) {
        int i = this.f3236g;
        this.f3237h = i;
        if (z) {
            if (i == 5) {
                this.f3237h = 1;
            } else if (i == 6) {
                this.f3237h = 0;
            }
        } else if (i == 5) {
            this.f3237h = 0;
        } else if (i == 6) {
            this.f3237h = 1;
        }
        if (c0925yc instanceof C0549o7) {
            ((C0549o7) c0925yc).f3408f0 = this.f3237h;
        }
    }

    public int getMargin() {
        return this.f3238i.f3410h0;
    }

    public int getType() {
        return this.f3236g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f3238i.f3409g0 = z;
    }

    public void setDpMargin(int i) {
        this.f3238i.f3410h0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f3238i.f3410h0 = i;
    }

    public void setType(int i) {
        this.f3236g = i;
    }
}
