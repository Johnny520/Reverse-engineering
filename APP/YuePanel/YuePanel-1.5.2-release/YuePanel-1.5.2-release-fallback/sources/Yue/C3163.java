package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC3421(name = "HttpHeaders")
public final class C3163 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0879 f10447 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0879 f10448 = null;

    static {
            Yue.ۥۣ۟ۥۤ$ۥ r0 = Yue.C0879.f2556
            java.lang.String r1 = "\"\\"
            Yue.ۥۣ۟ۥۤ r1 = r0.m5121(r1)
            Yue.C3163.f10447 = r1
            java.lang.String r1 = "\t ,="
            Yue.ۥۣ۟ۥۤ r0 = r0.m5121(r1)
            Yue.C3163.f10448 = r0
            return
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "No longer supported", replaceWith = @Yue.InterfaceC5313(expression = "response.promisesBody()", imports = {}))
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m13406(@Yue.InterfaceC4418 Yue.C5377 r1) {
            java.lang.String r0 = "response"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = m13408(r1)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.util.List<Yue.C0969> m13407(@Yue.InterfaceC4418 Yue.C2994 r7, @Yue.InterfaceC4418 java.lang.String r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "headerName"
            Yue.C3329.m13906(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.size()
            r2 = 0
        L14:
            if (r2 >= r1) goto L42
            java.lang.String r3 = r7.m12682(r2)
            r4 = 1
            boolean r3 = Yue.C5988.m22281(r8, r3, r4)
            if (r3 == 0) goto L3f
            Yue.ۥۣ۟ۢۨ r3 = new Yue.ۥۣ۟ۢۨ
            r3.<init>()
            java.lang.String r4 = r7.m12686(r2)
            Yue.ۥۣ۟ۢۨ r3 = r3.m4911(r4)
            m13409(r3, r0)     // Catch: java.io.EOFException -> L32
            goto L3f
        L32:
            r3 = move-exception
            Yue.ۥۡۤۡۢ$ۥ r4 = Yue.C4773.f15123
            Yue.ۥۡۤۡۢ r4 = r4.m19021()
            java.lang.String r5 = "Unable to parse challenge"
            r6 = 5
            r4.m19013(r5, r6, r3)
        L3f:
            int r2 = r2 + 1
            goto L14
        L42:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m13408(@Yue.InterfaceC4418 Yue.C5377 r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            Yue.ۥۡۦۤۧ r0 = r8.m20300()
            java.lang.String r0 = r0.m20086()
            java.lang.String r1 = "HEAD"
            boolean r0 = Yue.C3329.m13897(r0, r1)
            r1 = 0
            if (r0 == 0) goto L17
            return r1
        L17:
            int r0 = r8.m20284()
            r2 = 100
            r3 = 1
            if (r0 < r2) goto L24
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L2d
        L24:
            r2 = 204(0xcc, float:2.86E-43)
            if (r0 == r2) goto L2d
            r2 = 304(0x130, float:4.26E-43)
            if (r0 == r2) goto L2d
            return r3
        L2d:
            long r4 = Yue.C6656.m25579(r8)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L49
            java.lang.String r0 = "Transfer-Encoding"
            r2 = 2
            r4 = 0
            java.lang.String r8 = Yue.C5377.m20266(r8, r0, r4, r2, r4)
            java.lang.String r0 = "chunked"
            boolean r8 = Yue.C5988.m22281(r0, r8, r3)
            if (r8 == 0) goto L48
            goto L49
        L48:
            return r1
        L49:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m13409(Yue.C0843 r7, java.util.List<Yue.C0969> r8) throws java.io.EOFException {
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            m13413(r7)
            java.lang.String r1 = m13411(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = m13413(r7)
            java.lang.String r3 = m13411(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.mo4827()
            if (r7 != 0) goto L1f
            return
        L1f:
            Yue.ۥ۟ۤ۠ۡ r7 = new Yue.ۥ۟ۤ۠ۡ
            java.util.Map r0 = Yue.C3901.m15738()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = Yue.C6656.m25601(r7, r4)
            boolean r6 = m13413(r7)
            if (r2 != 0) goto L67
            if (r6 != 0) goto L40
            boolean r2 = r7.mo4827()
            if (r2 == 0) goto L67
        L40:
            Yue.ۥ۟ۤ۠ۡ r2 = new Yue.ۥ۟ۤ۠ۡ
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = Yue.C5988.m22301(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            Yue.C3329.m13905(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L67:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = Yue.C6656.m25601(r7, r4)
            int r5 = r5 + r6
        L71:
            if (r3 != 0) goto L81
            java.lang.String r3 = m13411(r7)
            boolean r5 = m13413(r7)
            if (r5 != 0) goto Lba
            int r5 = Yue.C6656.m25601(r7, r4)
        L81:
            if (r5 == 0) goto Lba
            r6 = 1
            if (r5 <= r6) goto L87
            return
        L87:
            boolean r6 = m13413(r7)
            if (r6 == 0) goto L8e
            return
        L8e:
            r6 = 34
            boolean r6 = m13414(r7, r6)
            if (r6 == 0) goto L9b
            java.lang.String r6 = m13410(r7)
            goto L9f
        L9b:
            java.lang.String r6 = m13411(r7)
        L9f:
            if (r6 != 0) goto La2
            return
        La2:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lab
            return
        Lab:
            boolean r3 = m13413(r7)
            if (r3 != 0) goto Lb8
            boolean r3 = r7.mo4827()
            if (r3 != 0) goto Lb8
            return
        Lb8:
            r3 = r0
            goto L71
        Lba:
            Yue.ۥ۟ۤ۠ۡ r4 = new Yue.ۥ۟ۤ۠ۡ
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String m13410(Yue.C0843 r12) throws java.io.EOFException {
            byte r0 = r12.readByte()
            r1 = 34
            if (r0 != r1) goto L43
            Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
            r0.<init>()
        Ld:
            Yue.ۥۣ۟ۥۤ r2 = Yue.C3163.f10447
            long r2 = r12.mo4844(r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L1b
            return r5
        L1b:
            byte r4 = r12.m4855(r2)
            if (r4 != r1) goto L2c
            r0.mo4176(r12, r2)
            r12.readByte()
            java.lang.String r12 = r0.mo4867()
            return r12
        L2c:
            long r6 = r12.m4889()
            r8 = 1
            long r10 = r2 + r8
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 != 0) goto L39
            return r5
        L39:
            r0.mo4176(r12, r2)
            r12.readByte()
            r0.mo4176(r12, r8)
            goto Ld
        L43:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String m13411(Yue.C0843 r4) {
            Yue.ۥۣ۟ۥۤ r0 = Yue.C3163.f10448
            long r0 = r4.mo4844(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L10
            long r0 = r4.m4889()
        L10:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1b
            java.lang.String r4 = r4.mo4814(r0)
            goto L1c
        L1b:
            r4 = 0
        L1c:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m13412(@Yue.InterfaceC4418 Yue.InterfaceC1622 r1, @Yue.InterfaceC4418 Yue.C3171 r2, @Yue.InterfaceC4418 Yue.C2994 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "url"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "headers"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۟ۧۦ r0 = Yue.InterfaceC1622.f5081
            if (r1 != r0) goto L14
            return
        L14:
            Yue.ۥ۟ۧۥۨ$ۥ۟ r0 = Yue.C1619.f5057
            java.util.List r3 = r0.m7884(r2, r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L21
            return
        L21:
            r1.mo7890(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m13413(Yue.C0843 r3) {
            r0 = 0
        L1:
            boolean r1 = r3.mo4827()
            if (r1 != 0) goto L23
            r1 = 0
            byte r1 = r3.m4855(r1)
            r2 = 44
            if (r1 != r2) goto L16
            r3.readByte()
            r0 = 1
            goto L1
        L16:
            r2 = 32
            if (r1 != r2) goto L1b
            goto L1f
        L1b:
            r2 = 9
            if (r1 != r2) goto L23
        L1f:
            r3.readByte()
            goto L1
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m13414(Yue.C0843 r2, byte r3) {
            boolean r0 = r2.mo4827()
            if (r0 != 0) goto L10
            r0 = 0
            byte r2 = r2.m4855(r0)
            if (r2 != r3) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }
}
