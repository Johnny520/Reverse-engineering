package p101h1;

import bsh.org.objectweb.asm.Opcodes;
import p020b5.C0184c;
import p057e1.C0810e;
import p071f1.AbstractC1027s;
import p071f1.C1003g;
import p071f1.C1009j;
import p071f1.C1017n;
import p071f1.C1021p;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p118i1.C1902b;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p339x1.C5610h0;

/* JADX INFO: renamed from: h1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1567d extends InterfaceC4233c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    static void m4082D(C5610h0 c5610h0, AbstractC1027s abstractC1027s, long j3, long j4, long j5, AbstractC1566c abstractC1566c, int i9) {
        if ((i9 & 2) != 0) {
            j3 = 0;
        }
        long j10 = j3;
        c5610h0.m10066m(abstractC1027s, j10, (i9 & 4) != 0 ? m4088n0(c5610h0.f22833g.mo4091a(), j10) : j4, j5, 1.0f, (i9 & 32) != 0 ? C1569f.f5225b : abstractC1566c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    static /* synthetic */ void m4083O(InterfaceC1567d interfaceC1567d, long j3, float f3, long j4, int i9) {
        if ((i9 & 2) != 0) {
            f3 = C0810e.m2055b(interfaceC1567d.mo4091a()) / 2.0f;
        }
        float f10 = f3;
        if ((i9 & 4) != 0) {
            j4 = interfaceC1567d.mo4090I0();
        }
        interfaceC1567d.mo4078t0(f10, j3, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    static /* synthetic */ void m4084U(InterfaceC1567d interfaceC1567d, C1003g c1003g, long j3, float f3, C1017n c1017n, int i9, int i10) {
        if ((i10 & 2) != 0) {
            j3 = 0;
        }
        long j4 = j3;
        if ((i10 & 4) != 0) {
            f3 = 1.0f;
        }
        float f10 = f3;
        if ((i10 & 16) != 0) {
            c1017n = null;
        }
        C1017n c1017n2 = c1017n;
        if ((i10 & 32) != 0) {
            i9 = 3;
        }
        interfaceC1567d.mo4073W0(c1003g, j4, f10, c1017n2, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U0 */
    static void m4085U0(InterfaceC1567d interfaceC1567d, C1003g c1003g, long j3, long j4, float f3, C1017n c1017n, int i9, int i10) {
        interfaceC1567d.mo4079v0(c1003g, 0L, j3, (i10 & 16) != 0 ? j3 : j4, (i10 & 32) != 0 ? 1.0f : f3, c1017n, (i10 & Opcodes.ACC_INTERFACE) != 0 ? 1 : i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V0 */
    static /* synthetic */ void m4086V0(InterfaceC1567d interfaceC1567d, AbstractC1027s abstractC1027s, long j3, long j4, float f3, AbstractC1566c abstractC1566c, int i9, int i10) {
        if ((i10 & 2) != 0) {
            j3 = 0;
        }
        long j5 = j3;
        interfaceC1567d.mo4075d0(abstractC1027s, j5, (i10 & 4) != 0 ? m4088n0(interfaceC1567d.mo4091a(), j5) : j4, (i10 & 8) != 0 ? 1.0f : f3, (i10 & 16) != 0 ? C1569f.f5225b : abstractC1566c, (i10 & 64) != 0 ? 3 : i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    static /* synthetic */ void m4087Z(InterfaceC1567d interfaceC1567d, long j3, long j4, float f3, int i9, int i10) {
        if ((i10 & 4) != 0) {
            j4 = m4088n0(interfaceC1567d.mo4091a(), 0L);
        }
        interfaceC1567d.mo4071P0(j3, 0L, j4, (i10 & 8) != 0 ? 1.0f : f3, C1569f.f5225b, (i10 & 64) != 0 ? 3 : i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    static long m4088n0(long j3, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    static /* synthetic */ void m4089s0(InterfaceC1567d interfaceC1567d, C1009j c1009j, AbstractC1027s abstractC1027s, float f3, C1570g c1570g, int i9) {
        if ((i9 & 4) != 0) {
            f3 = 1.0f;
        }
        float f10 = f3;
        AbstractC1566c abstractC1566c = c1570g;
        if ((i9 & 8) != 0) {
            abstractC1566c = C1569f.f5225b;
        }
        interfaceC1567d.mo4072V(c1009j, abstractC1027s, f10, abstractC1566c, (i9 & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: F0 */
    void mo4070F0(C1009j c1009j, long j3, float f3, AbstractC1566c abstractC1566c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    default long mo4090I0() {
        return AbstractC1089i.m2718B(mo4081z0().m825v());
    }

    /* JADX INFO: renamed from: P0 */
    void mo4071P0(long j3, long j4, long j5, float f3, AbstractC1566c abstractC1566c, int i9);

    /* JADX INFO: renamed from: V */
    void mo4072V(C1009j c1009j, AbstractC1027s abstractC1027s, float f3, AbstractC1566c abstractC1566c, int i9);

    /* JADX INFO: renamed from: W0 */
    void mo4073W0(C1003g c1003g, long j3, float f3, C1017n c1017n, int i9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    default long mo4091a() {
        return mo4081z0().m825v();
    }

    /* JADX INFO: renamed from: a0 */
    void mo4074a0(long j3, long j4, long j5, float f3);

    /* JADX INFO: renamed from: d0 */
    void mo4075d0(AbstractC1027s abstractC1027s, long j3, long j4, float f3, AbstractC1566c abstractC1566c, int i9);

    EnumC4243m getLayoutDirection();

    /* JADX INFO: renamed from: t0 */
    void mo4078t0(float f3, long j3, long j4);

    /* JADX INFO: renamed from: v0 */
    void mo4079v0(C1003g c1003g, long j3, long j4, long j5, float f3, C1017n c1017n, int i9);

    /* JADX INFO: renamed from: x */
    void mo4080x(long j3, long j4, AbstractC1566c abstractC1566c);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    default void mo4092y(long j3, InterfaceC1231l interfaceC1231l, C1902b c1902b) {
        c1902b.m4677e(this, getLayoutDirection(), j3, new C1021p(this, 3, interfaceC1231l));
    }

    /* JADX INFO: renamed from: z0 */
    C0184c mo4081z0();
}
