package p229r1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.H */
/* JADX INFO: loaded from: classes.dex */
public final class C3047H extends AbstractC3055P {

    /* JADX INFO: renamed from: g */
    public static Field f9742g;

    /* JADX INFO: renamed from: h */
    public static boolean f9743h;

    /* JADX INFO: renamed from: i */
    public static Constructor f9744i;

    /* JADX INFO: renamed from: j */
    public static boolean f9745j;

    /* JADX INFO: renamed from: e */
    public WindowInsets f9746e;

    /* JADX INFO: renamed from: f */
    public C2688b f9747f;

    public C3047H() {
        this.f9746e = m5321j();
    }

    /* JADX INFO: renamed from: j */
    private static WindowInsets m5321j() {
        if (!f9743h) {
            try {
                f9742g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e5);
            }
            f9743h = true;
        }
        Field field = f9742g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e6);
            }
        }
        if (!f9745j) {
            try {
                f9744i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e7);
            }
            f9745j = true;
        }
        Constructor constructor = f9744i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e8);
            }
        }
        return null;
    }

    @Override // p229r1.AbstractC3055P
    /* JADX INFO: renamed from: b */
    public C3070c0 mo5322b() {
        m5349a();
        C3070c0 c3070c0M5393c = C3070c0.m5393c(null, this.f9746e);
        C2688b[] c2688bArr = this.f9750b;
        C3064Z c3064z = c3070c0M5393c.f9782a;
        c3064z.mo5376w(c2688bArr);
        c3064z.mo5383z(this.f9747f);
        c3064z.mo5375v(null);
        c3064z.mo5359B(this.f9751c);
        c3064z.mo5360C(this.f9752d);
        return c3070c0M5393c;
    }

    @Override // p229r1.AbstractC3055P
    /* JADX INFO: renamed from: f */
    public void mo5323f(C2688b c2688b) {
        this.f9747f = c2688b;
    }

    @Override // p229r1.AbstractC3055P
    /* JADX INFO: renamed from: h */
    public void mo5324h(C2688b c2688b) {
        WindowInsets windowInsets = this.f9746e;
        if (windowInsets != null) {
            this.f9746e = windowInsets.replaceSystemWindowInsets(c2688b.f8572a, c2688b.f8573b, c2688b.f8574c, c2688b.f8575d);
        }
    }

    public C3047H(C3070c0 c3070c0) {
        super(c3070c0);
        this.f9746e = c3070c0.m5394b();
    }
}
