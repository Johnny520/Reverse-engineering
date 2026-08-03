package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4776.class})
@InterfaceC7470(version = "1.5")
public final class C8070 extends C8068 implements InterfaceC3854<C8064>, InterfaceC6571<C8064> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1427 f23966 = new C1427(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C8070 f23967 = new C8070(-1, 0, null);

    /* JADX INFO: renamed from: Yue.ۥۢۢۧۥ$ۥ */
    public static final class C1427 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۢۧۥ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1427(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C8070 m4102() {
            return C8070.f23967;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1427() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 long) A[MD:(long, long):void (m)] (LINE:1) call: Yue.ۥۢۢۧۥ.<init>(long, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C8070(long j, long j2, C4335 c4335) {
        this(j, j2);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC4372(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m26488() {
    }

    @Override // Yue.C8068
    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C8070) {
            if (!isEmpty() || !((C8070) obj).isEmpty()) {
                C8070 c8070 = (C8070) obj;
                if (m26484() != c8070.m26484() || m26485() != c8070.m26485()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Yue.C8068
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) C8064.m26408(m26484() ^ C8064.m26408(m26484() >>> 32))) * 31) + ((int) C8064.m26408(m26485() ^ C8064.m26408(m26485() >>> 32)));
    }

    @Override // Yue.C8068, Yue.InterfaceC3854, Yue.InterfaceC6571
    public boolean isEmpty() {
        return Long.compareUnsigned(m26484(), m26485()) > 0;
    }

    @Override // Yue.C8068
    @InterfaceC6399
    public String toString() {
        return ((Object) C8064.m26455(m26484())) + ".." + ((Object) C8064.m26455(m26485()));
    }

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo829(Comparable comparable) {
        return m26489(((C8064) comparable).m26462());
    }

    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ۟ */
    public /* bridge */ /* synthetic */ Comparable mo830() {
        return C8064.m26403(m26492());
    }

    @Override // Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public /* bridge */ /* synthetic */ Comparable mo10383() {
        return C8064.m26403(m26490());
    }

    @Override // Yue.InterfaceC3854
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public /* bridge */ /* synthetic */ Comparable mo10384() {
        return C8064.m26403(m26491());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m26489(long j) {
        return Long.compareUnsigned(m26484(), j) <= 0 && Long.compareUnsigned(j, m26485()) <= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public long m26490() {
        if (m26485() != -1) {
            return C8064.m26408(m26485() + C8064.m26408(((long) 1) & C8578.f25466));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public long m26491() {
        return m26485();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public long m26492() {
        return m26484();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8070(long j, long j2) {
        super(j, j2, 1L, null);
    }
}
