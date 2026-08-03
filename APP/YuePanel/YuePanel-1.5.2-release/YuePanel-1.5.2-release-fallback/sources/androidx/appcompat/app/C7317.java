package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7317 implements android.widget.AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final androidx.appcompat.app.AbstractC7267.InterfaceC7272 f25265;

    public C7317(androidx.appcompat.app.AbstractC7267.InterfaceC7272 r1) {
            r0 = this;
            r0.<init>()
            r0.f25265 = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.app.ۥ$ۥ۟۟۟۟ r1 = r0.f25265
            if (r1 == 0) goto L7
            r1.m27898(r3, r4)
        L7:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }
}
