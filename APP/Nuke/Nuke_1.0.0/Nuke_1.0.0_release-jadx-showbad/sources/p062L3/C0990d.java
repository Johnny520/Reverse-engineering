package p062L3;

/* JADX INFO: renamed from: L3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0990d {
    public static final C0989c Companion = new C0989c();

    /* JADX INFO: renamed from: a */
    public final long f3060a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0990d(long j5) {
        this.f3060a = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0990d) && this.f3060a == ((C0990d) obj).f3060a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f3060a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ChatAvatarRotatorConf(duration=" + this.f3060a + ")";
    }

    public /* synthetic */ C0990d(long j5, int i5) {
        if ((i5 & 1) == 0) {
            this.f3060a = 1000L;
        } else {
            this.f3060a = j5;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (1000 long) A[MD:(long):void (m)] (LINE:4) call: L3.d.<init>(long):void type: THIS */
    public /* synthetic */ C0990d() {
        this(1000L);
    }
}
