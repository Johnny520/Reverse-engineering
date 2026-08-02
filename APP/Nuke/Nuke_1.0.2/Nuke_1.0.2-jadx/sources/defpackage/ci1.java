package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ci1 {
    public static final bi1 Companion = new bi1();
    public final int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ci1(int i, int i2) {
        if ((i & 1) == 0) {
            this.a = 10;
        } else {
            this.a = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci1) && this.a == ((ci1) obj).a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return hk1.g(this.a, "ModifyFriendsCountConf(count=", ")");
    }

    public ci1(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (10 int) A[MD:(int):void (m)] (LINE:18) call: ci1.<init>(int):void type: THIS */
    public /* synthetic */ ci1() {
        this(10);
    }
}
