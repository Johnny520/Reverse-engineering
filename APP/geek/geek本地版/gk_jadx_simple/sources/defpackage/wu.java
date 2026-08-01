package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class wu {
    public final Context a;
    public final ku b;
    public final boolean c;
    public final int d;
    public View e;
    public int f;
    public boolean g;
    public cv h;
    public tu i;
    public PopupWindow.OnDismissListener j;
    public final uu k;

    public wu(Context r1, ku r2, View r3, boolean r4, int r5, int r6) {
        this.f = 8388611;
        this.k = new uu(this);
        this.a = r1;
        this.b = r2;
        this.e = r3;
        this.c = r4;
        this.d = r5;
    }

    public final tu a() {
        if (this.i != null) goto L10;
        Context r1 = this.a;
        Display r0 = ((WindowManager) r1.getSystemService("window")).getDefaultDisplay();
        Point r2 = new Point();
        vu.a(r0, r2);
        if (Math.min(r2.x, r2.y) < r1.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) goto L7;
        tu r02 = new t8(r1, this.e, this.d, this.c);
    L8:
        r02.l(this.b);
        r02.r(this.k);
        r02.n(this.e);
        r02.e(this.h);
        r02.o(this.g);
        r02.p(this.f);
        this.i = r02;
        goto L10
    L7:
        View r8 = this.e;
        int r9 = this.d;
        boolean r10 = this.c;
        r02 = new q40(this.a, this.b, r8, r9, r10);
    L10:
        return this.i;
    }

    public final boolean b() {
        tu r0 = this.i;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.b() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener r0 = this.j;
        if (r0 == null) goto L6;
        r0.onDismiss();
        return;
    }

    public final void d(int r4, int r5, boolean r6, boolean r7) {
        tu r0 = a();
        r0.s(r7);
        if (r6 == false) goto L8;
        int r62 = this.f;
        View r72 = this.e;
        WeakHashMap r1 = ja0.a;
        if ((Gravity.getAbsoluteGravity(r62, t90.d(r72)) & 7) != 5) goto L7;
        r4 = r4 - this.e.getWidth();
    L7:
        r0.q(r4);
        r0.t(r5);
        int r63 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
        r0.a = new Rect(r4 - r63, r5 - r63, r4 + r63, r5 + r63);
    L8:
        r0.f();
    }
}
