package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4748 extends Yue.AbstractC1438 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f15056 = "permessage-deflate";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f15057 = "server_no_context_takeover";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f15058 = "client_no_context_takeover";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f15059 = "server_max_window_bits";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f15060 = "client_max_window_bits";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f15061 = 32768;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f15062 = 32768;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final byte[] f15063 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f15064 = 1024;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f15065;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f15066;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f15067;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> f15068;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.zip.Inflater f15069;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.util.zip.Deflater f15070;

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, -1, -1} // fill-array
            Yue.C4748.f15063 = r0
            return
    }

    public C4748() {
            r3 = this;
            r3.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            r3.f15065 = r0
            r0 = 1
            r3.f15066 = r0
            r1 = 0
            r3.f15067 = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.f15068 = r1
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>(r0)
            r3.f15069 = r1
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r2 = -1
            r1.<init>(r2, r0)
            r3.f15070 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m18928(byte[] r5) {
            int r0 = r5.length
            r1 = 4
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            int r0 = r5.length
            r1 = r2
        L8:
            byte[] r3 = Yue.C4748.f15063
            int r4 = r3.length
            if (r1 >= r4) goto L1b
            r4 = r3[r1]
            int r3 = r3.length
            int r3 = r0 - r3
            int r3 = r3 + r1
            r3 = r5[r3]
            if (r4 == r3) goto L18
            return r2
        L18:
            int r1 = r1 + 1
            goto L8
        L1b:
            r5 = 1
            return r5
    }

    @Override // Yue.C1773, Yue.InterfaceC3184
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "PerMessageDeflateExtension"
            return r0
    }

    @Override // Yue.C1773, Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC3184 mo8452() {
            r1 = this;
            Yue.ۥۡۤ۠۟ r0 = new Yue.ۥۡۤ۠۟
            r0.<init>()
            return r0
    }

    @Override // Yue.C1773, Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo8453(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L9:
            if (r2 >= r0) goto L37
            r3 = r7[r2]
            Yue.ۥ۠ۡۥۨ r3 = Yue.C2322.m10688(r3)
            java.lang.String r4 = r3.m10689()
            java.lang.String r5 = "permessage-deflate"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 != 0) goto L20
            int r2 = r2 + 1
            goto L9
        L20:
            java.util.Map r7 = r3.m10690()
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f15068
            r0.putAll(r7)
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f15068
            java.lang.String r0 = "client_no_context_takeover"
            boolean r7 = r7.containsKey(r0)
            r0 = 1
            if (r7 == 0) goto L36
            r6.f15067 = r0
        L36:
            return r0
        L37:
            return r1
    }

    @Override // Yue.C1773, Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo8454(Yue.InterfaceC2813 r8) {
            r7 = this;
            boolean r0 = r8 instanceof Yue.AbstractC1724
            if (r0 != 0) goto L5
            return
        L5:
            java.nio.ByteBuffer r0 = r8.mo6102()
            byte[] r0 = r0.array()
            int r1 = r0.length
            int r2 = r7.f15065
            if (r1 >= r2) goto L13
            return
        L13:
            boolean r1 = r8 instanceof Yue.C1611
            r2 = 1
            if (r1 != 0) goto L1e
            r1 = r8
            Yue.ۥ۟ۨۢۤ r1 = (Yue.AbstractC1724) r1
            r1.m12264(r2)
        L1e:
            java.util.zip.Deflater r1 = r7.f15070
            r1.setInput(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r1]
        L2c:
            java.util.zip.Deflater r4 = r7.f15070
            r5 = 2
            r6 = 0
            int r4 = r4.deflate(r3, r6, r1, r5)
            if (r4 <= 0) goto L3a
            r0.write(r3, r6, r4)
            goto L2c
        L3a:
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            boolean r3 = r8.mo12261()
            if (r3 == 0) goto L60
            boolean r3 = m18928(r0)
            if (r3 == 0) goto L4f
            byte[] r3 = Yue.C4748.f15063
            int r3 = r3.length
            int r1 = r1 - r3
        L4f:
            boolean r3 = r7.f15066
            if (r3 == 0) goto L60
            java.util.zip.Deflater r3 = r7.f15070
            r3.end()
            java.util.zip.Deflater r3 = new java.util.zip.Deflater
            r4 = -1
            r3.<init>(r4, r2)
            r7.f15070 = r3
        L60:
            Yue.ۥۣ۠۠ۡ r8 = (Yue.AbstractC2814) r8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r6, r1)
            r8.mo6104(r0)
            return
    }

    @Override // Yue.C1773, Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo8455(Yue.InterfaceC2813 r5) throws Yue.C3342 {
            r4 = this;
            boolean r0 = r5 instanceof Yue.AbstractC1724
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r5.mo12256()
            if (r0 != 0) goto L14
            Yue.ۥۣۣۡۢ r0 = r5.mo12258()
            Yue.ۥۣۣۡۢ r1 = Yue.EnumC4633.f14775
            if (r0 == r1) goto L14
            return
        L14:
            Yue.ۥۣۣۡۢ r0 = r5.mo12258()
            Yue.ۥۣۣۡۢ r1 = Yue.EnumC4633.f14775
            r2 = 1008(0x3f0, float:1.413E-42)
            if (r0 != r1) goto L2d
            boolean r0 = r5.mo12256()
            if (r0 != 0) goto L25
            goto L2d
        L25:
            Yue.ۥ۠ۥۧۤ r5 = new Yue.ۥ۠ۥۧۤ
            java.lang.String r0 = "RSV1 bit can only be set for the first frame."
            r5.<init>(r2, r0)
            throw r5
        L2d:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.nio.ByteBuffer r1 = r5.mo6102()     // Catch: java.util.zip.DataFormatException -> L59
            byte[] r1 = r1.array()     // Catch: java.util.zip.DataFormatException -> L59
            r4.m18929(r1, r0)     // Catch: java.util.zip.DataFormatException -> L59
            java.util.zip.Inflater r1 = r4.f15069     // Catch: java.util.zip.DataFormatException -> L59
            int r1 = r1.getRemaining()     // Catch: java.util.zip.DataFormatException -> L59
            r3 = 1
            if (r1 <= 0) goto L5b
            java.util.zip.Inflater r1 = new java.util.zip.Inflater     // Catch: java.util.zip.DataFormatException -> L59
            r1.<init>(r3)     // Catch: java.util.zip.DataFormatException -> L59
            r4.f15069 = r1     // Catch: java.util.zip.DataFormatException -> L59
            java.nio.ByteBuffer r1 = r5.mo6102()     // Catch: java.util.zip.DataFormatException -> L59
            byte[] r1 = r1.array()     // Catch: java.util.zip.DataFormatException -> L59
            r4.m18929(r1, r0)     // Catch: java.util.zip.DataFormatException -> L59
            goto L5b
        L59:
            r5 = move-exception
            goto L84
        L5b:
            boolean r1 = r5.mo12261()     // Catch: java.util.zip.DataFormatException -> L59
            if (r1 == 0) goto L71
            byte[] r1 = Yue.C4748.f15063     // Catch: java.util.zip.DataFormatException -> L59
            r4.m18929(r1, r0)     // Catch: java.util.zip.DataFormatException -> L59
            boolean r1 = r4.f15067     // Catch: java.util.zip.DataFormatException -> L59
            if (r1 == 0) goto L71
            java.util.zip.Inflater r1 = new java.util.zip.Inflater     // Catch: java.util.zip.DataFormatException -> L59
            r1.<init>(r3)     // Catch: java.util.zip.DataFormatException -> L59
            r4.f15069 = r1     // Catch: java.util.zip.DataFormatException -> L59
        L71:
            Yue.ۥۣ۠۠ۡ r5 = (Yue.AbstractC2814) r5
            byte[] r1 = r0.toByteArray()
            r2 = 0
            int r0 = r0.size()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1, r2, r0)
            r5.mo6104(r0)
            return
        L84:
            Yue.ۥ۠ۥۧۤ r0 = new Yue.ۥ۠ۥۧۤ
            java.lang.String r5 = r5.getMessage()
            r0.<init>(r2, r5)
            throw r0
    }

    @Override // Yue.C1773, Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo8456(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L9:
            if (r2 >= r0) goto L25
            r3 = r7[r2]
            Yue.ۥ۠ۡۥۨ r3 = Yue.C2322.m10688(r3)
            java.lang.String r4 = r3.m10689()
            java.lang.String r5 = "permessage-deflate"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 != 0) goto L20
            int r2 = r2 + 1
            goto L9
        L20:
            r3.m10690()
            r7 = 1
            return r7
        L25:
            return r1
    }

    @Override // Yue.AbstractC1438, Yue.C1773, Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo7088(Yue.InterfaceC2813 r4) throws Yue.C3342 {
            r3 = this;
            boolean r0 = r4 instanceof Yue.C1611
            if (r0 == 0) goto L4a
            boolean r0 = r4.mo12256()
            if (r0 != 0) goto L17
            boolean r0 = r4.mo12257()
            if (r0 != 0) goto L17
            boolean r0 = r4.mo12260()
            if (r0 != 0) goto L17
            goto L4a
        L17:
            Yue.ۥ۠ۥۧۦ r0 = new Yue.ۥ۠ۥۧۦ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bad rsv RSV1: "
            r1.append(r2)
            boolean r2 = r4.mo12256()
            r1.append(r2)
            java.lang.String r2 = " RSV2: "
            r1.append(r2)
            boolean r2 = r4.mo12257()
            r1.append(r2)
            java.lang.String r2 = " RSV3: "
            r1.append(r2)
            boolean r4 = r4.mo12260()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L4a:
            super.mo7088(r4)
            return
    }

    @Override // Yue.C1773, Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public java.lang.String mo8457() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f15068
            java.lang.String r1 = "client_no_context_takeover"
            java.lang.String r2 = ""
            r0.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f15068
            java.lang.String r1 = "server_no_context_takeover"
            r0.put(r1, r2)
            java.lang.String r0 = "permessage-deflate; server_no_context_takeover; client_no_context_takeover"
            return r0
    }

    @Override // Yue.C1773, Yue.InterfaceC3184
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public java.lang.String mo8458() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "permessage-deflate; server_no_context_takeover"
            r0.append(r1)
            boolean r1 = r2.f15067
            if (r1 == 0) goto L11
            java.lang.String r1 = "; client_no_context_takeover"
            goto L13
        L11:
            java.lang.String r1 = ""
        L13:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m18929(byte[] r3, java.io.ByteArrayOutputStream r4) throws java.util.zip.DataFormatException {
            r2 = this;
            java.util.zip.Inflater r0 = r2.f15069
            r0.setInput(r3)
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]
        L9:
            java.util.zip.Inflater r0 = r2.f15069
            int r0 = r0.inflate(r3)
            if (r0 <= 0) goto L16
            r1 = 0
            r4.write(r3, r1, r0)
            goto L9
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.util.zip.Deflater m18930() {
            r1 = this;
            java.util.zip.Deflater r0 = r1.f15070
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.util.zip.Inflater m18931() {
            r1 = this;
            java.util.zip.Inflater r0 = r1.f15069
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m18932() {
            r1 = this;
            int r0 = r1.f15065
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m18933() {
            r1 = this;
            boolean r0 = r1.f15067
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m18934() {
            r1 = this;
            boolean r0 = r1.f15066
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m18935(boolean r1) {
            r0 = this;
            r0.f15067 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m18936(java.util.zip.Deflater r1) {
            r0 = this;
            r0.f15070 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m18937(java.util.zip.Inflater r1) {
            r0 = this;
            r0.f15069 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m18938(boolean r1) {
            r0 = this;
            r0.f15066 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m18939(int r1) {
            r0 = this;
            r0.f15065 = r1
            return
    }
}
