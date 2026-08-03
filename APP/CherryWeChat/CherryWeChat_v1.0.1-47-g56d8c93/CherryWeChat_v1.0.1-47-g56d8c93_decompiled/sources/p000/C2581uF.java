package p000;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: uF */
/* JADX INFO: loaded from: classes.dex */
public final class C2581uF extends AbstractC2796zF {

    /* JADX INFO: renamed from: e */
    public static Field f8941e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f8942f = false;

    /* JADX INFO: renamed from: g */
    public static Constructor f8943g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f8944h = false;

    /* JADX INFO: renamed from: c */
    public WindowInsets f8945c;

    /* JADX INFO: renamed from: d */
    public C2765yl f8946d;

    public C2581uF() {
        this.f8945c = m5083i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m5083i() {
        if (!f8942f) {
            try {
                f8941e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f8942f = true;
        }
        Field field = f8941e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f8944h) {
            try {
                f8943g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f8944h = true;
        }
        Constructor constructor = f8943g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: b */
    public C0489LF mo5084b() {
        m5362a();
        C0489LF c0489lfM939h = C0489LF.m939h(null, this.f8945c);
        C2765yl[] c2765ylArr = this.f9465b;
        C0317HF c0317hf = c0489lfM939h.f1602a;
        c0317hf.mo18p(c2765ylArr);
        c0317hf.mo95s(this.f8946d);
        return c0489lfM939h;
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: e */
    public void mo5085e(C2765yl c2765yl) {
        this.f8946d = c2765yl;
    }

    @Override // p000.AbstractC2796zF
    /* JADX INFO: renamed from: g */
    public void mo5086g(C2765yl c2765yl) {
        WindowInsets windowInsets = this.f8945c;
        if (windowInsets != null) {
            this.f8945c = windowInsets.replaceSystemWindowInsets(c2765yl.f9405a, c2765yl.f9406b, c2765yl.f9407c, c2765yl.f9408d);
        }
    }

    public C2581uF(C0489LF c0489lf) {
        super(c0489lf);
        this.f8945c = c0489lf.m945g();
    }
}
