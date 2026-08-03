package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC1055i;
import androidx.constraintlayout.widget.C1046R;
import p000a.C0135H6;
import p000a.C0240N3;
import p000a.C0450Yg;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC1055i {

    /* JADX INFO: renamed from: i */
    public C0135H6 f4141i;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC1055i, androidx.constraintlayout.widget.AbstractC1049c
    /* JADX INFO: renamed from: e */
    public final void mo2406e(AttributeSet attributeSet) {
        super.mo2406e(attributeSet);
        this.f4141i = new C0135H6();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1046R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C1046R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.f4141i.f451J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_padding) {
                    C0135H6 c0135h6 = this.f4141i;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0135h6.f1695g0 = dimensionPixelSize;
                    c0135h6.f1696h0 = dimensionPixelSize;
                    c0135h6.f1697i0 = dimensionPixelSize;
                    c0135h6.f1698j0 = dimensionPixelSize;
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                    C0135H6 c0135h62 = this.f4141i;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0135h62.f1697i0 = dimensionPixelSize2;
                    c0135h62.f1699k0 = dimensionPixelSize2;
                    c0135h62.f1700l0 = dimensionPixelSize2;
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f4141i.f1698j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f4141i.f1699k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.f4141i.f1695g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.f4141i.f1700l0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f4141i.f1696h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f4141i.f449H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f4141i.f458r0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f4141i.f459s0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f4141i.f460t0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f4141i.f462v0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f4141i.f461u0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f4141i.f463w0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f4141i.f464x0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f4141i.f466z0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f4141i.f443B0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f4141i.f442A0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f4141i.f444C0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f4141i.f465y0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f4141i.f447F0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f4141i.f448G0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f4141i.f445D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f4141i.f446E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f4141i.f450I0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f4252d = this.f4141i;
        m2421g();
    }

    @Override // androidx.constraintlayout.widget.AbstractC1049c
    /* JADX INFO: renamed from: f */
    public final void mo2407f(C0240N3 c0240n3, boolean z) {
        C0135H6 c0135h6 = this.f4141i;
        int i = c0135h6.f1697i0;
        if (i > 0 || c0135h6.f1698j0 > 0) {
            if (z) {
                c0135h6.f1699k0 = c0135h6.f1698j0;
                c0135h6.f1700l0 = i;
            } else {
                c0135h6.f1699k0 = i;
                c0135h6.f1700l0 = c0135h6.f1698j0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC1055i
    /* JADX INFO: renamed from: h */
    public final void mo2408h(C0450Yg c0450Yg, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c0450Yg == null) {
            setMeasuredDimension(0, 0);
        } else {
            c0450Yg.mo354C(mode, size, mode2, size2);
            setMeasuredDimension(c0450Yg.f1702n0, c0450Yg.f1703o0);
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC1049c, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        mo2408h(this.f4141i, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f4141i.f466z0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f4141i.f460t0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f4141i.f442A0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f4141i.f461u0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f4141i.f447F0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f4141i.f464x0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f4141i.f445D0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f4141i.f458r0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f4141i.f450I0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f4141i.f451J0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C0135H6 c0135h6 = this.f4141i;
        c0135h6.f1695g0 = i;
        c0135h6.f1696h0 = i;
        c0135h6.f1697i0 = i;
        c0135h6.f1698j0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f4141i.f1696h0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f4141i.f1699k0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f4141i.f1700l0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f4141i.f1695g0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f4141i.f448G0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f4141i.f465y0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f4141i.f446E0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f4141i.f459s0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f4141i.f449H0 = i;
        requestLayout();
    }
}
