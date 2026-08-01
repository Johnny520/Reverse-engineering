package p000;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 extends mc0 {

    /* JADX INFO: renamed from: e */
    public static Field f2415e;

    /* JADX INFO: renamed from: f */
    public static boolean f2416f;

    /* JADX INFO: renamed from: g */
    public static Constructor f2417g;

    /* JADX INFO: renamed from: h */
    public static boolean f2418h;

    /* JADX INFO: renamed from: c */
    public WindowInsets f2419c;

    /* JADX INFO: renamed from: d */
    public C0195ep f2420d;

    public ic0() {
        this.f2419c = m1432i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m1432i() {
        if (!f2416f) {
            try {
                f2415e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            f2416f = true;
        }
        Field field = f2415e;
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
        if (!f2418h) {
            try {
                f2417g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            f2418h = true;
        }
        Constructor constructor = f2417g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: b */
    public wc0 mo1433b() {
        m1819a();
        wc0 wc0VarM2563g = wc0.m2563g(null, this.f2419c);
        C0195ep[] c0195epArr = this.f3195b;
        tc0 tc0Var = wc0VarM2563g.f4955a;
        tc0Var.mo1936o(c0195epArr);
        tc0Var.mo2016q(this.f2420d);
        return wc0VarM2563g;
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: e */
    public void mo1434e(C0195ep c0195ep) {
        this.f2420d = c0195ep;
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: g */
    public void mo1435g(C0195ep c0195ep) {
        WindowInsets windowInsets = this.f2419c;
        if (windowInsets != null) {
            this.f2419c = windowInsets.replaceSystemWindowInsets(c0195ep.f1828a, c0195ep.f1829b, c0195ep.f1830c, c0195ep.f1831d);
        }
    }

    public ic0(wc0 wc0Var) {
        super(wc0Var);
        this.f2419c = wc0Var.m2568f();
    }
}
