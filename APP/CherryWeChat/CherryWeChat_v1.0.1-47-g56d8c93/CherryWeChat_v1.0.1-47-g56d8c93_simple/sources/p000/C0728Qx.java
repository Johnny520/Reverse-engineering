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
    public AbstractC0828TB f2324a;

    /* JADX INFO: renamed from: b */
    public AbstractC0828TB f2325b;

    /* JADX INFO: renamed from: c */
    public AbstractC0828TB f2326c;

    /* JADX INFO: renamed from: d */
    public AbstractC0828TB f2327d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1006Xb f2328e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1006Xb f2329f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1006Xb f2330g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1006Xb f2331h;

    /* JADX INFO: renamed from: i */
    public C1456gf f2332i;

    /* JADX INFO: renamed from: j */
    public C1456gf f2333j;

    /* JADX INFO: renamed from: k */
    public C1456gf f2334k;

    /* JADX INFO: renamed from: l */
    public C1456gf f2335l;

    public C0728Qx() {
        this.f2324a = new C0684Pw();
        this.f2325b = new C0684Pw();
        this.f2326c = new C0684Pw();
        this.f2327d = new C0684Pw();
        this.f2328e = new C2436r(0.0f);
        this.f2329f = new C2436r(0.0f);
        this.f2330g = new C2436r(0.0f);
        this.f2331h = new C2436r(0.0f);
        int r1 = 0;
        this.f2332i = new C1456gf(r1);
        this.f2333j = new C1456gf(r1);
        this.f2334k = new C1456gf(r1);
        this.f2335l = new C1456gf(r1);
    }

    /* JADX INFO: renamed from: a */
    public static C0685Px m1511a(Context r6, int r7, int r8, C2436r r9) {
        ContextThemeWrapper r0 = new ContextThemeWrapper(r6, r7);
        if (r8 == 0) goto L5;
        r0.getTheme().applyStyle(r8, true);
    L5:
        TypedArray r72 = r0.obtainStyledAttributes(AbstractC0939Vu.f2956y);
        int r82 = r72.getInt(0, 0);     // Catch: Throwable -> L9
        int r02 = r72.getInt(3, r82);     // Catch: Throwable -> L9
        int r1 = r72.getInt(4, r82);     // Catch: Throwable -> L9
        int r2 = r72.getInt(2, r82);     // Catch: Throwable -> L9
        int r62 = r72.getInt(1, r82);     // Catch: Throwable -> L9
        InterfaceC1006Xb r83 = m1513c(r72, 5, r9);     // Catch: Throwable -> L9
        InterfaceC1006Xb r92 = m1513c(r72, 8, r83);     // Catch: Throwable -> L9
        InterfaceC1006Xb r3 = m1513c(r72, 9, r83);     // Catch: Throwable -> L9
        InterfaceC1006Xb r4 = m1513c(r72, 7, r83);     // Catch: Throwable -> L9
        InterfaceC1006Xb r84 = m1513c(r72, 6, r83);     // Catch: Throwable -> L9
        C0685Px r5 = new C0685Px();     // Catch: Throwable -> L9
        r5.f2192a = AbstractC1406fG.m2687L(r02);     // Catch: Throwable -> L9
        r5.f2196e = r92;     // Catch: Throwable -> L9
        r5.f2193b = AbstractC1406fG.m2687L(r1);     // Catch: Throwable -> L9
        r5.f2197f = r3;     // Catch: Throwable -> L9
        r5.f2194c = AbstractC1406fG.m2687L(r2);     // Catch: Throwable -> L9
        r5.f2198g = r4;     // Catch: Throwable -> L9
        r5.f2195d = AbstractC1406fG.m2687L(r62);     // Catch: Throwable -> L9
        r5.f2199h = r84;     // Catch: Throwable -> L9
        r72.recycle();
        return r5;
    L9:
        th = move-exception;
        r72.recycle();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static C0685Px m1512b(Context r3, AttributeSet r4, int r5, int r6) {
        C2436r r0 = new C2436r(0);
        TypedArray r42 = r3.obtainStyledAttributes(r4, AbstractC0939Vu.f2949r, r5, r6);
        int r52 = r42.getResourceId(0, 0);
        int r62 = r42.getResourceId(1, 0);
        r42.recycle();
        return m1511a(r3, r52, r62, r0);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC1006Xb m1513c(TypedArray r2, int r3, InterfaceC1006Xb r4) {
        TypedValue r32 = r2.peekValue(r3);
        if (r32 == null) goto L13;
        int r0 = r32.type;
        if (r0 != 5) goto L10;
        return new C2436r(TypedValue.complexToDimensionPixelSize(r32.data, r2.getResources().getDisplayMetrics()));
    L10:
        if (r0 != 6) goto L13;
        return new C0768Rv(r32.getFraction(1.0f, 1.0f));
    L13:
        return r4;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1514d() {
        if ((this.f2325b instanceof C0684Pw) == true) goto L5;
        return false;
    L5:
        if ((this.f2324a instanceof C0684Pw) == true) goto L7;
        return false;
    L7:
        if ((this.f2326c instanceof C0684Pw) == true) goto L9;
        return false;
    L9:
        if ((this.f2327d instanceof C0684Pw) == false) goto L16;
        return true;
    L16:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1515e(RectF r6) {
        if (this.f2335l.getClass().equals(C1456gf.class) == true) goto L5;
    L11:
        boolean r0 = false;
    L12:
        float r1 = this.f2328e.mo1563a(r6);
        if (this.f2329f.mo1563a(r6) == r1) goto L15;
    L19:
        boolean r62 = false;
    L20:
        if (r0 == false) goto L25;
        if (r62 == false) goto L25;
        if (m1514d() == false) goto L25;
        return true;
    L25:
        return false;
    L15:
        if (this.f2331h.mo1563a(r6) != r1) goto L19;
        if (this.f2330g.mo1563a(r6) != r1) goto L19;
        r62 = true;
        goto L20
    L5:
        if (this.f2333j.getClass().equals(C1456gf.class) == false) goto L11;
        if (this.f2332i.getClass().equals(C1456gf.class) == false) goto L11;
        if (this.f2334k.getClass().equals(C1456gf.class) == false) goto L11;
        r0 = true;
        goto L12
    }

    /* JADX INFO: renamed from: f */
    public final C0685Px m1516f() {
        C0685Px r0 = new C0685Px();
        r0.f2192a = this.f2324a;
        r0.f2193b = this.f2325b;
        r0.f2194c = this.f2326c;
        r0.f2195d = this.f2327d;
        r0.f2196e = this.f2328e;
        r0.f2197f = this.f2329f;
        r0.f2198g = this.f2330g;
        r0.f2199h = this.f2331h;
        r0.f2200i = this.f2332i;
        r0.f2201j = this.f2333j;
        r0.f2202k = this.f2334k;
        r0.f2203l = this.f2335l;
        return r0;
    }

    public final String toString() {
        return "[" + this.f2328e + ", " + this.f2329f + ", " + this.f2330g + ", " + this.f2331h + "]";
    }
}
