package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5458 extends C5456 implements InterfaceC3854<Integer>, InterfaceC6571<Integer> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0770 f13420 = new C0770(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C5458 f13421 = new C5458(1, 0);

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۣۨ$ۥ */
    public static final class C0770 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۥۣۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0770(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C5458 m2227() {
            return C5458.f13421;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0770() {
        }
    }

    public C5458(int i, int i2) {
        super(i, i2, 1);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC4372(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m16970() {
    }

    @Override // Yue.C5456
    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C5458) {
            if (!isEmpty() || !((C5458) obj).isEmpty()) {
                C5458 c5458 = (C5458) obj;
                if (m16964() != c5458.m16964() || m16965() != c5458.m16965()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Yue.C5456
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m16964() * 31) + m16965();
    }

    @Override // Yue.C5456, Yue.InterfaceC3854, Yue.InterfaceC6571
    public boolean isEmpty() {
        return m16964() > m16965();
    }

    @Override // Yue.C5456
    @InterfaceC6399
    public String toString() {
        return m16964() + ".." + m16965();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo829(Comparable comparable) {
        return m16971(((Number) comparable).intValue());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m16971(int i) {
        return m16964() <= i && i <= m16965();
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Integer mo10383() {
        if (m16965() != Integer.MAX_VALUE) {
            return Integer.valueOf(m16965() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Integer mo10384() {
        return Integer.valueOf(m16965());
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Integer mo830() {
        return Integer.valueOf(m16964());
    }
}
