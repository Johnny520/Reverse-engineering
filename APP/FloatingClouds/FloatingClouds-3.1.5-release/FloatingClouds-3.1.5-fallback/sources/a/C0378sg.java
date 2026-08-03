package a;

/* JADX INFO: renamed from: a.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0378sg extends a.C0414ug.b<java.lang.CharSequence> {
    @Override // a.C0414ug.b
    public final java.lang.CharSequence a(android.view.View r1) {
            r0 = this;
            java.lang.CharSequence r1 = a.C0414ug.i.b(r1)
            return r1
    }

    @Override // a.C0414ug.b
    public final void b(android.view.View r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            a.C0414ug.i.e(r1, r2)
            return
    }

    @Override // a.C0414ug.b
    public final boolean d(java.lang.CharSequence r1, java.lang.CharSequence r2) {
            r0 = this;
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            r1 = r1 ^ 1
            return r1
    }
}
