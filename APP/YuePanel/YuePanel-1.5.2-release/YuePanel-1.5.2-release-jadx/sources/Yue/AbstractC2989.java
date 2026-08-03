package Yue;

import Yue.InterfaceC4025;
import Yue.InterfaceC7814;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8405(markerClass = {InterfaceC4774.class})
@InterfaceC7470(version = "1.9")
public abstract class AbstractC2989 implements InterfaceC7814.InterfaceC7816 {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final EnumC4559 f25;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5684 f4335;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۡ$ۥ */
    @InterfaceC7507({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    public static final class C0017 implements InterfaceC4025 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final long f4336;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final AbstractC2989 f4337;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final long f4338;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 Yue.ۥۣ۟۟ۡ), (r4v0 long) A[MD:(long, Yue.ۥۣ۟۟ۡ, long):void (m)] (LINE:1) call: Yue.ۥۣ۟۟ۡ.ۥ.<init>(long, Yue.ۥۣ۟۟ۡ, long):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0017(long j, AbstractC2989 abstractC2989, long j2, C4335 c4335) {
            this(j, abstractC2989, j2);
        }

        @Override // Yue.InterfaceC4025
        public boolean equals(@InterfaceC6489 Object obj) {
            return (obj instanceof C0017) && C5499.m17094(this.f4337, ((C0017) obj).f4337) && C4555.m13400(mo5786((InterfaceC4025) obj), C4555.f9803.m13508());
        }

        @Override // Yue.InterfaceC4025
        public int hashCode() {
            return (C4555.m13434(this.f4338) * 37) + Long.hashCode(this.f4336);
        }

        @InterfaceC6399
        public String toString() {
            return "LongTimeMark(" + this.f4336 + C4562.m13604(this.f4337.m5796()) + " + " + ((Object) C4555.m13455(this.f4338)) + ", " + this.f4337 + ')';
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
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public long mo5784() {
            return C4555.m13441(C5884.m18208(this.f4337.m5795(), this.f4336, this.f4337.m5796()), this.f4338);
        }

        @Override // Yue.InterfaceC7813
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo5785() {
            return InterfaceC4025.C0310.m986(this);
        }

        @Override // Yue.InterfaceC4025
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public long mo5786(@InterfaceC6399 InterfaceC4025 interfaceC4025) {
            C5499.m17103(interfaceC4025, "other");
            if (interfaceC4025 instanceof C0017) {
                C0017 c0017 = (C0017) interfaceC4025;
                if (C5499.m17094(this.f4337, c0017.f4337)) {
                    return C4555.m13442(C5884.m18208(this.f4336, c0017.f4336, this.f4337.m5796()), C4555.m13441(this.f4338, c0017.f4338));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + interfaceC4025);
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public int compareTo(@InterfaceC6399 InterfaceC4025 interfaceC4025) {
            return InterfaceC4025.C0310.m985(this, interfaceC4025);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0017(long j, AbstractC2989 abstractC2989, long j2) {
            C5499.m17103(abstractC2989, "timeSource");
            this.f4336 = j;
            this.f4337 = abstractC2989;
            this.f4338 = j2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟(J)LYue/ۥۣۢۡۦ; */
        @Override // Yue.InterfaceC7813
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ */
        public InterfaceC4025 mo5783(long j) {
            EnumC4559 enumC4559M5796 = this.f4337.m5796();
            if (C4555.m13438(j)) {
                return new C0017(C5884.m18204(this.f4336, enumC4559M5796, j), this.f4337, C4555.f9803.m13508(), null);
            }
            long jM13458 = C4555.m13458(j, enumC4559M5796);
            long jM13442 = C4555.m13442(C4555.m13441(j, jM13458), this.f4338);
            long jM18204 = C5884.m18204(this.f4336, enumC4559M5796, jM13458);
            long jM134582 = C4555.m13458(jM13442, enumC4559M5796);
            long jM182042 = C5884.m18204(jM18204, enumC4559M5796, jM134582);
            long jM13441 = C4555.m13441(jM13442, jM134582);
            long jM13423 = C4555.m13423(jM13441);
            if (jM182042 != 0 && jM13423 != 0 && (jM182042 ^ jM13423) < 0) {
                long jM13595 = C4558.m13595(C6131.m18773(jM13423), enumC4559M5796);
                jM182042 = C5884.m18204(jM182042, enumC4559M5796, jM13595);
                jM13441 = C4555.m13441(jM13441, jM13595);
            }
            if ((1 | (jM182042 - 1)) == Long.MAX_VALUE) {
                jM13441 = C4555.f9803.m13508();
            }
            return new C0017(jM182042, this.f4337, jM13441, null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۡ$ۥ۟ */
    public static final class C0018 extends AbstractC5673 implements InterfaceC5122<Long> {
        public C0018() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final Long invoke() {
            return Long.valueOf(AbstractC2989.this.mo5798());
        }
    }

    public AbstractC2989(@InterfaceC6399 EnumC4559 enumC4559) {
        C5499.m17103(enumC4559, "unit");
        this.f25 = enumC4559;
        this.f4335 = C5689.m2370(new C0018());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long m5795() {
        return mo5798() - m5797();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final EnumC4559 m5796() {
        return this.f25;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final long m5797() {
        return ((Number) this.f4335.getValue()).longValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract long mo5798();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: ۥ()LYue/ۥۣۢۡۦ; */
    @Override // Yue.InterfaceC7814
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC4025 mo44() {
        return new C0017(m5795(), this, C4555.f9803.m13508(), null);
    }
}
