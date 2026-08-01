package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 extends mc0 {
    public static Field e;
    public static boolean f;
    public static Constructor g;
    public static boolean h;
    public WindowInsets c;
    public ep d;

    public ic0() {
        this.c = i();
    }

    private static WindowInsets i() {
        if (f == false) goto L33;
    L9:
        Field r0 = e;
        if (r0 == null) goto L18;
        WindowInsets r02 = (WindowInsets) r0.get(null);     // Catch: ReflectiveOperationException -> L15
        if (r02 == null) goto L18;
        return new WindowInsets(r02);
    L15:
        e = move-exception;
        Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e);
    L18:
        if (h == false) goto L31;
    L24:
        Constructor r03 = g;
        if (r03 != null) goto L35;
    L30:
        return null;
    L35:
        return (WindowInsets) r03.newInstance(new Object[]{new Rect()});
    L28:
        e = move-exception;
        Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e);
        goto L30
    L31:
        g = WindowInsets.class.getConstructor(new Class[]{Rect.class});     // Catch: ReflectiveOperationException -> L21
    L23:
        h = true;
    L21:
        e = move-exception;
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e);
        goto L23
    L33:
        e = WindowInsets.class.getDeclaredField("CONSUMED");     // Catch: ReflectiveOperationException -> L6
    L8:
        f = true;
    L6:
        e = move-exception;
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
        goto L8
    }

    @Override // defpackage.mc0
    public wc0 b() {
        a();
        wc0 r0 = wc0.g(null, this.c);
        ep[] r1 = this.b;
        tc0 r2 = r0.a;
        r2.o(r1);
        r2.q(this.d);
        return r0;
    }

    @Override // defpackage.mc0
    public void e(ep r1) {
        this.d = r1;
    }

    @Override // defpackage.mc0
    public void g(ep r5) {
        WindowInsets r0 = this.c;
        if (r0 == null) goto L6;
        this.c = r0.replaceSystemWindowInsets(r5.a, r5.b, r5.c, r5.d);
        return;
    }

    public ic0(wc0 r1) {
        super(r1);
        this.c = r1.f();
    }
}
