package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.5")
@InterfaceC8405(markerClass = {InterfaceC4776.class})
@InterfaceC5570
public final class C8080 implements Comparable<C8080> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1428 f23968 = new C1428(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final short f23969 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final short f23970 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f23971 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f23972 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final short f23973;

    /* JADX INFO: renamed from: Yue.ۥۢۢۨۤ$ۥ */
    public static final class C1428 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۢۨۤ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1428(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1428() {
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۢۢۨۤ.ۥ۟۟۟(short):Yue.ۥۢۢۨۤ] */
    @InterfaceC5498
    @InterfaceC6839
    public /* synthetic */ C8080(short s) {
        this.f23973 = s;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final short m4115(short s, short s2) {
        return m26590((short) (s & s2));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 short) A[MD:(short):void (m)] call: Yue.ۥۢۢۨۤ.<init>(short):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ C8080 m26585(short s) {
        return new C8080(s);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m26586(short s, byte b) {
        return C5499.m17107(s & f23970, b & 255);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m26587(short s, long j) {
        return Long.compareUnsigned(C8064.m26408(((long) s) & C8417.f25173), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m26588(short s, int i) {
        return Integer.compareUnsigned(C8057.m26318(s & f23970), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m26589(short s, short s2) {
        return C5499.m17107(s & f23970, s2 & f23970);
    }

    @InterfaceC5498
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static short m26590(short s) {
        return s;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final short m26591(short s) {
        return m26590((short) (s - 1));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m26592(short s, byte b) {
        return Integer.divideUnsigned(C8057.m26318(s & f23970), C8057.m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final long m26593(short s, long j) {
        return Long.divideUnsigned(C8064.m26408(((long) s) & C8417.f25173), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m26594(short s, int i) {
        return Integer.divideUnsigned(C8057.m26318(s & f23970), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int m26595(short s, short s2) {
        return Integer.divideUnsigned(C8057.m26318(s & f23970), C8057.m26318(s2 & f23970));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m26596(short s, Object obj) {
        return (obj instanceof C8080) && s == ((C8080) obj).m26642();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final boolean m26597(short s, short s2) {
        return s == s2;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m26598(short s, byte b) {
        return Integer.divideUnsigned(C8057.m26318(s & f23970), C8057.m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final long m26599(short s, long j) {
        return Long.divideUnsigned(C8064.m26408(((long) s) & C8417.f25173), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int m26600(short s, int i) {
        return Integer.divideUnsigned(C8057.m26318(s & f23970), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int m26601(short s, short s2) {
        return Integer.divideUnsigned(C8057.m26318(s & f23970), C8057.m26318(s2 & f23970));
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m26602() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static int m26603(short s) {
        return Short.hashCode(s);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final short m26604(short s) {
        return m26590((short) (s + 1));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final short m26605(short s) {
        return m26590((short) (~s));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int m26606(short s, byte b) {
        return C8057.m26318(C8057.m26318(s & f23970) - C8057.m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final long m26607(short s, long j) {
        return C8064.m26408(C8064.m26408(((long) s) & C8417.f25173) - j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int m26608(short s, int i) {
        return C8057.m26318(C8057.m26318(s & f23970) - i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int m26609(short s, short s2) {
        return C8057.m26318(C8057.m26318(s & f23970) - C8057.m26318(s2 & f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final byte m26610(short s, byte b) {
        return C8048.m26193((byte) Integer.remainderUnsigned(C8057.m26318(s & f23970), C8057.m26318(b & 255)));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final long m26611(short s, long j) {
        return Long.remainderUnsigned(C8064.m26408(((long) s) & C8417.f25173), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int m26612(short s, int i) {
        return Integer.remainderUnsigned(C8057.m26318(s & f23970), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final short m26613(short s, short s2) {
        return m26590((short) Integer.remainderUnsigned(C8057.m26318(s & f23970), C8057.m26318(s2 & f23970)));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final short m26614(short s, short s2) {
        return m26590((short) (s | s2));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int m26615(short s, byte b) {
        return C8057.m26318(C8057.m26318(s & f23970) + C8057.m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final long m26616(short s, long j) {
        return C8064.m26408(C8064.m26408(((long) s) & C8417.f25173) + j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int m26617(short s, int i) {
        return C8057.m26318(C8057.m26318(s & f23970) + i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int m26618(short s, short s2) {
        return C8057.m26318(C8057.m26318(s & f23970) + C8057.m26318(s2 & f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final C8063 m26619(short s, short s2) {
        return new C8063(C8057.m26318(s & f23970), C8057.m26318(s2 & f23970), null);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final C8063 m26620(short s, short s2) {
        return C8077.m26580(C8057.m26318(s & f23970), C8057.m26318(s2 & f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int m26621(short s, byte b) {
        return Integer.remainderUnsigned(C8057.m26318(s & f23970), C8057.m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final long m26622(short s, long j) {
        return Long.remainderUnsigned(C8064.m26408(((long) s) & C8417.f25173), j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int m26623(short s, int i) {
        return Integer.remainderUnsigned(C8057.m26318(s & f23970), i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int m26624(short s, short s2) {
        return Integer.remainderUnsigned(C8057.m26318(s & f23970), C8057.m26318(s2 & f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int m26625(short s, byte b) {
        return C8057.m26318(C8057.m26318(s & f23970) * C8057.m26318(b & 255));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final long m26626(short s, long j) {
        return C8064.m26408(C8064.m26408(((long) s) & C8417.f25173) * j);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m26627(short s, int i) {
        return C8057.m26318(C8057.m26318(s & f23970) * i);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m26628(short s, short s2) {
        return C8057.m26318(C8057.m26318(s & f23970) * C8057.m26318(s2 & f23970));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final byte m26629(short s) {
        return (byte) s;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final double m26630(short s) {
        return s & f23970;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final float m26631(short s) {
        return s & f23970;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int m26632(short s) {
        return s & f23970;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final long m26633(short s) {
        return ((long) s) & C8417.f25173;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final short m26634(short s) {
        return s;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static String m26635(short s) {
        return String.valueOf(s & f23970);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final byte m26636(short s) {
        return C8048.m26193((byte) s);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final int m26637(short s) {
        return C8057.m26318(s & f23970);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final long m26638(short s) {
        return C8064.m26408(((long) s) & C8417.f25173);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final short m26639(short s) {
        return s;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final short m26640(short s, short s2) {
        return m26590((short) (s ^ s2));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C8080 c8080) {
        return C5499.m17107(m26642() & f23970, c8080.m26642() & f23970);
    }

    public boolean equals(Object obj) {
        return m26596(this.f23973, obj);
    }

    public int hashCode() {
        return m26603(this.f23973);
    }

    @InterfaceC6399
    public String toString() {
        return m26635(this.f23973);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m26641(short s) {
        return C5499.m17107(m26642() & f23970, s & f23970);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public final /* synthetic */ short m26642() {
        return this.f23973;
    }
}
