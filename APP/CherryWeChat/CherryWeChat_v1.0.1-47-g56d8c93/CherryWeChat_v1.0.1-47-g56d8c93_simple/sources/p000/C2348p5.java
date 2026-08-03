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
    public final void mo2120h(C2454rb r6, boolean r7) {
        int r0 = this.f8225h;
        this.f8226i = r0;
        if (r7 == false) goto L8;
        if (r0 != 5) goto L6;
        this.f8226i = 1;
    L13:
        if ((r6 instanceof C2399q5) == false) goto L16;
        int r72 = this.f8226i;
        ((C2399q5) r6).f8407s0 = r72;
        return;
    L16:
        return;
    L6:
        if (r0 != 6) goto L13;
        this.f8226i = 0;
        goto L13
    L8:
        if (r0 != 5) goto L10;
        this.f8226i = 0;
        goto L13
    L10:
        if (r0 != 6) goto L13;
        this.f8226i = 1;
        goto L13
    }

    public void setAllowsGoneWidget(boolean r2) {
        this.f8227j.f8408t0 = r2;
    }

    public void setDpMargin(int r2) {
        this.f8227j.f8409u0 = (int) ((r2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int r2) {
        this.f8227j.f8409u0 = r2;
    }

    public void setType(int r1) {
        this.f8225h = r1;
    }
}
