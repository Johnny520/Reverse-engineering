package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v4 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.List<p000.w4> f1091;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.List<p000.w4> f1092;

    public static final class a {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static p000.v4 m434(org.json.JSONObject r8) {
                r0 = 4
                byte[] r1 = new byte[r0]
                r1 = {x0086: FILL_ARRAY_DATA , data: [-103, 5, -82, 20} // fill-array
                r2 = 6
                byte[] r3 = new byte[r2]
                r3 = {x008c: FILL_ARRAY_DATA , data: [-13, 118, -63, 122, -69, 37} // fill-array
                p000.oa.m332(r1, r3)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                byte[] r3 = new byte[r0]
                r3 = {x0094: FILL_ARRAY_DATA , data: [-31, -68, -79, -2} // fill-array
                byte[] r4 = new byte[r2]
                r4 = {x009a: FILL_ARRAY_DATA , data: [-119, -114, -121, -54, 107, 107} // fill-array
                java.lang.String r3 = p000.oa.m332(r3, r4)
                org.json.JSONArray r3 = r8.optJSONArray(r3)
                r4 = 0
                if (r3 == 0) goto L48
                int r5 = p000.o.f829
                int r5 = r3.length()
                if (r5 <= 0) goto L48
                int r5 = r3.length()
                r6 = r4
            L36:
                if (r6 >= r5) goto L48
                org.json.JSONObject r7 = r3.optJSONObject(r6)
                if (r7 == 0) goto L45
                ۟.w4 r7 = ۟.w4.a.m452(r7)
                r1.add(r7)
            L45:
                int r6 = r6 + 1
                goto L36
            L48:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                byte[] r0 = new byte[r0]
                r0 = {x00a2: FILL_ARRAY_DATA , data: [-74, -97, -19, 12} // fill-array
                byte[] r2 = new byte[r2]
                r2 = {x00a8: FILL_ARRAY_DATA , data: [-34, -83, -37, 57, -7, -21} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r2)
                org.json.JSONArray r8 = r8.optJSONArray(r0)
                if (r8 == 0) goto L7f
                int r0 = p000.o.f829
                int r0 = r8.length()
                if (r0 <= 0) goto L7f
                int r0 = r8.length()
            L6d:
                if (r4 >= r0) goto L7f
                org.json.JSONObject r2 = r8.optJSONObject(r4)
                if (r2 == 0) goto L7c
                ۟.w4 r2 = ۟.w4.a.m452(r2)
                r3.add(r2)
            L7c:
                int r4 = r4 + 1
                goto L6d
            L7f:
                ۟.v4 r8 = new ۟.v4
                r8.<init>(r1, r3)
                return r8
        }
    }

    public v4(java.util.ArrayList r1, java.util.ArrayList r2) {
            r0 = this;
            r0.<init>()
            r0.f1091 = r1
            r0.f1092 = r2
            return
    }
}
