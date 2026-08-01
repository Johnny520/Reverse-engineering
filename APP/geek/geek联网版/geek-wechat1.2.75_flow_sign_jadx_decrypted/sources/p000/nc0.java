package p000;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class nc0 extends rc0 {

    /* JADX INFO: renamed from: e */
    public static Field f3269e;

    /* JADX INFO: renamed from: f */
    public static boolean f3270f;

    /* JADX INFO: renamed from: g */
    public static Constructor f3271g;

    /* JADX INFO: renamed from: h */
    public static boolean f3272h;

    /* JADX INFO: renamed from: c */
    public WindowInsets f3273c;

    /* JADX INFO: renamed from: d */
    public C0346ip f3274d;

    public nc0() {
        this.f3273c = m1943i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m1943i() {
        if (!f3270f) {
            try {
                f3269e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f3270f = true;
        }
        Field field = f3269e;
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
        if (!f3272h) {
            try {
                f3271g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            f3272h = true;
        }
        Constructor constructor = f3271g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // p000.rc0
    /* JADX INFO: renamed from: b */
    public bd0 mo1944b() {
        m2287a();
        bd0 bd0VarM515g = bd0.m515g(null, this.f3273c);
        C0346ip[] c0346ipArr = this.f4122b;
        yc0 yc0Var = bd0VarM515g.f724a;
        yc0Var.mo2372o(c0346ipArr);
        yc0Var.mo2412q(this.f3274d);
        return bd0VarM515g;
    }

    @Override // p000.rc0
    /* JADX INFO: renamed from: e */
    public void mo1945e(C0346ip c0346ip) {
        this.f3274d = c0346ip;
    }

    @Override // p000.rc0
    /* JADX INFO: renamed from: g */
    public void mo1946g(C0346ip c0346ip) {
        WindowInsets windowInsets = this.f3273c;
        if (windowInsets != null) {
            this.f3273c = windowInsets.replaceSystemWindowInsets(c0346ip.f2571a, c0346ip.f2572b, c0346ip.f2573c, c0346ip.f2574d);
        }
    }

    public nc0(bd0 bd0Var) {
        super(bd0Var);
        this.f3273c = bd0Var.m520f();
    }
}
