package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fo extends android.view.View {
    public fo(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setGuidelineBegin(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            gc r0 = (defpackage.gc) r0
            r0.a = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelineEnd(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            gc r0 = (defpackage.gc) r0
            r0.b = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelinePercent(float r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            gc r0 = (defpackage.gc) r0
            r0.c = r2
            r1.setLayoutParams(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            return
    }
}
