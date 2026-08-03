package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: eb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1364eb extends View {

    /* JADX INFO: renamed from: a */
    public int[] f4872a;

    /* JADX INFO: renamed from: b */
    public int f4873b;

    /* JADX INFO: renamed from: c */
    public Context f4874c;

    /* JADX INFO: renamed from: d */
    public AbstractC2592uk f4875d;

    /* JADX INFO: renamed from: e */
    public String f4876e;

    /* JADX INFO: renamed from: f */
    public String f4877f;

    /* JADX INFO: renamed from: g */
    public HashMap f4878g;

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2649a(String str) {
        int identifier;
        HashMap map;
        Context context = this.f4874c;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = (strTrim == null || (map = constraintLayout.f3883m) == null || !map.containsKey(strTrim)) ? null : constraintLayout.f3883m.get(strTrim);
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m2653f(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC0553Mu.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f4878g.put(Integer.valueOf(identifier), strTrim);
            m2650b(identifier);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2650b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f4873b + 1;
        int[] iArr = this.f4872a;
        if (i2 > iArr.length) {
            this.f4872a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f4872a;
        int i3 = this.f4873b;
        iArr2[i3] = i;
        this.f4873b = i3 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m2651c(String str) {
        if (str == null || str.length() == 0 || this.f4874c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1452gb) && strTrim.equals(((C1452gb) layoutParams).f5104Y) && childAt.getId() != -1) {
                m2650b(childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2652d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f4873b; i++) {
            View view = (View) constraintLayout.f3871a.get(this.f4872a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo1834e(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: renamed from: f */
    public final int m2653f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f4874c.getResources()) != null) {
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
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void mo1835g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0639Ou.f2035b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f4876e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f4877f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4872a, this.f4873b);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo2120h(C2454rb c2454rb, boolean z);

    /* JADX INFO: renamed from: i */
    public final void m2654i() {
        if (this.f4875d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1452gb) {
            ((C1452gb) layoutParams).f5137p0 = this.f4875d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4876e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f4877f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f4876e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f4873b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m2649a(str.substring(i));
                return;
            } else {
                m2649a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f4877f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f4873b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m2651c(str.substring(i));
                return;
            } else {
                m2651c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4876e = null;
        this.f4873b = 0;
        for (int i : iArr) {
            m2650b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f4876e == null) {
            m2650b(i);
        }
    }
}
