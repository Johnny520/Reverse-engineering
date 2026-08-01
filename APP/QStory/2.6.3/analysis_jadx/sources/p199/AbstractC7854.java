package p199;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p203.AbstractC7886;
import p203.C7879;

/* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7854 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f21482;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public AbstractC7886 f21483;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f21484;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public HashMap f21485;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f21486;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Context f21487;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f21488;

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f21488, this.f21486);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f21482;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f21484;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f21482 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f21486 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m13208(str.substring(i));
                return;
            } else {
                m13208(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f21484 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f21486 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m13206(str.substring(i));
                return;
            } else {
                m13206(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f21482 = null;
        this.f21486 = 0;
        for (int i : iArr) {
            m13207(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f21482 == null) {
            m13207(i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m13203(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f21487.getResources()) != null) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13205(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f21486; i++) {
            View view = (View) constraintLayout.f6396.get(this.f21488[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13206(String str) {
        if (str.length() == 0 || this.f21487 == null) {
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
            if ((layoutParams instanceof C7851) && strTrim.equals(((C7851) layoutParams).f21478)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m13207(childAt.getId());
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13207(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f21486 + 1;
        int[] iArr = this.f21488;
        if (i2 > iArr.length) {
            this.f21488 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f21488;
        int i3 = this.f21486;
        iArr2[i3] = i;
        this.f21486 = i3 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13208(java.lang.String r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.f21487
            int r1 = r6.length()
            if (r1 != 0) goto La
            goto L96
        La:
            if (r0 != 0) goto Le
            goto L96
        Le:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L22
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L23
        L22:
            r1 = r2
        L23:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L4a
            if (r6 == 0) goto L3e
            java.util.HashMap r3 = r1.f6384
            if (r3 == 0) goto L3e
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L3e
            java.util.HashMap r3 = r1.f6384
            java.lang.Object r3 = r3.get(r6)
            goto L3f
        L3e:
            r3 = r2
        L3f:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L4a
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L4b
        L4a:
            r3 = 0
        L4b:
            if (r3 != 0) goto L53
            if (r1 == 0) goto L53
            int r3 = r5.m13203(r1, r6)
        L53:
            if (r3 != 0) goto L5f
            java.lang.Class<飘花落叶言子苏兰世楪哲.飘花落叶言子楪哲兰世苏> r1 = p199.AbstractC7861.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L5f
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L5f
        L5f:
            if (r3 != 0) goto L6f
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L6f:
            if (r3 == 0) goto L7e
            java.util.HashMap r0 = r5.f21485
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.m13207(r3)
            goto L96
        L7e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find id of \""
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = "\""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ConstraintHelper"
            android.util.Log.w(r6, r5)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p199.AbstractC7854.m13208(java.lang.String):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract void mo3921(C7879 c7879, boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo13209(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC7862.f21523);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f21482 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f21484 = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13210() {
        if (this.f21483 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C7851) {
            ((C7851) layoutParams).f21467 = this.f21483;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo13204(ConstraintLayout constraintLayout) {
    }
}
