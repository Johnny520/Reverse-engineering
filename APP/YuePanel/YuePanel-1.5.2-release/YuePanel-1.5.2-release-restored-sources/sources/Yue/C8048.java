package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.5")
@InterfaceC8405(markerClass = {InterfaceC4776.class})
@InterfaceC5570
public final class C8048 implements Comparable<C8048> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1418 f23921 = new C1418(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final byte f23922 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final byte f23923 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f23924 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f23925 = 8;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final byte f23926;

    /* JADX INFO: renamed from: Yue.ۥۢۢۥۥ$ۥ */
    public static final class C1418 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۢۥۥ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1418(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1418() {
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۢۢۥۥ.ۥ۟۟۟(byte):Yue.ۥۢۢۥۥ] */
    @InterfaceC5498
    @InterfaceC6839
    public /* synthetic */ C8048(byte b) {
        this.f23926 = b;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final byte m4067(byte b, byte b2) {
        return m26193((byte) (b & b2));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 byte) A[MD:(byte):void (m)] call: Yue.ۥۢۢۥۥ.<init>(byte):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ C8048 m26188(byte b) {
        return new C8048(b);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m26189(byte b, byte b2) {
        return C5499.m17107(b & 255, b2 & 255);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m26190(byte b, long j) {
        return Long.compareUnsigned(C8064.m26408(((long) b) & 255), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m26191(byte b, int i) {
        return Integer.compareUnsigned(C8057.m26318(b & 255), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m26192(byte b, short s) {
        return C5499.m17107(b & 255, s & C8080.f23970);
    }

    @InterfaceC5498
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static byte m26193(byte b) {
        return b;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final byte m26194(byte b) {
        return m26193((byte) (b - 1));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m26195(byte b, byte b2) {
        return Integer.divideUnsigned(C8057.m26318(b & 255), C8057.m26318(b2 & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final long m26196(byte b, long j) {
        return Long.divideUnsigned(C8064.m26408(((long) b) & 255), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m26197(byte b, int i) {
        return Integer.divideUnsigned(C8057.m26318(b & 255), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int m26198(byte b, short s) {
        return Integer.divideUnsigned(C8057.m26318(b & 255), C8057.m26318(s & C8080.f23970));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m26199(byte b, Object obj) {
        return (obj instanceof C8048) && b == ((C8048) obj).m26245();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final boolean m26200(byte b, byte b2) {
        return b == b2;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m26201(byte b, byte b2) {
        return Integer.divideUnsigned(C8057.m26318(b & 255), C8057.m26318(b2 & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long m26202(byte b, long j) {
        return Long.divideUnsigned(C8064.m26408(((long) b) & 255), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int m26203(byte b, int i) {
        return Integer.divideUnsigned(C8057.m26318(b & 255), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int m26204(byte b, short s) {
        return Integer.divideUnsigned(C8057.m26318(b & 255), C8057.m26318(s & C8080.f23970));
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m26205() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static int m26206(byte b) {
        return Byte.hashCode(b);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final byte m26207(byte b) {
        return m26193((byte) (b + 1));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final byte m26208(byte b) {
        return m26193((byte) (~b));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int m26209(byte b, byte b2) {
        return C8057.m26318(C8057.m26318(b & 255) - C8057.m26318(b2 & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final long m26210(byte b, long j) {
        return C8064.m26408(C8064.m26408(((long) b) & 255) - j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int m26211(byte b, int i) {
        return C8057.m26318(C8057.m26318(b & 255) - i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int m26212(byte b, short s) {
        return C8057.m26318(C8057.m26318(b & 255) - C8057.m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final byte m26213(byte b, byte b2) {
        return m26193((byte) Integer.remainderUnsigned(C8057.m26318(b & 255), C8057.m26318(b2 & 255)));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final long m26214(byte b, long j) {
        return Long.remainderUnsigned(C8064.m26408(((long) b) & 255), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int m26215(byte b, int i) {
        return Integer.remainderUnsigned(C8057.m26318(b & 255), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final short m26216(byte b, short s) {
        return C8080.m26590((short) Integer.remainderUnsigned(C8057.m26318(b & 255), C8057.m26318(s & C8080.f23970)));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final byte m26217(byte b, byte b2) {
        return m26193((byte) (b | b2));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int m26218(byte b, byte b2) {
        return C8057.m26318(C8057.m26318(b & 255) + C8057.m26318(b2 & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final long m26219(byte b, long j) {
        return C8064.m26408(C8064.m26408(((long) b) & 255) + j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int m26220(byte b, int i) {
        return C8057.m26318(C8057.m26318(b & 255) + i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int m26221(byte b, short s) {
        return C8057.m26318(C8057.m26318(b & 255) + C8057.m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final C8063 m26222(byte b, byte b2) {
        return new C8063(C8057.m26318(b & 255), C8057.m26318(b2 & 255), null);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final C8063 m26223(byte b, byte b2) {
        return C8077.m26580(C8057.m26318(b & 255), C8057.m26318(b2 & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int m26224(byte b, byte b2) {
        return Integer.remainderUnsigned(C8057.m26318(b & 255), C8057.m26318(b2 & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final long m26225(byte b, long j) {
        return Long.remainderUnsigned(C8064.m26408(((long) b) & 255), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int m26226(byte b, int i) {
        return Integer.remainderUnsigned(C8057.m26318(b & 255), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int m26227(byte b, short s) {
        return Integer.remainderUnsigned(C8057.m26318(b & 255), C8057.m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int m26228(byte b, byte b2) {
        return C8057.m26318(C8057.m26318(b & 255) * C8057.m26318(b2 & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final long m26229(byte b, long j) {
        return C8064.m26408(C8064.m26408(((long) b) & 255) * j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m26230(byte b, int i) {
        return C8057.m26318(C8057.m26318(b & 255) * i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m26231(byte b, short s) {
        return C8057.m26318(C8057.m26318(b & 255) * C8057.m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final byte m26232(byte b) {
        return b;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final double m26233(byte b) {
        return b & 255;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final float m26234(byte b) {
        return b & 255;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int m26235(byte b) {
        return b & 255;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final long m26236(byte b) {
        return ((long) b) & 255;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final short m26237(byte b) {
        return (short) (b & 255);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static String m26238(byte b) {
        return String.valueOf(b & 255);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final byte m26239(byte b) {
        return b;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final int m26240(byte b) {
        return C8057.m26318(b & 255);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final long m26241(byte b) {
        return C8064.m26408(((long) b) & 255);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final short m26242(byte b) {
        return C8080.m26590((short) (b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final byte m26243(byte b, byte b2) {
        return m26193((byte) (b ^ b2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C8048 c8048) {
        return C5499.m17107(m26245() & 255, c8048.m26245() & 255);
    }

    public boolean equals(Object obj) {
        return m26199(this.f23926, obj);
    }

    public int hashCode() {
        return m26206(this.f23926);
    }

    @InterfaceC6399
    public String toString() {
        return m26238(this.f23926);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m26244(byte b) {
        return C5499.m17107(m26245() & 255, b & 255);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public final /* synthetic */ byte m26245() {
        return this.f23926;
    }
}
