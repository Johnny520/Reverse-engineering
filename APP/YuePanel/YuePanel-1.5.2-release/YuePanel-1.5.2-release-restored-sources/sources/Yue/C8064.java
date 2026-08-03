package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.5")
@InterfaceC8405(markerClass = {InterfaceC4776.class})
@InterfaceC5570
public final class C8064 implements Comparable<C8064> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1424 f23949 = new C1424(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long f23950 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long f23951 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f23952 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f23953 = 64;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f23954;

    /* JADX INFO: renamed from: Yue.ۥۢۢۧ۟$ۥ */
    public static final class C1424 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۢۧ۟.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1424(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1424() {
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۢۢۧ۟.ۥ۟۟۟(long):Yue.ۥۢۢۧ۟] */
    @InterfaceC5498
    @InterfaceC6839
    public /* synthetic */ C8064(long j) {
        this.f23954 = j;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final long m4092(long j, long j2) {
        return m26408(j & j2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 long) A[MD:(long):void (m)] call: Yue.ۥۢۢۧ۟.<init>(long):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ C8064 m26403(long j) {
        return new C8064(j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m26404(long j, byte b) {
        return Long.compareUnsigned(j, m26408(((long) b) & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m26405(long j, long j2) {
        return C8113.m26716(j, j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m26406(long j, int i) {
        return Long.compareUnsigned(j, m26408(((long) i) & C8578.f25466));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m26407(long j, short s) {
        return Long.compareUnsigned(j, m26408(((long) s) & C8417.f25173));
    }

    @InterfaceC5498
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static long m26408(long j) {
        return j;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final long m26409(long j) {
        return m26408(j - 1);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m26410(long j, byte b) {
        return Long.divideUnsigned(j, m26408(((long) b) & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final long m26411(long j, long j2) {
        return C8113.m26717(j, j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long m26412(long j, int i) {
        return Long.divideUnsigned(j, m26408(((long) i) & C8578.f25466));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final long m26413(long j, short s) {
        return Long.divideUnsigned(j, m26408(((long) s) & C8417.f25173));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m26414(long j, Object obj) {
        return (obj instanceof C8064) && j == ((C8064) obj).m26462();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final boolean m26415(long j, long j2) {
        return j == j2;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final long m26416(long j, byte b) {
        return Long.divideUnsigned(j, m26408(((long) b) & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long m26417(long j, long j2) {
        return Long.divideUnsigned(j, j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long m26418(long j, int i) {
        return Long.divideUnsigned(j, m26408(((long) i) & C8578.f25466));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long m26419(long j, short s) {
        return Long.divideUnsigned(j, m26408(((long) s) & C8417.f25173));
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m26420() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static int m26421(long j) {
        return Long.hashCode(j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final long m26422(long j) {
        return m26408(j + 1);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final long m26423(long j) {
        return m26408(~j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final long m26424(long j, byte b) {
        return m26408(j - m26408(((long) b) & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final long m26425(long j, long j2) {
        return m26408(j - j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final long m26426(long j, int i) {
        return m26408(j - m26408(((long) i) & C8578.f25466));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final long m26427(long j, short s) {
        return m26408(j - m26408(((long) s) & C8417.f25173));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final byte m26428(long j, byte b) {
        return C8048.m26193((byte) Long.remainderUnsigned(j, m26408(((long) b) & 255)));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final long m26429(long j, long j2) {
        return Long.remainderUnsigned(j, j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int m26430(long j, int i) {
        return C8057.m26318((int) Long.remainderUnsigned(j, m26408(((long) i) & C8578.f25466)));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final short m26431(long j, short s) {
        return C8080.m26590((short) Long.remainderUnsigned(j, m26408(((long) s) & C8417.f25173)));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final long m26432(long j, long j2) {
        return m26408(j | j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final long m26433(long j, byte b) {
        return m26408(j + m26408(((long) b) & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final long m26434(long j, long j2) {
        return m26408(j + j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final long m26435(long j, int i) {
        return m26408(j + m26408(((long) i) & C8578.f25466));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final long m26436(long j, short s) {
        return m26408(j + m26408(((long) s) & C8417.f25173));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final C8070 m26437(long j, long j2) {
        return new C8070(j, j2, null);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final C8070 m26438(long j, long j2) {
        return C8077.m26582(j, j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final long m26439(long j, byte b) {
        return Long.remainderUnsigned(j, m26408(((long) b) & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final long m26440(long j, long j2) {
        return C8113.m26718(j, j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final long m26441(long j, int i) {
        return Long.remainderUnsigned(j, m26408(((long) i) & C8578.f25466));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final long m26442(long j, short s) {
        return Long.remainderUnsigned(j, m26408(((long) s) & C8417.f25173));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final long m26443(long j, int i) {
        return m26408(j << i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final long m26444(long j, int i) {
        return m26408(j >>> i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m26445(long j, byte b) {
        return m26408(j * m26408(((long) b) & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final long m26446(long j, long j2) {
        return m26408(j * j2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final long m26447(long j, int i) {
        return m26408(j * m26408(((long) i) & C8578.f25466));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final long m26448(long j, short s) {
        return m26408(j * m26408(((long) s) & C8417.f25173));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final byte m26449(long j) {
        return (byte) j;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final double m26450(long j) {
        return C8113.m26719(j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final float m26451(long j) {
        return (float) C8113.m26719(j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final int m26452(long j) {
        return (int) j;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final long m26453(long j) {
        return j;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final short m26454(long j) {
        return (short) j;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static String m26455(long j) {
        return C8113.m26720(j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final byte m26456(long j) {
        return C8048.m26193((byte) j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final int m26457(long j) {
        return C8057.m26318((int) j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final long m26458(long j) {
        return j;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final short m26459(long j) {
        return C8080.m26590((short) j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final long m26460(long j, long j2) {
        return m26408(j ^ j2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C8064 c8064) {
        return C8113.m26716(m26462(), c8064.m26462());
    }

    public boolean equals(Object obj) {
        return m26414(this.f23954, obj);
    }

    public int hashCode() {
        return m26421(this.f23954);
    }

    @InterfaceC6399
    public String toString() {
        return m26455(this.f23954);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m26461(long j) {
        return C8113.m26716(m26462(), j);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final /* synthetic */ long m26462() {
        return this.f23954;
    }
}
