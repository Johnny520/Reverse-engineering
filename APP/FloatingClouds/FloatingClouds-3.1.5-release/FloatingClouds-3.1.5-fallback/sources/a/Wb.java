package a;

/* JADX INFO: loaded from: classes.dex */
public final class Wb extends a.AbstractC0407u9 implements a.InterfaceC0369s7 {
    public final /* synthetic */ int b;
    public final /* synthetic */ androidx.activity.OnBackPressedDispatcher c;

    public /* synthetic */ Wb(androidx.activity.OnBackPressedDispatcher r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.c = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r5 = this;
            int r0 = r5.b
            switch(r0) {
                case 0: goto L3e;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            androidx.activity.OnBackPressedDispatcher r0 = r5.c
            r0.b()
            a.Wf r0 = a.Wf.f330a
            return r0
        Ld:
            androidx.activity.OnBackPressedDispatcher r0 = r5.c
            a.Ub r1 = r0.c
            r2 = 0
            if (r1 != 0) goto L34
            a.F1<a.Ub> r1 = r0.b
            int r3 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r3)
        L1e:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.previous()
            r4 = r3
            a.Ub r4 = (a.Ub) r4
            boolean r4 = r4.f292a
            if (r4 == 0) goto L1e
            goto L31
        L30:
            r3 = r2
        L31:
            r1 = r3
            a.Ub r1 = (a.Ub) r1
        L34:
            r0.c = r2
            if (r1 == 0) goto L3b
            r1.a()
        L3b:
            a.Wf r0 = a.Wf.f330a
            return r0
        L3e:
            androidx.activity.OnBackPressedDispatcher r0 = r5.c
            r0.b()
            a.Wf r0 = a.Wf.f330a
            return r0
    }
}
