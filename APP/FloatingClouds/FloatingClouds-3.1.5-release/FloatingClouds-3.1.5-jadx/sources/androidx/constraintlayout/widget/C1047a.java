package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import p000a.C0240N3;
import p000a.C0381V1;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1047a extends AbstractC1049c {

    /* JADX INFO: renamed from: g */
    public int f4232g;

    /* JADX INFO: renamed from: h */
    public int f4233h;

    /* JADX INFO: renamed from: i */
    public C0381V1 f4234i;

    @Override // androidx.constraintlayout.widget.AbstractC1049c
    /* JADX INFO: renamed from: e */
    public final void mo2406e(AttributeSet attributeSet) {
        super.mo2406e(attributeSet);
        this.f4234i = new C0381V1();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1046R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C1046R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f4234i.f1439h0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == C1046R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.f4234i.f1440i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.f4252d = this.f4234i;
        m2421g();
    }

    @Override // androidx.constraintlayout.widget.AbstractC1049c
    /* JADX INFO: renamed from: f */
    public final void mo2407f(C0240N3 c0240n3, boolean z) {
        int i = this.f4232g;
        this.f4233h = i;
        if (z) {
            if (i == 5) {
                this.f4233h = 1;
            } else if (i == 6) {
                this.f4233h = 0;
            }
        } else if (i == 5) {
            this.f4233h = 0;
        } else if (i == 6) {
            this.f4233h = 1;
        }
        if (c0240n3 instanceof C0381V1) {
            ((C0381V1) c0240n3).f1438g0 = this.f4233h;
        }
    }

    public int getMargin() {
        return this.f4234i.f1440i0;
    }

    public int getType() {
        return this.f4232g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f4234i.f1439h0 = z;
    }

    public void setDpMargin(int i) {
        this.f4234i.f1440i0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f4234i.f1440i0 = i;
    }

    public void setType(int i) {
        this.f4232g = i;
    }
}
