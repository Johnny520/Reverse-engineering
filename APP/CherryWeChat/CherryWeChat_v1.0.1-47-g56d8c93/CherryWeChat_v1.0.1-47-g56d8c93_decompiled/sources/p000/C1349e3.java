package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: e3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1349e3 {

    /* JADX INFO: renamed from: a */
    public final View f4847a;

    /* JADX INFO: renamed from: d */
    public C2090jB f4850d;

    /* JADX INFO: renamed from: e */
    public C2090jB f4851e;

    /* JADX INFO: renamed from: f */
    public C2090jB f4852f;

    /* JADX INFO: renamed from: c */
    public int f4849c = -1;

    /* JADX INFO: renamed from: b */
    public final C0262G3 f4848b = C0262G3.m539a();

    public C1349e3(View view) {
        this.f4847a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m2600a() {
        View view = this.f4847a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f4850d != null) {
                if (this.f4852f == null) {
                    this.f4852f = new C2090jB();
                }
                C2090jB c2090jB = this.f4852f;
                c2090jB.f7358a = null;
                c2090jB.f7361d = false;
                c2090jB.f7359b = null;
                c2090jB.f7360c = false;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                ColorStateList colorStateListM2631c = AbstractC1360eE.m2631c(view);
                if (colorStateListM2631c != null) {
                    c2090jB.f7361d = true;
                    c2090jB.f7358a = colorStateListM2631c;
                }
                PorterDuff.Mode modeM2632d = AbstractC1360eE.m2632d(view);
                if (modeM2632d != null) {
                    c2090jB.f7360c = true;
                    c2090jB.f7359b = modeM2632d;
                }
                if (c2090jB.f7361d || c2090jB.f7360c) {
                    C0262G3.m542e(background, c2090jB, view.getDrawableState());
                    return;
                }
            }
            C2090jB c2090jB2 = this.f4851e;
            if (c2090jB2 != null) {
                C0262G3.m542e(background, c2090jB2, view.getDrawableState());
                return;
            }
            C2090jB c2090jB3 = this.f4850d;
            if (c2090jB3 != null) {
                C0262G3.m542e(background, c2090jB3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m2601b() {
        C2090jB c2090jB = this.f4851e;
        if (c2090jB != null) {
            return c2090jB.f7358a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m2602c() {
        C2090jB c2090jB = this.f4851e;
        if (c2090jB != null) {
            return c2090jB.f7359b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2603d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM5352f;
        View view = this.f4847a;
        Context context = view.getContext();
        int[] iArr = AbstractC0982Wu.f3091z;
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        View view2 = this.f4847a;
        AbstractC2185lE.m4398k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c2656w4M5186A.f9196b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f4849c = typedArray.getResourceId(0, -1);
                C0262G3 c0262g3 = this.f4848b;
                Context context2 = view.getContext();
                int i2 = this.f4849c;
                synchronized (c0262g3) {
                    colorStateListM5352f = c0262g3.f844a.m5352f(context2, i2);
                }
                if (colorStateListM5352f != null) {
                    m2606g(colorStateListM5352f);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC1360eE.m2637i(view, c2656w4M5186A.m5209p(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC1360eE.m2638j(view, AbstractC0107Ce.m161c(typedArray.getInt(2, -1), null));
            }
            c2656w4M5186A.m5195E();
        } catch (Throwable th) {
            c2656w4M5186A.m5195E();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2604e() {
        this.f4849c = -1;
        m2606g(null);
        m2600a();
    }

    /* JADX INFO: renamed from: f */
    public final void m2605f(int i) {
        ColorStateList colorStateListM5352f;
        this.f4849c = i;
        C0262G3 c0262g3 = this.f4848b;
        if (c0262g3 != null) {
            Context context = this.f4847a.getContext();
            synchronized (c0262g3) {
                colorStateListM5352f = c0262g3.f844a.m5352f(context, i);
            }
        } else {
            colorStateListM5352f = null;
        }
        m2606g(colorStateListM5352f);
        m2600a();
    }

    /* JADX INFO: renamed from: g */
    public final void m2606g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f4850d == null) {
                this.f4850d = new C2090jB();
            }
            C2090jB c2090jB = this.f4850d;
            c2090jB.f7358a = colorStateList;
            c2090jB.f7361d = true;
        } else {
            this.f4850d = null;
        }
        m2600a();
    }

    /* JADX INFO: renamed from: h */
    public final void m2607h(ColorStateList colorStateList) {
        if (this.f4851e == null) {
            this.f4851e = new C2090jB();
        }
        C2090jB c2090jB = this.f4851e;
        c2090jB.f7358a = colorStateList;
        c2090jB.f7361d = true;
        m2600a();
    }

    /* JADX INFO: renamed from: i */
    public final void m2608i(PorterDuff.Mode mode) {
        if (this.f4851e == null) {
            this.f4851e = new C2090jB();
        }
        C2090jB c2090jB = this.f4851e;
        c2090jB.f7359b = mode;
        c2090jB.f7360c = true;
        m2600a();
    }
}
