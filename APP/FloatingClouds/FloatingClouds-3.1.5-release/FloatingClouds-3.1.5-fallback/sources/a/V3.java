package a;

/* JADX INFO: loaded from: classes.dex */
public final class V3 implements a.InterfaceC0359rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299a;

    public /* synthetic */ V3(int r1) {
            r0 = this;
            r0.f299a = r1
            r0.<init>()
            return
    }

    @Override // a.InterfaceC0359rf
    public final android.widget.TextView a(android.app.Activity r8, android.view.View r9) {
            r7 = this;
            r0 = 0
            java.lang.String r1 = "rootView"
            int r2 = r7.f299a
            a.C0193i9.e(r9, r1)
            switch(r2) {
                case 0: goto L94;
                case 1: goto L1f;
                default: goto Lb;
            }
        Lb:
            a.qf r0 = a.C0342qf.f660a
            r0.getClass()
            int r8 = a.C0342qf.b(r8)
            a.U3 r0 = new a.U3
            r1 = 1
            r0.<init>(r8, r1)
            android.widget.TextView r8 = a.C0282n9.q(r9, r0)
            return r8
        L1f:
            android.content.res.Resources r8 = r8.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            r1 = 80
            float r1 = (float) r1
            float r1 = r1 * r8
            int r1 = (int) r1
            r2 = 16
            float r2 = (float) r2
            float r2 = r2 * r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            a.Fc r3 = new a.Fc
            r3.<init>(r2, r1, r8)
            a.C0282n9.k(r9, r3)
            java.util.Iterator r2 = r8.iterator()
            boolean r8 = r2.hasNext()
            if (r8 != 0) goto L4b
            r8 = 0
            goto L91
        L4b:
            java.lang.Object r8 = r2.next()
            boolean r9 = r2.hasNext()
            if (r9 != 0) goto L56
            goto L91
        L56:
            r9 = r8
            android.widget.TextView r9 = (android.widget.TextView) r9
            r3 = 2
            int[] r1 = new int[r3]
            r9.getLocationOnScreen(r1)     // Catch: java.lang.Throwable -> L62
            a.Wf r9 = a.Wf.f330a     // Catch: java.lang.Throwable -> L62
            goto L67
        L62:
            r9 = move-exception
            a.wd$a r9 = a.C0465xd.a(r9)
        L67:
            a.Wf r4 = a.Wf.f330a
            boolean r9 = r9 instanceof a.C0447wd.a
            r9 = r1[r0]
        L6d:
            java.lang.Object r1 = r2.next()
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            int[] r5 = new int[r3]
            r4.getLocationOnScreen(r5)     // Catch: java.lang.Throwable -> L7c
            a.Wf r4 = a.Wf.f330a     // Catch: java.lang.Throwable -> L7c
            goto L81
        L7c:
            r4 = move-exception
            a.wd$a r4 = a.C0465xd.a(r4)
        L81:
            a.Wf r6 = a.Wf.f330a
            boolean r4 = r4 instanceof a.C0447wd.a
            r4 = r5[r0]
            if (r9 <= r4) goto L8b
            r8 = r1
            r9 = r4
        L8b:
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L6d
        L91:
            android.widget.TextView r8 = (android.widget.TextView) r8
            return r8
        L94:
            a.qf r1 = a.C0342qf.f660a
            r1.getClass()
            int r8 = a.C0342qf.b(r8)
            a.U3 r1 = new a.U3
            r1.<init>(r8, r0)
            android.widget.TextView r8 = a.C0282n9.q(r9, r1)
            return r8
    }
}
