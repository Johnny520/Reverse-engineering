package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends p000.e {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ۟.s2.a f971;

    public static final class a extends java.lang.ThreadLocal<java.util.Random> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final java.util.Random initialValue() {
                r1 = this;
                java.util.Random r0 = new java.util.Random
                r0.<init>()
                return r0
        }
    }

    public s2() {
            r1 = this;
            r1.<init>()
            ۟.s2$a r0 = new ۟.s2$a
            r0.<init>()
            r1.f971 = r0
            return
    }

    @Override // p000.e
    /* JADX INFO: renamed from: ۥ۟۠ */
    public final java.util.Random mo130() {
            r2 = this;
            ۟.s2$a r0 = r2.f971
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "get(...)"
            p000.h4.m188(r1, r0)
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }
}
