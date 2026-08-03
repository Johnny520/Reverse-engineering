package a;

/* JADX INFO: loaded from: classes.dex */
@a.L4(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
public final class Cg extends a.AbstractC0429vd implements a.H7<a.Rd<? super android.view.View>, a.InterfaceC0042a4<? super a.Wf>, java.lang.Object>, a.Q7<java.lang.Object> {
    public final int b;
    public int c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ android.view.View e;

    public Cg(android.view.View r1, a.InterfaceC0042a4<? super a.Cg> r2) {
            r0 = this;
            r0.e = r1
            r0.<init>(r2)
            r1 = 2
            r0.b = r1
            return
    }

    @Override // a.Q7
    public final int b() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // a.H7
    public final java.lang.Object e(a.Rd<? super android.view.View> r1, a.InterfaceC0042a4<? super a.Wf> r2) {
            r0 = this;
            a.Rd r1 = (a.Rd) r1
            a.a4 r2 = (a.InterfaceC0042a4) r2
            a.a4 r1 = r0.g(r1, r2)
            a.Cg r1 = (a.Cg) r1
            a.Wf r2 = a.Wf.f330a
            java.lang.Object r1 = r1.h(r2)
            return r1
    }

    @Override // a.W1
    public final a.InterfaceC0042a4<a.Wf> g(java.lang.Object r3, a.InterfaceC0042a4<?> r4) {
            r2 = this;
            a.Cg r0 = new a.Cg
            android.view.View r1 = r2.e
            r0.<init>(r1, r4)
            r0.d = r3
            return r0
    }

    @Override // a.W1
    public final java.lang.Object h(java.lang.Object r6) {
            r5 = this;
            a.y4 r0 = a.EnumC0474y4.f767a
            int r1 = r5.c
            android.view.View r2 = r5.e
            r3 = 1
            if (r1 == 0) goto L48
            r4 = 2
            if (r1 == r3) goto L1a
            if (r1 != r4) goto L12
            a.C0465xd.b(r6)
            goto L45
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.d
            a.Rd r1 = (a.Rd) r1
            a.C0465xd.b(r6)
            boolean r6 = r2 instanceof android.view.ViewGroup
            if (r6 == 0) goto L45
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6 = 0
            r5.d = r6
            r5.c = r4
            r1.getClass()
            a.Gf r6 = new a.Gf
            a.G1 r3 = new a.G1
            r3.<init>(r2)
            r6.<init>(r3)
            java.lang.Object r6 = r1.b(r6, r5)
            if (r6 != r0) goto L40
            goto L42
        L40:
            a.Wf r6 = a.Wf.f330a
        L42:
            if (r6 != r0) goto L45
            return r0
        L45:
            a.Wf r6 = a.Wf.f330a
            return r6
        L48:
            a.C0465xd.b(r6)
            java.lang.Object r6 = r5.d
            a.Rd r6 = (a.Rd) r6
            r5.d = r6
            r5.c = r3
            r6.a(r2, r5)
            return r0
    }

    @Override // a.W1
    public final java.lang.String toString() {
            r2 = this;
            a.a4<java.lang.Object> r0 = r2.f313a
            if (r0 != 0) goto L13
            a.Uc r0 = a.Tc.f281a
            r0.getClass()
            java.lang.String r0 = a.Uc.a(r2)
            java.lang.String r1 = "renderLambdaToString(...)"
            a.C0193i9.d(r0, r1)
            return r0
        L13:
            java.lang.String r0 = super.toString()
            return r0
    }
}
