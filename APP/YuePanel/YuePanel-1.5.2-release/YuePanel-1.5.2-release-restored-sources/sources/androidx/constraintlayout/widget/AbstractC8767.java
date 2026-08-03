package androidx.constraintlayout.widget;

import Yue.C4128;
import Yue.C4129;
import Yue.C5281;
import Yue.InterfaceC5278;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C8770;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8767 extends View {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int[] f26622;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f26623;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Context f26624;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public InterfaceC5278 f26625;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f26626;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public String f26627;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public String f26628;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public View[] f26629;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public HashMap<Integer, String> f26630;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC8767(Context context) {
        super(context);
        this.f26622 = new int[32];
        this.f26626 = false;
        this.f26629 = null;
        this.f26630 = new HashMap<>();
        this.f26624 = context;
        mo17579(null);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f26622, this.f26623);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f26627;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f26628;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f26626) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f26627 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f26623 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m29281(str.substring(i));
                return;
            } else {
                m29281(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f26628 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f26623 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m29283(str.substring(i));
                return;
            } else {
                m29283(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f26627 = null;
        this.f26623 = 0;
        for (int i : iArr) {
            m29282(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f26627 == null) {
            m29282(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m29281(String str) {
        if (str == null || str.length() == 0 || this.f26624 == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iM29289 = m29289(strTrim);
        if (iM29289 != 0) {
            this.f26630.put(Integer.valueOf(iM29289), strTrim);
            m29282(iM29289);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m29282(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f26623 + 1;
        int[] iArr = this.f26622;
        if (i2 > iArr.length) {
            this.f26622 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f26622;
        int i3 = this.f26623;
        iArr2[i3] = i;
        this.f26623 = i3 + 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m29283(String str) {
        if (str == null || str.length() == 0 || this.f26624 == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C1641) && strTrim.equals(((ConstraintLayout.C1641) layoutParams).f26522)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m29282(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m29284(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f26627 = null;
            m29282(view.getId());
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m29285() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m29286((ConstraintLayout) parent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m29286(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f26623; i++) {
            View viewById = constraintLayout.getViewById(this.f26622[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int[] m29287(View view, String str) {
        String[] strArrSplit = str.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        for (String str2 : strArrSplit) {
            int iM29289 = m29289(str2.trim());
            if (iM29289 != 0) {
                iArr[i] = iM29289;
                i++;
            }
        }
        return i != strArrSplit.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int m29288(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f26624.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m29289(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iM29288 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iM29288 = ((Integer) designInformation).intValue();
            }
        }
        if (iM29288 == 0 && constraintLayout != null) {
            iM29288 = m29288(constraintLayout, str);
        }
        if (iM29288 == 0) {
            try {
                iM29288 = C8778.C8783.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iM29288 == 0 ? this.f26624.getResources().getIdentifier(str, Name.MARK, this.f26624.getPackageName()) : iM29288;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public View[] m29290(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f26629;
        if (viewArr == null || viewArr.length != this.f26623) {
            this.f26629 = new View[this.f26623];
        }
        for (int i = 0; i < this.f26623; i++) {
            this.f26629[i] = constraintLayout.getViewById(this.f26622[i]);
        }
        return this.f26629;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo17579(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8778.C8789.f28715);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f28735) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f26627 = string;
                    setIds(string);
                } else if (index == C8778.C8789.f28736) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f26628 = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo29254(C8770.C1646 c1646, C5281 c5281, ConstraintLayout.C1641 c1641, SparseArray<C4128> sparseArray) {
        C8770.C1647 c1647 = c1646.f26774;
        int[] iArr = c1647.f26884;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = c1647.f26885;
            if (str != null && str.length() > 0) {
                C8770.C1647 c16472 = c1646.f26774;
                c16472.f26884 = m29287(this, c16472.f26885);
            }
        }
        c5281.mo2054();
        if (c1646.f26774.f26884 == null) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = c1646.f26774.f26884;
            if (i >= iArr2.length) {
                return;
            }
            C4128 c4128 = sparseArray.get(iArr2[i]);
            if (c4128 != null) {
                c5281.mo2055(c4128);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m29291(View view) {
        int i;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.f26627 = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f26623) {
                break;
            }
            if (this.f26622[i2] == id) {
                while (true) {
                    i = this.f26623;
                    if (i2 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.f26622;
                    int i3 = i2 + 1;
                    iArr[i2] = iArr[i3];
                    i2 = i3;
                }
                this.f26622[i - 1] = 0;
                this.f26623 = i - 1;
            } else {
                i2++;
            }
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo29255(C4128 c4128, boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m29292(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo17580(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m29293(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo17581(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m29294(C4129 c4129, InterfaceC5278 interfaceC5278, SparseArray<C4128> sparseArray) {
        interfaceC5278.mo2054();
        for (int i = 0; i < this.f26623; i++) {
            interfaceC5278.mo2055(sparseArray.get(this.f26622[i]));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m29295(ConstraintLayout constraintLayout) {
        String str;
        int iM29288;
        if (isInEditMode()) {
            setIds(this.f26627);
        }
        InterfaceC5278 interfaceC5278 = this.f26625;
        if (interfaceC5278 == null) {
            return;
        }
        interfaceC5278.mo2054();
        for (int i = 0; i < this.f26623; i++) {
            int i2 = this.f26622[i];
            View viewById = constraintLayout.getViewById(i2);
            if (viewById == null && (iM29288 = m29288(constraintLayout, (str = this.f26630.get(Integer.valueOf(i2))))) != 0) {
                this.f26622[i] = iM29288;
                this.f26630.put(Integer.valueOf(iM29288), str);
                viewById = constraintLayout.getViewById(iM29288);
            }
            if (viewById != null) {
                this.f26625.mo2055(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f26625.mo16177(constraintLayout.mLayoutWidget);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m29296() {
        if (this.f26625 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C1641) {
            ((ConstraintLayout.C1641) layoutParams).f26540 = (C4128) this.f26625;
        }
    }

    public AbstractC8767(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26622 = new int[32];
        this.f26626 = false;
        this.f26629 = null;
        this.f26630 = new HashMap<>();
        this.f26624 = context;
        mo17579(attributeSet);
    }

    public AbstractC8767(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26622 = new int[32];
        this.f26626 = false;
        this.f26629 = null;
        this.f26630 = new HashMap<>();
        this.f26624 = context;
        mo17579(attributeSet);
    }
}
