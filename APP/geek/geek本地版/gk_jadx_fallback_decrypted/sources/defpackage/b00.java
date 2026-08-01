package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class b00 {
    public static final java.util.List s = null;
    public final android.view.View a;
    public java.lang.ref.WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public defpackage.b00 h;
    public defpackage.b00 i;
    public int j;
    public final java.util.ArrayList k;
    public final java.util.List l;
    public int m;
    public defpackage.tz n;
    public boolean o;
    public int p;
    public int q;
    public androidx.recyclerview.widget.RecyclerView r;

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            defpackage.b00.s = r0
            return
    }

    public b00(android.view.View r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.c = r0
            r3.d = r0
            r1 = -1
            r3.e = r1
            r3.f = r0
            r3.g = r0
            r1 = 0
            r3.h = r1
            r3.i = r1
            r3.k = r1
            r3.l = r1
            r2 = 0
            r3.m = r2
            r3.n = r1
            r3.o = r2
            r3.p = r2
            r3.q = r0
            if (r4 == 0) goto L29
            r3.a = r4
            return
        L29:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "itemView may not be null"
            r4.<init>(r0)
            throw r4
    }

    public final void a(int r2) {
            r1 = this;
            int r0 = r1.j
            r2 = r2 | r0
            r1.j = r2
            return
    }

    public final int b() {
            r2 = this;
            int r0 = r2.g
            r1 = -1
            if (r0 != r1) goto L7
            int r0 = r2.c
        L7:
            return r0
    }

    public final java.util.List c() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = r1.k
            if (r0 == 0) goto L14
            int r0 = r0.size()
            if (r0 != 0) goto L11
            goto L14
        L11:
            java.util.List r0 = r1.l
            return r0
        L14:
            java.util.List r0 = defpackage.b00.s
            return r0
    }

    public final boolean d() {
            r2 = this;
            android.view.View r0 = r2.a
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L12
            android.view.ViewParent r0 = r0.getParent()
            androidx.recyclerview.widget.RecyclerView r1 = r2.r
            if (r0 == r1) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean e() {
            r2 = this;
            int r0 = r2.j
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    public final boolean f() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean g() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 16
            if (r0 != 0) goto L12
            java.util.WeakHashMap r0 = defpackage.ja0.a
            android.view.View r0 = r1.a
            boolean r0 = defpackage.s90.i(r0)
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean h() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 8
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean i() {
            r1 = this;
            tz r0 = r1.n
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean j() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean k() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 2
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final void l(int r3, boolean r4) {
            r2 = this;
            int r0 = r2.d
            r1 = -1
            if (r0 != r1) goto L9
            int r0 = r2.c
            r2.d = r0
        L9:
            int r0 = r2.g
            if (r0 != r1) goto L11
            int r0 = r2.c
            r2.g = r0
        L11:
            if (r4 == 0) goto L18
            int r4 = r2.g
            int r4 = r4 + r3
            r2.g = r4
        L18:
            int r4 = r2.c
            int r4 = r4 + r3
            r2.c = r4
            android.view.View r3 = r2.a
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            if (r4 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            r4 = 1
            r3.c = r4
        L2e:
            return
    }

    public final void m() {
            r4 = this;
            r0 = 0
            r4.j = r0
            r1 = -1
            r4.c = r1
            r4.d = r1
            r2 = -1
            r4.e = r2
            r4.g = r1
            r4.m = r0
            r2 = 0
            r4.h = r2
            r4.i = r2
            java.util.ArrayList r2 = r4.k
            if (r2 == 0) goto L1c
            r2.clear()
        L1c:
            int r2 = r4.j
            r2 = r2 & (-1025(0xfffffffffffffbff, float:NaN))
            r4.j = r2
            r4.p = r0
            r4.q = r1
            androidx.recyclerview.widget.RecyclerView.j(r4)
            return
    }

    public final void n(boolean r3) {
            r2 = this;
            r0 = 1
            int r1 = r2.m
            if (r3 == 0) goto L7
            int r1 = r1 - r0
            goto L8
        L7:
            int r1 = r1 + r0
        L8:
            r2.m = r1
            if (r1 >= 0) goto L23
            r3 = 0
            r2.m = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "View"
            android.util.Log.e(r0, r3)
            return
        L23:
            if (r3 != 0) goto L2e
            if (r1 != r0) goto L2e
            int r3 = r2.j
            r3 = r3 | 16
            r2.j = r3
            return
        L2e:
            if (r3 == 0) goto L38
            if (r1 != 0) goto L38
            int r3 = r2.j
            r3 = r3 & (-17)
            r2.j = r3
        L38:
            return
    }

    public final boolean o() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean p() {
            r1 = this;
            int r0 = r1.j
            r0 = r0 & 32
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r0.isAnonymousClass()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "ViewHolder"
            goto L15
        Ld:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "{"
            r2.append(r0)
            int r0 = r5.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r2.append(r0)
            java.lang.String r0 = " position="
            r2.append(r0)
            int r0 = r5.c
            r2.append(r0)
            java.lang.String r0 = " id="
            r2.append(r0)
            long r3 = r5.e
            r2.append(r3)
            java.lang.String r0 = ", oldPos="
            r2.append(r0)
            int r0 = r5.d
            r2.append(r0)
            java.lang.String r0 = ", pLpos:"
            r2.append(r0)
            int r0 = r5.g
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            boolean r0 = r5.i()
            if (r0 == 0) goto L75
            java.lang.String r0 = " scrap "
            r1.append(r0)
            boolean r0 = r5.o
            if (r0 == 0) goto L70
            java.lang.String r0 = "[changeScrap]"
            goto L72
        L70:
            java.lang.String r0 = "[attachedScrap]"
        L72:
            r1.append(r0)
        L75:
            boolean r0 = r5.f()
            if (r0 == 0) goto L80
            java.lang.String r0 = " invalid"
            r1.append(r0)
        L80:
            boolean r0 = r5.e()
            if (r0 != 0) goto L8b
            java.lang.String r0 = " unbound"
            r1.append(r0)
        L8b:
            int r0 = r5.j
            r0 = r0 & 2
            if (r0 == 0) goto L96
            java.lang.String r0 = " update"
            r1.append(r0)
        L96:
            boolean r0 = r5.h()
            if (r0 == 0) goto La1
            java.lang.String r0 = " removed"
            r1.append(r0)
        La1:
            boolean r0 = r5.o()
            if (r0 == 0) goto Lac
            java.lang.String r0 = " ignored"
            r1.append(r0)
        Lac:
            boolean r0 = r5.j()
            if (r0 == 0) goto Lb7
            java.lang.String r0 = " tmpDetached"
            r1.append(r0)
        Lb7:
            boolean r0 = r5.g()
            if (r0 != 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = " not recyclable("
            r0.<init>(r2)
            int r2 = r5.m
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
        Ld5:
            int r0 = r5.j
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 != 0) goto Le1
            boolean r0 = r5.f()
            if (r0 == 0) goto Le6
        Le1:
            java.lang.String r0 = " undefined adapter position"
            r1.append(r0)
        Le6:
            android.view.View r0 = r5.a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto Lf3
            java.lang.String r0 = " no parent"
            r1.append(r0)
        Lf3:
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
