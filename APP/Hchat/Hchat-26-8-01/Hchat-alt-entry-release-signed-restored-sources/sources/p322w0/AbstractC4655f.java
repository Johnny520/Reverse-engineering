package p322w0;

import p020b5.C0184c;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: w0.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4655f {

    /* JADX INFO: renamed from: a */
    public C4659j f15489a;

    /* JADX INFO: renamed from: b */
    public long f15490b;

    /* JADX INFO: renamed from: c */
    public boolean f15491c;

    /* JADX INFO: renamed from: d */
    public int f15492d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4655f(long j3, C4659j c4659j) {
        int iM2698a;
        int iNumberOfTrailingZeros;
        this.f15489a = c4659j;
        this.f15490b = j3;
        C4661l c4661l = AbstractC4662m.f15510a;
        if (j3 != 0) {
            C4659j c4659jMo9108d = mo9108d();
            long j4 = c4659jMo9108d.f15504i;
            long[] jArr = c4659jMo9108d.f15505j;
            if (jArr != null) {
                j3 = jArr[0];
            } else {
                long j5 = c4659jMo9108d.f15503h;
                if (j5 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j5);
                } else {
                    long j10 = c4659jMo9108d.f15502g;
                    if (j10 != 0) {
                        j4 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                    }
                }
                j3 = ((long) iNumberOfTrailingZeros) + j4;
            }
            synchronized (AbstractC4662m.f15512c) {
                iM2698a = AbstractC4662m.f15515f.m2698a(j3);
            }
        } else {
            iM2698a = -1;
        }
        this.f15492d = iM2698a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m9106q(AbstractC4655f abstractC4655f) {
        AbstractC4662m.f15511b.m797O(abstractC4655f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9107a() {
        synchronized (AbstractC4662m.f15512c) {
            mo9094b();
            mo9100p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo9094b() {
        AbstractC4662m.f15513d = AbstractC4662m.f15513d.m9116c(mo9109g());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo9086c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public C4659j mo9108d() {
        return this.f15489a;
    }

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC1231l mo9095e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo9096f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public long mo9109g() {
        return this.f15490b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public int mo9097h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract InterfaceC1231l mo9098i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final AbstractC4655f m9110j() {
        C0184c c0184c = AbstractC4662m.f15511b;
        AbstractC4655f abstractC4655f = (AbstractC4655f) c0184c.m818o();
        c0184c.m797O(this);
        return abstractC4655f;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo9087k();

    /* JADX INFO: renamed from: l */
    public abstract void mo9088l();

    /* JADX INFO: renamed from: m */
    public abstract void mo9089m();

    /* JADX INFO: renamed from: n */
    public abstract void mo9099n(InterfaceC4670u interfaceC4670u);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m9111o() {
        int i9 = this.f15492d;
        if (i9 >= 0) {
            AbstractC4662m.m9140u(i9);
            this.f15492d = -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void mo9100p() {
        m9111o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void mo9112r(C4659j c4659j) {
        this.f15489a = c4659j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void mo9113s(long j3) {
        this.f15490b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public void mo9101t(int i9) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC4655f mo9090u(InterfaceC1231l interfaceC1231l);
}
