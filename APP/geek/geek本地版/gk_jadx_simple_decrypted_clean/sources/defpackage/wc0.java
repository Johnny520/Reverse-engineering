package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 {
    public static final wc0 b = null;
    public final tc0 a;

    static {
        if (Build.VERSION.SDK_INT < 30) goto L6;
        b = sc0.q;
        return;
    L6:
        b = tc0.b;
    }

    public wc0(WindowInsets r3) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 30) goto L7;
        this.a = new sc0(this, r3);
        return;
    L7:
        if (r0 < 29) goto L11;
        this.a = new rc0(this, r3);
        return;
    L11:
        if (r0 < 28) goto L14;
        this.a = new qc0(this, r3);
        return;
    L14:
        this.a = new oc0(this, r3);
    }

    public static ep e(ep r5, int r6, int r7, int r8, int r9) {
        int r0 = Math.max(0, r5.a - r6);
        int r2 = Math.max(0, r5.b - r7);
        int r3 = Math.max(0, r5.c - r8);
        int r1 = Math.max(0, r5.d - r9);
        if (r0 != r6) goto L9;
        if (r2 != r7) goto L9;
        if (r3 != r8) goto L9;
        if (r1 != r9) goto L9;
        return r5;
    L9:
        return ep.b(r0, r2, r3, r1);
    }

    public static wc0 g(View r2, WindowInsets r3) {
        r3.getClass();
        wc0 r0 = new wc0(r3);
        if (r2 == null) goto L7;
        WeakHashMap r32 = ja0.a;
        if (v90.b(r2) == false) goto L7;
        wc0 r33 = z90.a(r2);
        tc0 r1 = r0.a;
        r1.p(r33);
        r1.d(r2.getRootView());
    L7:
        return r0;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof wc0) == true) goto L10;
        return false;
    L10:
        return pw.a(this.a, ((wc0) r2).a);
    }

    public final WindowInsets f() {
        tc0 r0 = this.a;
        if ((r0 instanceof nc0) == true) goto L5;
        return null;
    L5:
        return ((nc0) r0).c;
    }

    public final int hashCode() {
        tc0 r0 = this.a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    public wc0() {
        this.a = new tc0(this);
    }
}
