package p228r0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import p000A.C0072l0;
import p047I0.C0699U0;
import p112W2.InterfaceC1601c;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p211o0.C2743b;
import p211o0.C2761t;
import p211o0.InterfaceC2760s;
import p222q0.AbstractC2902c;
import p222q0.C2900a;
import p222q0.C2901b;
import p233s0.AbstractC3167a;

/* JADX INFO: renamed from: r0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C3039l extends View {

    /* JADX INFO: renamed from: n */
    public static final C0699U0 f9711n = new C0699U0(3);

    /* JADX INFO: renamed from: d */
    public final AbstractC3167a f9712d;

    /* JADX INFO: renamed from: e */
    public final C2761t f9713e;

    /* JADX INFO: renamed from: f */
    public final C2901b f9714f;

    /* JADX INFO: renamed from: g */
    public boolean f9715g;

    /* JADX INFO: renamed from: h */
    public Outline f9716h;

    /* JADX INFO: renamed from: i */
    public boolean f9717i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2007c f9718j;

    /* JADX INFO: renamed from: k */
    public EnumC2017m f9719k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1601c f9720l;

    /* JADX INFO: renamed from: m */
    public C3029b f9721m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3039l(AbstractC3167a abstractC3167a, C2761t c2761t, C2901b c2901b) {
        super(abstractC3167a.getContext());
        this.f9712d = abstractC3167a;
        this.f9713e = c2761t;
        this.f9714f = c2901b;
        setOutlineProvider(f9711n);
        this.f9717i = true;
        this.f9718j = AbstractC2902c.f9188a;
        this.f9719k = EnumC2017m.f6742d;
        InterfaceC3031d.f9632a.getClass();
        this.f9720l = C3028a.f9605g;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C2761t c2761t = this.f9713e;
        C2743b c2743b = c2761t.f8756a;
        Canvas canvas2 = c2743b.f8723a;
        c2743b.f8723a = canvas;
        InterfaceC2007c interfaceC2007c = this.f9718j;
        EnumC2017m enumC2017m = this.f9719k;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C3029b c3029b = this.f9721m;
        InterfaceC1601c interfaceC1601c = this.f9720l;
        C2901b c2901b = this.f9714f;
        C0072l0 c0072l0 = c2901b.f9185e;
        C2900a c2900a = ((C2901b) c0072l0.f309g).f9184d;
        InterfaceC2007c interfaceC2007c2 = c2900a.f9180a;
        EnumC2017m enumC2017m2 = c2900a.f9181b;
        InterfaceC2760s interfaceC2760sM106j = c0072l0.m106j();
        C0072l0 c0072l02 = c2901b.f9185e;
        long jM110n = c0072l02.m110n();
        C3029b c3029b2 = (C3029b) c0072l02.f308f;
        c0072l02.m117w(interfaceC2007c);
        c0072l02.m118x(enumC2017m);
        c0072l02.m116v(c2743b);
        c0072l02.m119y(jFloatToRawIntBits);
        c0072l02.f308f = c3029b;
        c2743b.mo4852n();
        try {
            interfaceC1601c.mo1h(c2901b);
            c2743b.mo4851l();
            c0072l02.m117w(interfaceC2007c2);
            c0072l02.m118x(enumC2017m2);
            c0072l02.m116v(interfaceC2760sM106j);
            c0072l02.m119y(jM110n);
            c0072l02.f308f = c3029b2;
            c2761t.f8756a.f8723a = canvas2;
            this.f9715g = false;
        } catch (Throwable th) {
            c2743b.mo4851l();
            c0072l02.m117w(interfaceC2007c2);
            c0072l02.m118x(enumC2017m2);
            c0072l02.m116v(interfaceC2760sM106j);
            c0072l02.m119y(jM110n);
            c0072l02.f308f = c3029b2;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f9717i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C2761t getCanvasHolder() {
        return this.f9713e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getOwnerView() {
        return this.f9712d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f9717i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void invalidate() {
        if (this.f9715g) {
            return;
        }
        this.f9715g = true;
        super.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCanUseCompositingLayer$ui_graphics(boolean z5) {
        if (this.f9717i != z5) {
            this.f9717i = z5;
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setInvalidated(boolean z5) {
        this.f9715g = z5;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
    }
}
