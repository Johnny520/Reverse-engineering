package a;

/* JADX INFO: renamed from: a.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0199ig {
    public static final a.C0199ig m = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f515a;
    public final java.lang.String b;
    public final int c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final java.lang.String j;
    public final java.lang.String k;
    public final java.lang.Boolean l;

    /* JADX INFO: renamed from: a.ig$a */
    public static final class a {
        public static a.C0199ig a(org.json.JSONObject r18) {
                r0 = r18
                java.lang.String r1 = "captureTimeMs"
                r2 = 0
                long r5 = r0.optLong(r1, r2)
                java.lang.String r1 = "versionName"
                java.lang.String r2 = ""
                java.lang.String r7 = r0.optString(r1, r2)
                java.lang.String r1 = "optString(...)"
                a.C0193i9.d(r7, r1)
                java.lang.String r1 = "versionCode"
                r3 = 0
                int r8 = r0.optInt(r1, r3)
                java.lang.String r1 = "currentTag"
                java.lang.String r1 = r0.optString(r1, r2)
                a.C0193i9.b(r1)
                int r3 = r1.length()
                java.lang.String r4 = "null"
                r9 = 0
                if (r3 <= 0) goto L37
                boolean r3 = r1.equals(r4)
                if (r3 != 0) goto L37
                goto L38
            L37:
                r1 = r9
            L38:
                java.lang.String r3 = "baselineTag"
                java.lang.String r3 = r0.optString(r3, r2)
                a.C0193i9.b(r3)
                int r10 = r3.length()
                if (r10 <= 0) goto L4f
                boolean r10 = r3.equals(r4)
                if (r10 != 0) goto L4f
                r10 = r3
                goto L50
            L4f:
                r10 = r9
            L50:
                java.lang.String r3 = "currentBuildTime"
                java.lang.String r3 = r0.optString(r3, r2)
                a.C0193i9.b(r3)
                int r11 = r3.length()
                if (r11 <= 0) goto L67
                boolean r11 = r3.equals(r4)
                if (r11 != 0) goto L67
                r11 = r3
                goto L68
            L67:
                r11 = r9
            L68:
                java.lang.String r3 = "baselineBuildTime"
                java.lang.String r3 = r0.optString(r3, r2)
                a.C0193i9.b(r3)
                int r12 = r3.length()
                if (r12 <= 0) goto L7f
                boolean r12 = r3.equals(r4)
                if (r12 != 0) goto L7f
                r12 = r3
                goto L80
            L7f:
                r12 = r9
            L80:
                java.lang.String r3 = "currentRev"
                java.lang.String r3 = r0.optString(r3, r2)
                a.C0193i9.b(r3)
                int r13 = r3.length()
                if (r13 <= 0) goto L97
                boolean r13 = r3.equals(r4)
                if (r13 != 0) goto L97
                r13 = r3
                goto L98
            L97:
                r13 = r9
            L98:
                java.lang.String r3 = "baselineRev"
                java.lang.String r3 = r0.optString(r3, r2)
                a.C0193i9.b(r3)
                int r14 = r3.length()
                if (r14 <= 0) goto Laf
                boolean r14 = r3.equals(r4)
                if (r14 != 0) goto Laf
                r14 = r3
                goto Lb0
            Laf:
                r14 = r9
            Lb0:
                java.lang.String r3 = "patchRev"
                java.lang.String r3 = r0.optString(r3, r2)
                a.C0193i9.b(r3)
                int r15 = r3.length()
                if (r15 <= 0) goto Lc7
                boolean r15 = r3.equals(r4)
                if (r15 != 0) goto Lc7
                r15 = r3
                goto Lc8
            Lc7:
                r15 = r9
            Lc8:
                java.lang.String r3 = "baselineVersion"
                java.lang.String r2 = r0.optString(r3, r2)
                a.C0193i9.b(r2)
                int r3 = r2.length()
                if (r3 <= 0) goto Le0
                boolean r3 = r2.equals(r4)
                if (r3 != 0) goto Le0
                r16 = r2
                goto Le2
            Le0:
                r16 = r9
            Le2:
                java.lang.String r2 = "patchEnabled"
                boolean r3 = r0.has(r2)
                if (r3 == 0) goto Lf2
                boolean r0 = r0.optBoolean(r2)
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            Lf2:
                r17 = r9
                a.ig r4 = new a.ig
                r9 = r1
                r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return r4
        }
    }

    static {
            a.ig r0 = new a.ig
            r10 = 0
            r11 = 0
            r1 = 0
            java.lang.String r3 = ""
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            a.C0199ig.m = r0
            return
    }

    public C0199ig(long r1, java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Boolean r13) {
            r0 = this;
            r0.<init>()
            r0.f515a = r1
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            r0.h = r9
            r0.i = r10
            r0.j = r11
            r0.k = r12
            r0.l = r13
            return
    }

    public final boolean a() {
            r3 = this;
            r0 = 1
            java.lang.String r1 = r3.d
            if (r1 == 0) goto L10
            java.lang.String r2 = r3.e
            if (r2 == 0) goto L10
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 != 0) goto L10
            return r0
        L10:
            java.lang.String r1 = r3.h
            if (r1 == 0) goto L1f
            java.lang.String r2 = r3.i
            if (r2 == 0) goto L1f
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 != 0) goto L1f
            return r0
        L1f:
            java.lang.String r1 = r3.f
            if (r1 == 0) goto L2e
            java.lang.String r2 = r3.g
            if (r2 == 0) goto L2e
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 != 0) goto L2e
            return r0
        L2e:
            r0 = 0
            return r0
    }

    public final org.json.JSONObject b() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "captureTimeMs"
            long r2 = r4.f515a
            r0.put(r1, r2)
            java.lang.String r1 = "versionName"
            java.lang.String r2 = r4.b
            r0.put(r1, r2)
            java.lang.String r1 = "versionCode"
            int r2 = r4.c
            r0.put(r1, r2)
            java.lang.String r1 = r4.d
            if (r1 != 0) goto L20
            java.lang.Object r1 = org.json.JSONObject.NULL
        L20:
            java.lang.String r2 = "currentTag"
            r0.put(r2, r1)
            java.lang.String r1 = r4.e
            if (r1 != 0) goto L2b
            java.lang.Object r1 = org.json.JSONObject.NULL
        L2b:
            java.lang.String r2 = "baselineTag"
            r0.put(r2, r1)
            java.lang.String r1 = r4.f
            if (r1 != 0) goto L36
            java.lang.Object r1 = org.json.JSONObject.NULL
        L36:
            java.lang.String r2 = "currentBuildTime"
            r0.put(r2, r1)
            java.lang.String r1 = r4.g
            if (r1 != 0) goto L41
            java.lang.Object r1 = org.json.JSONObject.NULL
        L41:
            java.lang.String r2 = "baselineBuildTime"
            r0.put(r2, r1)
            java.lang.String r1 = r4.h
            if (r1 != 0) goto L4c
            java.lang.Object r1 = org.json.JSONObject.NULL
        L4c:
            java.lang.String r2 = "currentRev"
            r0.put(r2, r1)
            java.lang.String r1 = r4.i
            if (r1 != 0) goto L57
            java.lang.Object r1 = org.json.JSONObject.NULL
        L57:
            java.lang.String r2 = "baselineRev"
            r0.put(r2, r1)
            java.lang.String r1 = r4.j
            if (r1 != 0) goto L62
            java.lang.Object r1 = org.json.JSONObject.NULL
        L62:
            java.lang.String r2 = "patchRev"
            r0.put(r2, r1)
            java.lang.String r1 = r4.k
            if (r1 != 0) goto L6d
            java.lang.Object r1 = org.json.JSONObject.NULL
        L6d:
            java.lang.String r2 = "baselineVersion"
            r0.put(r2, r1)
            java.lang.Boolean r1 = r4.l
            if (r1 == 0) goto L7f
            java.lang.String r2 = "patchEnabled"
            boolean r1 = r1.booleanValue()
            r0.put(r2, r1)
        L7f:
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof a.C0199ig
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.ig r8 = (a.C0199ig) r8
            long r3 = r8.f515a
            long r5 = r7.f515a
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            int r1 = r7.c
            int r3 = r8.c
            if (r1 == r3) goto L27
            return r2
        L27:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L32
            return r2
        L32:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L3d
            return r2
        L3d:
            java.lang.String r1 = r7.f
            java.lang.String r3 = r8.f
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L48
            return r2
        L48:
            java.lang.String r1 = r7.g
            java.lang.String r3 = r8.g
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L53
            return r2
        L53:
            java.lang.String r1 = r7.h
            java.lang.String r3 = r8.h
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L5e
            return r2
        L5e:
            java.lang.String r1 = r7.i
            java.lang.String r3 = r8.i
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L69
            return r2
        L69:
            java.lang.String r1 = r7.j
            java.lang.String r3 = r8.j
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L74
            return r2
        L74:
            java.lang.String r1 = r7.k
            java.lang.String r3 = r8.k
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L7f
            return r2
        L7f:
            java.lang.Boolean r1 = r7.l
            java.lang.Boolean r8 = r8.l
            boolean r8 = a.C0193i9.a(r1, r8)
            if (r8 != 0) goto L8a
            return r2
        L8a:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f515a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = a.C0487z.b(r2, r0, r1)
            int r2 = r4.c
            int r2 = java.lang.Integer.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            java.lang.String r3 = r4.d
            if (r3 != 0) goto L1e
            r3 = r0
            goto L22
        L1e:
            int r3 = r3.hashCode()
        L22:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.String r3 = r4.e
            if (r3 != 0) goto L2a
            r3 = r0
            goto L2e
        L2a:
            int r3 = r3.hashCode()
        L2e:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.String r3 = r4.f
            if (r3 != 0) goto L36
            r3 = r0
            goto L3a
        L36:
            int r3 = r3.hashCode()
        L3a:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.String r3 = r4.g
            if (r3 != 0) goto L42
            r3 = r0
            goto L46
        L42:
            int r3 = r3.hashCode()
        L46:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.String r3 = r4.h
            if (r3 != 0) goto L4e
            r3 = r0
            goto L52
        L4e:
            int r3 = r3.hashCode()
        L52:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.String r3 = r4.i
            if (r3 != 0) goto L5a
            r3 = r0
            goto L5e
        L5a:
            int r3 = r3.hashCode()
        L5e:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.String r3 = r4.j
            if (r3 != 0) goto L66
            r3 = r0
            goto L6a
        L66:
            int r3 = r3.hashCode()
        L6a:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.String r3 = r4.k
            if (r3 != 0) goto L72
            r3 = r0
            goto L76
        L72:
            int r3 = r3.hashCode()
        L76:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.Boolean r1 = r4.l
            if (r1 != 0) goto L7d
            goto L81
        L7d:
            int r0 = r1.hashCode()
        L81:
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VersionSnapshot(captureTimeMs="
            r0.<init>(r1)
            long r1 = r3.f515a
            r0.append(r1)
            java.lang.String r1 = ", versionName="
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", versionCode="
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", currentTag="
            r0.append(r1)
            java.lang.String r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", baselineTag="
            r0.append(r1)
            java.lang.String r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", currentBuildTime="
            r0.append(r1)
            java.lang.String r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", baselineBuildTime="
            r0.append(r1)
            java.lang.String r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", currentRev="
            r0.append(r1)
            java.lang.String r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", baselineRev="
            r0.append(r1)
            java.lang.String r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", patchRev="
            r0.append(r1)
            java.lang.String r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ", baselineVersion="
            r0.append(r1)
            java.lang.String r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = ", patchEnabled="
            r0.append(r1)
            java.lang.Boolean r1 = r3.l
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
