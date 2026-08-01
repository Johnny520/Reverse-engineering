package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h40 {
    public static final defpackage.qh l = null;
    public static final defpackage.qh m = null;
    public static final defpackage.qh n = null;
    public static final defpackage.qh o = null;
    public static final defpackage.qh p = null;
    public static final defpackage.qh q = null;
    public static final defpackage.qh r = null;
    public static final defpackage.qh s = null;
    public float a;
    public float b;
    public final java.lang.Object c;
    public final defpackage.ip d;
    public boolean e;
    public long f;
    public float g;
    public final java.util.ArrayList h;
    public final java.util.ArrayList i;
    public defpackage.i40 j;
    public float k;

    static {
            qh r0 = new qh
            r1 = 1
            r0.<init>(r1)
            defpackage.h40.l = r0
            qh r0 = new qh
            r1 = 2
            r0.<init>(r1)
            defpackage.h40.m = r0
            qh r0 = new qh
            r1 = 3
            r0.<init>(r1)
            defpackage.h40.n = r0
            qh r0 = new qh
            r1 = 4
            r0.<init>(r1)
            defpackage.h40.o = r0
            qh r0 = new qh
            r1 = 5
            r0.<init>(r1)
            defpackage.h40.p = r0
            qh r0 = new qh
            r1 = 6
            r0.<init>(r1)
            defpackage.h40.q = r0
            qh r0 = new qh
            r1 = 7
            r0.<init>(r1)
            defpackage.h40.r = r0
            qh r0 = new qh
            r1 = 0
            r0.<init>(r1)
            defpackage.h40.s = r0
            return
    }

    public h40(java.lang.Object r4, defpackage.ip r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.b = r0
            r1 = 0
            r3.e = r1
            r1 = 0
            r3.f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.h = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.i = r1
            r3.c = r4
            r3.d = r5
            qh r4 = defpackage.h40.p
            if (r5 == r4) goto L4b
            qh r4 = defpackage.h40.q
            if (r5 == r4) goto L4b
            qh r4 = defpackage.h40.r
            if (r5 != r4) goto L31
            goto L4b
        L31:
            qh r4 = defpackage.h40.s
            r1 = 998244352(0x3b800000, float:0.00390625)
            if (r5 != r4) goto L3a
            r3.g = r1
            goto L50
        L3a:
            qh r4 = defpackage.h40.n
            if (r5 == r4) goto L48
            qh r4 = defpackage.h40.o
            if (r5 != r4) goto L43
            goto L48
        L43:
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.g = r4
            goto L50
        L48:
            r3.g = r1
            goto L50
        L4b:
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r3.g = r4
        L50:
            r4 = 0
            r3.j = r4
            r3.k = r0
            return
    }

    public final void a(defpackage.sh r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.h
            boolean r1 = r0.contains(r3)
            if (r1 != 0) goto Lb
            r0.add(r3)
        Lb:
            return
    }

    public final void b(float r4) {
            r3 = this;
            boolean r0 = r3.e
            if (r0 == 0) goto L7
            r3.k = r4
            return
        L7:
            i40 r0 = r3.j
            if (r0 != 0) goto L12
            i40 r0 = new i40
            r0.<init>(r4)
            r3.j = r0
        L12:
            i40 r0 = r3.j
            double r1 = (double) r4
            r0.i = r1
            r3.h()
            return
    }

    public final void c() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L13
            boolean r0 = r2.e
            if (r0 == 0) goto L12
            r0 = 1
            r2.d(r0)
        L12:
            return
        L13:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Animations may only be canceled on the main thread"
            r0.<init>(r1)
            throw r0
    }

    public final void d(boolean r6) {
            r5 = this;
            r6 = 0
            r5.e = r6
            java.lang.ThreadLocal r0 = defpackage.p2.f
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L13
            p2 r1 = new p2
            r1.<init>()
            r0.set(r1)
        L13:
            java.lang.Object r0 = r0.get()
            p2 r0 = (defpackage.p2) r0
            u30 r1 = r0.a
            r1.remove(r5)
            java.util.ArrayList r1 = r0.b
            int r2 = r1.indexOf(r5)
            r3 = 1
            if (r2 < 0) goto L2d
            r4 = 0
            r1.set(r2, r4)
            r0.e = r3
        L2d:
            r0 = 0
            r5.f = r0
        L31:
            java.util.ArrayList r0 = r5.h
            int r1 = r0.size()
            if (r6 >= r1) goto L4b
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L48
            java.lang.Object r0 = r0.get(r6)
            sh r0 = (defpackage.sh) r0
            r0.a()
        L48:
            int r6 = r6 + 1
            goto L31
        L4b:
            int r6 = r0.size()
            int r6 = r6 - r3
        L50:
            if (r6 < 0) goto L5e
            java.lang.Object r1 = r0.get(r6)
            if (r1 != 0) goto L5b
            r0.remove(r6)
        L5b:
            int r6 = r6 + (-1)
            goto L50
        L5e:
            return
    }

    public final void e(defpackage.sh r3) {
            r2 = this;
            java.util.ArrayList r0 = r2.h
            int r3 = r0.indexOf(r3)
            if (r3 < 0) goto Lc
            r1 = 0
            r0.set(r3, r1)
        Lc:
            return
    }

    public final void f(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8
            r1.g = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Minimum visible change must be positive."
            r2.<init>(r0)
            throw r2
    }

    public final void g(float r5) {
            r4 = this;
            ip r0 = r4.d
            java.lang.Object r1 = r4.c
            r0.V(r1, r5)
            r5 = 0
        L8:
            java.util.ArrayList r0 = r4.i
            int r1 = r0.size()
            if (r5 >= r1) goto L4b
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L48
            java.lang.Object r0 = r0.get(r5)
            l9 r0 = (defpackage.l9) r0
            float r1 = r4.b
            float r2 = r4.a
            int r3 = r0.a
            java.lang.Object r0 = r0.b
            switch(r3) {
                case 0: goto L3f;
                default: goto L27;
            }
        L27:
            android.view.View r0 = (android.view.View) r0
            float r1 = java.lang.Math.abs(r2)
            r2 = 1163575296(0x455ac000, float:3500.0)
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r2
            r2 = 1069547520(0x3fc00000, float:1.5)
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r1 = r2
        L3b:
            r0.setScaleX(r1)
            goto L48
        L3f:
            i00 r0 = (defpackage.i00) r0
            java.lang.Object r0 = r0.b
            android.view.View r0 = (android.view.View) r0
            r0.setScaleY(r1)
        L48:
            int r5 = r5 + 1
            goto L8
        L4b:
            int r5 = r0.size()
            int r5 = r5 + (-1)
        L51:
            if (r5 < 0) goto L5f
            java.lang.Object r1 = r0.get(r5)
            if (r1 != 0) goto L5c
            r0.remove(r5)
        L5c:
            int r5 = r5 + (-1)
            goto L51
        L5f:
            return
    }

    public final void h() {
            r7 = this;
            i40 r0 = r7.j
            if (r0 == 0) goto Lb4
            double r1 = r0.i
            float r1 = (float) r1
            double r1 = (double) r1
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            double r4 = (double) r3
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto Lac
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            double r5 = (double) r4
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto La4
            float r1 = r7.g
            r2 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r2
            double r1 = (double) r1
            double r1 = java.lang.Math.abs(r1)
            r0.d = r1
            r5 = 4633992910331707392(0x404f400000000000, double:62.5)
            double r1 = r1 * r5
            r0.e = r1
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L9c
            boolean r0 = r7.e
            if (r0 != 0) goto L9b
            if (r0 != 0) goto L9b
            r0 = 1
            r7.e = r0
            ip r0 = r7.d
            java.lang.Object r1 = r7.c
            float r0 = r0.y(r1)
            r7.b = r0
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 > 0) goto L93
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L93
            java.lang.ThreadLocal r0 = defpackage.p2.f
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L61
            p2 r1 = new p2
            r1.<init>()
            r0.set(r1)
        L61:
            java.lang.Object r0 = r0.get()
            p2 r0 = (defpackage.p2) r0
            java.util.ArrayList r1 = r0.b
            int r2 = r1.size()
            if (r2 != 0) goto L89
            r5 r2 = r0.d
            if (r2 != 0) goto L7c
            r5 r2 = new r5
            l0 r3 = r0.c
            r2.<init>(r3)
            r0.d = r2
        L7c:
            r5 r0 = r0.d
            java.lang.Object r2 = r0.c
            android.view.Choreographer r2 = (android.view.Choreographer) r2
            java.lang.Object r0 = r0.d
            o2 r0 = (defpackage.o2) r0
            r2.postFrameCallback(r0)
        L89:
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L9b
            r1.add(r7)
            return
        L93:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Starting value need to be in between min value and max value"
            r0.<init>(r1)
            throw r0
        L9b:
            return
        L9c:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Animations may only be started on the main thread"
            r0.<init>(r1)
            throw r0
        La4:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Final position of the spring cannot be less than the min value."
            r0.<init>(r1)
            throw r0
        Lac:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Final position of the spring cannot be greater than the max value."
            r0.<init>(r1)
            throw r0
        Lb4:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Incomplete SpringAnimation: Either final position or a spring force needs to be set."
            r0.<init>(r1)
            throw r0
    }
}
