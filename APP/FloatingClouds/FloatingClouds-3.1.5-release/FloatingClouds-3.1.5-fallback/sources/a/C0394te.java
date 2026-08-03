package a;

/* JADX INFO: renamed from: a.te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0394te {

    /* JADX INFO: renamed from: a.te$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f698a;
        public final java.lang.String b;
        public final java.util.LinkedHashMap c;
        public final long d;

        public a(java.lang.String r1, java.lang.String r2, java.util.LinkedHashMap r3, long r4) {
                r0 = this;
                r0.<init>()
                r0.f698a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                if (r4 != r5) goto L3
                goto L35
            L3:
                boolean r0 = r5 instanceof a.C0394te.a
                if (r0 != 0) goto L8
                goto L33
            L8:
                a.te$a r5 = (a.C0394te.a) r5
                java.lang.String r0 = r5.f698a
                java.lang.String r1 = r4.f698a
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L15
                goto L33
            L15:
                java.lang.String r0 = r4.b
                java.lang.String r1 = r5.b
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L20
                goto L33
            L20:
                java.util.LinkedHashMap r0 = r4.c
                java.util.LinkedHashMap r1 = r5.c
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2b
                goto L33
            L2b:
                long r0 = r4.d
                long r2 = r5.d
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L35
            L33:
                r5 = 0
                return r5
            L35:
                r5 = 1
                return r5
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f698a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.b
                int r0 = a.C0487z.b(r2, r0, r1)
                java.util.LinkedHashMap r2 = r3.c
                int r2 = r2.hashCode()
                int r2 = r2 + r0
                int r2 = r2 * r1
                long r0 = r3.d
                int r0 = java.lang.Long.hashCode(r0)
                int r0 = r0 + r2
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "StartupSnapshot(wechatVersion="
                r0.<init>(r1)
                java.lang.String r1 = r3.f698a
                r0.append(r1)
                java.lang.String r1 = ", pluginVersion="
                r0.append(r1)
                java.lang.String r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = ", resolvedClasses="
                r0.append(r1)
                java.util.LinkedHashMap r1 = r3.c
                r0.append(r1)
                java.lang.String r1 = ", createdAt="
                r0.append(r1)
                long r1 = r3.d
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static void a(android.content.Context r7, java.lang.String r8, java.util.LinkedHashMap r9) {
            java.lang.String r0 = " plugin=3.1.5 classes="
            java.lang.String r1 = "3.1.5"
            java.lang.String r2 = "StartupSnapshot"
            java.lang.String r3 = "SAVED: wechat="
            java.lang.String r4 = "wechatVersion"
            a.C0193i9.e(r8, r4)
            java.lang.String r5 = "pluginVersion"
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L63
            r6.<init>()     // Catch: java.lang.Exception -> L63
            r6.put(r4, r8)     // Catch: java.lang.Exception -> L63
            r6.put(r5, r1)     // Catch: java.lang.Exception -> L63
            java.lang.String r1 = "resolvedClasses"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L63
            r4.<init>(r9)     // Catch: java.lang.Exception -> L63
            r6.put(r1, r4)     // Catch: java.lang.Exception -> L63
            java.lang.String r1 = "createdAt"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L63
            r6.put(r1, r4)     // Catch: java.lang.Exception -> L63
            java.lang.String r1 = "fc_startup_state"
            r4 = 0
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r1, r4)     // Catch: java.lang.Exception -> L63
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Exception -> L63
            java.lang.String r1 = "startup_snapshot"
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Exception -> L63
            android.content.SharedPreferences$Editor r7 = r7.putString(r1, r4)     // Catch: java.lang.Exception -> L63
            r7.apply()     // Catch: java.lang.Exception -> L63
            int r7 = r9.size()     // Catch: java.lang.Exception -> L63
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L63
            r9.<init>(r3)     // Catch: java.lang.Exception -> L63
            r9.append(r8)     // Catch: java.lang.Exception -> L63
            r9.append(r0)     // Catch: java.lang.Exception -> L63
            r9.append(r7)     // Catch: java.lang.Exception -> L63
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Exception -> L63
            java.lang.Object[] r7 = new java.lang.Object[]{r2, r7}     // Catch: java.lang.Exception -> L63
            a.C0453x1.b(r7)     // Catch: java.lang.Exception -> L63
            return
        L63:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = "save failed: "
            java.lang.String r7 = a.C0487z.k(r8, r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r2, r7}
            a.C0453x1.e(r7)
            return
    }
}
