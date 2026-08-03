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
    public AbstractC0805P f4347a;

    /* JADX INFO: renamed from: b */
    public AbstractC0805P f4348b;

    /* JADX INFO: renamed from: c */
    public AbstractC0805P f4349c;

    /* JADX INFO: renamed from: d */
    public AbstractC0805P f4350d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1119c f4351e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1119c f4352f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1119c f4353g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1119c f4354h;

    /* JADX INFO: renamed from: i */
    public C1121e f4355i;

    /* JADX INFO: renamed from: j */
    public C1121e f4356j;

    /* JADX INFO: renamed from: k */
    public C1121e f4357k;

    /* JADX INFO: renamed from: l */
    public C1121e f4358l;

    public C1127k() {
        this.f4347a = new C1125i();
        this.f4348b = new C1125i();
        this.f4349c = new C1125i();
        this.f4350d = new C1125i();
        this.f4351e = new C1117a(0.0f);
        this.f4352f = new C1117a(0.0f);
        this.f4353g = new C1117a(0.0f);
        this.f4354h = new C1117a(0.0f);
        this.f4355i = new C1121e(0);
        this.f4356j = new C1121e(0);
        this.f4357k = new C1121e(0);
        this.f4358l = new C1121e(0);
    }

    /* JADX INFO: renamed from: a */
    public static C1126j m2657a(Context r6, AttributeSet r7, int r8, int r9) {
        C1117a r02 = new C1117a(0);
        TypedArray r72 = r6.obtainStyledAttributes(r7, AbstractC0942a.f3339k, r8, r9);
        int r82 = r72.getResourceId(0, 0);
        int r92 = r72.getResourceId(1, 0);
        r72.recycle();
        ContextThemeWrapper r73 = new ContextThemeWrapper(r6, r82);
        if (r92 == 0) goto L5;
        r73 = new ContextThemeWrapper(r73, r92);
    L5:
        TypedArray r62 = r73.obtainStyledAttributes(AbstractC0942a.f3344p);
        int r74 = r62.getInt(0, 0);     // Catch: Throwable -> L9
        int r83 = r62.getInt(3, r74);     // Catch: Throwable -> L9
        int r93 = r62.getInt(4, r74);     // Catch: Throwable -> L9
        int r1 = r62.getInt(2, r74);     // Catch: Throwable -> L9
        int r75 = r62.getInt(1, r74);     // Catch: Throwable -> L9
        InterfaceC1119c r03 = m2658b(r62, 5, r02);     // Catch: Throwable -> L9
        InterfaceC1119c r2 = m2658b(r62, 8, r03);     // Catch: Throwable -> L9
        InterfaceC1119c r3 = m2658b(r62, 9, r03);     // Catch: Throwable -> L9
        InterfaceC1119c r4 = m2658b(r62, 7, r03);     // Catch: Throwable -> L9
        InterfaceC1119c r04 = m2658b(r62, 6, r03);     // Catch: Throwable -> L9
        C1126j r5 = new C1126j();     // Catch: Throwable -> L9
        AbstractC0805P r84 = AbstractC0805P.m2046i(r83);     // Catch: Throwable -> L9
        r5.f4335a = r84;     // Catch: Throwable -> L9
        C1126j.m2655b(r84);     // Catch: Throwable -> L9
        r5.f4339e = r2;     // Catch: Throwable -> L9
        AbstractC0805P r85 = AbstractC0805P.m2046i(r93);     // Catch: Throwable -> L9
        r5.f4336b = r85;     // Catch: Throwable -> L9
        C1126j.m2655b(r85);     // Catch: Throwable -> L9
        r5.f4340f = r3;     // Catch: Throwable -> L9
        AbstractC0805P r86 = AbstractC0805P.m2046i(r1);     // Catch: Throwable -> L9
        r5.f4337c = r86;     // Catch: Throwable -> L9
        C1126j.m2655b(r86);     // Catch: Throwable -> L9
        r5.f4341g = r4;     // Catch: Throwable -> L9
        AbstractC0805P r76 = AbstractC0805P.m2046i(r75);     // Catch: Throwable -> L9
        r5.f4338d = r76;     // Catch: Throwable -> L9
        C1126j.m2655b(r76);     // Catch: Throwable -> L9
        r5.f4342h = r04;     // Catch: Throwable -> L9
        r62.recycle();
        return r5;
    L9:
        th = move-exception;
        r62.recycle();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1119c m2658b(TypedArray r2, int r3, InterfaceC1119c r4) {
        TypedValue r32 = r2.peekValue(r3);
        if (r32 != null) goto L5;
        return r4;
    L5:
        int r02 = r32.type;
        if (r02 != 5) goto L10;
        return new C1117a(TypedValue.complexToDimensionPixelSize(r32.data, r2.getResources().getDisplayMetrics()));
    L10:
        if (r02 == 6) goto L12;
        return r4;
    L12:
        return new C1124h(r32.getFraction(1.0f, 1.0f));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2659c(RectF r6) {
        if (this.f4358l.getClass().equals(C1121e.class) == true) goto L5;
    L11:
        boolean r02 = false;
    L12:
        float r1 = this.f4351e.mo2634a(r6);
        if (this.f4352f.mo2634a(r6) == r1) goto L15;
    L19:
        boolean r62 = false;
    L21:
        if ((this.f4348b instanceof C1125i) == true) goto L23;
    L29:
        boolean r12 = false;
    L30:
        if (r02 == false) goto L35;
        if (r62 == false) goto L36;
        if (r12 == true) goto L34;
        return false;
    L34:
        return true;
    L36:
        return false;
    L35:
        return false;
    L23:
        if ((this.f4347a instanceof C1125i) == false) goto L29;
        if ((this.f4349c instanceof C1125i) == false) goto L29;
        if ((this.f4350d instanceof C1125i) == false) goto L29;
        r12 = true;
        goto L30
    L15:
        if (this.f4354h.mo2634a(r6) != r1) goto L19;
        if (this.f4353g.mo2634a(r6) != r1) goto L19;
        r62 = true;
        goto L21
    L5:
        if (this.f4356j.getClass().equals(C1121e.class) == false) goto L11;
        if (this.f4355i.getClass().equals(C1121e.class) == false) goto L11;
        if (this.f4357k.getClass().equals(C1121e.class) == false) goto L11;
        r02 = true;
        goto L12
    }

    /* JADX INFO: renamed from: d */
    public final C1126j m2660d() {
        C1126j r02 = new C1126j();
        r02.f4335a = this.f4347a;
        r02.f4336b = this.f4348b;
        r02.f4337c = this.f4349c;
        r02.f4338d = this.f4350d;
        r02.f4339e = this.f4351e;
        r02.f4340f = this.f4352f;
        r02.f4341g = this.f4353g;
        r02.f4342h = this.f4354h;
        r02.f4343i = this.f4355i;
        r02.f4344j = this.f4356j;
        r02.f4345k = this.f4357k;
        r02.f4346l = this.f4358l;
        return r02;
    }
}
