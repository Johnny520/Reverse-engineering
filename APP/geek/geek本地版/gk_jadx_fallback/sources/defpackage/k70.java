package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k70 implements defpackage.hf {
    public androidx.appcompat.widget.Toolbar a;
    public int b;
    public android.view.View c;
    public android.graphics.drawable.Drawable d;
    public android.graphics.drawable.Drawable e;
    public android.graphics.drawable.Drawable f;
    public boolean g;
    public java.lang.CharSequence h;
    public java.lang.CharSequence i;
    public java.lang.CharSequence j;
    public android.view.Window.Callback k;
    public boolean l;
    public defpackage.j1 m;
    public int n;
    public android.graphics.drawable.Drawable o;

    public final void a(int r5) {
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.a
            int r1 = r4.b
            r1 = r1 ^ r5
            r4.b = r5
            if (r1 == 0) goto L5c
            r2 = r1 & 4
            r3 = 0
            if (r2 == 0) goto L29
            r2 = r5 & 4
            if (r2 == 0) goto L15
            r4.b()
        L15:
            int r2 = r4.b
            r2 = r2 & 4
            if (r2 == 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.f
            if (r2 == 0) goto L20
            goto L22
        L20:
            android.graphics.drawable.Drawable r2 = r4.o
        L22:
            r0.setNavigationIcon(r2)
            goto L29
        L26:
            r0.setNavigationIcon(r3)
        L29:
            r2 = r1 & 3
            if (r2 == 0) goto L30
            r4.c()
        L30:
            r2 = r1 & 8
            if (r2 == 0) goto L49
            r2 = r5 & 8
            if (r2 == 0) goto L43
            java.lang.CharSequence r2 = r4.h
            r0.setTitle(r2)
            java.lang.CharSequence r2 = r4.i
            r0.setSubtitle(r2)
            goto L49
        L43:
            r0.setTitle(r3)
            r0.setSubtitle(r3)
        L49:
            r1 = r1 & 16
            if (r1 == 0) goto L5c
            android.view.View r1 = r4.c
            if (r1 == 0) goto L5c
            r5 = r5 & 16
            if (r5 == 0) goto L59
            r0.addView(r1)
            return
        L59:
            r0.removeView(r1)
        L5c:
            return
    }

    public final void b() {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.a
            int r1 = r2.b
            r1 = r1 & 4
            if (r1 == 0) goto L1b
            java.lang.CharSequence r1 = r2.j
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L16
            int r1 = r2.n
            r0.setNavigationContentDescription(r1)
            return
        L16:
            java.lang.CharSequence r1 = r2.j
            r0.setNavigationContentDescription(r1)
        L1b:
            return
    }

    public final void c() {
            r2 = this;
            int r0 = r2.b
            r1 = r0 & 2
            if (r1 == 0) goto L15
            r0 = r0 & 1
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r2.e
            if (r0 == 0) goto Lf
            goto L16
        Lf:
            android.graphics.drawable.Drawable r0 = r2.d
            goto L16
        L12:
            android.graphics.drawable.Drawable r0 = r2.d
            goto L16
        L15:
            r0 = 0
        L16:
            androidx.appcompat.widget.Toolbar r1 = r2.a
            r1.setLogo(r0)
            return
    }
}
