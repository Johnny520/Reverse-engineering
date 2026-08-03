package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C1046R;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p000a.C0240N3;
import p000a.C0573f8;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1049c extends View {

    /* JADX INFO: renamed from: a */
    public int[] f4249a;

    /* JADX INFO: renamed from: b */
    public int f4250b;

    /* JADX INFO: renamed from: c */
    public Context f4251c;

    /* JADX INFO: renamed from: d */
    public C0573f8 f4252d;

    /* JADX INFO: renamed from: e */
    public String f4253e;

    /* JADX INFO: renamed from: f */
    public HashMap<Integer, String> f4254f;

    public AbstractC1049c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4249a = new int[32];
        this.f4254f = new HashMap<>();
        this.f4251c = context;
        mo2406e(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2417a(String str) {
        Context context;
        int identifier;
        HashMap<String, Integer> map;
        if (str == null || str.length() == 0 || (context = this.f4251c) == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Integer num = (strTrim == null || (map = constraintLayout.f4155m) == null || !map.containsKey(strTrim)) ? null : constraintLayout.f4155m.get(strTrim);
            if (num instanceof Integer) {
                identifier = num.intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m2420d(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = C1046R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f4254f.put(Integer.valueOf(identifier), strTrim);
            m2418b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2418b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f4250b + 1;
        int[] iArr = this.f4249a;
        if (i2 > iArr.length) {
            this.f4249a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f4249a;
        int i3 = this.f4250b;
        iArr2[i3] = i;
        this.f4250b = i3 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m2419c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f4250b; i++) {
            View view = constraintLayout.f4143a.get(this.f4249a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2420d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f4251c.getResources()) != null) {
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

    /* JADX INFO: renamed from: e */
    public void mo2406e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1046R.styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C1046R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f4253e = string;
                    setIds(string);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo2407f(C0240N3 c0240n3, boolean z) {
    }

    /* JADX INFO: renamed from: g */
    public final void m2421g() {
        if (this.f4252d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C1044a) {
            ((ConstraintLayout.C1044a) layoutParams).f4207l0 = this.f4252d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4249a, this.f4250b);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4253e;
        if (str != null) {
            setIds(str);
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
        this.f4253e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f4250b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m2417a(str.substring(i));
                return;
            } else {
                m2417a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4253e = null;
        this.f4250b = 0;
        for (int i : iArr) {
            m2418b(i);
        }
    }
}
