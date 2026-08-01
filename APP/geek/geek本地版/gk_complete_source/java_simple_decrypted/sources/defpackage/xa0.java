package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xa0 {
    public final ArrayList a;
    public long b;
    public Interpolator c;
    public ya0 d;
    public boolean e;
    public final j70 f;

    public xa0() {
        this.b = -1;
        this.f = new j70(this);
        this.a = new ArrayList();
    }

    public final void a() {
        if (this.e == true) goto L5;
        return;
    L5:
        ArrayList r0 = this.a;
        int r1 = r0.size();
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L8;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        ((wa0) r4).b();
        goto L6
    L8:
        this.e = false;
    }

    public final void b() {
        if (this.e == false) goto L5;
        return;
    L5:
        ArrayList r0 = this.a;
        int r1 = r0.size();
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L21;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        wa0 r32 = (wa0) r3;
        long r4 = this.b;
        if (r4 < 0) goto L10;
        r32.c(r4);
    L10:
        Interpolator r42 = this.c;
        if (r42 == null) goto L16;
        View r5 = (View) r32.a.get();
        if (r5 == null) goto L16;
        r5.animate().setInterpolator(r42);
    L16:
        if (this.d == null) goto L18;
        r32.d(this.f);
    L18:
        View r33 = (View) r32.a.get();
        if (r33 == null) goto L6;
        r33.animate().start();
        goto L6
    L21:
        this.e = true;
    }
}
