package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Bj */
/* JADX INFO: loaded from: classes.dex */
public final class C0069Bj implements InterfaceC2389pw, InterfaceC2284nl {

    /* JADX INFO: renamed from: a */
    public final Drawable f170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f171b;

    public C0069Bj(Drawable r1, int r2) {
        this.f171b = r2;
        AbstractC0714Qj.m1488j("Argument must not be null", r1);
        this.f170a = r1;
    }

    /* JADX INFO: renamed from: c */
    private final void m114c() {
    }

    @Override // p000.InterfaceC2284nl
    /* JADX INFO: renamed from: a */
    public void mo115a() {
        switch(this.f171b) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        Drawable r0 = this.f170a;
        if ((r0 instanceof BitmapDrawable) == false) goto L8;
        ((BitmapDrawable) r0).getBitmap().prepareToDraw();
        return;
    L8:
        if ((r0 instanceof C0026Aj) == false) goto L14;
        ((C0327Hj) ((C0026Aj) r0).f50a.f1572b).f1124l.prepareToDraw();
        return;
    L14:
        return;
    L11:
        ((C0327Hj) ((C0026Aj) this.f170a).f50a.f1572b).f1124l.prepareToDraw();
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: b */
    public final int mo116b() {
        switch(this.f171b) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Drawable r0 = this.f170a;
        int r1 = r0.getIntrinsicWidth();
        return Math.max(1, (r0.getIntrinsicHeight() * r1) * 4);
    L6:
        C0327Hj r02 = (C0327Hj) ((C0026Aj) this.f170a).f50a.f1572b;
        C0986Wy r12 = r02.f1113a;
        int r2 = r12.f3104d.limit() + r12.f3109i.length;
        return ((r12.f3110j.length * 4) + r2) + r02.f1126n;
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: d */
    public final Class mo117d() {
        switch(this.f171b) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return C0026Aj.class;
    L5:
        return this.f170a.getClass();
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: e */
    public final void mo118e() {
        switch(this.f171b) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        C0026Aj r0 = (C0026Aj) this.f170a;
        r0.stop();
        r0.f53d = true;
        C0327Hj r02 = (C0327Hj) r0.f50a.f1572b;
        ComponentCallbacks2C1473gw r2 = r02.f1116d;
        r02.f1115c.clear();
        Bitmap r3 = r02.f1124l;
        if (r3 == null) goto L8;
        r02.f1117e.mo53h(r3);
        r02.f1124l = null;
    L8:
        r02.f1118f = false;
        C0198Ej r32 = r02.f1121i;
        if (r32 == null) goto L11;
        r2.m2831l(r32);
        r02.f1121i = null;
    L11:
        C0198Ej r33 = r02.f1123k;
        if (r33 == null) goto L14;
        r2.m2831l(r33);
        r02.f1123k = null;
    L14:
        C0198Ej r34 = r02.f1125m;
        if (r34 == null) goto L17;
        r2.m2831l(r34);
        r02.f1125m = null;
    L17:
        C0986Wy r22 = r02.f1113a;
        C0649P3 r35 = r22.f3103c;
        r22.f3112l = null;
        byte[] r5 = r22.f3109i;
        if (r5 == null) goto L23;
        C2812zp r6 = (C2812zp) r35.f2090c;
        if (r6 == null) goto L23;
        r6.m5445g(r5);
    L23:
        int[] r52 = r22.f3110j;
        if (r52 == null) goto L29;
        C2812zp r62 = (C2812zp) r35.f2090c;
        if (r62 == null) goto L29;
        r62.m5445g(r52);
    L29:
        Bitmap r53 = r22.f3113m;
        if (r53 == null) goto L32;
        ((InterfaceC0565N5) r35.f2089b).mo53h(r53);
    L32:
        r22.f3113m = null;
        r22.f3104d = null;
        r22.f3119s = null;
        byte[] r23 = r22.f3105e;
        if (r23 == null) goto L38;
        C2812zp r36 = (C2812zp) r35.f2090c;
        if (r36 == null) goto L38;
        r36.m5445g(r23);
    L38:
        r02.f1122j = true;
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        Drawable r0 = this.f170a;
        Drawable.ConstantState r1 = r0.getConstantState();
        if (r1 != null) goto L6;
        return r0;
    L6:
        return r1.newDrawable();
    }
}
