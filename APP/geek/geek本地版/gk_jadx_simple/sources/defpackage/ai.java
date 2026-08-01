package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class ai {
    public int a;
    public final Object b;
    public final Object c;

    public ai(nz r2) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = r2;
    }

    public static ai a(nz r1, int r2) {
        if (r2 == 0) goto L10;
        if (r2 != 1) goto L8;
        return new ex(r1, 1);
    L8:
        throw new IllegalArgumentException("invalid orientation");
    L10:
        return new ex(r1, 0);
    }

    public abstract int b(View r1);

    public abstract int c(View r1);

    public abstract int d(View r1);

    public abstract int e(View r1);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View r1);

    public abstract int n(View r1);

    public abstract void o(int r1);

    public ai(di r2) {
        this.a = 0;
        this.c = new mf();
        this.b = r2;
    }
}
