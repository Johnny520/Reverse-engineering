package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ja implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.datepicker.c f139a;

    public Ja(com.google.android.material.datepicker.c r1) {
            r0 = this;
            r0.<init>()
            r0.f139a = r1
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            com.google.android.material.datepicker.c r4 = r3.f139a
            com.google.android.material.datepicker.c$d r0 = r4.b0
            com.google.android.material.datepicker.c$d r1 = com.google.android.material.datepicker.c.d.b
            com.google.android.material.datepicker.c$d r2 = com.google.android.material.datepicker.c.d.f1071a
            if (r0 != r1) goto Le
            r4.H(r2)
            return
        Le:
            if (r0 != r2) goto L13
            r4.H(r1)
        L13:
            return
    }
}
