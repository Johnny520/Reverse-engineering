package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class f30 {

    /* JADX INFO: renamed from: a */
    public AbstractC0346ip f1875a = new h10();

    /* JADX INFO: renamed from: b */
    public AbstractC0346ip f1876b = new h10();

    /* JADX INFO: renamed from: c */
    public AbstractC0346ip f1877c = new h10();

    /* JADX INFO: renamed from: d */
    public AbstractC0346ip f1878d = new h10();

    /* JADX INFO: renamed from: e */
    public InterfaceC0148de f1879e = new C0169e(0.0f);

    /* JADX INFO: renamed from: f */
    public InterfaceC0148de f1880f = new C0169e(0.0f);

    /* JADX INFO: renamed from: g */
    public InterfaceC0148de f1881g = new C0169e(0.0f);

    /* JADX INFO: renamed from: h */
    public InterfaceC0148de f1882h = new C0169e(0.0f);

    /* JADX INFO: renamed from: i */
    public C0819vh f1883i;

    /* JADX INFO: renamed from: j */
    public C0819vh f1884j;

    /* JADX INFO: renamed from: k */
    public C0819vh f1885k;

    /* JADX INFO: renamed from: l */
    public C0819vh f1886l;

    public f30() {
        int i = 0;
        this.f1883i = new C0819vh(i);
        this.f1884j = new C0819vh(i);
        this.f1885k = new C0819vh(i);
        this.f1886l = new C0819vh(i);
    }

    /* JADX INFO: renamed from: a */
    public static e30 m1135a(Context context, int i, int i2, C0169e c0169e) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0873wy.f5063v);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC0148de interfaceC0148deM1137c = m1137c(typedArrayObtainStyledAttributes, 5, c0169e);
            InterfaceC0148de interfaceC0148deM1137c2 = m1137c(typedArrayObtainStyledAttributes, 8, interfaceC0148deM1137c);
            InterfaceC0148de interfaceC0148deM1137c3 = m1137c(typedArrayObtainStyledAttributes, 9, interfaceC0148deM1137c);
            InterfaceC0148de interfaceC0148deM1137c4 = m1137c(typedArrayObtainStyledAttributes, 7, interfaceC0148deM1137c);
            InterfaceC0148de interfaceC0148deM1137c5 = m1137c(typedArrayObtainStyledAttributes, 6, interfaceC0148deM1137c);
            e30 e30Var = new e30();
            e30Var.f1693a = AbstractC0273gt.m1307h(i4);
            e30Var.f1697e = interfaceC0148deM1137c2;
            e30Var.f1694b = AbstractC0273gt.m1307h(i5);
            e30Var.f1698f = interfaceC0148deM1137c3;
            e30Var.f1695c = AbstractC0273gt.m1307h(i6);
            e30Var.f1699g = interfaceC0148deM1137c4;
            e30Var.f1696d = AbstractC0273gt.m1307h(i7);
            e30Var.f1700h = interfaceC0148deM1137c5;
            return e30Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static e30 m1136b(Context context, AttributeSet attributeSet, int i, int i2) {
        C0169e c0169e = new C0169e(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5057p, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m1135a(context, resourceId, resourceId2, c0169e);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0148de m1137c(TypedArray typedArray, int i, InterfaceC0148de interfaceC0148de) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C0169e(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new l00(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0148de;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1138d(RectF rectF) {
        boolean z = this.f1886l.getClass().equals(C0819vh.class) && this.f1884j.getClass().equals(C0819vh.class) && this.f1883i.getClass().equals(C0819vh.class) && this.f1885k.getClass().equals(C0819vh.class);
        float fMo940a = this.f1879e.mo940a(rectF);
        return z && ((this.f1880f.mo940a(rectF) > fMo940a ? 1 : (this.f1880f.mo940a(rectF) == fMo940a ? 0 : -1)) == 0 && (this.f1882h.mo940a(rectF) > fMo940a ? 1 : (this.f1882h.mo940a(rectF) == fMo940a ? 0 : -1)) == 0 && (this.f1881g.mo940a(rectF) > fMo940a ? 1 : (this.f1881g.mo940a(rectF) == fMo940a ? 0 : -1)) == 0) && ((this.f1876b instanceof h10) && (this.f1875a instanceof h10) && (this.f1877c instanceof h10) && (this.f1878d instanceof h10));
    }

    /* JADX INFO: renamed from: e */
    public final e30 m1139e() {
        e30 e30Var = new e30();
        e30Var.f1693a = this.f1875a;
        e30Var.f1694b = this.f1876b;
        e30Var.f1695c = this.f1877c;
        e30Var.f1696d = this.f1878d;
        e30Var.f1697e = this.f1879e;
        e30Var.f1698f = this.f1880f;
        e30Var.f1699g = this.f1881g;
        e30Var.f1700h = this.f1882h;
        e30Var.f1701i = this.f1883i;
        e30Var.f1702j = this.f1884j;
        e30Var.f1703k = this.f1885k;
        e30Var.f1704l = this.f1886l;
        return e30Var;
    }
}
