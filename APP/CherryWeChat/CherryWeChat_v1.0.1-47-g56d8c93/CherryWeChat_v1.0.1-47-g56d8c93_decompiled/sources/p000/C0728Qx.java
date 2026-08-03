package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: renamed from: Qx */
/* JADX INFO: loaded from: classes.dex */
public final class C0728Qx {

    /* JADX INFO: renamed from: a */
    public AbstractC0828TB f2324a = new C0684Pw();

    /* JADX INFO: renamed from: b */
    public AbstractC0828TB f2325b = new C0684Pw();

    /* JADX INFO: renamed from: c */
    public AbstractC0828TB f2326c = new C0684Pw();

    /* JADX INFO: renamed from: d */
    public AbstractC0828TB f2327d = new C0684Pw();

    /* JADX INFO: renamed from: e */
    public InterfaceC1006Xb f2328e = new C2436r(0.0f);

    /* JADX INFO: renamed from: f */
    public InterfaceC1006Xb f2329f = new C2436r(0.0f);

    /* JADX INFO: renamed from: g */
    public InterfaceC1006Xb f2330g = new C2436r(0.0f);

    /* JADX INFO: renamed from: h */
    public InterfaceC1006Xb f2331h = new C2436r(0.0f);

    /* JADX INFO: renamed from: i */
    public C1456gf f2332i;

    /* JADX INFO: renamed from: j */
    public C1456gf f2333j;

    /* JADX INFO: renamed from: k */
    public C1456gf f2334k;

    /* JADX INFO: renamed from: l */
    public C1456gf f2335l;

    public C0728Qx() {
        int i = 0;
        this.f2332i = new C1456gf(i);
        this.f2333j = new C1456gf(i);
        this.f2334k = new C1456gf(i);
        this.f2335l = new C1456gf(i);
    }

    /* JADX INFO: renamed from: a */
    public static C0685Px m1511a(Context context, int i, int i2, C2436r c2436r) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0939Vu.f2956y);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC1006Xb interfaceC1006XbM1513c = m1513c(typedArrayObtainStyledAttributes, 5, c2436r);
            InterfaceC1006Xb interfaceC1006XbM1513c2 = m1513c(typedArrayObtainStyledAttributes, 8, interfaceC1006XbM1513c);
            InterfaceC1006Xb interfaceC1006XbM1513c3 = m1513c(typedArrayObtainStyledAttributes, 9, interfaceC1006XbM1513c);
            InterfaceC1006Xb interfaceC1006XbM1513c4 = m1513c(typedArrayObtainStyledAttributes, 7, interfaceC1006XbM1513c);
            InterfaceC1006Xb interfaceC1006XbM1513c5 = m1513c(typedArrayObtainStyledAttributes, 6, interfaceC1006XbM1513c);
            C0685Px c0685Px = new C0685Px();
            c0685Px.f2192a = AbstractC1406fG.m2687L(i4);
            c0685Px.f2196e = interfaceC1006XbM1513c2;
            c0685Px.f2193b = AbstractC1406fG.m2687L(i5);
            c0685Px.f2197f = interfaceC1006XbM1513c3;
            c0685Px.f2194c = AbstractC1406fG.m2687L(i6);
            c0685Px.f2198g = interfaceC1006XbM1513c4;
            c0685Px.f2195d = AbstractC1406fG.m2687L(i7);
            c0685Px.f2199h = interfaceC1006XbM1513c5;
            return c0685Px;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0685Px m1512b(Context context, AttributeSet attributeSet, int i, int i2) {
        C2436r c2436r = new C2436r(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2949r, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m1511a(context, resourceId, resourceId2, c2436r);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC1006Xb m1513c(TypedArray typedArray, int i, InterfaceC1006Xb interfaceC1006Xb) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new C2436r(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new C0768Rv(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC1006Xb;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1514d() {
        return (this.f2325b instanceof C0684Pw) && (this.f2324a instanceof C0684Pw) && (this.f2326c instanceof C0684Pw) && (this.f2327d instanceof C0684Pw);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1515e(RectF rectF) {
        boolean z = this.f2335l.getClass().equals(C1456gf.class) && this.f2333j.getClass().equals(C1456gf.class) && this.f2332i.getClass().equals(C1456gf.class) && this.f2334k.getClass().equals(C1456gf.class);
        float fMo1563a = this.f2328e.mo1563a(rectF);
        return z && ((this.f2329f.mo1563a(rectF) > fMo1563a ? 1 : (this.f2329f.mo1563a(rectF) == fMo1563a ? 0 : -1)) == 0 && (this.f2331h.mo1563a(rectF) > fMo1563a ? 1 : (this.f2331h.mo1563a(rectF) == fMo1563a ? 0 : -1)) == 0 && (this.f2330g.mo1563a(rectF) > fMo1563a ? 1 : (this.f2330g.mo1563a(rectF) == fMo1563a ? 0 : -1)) == 0) && m1514d();
    }

    /* JADX INFO: renamed from: f */
    public final C0685Px m1516f() {
        C0685Px c0685Px = new C0685Px();
        c0685Px.f2192a = this.f2324a;
        c0685Px.f2193b = this.f2325b;
        c0685Px.f2194c = this.f2326c;
        c0685Px.f2195d = this.f2327d;
        c0685Px.f2196e = this.f2328e;
        c0685Px.f2197f = this.f2329f;
        c0685Px.f2198g = this.f2330g;
        c0685Px.f2199h = this.f2331h;
        c0685Px.f2200i = this.f2332i;
        c0685Px.f2201j = this.f2333j;
        c0685Px.f2202k = this.f2334k;
        c0685Px.f2203l = this.f2335l;
        return c0685Px;
    }

    public final String toString() {
        return "[" + this.f2328e + ", " + this.f2329f + ", " + this.f2330g + ", " + this.f2331h + "]";
    }
}
