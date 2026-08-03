package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2814 implements Yue.InterfaceC2813 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f9187;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.EnumC4633 f9188;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.nio.ByteBuffer f9189;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f9190;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f9191;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f9192;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean f9193;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۡ$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C2815 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f9194 = null;

        static {
                Yue.ۥۣۣۡۢ[] r0 = Yue.EnumC4633.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.AbstractC2814.C2815.f9194 = r0
                Yue.ۥۣۣۡۢ r1 = Yue.EnumC4633.f14778     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = Yue.AbstractC2814.C2815.f9194     // Catch: java.lang.NoSuchFieldError -> L1d
                Yue.ۥۣۣۡۢ r1 = Yue.EnumC4633.f14779     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = Yue.AbstractC2814.C2815.f9194     // Catch: java.lang.NoSuchFieldError -> L28
                Yue.ۥۣۣۡۢ r1 = Yue.EnumC4633.f14776     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = Yue.AbstractC2814.C2815.f9194     // Catch: java.lang.NoSuchFieldError -> L33
                Yue.ۥۣۣۡۢ r1 = Yue.EnumC4633.f14777     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = Yue.AbstractC2814.C2815.f9194     // Catch: java.lang.NoSuchFieldError -> L3e
                Yue.ۥۣۣۡۢ r1 = Yue.EnumC4633.f14780     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = Yue.AbstractC2814.C2815.f9194     // Catch: java.lang.NoSuchFieldError -> L49
                Yue.ۥۣۣۡۢ r1 = Yue.EnumC4633.f14775     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    public AbstractC2814(Yue.EnumC4633 r1) {
            r0 = this;
            r0.<init>()
            r0.f9188 = r1
            java.nio.ByteBuffer r1 = Yue.C0873.m5005()
            r0.f9189 = r1
            r1 = 1
            r0.f9187 = r1
            r1 = 0
            r0.f9190 = r1
            r0.f9191 = r1
            r0.f9192 = r1
            r0.f9193 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Yue.AbstractC2814 m12262(Yue.EnumC4633 r1) {
            if (r1 == 0) goto L39
            int[] r0 = Yue.AbstractC2814.C2815.f9194
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L33;
                case 2: goto L2d;
                case 3: goto L27;
                case 4: goto L21;
                case 5: goto L1b;
                case 6: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Supplied opcode is invalid"
            r1.<init>(r0)
            throw r1
        L15:
            Yue.ۥ۟ۧۥۡ r1 = new Yue.ۥ۟ۧۥۡ
            r1.<init>()
            return r1
        L1b:
            Yue.ۥ۟ۤۨۥ r1 = new Yue.ۥ۟ۤۨۥ
            r1.<init>()
            return r1
        L21:
            Yue.ۥ۟ۢۧ r1 = new Yue.ۥ۟ۢۧ
            r1.<init>()
            return r1
        L27:
            Yue.ۥۢۡ۠ۢ r1 = new Yue.ۥۢۡ۠ۢ
            r1.<init>()
            return r1
        L2d:
            Yue.ۥۡۤۤ r1 = new Yue.ۥۡۤۤ
            r1.<init>()
            return r1
        L33:
            Yue.ۥۡۤۡ۠ r1 = new Yue.ۥۡۤۡ۠
            r1.<init>()
            return r1
        L39:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Supplied opcode cannot be null"
            r1.<init>(r0)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L4e
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L4e
        L12:
            Yue.ۥۣ۠۠ۡ r5 = (Yue.AbstractC2814) r5
            boolean r2 = r4.f9187
            boolean r3 = r5.f9187
            if (r2 == r3) goto L1b
            return r1
        L1b:
            boolean r2 = r4.f9190
            boolean r3 = r5.f9190
            if (r2 == r3) goto L22
            return r1
        L22:
            boolean r2 = r4.f9191
            boolean r3 = r5.f9191
            if (r2 == r3) goto L29
            return r1
        L29:
            boolean r2 = r4.f9192
            boolean r3 = r5.f9192
            if (r2 == r3) goto L30
            return r1
        L30:
            boolean r2 = r4.f9193
            boolean r3 = r5.f9193
            if (r2 == r3) goto L37
            return r1
        L37:
            Yue.ۥۣۣۡۢ r2 = r4.f9188
            Yue.ۥۣۣۡۢ r3 = r5.f9188
            if (r2 == r3) goto L3e
            return r1
        L3e:
            java.nio.ByteBuffer r2 = r4.f9189
            java.nio.ByteBuffer r5 = r5.f9189
            if (r2 == 0) goto L49
            boolean r0 = r2.equals(r5)
            goto L4d
        L49:
            if (r5 != 0) goto L4c
            goto L4d
        L4c:
            r0 = r1
        L4d:
            return r0
        L4e:
            return r1
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.f9187
            int r0 = r0 * 31
            Yue.ۥۣۣۡۢ r1 = r2.f9188
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.nio.ByteBuffer r1 = r2.f9189
            if (r1 == 0) goto L16
            int r1 = r1.hashCode()
            goto L17
        L16:
            r1 = 0
        L17:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.f9190
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.f9191
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.f9192
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.f9193
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Framedata{ opcode:"
            r0.append(r1)
            Yue.ۥۣۣۡۢ r1 = r3.mo12258()
            r0.append(r1)
            java.lang.String r1 = ", fin:"
            r0.append(r1)
            boolean r1 = r3.mo12261()
            r0.append(r1)
            java.lang.String r1 = ", rsv1:"
            r0.append(r1)
            boolean r1 = r3.mo12256()
            r0.append(r1)
            java.lang.String r1 = ", rsv2:"
            r0.append(r1)
            boolean r1 = r3.mo12257()
            r0.append(r1)
            java.lang.String r1 = ", rsv3:"
            r0.append(r1)
            boolean r1 = r3.mo12260()
            r0.append(r1)
            java.lang.String r1 = ", payload length:[pos:"
            r0.append(r1)
            java.nio.ByteBuffer r1 = r3.f9189
            int r1 = r1.position()
            r0.append(r1)
            java.lang.String r1 = ", len:"
            r0.append(r1)
            java.nio.ByteBuffer r1 = r3.f9189
            int r1 = r1.remaining()
            r0.append(r1)
            java.lang.String r1 = "], payload:"
            r0.append(r1)
            java.nio.ByteBuffer r1 = r3.f9189
            int r1 = r1.remaining()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r2) goto L6f
            java.lang.String r1 = "(too big to display)"
            goto L7a
        L6f:
            java.lang.String r1 = new java.lang.String
            java.nio.ByteBuffer r2 = r3.f9189
            byte[] r2 = r2.array()
            r1.<init>(r2)
        L7a:
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC2813
    /* JADX INFO: renamed from: ۥ */
    public boolean mo12255() {
            r1 = this;
            boolean r0 = r1.f9190
            return r0
    }

    @Override // Yue.InterfaceC2813
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo12256() {
            r1 = this;
            boolean r0 = r1.f9191
            return r0
    }

    @Override // Yue.InterfaceC2813
    /* JADX INFO: renamed from: ۥ۟۟ */
    public boolean mo12257() {
            r1 = this;
            boolean r0 = r1.f9192
            return r0
    }

    @Override // Yue.InterfaceC2813
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Yue.EnumC4633 mo12258() {
            r1 = this;
            Yue.ۥۣۣۡۢ r0 = r1.f9188
            return r0
    }

    @Override // Yue.InterfaceC2813
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo12259(Yue.InterfaceC2813 r4) {
            r3 = this;
            java.nio.ByteBuffer r0 = r4.mo6102()
            java.nio.ByteBuffer r1 = r3.f9189
            if (r1 != 0) goto L1e
            int r1 = r0.remaining()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r3.f9189 = r1
            r0.mark()
            java.nio.ByteBuffer r1 = r3.f9189
            r1.put(r0)
            r0.reset()
            goto L6b
        L1e:
            r0.mark()
            java.nio.ByteBuffer r1 = r3.f9189
            int r2 = r1.limit()
            r1.position(r2)
            java.nio.ByteBuffer r1 = r3.f9189
            int r2 = r1.capacity()
            r1.limit(r2)
            int r1 = r0.remaining()
            java.nio.ByteBuffer r2 = r3.f9189
            int r2 = r2.remaining()
            if (r1 <= r2) goto L5e
            int r1 = r0.remaining()
            java.nio.ByteBuffer r2 = r3.f9189
            int r2 = r2.capacity()
            int r1 = r1 + r2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteBuffer r2 = r3.f9189
            r2.flip()
            java.nio.ByteBuffer r2 = r3.f9189
            r1.put(r2)
            r1.put(r0)
            r3.f9189 = r1
            goto L63
        L5e:
            java.nio.ByteBuffer r1 = r3.f9189
            r1.put(r0)
        L63:
            java.nio.ByteBuffer r1 = r3.f9189
            r1.rewind()
            r0.reset()
        L6b:
            boolean r4 = r4.mo12261()
            r3.f9187 = r4
            return
    }

    @Override // Yue.InterfaceC2813
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo12260() {
            r1 = this;
            boolean r0 = r1.f9193
            return r0
    }

    @Override // Yue.InterfaceC2813
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo12261() {
            r1 = this;
            boolean r0 = r1.f9187
            return r0
    }

    @Override // Yue.InterfaceC2813
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public java.nio.ByteBuffer mo6102() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f9189
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public abstract void mo6103() throws Yue.C3342;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m12263(boolean r1) {
            r0 = this;
            r0.f9187 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo6104(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.f9189 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m12264(boolean r1) {
            r0 = this;
            r0.f9191 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m12265(boolean r1) {
            r0 = this;
            r0.f9192 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m12266(boolean r1) {
            r0 = this;
            r0.f9193 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m12267(boolean r1) {
            r0 = this;
            r0.f9190 = r1
            return
    }
}
