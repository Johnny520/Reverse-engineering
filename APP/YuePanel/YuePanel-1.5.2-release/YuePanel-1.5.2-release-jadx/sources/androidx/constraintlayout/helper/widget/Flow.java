package androidx.constraintlayout.helper.widget;

import Yue.C4128;
import Yue.C4889;
import Yue.C5281;
import Yue.C8387;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC8791;
import androidx.constraintlayout.widget.C8770;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC8791 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String f26442 = "Flow";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f26443 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f26444 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f26445 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f26446 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f26447 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f26448 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f26449 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f26450 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f26451 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f26452 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f26453 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f26454 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f26455 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int f26456 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int f26457 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C4889 f26458;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo29256(this.f26458, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f26458.m15119(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f26458.m15120(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f26458.m15121(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f26458.m15122(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f26458.m15123(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f26458.m15124(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f26458.m15125(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f26458.m15126(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f26458.m15131(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f26458.m15132(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f26458.m27973(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f26458.m27974(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f26458.m27976(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f26458.m27977(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f26458.m27979(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f26458.m15133(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f26458.m15134(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f26458.m15135(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f26458.m15136(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f26458.m15137(i);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.AbstractC8791, androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo17579(AttributeSet attributeSet) {
        super.mo17579(attributeSet);
        this.f26458 = new C4889();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f28715);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f28716) {
                    this.f26458.m15132(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C8778.C8789.f28717) {
                    this.f26458.m27973(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C8778.C8789.f28727) {
                    this.f26458.m27978(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C8778.C8789.f28728) {
                    this.f26458.m27975(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C8778.C8789.f28718) {
                    this.f26458.m27976(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C8778.C8789.f28719) {
                    this.f26458.m27979(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C8778.C8789.f28720) {
                    this.f26458.m27977(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C8778.C8789.f28721) {
                    this.f26458.m27974(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C8778.C8789.f28754) {
                    this.f26458.m15137(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C8778.C8789.f28744) {
                    this.f26458.m15126(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C8778.C8789.f28753) {
                    this.f26458.m15136(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C8778.C8789.f28738) {
                    this.f26458.m15120(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C8778.C8789.f28746) {
                    this.f26458.m15128(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C8778.C8789.f28740) {
                    this.f26458.m15122(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C8778.C8789.f28748) {
                    this.f26458.m15130(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C8778.C8789.f28742) {
                    this.f26458.m15124(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C8778.C8789.f28737) {
                    this.f26458.m15119(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C8778.C8789.f28745) {
                    this.f26458.m15127(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C8778.C8789.f28739) {
                    this.f26458.m15121(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C8778.C8789.f28747) {
                    this.f26458.m15129(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C8778.C8789.f28751) {
                    this.f26458.m15134(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C8778.C8789.f28741) {
                    this.f26458.m15123(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C8778.C8789.f28750) {
                    this.f26458.m15133(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C8778.C8789.f28743) {
                    this.f26458.m15125(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C8778.C8789.f28752) {
                    this.f26458.m15135(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C8778.C8789.f28749) {
                    this.f26458.m15131(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f26625 = this.f26458;
        m29296();
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void mo29254(C8770.C1646 c1646, C5281 c5281, ConstraintLayout.C1641 c1641, SparseArray<C4128> sparseArray) {
        super.mo29254(c1646, c5281, c1641, sparseArray);
        if (c5281 instanceof C4889) {
            C4889 c4889 = (C4889) c5281;
            int i = c1641.f26519;
            if (i != -1) {
                c4889.m15132(i);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void mo29255(C4128 c4128, boolean z) {
        this.f26458.m27960(z);
    }

    @Override // androidx.constraintlayout.widget.AbstractC8791
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void mo29256(C8387 c8387, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c8387 == null) {
            setMeasuredDimension(0, 0);
        } else {
            c8387.mo15112(mode, size, mode2, size2);
            setMeasuredDimension(c8387.m27963(), c8387.m27962());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
