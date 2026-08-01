package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h40 {
    public static final qh l = null;
    public static final qh m = null;
    public static final qh n = null;
    public static final qh o = null;
    public static final qh p = null;
    public static final qh q = null;
    public static final qh r = null;
    public static final qh s = null;
    public float a;
    public float b;
    public final Object c;
    public final ip d;
    public boolean e;
    public long f;
    public float g;
    public final ArrayList h;
    public final ArrayList i;
    public i40 j;
    public float k;

    static {
        l = new qh(1);
        m = new qh(2);
        n = new qh(3);
        o = new qh(4);
        p = new qh(5);
        q = new qh(6);
        r = new qh(7);
        s = new qh(0);
    }

    public h40(Object r4, ip r5) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.e = false;
        this.f = 0;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.c = r4;
        this.d = r5;
        if (r5 != p) goto L5;
    L19:
        this.g = 0.1f;
    L20:
        this.j = null;
        this.k = Float.MAX_VALUE;
        return;
    L5:
        if (r5 == q) goto L19;
        if (r5 == r) goto L19;
        if (r5 != s) goto L13;
        this.g = 0.00390625f;
        goto L20
    L13:
        if (r5 != n) goto L15;
    L18:
        this.g = 0.00390625f;
        goto L20
    L15:
        if (r5 == o) goto L18;
        this.g = 1.0f;
        goto L20
    }

    public final void a(sh r3) {
        ArrayList r0 = this.h;
        if (r0.contains(r3) == true) goto L6;
        r0.add(r3);
        return;
    }

    public final void b(float r4) {
        if (this.e == false) goto L7;
        this.k = r4;
        return;
    L7:
        if (this.j != null) goto L9;
        this.j = new i40(r4);
    L9:
        this.j.i = r4;
        h();
    }

    public final void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L9;
        if (this.e == false) goto L10;
        d(true);
        return;
    L10:
        return;
    L9:
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public final void d(boolean r6) {
        int r62 = 0;
        this.e = false;
        ThreadLocal r0 = p2.f;
        if (r0.get() != null) goto L5;
        r0.set(new p2());
    L5:
        p2 r02 = (p2) r0.get();
        r02.a.remove(this);
        ArrayList r1 = r02.b;
        int r2 = r1.indexOf(this);
        if (r2 < 0) goto L8;
        r1.set(r2, null);
        r02.e = true;
    L8:
        this.f = 0;
    L9:
        ArrayList r03 = this.h;
        if (r62 >= r03.size()) goto L15;
        if (r03.get(r62) == null) goto L14;
        ((sh) r03.get(r62)).a();
    L14:
        r62 = r62 + 1;
        goto L9
    L15:
        int r63 = r03.size() - 1;
    L16:
        if (r63 < 0) goto L21;
        if (r03.get(r63) != null) goto L20;
        r03.remove(r63);
    L20:
        r63 = r63 - 1;
        goto L16
    }

    public final void e(sh r3) {
        ArrayList r0 = this.h;
        int r32 = r0.indexOf(r3);
        if (r32 < 0) goto L6;
        r0.set(r32, null);
        return;
    }

    public final void f(float r2) {
        if (r2 <= 0.0f) goto L7;
        this.g = r2;
        return;
    L7:
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public final void g(float r5) {
        this.d.V(this.c, r5);
        int r52 = 0;
    L3:
        ArrayList r0 = this.i;
        if (r52 >= r0.size()) goto L15;
        if (r0.get(r52) == null) goto L14;
        l9 r02 = (l9) r0.get(r52);
        float r1 = this.b;
        float r2 = this.a;
        int r3 = r02.a;
        Object r03 = r02.b;
        switch(r3) {
            case 0: goto L13;
            default: goto L9;
        };
    L9:
        View r04 = (View) r03;
        float r12 = (Math.abs(r2) / 3500.0f) + 1.0f;
        if (r12 <= 1.5f) goto L12;
        r12 = 1.5f;
    L12:
        r04.setScaleX(r12);
        goto L14
    L13:
        ((View) ((i00) r03).b).setScaleY(r1);
    L14:
        r52 = r52 + 1;
        goto L3
    L15:
        int r53 = r0.size() - 1;
    L16:
        if (r53 < 0) goto L21;
        if (r0.get(r53) != null) goto L20;
        r0.remove(r53);
    L20:
        r53 = r53 - 1;
        goto L16
    }

    public final void h() {
        i40 r0 = this.j;
        if (r0 == null) goto L40;
        double r1 = (float) r0.i;
        if (r1 > Float.MAX_VALUE) goto L38;
        if (r1 < (-3.4028235E38f)) goto L36;
        double r12 = Math.abs(this.g * 0.75f);
        r0.d = r12;
        r0.e = r12 * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L34;
        boolean r02 = this.e;
        if (r02 == true) goto L32;
        if (r02 == true) goto L41;
        this.e = true;
        float r03 = this.d.y(this.c);
        this.b = r03;
        if (r03 > Float.MAX_VALUE) goto L31;
        if (r03 < (-3.4028235E38f)) goto L31;
        ThreadLocal r04 = p2.f;
        if (r04.get() != null) goto L20;
        r04.set(new p2());
    L20:
        p2 r05 = (p2) r04.get();
        ArrayList r13 = r05.b;
        if (r13.size() != 0) goto L27;
        if (r05.d != null) goto L25;
        r05.d = new r5(r05.c);
    L25:
        r5 r06 = r05.d;
        ((Choreographer) r06.c).postFrameCallback((o2) r06.d);
    L27:
        if (r13.contains(this) == true) goto L42;
        r13.add(this);
        return;
    L42:
        return;
    L31:
        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
    L41:
        return;
    L32:
        return;
    L34:
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    L36:
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    L38:
        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
    L40:
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }
}
