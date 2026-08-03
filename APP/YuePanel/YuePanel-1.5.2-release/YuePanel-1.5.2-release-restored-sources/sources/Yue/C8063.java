package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4776.class})
@InterfaceC7470(version = "1.5")
public final class C8063 extends C8061 implements InterfaceC3854<C8057>, InterfaceC6571<C8057> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1423 f23947;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C8063 f23948;

    /* JADX INFO: renamed from: Yue.ۥۢۢۧ$ۥ */
    public static final class C1423 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۢۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1423(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C8063 m4091() {
            return C8063.f23948;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1423() {
        }
    }

    static {
        C4335 c4335 = null;
        f23947 = new C1423(c4335);
        f23948 = new C8063(-1, 0, c4335);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 int) A[MD:(int, int):void (m)] (LINE:1) call: Yue.ۥۢۢۧ.<init>(int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C8063(int i, int i2, C4335 c4335) {
        this(i, i2);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC4372(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m26398() {
    }

    @Override // Yue.C8061
    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C8063) {
            if (!isEmpty() || !((C8063) obj).isEmpty()) {
                C8063 c8063 = (C8063) obj;
                if (m26394() != c8063.m26394() || m26395() != c8063.m26395()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Yue.C8061
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m26394() * 31) + m26395();
    }

    @Override // Yue.C8061, Yue.InterfaceC3854, Yue.InterfaceC6571
    public boolean isEmpty() {
        return Integer.compareUnsigned(m26394(), m26395()) > 0;
    }

    @Override // Yue.C8061
    @InterfaceC6399
    public String toString() {
        return ((Object) C8057.m26365(m26394())) + ".." + ((Object) C8057.m26365(m26395()));
    }

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo829(Comparable comparable) {
        return m26399(((C8057) comparable).m26372());
    }

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ Comparable mo830() {
        return C8057.m26313(m26402());
    }

    @Override // Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ Comparable mo10383() {
        return C8057.m26313(m26400());
    }

    @Override // Yue.InterfaceC3854
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ Comparable mo10384() {
        return C8057.m26313(m26401());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m26399(int i) {
        return Integer.compareUnsigned(m26394(), i) <= 0 && Integer.compareUnsigned(i, m26395()) <= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m26400() {
        if (m26395() != -1) {
            return C8057.m26318(m26395() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m26401() {
        return m26395();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m26402() {
        return m26394();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8063(int i, int i2) {
        super(i, i2, 1, null);
    }
}
