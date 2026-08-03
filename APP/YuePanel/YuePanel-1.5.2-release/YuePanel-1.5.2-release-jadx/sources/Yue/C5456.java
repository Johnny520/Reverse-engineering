package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۣۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5456 implements Iterable<Integer>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0769 f13412 = new C0769(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f13413;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f13414;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f13415;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۣۦ$ۥ */
    public static final class C0769 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۥۣۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0769(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C5456 m2226(int i, int i2, int i3) {
            return new C5456(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0769() {
        }
    }

    public C5456(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f13413 = i;
        this.f13414 = C6823.m21576(i, i2, i3);
        this.f13415 = i3;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C5456) {
            if (!isEmpty() || !((C5456) obj).isEmpty()) {
                C5456 c5456 = (C5456) obj;
                if (this.f13413 != c5456.f13413 || this.f13414 != c5456.f13414 || this.f13415 != c5456.f13415) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f13413 * 31) + this.f13414) * 31) + this.f13415;
    }

    public boolean isEmpty() {
        if (this.f13415 > 0) {
            if (this.f13413 <= this.f13414) {
                return false;
            }
        } else if (this.f13413 >= this.f13414) {
            return false;
        }
        return true;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f13415 > 0) {
            sb = new StringBuilder();
            sb.append(this.f13413);
            sb.append("..");
            sb.append(this.f13414);
            sb.append(" step ");
            i = this.f13415;
        } else {
            sb = new StringBuilder();
            sb.append(this.f13413);
            sb.append(" downTo ");
            sb.append(this.f13414);
            sb.append(" step ");
            i = -this.f13415;
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m16964() {
        return this.f13413;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m16965() {
        return this.f13414;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m16966() {
        return this.f13415;
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC5455 iterator() {
        return new C5457(this.f13413, this.f13414, this.f13415);
    }
}
