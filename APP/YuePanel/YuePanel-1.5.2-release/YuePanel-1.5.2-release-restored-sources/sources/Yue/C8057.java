package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.5")
@InterfaceC8405(markerClass = {InterfaceC4776.class})
@InterfaceC5570
public final class C8057 implements Comparable<C8057> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1420 f23930 = new C1420(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f23931 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f23932 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f23933 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f23934 = 32;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f23935;

    /* JADX INFO: renamed from: Yue.ۥۢۢۦۣ$ۥ */
    public static final class C1420 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۢۦۣ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1420(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1420() {
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۢۢۦۣ.ۥ۟۟۟(int):Yue.ۥۢۢۦۣ] */
    @InterfaceC5498
    @InterfaceC6839
    public /* synthetic */ C8057(int i) {
        this.f23935 = i;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final int m4081(int i, int i2) {
        return m26318(i & i2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: Yue.ۥۢۢۦۣ.<init>(int):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ C8057 m26313(int i) {
        return new C8057(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m26314(int i, byte b) {
        return Integer.compareUnsigned(i, m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m26315(int i, long j) {
        return Long.compareUnsigned(C8064.m26408(((long) i) & C8578.f25466), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m26316(int i, int i2) {
        return C8113.m26712(i, i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m26317(int i, short s) {
        return Integer.compareUnsigned(i, m26318(s & C8080.f23970));
    }

    @InterfaceC5498
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m26318(int i) {
        return i;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m26319(int i) {
        return m26318(i - 1);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m26320(int i, byte b) {
        return Integer.divideUnsigned(i, m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final long m26321(int i, long j) {
        return Long.divideUnsigned(C8064.m26408(((long) i) & C8578.f25466), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m26322(int i, int i2) {
        return C8113.m26713(i, i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int m26323(int i, short s) {
        return Integer.divideUnsigned(i, m26318(s & C8080.f23970));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m26324(int i, Object obj) {
        return (obj instanceof C8057) && i == ((C8057) obj).m26372();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final boolean m26325(int i, int i2) {
        return i == i2;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m26326(int i, byte b) {
        return Integer.divideUnsigned(i, m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long m26327(int i, long j) {
        return Long.divideUnsigned(C8064.m26408(((long) i) & C8578.f25466), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int m26328(int i, int i2) {
        return Integer.divideUnsigned(i, i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int m26329(int i, short s) {
        return Integer.divideUnsigned(i, m26318(s & C8080.f23970));
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m26330() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static int m26331(int i) {
        return Integer.hashCode(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int m26332(int i) {
        return m26318(i + 1);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int m26333(int i) {
        return m26318(~i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int m26334(int i, byte b) {
        return m26318(i - m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final long m26335(int i, long j) {
        return C8064.m26408(C8064.m26408(((long) i) & C8578.f25466) - j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int m26336(int i, int i2) {
        return m26318(i - i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int m26337(int i, short s) {
        return m26318(i - m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final byte m26338(int i, byte b) {
        return C8048.m26193((byte) Integer.remainderUnsigned(i, m26318(b & 255)));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final long m26339(int i, long j) {
        return Long.remainderUnsigned(C8064.m26408(((long) i) & C8578.f25466), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int m26340(int i, int i2) {
        return Integer.remainderUnsigned(i, i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final short m26341(int i, short s) {
        return C8080.m26590((short) Integer.remainderUnsigned(i, m26318(s & C8080.f23970)));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int m26342(int i, int i2) {
        return m26318(i | i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int m26343(int i, byte b) {
        return m26318(i + m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final long m26344(int i, long j) {
        return C8064.m26408(C8064.m26408(((long) i) & C8578.f25466) + j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int m26345(int i, int i2) {
        return m26318(i + i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int m26346(int i, short s) {
        return m26318(i + m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final C8063 m26347(int i, int i2) {
        return new C8063(i, i2, null);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final C8063 m26348(int i, int i2) {
        return C8077.m26580(i, i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int m26349(int i, byte b) {
        return Integer.remainderUnsigned(i, m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final long m26350(int i, long j) {
        return Long.remainderUnsigned(C8064.m26408(((long) i) & C8578.f25466), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int m26351(int i, int i2) {
        return C8113.m26714(i, i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int m26352(int i, short s) {
        return Integer.remainderUnsigned(i, m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int m26353(int i, int i2) {
        return m26318(i << i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int m26354(int i, int i2) {
        return m26318(i >>> i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m26355(int i, byte b) {
        return m26318(i * m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final long m26356(int i, long j) {
        return C8064.m26408(C8064.m26408(((long) i) & C8578.f25466) * j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int m26357(int i, int i2) {
        return m26318(i * i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int m26358(int i, short s) {
        return m26318(i * m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final byte m26359(int i) {
        return (byte) i;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final double m26360(int i) {
        return C8113.m26715(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final float m26361(int i) {
        return (float) C8113.m26715(i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final int m26362(int i) {
        return i;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final long m26363(int i) {
        return ((long) i) & C8578.f25466;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final short m26364(int i) {
        return (short) i;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static String m26365(int i) {
        return String.valueOf(((long) i) & C8578.f25466);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final byte m26366(int i) {
        return C8048.m26193((byte) i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final int m26367(int i) {
        return i;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final long m26368(int i) {
        return C8064.m26408(((long) i) & C8578.f25466);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final short m26369(int i) {
        return C8080.m26590((short) i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final int m26370(int i, int i2) {
        return m26318(i ^ i2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C8057 c8057) {
        return C8113.m26712(m26372(), c8057.m26372());
    }

    public boolean equals(Object obj) {
        return m26324(this.f23935, obj);
    }

    public int hashCode() {
        return m26331(this.f23935);
    }

    @InterfaceC6399
    public String toString() {
        return m26365(this.f23935);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m26371(int i) {
        return C8113.m26712(m26372(), i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final /* synthetic */ int m26372() {
        return this.f23935;
    }
}
