package p000;

/* JADX INFO: renamed from: p5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2348p5 extends AbstractC1364eb {

    /* JADX INFO: renamed from: h */
    public int f8225h;

    /* JADX INFO: renamed from: i */
    public int f8226i;

    /* JADX INFO: renamed from: j */
    public C2399q5 f8227j;

    public boolean getAllowsGoneWidget() {
        return this.f8227j.f8408t0;
    }

    public int getMargin() {
        return this.f8227j.f8409u0;
    }

    public int getType() {
        return this.f8225h;
    }

    @Override // p000.AbstractC1364eb
    /* JADX INFO: renamed from: h */
    public final void mo2120h(C2454rb c2454rb, boolean z) {
        int i = this.f8225h;
        this.f8226i = i;
        if (z) {
            if (i == 5) {
                this.f8226i = 1;
            } else if (i == 6) {
                this.f8226i = 0;
            }
        } else if (i == 5) {
            this.f8226i = 0;
        } else if (i == 6) {
            this.f8226i = 1;
        }
        if (c2454rb instanceof C2399q5) {
            ((C2399q5) c2454rb).f8407s0 = this.f8226i;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f8227j.f8408t0 = z;
    }

    public void setDpMargin(int i) {
        this.f8227j.f8409u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f8227j.f8409u0 = i;
    }

    public void setType(int i) {
        this.f8225h = i;
    }
}
