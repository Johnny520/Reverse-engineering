package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ri extends defpackage.ci {
    public final java.lang.ref.WeakReference a;

    public ri(android.widget.EditText r2) {
            r1 = this;
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.a = r0
            return
    }

    @Override // defpackage.ci
    public final void a() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.a
            java.lang.Object r0 = r0.get()
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1 = 1
            defpackage.si.a(r0, r1)
            return
    }
}
