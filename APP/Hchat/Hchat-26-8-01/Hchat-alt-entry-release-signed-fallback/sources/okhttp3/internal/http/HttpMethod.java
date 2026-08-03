package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpMethod {
    public static final okhttp3.internal.http.HttpMethod INSTANCE = null;

    static {
            okhttp3.internal.http.HttpMethod r0 = new okhttp3.internal.http.HttpMethod
            r0.<init>()
            okhttp3.internal.http.HttpMethod.INSTANCE = r0
            return
    }

    private HttpMethod() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final boolean permitsRequestBody(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "GET"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "HEAD"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static final boolean requiresRequestBody(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "POST"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "PUT"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "PATCH"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "PROPPATCH"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "REPORT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2c
            goto L2e
        L2c:
            r1 = 0
            return r1
        L2e:
            r1 = 1
            return r1
    }

    public final boolean invalidatesCache(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "POST"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "PATCH"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "PUT"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "DELETE"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = "MOVE"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2c
            goto L2e
        L2c:
            r2 = 0
            return r2
        L2e:
            r2 = 1
            return r2
    }

    public final boolean redirectsToGet(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "PROPFIND"
            boolean r2 = r2.equals(r0)
            r2 = r2 ^ 1
            return r2
    }

    public final boolean redirectsWithBody(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "PROPFIND"
            boolean r2 = r2.equals(r0)
            return r2
    }
}
