package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class m30 {

    /* JADX INFO: renamed from: a */
    public AbstractC0259gf f3061a = new o10();

    /* JADX INFO: renamed from: b */
    public AbstractC0259gf f3062b = new o10();

    /* JADX INFO: renamed from: c */
    public AbstractC0259gf f3063c = new o10();

    /* JADX INFO: renamed from: d */
    public AbstractC0259gf f3064d = new o10();

    /* JADX INFO: renamed from: e */
    public InterfaceC0184ee f3065e = new C0169e(0.0f);

    /* JADX INFO: renamed from: f */
    public InterfaceC0184ee f3066f = new C0169e(0.0f);

    /* JADX INFO: renamed from: g */
    public InterfaceC0184ee f3067g = new C0169e(0.0f);

    /* JADX INFO: renamed from: h */
    public InterfaceC0184ee f3068h = new C0169e(0.0f);

    /* JADX INFO: renamed from: i */
    public C0893xh f3069i;

    /* JADX INFO: renamed from: j */
    public C0893xh f3070j;

    /* JADX INFO: renamed from: k */
    public C0893xh f3071k;

    /* JADX INFO: renamed from: l */
    public C0893xh f3072l;

    public m30() {
        int i = 0;
        this.f3069i = new C0893xh(i);
        this.f3070j = new C0893xh(i);
        this.f3071k = new C0893xh(i);
        this.f3072l = new C0893xh(i);
    }

    /* JADX INFO: renamed from: a */
    public static l30 m1798a(Context context, int i, int i2, C0169e c0169e) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0168dz.f1459v);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC0184ee interfaceC0184eeM1800c = m1800c(typedArrayObtainStyledAttributes, 5, c0169e);
            InterfaceC0184ee interfaceC0184eeM1800c2 = m1800c(typedArrayObtainStyledAttributes, 8, interfaceC0184eeM1800c);
            InterfaceC0184ee interfaceC0184eeM1800c3 = m1800c(typedArrayObtainStyledAttributes, 9, interfaceC0184eeM1800c);
            InterfaceC0184ee interfaceC0184eeM1800c4 = m1800c(typedArrayObtainStyledAttributes, 7, interfaceC0184eeM1800c);
            InterfaceC0184ee interfaceC0184eeM1800c5 = m1800c(typedArrayObtainStyledAttributes, 6, interfaceC0184eeM1800c);
            l30 l30Var = new l30();
            l30Var.f2904a = AbstractC0387ju.m1621f(i4);
            l30Var.f2908e = interfaceC0184eeM1800c2;
            l30Var.f2905b = AbstractC0387ju.m1621f(i5);
            l30Var.f2909f = interfaceC0184eeM1800c3;
            l30Var.f2906c = AbstractC0387ju.m1621f(i6);
            l30Var.f2910g = interfaceC0184eeM1800c4;
            l30Var.f2907d = AbstractC0387ju.m1621f(i7);
            l30Var.f2911h = interfaceC0184eeM1800c5;
            return l30Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static l30 m1799b(Context context, AttributeSet attributeSet, int i, int i2) {
        C0169e c0169e = new C0169e(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1453p, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m1798a(context, resourceId, resourceId2, c0169e);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0184ee m1800c(TypedArray typedArray, int i, InterfaceC0184ee interfaceC0184ee) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C0169e(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new s00(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0184ee;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1801d(RectF rectF) {
        boolean z = this.f3072l.getClass().equals(C0893xh.class) && this.f3070j.getClass().equals(C0893xh.class) && this.f3069i.getClass().equals(C0893xh.class) && this.f3071k.getClass().equals(C0893xh.class);
        float fMo943a = this.f3065e.mo943a(rectF);
        return z && ((this.f3066f.mo943a(rectF) > fMo943a ? 1 : (this.f3066f.mo943a(rectF) == fMo943a ? 0 : -1)) == 0 && (this.f3068h.mo943a(rectF) > fMo943a ? 1 : (this.f3068h.mo943a(rectF) == fMo943a ? 0 : -1)) == 0 && (this.f3067g.mo943a(rectF) > fMo943a ? 1 : (this.f3067g.mo943a(rectF) == fMo943a ? 0 : -1)) == 0) && ((this.f3062b instanceof o10) && (this.f3061a instanceof o10) && (this.f3063c instanceof o10) && (this.f3064d instanceof o10));
    }

    /* JADX INFO: renamed from: e */
    public final l30 m1802e() {
        l30 l30Var = new l30();
        l30Var.f2904a = this.f3061a;
        l30Var.f2905b = this.f3062b;
        l30Var.f2906c = this.f3063c;
        l30Var.f2907d = this.f3064d;
        l30Var.f2908e = this.f3065e;
        l30Var.f2909f = this.f3066f;
        l30Var.f2910g = this.f3067g;
        l30Var.f2911h = this.f3068h;
        l30Var.f2912i = this.f3069i;
        l30Var.f2913j = this.f3070j;
        l30Var.f2914k = this.f3071k;
        l30Var.f2915l = this.f3072l;
        return l30Var;
    }
}
