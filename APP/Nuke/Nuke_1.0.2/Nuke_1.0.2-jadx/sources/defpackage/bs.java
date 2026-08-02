package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bs {
    public static final as Companion = new as();
    public final long a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ bs(long j, int i) {
        if ((i & 1) == 0) {
            this.a = 1000L;
        } else {
            this.a = j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs) && this.a == ((bs) obj).a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ChatAvatarRotatorConf(duration=" + this.a + ")";
    }

    public bs(long j) {
        this.a = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (1000 long) A[MD:(long):void (m)] (LINE:18) call: bs.<init>(long):void type: THIS */
    public /* synthetic */ bs() {
        this(1000L);
    }
}
