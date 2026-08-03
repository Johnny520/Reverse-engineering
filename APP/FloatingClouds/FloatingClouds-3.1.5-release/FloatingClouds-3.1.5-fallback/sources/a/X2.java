package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X2 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f332a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ X2(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f332a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r2, boolean r3) {
            r1 = this;
            int r0 = r1.f332a
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r3 = r1.b
            a.D7 r3 = (a.D7) r3
            r3.f(r2)
            return
        L11:
            java.lang.Object r0 = r1.b
            com.google.android.material.chip.Chip r0 = (com.google.android.material.chip.Chip) r0
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.i
            if (r0 == 0) goto L1c
            r0.onCheckedChanged(r2, r3)
        L1c:
            return
    }
}
