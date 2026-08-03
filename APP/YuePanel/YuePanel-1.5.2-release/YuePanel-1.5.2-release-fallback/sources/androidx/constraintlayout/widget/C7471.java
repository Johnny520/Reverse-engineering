package androidx.constraintlayout.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥۣ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7471 extends android.view.View {
    public C7471(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public C7471(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public C7471(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public C7471(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setGuidelineBegin(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r0
            r0.f25923 = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelineEnd(int r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r0
            r0.f25924 = r2
            r1.setLayoutParams(r0)
            return
    }

    public void setGuidelinePercent(float r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$ۥ۟ r0 = (androidx.constraintlayout.widget.ConstraintLayout.C7450) r0
            r0.f25925 = r2
            r1.setLayoutParams(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            return
    }
}
