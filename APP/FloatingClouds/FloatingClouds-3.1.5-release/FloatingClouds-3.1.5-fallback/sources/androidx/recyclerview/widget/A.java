package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends androidx.recyclerview.widget.RecyclerView.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f951a;
    public final androidx.recyclerview.widget.A.a b;

    public class a extends androidx.recyclerview.widget.RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f952a;
        public final /* synthetic */ androidx.recyclerview.widget.A b;

        public a(androidx.recyclerview.widget.A r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r1 = 0
                r0.f952a = r1
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void a(androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                if (r2 != 0) goto Le
                boolean r1 = r0.f952a
                if (r1 == 0) goto Le
                r1 = 0
                r0.f952a = r1
                androidx.recyclerview.widget.A r1 = r0.b
                r1.b()
            Le:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void b(androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                if (r2 != 0) goto L6
                if (r3 == 0) goto L5
                goto L6
            L5:
                return
            L6:
                r1 = 1
                r0.f952a = r1
                return
        }
    }

    public A() {
            r1 = this;
            r1.<init>()
            androidx.recyclerview.widget.A$a r0 = new androidx.recyclerview.widget.A$a
            r0.<init>(r1)
            r1.b = r0
            return
    }

    public abstract int[] a(androidx.recyclerview.widget.RecyclerView.l r1, android.view.View r2);

    public final void b() {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.f951a
            if (r0 != 0) goto L5
            goto L40
        L5:
            androidx.recyclerview.widget.RecyclerView$l r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            goto L40
        Lc:
            r1 = r5
            androidx.recyclerview.widget.u r1 = (androidx.recyclerview.widget.u) r1
            boolean r2 = r0.e()
            if (r2 == 0) goto L1e
            androidx.recyclerview.widget.s r1 = r1.f(r0)
            android.view.View r1 = androidx.recyclerview.widget.u.d(r0, r1)
            goto L2e
        L1e:
            boolean r2 = r0.d()
            if (r2 == 0) goto L2d
            androidx.recyclerview.widget.s r1 = r1.e(r0)
            android.view.View r1 = androidx.recyclerview.widget.u.d(r0, r1)
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 != 0) goto L31
            goto L40
        L31:
            int[] r0 = r5.a(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L41
            r4 = r0[r3]
            if (r4 == 0) goto L40
            goto L41
        L40:
            return
        L41:
            androidx.recyclerview.widget.RecyclerView r4 = r5.f951a
            r0 = r0[r3]
            r4.g0(r2, r0, r1)
            return
    }
}
