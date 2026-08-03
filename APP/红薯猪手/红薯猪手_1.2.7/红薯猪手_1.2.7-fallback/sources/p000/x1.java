package p000;

/* JADX INFO: loaded from: classes.dex */
public interface x1 {

    public static class a {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.io.InputStream f1162;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean f1163;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f1164;

        public a(java.io.InputStream r1, boolean r2, long r3) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto Lc
                r0.f1162 = r1
                r0.f1163 = r2
                r0.f1164 = r3
                return
            Lc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Stream may not be null."
                r1.<init>(r2)
                throw r1
        }
    }

    public static class b extends java.io.IOException {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final boolean f1165;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f1166;

        public b(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1)
                boolean r1 = p000.c4.m101(r2)
                r0.f1165 = r1
                r0.f1166 = r3
                return
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    ۟.x1.a mo458(android.net.Uri r1, int r2);
}
