package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v6 extends p000.y8 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final p000.x1 f1095;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final p000.fa f1096;

    public static class a extends java.io.IOException {
        public a() {
                r1 = this;
                java.lang.String r0 = "Received response with 0 content-length header."
                r1.<init>(r0)
                return
        }
    }

    public v6(p000.x1 r1, p000.fa r2) {
            r0 = this;
            r0.<init>()
            r0.f1095 = r1
            r0.f1096 = r2
            return
    }

    @Override // p000.y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo94(p000.w8 r2) {
            r1 = this;
            android.net.Uri r2 = r2.f1130
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "http"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L19
            java.lang.String r0 = "https"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L17
            goto L19
        L17:
            r2 = 0
            goto L1a
        L19:
            r2 = 1
        L1a:
            return r2
    }

    @Override // p000.y8
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final int mo435() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // p000.y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final ۟.y8.a mo95(p000.w8 r10) {
            r9 = this;
            ۟.z7$e r0 = ۟.z7.e.f1271
            ۟.z7$e r1 = ۟.z7.e.f1272
            ۟.x1 r2 = r9.f1095
            android.net.Uri r3 = r10.f1130
            int r10 = r10.f1129
            ۟.x1$a r10 = r2.mo458(r3, r10)
            r2 = 0
            if (r10 != 0) goto L12
            return r2
        L12:
            boolean r3 = r10.f1163
            if (r3 == 0) goto L18
            r3 = r0
            goto L19
        L18:
            r3 = r1
        L19:
            java.io.InputStream r4 = r10.f1162
            if (r4 != 0) goto L1e
            return r2
        L1e:
            r5 = 0
            if (r3 != r0) goto L34
            long r7 = r10.f1164
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L29
            goto L34
        L29:
            java.lang.StringBuilder r10 = p000.ic.f502
            r4.close()     // Catch: java.io.IOException -> L2e
        L2e:
            ۟.v6$a r10 = new ۟.v6$a
            r10.<init>()
            throw r10
        L34:
            if (r3 != r1) goto L4c
            long r0 = r10.f1164
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 <= 0) goto L4c
            ۟.fa r10 = r9.f1096
            ۟.fa$a r10 = r10.f365
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 4
            android.os.Message r0 = r10.obtainMessage(r1, r0)
            r10.sendMessage(r0)
        L4c:
            ۟.y8$a r10 = new ۟.y8$a
            r10.<init>(r4, r3)
            return r10
    }

    @Override // p000.y8
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final boolean mo436(android.net.NetworkInfo r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }
}
