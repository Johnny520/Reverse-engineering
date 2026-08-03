package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5952 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5952.C5953 f21715 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f21716 = 307;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f21717 = 308;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f21718 = 421;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f21719 = 100;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.EnumC4981 f21720;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC3417
    public final int f21721;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final java.lang.String f21722;

    /* JADX INFO: renamed from: Yue.ۥۢ۠۠۟$ۥ, reason: contains not printable characters */
    public static final class C5953 {
        public C5953() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5953(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C5952 m22087(@Yue.InterfaceC4418 Yue.C5377 r4) {
                r3 = this;
                java.lang.String r0 = "response"
                Yue.C3329.m13906(r4, r0)
                Yue.ۥۢ۠۠۟ r0 = new Yue.ۥۢ۠۠۟
                Yue.ۥۡۥۣۧ r1 = r4.m20298()
                int r2 = r4.m20284()
                java.lang.String r4 = r4.m20293()
                r0.<init>(r1, r2, r4)
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C5952 m22088(@Yue.InterfaceC4418 java.lang.String r9) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "statusLine"
                Yue.C3329.m13906(r9, r0)
                java.lang.String r0 = "HTTP/1."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = Yue.C5988.m22315(r9, r0, r1, r2, r3)
                r4 = 4
                r5 = 32
                java.lang.String r6 = "Unexpected status line: "
                if (r0 == 0) goto L61
                int r0 = r9.length()
                r1 = 9
                if (r0 < r1) goto L4c
                r0 = 8
                char r0 = r9.charAt(r0)
                if (r0 != r5) goto L4c
                r0 = 7
                char r0 = r9.charAt(r0)
                int r0 = r0 + (-48)
                if (r0 == 0) goto L49
                r2 = 1
                if (r0 != r2) goto L34
                Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15839
                goto L6c
            L34:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
            L49:
                Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15838
                goto L6c
            L4c:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
            L61:
                java.lang.String r0 = "ICY "
                boolean r0 = Yue.C5988.m22315(r9, r0, r1, r2, r3)
                if (r0 == 0) goto Ldf
                Yue.ۥۡۥۣۧ r0 = Yue.EnumC4981.f15838
                r1 = r4
            L6c:
                int r2 = r9.length()
                int r3 = r1 + 3
                if (r2 < r3) goto Lca
                java.lang.String r2 = r9.substring(r1, r3)     // Catch: java.lang.NumberFormatException -> Lb5
                java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
                Yue.C3329.m13905(r2, r7)     // Catch: java.lang.NumberFormatException -> Lb5
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Lb5
                int r7 = r9.length()
                if (r7 <= r3) goto Lad
                char r3 = r9.charAt(r3)
                if (r3 != r5) goto L98
                int r1 = r1 + r4
                java.lang.String r9 = r9.substring(r1)
                java.lang.String r1 = "this as java.lang.String).substring(startIndex)"
                Yue.C3329.m13905(r9, r1)
                goto Laf
            L98:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
            Lad:
                java.lang.String r9 = ""
            Laf:
                Yue.ۥۢ۠۠۟ r1 = new Yue.ۥۢ۠۠۟
                r1.<init>(r0, r2, r9)
                return r1
            Lb5:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
            Lca:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
            Ldf:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r0.<init>(r9)
                throw r0
        }
    }

    static {
            Yue.ۥۢ۠۠۟$ۥ r0 = new Yue.ۥۢ۠۠۟$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5952.f21715 = r0
            return
    }

    public C5952(@Yue.InterfaceC4418 Yue.EnumC4981 r2, int r3, @Yue.InterfaceC4418 java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "protocol"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "message"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f21720 = r2
            r1.f21721 = r3
            r1.f21722 = r4
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            Yue.ۥۡۥۣۧ r1 = r3.f21720
            Yue.ۥۡۥۣۧ r2 = Yue.EnumC4981.f15838
            if (r1 != r2) goto L11
            java.lang.String r1 = "HTTP/1.0"
            r0.append(r1)
            goto L16
        L11:
            java.lang.String r1 = "HTTP/1.1"
            r0.append(r1)
        L16:
            r1 = 32
            r0.append(r1)
            int r2 = r3.f21721
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.f21722
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }
}
