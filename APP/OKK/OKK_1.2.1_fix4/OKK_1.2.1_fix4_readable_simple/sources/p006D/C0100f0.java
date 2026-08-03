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
        if (f264f == false) goto L29;
    L6:
        Field r02 = f263e;
        if (r02 == null) goto L13;
        WindowInsets r03 = (WindowInsets) r02.get(null);     // Catch: ReflectiveOperationException -> L21
        if (r03 == null) goto L13;
        return new WindowInsets(r03);
    L13:
        if (f266h == false) goto L25;
    L16:
        Constructor r04 = f265g;
        if (r04 != null) goto L31;
    L20:
        return null;
    L31:
        return (WindowInsets) r04.newInstance(new Object[]{new Rect()});
    L25:
        f265g = WindowInsets.class.getConstructor(new Class[]{Rect.class});     // Catch: ReflectiveOperationException -> L23
    L15:
        f266h = true;
        goto L16
    L29:
        f263e = WindowInsets.class.getDeclaredField("CONSUMED");     // Catch: ReflectiveOperationException -> L24
    L5:
        f264f = true;
        goto L6
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: b */
    public C0122q0 mo362b() {
        m369a();
        C0122q0 r02 = C0122q0.m429d(null, this.f267c);
        C1102c[] r1 = this.f282b;
        C0118o0 r2 = r02.f309a;
        r2.mo385o(r1);
        r2.mo393q(this.f268d);
        return r02;
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: e */
    public void mo363e(C1102c r1) {
        this.f268d = r1;
    }

    @Override // p006D.AbstractC0106i0
    /* JADX INFO: renamed from: g */
    public void mo364g(C1102c r5) {
        WindowInsets r02 = this.f267c;
        if (r02 == null) goto L6;
        int r1 = r5.f4249a;
        int r2 = r5.f4251c;
        int r3 = r5.f4252d;
        this.f267c = r02.replaceSystemWindowInsets(r1, r5.f4250b, r2, r3);
        return;
    }

    public C0100f0(C0122q0 r1) {
        super(r1);
        this.f267c = r1.m431c();
    }
}
