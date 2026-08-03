package a;

/* JADX INFO: renamed from: a.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0235kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f551a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.ArrayList d;
    public final java.lang.Object e;

    /* JADX INFO: renamed from: a.kg$a */
    public static final class a {
        public static java.lang.String a(java.lang.String r3) {
                if (r3 == 0) goto L99
                int r0 = r3.length()
                if (r0 != 0) goto La
                goto L99
            La:
                java.lang.String r0 = "true"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L96
                java.lang.String r0 = "false"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L1c
                goto L96
            L1c:
                java.lang.String r0 = "0x[0-9A-Fa-f]+"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                java.lang.String r1 = "compile(...)"
                a.C0193i9.d(r0, r1)
                java.util.regex.Matcher r0 = r0.matcher(r3)
                boolean r0 = r0.matches()
                if (r0 == 0) goto L34
                java.lang.String r3 = "bVer"
                return r3
            L34:
                r0 = 0
                java.lang.String r2 = "RELEASE"
                boolean r0 = a.Be.I(r3, r2, r0)
                if (r0 != 0) goto L93
                java.lang.String r0 = ".*#\\d+.*"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                a.C0193i9.d(r0, r1)
                java.util.regex.Matcher r0 = r0.matcher(r3)
                boolean r0 = r0.matches()
                if (r0 == 0) goto L51
                goto L93
            L51:
                java.lang.String r0 = "\\d{4}-\\d{2}-\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}.*"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                a.C0193i9.d(r0, r1)
                java.util.regex.Matcher r0 = r0.matcher(r3)
                boolean r0 = r0.matches()
                if (r0 == 0) goto L67
                java.lang.String r3 = "time"
                return r3
            L67:
                java.lang.String r0 = "[0-9a-f]{32,}"
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                a.C0193i9.d(r0, r1)
                java.util.regex.Matcher r0 = r0.matcher(r3)
                boolean r0 = r0.matches()
                if (r0 == 0) goto L7d
                java.lang.String r3 = "rev"
                return r3
            L7d:
                int r0 = r3.length()
                r1 = 1
                if (r1 > r0) goto L99
                r1 = 41
                if (r0 >= r1) goto L99
                r0 = 32
                boolean r3 = a.Be.J(r3, r0)
                if (r3 != 0) goto L99
                java.lang.String r3 = "patchAppend"
                return r3
            L93:
                java.lang.String r3 = "tag"
                return r3
            L96:
                java.lang.String r3 = "patchEnabled"
                return r3
            L99:
                r3 = 0
                return r3
        }
    }

    public C0235kg(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.ArrayList r4, java.util.List r5) {
            r0 = this;
            r0.<init>()
            r0.f551a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof a.C0235kg
            if (r0 != 0) goto L8
            goto L40
        L8:
            a.kg r3 = (a.C0235kg) r3
            java.lang.String r0 = r3.f551a
            java.lang.String r1 = r2.f551a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.util.ArrayList r0 = r2.d
            java.util.ArrayList r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.lang.Object r0 = r2.e
            java.lang.Object r3 = r3.e
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L42
        L40:
            r3 = 0
            return r3
        L42:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f551a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.c
            if (r2 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r2.hashCode()
        L1f:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.ArrayList r1 = r3.d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.e
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VersionSymbols(zClass="
            r0.<init>(r1)
            java.lang.String r1 = r2.f551a
            r0.append(r1)
            java.lang.String r1 = ", zFormatMethod="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mp0Class="
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", zStaticStringFields="
            r0.append(r1)
            java.util.ArrayList r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", mp0StaticStringFields="
            r0.append(r1)
            java.lang.Object r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
