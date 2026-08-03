package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3782 implements Iterable<Character>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0252 f6962 = new C0252(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final char f6963;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final char f6964;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f6965;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۟$ۥ */
    public static final class C0252 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣ۟ۤ۟.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0252(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C3782 m828(char c, char c2, int i) {
            return new C3782(c, c2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0252() {
        }
    }

    public C3782(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6963 = c;
        this.f6964 = (char) C6823.m21576(c, c2, i);
        this.f6965 = i;
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C3782) {
            if (!isEmpty() || !((C3782) obj).isEmpty()) {
                C3782 c3782 = (C3782) obj;
                if (this.f6963 != c3782.f6963 || this.f6964 != c3782.f6964 || this.f6965 != c3782.f6965) {
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
        return (((this.f6963 * 31) + this.f6964) * 31) + this.f6965;
    }

    public boolean isEmpty() {
        if (this.f6965 > 0) {
            if (C5499.m17107(this.f6963, this.f6964) <= 0) {
                return false;
            }
        } else if (C5499.m17107(this.f6963, this.f6964) >= 0) {
            return false;
        }
        return true;
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f6965 > 0) {
            sb = new StringBuilder();
            sb.append(this.f6963);
            sb.append("..");
            sb.append(this.f6964);
            sb.append(" step ");
            i = this.f6965;
        } else {
            sb = new StringBuilder();
            sb.append(this.f6963);
            sb.append(" downTo ");
            sb.append(this.f6964);
            sb.append(" step ");
            i = -this.f6965;
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final char m10376() {
        return this.f6963;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final char m10377() {
        return this.f6964;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m10378() {
        return this.f6965;
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC3781 iterator() {
        return new C3783(this.f6963, this.f6964, this.f6965);
    }
}
