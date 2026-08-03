package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1986 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.EnumC5428 f6303;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.EnumC4633 f6304;

    public AbstractC1986() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f6303 = r0
            r1.f6304 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static java.nio.ByteBuffer m9145(java.nio.ByteBuffer r4) {
            int r0 = r4.remaining()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 48
        La:
            boolean r2 = r4.hasRemaining()
            if (r2 == 0) goto L2f
            byte r2 = r4.get()
            r0.put(r2)
            r3 = 13
            if (r1 != r3) goto L2d
            r1 = 10
            if (r2 != r1) goto L2d
            int r4 = r0.position()
            int r4 = r4 + (-2)
            r0.limit(r4)
            r4 = 0
            r0.position(r4)
            return r0
        L2d:
            r1 = r2
            goto La
        L2f:
            int r1 = r4.position()
            int r0 = r0.position()
            int r1 = r1 - r0
            r4.position(r1)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static java.lang.String m9146(java.nio.ByteBuffer r2) {
            java.nio.ByteBuffer r2 = m9145(r2)
            if (r2 != 0) goto L8
            r2 = 0
            goto L15
        L8:
            byte[] r0 = r2.array()
            r1 = 0
            int r2 = r2.limit()
            java.lang.String r2 = Yue.C1098.m5886(r0, r1, r2)
        L15:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static Yue.InterfaceC2977 m9147(java.nio.ByteBuffer r7, Yue.EnumC5428 r8) throws Yue.C3345 {
            java.lang.String r0 = m9146(r7)
            if (r0 == 0) goto L8e
            java.lang.String r1 = " "
            r2 = 3
            java.lang.String[] r1 = r0.split(r1, r2)
            int r3 = r1.length
            if (r3 != r2) goto L88
            Yue.ۥۡۧ۟ۨ r2 = Yue.EnumC5428.f20112
            if (r8 != r2) goto L19
            Yue.ۥ۠ۤۡۡ r8 = m9148(r1, r0)
            goto L1d
        L19:
            Yue.ۥ۠ۤۡۡ r8 = m9149(r1, r0)
        L1d:
            java.lang.String r0 = m9146(r7)
        L21:
            if (r0 == 0) goto L7f
            int r1 = r0.length()
            if (r1 <= 0) goto L7f
            java.lang.String r1 = ":"
            r2 = 2
            java.lang.String[] r0 = r0.split(r1, r2)
            int r1 = r0.length
            if (r1 != r2) goto L77
            r1 = 0
            r2 = r0[r1]
            boolean r2 = r8.mo12635(r2)
            java.lang.String r3 = ""
            java.lang.String r4 = "^ +"
            r5 = 1
            if (r2 == 0) goto L67
            r2 = r0[r1]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r1 = r0[r1]
            java.lang.String r1 = r8.mo12636(r1)
            r6.append(r1)
            java.lang.String r1 = "; "
            r6.append(r1)
            r0 = r0[r5]
            java.lang.String r0 = r0.replaceFirst(r4, r3)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r8.put(r2, r0)
            goto L72
        L67:
            r1 = r0[r1]
            r0 = r0[r5]
            java.lang.String r0 = r0.replaceFirst(r4, r3)
            r8.put(r1, r0)
        L72:
            java.lang.String r0 = m9146(r7)
            goto L21
        L77:
            Yue.ۥ۠ۥۧۧ r7 = new Yue.ۥ۠ۥۧۧ
            java.lang.String r8 = "not an http header"
            r7.<init>(r8)
            throw r7
        L7f:
            if (r0 == 0) goto L82
            return r8
        L82:
            Yue.ۥ۠ۥۡۢ r7 = new Yue.ۥ۠ۥۡۢ
            r7.<init>()
            throw r7
        L88:
            Yue.ۥ۠ۥۧۧ r7 = new Yue.ۥ۠ۥۧۧ
            r7.<init>()
            throw r7
        L8e:
            Yue.ۥ۠ۥۡۢ r8 = new Yue.ۥ۠ۥۡۢ
            int r7 = r7.capacity()
            int r7 = r7 + 128
            r8.<init>(r7)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static Yue.InterfaceC2977 m9148(java.lang.String[] r4, java.lang.String r5) throws Yue.C3345 {
            r0 = 1
            r1 = r4[r0]
            java.lang.String r2 = "101"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L3d
            java.lang.String r1 = "HTTP/1.1"
            r2 = 0
            r3 = r4[r2]
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L2b
            Yue.ۥۣ۠ۤۡ r5 = new Yue.ۥۣ۠ۤۡ
            r5.<init>()
            r0 = r4[r0]
            short r0 = java.lang.Short.parseShort(r0)
            r5.mo12631(r0)
            r0 = 2
            r4 = r4[r0]
            r5.mo12632(r4)
            return r5
        L2b:
            Yue.ۥ۠ۥۧۧ r0 = new Yue.ۥ۠ۥۧۧ
            r4 = r4[r2]
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "Invalid status line received: %s Status line: %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r0.<init>(r4)
            throw r0
        L3d:
            Yue.ۥ۠ۥۧۧ r1 = new Yue.ۥ۠ۥۧۧ
            r4 = r4[r0]
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "Invalid status code received: %s Status line: %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            r1.<init>(r4)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static Yue.InterfaceC2977 m9149(java.lang.String[] r3, java.lang.String r4) throws Yue.C3345 {
            r0 = 0
            r1 = r3[r0]
            java.lang.String r2 = "GET"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L34
            java.lang.String r0 = "HTTP/1.1"
            r1 = 2
            r2 = r3[r1]
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L22
            Yue.ۥ۠ۤۡۢ r4 = new Yue.ۥ۠ۤۡۢ
            r4.<init>()
            r0 = 1
            r3 = r3[r0]
            r4.mo6096(r3)
            return r4
        L22:
            Yue.ۥ۠ۥۧۧ r0 = new Yue.ۥ۠ۥۧۧ
            r3 = r3[r1]
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r4 = "Invalid status line received: %s Status line: %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        L34:
            Yue.ۥ۠ۥۧۧ r1 = new Yue.ۥ۠ۥۧۧ
            r3 = r3[r0]
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r4 = "Invalid request method received: %s Status line: %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r1.<init>(r3)
            throw r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract Yue.EnumC2980 mo9150(Yue.InterfaceC1165 r1, Yue.InterfaceC5669 r2) throws Yue.C3345;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public abstract Yue.EnumC2980 mo9151(Yue.InterfaceC1165 r1) throws Yue.C3345;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m9152(Yue.InterfaceC2981 r3) {
            r2 = this;
            java.lang.String r0 = "Upgrade"
            java.lang.String r0 = r3.mo12636(r0)
            java.lang.String r1 = "websocket"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L24
            java.lang.String r0 = "Connection"
            java.lang.String r3 = r3.mo12636(r0)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r3 = r3.toLowerCase(r0)
            java.lang.String r0 = "upgrade"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m9153(int r3) throws Yue.C3342 {
            r2 = this;
            if (r3 < 0) goto L3
            return r3
        L3:
            Yue.ۥ۠ۥۧۤ r3 = new Yue.ۥ۠ۥۧۤ
            r0 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r1 = "Negative count"
            r3.<init>(r0, r1)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.List<Yue.InterfaceC2813> m9154(Yue.EnumC4633 r4, java.nio.ByteBuffer r5, boolean r6) {
            r3 = this;
            Yue.ۥۣۣۡۢ r0 = Yue.EnumC4633.f14777
            if (r4 == r0) goto L11
            Yue.ۥۣۣۡۢ r1 = Yue.EnumC4633.f14776
            if (r4 != r1) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Only Opcode.BINARY or  Opcode.TEXT are allowed"
            r4.<init>(r5)
            throw r4
        L11:
            Yue.ۥۣۣۡۢ r1 = r3.f6304
            r2 = 0
            if (r1 == 0) goto L1c
            Yue.ۥ۟ۧۥۡ r0 = new Yue.ۥ۟ۧۥۡ
            r0.<init>()
            goto L31
        L1c:
            r3.f6304 = r4
            if (r4 != r0) goto L26
            Yue.ۥ۟ۢۧ r0 = new Yue.ۥ۟ۢۧ
            r0.<init>()
            goto L31
        L26:
            Yue.ۥۣۣۡۢ r0 = Yue.EnumC4633.f14776
            if (r4 != r0) goto L30
            Yue.ۥۢۡ۠ۢ r0 = new Yue.ۥۢۡ۠ۢ
            r0.<init>()
            goto L31
        L30:
            r0 = r2
        L31:
            r0.mo6104(r5)
            r0.m12263(r6)
            r0.mo6103()     // Catch: Yue.C3342 -> L46
            if (r6 == 0) goto L3f
            r3.f6304 = r2
            goto L41
        L3f:
            r3.f6304 = r4
        L41:
            java.util.List r4 = java.util.Collections.singletonList(r0)
            return r4
        L46:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract Yue.AbstractC1986 mo9155();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract java.nio.ByteBuffer mo9156(Yue.InterfaceC2813 r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public abstract java.util.List<Yue.InterfaceC2813> mo9157(java.lang.String r1, boolean r2);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract java.util.List<Yue.InterfaceC2813> mo9158(java.nio.ByteBuffer r1, boolean r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public java.util.List<java.nio.ByteBuffer> m9159(Yue.InterfaceC2981 r2) {
            r1 = this;
            r0 = 1
            java.util.List r2 = r1.m9162(r2, r0)
            return r2
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.util.List<java.nio.ByteBuffer> m9160(Yue.InterfaceC2981 r1, Yue.EnumC5428 r2) {
            r0 = this;
            java.util.List r1 = r0.m9159(r1)
            return r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.util.List<java.nio.ByteBuffer> m9161(Yue.InterfaceC2981 r1, Yue.EnumC5428 r2, boolean r3) {
            r0 = this;
            java.util.List r1 = r0.m9162(r1, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.util.List<java.nio.ByteBuffer> m9162(Yue.InterfaceC2981 r6, boolean r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            boolean r1 = r6 instanceof Yue.InterfaceC1165
            if (r1 == 0) goto L20
            java.lang.String r1 = "GET "
            r0.append(r1)
            r1 = r6
            Yue.ۥ۟ۤۨۡ r1 = (Yue.InterfaceC1165) r1
            java.lang.String r1 = r1.mo6095()
            r0.append(r1)
            java.lang.String r1 = " HTTP/1.1"
            r0.append(r1)
            goto L33
        L20:
            boolean r1 = r6 instanceof Yue.InterfaceC5669
            if (r1 == 0) goto L89
            java.lang.String r1 = "HTTP/1.1 101 "
            r0.append(r1)
            r1 = r6
            Yue.ۥۣۡۨۡ r1 = (Yue.InterfaceC5669) r1
            java.lang.String r1 = r1.mo12630()
            r0.append(r1)
        L33:
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            java.util.Iterator r2 = r6.mo12633()
        L3c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r6.mo12636(r3)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            r0.append(r4)
            r0.append(r1)
            goto L3c
        L5b:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            byte[] r0 = Yue.C1098.m5882(r0)
            if (r7 == 0) goto L6d
            byte[] r6 = r6.mo12634()
            goto L6e
        L6d:
            r6 = 0
        L6e:
            if (r6 != 0) goto L72
            r7 = 0
            goto L73
        L72:
            int r7 = r6.length
        L73:
            int r1 = r0.length
            int r7 = r7 + r1
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            r7.put(r0)
            if (r6 == 0) goto L81
            r7.put(r6)
        L81:
            r7.flip()
            java.util.List r6 = java.util.Collections.singletonList(r7)
            return r6
        L89:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "unknown role"
            r6.<init>(r7)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public abstract Yue.EnumC1172 mo9163();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Yue.EnumC5428 m9164() {
            r1 = this;
            Yue.ۥۡۧ۟ۨ r0 = r1.f6303
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public abstract Yue.InterfaceC1166 mo9165(Yue.InterfaceC1166 r1) throws Yue.C3345;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public abstract Yue.InterfaceC2977 mo9166(Yue.InterfaceC1165 r1, Yue.InterfaceC5670 r2) throws Yue.C3345;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public abstract void mo9167(Yue.C6989 r1, Yue.InterfaceC2813 r2) throws Yue.C3342;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m9168(Yue.InterfaceC2981 r3) {
            r2 = this;
            java.lang.String r0 = "Sec-WebSocket-Version"
            java.lang.String r3 = r3.mo12636(r0)
            int r0 = r3.length()
            r1 = -1
            if (r0 <= 0) goto L1b
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.NumberFormatException -> L1b
            java.lang.String r3 = r3.trim()     // Catch: java.lang.NumberFormatException -> L1b
            r0.<init>(r3)     // Catch: java.lang.NumberFormatException -> L1b
            int r3 = r0.intValue()     // Catch: java.lang.NumberFormatException -> L1b
            return r3
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public abstract void mo9169();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m9170(Yue.EnumC5428 r1) {
            r0 = this;
            r0.f6303 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public abstract java.util.List<Yue.InterfaceC2813> mo9171(java.nio.ByteBuffer r1) throws Yue.C3342;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Yue.InterfaceC2981 m9172(java.nio.ByteBuffer r2) throws Yue.C3345 {
            r1 = this;
            Yue.ۥۡۧ۟ۨ r0 = r1.f6303
            Yue.ۥ۠ۤۡۡ r2 = m9147(r2, r0)
            return r2
    }
}
