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
    public Parcelable f16a;

    /* JADX INFO: renamed from: b */
    public Object f17b;

    /* JADX INFO: renamed from: c */
    public boolean f18c;

    /* JADX INFO: renamed from: d */
    public boolean f19d;

    /* JADX INFO: renamed from: e */
    public boolean f20e;

    /* JADX INFO: renamed from: f */
    public final Object f21f;

    public /* synthetic */ C0004a3(TextView textView) {
        this.f16a = null;
        this.f17b = null;
        this.f18c = false;
        this.f19d = false;
        this.f21f = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m5a() {
        CompoundButton compoundButton = (CompoundButton) this.f21f;
        Drawable drawableM2619a = AbstractC0887xb.m2619a(compoundButton);
        if (drawableM2619a != null) {
            if (this.f18c || this.f19d) {
                Drawable drawableMutate = drawableM2619a.mutate();
                if (this.f18c) {
                    AbstractC0104ch.m688h(drawableMutate, (ColorStateList) this.f16a);
                }
                if (this.f19d) {
                    AbstractC0104ch.m689i(drawableMutate, (PorterDuff.Mode) this.f17b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m6b() {
        C0952z2 c0952z2 = (C0952z2) this.f21f;
        Drawable checkMarkDrawable = c0952z2.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f18c || this.f19d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f18c) {
                    AbstractC0104ch.m688h(drawableMutate, (ColorStateList) this.f16a);
                }
                if (this.f19d) {
                    AbstractC0104ch.m689i(drawableMutate, (PorterDuff.Mode) this.f17b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0952z2.getDrawableState());
                }
                c0952z2.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public Bundle m7c(String str) {
        if (!this.f19d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f16a;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f16a;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f16a;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f16a = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: d */
    public void m8d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f21f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0910xy.f5229m;
        C0659r5 c0659r5M2219y = C0659r5.m2219y(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
        ja0.m1574k(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0659r5M2219y.f4209b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0222ff.m1196r(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC0222ff.m1196r(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0222ff.m1196r(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0850wb.m2560c(compoundButton, c0659r5M2219y.m2233l(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0850wb.m2561d(compoundButton, AbstractC0187eh.m1028b(typedArray.getInt(3, -1), null));
            }
            c0659r5M2219y.m2245z();
        } catch (Throwable th) {
            c0659r5M2219y.m2245z();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m9e(String str, t10 t10Var) {
        Object obj;
        o10 o10Var = (o10) this.f21f;
        l10 l10VarMo1983a = o10Var.mo1983a(str);
        if (l10VarMo1983a != null) {
            obj = l10VarMo1983a.f2989b;
        } else {
            l10 l10Var = new l10(str, t10Var);
            o10Var.f3474d++;
            l10 l10Var2 = o10Var.f3472b;
            if (l10Var2 == null) {
                o10Var.f3471a = l10Var;
                o10Var.f3472b = l10Var;
            } else {
                l10Var2.f2990c = l10Var;
                l10Var.f2991d = l10Var2;
                o10Var.f3472b = l10Var;
            }
            obj = null;
        }
        if (((t10) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public C0004a3() {
        this.f21f = new o10();
        this.f20e = true;
    }
}
