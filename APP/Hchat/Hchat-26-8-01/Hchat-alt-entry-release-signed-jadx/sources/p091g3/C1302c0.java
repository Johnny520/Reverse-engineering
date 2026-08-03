package p091g3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p018b3.C0171a;

/* JADX INFO: renamed from: g3.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1302c0 extends AbstractC1310g0 {

    /* JADX INFO: renamed from: e */
    public static Field f4356e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f4357f = false;

    /* JADX INFO: renamed from: g */
    public static Constructor f4358g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f4359h = false;

    /* JADX INFO: renamed from: c */
    public WindowInsets f4360c;

    /* JADX INFO: renamed from: d */
    public C0171a f4361d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1302c0() {
        this.f4360c = m3452i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private static WindowInsets m3452i() {
        if (!f4357f) {
            try {
                f4356e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f4357f = true;
        }
        Field field = f4356e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
            }
        }
        if (!f4359h) {
            try {
                f4358g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f4359h = true;
        }
        Constructor constructor = f4358g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1310g0
    /* JADX INFO: renamed from: b */
    public C1332r0 mo3453b() {
        m3462a();
        C1332r0 c1332r0M3558c = C1332r0.m3558c(this.f4360c, null);
        C0171a[] c0171aArr = this.f4370b;
        C1324n0 c1324n0 = c1332r0M3558c.f4398a;
        c1324n0.mo3507r(c0171aArr);
        c1324n0.mo3516u(this.f4361d);
        return c1332r0M3558c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1310g0
    /* JADX INFO: renamed from: e */
    public void mo3454e(C0171a c0171a) {
        this.f4361d = c0171a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.AbstractC1310g0
    /* JADX INFO: renamed from: g */
    public void mo3455g(C0171a c0171a) {
        WindowInsets windowInsets = this.f4360c;
        if (windowInsets != null) {
            this.f4360c = windowInsets.replaceSystemWindowInsets(c0171a.f445a, c0171a.f446b, c0171a.f447c, c0171a.f448d);
        }
    }

    public C1302c0(C1332r0 c1332r0) {
        super(c1332r0);
        this.f4360c = c1332r0.m3559b();
    }
}
