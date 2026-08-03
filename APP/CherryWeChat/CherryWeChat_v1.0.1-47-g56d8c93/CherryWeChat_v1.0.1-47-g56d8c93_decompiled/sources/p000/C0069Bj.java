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

    public C0069Bj(Drawable drawable, int i) {
        this.f171b = i;
        AbstractC0714Qj.m1488j("Argument must not be null", drawable);
        this.f170a = drawable;
    }

    /* JADX INFO: renamed from: c */
    private final void m114c() {
    }

    @Override // p000.InterfaceC2284nl
    /* JADX INFO: renamed from: a */
    public void mo115a() {
        switch (this.f171b) {
            case 0:
                ((C0327Hj) ((C0026Aj) this.f170a).f50a.f1572b).f1124l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f170a;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C0026Aj) {
                    ((C0327Hj) ((C0026Aj) drawable).f50a.f1572b).f1124l.prepareToDraw();
                }
                break;
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: b */
    public final int mo116b() {
        switch (this.f171b) {
            case 0:
                C0327Hj c0327Hj = (C0327Hj) ((C0026Aj) this.f170a).f50a.f1572b;
                C0986Wy c0986Wy = c0327Hj.f1113a;
                return (c0986Wy.f3110j.length * 4) + c0986Wy.f3104d.limit() + c0986Wy.f3109i.length + c0327Hj.f1126n;
            default:
                Drawable drawable = this.f170a;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: d */
    public final Class mo117d() {
        switch (this.f171b) {
            case 0:
                return C0026Aj.class;
            default:
                return this.f170a.getClass();
        }
    }

    @Override // p000.InterfaceC2389pw
    /* JADX INFO: renamed from: e */
    public final void mo118e() {
        C2812zp c2812zp;
        C2812zp c2812zp2;
        C2812zp c2812zp3;
        switch (this.f171b) {
            case 0:
                C0026Aj c0026Aj = (C0026Aj) this.f170a;
                c0026Aj.stop();
                c0026Aj.f53d = true;
                C0327Hj c0327Hj = (C0327Hj) c0026Aj.f50a.f1572b;
                ComponentCallbacks2C1473gw componentCallbacks2C1473gw = c0327Hj.f1116d;
                c0327Hj.f1115c.clear();
                Bitmap bitmap = c0327Hj.f1124l;
                if (bitmap != null) {
                    c0327Hj.f1117e.mo53h(bitmap);
                    c0327Hj.f1124l = null;
                }
                c0327Hj.f1118f = false;
                C0198Ej c0198Ej = c0327Hj.f1121i;
                if (c0198Ej != null) {
                    componentCallbacks2C1473gw.m2831l(c0198Ej);
                    c0327Hj.f1121i = null;
                }
                C0198Ej c0198Ej2 = c0327Hj.f1123k;
                if (c0198Ej2 != null) {
                    componentCallbacks2C1473gw.m2831l(c0198Ej2);
                    c0327Hj.f1123k = null;
                }
                C0198Ej c0198Ej3 = c0327Hj.f1125m;
                if (c0198Ej3 != null) {
                    componentCallbacks2C1473gw.m2831l(c0198Ej3);
                    c0327Hj.f1125m = null;
                }
                C0986Wy c0986Wy = c0327Hj.f1113a;
                C0649P3 c0649p3 = c0986Wy.f3103c;
                c0986Wy.f3112l = null;
                byte[] bArr = c0986Wy.f3109i;
                if (bArr != null && (c2812zp3 = (C2812zp) c0649p3.f2090c) != null) {
                    c2812zp3.m5445g(bArr);
                }
                int[] iArr = c0986Wy.f3110j;
                if (iArr != null && (c2812zp2 = (C2812zp) c0649p3.f2090c) != null) {
                    c2812zp2.m5445g(iArr);
                }
                Bitmap bitmap2 = c0986Wy.f3113m;
                if (bitmap2 != null) {
                    ((InterfaceC0565N5) c0649p3.f2089b).mo53h(bitmap2);
                }
                c0986Wy.f3113m = null;
                c0986Wy.f3104d = null;
                c0986Wy.f3119s = null;
                byte[] bArr2 = c0986Wy.f3105e;
                if (bArr2 != null && (c2812zp = (C2812zp) c0649p3.f2090c) != null) {
                    c2812zp.m5445g(bArr2);
                }
                c0327Hj.f1122j = true;
                break;
        }
    }

    @Override // p000.InterfaceC2389pw
    public final Object get() {
        Drawable drawable = this.f170a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
