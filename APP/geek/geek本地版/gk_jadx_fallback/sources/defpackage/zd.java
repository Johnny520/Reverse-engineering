package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zd extends android.view.ViewGroup.MarginLayoutParams {
    public defpackage.wd a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public int i;
    public int j;
    public android.view.View k;
    public android.view.View l;
    public boolean m;
    public boolean n;
    public final android.graphics.Rect o;

    public zd() {
            r2 = this;
            r0 = -2
            r2.<init>(r0, r0)
            r0 = 0
            r2.b = r0
            r2.c = r0
            r2.d = r0
            r1 = -1
            r2.e = r1
            r2.f = r1
            r2.g = r0
            r2.h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.o = r0
            return
    }

    public zd(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r7.<init>(r8, r9)
            r0 = 0
            r7.b = r0
            r7.c = r0
            r7.d = r0
            r1 = -1
            r7.e = r1
            r7.f = r1
            r7.g = r0
            r7.h = r0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r7.o = r2
            int[] r2 = defpackage.sy.b
            android.content.res.TypedArray r2 = r8.obtainStyledAttributes(r9, r2)
            int r3 = r2.getInteger(r0, r0)
            r7.c = r3
            r3 = 1
            int r4 = r2.getResourceId(r3, r1)
            r7.f = r4
            r4 = 2
            int r4 = r2.getInteger(r4, r0)
            r7.d = r4
            r4 = 6
            int r1 = r2.getInteger(r4, r1)
            r7.e = r1
            r1 = 5
            int r1 = r2.getInt(r1, r0)
            r7.g = r1
            r1 = 4
            int r1 = r2.getInt(r1, r0)
            r7.h = r1
            r1 = 3
            boolean r4 = r2.hasValue(r1)
            r7.b = r4
            if (r4 == 0) goto Lf2
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.t
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L61
            r8 = 0
            goto Ldb
        L61:
            java.lang.String r4 = "."
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L7d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r8.getPackageName()
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            goto La0
        L7d:
            r4 = 46
            int r5 = r1.indexOf(r4)
            if (r5 < 0) goto L86
            goto La0
        L86:
            java.lang.String r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.t
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto La0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r4)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
        La0:
            java.lang.ThreadLocal r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.v     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r5 = r4.get()     // Catch: java.lang.Exception -> Lb3
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> Lb3
            if (r5 != 0) goto Lb5
            java.util.HashMap r5 = new java.util.HashMap     // Catch: java.lang.Exception -> Lb3
            r5.<init>()     // Catch: java.lang.Exception -> Lb3
            r4.set(r5)     // Catch: java.lang.Exception -> Lb3
            goto Lb5
        Lb3:
            r8 = move-exception
            goto Lde
        Lb5:
            java.lang.Object r4 = r5.get(r1)     // Catch: java.lang.Exception -> Lb3
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4     // Catch: java.lang.Exception -> Lb3
            if (r4 != 0) goto Ld1
            java.lang.ClassLoader r4 = r8.getClassLoader()     // Catch: java.lang.Exception -> Lb3
            java.lang.Class r0 = java.lang.Class.forName(r1, r0, r4)     // Catch: java.lang.Exception -> Lb3
            java.lang.Class[] r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.u     // Catch: java.lang.Exception -> Lb3
            java.lang.reflect.Constructor r4 = r0.getConstructor(r4)     // Catch: java.lang.Exception -> Lb3
            r4.setAccessible(r3)     // Catch: java.lang.Exception -> Lb3
            r5.put(r1, r4)     // Catch: java.lang.Exception -> Lb3
        Ld1:
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r8 = r4.newInstance(r8)     // Catch: java.lang.Exception -> Lb3
            wd r8 = (defpackage.wd) r8     // Catch: java.lang.Exception -> Lb3
        Ldb:
            r7.a = r8
            goto Lf2
        Lde:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not inflate Behavior subclass "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0, r8)
            throw r9
        Lf2:
            r2.recycle()
            wd r8 = r7.a
            if (r8 == 0) goto Lfc
            r8.c(r7)
        Lfc:
            return
    }

    public zd(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.b = r2
            r1.c = r2
            r1.d = r2
            r0 = -1
            r1.e = r0
            r1.f = r0
            r1.g = r2
            r1.h = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.o = r2
            return
    }

    public zd(android.view.ViewGroup.MarginLayoutParams r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.b = r2
            r1.c = r2
            r1.d = r2
            r0 = -1
            r1.e = r0
            r1.f = r0
            r1.g = r2
            r1.h = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.o = r2
            return
    }

    public zd(defpackage.zd r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.b = r2
            r1.c = r2
            r1.d = r2
            r0 = -1
            r1.e = r0
            r1.f = r0
            r1.g = r2
            r1.h = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.o = r2
            return
    }

    public final boolean a(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r2 = 0
            return r2
        L7:
            boolean r2 = r1.n
            return r2
        La:
            boolean r2 = r1.m
            return r2
    }
}
