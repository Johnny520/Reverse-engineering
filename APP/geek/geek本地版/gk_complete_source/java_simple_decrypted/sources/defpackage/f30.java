package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class f30 {
    public ip a;
    public ip b;
    public ip c;
    public ip d;
    public de e;
    public de f;
    public de g;
    public de h;
    public vh i;
    public vh j;
    public vh k;
    public vh l;

    public f30() {
        this.a = new h10();
        this.b = new h10();
        this.c = new h10();
        this.d = new h10();
        this.e = new e(0.0f);
        this.f = new e(0.0f);
        this.g = new e(0.0f);
        this.h = new e(0.0f);
        int r1 = 0;
        this.i = new vh(r1);
        this.j = new vh(r1);
        this.k = new vh(r1);
        this.l = new vh(r1);
    }

    public static e30 a(Context r6, int r7, int r8, e r9) {
        ContextThemeWrapper r0 = new ContextThemeWrapper(r6, r7);
        if (r8 == 0) goto L5;
        r0 = new ContextThemeWrapper(r0, r8);
    L5:
        TypedArray r62 = r0.obtainStyledAttributes(wy.v);
        int r72 = r62.getInt(0, 0);     // Catch: Throwable -> L9
        int r82 = r62.getInt(3, r72);     // Catch: Throwable -> L9
        int r02 = r62.getInt(4, r72);     // Catch: Throwable -> L9
        int r1 = r62.getInt(2, r72);     // Catch: Throwable -> L9
        int r73 = r62.getInt(1, r72);     // Catch: Throwable -> L9
        de r92 = c(r62, 5, r9);     // Catch: Throwable -> L9
        de r2 = c(r62, 8, r92);     // Catch: Throwable -> L9
        de r3 = c(r62, 9, r92);     // Catch: Throwable -> L9
        de r4 = c(r62, 7, r92);     // Catch: Throwable -> L9
        de r93 = c(r62, 6, r92);     // Catch: Throwable -> L9
        e30 r5 = new e30();     // Catch: Throwable -> L9
        r5.a = gt.h(r82);     // Catch: Throwable -> L9
        r5.e = r2;     // Catch: Throwable -> L9
        r5.b = gt.h(r02);     // Catch: Throwable -> L9
        r5.f = r3;     // Catch: Throwable -> L9
        r5.c = gt.h(r1);     // Catch: Throwable -> L9
        r5.g = r4;     // Catch: Throwable -> L9
        r5.d = gt.h(r73);     // Catch: Throwable -> L9
        r5.h = r93;     // Catch: Throwable -> L9
        r62.recycle();
        return r5;
    L9:
        th = move-exception;
        r62.recycle();
        throw th;
    }

    public static e30 b(Context r3, AttributeSet r4, int r5, int r6) {
        e r0 = new e(0);
        TypedArray r42 = r3.obtainStyledAttributes(r4, wy.p, r5, r6);
        int r52 = r42.getResourceId(0, 0);
        int r62 = r42.getResourceId(1, 0);
        r42.recycle();
        return a(r3, r52, r62, r0);
    }

    public static de c(TypedArray r2, int r3, de r4) {
        TypedValue r32 = r2.peekValue(r3);
        if (r32 == null) goto L13;
        int r0 = r32.type;
        if (r0 != 5) goto L10;
        return new e(TypedValue.complexToDimensionPixelSize(r32.data, r2.getResources().getDisplayMetrics()));
    L10:
        if (r0 != 6) goto L13;
        return new l00(r32.getFraction(1.0f, 1.0f));
    L13:
        return r4;
    }

    public final boolean d(RectF r6) {
        if (this.l.getClass().equals(vh.class) == true) goto L5;
    L11:
        boolean r0 = false;
    L12:
        float r1 = this.e.a(r6);
        if (this.f.a(r6) == r1) goto L15;
    L19:
        boolean r62 = false;
    L21:
        if ((this.b instanceof h10) == true) goto L23;
    L29:
        boolean r12 = false;
    L30:
        if (r0 == false) goto L34;
        if (r62 == false) goto L34;
        if (r12 == false) goto L34;
        return true;
    L34:
        return false;
    L23:
        if ((this.a instanceof h10) == false) goto L29;
        if ((this.c instanceof h10) == false) goto L29;
        if ((this.d instanceof h10) == false) goto L29;
        r12 = true;
        goto L30
    L15:
        if (this.h.a(r6) != r1) goto L19;
        if (this.g.a(r6) != r1) goto L19;
        r62 = true;
        goto L21
    L5:
        if (this.j.getClass().equals(vh.class) == false) goto L11;
        if (this.i.getClass().equals(vh.class) == false) goto L11;
        if (this.k.getClass().equals(vh.class) == false) goto L11;
        r0 = true;
        goto L12
    }

    public final e30 e() {
        e30 r0 = new e30();
        r0.a = this.a;
        r0.b = this.b;
        r0.c = this.c;
        r0.d = this.d;
        r0.e = this.e;
        r0.f = this.f;
        r0.g = this.g;
        r0.h = this.h;
        r0.i = this.i;
        r0.j = this.j;
        r0.k = this.k;
        r0.l = this.l;
        return r0;
    }
}
