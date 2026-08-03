package a;

/* JADX INFO: renamed from: a.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0225k6 extends a.AbstractC0469y {
    public final a.C0225k6.a c;

    /* JADX INFO: renamed from: a.k6$a */
    public static final class a extends java.lang.ThreadLocal<java.util.Random> {
        @Override // java.lang.ThreadLocal
        public final java.util.Random initialValue() {
                r1 = this;
                java.util.Random r0 = new java.util.Random
                r0.<init>()
                return r0
        }
    }

    public C0225k6() {
            r1 = this;
            r1.<init>()
            a.k6$a r0 = new a.k6$a
            r0.<init>()
            r1.c = r0
            return
    }

    @Override // a.AbstractC0469y
    public final java.util.Random a() {
            r2 = this;
            a.k6$a r0 = r2.c
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "get(...)"
            a.C0193i9.d(r0, r1)
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }
}
