package a;

/* JADX INFO: renamed from: a.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0277n4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f593a;

    public /* synthetic */ RunnableC0277n4(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f593a = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            boolean r0 = r4.f593a
            if (r0 == 0) goto L12
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            a.jc r1 = a.K3.a.i()
            boolean r1 = r1.q
            if (r1 != 0) goto L12
            goto L44
        L12:
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            java.util.ArrayList r1 = a.K3.a.f()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = a.C0312p3.g0(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r1.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r3 = (top.mmjz.floatingclouds.bean.MaskItemBean) r3
            java.lang.String r3 = r3.getMaskId()
            r2.add(r3)
            goto L2a
        L3e:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L45
        L44:
            return
        L45:
            r1 = 0
            a.C0134f4.a(r2, r0, r1)
            int r1 = r2.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[HideMainUI] applyNativeHide: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " wxids hide="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            return
    }
}
