package p000;

/* JADX INFO: renamed from: ny */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0603ny extends android.text.Editable.Factory {

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object f7814 = null;

    /* JADX INFO: renamed from: β */
    public static volatile p000.C0603ny f7815;

    /* JADX INFO: renamed from: γ */
    public static java.lang.Class f7816;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.C0603ny.f7814 = r0
            return
    }

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Class r0 = p000.C0603ny.f7816
            if (r0 == 0) goto La
            xx1 r1 = new xx1
            r1.<init>(r0, r2)
            return r1
        La:
            android.text.Editable r1 = super.newEditable(r2)
            return r1
    }
}
