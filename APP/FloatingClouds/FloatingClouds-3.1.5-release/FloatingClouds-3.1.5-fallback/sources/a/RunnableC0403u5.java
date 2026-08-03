package a;

/* JADX INFO: renamed from: a.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0403u5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f708a;
    public final /* synthetic */ top.mmjz.floatingclouds.plugin.IPlugin b;

    public /* synthetic */ RunnableC0403u5(top.mmjz.floatingclouds.plugin.IPlugin r1, int r2) {
            r0 = this;
            r0.f708a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            r0 = 400(0x190, double:1.976E-321)
            java.lang.String r2 = " checks)"
            r3 = 8
            r4 = 1
            int r5 = r7.f708a
            switch(r5) {
                case 0: goto L138;
                case 1: goto La2;
                default: goto Lc;
            }
        Lc:
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.o2 r5 = (a.C0293o2) r5
            java.lang.Runnable r5 = r5.f
            if (r7 == r5) goto L16
            goto La1
        L16:
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.o2 r5 = (a.C0293o2) r5
            int r5 = r5.g
            top.mmjz.floatingclouds.plugin.IPlugin r6 = r7.b
            a.o2 r6 = (a.C0293o2) r6
            int r5 = r5 + r4
            r6.g = r5
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.o2 r5 = (a.C0293o2) r5
            r5.getClass()
            boolean r5 = a.C0293o2.e()
            if (r5 == 0) goto L8b
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.o2 r5 = (a.C0293o2) r5
            boolean r5 = r5.f615a
            if (r5 == 0) goto L8b
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.o2 r5 = (a.C0293o2) r5
            int r5 = r5.g
            if (r5 <= r3) goto L41
            goto L8b
        L41:
            top.mmjz.floatingclouds.plugin.IPlugin r3 = r7.b
            a.o2 r3 = (a.C0293o2) r3
            r3.l()
            top.mmjz.floatingclouds.plugin.IPlugin r3 = r7.b
            a.o2 r3 = (a.C0293o2) r3
            java.util.LinkedHashSet r3 = r3.c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L7a
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.o2 r0 = (a.C0293o2) r0
            r0.k()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.o2 r0 = (a.C0293o2) r0
            r0.j()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.o2 r0 = (a.C0293o2) r0
            int r0 = r0.g
            java.lang.String r1 = "BoldBottomTab: fast-recheck: all read, bold reset (after "
            java.lang.String r0 = a.C0487z.c(r0, r1, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
            goto La1
        L7a:
            top.mmjz.floatingclouds.plugin.IPlugin r2 = r7.b
            a.o2 r2 = (a.C0293o2) r2
            r2.k()
            top.mmjz.floatingclouds.plugin.IPlugin r2 = r7.b
            a.o2 r2 = (a.C0293o2) r2
            android.os.Handler r2 = r2.e
            r2.postDelayed(r7, r0)
            goto La1
        L8b:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.o2 r0 = (a.C0293o2) r0
            r0.j()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.o2 r0 = (a.C0293o2) r0
            boolean r0 = r0.f615a
            if (r0 == 0) goto La1
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.o2 r0 = (a.C0293o2) r0
            r0.i()
        La1:
            return
        La2:
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.v5 r5 = (a.C0421v5) r5
            java.lang.Runnable r5 = r5.e
            if (r7 == r5) goto Lac
            goto L137
        Lac:
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.v5 r5 = (a.C0421v5) r5
            int r5 = r5.f
            top.mmjz.floatingclouds.plugin.IPlugin r6 = r7.b
            a.v5 r6 = (a.C0421v5) r6
            int r5 = r5 + r4
            r6.f = r5
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.v5 r5 = (a.C0421v5) r5
            r5.getClass()
            boolean r5 = a.C0421v5.f()
            if (r5 == 0) goto L121
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.v5 r5 = (a.C0421v5) r5
            boolean r5 = r5.f732a
            if (r5 == 0) goto L121
            top.mmjz.floatingclouds.plugin.IPlugin r5 = r7.b
            a.v5 r5 = (a.C0421v5) r5
            int r5 = r5.f
            if (r5 <= r3) goto Ld7
            goto L121
        Ld7:
            top.mmjz.floatingclouds.plugin.IPlugin r3 = r7.b
            a.v5 r3 = (a.C0421v5) r3
            r3.l()
            top.mmjz.floatingclouds.plugin.IPlugin r3 = r7.b
            a.v5 r3 = (a.C0421v5) r3
            java.util.LinkedHashSet r3 = r3.b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L110
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.k()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.j()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            int r0 = r0.f
            java.lang.String r1 = "DotIndicator: fast-recheck: all read, dot hidden (after "
            java.lang.String r0 = a.C0487z.c(r0, r1, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
            goto L137
        L110:
            top.mmjz.floatingclouds.plugin.IPlugin r2 = r7.b
            a.v5 r2 = (a.C0421v5) r2
            r2.k()
            top.mmjz.floatingclouds.plugin.IPlugin r2 = r7.b
            a.v5 r2 = (a.C0421v5) r2
            android.os.Handler r2 = r2.d
            r2.postDelayed(r7, r0)
            goto L137
        L121:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.j()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            boolean r0 = r0.f732a
            if (r0 == 0) goto L137
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.i()
        L137:
            return
        L138:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            java.lang.Runnable r0 = r0.e
            if (r7 == r0) goto L142
            goto L1f9
        L142:
            a.x8 r0 = a.C0460x8.f762a
            boolean r0 = a.C0460x8.a()
            r1 = 5000(0x1388, double:2.4703E-320)
            if (r0 == 0) goto L157
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            android.os.Handler r0 = r0.d
            r0.postDelayed(r7, r1)
            goto L1f9
        L157:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            int r0 = r0.f
            top.mmjz.floatingclouds.plugin.IPlugin r3 = r7.b
            a.v5 r3 = (a.C0421v5) r3
            int r0 = r0 + r4
            r3.f = r0
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            int r0 = r0.f
            r3 = 60
            if (r0 > r3) goto L170
            r1 = 1000(0x3e8, double:4.94E-321)
        L170:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.getClass()
            boolean r0 = a.C0421v5.f()
            if (r0 == 0) goto L1f2
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            boolean r0 = r0.f732a
            if (r0 != 0) goto L186
            goto L1f2
        L186:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.l()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            java.util.LinkedHashSet r0 = r0.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e1
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.k()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.j()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            int r0 = r0.f
            if (r0 > r3) goto L1b2
            java.lang.String r0 = "fast"
            goto L1b4
        L1b2:
            java.lang.String r0 = "slow"
        L1b4:
            top.mmjz.floatingclouds.plugin.IPlugin r1 = r7.b
            a.v5 r1 = (a.C0421v5) r1
            int r1 = r1.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DotIndicator: DB checker: all read, dot hidden (after "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " checks, "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
            goto L1f9
        L1e1:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.k()
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            android.os.Handler r0 = r0.d
            r0.postDelayed(r7, r1)
            goto L1f9
        L1f2:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r7.b
            a.v5 r0 = (a.C0421v5) r0
            r0.j()
        L1f9:
            return
    }
}
