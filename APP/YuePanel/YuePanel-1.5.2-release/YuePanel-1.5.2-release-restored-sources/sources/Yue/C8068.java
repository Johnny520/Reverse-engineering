package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4776.class})
@InterfaceC7470(version = "1.5")
public class C8068 implements Iterable<C8064>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1426 f23958 = new C1426(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f23959;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long f23960;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final long f23961;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۧ$ۥ */
    public static final class C1426 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۢۢۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1426(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C8068 m4100(long j, long j2, long j3) {
            return new C8068(j, j2, j3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1426() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 long), (r5v0 long) A[MD:(long, long, long):void (m)] (LINE:1) call: Yue.ۥۣۢۢۧ.<init>(long, long, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C8068(long j, long j2, long j3, C4335 c4335) {
        this(j, j2, j3);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C8068) {
            if (!isEmpty() || !((C8068) obj).isEmpty()) {
                C8068 c8068 = (C8068) obj;
                if (this.f23959 != c8068.f23959 || this.f23960 != c8068.f23960 || this.f23961 != c8068.f23961) {
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
        long j = this.f23959;
        int iM26408 = ((int) C8064.m26408(j ^ C8064.m26408(j >>> 32))) * 31;
        long j2 = this.f23960;
        int iM264082 = (iM26408 + ((int) C8064.m26408(j2 ^ C8064.m26408(j2 >>> 32)))) * 31;
        long j3 = this.f23961;
        return iM264082 + ((int) ((j3 >>> 32) ^ j3));
    }

    public boolean isEmpty() {
        long j = this.f23961;
        long j2 = this.f23959;
        long j3 = this.f23960;
        if (j > 0) {
            if (Long.compareUnsigned(j2, j3) <= 0) {
                return false;
            }
        } else if (Long.compareUnsigned(j2, j3) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @InterfaceC6399
    public final Iterator<C8064> iterator() {
        return new C8069(this.f23959, this.f23960, this.f23961, null);
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f23961 > 0) {
            sb = new StringBuilder();
            sb.append((Object) C8064.m26455(this.f23959));
            sb.append("..");
            sb.append((Object) C8064.m26455(this.f23960));
            sb.append(" step ");
            j = this.f23961;
        } else {
            sb = new StringBuilder();
            sb.append((Object) C8064.m26455(this.f23959));
            sb.append(" downTo ");
            sb.append((Object) C8064.m26455(this.f23960));
            sb.append(" step ");
            j = -this.f23961;
        }
        sb.append(j);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final long m26484() {
        return this.f23959;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final long m26485() {
        return this.f23960;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final long m26486() {
        return this.f23961;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8068(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f23959 = j;
        this.f23960 = C8074.m26521(j, j2, j3);
        this.f23961 = j3;
    }
}
