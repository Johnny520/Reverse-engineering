package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: renamed from: a3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0004a3 {

    /* JADX INFO: renamed from: a */
    public Parcelable f13a;

    /* JADX INFO: renamed from: b */
    public Object f14b;

    /* JADX INFO: renamed from: c */
    public boolean f15c;

    /* JADX INFO: renamed from: d */
    public boolean f16d;

    /* JADX INFO: renamed from: e */
    public boolean f17e;

    /* JADX INFO: renamed from: f */
    public final Object f18f;

    public /* synthetic */ C0004a3(TextView textView) {
        this.f13a = null;
        this.f14b = null;
        this.f15c = false;
        this.f16d = false;
        this.f18f = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m18a() {
        CompoundButton compoundButton = (CompoundButton) this.f18f;
        Drawable drawableM1222a = AbstractC0256gc.m1222a(compoundButton);
        if (drawableM1222a != null) {
            if (this.f15c || this.f16d) {
                Drawable drawableMutate = drawableM1222a.mutate();
                if (this.f15c) {
                    AbstractC0187eh.m995h(drawableMutate, (ColorStateList) this.f13a);
                }
                if (this.f16d) {
                    AbstractC0187eh.m996i(drawableMutate, (PorterDuff.Mode) this.f14b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19b() {
        C0952z2 c0952z2 = (C0952z2) this.f18f;
        Drawable checkMarkDrawable = c0952z2.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f15c || this.f16d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f15c) {
                    AbstractC0187eh.m995h(drawableMutate, (ColorStateList) this.f13a);
                }
                if (this.f16d) {
                    AbstractC0187eh.m996i(drawableMutate, (PorterDuff.Mode) this.f14b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0952z2.getDrawableState());
                }
                c0952z2.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Bundle m20c(String str) {
        if (!this.f16d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f13a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f13a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f13a;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f13a = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: d */
    public void m21d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f18f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0205ez.f1689m;
        C0658r5 c0658r5M2226y = C0658r5.m2226y(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
        oa0.m2011k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0658r5M2226y.f4064b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0259gf.m1261w(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC0259gf.m1261w(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0259gf.m1261w(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0219fc.m1092c(compoundButton, c0658r5M2226y.m2240l(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0219fc.m1093d(compoundButton, AbstractC0261gh.m1276b(typedArray.getInt(3, -1), null));
            }
            c0658r5M2226y.m2252z();
        } catch (Throwable th) {
            c0658r5M2226y.m2252z();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m22e(String str, a20 a20Var) {
        Object obj;
        v10 v10Var = (v10) this.f18f;
        s10 s10VarMo2531a = v10Var.mo2531a(str);
        if (s10VarMo2531a != null) {
            obj = s10VarMo2531a.f4188b;
        } else {
            s10 s10Var = new s10(str, a20Var);
            v10Var.f4875d++;
            s10 s10Var2 = v10Var.f4873b;
            if (s10Var2 == null) {
                v10Var.f4872a = s10Var;
                v10Var.f4873b = s10Var;
            } else {
                s10Var2.f4189c = s10Var;
                s10Var.f4190d = s10Var2;
                v10Var.f4873b = s10Var;
            }
            obj = null;
        }
        if (((a20) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public C0004a3() {
        this.f18f = new v10();
        this.f17e = true;
    }
}
