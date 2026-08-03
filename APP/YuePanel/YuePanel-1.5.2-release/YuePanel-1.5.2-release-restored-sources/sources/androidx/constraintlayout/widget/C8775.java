package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8775 extends AbstractC8767 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8775(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m29285();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m29285();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m29285();
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo17579(AttributeSet attributeSet) {
        super.mo17579(attributeSet);
        this.f26626 = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo17580(ConstraintLayout constraintLayout) {
        ConstraintLayout.C1641 c1641 = (ConstraintLayout.C1641) getLayoutParams();
        c1641.f26540.m11965(0);
        c1641.f26540.m11935(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8775(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C8775(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
