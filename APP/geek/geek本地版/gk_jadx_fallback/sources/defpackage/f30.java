package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f30 {
    public defpackage.ip a;
    public defpackage.ip b;
    public defpackage.ip c;
    public defpackage.ip d;
    public defpackage.de e;
    public defpackage.de f;
    public defpackage.de g;
    public defpackage.de h;
    public defpackage.vh i;
    public defpackage.vh j;
    public defpackage.vh k;
    public defpackage.vh l;

    public f30() {
            r2 = this;
            r2.<init>()
            h10 r0 = new h10
            r0.<init>()
            r2.a = r0
            h10 r0 = new h10
            r0.<init>()
            r2.b = r0
            h10 r0 = new h10
            r0.<init>()
            r2.c = r0
            h10 r0 = new h10
            r0.<init>()
            r2.d = r0
            e r0 = new e
            r1 = 0
            r0.<init>(r1)
            r2.e = r0
            e r0 = new e
            r0.<init>(r1)
            r2.f = r0
            e r0 = new e
            r0.<init>(r1)
            r2.g = r0
            e r0 = new e
            r0.<init>(r1)
            r2.h = r0
            vh r0 = new vh
            r1 = 0
            r0.<init>(r1)
            r2.i = r0
            vh r0 = new vh
            r0.<init>(r1)
            r2.j = r0
            vh r0 = new vh
            r0.<init>(r1)
            r2.k = r0
            vh r0 = new vh
            r0.<init>(r1)
            r2.l = r0
            return
    }

    public static defpackage.e30 a(android.content.Context r6, int r7, int r8, defpackage.e r9) {
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r6, r7)
            if (r8 == 0) goto Ld
            android.view.ContextThemeWrapper r6 = new android.view.ContextThemeWrapper
            r6.<init>(r0, r8)
            r0 = r6
        Ld:
            int[] r6 = defpackage.wy.v
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6)
            r7 = 0
            int r7 = r6.getInt(r7, r7)     // Catch: java.lang.Throwable -> L70
            r8 = 3
            int r8 = r6.getInt(r8, r7)     // Catch: java.lang.Throwable -> L70
            r0 = 4
            int r0 = r6.getInt(r0, r7)     // Catch: java.lang.Throwable -> L70
            r1 = 2
            int r1 = r6.getInt(r1, r7)     // Catch: java.lang.Throwable -> L70
            r2 = 1
            int r7 = r6.getInt(r2, r7)     // Catch: java.lang.Throwable -> L70
            r2 = 5
            de r9 = c(r6, r2, r9)     // Catch: java.lang.Throwable -> L70
            r2 = 8
            de r2 = c(r6, r2, r9)     // Catch: java.lang.Throwable -> L70
            r3 = 9
            de r3 = c(r6, r3, r9)     // Catch: java.lang.Throwable -> L70
            r4 = 7
            de r4 = c(r6, r4, r9)     // Catch: java.lang.Throwable -> L70
            r5 = 6
            de r9 = c(r6, r5, r9)     // Catch: java.lang.Throwable -> L70
            e30 r5 = new e30     // Catch: java.lang.Throwable -> L70
            r5.<init>()     // Catch: java.lang.Throwable -> L70
            ip r8 = defpackage.gt.h(r8)     // Catch: java.lang.Throwable -> L70
            r5.a = r8     // Catch: java.lang.Throwable -> L70
            r5.e = r2     // Catch: java.lang.Throwable -> L70
            ip r8 = defpackage.gt.h(r0)     // Catch: java.lang.Throwable -> L70
            r5.b = r8     // Catch: java.lang.Throwable -> L70
            r5.f = r3     // Catch: java.lang.Throwable -> L70
            ip r8 = defpackage.gt.h(r1)     // Catch: java.lang.Throwable -> L70
            r5.c = r8     // Catch: java.lang.Throwable -> L70
            r5.g = r4     // Catch: java.lang.Throwable -> L70
            ip r7 = defpackage.gt.h(r7)     // Catch: java.lang.Throwable -> L70
            r5.d = r7     // Catch: java.lang.Throwable -> L70
            r5.h = r9     // Catch: java.lang.Throwable -> L70
            r6.recycle()
            return r5
        L70:
            r7 = move-exception
            r6.recycle()
            throw r7
    }

    public static defpackage.e30 b(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
            e r0 = new e
            r1 = 0
            float r2 = (float) r1
            r0.<init>(r2)
            int[] r2 = defpackage.wy.p
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r2, r5, r6)
            int r5 = r4.getResourceId(r1, r1)
            r6 = 1
            int r6 = r4.getResourceId(r6, r1)
            r4.recycle()
            e30 r3 = a(r3, r5, r6, r0)
            return r3
    }

    public static defpackage.de c(android.content.res.TypedArray r2, int r3, defpackage.de r4) {
            android.util.TypedValue r3 = r2.peekValue(r3)
            if (r3 != 0) goto L7
            goto L30
        L7:
            int r0 = r3.type
            r1 = 5
            if (r0 != r1) goto L21
            e r4 = new e
            int r3 = r3.data
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = android.util.TypedValue.complexToDimensionPixelSize(r3, r2)
            float r2 = (float) r2
            r4.<init>(r2)
            return r4
        L21:
            r2 = 6
            if (r0 != r2) goto L30
            l00 r2 = new l00
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.getFraction(r4, r4)
            r2.<init>(r3)
            return r2
        L30:
            return r4
    }

    public final boolean d(android.graphics.RectF r6) {
            r5 = this;
            vh r0 = r5.l
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<vh> r1 = defpackage.vh.class
            boolean r0 = r0.equals(r1)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L36
            vh r0 = r5.j
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            vh r0 = r5.i
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            vh r0 = r5.k
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            r0 = r3
            goto L37
        L36:
            r0 = r2
        L37:
            de r1 = r5.e
            float r1 = r1.a(r6)
            de r4 = r5.f
            float r4 = r4.a(r6)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L5d
            de r4 = r5.h
            float r4 = r4.a(r6)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L5d
            de r4 = r5.g
            float r6 = r4.a(r6)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L5d
            r6 = r3
            goto L5e
        L5d:
            r6 = r2
        L5e:
            ip r1 = r5.b
            boolean r1 = r1 instanceof defpackage.h10
            if (r1 == 0) goto L78
            ip r1 = r5.a
            boolean r1 = r1 instanceof defpackage.h10
            if (r1 == 0) goto L78
            ip r1 = r5.c
            boolean r1 = r1 instanceof defpackage.h10
            if (r1 == 0) goto L78
            ip r1 = r5.d
            boolean r1 = r1 instanceof defpackage.h10
            if (r1 == 0) goto L78
            r1 = r3
            goto L79
        L78:
            r1 = r2
        L79:
            if (r0 == 0) goto L80
            if (r6 == 0) goto L80
            if (r1 == 0) goto L80
            return r3
        L80:
            return r2
    }

    public final defpackage.e30 e() {
            r2 = this;
            e30 r0 = new e30
            r0.<init>()
            ip r1 = r2.a
            r0.a = r1
            ip r1 = r2.b
            r0.b = r1
            ip r1 = r2.c
            r0.c = r1
            ip r1 = r2.d
            r0.d = r1
            de r1 = r2.e
            r0.e = r1
            de r1 = r2.f
            r0.f = r1
            de r1 = r2.g
            r0.g = r1
            de r1 = r2.h
            r0.h = r1
            vh r1 = r2.i
            r0.i = r1
            vh r1 = r2.j
            r0.j = r1
            vh r1 = r2.k
            r0.k = r1
            vh r1 = r2.l
            r0.l = r1
            return r0
    }
}
