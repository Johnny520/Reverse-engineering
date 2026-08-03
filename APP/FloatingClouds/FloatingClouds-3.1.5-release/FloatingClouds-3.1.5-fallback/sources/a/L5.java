package a;

/* JADX INFO: loaded from: classes.dex */
public final class L5 extends android.text.Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f161a = null;
    public static volatile a.L5 b;
    public static java.lang.Class<?> c;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.L5.f161a = r0
            return
    }

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.Class<?> r0 = a.L5.c
            if (r0 == 0) goto La
            a.ne r1 = new a.ne
            r1.<init>(r0, r3)
            return r1
        La:
            android.text.Editable r3 = super.newEditable(r3)
            return r3
    }
}
