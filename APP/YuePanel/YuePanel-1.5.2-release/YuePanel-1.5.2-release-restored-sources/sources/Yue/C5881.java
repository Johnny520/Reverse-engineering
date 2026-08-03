package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5881 implements Iterable<Long>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0889 f14586 = new C0889(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f14587;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long f14588;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final long f14589;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨ$ۥ */
    public static final class C0889 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۠ۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0889(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C5881 m2550(long j, long j2, long j3) {
            return new C5881(j, j2, j3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0889() {
        }
    }

    public C5881(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f14587 = j;
        this.f14588 = C6823.m21577(j, j2, j3);
        this.f14589 = j3;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C5881) {
            if (!isEmpty() || !((C5881) obj).isEmpty()) {
                C5881 c5881 = (C5881) obj;
                if (this.f14587 != c5881.f14587 || this.f14588 != c5881.f14588 || this.f14589 != c5881.f14589) {
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
        long j = 31;
        long j2 = this.f14587;
        long j3 = this.f14588;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.f14589;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.f14589;
        long j2 = this.f14587;
        long j3 = this.f14588;
        if (j > 0) {
            if (j2 <= j3) {
                return false;
            }
        } else if (j2 >= j3) {
            return false;
        }
        return true;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f14589 > 0) {
            sb = new StringBuilder();
            sb.append(this.f14587);
            sb.append("..");
            sb.append(this.f14588);
            sb.append(" step ");
            j = this.f14589;
        } else {
            sb = new StringBuilder();
            sb.append(this.f14587);
            sb.append(" downTo ");
            sb.append(this.f14588);
            sb.append(" step ");
            j = -this.f14589;
        }
        sb.append(j);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m18192() {
        return this.f14587;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final long m18193() {
        return this.f14588;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final long m18194() {
        return this.f14589;
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC5880 iterator() {
        return new C5882(this.f14587, this.f14588, this.f14589);
    }
}
