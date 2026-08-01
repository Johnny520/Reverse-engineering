package p131a2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C1947p;
import me.dartcv.nuke.BuildConfig;
import p000A.C0038T0;
import p073O1.C1042d;
import p088R1.InterfaceC1194D;
import p088R1.InterfaceC1225z;
import p093S1.C1294f;
import p093S1.InterfaceC1289a;
import p142c2.C1892c;
import p142c2.C1894e;
import p142c2.C1896g;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: a2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1799c implements InterfaceC1194D, InterfaceC1225z {

    /* JADX INFO: renamed from: d */
    public final Drawable f6135d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f6136e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1799c(Drawable drawable, int i5) {
        this.f6136e = i5;
        AbstractC2503g.m4445c(drawable, "Argument must not be null");
        this.f6135d = drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1225z
    /* JADX INFO: renamed from: a */
    public void mo2310a() {
        switch (this.f6136e) {
            case BuildConfig.VERSION_CODE /* 1 */:
                ((C1892c) this.f6135d).f6426d.f6425a.f6455l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f6135d;
                if (drawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                } else if (drawable instanceof C1892c) {
                    ((C1892c) drawable).f6426d.f6425a.f6455l.prepareToDraw();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: c */
    public final int mo2254c() {
        switch (this.f6136e) {
            case 0:
                Drawable drawable = this.f6135d;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                C1896g c1896g = ((C1892c) this.f6135d).f6426d.f6425a;
                C1042d c1042d = c1896g.f6444a;
                return (c1042d.f3270j.length * 4) + c1042d.f3264d.limit() + c1042d.f3269i.length + c1896g.f6457n;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: d */
    public final Class mo2255d() {
        switch (this.f6136e) {
            case 0:
                return this.f6135d.getClass();
            default:
                return C1892c.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: e */
    public final void mo2256e() {
        C1294f c1294f;
        C1294f c1294f2;
        C1294f c1294f3;
        switch (this.f6136e) {
            case 0:
                break;
            default:
                C1892c c1892c = (C1892c) this.f6135d;
                c1892c.stop();
                c1892c.f6429g = true;
                C1896g c1896g = c1892c.f6426d.f6425a;
                ComponentCallbacks2C1947p componentCallbacks2C1947p = c1896g.f6447d;
                c1896g.f6446c.clear();
                Bitmap bitmap = c1896g.f6455l;
                if (bitmap != null) {
                    c1896g.f6448e.mo154e(bitmap);
                    c1896g.f6455l = null;
                }
                c1896g.f6449f = false;
                C1894e c1894e = c1896g.f6452i;
                if (c1894e != null) {
                    componentCallbacks2C1947p.m3613a(c1894e);
                    c1896g.f6452i = null;
                }
                C1894e c1894e2 = c1896g.f6454k;
                if (c1894e2 != null) {
                    componentCallbacks2C1947p.m3613a(c1894e2);
                    c1896g.f6454k = null;
                }
                C1894e c1894e3 = c1896g.f6456m;
                if (c1894e3 != null) {
                    componentCallbacks2C1947p.m3613a(c1894e3);
                    c1896g.f6456m = null;
                }
                C1042d c1042d = c1896g.f6444a;
                C0038T0 c0038t0 = c1042d.f3263c;
                c1042d.f3272l = null;
                byte[] bArr = c1042d.f3269i;
                if (bArr != null && (c1294f3 = (C1294f) c0038t0.f170f) != null) {
                    c1294f3.m2388g(bArr);
                }
                int[] iArr = c1042d.f3270j;
                if (iArr != null && (c1294f2 = (C1294f) c0038t0.f170f) != null) {
                    c1294f2.m2388g(iArr);
                }
                Bitmap bitmap2 = c1042d.f3273m;
                if (bitmap2 != null) {
                    ((InterfaceC1289a) c0038t0.f169e).mo154e(bitmap2);
                }
                c1042d.f3273m = null;
                c1042d.f3264d = null;
                c1042d.f3279s = null;
                byte[] bArr2 = c1042d.f3265e;
                if (bArr2 != null && (c1294f = (C1294f) c0038t0.f170f) != null) {
                    c1294f.m2388g(bArr2);
                }
                c1896g.f6453j = true;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1194D
    public final Object get() {
        Drawable drawable = this.f6135d;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    /* JADX INFO: renamed from: b */
    private final void m3272b() {
    }
}
