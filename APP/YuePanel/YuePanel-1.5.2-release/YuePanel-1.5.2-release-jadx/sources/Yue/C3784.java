package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3784 extends C3782 implements InterfaceC3854<Character>, InterfaceC6571<Character> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0253 f6970 = new C0253(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3784 f6971 = new C3784(1, 0);

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ$ۥ */
    public static final class C0253 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۤۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0253(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C3784 m831() {
            return C3784.f6971;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0253() {
        }
    }

    public C3784(char c, char c2) {
        super(c, c2, 1);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC4372(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m10382() {
    }

    @Override // Yue.C3782
    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C3784) {
            if (!isEmpty() || !((C3784) obj).isEmpty()) {
                C3784 c3784 = (C3784) obj;
                if (m10376() != c3784.m10376() || m10377() != c3784.m10377()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Yue.C3782
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m10376() * 31) + m10377();
    }

    @Override // Yue.C3782, Yue.InterfaceC3854, Yue.InterfaceC6571
    public boolean isEmpty() {
        return C5499.m17107(m10376(), m10377()) > 0;
    }

    @Override // Yue.C3782
    @InterfaceC6399
    public String toString() {
        return m10376() + ".." + m10377();
    }

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo829(Comparable comparable) {
        return m10385(((Character) comparable).charValue());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m10385(char c) {
        return C5499.m17107(m10376(), c) <= 0 && C5499.m17107(c, m10377()) <= 0;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Character mo10383() {
        if (m10377() != 65535) {
            return Character.valueOf((char) (m10377() + 1));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Character mo10384() {
        return Character.valueOf(m10377());
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Character mo830() {
        return Character.valueOf(m10376());
    }
}
