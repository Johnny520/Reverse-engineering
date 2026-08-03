package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۢۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4776.class})
@InterfaceC7470(version = "1.5")
public class C8061 implements Iterable<C8057>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1422 f23939 = new C1422(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int f23940;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f23941;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f23942;

    /* JADX INFO: renamed from: Yue.ۥۢۢۦۧ$ۥ */
    public static final class C1422 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۢۦۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1422(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C8061 m4089(int i, int i2, int i3) {
            return new C8061(i, i2, i3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1422() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 int), (r3v0 int) A[MD:(int, int, int):void (m)] (LINE:1) call: Yue.ۥۢۢۦۧ.<init>(int, int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C8061(int i, int i2, int i3, C4335 c4335) {
        this(i, i2, i3);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj instanceof C8061) {
            if (!isEmpty() || !((C8061) obj).isEmpty()) {
                C8061 c8061 = (C8061) obj;
                if (this.f23940 != c8061.f23940 || this.f23941 != c8061.f23941 || this.f23942 != c8061.f23942) {
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
        return (((this.f23940 * 31) + this.f23941) * 31) + this.f23942;
    }

    public boolean isEmpty() {
        if (this.f23942 > 0) {
            if (Integer.compareUnsigned(this.f23940, this.f23941) <= 0) {
                return false;
            }
        } else if (Integer.compareUnsigned(this.f23940, this.f23941) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @InterfaceC6399
    public final Iterator<C8057> iterator() {
        return new C8062(this.f23940, this.f23941, this.f23942, null);
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f23942 > 0) {
            sb = new StringBuilder();
            sb.append((Object) C8057.m26365(this.f23940));
            sb.append("..");
            sb.append((Object) C8057.m26365(this.f23941));
            sb.append(" step ");
            i = this.f23942;
        } else {
            sb = new StringBuilder();
            sb.append((Object) C8057.m26365(this.f23940));
            sb.append(" downTo ");
            sb.append((Object) C8057.m26365(this.f23941));
            sb.append(" step ");
            i = -this.f23942;
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m26394() {
        return this.f23940;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m26395() {
        return this.f23941;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m26396() {
        return this.f23942;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8061(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f23940 = i;
        this.f23941 = C8074.m26522(i, i2, i3);
        this.f23942 = i3;
    }
}
