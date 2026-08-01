package p029F0;

import p041H0.InterfaceC0584b0;
import p112W2.InterfaceC1601c;
import p153e1.C2014j;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: F0.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0389a0 implements InterfaceC2007c {

    /* JADX INFO: renamed from: d */
    public boolean f1204d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: F0.b0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m657a(AbstractC0389a0 abstractC0389a0, AbstractC0391b0 abstractC0391b0) {
        abstractC0389a0.getClass();
        if (abstractC0391b0 instanceof InterfaceC0584b0) {
            ((InterfaceC0584b0) abstractC0391b0).mo890v(abstractC0389a0.f1204d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m658i(AbstractC0389a0 abstractC0389a0, AbstractC0391b0 abstractC0391b0, int i5, int i6) {
        abstractC0389a0.getClass();
        m657a(abstractC0389a0, abstractC0391b0);
        abstractC0391b0.mo666i0(C2014j.m3702c((((long) i6) & 4294967295L) | (((long) i5) << 32), abstractC0391b0.f1210h), 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m659j(AbstractC0389a0 abstractC0389a0, AbstractC0391b0 abstractC0391b0, long j5) {
        abstractC0389a0.getClass();
        m657a(abstractC0389a0, abstractC0391b0);
        abstractC0391b0.mo666i0(C2014j.m3702c(j5, abstractC0391b0.f1210h), 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m660k(AbstractC0389a0 abstractC0389a0, AbstractC0391b0 abstractC0391b0, int i5, int i6) {
        long j5 = (((long) i5) << 32) | (((long) i6) & 4294967295L);
        if (abstractC0389a0.mo629e() == EnumC2017m.f6742d || abstractC0389a0.mo630f() == 0) {
            m657a(abstractC0389a0, abstractC0391b0);
            abstractC0391b0.mo666i0(C2014j.m3702c(j5, abstractC0391b0.f1210h), 0.0f, null);
        } else {
            int iMo630f = (abstractC0389a0.mo630f() - abstractC0391b0.f1206d) - ((int) (j5 >> 32));
            m657a(abstractC0389a0, abstractC0391b0);
            abstractC0391b0.mo666i0(C2014j.m3702c((((long) iMo630f) << 32) | (((long) ((int) (j5 & 4294967295L))) & 4294967295L), abstractC0391b0.f1210h), 0.0f, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m661l(AbstractC0389a0 abstractC0389a0, AbstractC0391b0 abstractC0391b0, int i5, int i6) {
        int i7 = AbstractC0395d0.f1218b;
        C0393c0 c0393c0 = C0393c0.f1212f;
        long j5 = (((long) i5) << 32) | (((long) i6) & 4294967295L);
        if (abstractC0389a0.mo629e() == EnumC2017m.f6742d || abstractC0389a0.mo630f() == 0) {
            m657a(abstractC0389a0, abstractC0391b0);
            abstractC0391b0.mo666i0(C2014j.m3702c(j5, abstractC0391b0.f1210h), 0.0f, c0393c0);
        } else {
            int iMo630f = (abstractC0389a0.mo630f() - abstractC0391b0.f1206d) - ((int) (j5 >> 32));
            m657a(abstractC0389a0, abstractC0391b0);
            abstractC0391b0.mo666i0(C2014j.m3702c((((long) iMo630f) << 32) | (((long) ((int) (j5 & 4294967295L))) & 4294967295L), abstractC0391b0.f1210h), 0.0f, c0393c0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m662n(AbstractC0389a0 abstractC0389a0, AbstractC0391b0 abstractC0391b0, InterfaceC1601c interfaceC1601c) {
        abstractC0389a0.getClass();
        long j5 = 0;
        m657a(abstractC0389a0, abstractC0391b0);
        abstractC0391b0.mo666i0(C2014j.m3702c((j5 & 4294967295L) | (j5 << 32), abstractC0391b0.f1210h), 0.0f, interfaceC1601c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public float mo628d(C0414n c0414n) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: e */
    public abstract EnumC2017m mo629e();

    /* JADX INFO: renamed from: f */
    public abstract int mo630f();
}
