package p089x0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p056f0.AbstractC0805P;
import p058g0.AbstractC0942a;

/* JADX INFO: renamed from: x0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1127k {

    /* JADX INFO: renamed from: a */
    public AbstractC0805P f4347a = new C1125i();

    /* JADX INFO: renamed from: b */
    public AbstractC0805P f4348b = new C1125i();

    /* JADX INFO: renamed from: c */
    public AbstractC0805P f4349c = new C1125i();

    /* JADX INFO: renamed from: d */
    public AbstractC0805P f4350d = new C1125i();

    /* JADX INFO: renamed from: e */
    public InterfaceC1119c f4351e = new C1117a(0.0f);

    /* JADX INFO: renamed from: f */
    public InterfaceC1119c f4352f = new C1117a(0.0f);

    /* JADX INFO: renamed from: g */
    public InterfaceC1119c f4353g = new C1117a(0.0f);

    /* JADX INFO: renamed from: h */
    public InterfaceC1119c f4354h = new C1117a(0.0f);

    /* JADX INFO: renamed from: i */
    public C1121e f4355i = new C1121e(0);

    /* JADX INFO: renamed from: j */
    public C1121e f4356j = new C1121e(0);

    /* JADX INFO: renamed from: k */
    public C1121e f4357k = new C1121e(0);

    /* JADX INFO: renamed from: l */
    public C1121e f4358l = new C1121e(0);

    /* JADX INFO: renamed from: a */
    public static C1126j m2657a(Context context, AttributeSet attributeSet, int i2, int i3) {
        C1117a c1117a = new C1117a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3339k, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, resourceId2);
        }
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(AbstractC0942a.f3344p);
        try {
            int i4 = typedArrayObtainStyledAttributes2.getInt(0, 0);
            int i5 = typedArrayObtainStyledAttributes2.getInt(3, i4);
            int i6 = typedArrayObtainStyledAttributes2.getInt(4, i4);
            int i7 = typedArrayObtainStyledAttributes2.getInt(2, i4);
            int i8 = typedArrayObtainStyledAttributes2.getInt(1, i4);
            InterfaceC1119c interfaceC1119cM2658b = m2658b(typedArrayObtainStyledAttributes2, 5, c1117a);
            InterfaceC1119c interfaceC1119cM2658b2 = m2658b(typedArrayObtainStyledAttributes2, 8, interfaceC1119cM2658b);
            InterfaceC1119c interfaceC1119cM2658b3 = m2658b(typedArrayObtainStyledAttributes2, 9, interfaceC1119cM2658b);
            InterfaceC1119c interfaceC1119cM2658b4 = m2658b(typedArrayObtainStyledAttributes2, 7, interfaceC1119cM2658b);
            InterfaceC1119c interfaceC1119cM2658b5 = m2658b(typedArrayObtainStyledAttributes2, 6, interfaceC1119cM2658b);
            C1126j c1126j = new C1126j();
            AbstractC0805P abstractC0805PM2046i = AbstractC0805P.m2046i(i5);
            c1126j.f4335a = abstractC0805PM2046i;
            C1126j.m2655b(abstractC0805PM2046i);
            c1126j.f4339e = interfaceC1119cM2658b2;
            AbstractC0805P abstractC0805PM2046i2 = AbstractC0805P.m2046i(i6);
            c1126j.f4336b = abstractC0805PM2046i2;
            C1126j.m2655b(abstractC0805PM2046i2);
            c1126j.f4340f = interfaceC1119cM2658b3;
            AbstractC0805P abstractC0805PM2046i3 = AbstractC0805P.m2046i(i7);
            c1126j.f4337c = abstractC0805PM2046i3;
            C1126j.m2655b(abstractC0805PM2046i3);
            c1126j.f4341g = interfaceC1119cM2658b4;
            AbstractC0805P abstractC0805PM2046i4 = AbstractC0805P.m2046i(i8);
            c1126j.f4338d = abstractC0805PM2046i4;
            C1126j.m2655b(abstractC0805PM2046i4);
            c1126j.f4342h = interfaceC1119cM2658b5;
            return c1126j;
        } finally {
            typedArrayObtainStyledAttributes2.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1119c m2658b(TypedArray typedArray, int i2, InterfaceC1119c interfaceC1119c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue == null) {
            return interfaceC1119c;
        }
        int i3 = typedValuePeekValue.type;
        return i3 == 5 ? new C1117a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new C1124h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC1119c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2659c(RectF rectF) {
        boolean z2 = this.f4358l.getClass().equals(C1121e.class) && this.f4356j.getClass().equals(C1121e.class) && this.f4355i.getClass().equals(C1121e.class) && this.f4357k.getClass().equals(C1121e.class);
        float fMo2634a = this.f4351e.mo2634a(rectF);
        return z2 && ((this.f4352f.mo2634a(rectF) > fMo2634a ? 1 : (this.f4352f.mo2634a(rectF) == fMo2634a ? 0 : -1)) == 0 && (this.f4354h.mo2634a(rectF) > fMo2634a ? 1 : (this.f4354h.mo2634a(rectF) == fMo2634a ? 0 : -1)) == 0 && (this.f4353g.mo2634a(rectF) > fMo2634a ? 1 : (this.f4353g.mo2634a(rectF) == fMo2634a ? 0 : -1)) == 0) && ((this.f4348b instanceof C1125i) && (this.f4347a instanceof C1125i) && (this.f4349c instanceof C1125i) && (this.f4350d instanceof C1125i));
    }

    /* JADX INFO: renamed from: d */
    public final C1126j m2660d() {
        C1126j c1126j = new C1126j();
        c1126j.f4335a = this.f4347a;
        c1126j.f4336b = this.f4348b;
        c1126j.f4337c = this.f4349c;
        c1126j.f4338d = this.f4350d;
        c1126j.f4339e = this.f4351e;
        c1126j.f4340f = this.f4352f;
        c1126j.f4341g = this.f4353g;
        c1126j.f4342h = this.f4354h;
        c1126j.f4343i = this.f4355i;
        c1126j.f4344j = this.f4356j;
        c1126j.f4345k = this.f4357k;
        c1126j.f4346l = this.f4358l;
        return c1126j;
    }
}
