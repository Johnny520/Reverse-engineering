package p158f0;

import p000A.C0072l0;
import p092S0.C1286x;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: f0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2074f {

    /* JADX INFO: renamed from: a */
    public C2080l f6945a;

    /* JADX INFO: renamed from: b */
    public long f6946b;

    /* JADX INFO: renamed from: c */
    public boolean f6947c;

    /* JADX INFO: renamed from: d */
    public int f6948d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2074f(long j5, C2080l c2080l) {
        int iM3818a;
        int iNumberOfTrailingZeros;
        this.f6945a = c2080l;
        this.f6946b = j5;
        C1286x c1286x = AbstractC2082n.f6970a;
        if (j5 != 0) {
            C2080l c2080lMo3788d = mo3788d();
            long j6 = c2080lMo3788d.f6965f;
            long[] jArr = c2080lMo3788d.f6966g;
            if (jArr != null) {
                j5 = jArr[0];
            } else {
                long j7 = c2080lMo3788d.f6964e;
                if (j7 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j7);
                } else {
                    long j8 = c2080lMo3788d.f6963d;
                    if (j8 != 0) {
                        j6 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
                    }
                }
                j5 = ((long) iNumberOfTrailingZeros) + j6;
            }
            synchronized (AbstractC2082n.f6972c) {
                iM3818a = AbstractC2082n.f6975f.m3818a(j5);
            }
        } else {
            iM3818a = -1;
        }
        this.f6948d = iM3818a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m3811q(AbstractC2074f abstractC2074f) {
        AbstractC2082n.f6971b.m115u(abstractC2074f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3812a() {
        synchronized (AbstractC2082n.f6972c) {
            mo3803b();
            mo3805p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo3803b() {
        AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3821b(mo3791g());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo3787c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public C2080l mo3788d() {
        return this.f6945a;
    }

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC1601c mo3789e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo3790f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public long mo3791g() {
        return this.f6946b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public int mo3804h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract InterfaceC1601c mo3792i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final AbstractC2074f m3813j() {
        C0072l0 c0072l0 = AbstractC2082n.f6971b;
        AbstractC2074f abstractC2074f = (AbstractC2074f) c0072l0.m105i();
        c0072l0.m115u(this);
        return abstractC2074f;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo3793k();

    /* JADX INFO: renamed from: l */
    public abstract void mo3794l();

    /* JADX INFO: renamed from: m */
    public abstract void mo3795m();

    /* JADX INFO: renamed from: n */
    public abstract void mo3796n(InterfaceC2090v interfaceC2090v);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m3814o() {
        int i5 = this.f6948d;
        if (i5 >= 0) {
            AbstractC2082n.m3845u(i5);
            this.f6948d = -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void mo3805p() {
        m3814o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void mo3815r(C2080l c2080l) {
        this.f6945a = c2080l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void mo3816s(long j5) {
        this.f6946b = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public void mo3806t(int i5) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC2074f mo3797u(InterfaceC1601c interfaceC1601c);
}
