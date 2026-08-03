package Yue;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC8767;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5679 extends AbstractC8767 {

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final String f13985 = "Layer";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float f13986;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public float f13987;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f13988;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public ConstraintLayout f13989;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public float f13990;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public float f13991;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public float f13992;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public float f13993;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public float f13994;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public float f13995;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public float f13996;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public float f13997;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public boolean f13998;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public View[] f13999;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public float f14000;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public float f14001;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public boolean f14002;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public boolean f14003;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5679(Context context) {
        super(context);
        this.f13986 = Float.NaN;
        this.f13987 = Float.NaN;
        this.f13988 = Float.NaN;
        this.f13990 = 1.0f;
        this.f13991 = 1.0f;
        this.f13992 = Float.NaN;
        this.f13993 = Float.NaN;
        this.f13994 = Float.NaN;
        this.f13995 = Float.NaN;
        this.f13996 = Float.NaN;
        this.f13997 = Float.NaN;
        this.f13998 = true;
        this.f13999 = null;
        this.f14000 = 0.0f;
        this.f14001 = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13989 = (ConstraintLayout) getParent();
        if (this.f14002 || this.f14003) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f26623; i++) {
                View viewById = this.f13989.getViewById(this.f26622[i]);
                if (viewById != null) {
                    if (this.f14002) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f14003 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m29285();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.f13986 = f;
        m17584();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f13987 = f;
        m17584();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f13988 = f;
        m17584();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f13990 = f;
        m17584();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f13991 = f;
        m17584();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.f14000 = f;
        m17584();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.f14001 = f;
        m17584();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m29285();
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo17579(AttributeSet attributeSet) {
        super.mo17579(attributeSet);
        this.f26626 = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f28715);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f28722) {
                    this.f14002 = true;
                } else if (index == C8778.C8789.f28729) {
                    this.f14003 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo17580(ConstraintLayout constraintLayout) {
        m17583();
        this.f13992 = Float.NaN;
        this.f13993 = Float.NaN;
        C4128 c4128M4706 = ((ConstraintLayout.C1641) getLayoutParams()).m4706();
        c4128M4706.m11965(0);
        c4128M4706.m11935(0);
        m17582();
        layout(((int) this.f13996) - getPaddingLeft(), ((int) this.f13997) - getPaddingTop(), ((int) this.f13994) + getPaddingRight(), ((int) this.f13995) + getPaddingBottom());
        m17584();
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void mo17581(ConstraintLayout constraintLayout) {
        this.f13989 = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f13988 = rotation;
        } else {
            if (Float.isNaN(this.f13988)) {
                return;
            }
            this.f13988 = rotation;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m17582() {
        if (this.f13989 == null) {
            return;
        }
        if (this.f13998 || Float.isNaN(this.f13992) || Float.isNaN(this.f13993)) {
            if (!Float.isNaN(this.f13986) && !Float.isNaN(this.f13987)) {
                this.f13993 = this.f13987;
                this.f13992 = this.f13986;
                return;
            }
            View[] viewArrM29290 = m29290(this.f13989);
            int left = viewArrM29290[0].getLeft();
            int top = viewArrM29290[0].getTop();
            int right = viewArrM29290[0].getRight();
            int bottom = viewArrM29290[0].getBottom();
            for (int i = 0; i < this.f26623; i++) {
                View view = viewArrM29290[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f13994 = right;
            this.f13995 = bottom;
            this.f13996 = left;
            this.f13997 = top;
            if (Float.isNaN(this.f13986)) {
                this.f13992 = (left + right) / 2;
            } else {
                this.f13992 = this.f13986;
            }
            if (Float.isNaN(this.f13987)) {
                this.f13993 = (top + bottom) / 2;
            } else {
                this.f13993 = this.f13987;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m17583() {
        int i;
        if (this.f13989 == null || (i = this.f26623) == 0) {
            return;
        }
        View[] viewArr = this.f13999;
        if (viewArr == null || viewArr.length != i) {
            this.f13999 = new View[i];
        }
        for (int i2 = 0; i2 < this.f26623; i2++) {
            this.f13999[i2] = this.f13989.getViewById(this.f26622[i2]);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m17584() {
        if (this.f13989 == null) {
            return;
        }
        if (this.f13999 == null) {
            m17583();
        }
        m17582();
        double radians = Float.isNaN(this.f13988) ? 0.0d : Math.toRadians(this.f13988);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f13990;
        float f2 = f * fCos;
        float f3 = this.f13991;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f26623; i++) {
            View view = this.f13999[i];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f7 = left - this.f13992;
            float f8 = top - this.f13993;
            float f9 = (((f2 * f7) + (f4 * f8)) - f7) + this.f14000;
            float f10 = (((f7 * f5) + (f6 * f8)) - f8) + this.f14001;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f13991);
            view.setScaleX(this.f13990);
            if (!Float.isNaN(this.f13988)) {
                view.setRotation(this.f13988);
            }
        }
    }

    public C5679(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13986 = Float.NaN;
        this.f13987 = Float.NaN;
        this.f13988 = Float.NaN;
        this.f13990 = 1.0f;
        this.f13991 = 1.0f;
        this.f13992 = Float.NaN;
        this.f13993 = Float.NaN;
        this.f13994 = Float.NaN;
        this.f13995 = Float.NaN;
        this.f13996 = Float.NaN;
        this.f13997 = Float.NaN;
        this.f13998 = true;
        this.f13999 = null;
        this.f14000 = 0.0f;
        this.f14001 = 0.0f;
    }

    public C5679(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13986 = Float.NaN;
        this.f13987 = Float.NaN;
        this.f13988 = Float.NaN;
        this.f13990 = 1.0f;
        this.f13991 = 1.0f;
        this.f13992 = Float.NaN;
        this.f13993 = Float.NaN;
        this.f13994 = Float.NaN;
        this.f13995 = Float.NaN;
        this.f13996 = Float.NaN;
        this.f13997 = Float.NaN;
        this.f13998 = true;
        this.f13999 = null;
        this.f14000 = 0.0f;
        this.f14001 = 0.0f;
    }
}
