package a;

/* JADX INFO: renamed from: a.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0223k4 implements a.InterfaceC0369s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f542a;
    public final /* synthetic */ a.C0366s4 b;

    public /* synthetic */ C0223k4(a.C0366s4 r1, int r2) {
            r0 = this;
            r0.f542a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r4 = this;
            r0 = 0
            r1 = 10
            int r2 = r4.f542a
            switch(r2) {
                case 0: goto L1b8;
                case 1: goto L17f;
                case 2: goto L146;
                case 3: goto Lbd;
                case 4: goto L84;
                case 5: goto L46;
                default: goto L8;
            }
        L8:
            a.s4$a$a$a r2 = a.C0366s4.a.C0005a.EnumC0006a.c
            a.s4 r3 = r4.b
            r3.z(r0, r2)
            java.lang.ClassLoader r0 = r3.k
            if (r0 != 0) goto L16
            a.Wf r0 = a.Wf.f330a
            goto L45
        L16:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            java.util.ArrayList r2 = a.K3.a.f()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = a.C0312p3.g0(r2, r1)
            r3.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            r3.add(r2)
            goto L2c
        L40:
            a.C0435w1.V(r0, r3)
            a.Wf r0 = a.Wf.f330a
        L45:
            return r0
        L46:
            a.s4$a$a$a r2 = a.C0366s4.a.C0005a.EnumC0006a.b
            a.s4 r3 = r4.b
            r3.z(r0, r2)
            java.lang.ClassLoader r0 = r3.k
            if (r0 != 0) goto L54
            a.Wf r0 = a.Wf.f330a
            goto L83
        L54:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            java.util.ArrayList r2 = a.K3.a.f()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = a.C0312p3.g0(r2, r1)
            r3.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r1.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            r3.add(r2)
            goto L6a
        L7e:
            a.C0435w1.V(r0, r3)
            a.Wf r0 = a.Wf.f330a
        L83:
            return r0
        L84:
            a.s4 r0 = r4.b
            java.lang.ClassLoader r0 = r0.k
            if (r0 != 0) goto L8d
            a.Wf r0 = a.Wf.f330a
            goto Lbc
        L8d:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            java.util.ArrayList r2 = a.K3.a.f()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = a.C0312p3.g0(r2, r1)
            r3.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        La3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r1.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            r3.add(r2)
            goto La3
        Lb7:
            a.C0435w1.V(r0, r3)
            a.Wf r0 = a.Wf.f330a
        Lbc:
            return r0
        Lbd:
            a.s4 r1 = r4.b
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r2 = r1.n
            r2.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r2 = r1.o
            r2.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Integer> r2 = r1.p
            r2.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Long> r2 = r1.r
            r2.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.String> r2 = r1.s
            r2.clear()
            java.util.concurrent.atomic.AtomicInteger r2 = r1.t
            r2.set(r0)
            java.util.Map<java.lang.Object, java.lang.String> r0 = r1.w
            r0.clear()
            a.x8 r0 = a.C0460x8.f762a
            a.ca$b r0 = a.C0460x8.b
            a.ca$b r2 = a.C0086ca.b.f424a
            if (r0 != r2) goto L10e
            a.s4$a$a$a r0 = a.C0366s4.a.C0005a.EnumC0006a.f680a
            r2 = 1
            r1.z(r2, r0)
            r3 = 0
            r1.y(r2, r0, r3)
            java.lang.ref.WeakReference<android.widget.ListView> r0 = r1.j
            if (r0 == 0) goto L143
            java.lang.Object r0 = r0.get()
            android.widget.ListView r0 = (android.widget.ListView) r0
            if (r0 == 0) goto L143
            android.os.IBinder r2 = r0.getWindowToken()
            if (r2 == 0) goto L143
            android.widget.ListAdapter r0 = r0.getAdapter()
            r1.t(r0)
            goto L143
        L10e:
            a.s4$a$a r0 = a.C0366s4.a.C0005a.f679a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[HideMainUI] onMaskListChanged: skip re-hide (state="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0282n9.t(r0)
            java.lang.ref.WeakReference<android.widget.ListView> r0 = r1.j
            if (r0 == 0) goto L143
            java.lang.Object r0 = r0.get()
            android.widget.ListView r0 = (android.widget.ListView) r0
            if (r0 == 0) goto L143
            android.os.IBinder r2 = r0.getWindowToken()
            if (r2 == 0) goto L143
            android.widget.ListAdapter r0 = r0.getAdapter()
            r1.t(r0)
        L143:
            a.Wf r0 = a.Wf.f330a
            return r0
        L146:
            a.s4 r0 = r4.b
            java.lang.ClassLoader r0 = r0.k
            if (r0 != 0) goto L14f
            a.Wf r0 = a.Wf.f330a
            goto L17e
        L14f:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            java.util.ArrayList r2 = a.K3.a.f()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = a.C0312p3.g0(r2, r1)
            r3.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L165:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L179
            java.lang.Object r2 = r1.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            r3.add(r2)
            goto L165
        L179:
            a.C0435w1.V(r0, r3)
            a.Wf r0 = a.Wf.f330a
        L17e:
            return r0
        L17f:
            a.s4 r0 = r4.b
            java.lang.ClassLoader r0 = r0.k
            if (r0 != 0) goto L188
            a.Wf r0 = a.Wf.f330a
            goto L1b7
        L188:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            java.util.ArrayList r2 = a.K3.a.f()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = a.C0312p3.g0(r2, r1)
            r3.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L19e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b2
            java.lang.Object r2 = r1.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            r3.add(r2)
            goto L19e
        L1b2:
            a.C0435w1.V(r0, r3)
            a.Wf r0 = a.Wf.f330a
        L1b7:
            return r0
        L1b8:
            a.s4 r0 = r4.b
            java.lang.ClassLoader r0 = r0.k
            if (r0 != 0) goto L1c1
            a.Wf r0 = a.Wf.f330a
            goto L1f0
        L1c1:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            java.util.ArrayList r2 = a.K3.a.f()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = a.C0312p3.g0(r2, r1)
            r3.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L1d7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1eb
            java.lang.Object r2 = r1.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            r3.add(r2)
            goto L1d7
        L1eb:
            a.C0435w1.V(r0, r3)
            a.Wf r0 = a.Wf.f330a
        L1f0:
            return r0
    }
}
