package p099y;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p085r.C0811c;

/* JADX INFO: renamed from: y.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1057V extends AbstractC1060Y {

    /* JADX INFO: renamed from: c */
    public static Field f3674c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f3675d = false;

    /* JADX INFO: renamed from: e */
    public static Constructor f3676e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f3677f = false;

    /* JADX INFO: renamed from: a */
    public WindowInsets f3678a;

    /* JADX INFO: renamed from: b */
    public C0811c f3679b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1057V() {
        this.f3678a = m2308e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private static WindowInsets m2308e() {
        if (!f3675d) {
            try {
                f3674c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f3675d = true;
        }
        Field field = f3674c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f3677f) {
            try {
                f3676e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f3677f = true;
        }
        Constructor constructor = f3676e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.AbstractC1060Y
    /* JADX INFO: renamed from: b */
    public C1075g0 mo2309b() {
        m2312a();
        C1075g0 c1075g0M2342c = C1075g0.m2342c(this.f3678a, null);
        C1073f0 c1073f0 = c1075g0M2342c.f3705a;
        c1073f0.mo2319k(null);
        c1073f0.mo2326m(this.f3679b);
        return c1075g0M2342c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.AbstractC1060Y
    /* JADX INFO: renamed from: c */
    public void mo2310c(C0811c c0811c) {
        this.f3679b = c0811c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.AbstractC1060Y
    /* JADX INFO: renamed from: d */
    public void mo2311d(C0811c c0811c) {
        WindowInsets windowInsets = this.f3678a;
        if (windowInsets != null) {
            this.f3678a = windowInsets.replaceSystemWindowInsets(c0811c.f2712a, c0811c.f2713b, c0811c.f2714c, c0811c.f2715d);
        }
    }

    public C1057V(C1075g0 c1075g0) {
        super(c1075g0);
        this.f3678a = c1075g0.m2343b();
    }
}
