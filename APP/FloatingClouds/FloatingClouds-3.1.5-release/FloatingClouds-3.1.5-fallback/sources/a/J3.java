package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class J3 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133a;
    public final /* synthetic */ java.lang.String b;

    public /* synthetic */ J3(java.lang.String r1, int r2) {
            r0 = this;
            r0.f133a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            java.lang.String r1 = "chain"
            int r2 = r6.f133a
            switch(r2) {
                case 0: goto Lf1;
                case 1: goto Lca;
                default: goto L8;
            }
        L8:
            io.github.libxposed.api.XposedInterface$Chain r7 = (io.github.libxposed.api.XposedInterface.Chain) r7
            a.C0193i9.e(r7, r1)
            java.lang.Object r7 = r7.proceed()
            boolean r1 = r7 instanceof java.util.List
            if (r1 == 0) goto L19
            r1 = r7
            java.util.List r1 = (java.util.List) r1
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L1e
            goto Lc9
        L1e:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            boolean r2 = a.K3.a.l()
            if (r2 == 0) goto Lc9
            a.jc r2 = a.K3.a.i()
            boolean r2 = r2.p
            if (r2 != 0) goto L33
            goto Lc9
        L33:
            java.util.ArrayList r2 = a.K3.a.f()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = a.C0312p3.g0(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r2.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r4 = (top.mmjz.floatingclouds.bean.MaskItemBean) r4
            java.lang.String r4 = r4.getMaskId()
            r3.add(r4)
            goto L46
        L5a:
            java.util.HashSet r2 = a.C0383t3.u0(r3)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L65
            goto Lc9
        L65:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r3 = r1.size()
            r7.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L72:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r3.next()
            if (r4 == 0) goto L72
            java.lang.String r5 = r4.toString()
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L72
            r7.add(r4)
            goto L72
        L8c:
            int r2 = r7.size()
            int r3 = r1.size()
            if (r2 == r3) goto Lc9
            int r1 = r1.size()
            int r2 = r7.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "HideContactLabel: "
            r3.<init>(r4)
            java.lang.String r4 = r6.b
            r3.append(r4)
            java.lang.String r4 = "() filtered: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " → "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.b(r0)
        Lc9:
            return r7
        Lca:
            java.lang.String r2 = r6.b
            io.github.libxposed.api.XposedInterface$Chain r7 = (io.github.libxposed.api.XposedInterface.Chain) r7
            a.C0193i9.e(r7, r1)
            java.lang.Object r7 = r7.proceed()
            a.x8 r1 = a.C0460x8.f762a
            boolean r1 = a.C0460x8.a()
            if (r1 == 0) goto Lf0
            a.C0366s4.H = r0
            java.lang.String r1 = "[ChatInfoWhitelist] 临时解除期间打开聊天信息页: "
            java.lang.String r1 = r1.concat(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.b(r0)
        Lf0:
            return r7
        Lf1:
            top.mmjz.floatingclouds.bean.MaskItemBean r7 = (top.mmjz.floatingclouds.bean.MaskItemBean) r7
            java.lang.String r0 = "it"
            a.C0193i9.e(r7, r0)
            java.lang.String r7 = r7.getMaskId()
            java.lang.String r0 = r6.b
            boolean r7 = a.C0193i9.a(r7, r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
    }
}
