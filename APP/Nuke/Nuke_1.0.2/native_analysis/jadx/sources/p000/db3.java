package p000;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class db3 extends View {

    /* JADX INFO: renamed from: r */
    public static final o80 f1964r = new o80(2);

    /* JADX INFO: renamed from: h */
    public final kc0 f1965h;

    /* JADX INFO: renamed from: i */
    public final C0742tp f1966i;

    /* JADX INFO: renamed from: j */
    public final C0702sp f1967j;

    /* JADX INFO: renamed from: k */
    public boolean f1968k;

    /* JADX INFO: renamed from: l */
    public Outline f1969l;

    /* JADX INFO: renamed from: m */
    public boolean f1970m;

    /* JADX INFO: renamed from: n */
    public e70 f1971n;

    /* JADX INFO: renamed from: o */
    public d61 f1972o;

    /* JADX INFO: renamed from: p */
    public in0 f1973p;

    /* JADX INFO: renamed from: q */
    public pq0 f1974q;

    public db3(kc0 kc0Var, C0742tp c0742tp, C0702sp c0702sp) {
        super(kc0Var.getContext());
        this.f1965h = kc0Var;
        this.f1966i = c0742tp;
        this.f1967j = c0702sp;
        setOutlineProvider(f1964r);
        this.f1970m = true;
        this.f1971n = pp0.f8434c;
        this.f1972o = d61.f1885h;
        rq0.f9700a.getClass();
        this.f1973p = oq0.f7773k;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0742tp c0742tp = this.f1966i;
        C0192f6 c0192f6 = c0742tp.f10873a;
        Canvas canvas2 = c0192f6.f2807a;
        c0192f6.f2807a = canvas;
        e70 e70Var = this.f1971n;
        d61 d61Var = this.f1972o;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        pq0 pq0Var = this.f1974q;
        in0 in0Var = this.f1973p;
        C0702sp c0702sp = this.f1967j;
        C0043b5 c0043b5 = c0702sp.f10257i;
        C0664rp c0664rp = ((C0702sp) c0043b5.f564k).f10256h;
        e70 e70Var2 = c0664rp.f9665a;
        d61 d61Var2 = c0664rp.f9666b;
        InterfaceC0627qp interfaceC0627qpM430q = c0043b5.m430q();
        C0043b5 c0043b52 = c0702sp.f10257i;
        long jM434u = c0043b52.m434u();
        pq0 pq0Var2 = (pq0) c0043b52.f563j;
        c0043b52.m412C(e70Var);
        c0043b52.m413D(d61Var);
        c0043b52.m411B(c0192f6);
        c0043b52.m414E(jFloatToRawIntBits);
        c0043b52.f563j = pq0Var;
        c0192f6.mo1522l();
        try {
            in0Var.mo5j(c0702sp);
            c0192f6.mo1520i();
            c0043b52.m412C(e70Var2);
            c0043b52.m413D(d61Var2);
            c0043b52.m411B(interfaceC0627qpM430q);
            c0043b52.m414E(jM434u);
            c0043b52.f563j = pq0Var2;
            c0742tp.f10873a.f2807a = canvas2;
            this.f1968k = false;
        } catch (Throwable th) {
            c0192f6.mo1520i();
            c0043b52.m412C(e70Var2);
            c0043b52.m413D(d61Var2);
            c0043b52.m411B(interfaceC0627qpM430q);
            c0043b52.m414E(jM434u);
            c0043b52.f563j = pq0Var2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f1970m;
    }

    public final C0742tp getCanvasHolder() {
        return this.f1966i;
    }

    public final View getOwnerView() {
        return this.f1965h;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1970m;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f1968k) {
            return;
        }
        this.f1968k = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f1970m != z) {
            this.f1970m = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.f1968k = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
