package p075p;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p071n.AbstractC1004i;
import p071n.C0999d;

/* JADX INFO: renamed from: p.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1037c extends View {

    /* JADX INFO: renamed from: a */
    public int[] f3870a;

    /* JADX INFO: renamed from: b */
    public int f3871b;

    /* JADX INFO: renamed from: c */
    public Context f3872c;

    /* JADX INFO: renamed from: d */
    public AbstractC1004i f3873d;

    /* JADX INFO: renamed from: e */
    public String f3874e;

    /* JADX INFO: renamed from: f */
    public HashMap f3875f;

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2513a(String str) {
        Context context;
        int identifier;
        HashMap map;
        if (str == null || str.length() == 0 || (context = this.f3872c) == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = ((strTrim instanceof String) && (map = constraintLayout.f1270m) != null && map.containsKey(strTrim)) ? constraintLayout.f1270m.get(strTrim) : null;
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m2516d(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC1051q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f3875f.put(Integer.valueOf(identifier), strTrim);
            m2514b(identifier);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2514b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f3871b + 1;
        int[] iArr = this.f3870a;
        if (i3 > iArr.length) {
            this.f3870a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3870a;
        int i4 = this.f3871b;
        iArr2[i4] = i2;
        this.f3871b = i4 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m2515c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f3871b; i2++) {
            View view = (View) constraintLayout.f1258a.get(this.f3870a[i2]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2516d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f3872c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
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

    /* JADX INFO: renamed from: e */
    public void mo1155e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1052r.f4051b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f3874e = string;
                    setIds(string);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1156f(C0999d c0999d, boolean z2);

    /* JADX INFO: renamed from: g */
    public final void m2517g() {
        if (this.f3873d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1039e) {
            ((C1039e) layoutParams).f3924k0 = this.f3873d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3870a, this.f3871b);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3874e;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f3874e = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f3871b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                m2513a(str.substring(i2));
                return;
            } else {
                m2513a(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3874e = null;
        this.f3871b = 0;
        for (int i2 : iArr) {
            m2514b(i2);
        }
    }
}
