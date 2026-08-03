package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Xb extends a.S7 implements a.InterfaceC0369s7 {
    public final /* synthetic */ int i;

    public /* synthetic */ Xb(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6) {
            r0 = this;
            r0.i = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r1 = this;
            int r0 = r1.i
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            androidx.activity.OnBackPressedDispatcher r0 = (androidx.activity.OnBackPressedDispatcher) r0
            r0.d()
            a.Wf r0 = a.Wf.f330a
            return r0
        Lf:
            java.lang.Object r0 = r1.b
            androidx.activity.OnBackPressedDispatcher r0 = (androidx.activity.OnBackPressedDispatcher) r0
            r0.d()
            a.Wf r0 = a.Wf.f330a
            return r0
    }
}
