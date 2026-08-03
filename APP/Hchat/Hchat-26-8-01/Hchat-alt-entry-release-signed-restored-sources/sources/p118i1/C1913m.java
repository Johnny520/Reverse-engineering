package p118i1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import p020b5.C0184c;
import p071f1.C0993b;
import p071f1.C1033v;
import p071f1.InterfaceC1031u;
import p085fg.InterfaceC1231l;
import p101h1.AbstractC1566c;
import p101h1.C1565b;
import p132j1.AbstractC2049a;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: i1.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1913m extends View {

    /* JADX INFO: renamed from: q */
    public static final C1912l f6445q = new C1912l(0);

    /* JADX INFO: renamed from: g */
    public final AbstractC2049a f6446g;

    /* JADX INFO: renamed from: h */
    public final C1033v f6447h;

    /* JADX INFO: renamed from: i */
    public final C1565b f6448i;

    /* JADX INFO: renamed from: j */
    public boolean f6449j;

    /* JADX INFO: renamed from: k */
    public Outline f6450k;

    /* JADX INFO: renamed from: l */
    public boolean f6451l;

    /* JADX INFO: renamed from: m */
    public InterfaceC4233c f6452m;

    /* JADX INFO: renamed from: n */
    public EnumC4243m f6453n;

    /* JADX INFO: renamed from: o */
    public InterfaceC1231l f6454o;

    /* JADX INFO: renamed from: p */
    public C1902b f6455p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1913m(AbstractC2049a abstractC2049a, C1033v c1033v, C1565b c1565b) {
        super(abstractC2049a.getContext());
        this.f6446g = abstractC2049a;
        this.f6447h = c1033v;
        this.f6448i = c1565b;
        setOutlineProvider(f6445q);
        this.f6451l = true;
        this.f6452m = AbstractC1566c.f5223a;
        this.f6453n = EnumC4243m.f13919g;
        InterfaceC1904d.f6365a.getClass();
        this.f6454o = C1901a.f6337i;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1033v c1033v = this.f6447h;
        C0993b c0993b = c1033v.f3257a;
        Canvas canvas2 = c0993b.f3149a;
        c0993b.f3149a = canvas;
        InterfaceC4233c interfaceC4233c = this.f6452m;
        EnumC4243m enumC4243m = this.f6453n;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C1902b c1902b = this.f6455p;
        InterfaceC1231l interfaceC1231l = this.f6454o;
        C1565b c1565b = this.f6448i;
        InterfaceC4233c interfaceC4233cM822s = c1565b.mo4081z0().m822s();
        EnumC4243m enumC4243mM824u = c1565b.mo4081z0().m824u();
        InterfaceC1031u interfaceC1031uM819p = c1565b.mo4081z0().m819p();
        long jM825v = c1565b.mo4081z0().m825v();
        C1902b c1902b2 = (C1902b) c1565b.mo4081z0().f470b;
        C0184c c0184cMo4081z0 = c1565b.mo4081z0();
        c0184cMo4081z0.m800R(interfaceC4233c);
        c0184cMo4081z0.m801S(enumC4243m);
        c0184cMo4081z0.m798P(c0993b);
        c0184cMo4081z0.m803U(jFloatToRawIntBits);
        c0184cMo4081z0.f470b = c1902b;
        c0993b.mo2487e();
        try {
            interfaceC1231l.invoke(c1565b);
            c0993b.mo2497p();
            C0184c c0184cMo4081z02 = c1565b.mo4081z0();
            c0184cMo4081z02.m800R(interfaceC4233cM822s);
            c0184cMo4081z02.m801S(enumC4243mM824u);
            c0184cMo4081z02.m798P(interfaceC1031uM819p);
            c0184cMo4081z02.m803U(jM825v);
            c0184cMo4081z02.f470b = c1902b2;
            c1033v.f3257a.f3149a = canvas2;
            this.f6449j = false;
        } catch (Throwable th2) {
            c0993b.mo2497p();
            C0184c c0184cMo4081z03 = c1565b.mo4081z0();
            c0184cMo4081z03.m800R(interfaceC4233cM822s);
            c0184cMo4081z03.m801S(enumC4243mM824u);
            c0184cMo4081z03.m798P(interfaceC1031uM819p);
            c0184cMo4081z03.m803U(jM825v);
            c0184cMo4081z03.f470b = c1902b2;
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f6451l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1033v getCanvasHolder() {
        return this.f6447h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getOwnerView() {
        return this.f6446g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f6451l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void invalidate() {
        if (this.f6449j) {
            return;
        }
        this.f6449j = true;
        super.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCanUseCompositingLayer$ui_graphics(boolean z9) {
        if (this.f6451l != z9) {
            this.f6451l = z9;
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setInvalidated(boolean z9) {
        this.f6449j = z9;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
    }
}
