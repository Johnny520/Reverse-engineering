package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.h0;
import defpackage.ja0;
import defpackage.l0;
import defpackage.ma0;
import defpackage.n50;
import defpackage.s90;
import defpackage.wd;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends wd {
    public ma0 a;
    public boolean b;
    public boolean c;
    public int d;
    public float e;
    public float f;
    public final n50 g;

    public SwipeDismissBehavior() {
        this.d = 2;
        this.e = 0.0f;
        this.f = 0.5f;
        this.g = new n50(this);
    }

    @Override // defpackage.wd
    public boolean f(CoordinatorLayout r5, View r6, MotionEvent r7) {
        boolean r0 = this.b;
        int r1 = r7.getActionMasked();
        if (r1 == 0) goto L9;
        if (r1 != 1) goto L6;
    L8:
        this.b = false;
    L10:
        if (r0 == true) goto L12;
    L19:
        return false;
    L12:
        if (this.a != null) goto L15;
        this.a = new ma0(r5.getContext(), r5, this.g);
    L15:
        if (this.c == true) goto L19;
        if (this.a.p(r7) == false) goto L19;
        return true;
    L6:
        if (r1 == 3) goto L8;
    L9:
        r0 = r5.o(r6, (int) r7.getX(), (int) r7.getY());
        this.b = r0;
        goto L10
    }

    @Override // defpackage.wd
    public final boolean g(CoordinatorLayout r3, View r4, int r5) {
        WeakHashMap r32 = ja0.a;
        if (s90.c(r4) != 0) goto L7;
        s90.s(r4, 1);
        ja0.i(r4, 1048576);
        ja0.g(r4, 0);
        if (r(r4) == false) goto L7;
        ja0.j(r4, h0.j, new l0(26, this));
    L7:
        return false;
    }

    @Override // defpackage.wd
    public final boolean q(View r2, MotionEvent r3) {
        if (this.a != null) goto L5;
        return false;
    L5:
        if (this.c == true) goto L7;
    L8:
        this.a.j(r3);
        return true;
    L7:
        if (r3.getActionMasked() != 3) goto L8;
        return true;
    }

    public boolean r(View r1) {
        return true;
    }
}
