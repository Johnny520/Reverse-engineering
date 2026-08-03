package p006D;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p085v.C1102c;

/* JADX INFO: renamed from: D.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0100f0 extends AbstractC0106i0 {

    /* JADX INFO: renamed from: e */
    public static Field f263e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f264f = false;

    /* JADX INFO: renamed from: g */
    public static Constructor f265g = null;

    /* JADX INFO: renamed from: h */
    public static boolean f266h = false;

    /* JADX INFO: renamed from: c */
    public WindowInsets f267c;

    /* JADX INFO: renamed from: d */
    public C1102c f268d;

    public C0100f0() {
        this.f267c = m361i();
    }

    /* JADX INFO: renamed from: i */
    private static WindowInsets m361i() {
        if (!f264f) {
            try {
                f263e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f264f = true;
        }
        Field field = f263e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f266h) {
            try {
                f265g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            f266h = true;
        }
        Constructor constructor = f265g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: b */
    public C0122q0 mo362b() {
        m369a();
        C0122q0 c0122q0M429d = C0122q0.m429d(null, this.f267c);
        C1102c[] c1102cArr = this.f282b;
        C0118o0 c0118o0 = c0122q0M429d.f309a;
        c0118o0.mo385o(c1102cArr);
        c0118o0.mo393q(this.f268d);
        return c0122q0M429d;
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: e */
    public void mo363e(C1102c c1102c) {
        this.f268d = c1102c;
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: g */
    public void mo364g(C1102c c1102c) {
        WindowInsets windowInsets = this.f267c;
        if (windowInsets != null) {
            this.f267c = windowInsets.replaceSystemWindowInsets(c1102c.f4249a, c1102c.f4250b, c1102c.f4251c, c1102c.f4252d);
        }
    }

    public C0100f0(C0122q0 c0122q0) {
        super(c0122q0);
        this.f267c = c0122q0.m431c();
    }
}
