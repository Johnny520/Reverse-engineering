package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
public final class C0829 implements Yue.InterfaceC3318 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1622 f2341;

    public C0829(@Yue.InterfaceC4418 Yue.InterfaceC1622 r2) {
            r1 = this;
            java.lang.String r0 = "cookieJar"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f2341 = r2
            return
    }

    @Override // Yue.InterfaceC3318
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C5377 mo4781(@Yue.InterfaceC4418 Yue.InterfaceC3318.InterfaceC3319 r13) throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = "chain"
            Yue.C3329.m13906(r13, r0)
            Yue.ۥۡۦۤۧ r0 = r13.mo13871()
            Yue.ۥۡۦۤۧ$ۥ r1 = r0.m20087()
            Yue.ۥۡۦۥ r2 = r0.m20079()
            r3 = -1
            java.lang.String r5 = "Content-Type"
            java.lang.String r6 = "Content-Length"
            if (r2 == 0) goto L43
            Yue.ۥۡ۠ۥۨ r7 = r2.mo12020()
            if (r7 == 0) goto L26
            java.lang.String r7 = r7.toString()
            r1.m20104(r5, r7)
        L26:
            long r7 = r2.mo12019()
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            java.lang.String r9 = "Transfer-Encoding"
            if (r2 == 0) goto L3b
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r1.m20104(r6, r2)
            r1.m20110(r9)
            goto L43
        L3b:
            java.lang.String r2 = "chunked"
            r1.m20104(r9, r2)
            r1.m20110(r6)
        L43:
            java.lang.String r2 = "Host"
            java.lang.String r7 = r0.m20082(r2)
            r8 = 0
            r9 = 1
            r10 = 0
            if (r7 != 0) goto L59
            Yue.ۥ۠ۤۨۥ r7 = r0.m20090()
            java.lang.String r7 = Yue.C6656.m25611(r7, r8, r9, r10)
            r1.m20104(r2, r7)
        L59:
            java.lang.String r2 = "Connection"
            java.lang.String r7 = r0.m20082(r2)
            if (r7 != 0) goto L66
            java.lang.String r7 = "Keep-Alive"
            r1.m20104(r2, r7)
        L66:
            java.lang.String r2 = "Accept-Encoding"
            java.lang.String r7 = r0.m20082(r2)
            java.lang.String r11 = "gzip"
            if (r7 != 0) goto L7c
            java.lang.String r7 = "Range"
            java.lang.String r7 = r0.m20082(r7)
            if (r7 != 0) goto L7c
            r1.m20104(r2, r11)
            r8 = r9
        L7c:
            Yue.ۥ۟ۧۦ r2 = r12.f2341
            Yue.ۥ۠ۤۨۥ r7 = r0.m20090()
            java.util.List r2 = r2.mo7889(r7)
            boolean r7 = r2.isEmpty()
            r7 = r7 ^ r9
            if (r7 == 0) goto L96
            java.lang.String r7 = "Cookie"
            java.lang.String r2 = r12.m4782(r2)
            r1.m20104(r7, r2)
        L96:
            java.lang.String r2 = "User-Agent"
            java.lang.String r7 = r0.m20082(r2)
            if (r7 != 0) goto La3
            java.lang.String r7 = "okhttp/4.12.0"
            r1.m20104(r2, r7)
        La3:
            Yue.ۥۡۦۤۧ r1 = r1.m20093()
            Yue.ۥۡۦۧ r13 = r13.mo13878(r1)
            Yue.ۥ۟ۧۦ r1 = r12.f2341
            Yue.ۥ۠ۤۨۥ r2 = r0.m20090()
            Yue.ۥ۠ۤۢۢ r7 = r13.m20289()
            Yue.C3163.m13412(r1, r2, r7)
            Yue.ۥۡۦۧ$ۥ r1 = r13.m20295()
            Yue.ۥۡۦۧ$ۥ r0 = r1.m20333(r0)
            if (r8 == 0) goto L10b
            java.lang.String r1 = "Content-Encoding"
            r2 = 2
            java.lang.String r7 = Yue.C5377.m20266(r13, r1, r10, r2, r10)
            boolean r7 = Yue.C5988.m22281(r11, r7, r9)
            if (r7 == 0) goto L10b
            boolean r7 = Yue.C3163.m13408(r13)
            if (r7 == 0) goto L10b
            Yue.ۥۡۦۧ۟ r7 = r13.m20280()
            if (r7 == 0) goto L10b
            Yue.ۥ۠ۤ۠۠ r8 = new Yue.ۥ۠ۤ۠۠
            Yue.ۥۣۣ۟۠ r7 = r7.mo5165()
            r8.<init>(r7)
            Yue.ۥ۠ۤۢۢ r7 = r13.m20289()
            Yue.ۥ۠ۤۢۢ$ۥ r7 = r7.m12684()
            Yue.ۥ۠ۤۢۢ$ۥ r1 = r7.m12699(r1)
            Yue.ۥ۠ۤۢۢ$ۥ r1 = r1.m12699(r6)
            Yue.ۥ۠ۤۢۢ r1 = r1.m12696()
            r0.m20325(r1)
            java.lang.String r13 = Yue.C5377.m20266(r13, r5, r10, r2, r10)
            Yue.ۥۡۦ۠ۨ r1 = new Yue.ۥۡۦ۠ۨ
            Yue.ۥۣۣ۟۠ r2 = Yue.C4603.m18380(r8)
            r1.<init>(r13, r3, r2)
            r0.m20304(r1)
        L10b:
            Yue.ۥۡۦۧ r13 = r0.m20305()
            return r13
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m4782(java.util.List<Yue.C1619> r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        La:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r5.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L1b
            Yue.C1208.m6228()
        L1b:
            Yue.ۥ۟ۧۥۨ r2 = (Yue.C1619) r2
            if (r1 <= 0) goto L24
            java.lang.String r1 = "; "
            r0.append(r1)
        L24:
            java.lang.String r1 = r2.m7862()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r2.m7867()
            r0.append(r1)
            r1 = r3
            goto La
        L39:
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r5, r0)
            return r5
    }
}
