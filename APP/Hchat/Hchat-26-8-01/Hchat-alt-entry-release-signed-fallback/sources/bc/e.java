package bc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ java.lang.String a(int r3) {
            r0 = 1
            if (r3 == r0) goto L19
            r0 = 2
            java.lang.String r1 = "\n */"
            if (r3 == r0) goto L18
            r0 = 3
            java.lang.String r2 = " */"
            if (r3 == r0) goto L17
            r0 = 4
            if (r3 == r0) goto L16
            r0 = 5
            if (r3 != r0) goto L14
            return r2
        L14:
            r3 = 0
            throw r3
        L16:
            return r1
        L17:
            return r2
        L18:
            return r1
        L19:
            java.lang.String r3 = ""
            return r3
    }

    public static /* synthetic */ java.lang.String b(int r2) {
            r0 = 1
            if (r2 == r0) goto L15
            r0 = 2
            java.lang.String r1 = " * "
            if (r2 == r0) goto L14
            r0 = 3
            if (r2 == r0) goto L14
            r0 = 4
            if (r2 == r0) goto L14
            r0 = 5
            if (r2 != r0) goto L12
            return r1
        L12:
            r2 = 0
            throw r2
        L14:
            return r1
        L15:
            java.lang.String r2 = "// "
            return r2
    }

    public static /* synthetic */ java.lang.String c(int r1) {
            r0 = 1
            if (r1 == r0) goto L1d
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L17
            r0 = 4
            if (r1 == r0) goto L14
            r0 = 5
            if (r1 != r0) goto L12
            java.lang.String r1 = "/** "
            return r1
        L12:
            r1 = 0
            throw r1
        L14:
            java.lang.String r1 = "/**\n * "
            return r1
        L17:
            java.lang.String r1 = "/* "
            return r1
        L1a:
            java.lang.String r1 = "/*\n * "
            return r1
        L1d:
            java.lang.String r1 = "// "
            return r1
    }

    public static af.d d(i0.h0 r0, int r1, boolean r2) {
            r0.a0(r1)
            r0.p(r2)
            af.d r0 = new af.d
            r0.<init>()
            return r0
    }

    public static java.lang.Object e(long r1, i0.j1 r3, i0.j1 r4) {
            f1.w r0 = new f1.w
            r0.<init>(r1)
            r3.setValue(r0)
            java.lang.Object r1 = r4.getValue()
            return r1
    }

    public static java.lang.String f(int r0, java.lang.StringBuilder r1) {
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String g(long r1, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String h(java.lang.Object r0, java.lang.String r1, java.lang.StringBuilder r2) {
            java.lang.Class r0 = r0.getClass()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public static java.lang.String i(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String j(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String k(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String l(java.lang.String r0, java.lang.String r1, org.json.JSONObject r2) {
            java.lang.String r0 = r2.optString(r0, r1)
            r0.getClass()
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String m(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2, com.alibaba.fastjson2.JSONReader r3) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r3.info(r0)
            return r0
    }

    public static java.lang.StringBuilder n(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            return r0
    }

    public static java.lang.StringBuilder o(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            return r0
    }

    public static java.lang.StringBuilder p(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            return r0
    }

    public static p8.d0 q() {
            i8.b r0 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r0.getClass()
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.o()
            return r0
    }

    public static void r(java.lang.String r0, java.lang.String r1, int r2, i0.a1 r3) {
            r0.getClass()
            java.lang.String r0 = og.m.P0(r2, r1)
            r3.setValue(r0)
            return
    }

    public static void s(java.lang.Throwable r0, java.lang.StringBuilder r1, java.lang.Throwable r2) {
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            fb.v0.n(r0, r2)
            return
    }

    public static boolean t(java.lang.String r0, java.util.Locale r1, java.lang.String r2, boolean r3) {
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            boolean r0 = og.m.h0(r0, r2, r3)
            return r0
    }

    public static boolean u(java.util.Locale r0, java.lang.String r1, java.util.Locale r2, java.lang.String r3, boolean r4) {
            r0.getClass()
            java.lang.String r0 = r1.toLowerCase(r2)
            r0.getClass()
            boolean r0 = og.m.h0(r0, r3, r4)
            return r0
    }

    public static java.lang.String v(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static /* synthetic */ java.lang.String w(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.lang.String r1 = "null"
            return r1
        Lc:
            java.lang.String r1 = "CODE"
            return r1
        Lf:
            java.lang.String r1 = "RESOURCES"
            return r1
        L12:
            java.lang.String r1 = "AUTO"
            return r1
    }

    public static /* synthetic */ java.lang.String x(int r1) {
            r0 = 1
            if (r1 == r0) goto L12
            r0 = 2
            if (r1 == r0) goto Lf
            r0 = 3
            if (r1 == r0) goto Lc
            java.lang.String r1 = "null"
            return r1
        Lc:
            java.lang.String r1 = "NEVER"
            return r1
        Lf:
            java.lang.String r1 = "IF_BETTER"
            return r1
        L12:
            java.lang.String r1 = "ALWAYS"
            return r1
    }
}
