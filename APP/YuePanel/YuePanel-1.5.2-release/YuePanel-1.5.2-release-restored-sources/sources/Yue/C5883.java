package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5883 extends C5881 implements InterfaceC3854<Long>, InterfaceC6571<Long> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0890 f14594 = new C0890(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C5883 f14595 = new C5883(1, 0);

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۠$ۥ */
    public static final class C0890 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۠ۨ۠.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0890(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C5883 m2551() {
            return C5883.f14595;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0890() {
        }
    }

    public C5883(long j, long j2) {
        super(j, j2, 1L);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC4372(message = "Can throw an exception when it's impossible to represent the value with Long type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @InterfaceC7470(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m18198() {
    }

    @Override // Yue.C5881
    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C5883) {
            if (!isEmpty() || !((C5883) obj).isEmpty()) {
                C5883 c5883 = (C5883) obj;
                if (m18192() != c5883.m18192() || m18193() != c5883.m18193()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Yue.C5881
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (m18192() ^ (m18192() >>> 32))) + (m18193() ^ (m18193() >>> 32)));
    }

    @Override // Yue.C5881, Yue.InterfaceC3854, Yue.InterfaceC6571
    public boolean isEmpty() {
        return m18192() > m18193();
    }

    @Override // Yue.C5881
    @InterfaceC6399
    public String toString() {
        return m18192() + ".." + m18193();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Comparable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ boolean mo829(Comparable comparable) {
        return m18199(((Number) comparable).longValue());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m18199(long j) {
        return m18192() <= j && j <= m18193();
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Long mo10383() {
        if (m18193() != Long.MAX_VALUE) {
            return Long.valueOf(m18193() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Long mo10384() {
        return Long.valueOf(m18193());
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟()Ljava/lang/Comparable; */
    @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Long mo830() {
        return Long.valueOf(m18192());
    }
}
