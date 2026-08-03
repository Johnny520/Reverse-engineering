package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Credentials {
    public static final okhttp3.Credentials INSTANCE = null;

    static {
            okhttp3.Credentials r0 = new okhttp3.Credentials
            r0.<init>()
            okhttp3.Credentials.INSTANCE = r0
            return
    }

    private Credentials() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.String basic(java.lang.String r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            r0 = 0
            r1 = 4
            java.lang.String r2 = basic$default(r2, r3, r0, r1, r0)
            return r2
    }

    public static final java.lang.String basic(java.lang.String r1, java.lang.String r2, java.nio.charset.Charset r3) {
            r1.getClass()
            r2.getClass()
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            okio.ByteString r1 = r2.encodeString(r1, r3)
            java.lang.String r1 = r1.base64()
            java.lang.String r2 = "Basic "
            java.lang.String r1 = wb.en.g(r2, r1)
            return r1
    }

    public static /* synthetic */ java.lang.String basic$default(java.lang.String r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L9
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2.getClass()
        L9:
            java.lang.String r0 = basic(r0, r1, r2)
            return r0
    }
}
