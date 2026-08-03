package a;

/* JADX INFO: loaded from: classes.dex */
public final class Vb extends a.AbstractC0407u9 implements a.D7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ androidx.activity.OnBackPressedDispatcher c;

    public /* synthetic */ Vb(androidx.activity.OnBackPressedDispatcher r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.c = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.b
            switch(r0) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            a.R1 r5 = (a.R1) r5
            java.lang.String r0 = "backEvent"
            a.C0193i9.e(r5, r0)
            androidx.activity.OnBackPressedDispatcher r0 = r4.c
            a.Ub r1 = r0.c
            if (r1 != 0) goto L32
            a.F1<a.Ub> r0 = r0.b
            r0.getClass()
            int r1 = r0.c
            java.util.ListIterator r0 = r0.listIterator(r1)
        L1d:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.previous()
            r2 = r1
            a.Ub r2 = (a.Ub) r2
            boolean r2 = r2.f292a
            if (r2 == 0) goto L1d
            goto L30
        L2f:
            r1 = 0
        L30:
            a.Ub r1 = (a.Ub) r1
        L32:
            if (r1 == 0) goto L37
            r1.c(r5)
        L37:
            a.Wf r5 = a.Wf.f330a
            return r5
        L3a:
            a.R1 r5 = (a.R1) r5
            java.lang.String r0 = "backEvent"
            a.C0193i9.e(r5, r0)
            androidx.activity.OnBackPressedDispatcher r0 = r4.c
            a.F1<a.Ub> r1 = r0.b
            r1.getClass()
            int r2 = r1.c
            java.util.ListIterator r1 = r1.listIterator(r2)
        L4e:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r1.previous()
            r3 = r2
            a.Ub r3 = (a.Ub) r3
            boolean r3 = r3.f292a
            if (r3 == 0) goto L4e
            goto L61
        L60:
            r2 = 0
        L61:
            a.Ub r2 = (a.Ub) r2
            r0.c = r2
            if (r2 == 0) goto L6a
            r2.d(r5)
        L6a:
            a.Wf r5 = a.Wf.f330a
            return r5
    }
}
