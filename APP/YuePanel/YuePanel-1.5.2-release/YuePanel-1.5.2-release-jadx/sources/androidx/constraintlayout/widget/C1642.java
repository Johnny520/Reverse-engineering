package androidx.constraintlayout.widget;

import Yue.C3507;
import Yue.C4128;
import Yue.C4129;
import Yue.C5281;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C8770;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ */
/* JADX INFO: loaded from: classes.dex */
public class C1642 extends AbstractC8767 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f26599 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f26600 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f26601 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f26602 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f26603 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f26604 = 6;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f26605;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f26606;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C3507 f26607;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1642(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public int getMargin() {
        return this.f26607.m9348();
    }

    public int getType() {
        return this.f26605;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f26607.m9351(z);
    }

    public void setDpMargin(int i) {
        this.f26607.m9353((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f26607.m9353(i);
    }

    public void setType(int i) {
        this.f26605 = i;
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo17579(AttributeSet attributeSet) {
        super.mo17579(attributeSet);
        this.f26607 = new C3507();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f28715);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f28731) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C8778.C8789.f28730) {
                    this.f26607.m9351(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == C8778.C8789.f28732) {
                    this.f26607.m9353(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f26625 = this.f26607;
        m29296();
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo29254(C8770.C1646 c1646, C5281 c5281, ConstraintLayout.C1641 c1641, SparseArray<C4128> sparseArray) {
        super.mo29254(c1646, c5281, c1641, sparseArray);
        if (c5281 instanceof C3507) {
            C3507 c3507 = (C3507) c5281;
            m29266(c3507, c1646.f26774.f26881, ((C4129) c5281.m11876()).m11998());
            c3507.m9351(c1646.f26774.f26889);
            c3507.m9353(c1646.f26774.f26882);
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC8767
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo29255(C4128 c4128, boolean z) {
        m29266(c4128, this.f26605, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m29265() {
        return this.f26607.m9346();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m29266(C4128 c4128, int i, boolean z) {
        this.f26606 = i;
        if (z) {
            int i2 = this.f26605;
            if (i2 == 5) {
                this.f26606 = 1;
            } else if (i2 == 6) {
                this.f26606 = 0;
            }
        } else {
            int i3 = this.f26605;
            if (i3 == 5) {
                this.f26606 = 0;
            } else if (i3 == 6) {
                this.f26606 = 1;
            }
        }
        if (c4128 instanceof C3507) {
            ((C3507) c4128).m9352(this.f26606);
        }
    }

    public C1642(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C1642(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
