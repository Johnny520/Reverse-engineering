package p354xh;

import bsh.org.objectweb.asm.Opcodes;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1876r1;
import p117i0.C1878s0;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p276sf.C3967n;
import p332wb.C5218pp;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.AbstractC4066z;
import sh.C4063y;
import sh.EnumC4010g0;

/* JADX INFO: renamed from: xh.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5837v {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C1878s0(new C5218pp(6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m10540a(final boolean z9, InterfaceC5853o interfaceC5853o, C4063y c4063y, final EnumC4010g0 enumC4010g0, boolean z10, final InterfaceC1220a interfaceC1220a, final InterfaceC1220a interfaceC1220a2, float f3, final C3874d c3874d, C1836h0 c1836h0, final int i9) {
        int i10;
        final C4063y c4063y2;
        final boolean z11;
        final float f10;
        c1836h0.m4527b0(-2002101590);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4536g(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        int i11 = i10 | 432;
        if ((i9 & 3072) == 0) {
            i11 |= c1836h0.m4530d(enumC4010g0.ordinal()) ? Opcodes.ACC_STRICT : 1024;
        }
        int i12 = i11 | 24576;
        if ((196608 & i9) == 0) {
            i12 |= c1836h0.m4538h(interfaceC1220a) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i9) == 0) {
            i12 |= c1836h0.m4538h(interfaceC1220a2) ? 1048576 : 524288;
        }
        if ((12582912 & i9) == 0) {
            i12 |= c1836h0.m4534f(null) ? 8388608 : 4194304;
        }
        int i13 = i12 | 100663296;
        if ((805306368 & i9) == 0) {
            i13 |= c1836h0.m4538h(c3874d) ? 536870912 : 268435456;
        }
        if (c1836h0.m4516S(i13 & 1, (306783379 & i13) != 306783378)) {
            C4063y c4063y3 = AbstractC4066z.f13478g;
            float f11 = 200;
            InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(interfaceC1220a, c1836h0);
            C3874d c3874dM8071e = AbstractC3879i.m8071e(1108875271, new C5832q(interfaceC1809a1M4643y, 1), c1836h0);
            C3874d c3874dM8071e2 = AbstractC3879i.m8071e(-1753518080, new C5827l(interfaceC1809a1M4643y, c3874d, 2), c1836h0);
            int i14 = (i13 & 14) | 48;
            int i15 = i13 << 3;
            AbstractC2043a.m5021a(z9, c3874dM8071e, c4063y3, enumC4010g0, interfaceC1220a, interfaceC1220a2, f11, c3874dM8071e2, c1836h0, i14 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192));
            interfaceC5853o = C5850l.f23787a;
            c4063y2 = c4063y3;
            f10 = f11;
            z11 = true;
        } else {
            c1836h0.m4519V();
            c4063y2 = c4063y;
            z11 = z10;
            f10 = f3;
        }
        final InterfaceC5853o interfaceC5853o2 = interfaceC5853o;
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: xh.u
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC5837v.m10540a(z9, interfaceC5853o2, c4063y2, enumC4010g0, z11, interfaceC1220a, interfaceC1220a2, f10, c3874d, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                    return C3967n.f12976a;
                }
            };
        }
    }
}
