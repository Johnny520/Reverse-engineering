package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ii extends android.text.Editable.Factory {
    public static final java.lang.Object a = null;
    public static volatile defpackage.ii b;
    public static java.lang.Class c;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ii.a = r0
            return
    }

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.Class r0 = defpackage.ii.c
            if (r0 == 0) goto La
            d40 r1 = new d40
            r1.<init>(r0, r3)
            return r1
        La:
            android.text.Editable r3 = super.newEditable(r3)
            return r3
    }
}
