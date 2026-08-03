package p308v1;

import p085fg.InterfaceC1231l;
import p198nb.C2924a;
import p293u2.C4240j;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p339x1.InterfaceC5661y0;

/* JADX INFO: renamed from: v1.a1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4374a1 implements InterfaceC4233c {

    /* JADX INFO: renamed from: g */
    public boolean f14583g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static void m8810C(AbstractC4374a1 abstractC4374a1, AbstractC4377b1 abstractC4377b1, long j3) {
        abstractC4374a1.getClass();
        m8815e(abstractC4374a1, abstractC4377b1);
        abstractC4377b1.mo8820A0(C4240j.m8530d(j3, abstractC4377b1.f14597k), 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static void m8811E(AbstractC4374a1 abstractC4374a1, AbstractC4377b1 abstractC4377b1, int i9, int i10) {
        long j3 = (((long) i9) << 32) | (((long) i10) & 4294967295L);
        if (abstractC4374a1.mo8818m() == EnumC4243m.f13919g || abstractC4374a1.mo8819w() == 0) {
            m8815e(abstractC4374a1, abstractC4377b1);
            abstractC4377b1.mo8820A0(C4240j.m8530d(j3, abstractC4377b1.f14597k), 0.0f, null);
        } else {
            int iMo8819w = (abstractC4374a1.mo8819w() - abstractC4377b1.f14593g) - ((int) (j3 >> 32));
            m8815e(abstractC4374a1, abstractC4377b1);
            abstractC4377b1.mo8820A0(C4240j.m8530d((((long) iMo8819w) << 32) | (((long) ((int) (j3 & 4294967295L))) & 4294967295L), abstractC4377b1.f14597k), 0.0f, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static void m8812F(AbstractC4374a1 abstractC4374a1, AbstractC4377b1 abstractC4377b1, int i9, int i10) {
        int i11 = AbstractC4383d1.f14615b;
        C4380c1 c4380c1 = C4380c1.f14607h;
        long j3 = (((long) i9) << 32) | (((long) i10) & 4294967295L);
        if (abstractC4374a1.mo8818m() == EnumC4243m.f13919g || abstractC4374a1.mo8819w() == 0) {
            m8815e(abstractC4374a1, abstractC4377b1);
            abstractC4377b1.mo8820A0(C4240j.m8530d(j3, abstractC4377b1.f14597k), 0.0f, c4380c1);
        } else {
            int iMo8819w = (abstractC4374a1.mo8819w() - abstractC4377b1.f14593g) - ((int) (j3 >> 32));
            m8815e(abstractC4374a1, abstractC4377b1);
            abstractC4377b1.mo8820A0(C4240j.m8530d((((long) iMo8819w) << 32) | (((long) ((int) (j3 & 4294967295L))) & 4294967295L), abstractC4377b1.f14597k), 0.0f, c4380c1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static void m8813G(AbstractC4374a1 abstractC4374a1, AbstractC4377b1 abstractC4377b1, int i9, int i10, InterfaceC1231l interfaceC1231l, int i11) {
        if ((i11 & 8) != 0) {
            int i12 = AbstractC4383d1.f14615b;
            interfaceC1231l = C4380c1.f14607h;
        }
        abstractC4374a1.getClass();
        m8815e(abstractC4374a1, abstractC4377b1);
        abstractC4377b1.mo8820A0(C4240j.m8530d((((long) i10) & 4294967295L) | (((long) i9) << 32), abstractC4377b1.f14597k), 0.0f, interfaceC1231l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static void m8814H(AbstractC4374a1 abstractC4374a1, AbstractC4377b1 abstractC4377b1, long j3, C2924a c2924a, int i9) {
        InterfaceC1231l interfaceC1231l = c2924a;
        if ((i9 & 4) != 0) {
            int i10 = AbstractC4383d1.f14615b;
            interfaceC1231l = C4380c1.f14607h;
        }
        abstractC4374a1.getClass();
        m8815e(abstractC4374a1, abstractC4377b1);
        abstractC4377b1.mo8820A0(C4240j.m8530d(j3, abstractC4377b1.f14597k), 0.0f, interfaceC1231l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: v1.b1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m8815e(AbstractC4374a1 abstractC4374a1, AbstractC4377b1 abstractC4377b1) {
        abstractC4374a1.getClass();
        if (abstractC4377b1 instanceof InterfaceC5661y0) {
            ((InterfaceC5661y0) abstractC4377b1).mo10180f0(abstractC4374a1.f14583g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m8816A(AbstractC4377b1 abstractC4377b1, int i9, int i10, float f3) {
        m8815e(this, abstractC4377b1);
        abstractC4377b1.mo8820A0(C4240j.m8530d((((long) i10) & 4294967295L) | (((long) i9) << 32), abstractC4377b1.f14597k), f3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public float mo8817j(C4405l c4405l) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: m */
    public abstract EnumC4243m mo8818m();

    /* JADX INFO: renamed from: w */
    public abstract int mo8819w();
}
