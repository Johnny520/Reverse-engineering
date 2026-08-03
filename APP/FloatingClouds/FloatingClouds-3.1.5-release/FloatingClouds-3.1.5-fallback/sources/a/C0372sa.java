package a;

/* JADX INFO: renamed from: a.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0372sa implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f684a;
    public final /* synthetic */ a.D7<java.lang.Integer, a.Wf> b;

    public C0372sa(android.widget.TextView r1, a.D7<? super java.lang.Integer, a.Wf> r2) {
            r0 = this;
            r0.<init>()
            r0.f684a = r1
            r0.b = r2
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar r2, int r3, boolean r4) {
            r1 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r0 = "%"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.widget.TextView r0 = r1.f684a
            r0.setText(r2)
            if (r4 == 0) goto L21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            a.D7<java.lang.Integer, a.Wf> r3 = r1.b
            r3.f(r2)
        L21:
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            return
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar r1) {
            r0 = this;
            return
    }
}
