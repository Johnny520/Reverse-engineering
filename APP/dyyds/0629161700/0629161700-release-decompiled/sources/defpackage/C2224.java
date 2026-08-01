package defpackage;

/* JADX INFO: renamed from: ᲈᛴᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2224 extends android.text.Editable.Factory {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.Class f9484;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.Object f9485 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static volatile defpackage.C2224 f9486;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.C2224.f9485 = r0
            return
    }

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.Class r0 = defpackage.C2224.f9484
            if (r0 == 0) goto La
            ᛴᛷᲁᛱ r1 = new ᛴᛷᲁᛱ
            r1.<init>(r0, r2)
            return r1
        La:
            android.text.Editable r1 = super.newEditable(r2)
            return r1
    }
}
