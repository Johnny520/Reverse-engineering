package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d7 extends ec {
    public int g;
    public int h;
    public e7 i;

    @Override // defpackage.ec
    public final void f(pc r6, boolean r7) {
        int r0 = this.g;
        this.h = r0;
        if (r7 == false) goto L8;
        if (r0 != 5) goto L6;
        this.h = 1;
    L13:
        if ((r6 instanceof e7) == false) goto L16;
        int r72 = this.h;
        ((e7) r6).f0 = r72;
        return;
    L16:
        return;
    L6:
        if (r0 != 6) goto L13;
        this.h = 0;
        goto L13
    L8:
        if (r0 != 5) goto L10;
        this.h = 0;
        goto L13
    L10:
        if (r0 != 6) goto L13;
        this.h = 1;
        goto L13
    }

    public int getMargin() {
        return this.i.h0;
    }

    public int getType() {
        return this.g;
    }

    public void setAllowsGoneWidget(boolean r2) {
        this.i.g0 = r2;
    }

    public void setDpMargin(int r2) {
        this.i.h0 = (int) ((r2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int r2) {
        this.i.h0 = r2;
    }

    public void setType(int r1) {
        this.g = r1;
    }
}
