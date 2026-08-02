package p000;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class he3 extends pe3 {

    /* JADX INFO: renamed from: g */
    public static Field f3976g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f3977h = false;

    /* JADX INFO: renamed from: i */
    public static Constructor f3978i = null;

    /* JADX INFO: renamed from: j */
    public static boolean f3979j = false;

    /* JADX INFO: renamed from: e */
    public WindowInsets f3980e;

    /* JADX INFO: renamed from: f */
    public zz0 f3981f;

    public he3() {
        this.f3980e = m2149j();
    }

    /* JADX INFO: renamed from: j */
    private static WindowInsets m2149j() {
        if (!f3977h) {
            try {
                f3976g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f3977h = true;
        }
        Field field = f3976g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!f3979j) {
            try {
                f3978i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            f3979j = true;
        }
        Constructor constructor = f3978i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // p000.pe3
    /* JADX INFO: renamed from: b */
    public cf3 mo2150b() {
        m3862a();
        cf3 cf3VarM769c = cf3.m769c(null, this.f3980e);
        zz0[] zz0VarArr = this.f8288b;
        ye3 ye3Var = cf3VarM769c.f1518a;
        ye3Var.mo4174w(zz0VarArr);
        ye3Var.mo4443z(this.f3981f);
        ye3Var.mo4173v(null);
        ye3Var.mo4157B(this.f8289c);
        ye3Var.mo4158C(this.f8290d);
        return cf3VarM769c;
    }

    @Override // p000.pe3
    /* JADX INFO: renamed from: f */
    public void mo2151f(zz0 zz0Var) {
        this.f3981f = zz0Var;
    }

    @Override // p000.pe3
    /* JADX INFO: renamed from: h */
    public void mo2152h(zz0 zz0Var) {
        WindowInsets windowInsets = this.f3980e;
        if (windowInsets != null) {
            this.f3980e = windowInsets.replaceSystemWindowInsets(zz0Var.f14157a, zz0Var.f14158b, zz0Var.f14159c, zz0Var.f14160d);
        }
    }

    public he3(cf3 cf3Var) {
        super(cf3Var);
        this.f3980e = cf3Var.m770b();
    }
}
