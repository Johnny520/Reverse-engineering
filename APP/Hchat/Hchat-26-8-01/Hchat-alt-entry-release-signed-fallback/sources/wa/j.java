package wa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile wa.g f14925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Map f14926b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f14927c = null;

    static {
            java.util.Map r0 = p.a.p()
            wa.j.f14926b = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            wa.j.f14927c = r0
            return
    }

    public static boolean a(java.lang.String r12, int r13, int r14, int r15, java.lang.String r16, wa.h r17) {
            r6 = r17
            wa.g r1 = wa.j.f14925a
            r7 = 0
            if (r1 != 0) goto Lf
            if (r6 == 0) goto Lec
            java.lang.String r12 = "Protobuf API未就绪"
            r6.c(r12, r7)
            return r7
        Lf:
            wa.e r8 = r1.f14920f
            java.lang.String r9 = "通用发包未就绪("
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L25
            if (r16 == 0) goto L29
            java.lang.String r2 = r16.trim()     // Catch: java.lang.Throwable -> L25
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L22
            goto L29
        L22:
            r2 = r16
            goto L2b
        L25:
            r0 = move-exception
        L26:
            r12 = r0
            goto Lef
        L29:
            java.lang.String r2 = "{}"
        L2b:
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L25
            r2 = 522(0x20a, float:7.31E-43)
            if (r13 != r2) goto L57
            java.lang.String r3 = "2"
            org.json.JSONArray r4 = r0.optJSONArray(r3)     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L4d
            r3 = r7
        L3b:
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L78
            if (r3 >= r5) goto L78
            org.json.JSONObject r5 = r4.optJSONObject(r3)     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto L4a
            oh.h.g(r5)     // Catch: java.lang.Throwable -> L78
        L4a:
            int r3 = r3 + 1
            goto L3b
        L4d:
            org.json.JSONObject r3 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L78
            oh.h.g(r3)     // Catch: java.lang.Throwable -> L78
            goto L78
        L57:
            r3 = 222(0xde, float:3.11E-43)
            if (r13 != r3) goto L5f
            oh.h.U(r0)     // Catch: java.lang.Throwable -> L78
            goto L78
        L5f:
            r3 = 175(0xaf, float:2.45E-43)
            if (r13 != r3) goto L78
            java.lang.String r3 = "3"
            org.json.JSONObject r3 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L78
            java.lang.String r4 = "9"
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L78
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L78
        L78:
            byte[] r3 = ig.a.q(r0)     // Catch: java.lang.Throwable -> L25
            boolean r0 = r1.v(r13, r12, r0, r6)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L83
            goto Lb7
        L83:
            wa.f r0 = r1.j(r13, r12)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto La5
            r8.getClass()     // Catch: java.lang.Throwable -> L9f
            if (r13 == r2) goto La5
            r2 = 681(0x2a9, float:9.54E-43)
            if (r13 != r2) goto L93
            goto La5
        L93:
            r4 = r12
            r5 = r13
            r2 = r0
            boolean r0 = r1.s(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L9f
            r10 = r1
            r11 = r2
            if (r0 == 0) goto La7
            goto Lb7
        L9f:
            r0 = move-exception
            r10 = r1
            r12 = r0
            r6 = r17
            goto Lef
        La5:
            r11 = r0
            r10 = r1
        La7:
            wa.e r0 = r10.f14920f     // Catch: java.lang.Throwable -> Lce
            r1 = r12
            r2 = r13
            r4 = r15
            r6 = r17
            r5 = r3
            r3 = r14
            boolean r14 = r0.j(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Led
            r3 = r5
            if (r14 == 0) goto Lb9
        Lb7:
            r12 = 1
            return r12
        Lb9:
            if (r11 == 0) goto Lca
            java.lang.Object r14 = r11.f14911c     // Catch: java.lang.Throwable -> Lce
            if (r14 == 0) goto Lca
            r4 = r12
            r5 = r13
            r6 = r17
            r1 = r10
            r2 = r11
            boolean r12 = r1.s(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L25
            return r12
        Lca:
            r6 = r17
            r1 = r10
            goto Ld4
        Lce:
            r0 = move-exception
            r6 = r17
        Ld1:
            r1 = r10
            goto L26
        Ld4:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r12.<init>(r9)     // Catch: java.lang.Throwable -> L25
            java.lang.String r13 = r8.i()     // Catch: java.lang.Throwable -> L25
            r12.append(r13)     // Catch: java.lang.Throwable -> L25
            java.lang.String r13 = ")，且未找到同类已抓请求"
            r12.append(r13)     // Catch: java.lang.Throwable -> L25
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L25
            r1.r(r6, r7, r12)     // Catch: java.lang.Throwable -> L25
        Lec:
            return r7
        Led:
            r0 = move-exception
            goto Ld1
        Lef:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "发送失败: "
            r13.<init>(r14)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r1.r(r6, r7, r12)
            return r7
    }
}
