package Yue;

import Yue.InterfaceC4025;
import Yue.InterfaceC7814;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4774
@InterfaceC4372(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@InterfaceC7470(version = "1.3")
public abstract class AbstractC2983 implements InterfaceC7814.InterfaceC7816 {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final EnumC4559 f23;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡ۟$ۥ */
    public static final class C0012 implements InterfaceC4025 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final double f4319;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final AbstractC2983 f4320;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final long f4321;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 double), (r3v0 Yue.ۥ۟۟ۡ۟), (r4v0 long) A[MD:(double, Yue.ۥ۟۟ۡ۟, long):void (m)] (LINE:1) call: Yue.ۥ۟۟ۡ۟.ۥ.<init>(double, Yue.ۥ۟۟ۡ۟, long):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0012(double d, AbstractC2983 abstractC2983, long j, C4335 c4335) {
            this(d, abstractC2983, j);
        }

        @Override // Yue.InterfaceC4025
        public boolean equals(@InterfaceC6489 Object obj) {
            return (obj instanceof C0012) && C5499.m17094(this.f4320, ((C0012) obj).f4320) && C4555.m13400(mo5786((InterfaceC4025) obj), C4555.f9803.m13508());
        }

        @Override // Yue.InterfaceC4025
        public int hashCode() {
            return C4555.m13434(C4555.m13442(C4558.m13594(this.f4319, this.f4320.m45()), this.f4321));
        }

        @InterfaceC6399
        public String toString() {
            return "DoubleTimeMark(" + this.f4319 + C4562.m13604(this.f4320.m45()) + " + " + ((Object) C4555.m13455(this.f4321)) + ", " + this.f4320 + ')';
        }

        @Override // Yue.InterfaceC7813
        /* JADX INFO: renamed from: ۥ */
        public boolean mo46() {
            return InterfaceC4025.C0310.m11378(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: ۥ۟(J)LYue/ۥۣۢۡۦ; */
        @Override // Yue.InterfaceC7813
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC4025 mo47(long j) {
            return InterfaceC4025.C0310.m11379(this, j);
        }

        @Override // Yue.InterfaceC7813
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public long mo5784() {
            return C4555.m13441(C4558.m13594(this.f4320.m5782() - this.f4319, this.f4320.m45()), this.f4321);
        }

        @Override // Yue.InterfaceC7813
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo5785() {
            return InterfaceC4025.C0310.m986(this);
        }

        @Override // Yue.InterfaceC4025
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public long mo5786(@InterfaceC6399 InterfaceC4025 interfaceC4025) {
            C5499.m17103(interfaceC4025, "other");
            if (interfaceC4025 instanceof C0012) {
                C0012 c0012 = (C0012) interfaceC4025;
                if (C5499.m17094(this.f4320, c0012.f4320)) {
                    if (C4555.m13400(this.f4321, c0012.f4321) && C4555.m13438(this.f4321)) {
                        return C4555.f9803.m13508();
                    }
                    long jM13441 = C4555.m13441(this.f4321, c0012.f4321);
                    long jM13594 = C4558.m13594(this.f4319 - c0012.f4319, this.f4320.m45());
                    return C4555.m13400(jM13594, C4555.m13459(jM13441)) ? C4555.f9803.m13508() : C4555.m13442(jM13594, jM13441);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + interfaceC4025);
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int compareTo(@InterfaceC6399 InterfaceC4025 interfaceC4025) {
            return InterfaceC4025.C0310.m985(this, interfaceC4025);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0012(double d, AbstractC2983 abstractC2983, long j) {
            C5499.m17103(abstractC2983, "timeSource");
            this.f4319 = d;
            this.f4320 = abstractC2983;
            this.f4321 = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(J)LYue/ۥۣۢۡۦ; */
        @Override // Yue.InterfaceC7813
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public InterfaceC4025 mo5783(long j) {
            return new C0012(this.f4319, this.f4320, C4555.m13442(this.f4321, j), null);
        }
    }

    public AbstractC2983(@InterfaceC6399 EnumC4559 enumC4559) {
        C5499.m17103(enumC4559, "unit");
        this.f23 = enumC4559;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final EnumC4559 m45() {
        return this.f23;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract double m5782();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: ۥ()LYue/ۥۣۢۡۦ; */
    @Override // Yue.InterfaceC7814
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC4025 mo44() {
        return new C0012(m5782(), this, C4555.f9803.m13508(), null);
    }
}
