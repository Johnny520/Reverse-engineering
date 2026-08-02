package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c80 implements gd0, bq0, sq2, sa0, rh2, qi2, uk2, vm2 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1227h;

    public /* synthetic */ c80(int i) {
        this.f1227h = i;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m663A(String str, Object obj) {
        throw new RuntimeException(str + obj);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m664g() {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m665h(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m666i(Object obj, Object obj2) {
        throw new IllegalStateException(("network interceptor " + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m667j(String str) {
        throw new RuntimeException(str);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m668k(String str, int i) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m669m(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m670n(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m671o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m672p(String str, String str2, int i, Map map, Throwable th, int i2) {
        throw new sd2(str, str2, i, map, th, i2);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m673q(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m674r(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m675s() {
        throw new C0594pv();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m676t(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m677u(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m678v(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m679w(String str, Object obj) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m680x(String str) {
        throw new SecurityException(str);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m681y(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m682z(String str, Object obj) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    @Override // p000.sq2
    /* JADX INFO: renamed from: a */
    public boolean mo683a() {
        return false;
    }

    @Override // p000.vm2
    /* JADX INFO: renamed from: c */
    public tm2 mo685c(er2 er2Var) {
        switch (this.f1227h) {
            case 27:
                bo0 bo0Var = (bo0) er2Var.f2578k;
                return new tm2(bo0Var.m576a(bo0Var.f957b), bo0Var.m576a(bo0Var.f958c), er2Var.m1412b() == u20.f11067h);
            case 28:
                return AbstractC0738tl.m5302c(er2Var, C0700sn.f10215S);
            default:
                return AbstractC0738tl.m5302c(er2Var, gd3.f3420G);
        }
    }

    @Override // p000.uk2
    /* JADX INFO: renamed from: d */
    public vk2 mo686d(th2 th2Var) {
        return null;
    }

    @Override // p000.bq0
    public Object get() {
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.qi2
    /* JADX INFO: renamed from: l */
    public pi2 mo688l(th2 th2Var) {
        return new pi2(fe0.f2918h, false, false, false, false, false);
    }

    @Override // p000.gd0
    /* JADX INFO: renamed from: b */
    public float mo684b(float f) {
        return f;
    }

    @Override // p000.sa0
    /* JADX INFO: renamed from: e */
    public double mo687e(double d) {
        return d;
    }

    @Override // p000.rh2
    /* JADX INFO: renamed from: f */
    public void mo419f(qh2 qh2Var) {
    }
}
