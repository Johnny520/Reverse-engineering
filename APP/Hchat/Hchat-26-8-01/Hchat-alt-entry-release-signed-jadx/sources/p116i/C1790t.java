package p116i;

import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import p085fg.InterfaceC1231l;
import p099h.AbstractC1443b;
import p099h.AbstractC1493w0;
import p099h.C1489u0;
import p099h.C1491v0;
import p109hb.C1671c;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: i.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1790t implements InterfaceC1751g {

    /* JADX INFO: renamed from: a */
    public final C1671c f5968a;

    /* JADX INFO: renamed from: b */
    public final C1771m1 f5969b;

    /* JADX INFO: renamed from: c */
    public final Object f5970c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1781q f5971d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1781q f5972e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1781q f5973f;

    /* JADX INFO: renamed from: g */
    public final Object f5974g;

    /* JADX INFO: renamed from: h */
    public final long f5975h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1790t(C1793u c1793u, C1771m1 c1771m1, Object obj, AbstractC1781q abstractC1781q) {
        C1671c c1671c = new C1671c(c1793u.f5990a);
        this.f5968a = c1671c;
        this.f5969b = c1771m1;
        this.f5970c = obj;
        AbstractC1781q abstractC1781q2 = (AbstractC1781q) c1771m1.f5912a.invoke(obj);
        this.f5971d = abstractC1781q2;
        this.f5972e = AbstractC1742d.m4373i(abstractC1781q);
        InterfaceC1231l interfaceC1231l = c1771m1.f5913b;
        if (((AbstractC1781q) c1671c.f5523j) == null) {
            c1671c.f5523j = abstractC1781q2.mo4425c();
        }
        AbstractC1781q abstractC1781q3 = (AbstractC1781q) c1671c.f5523j;
        if (abstractC1781q3 == null) {
            AbstractC1416l.m3831g("targetVector");
            throw null;
        }
        int iMo4424b = abstractC1781q3.mo4424b();
        int i9 = 0;
        while (true) {
            AbstractC1781q abstractC1781q4 = (AbstractC1781q) c1671c.f5523j;
            if (i9 >= iMo4424b) {
                if (abstractC1781q4 == null) {
                    AbstractC1416l.m3831g("targetVector");
                    throw null;
                }
                this.f5974g = interfaceC1231l.invoke(abstractC1781q4);
                C1671c c1671c2 = this.f5968a;
                AbstractC1781q abstractC1781q5 = this.f5971d;
                if (((AbstractC1781q) c1671c2.f5522i) == null) {
                    c1671c2.f5522i = abstractC1781q5.mo4425c();
                }
                AbstractC1781q abstractC1781q6 = (AbstractC1781q) c1671c2.f5522i;
                if (abstractC1781q6 == null) {
                    AbstractC1416l.m3831g("velocityVector");
                    throw null;
                }
                int iMo4424b2 = abstractC1781q6.mo4424b();
                long jMax = 0;
                for (int i10 = 0; i10 < iMo4424b2; i10++) {
                    C0119x c0119x = (C0119x) c1671c2.f5520g;
                    abstractC1781q5.getClass();
                    jMax = Math.max(jMax, ((long) (Math.exp(((C1491v0) c0119x.f310h).m4005b(abstractC1781q.mo4423a(i10)) / (((double) AbstractC1493w0.f4952a) - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.f5975h = jMax;
                AbstractC1781q abstractC1781qM4373i = AbstractC1742d.m4373i(this.f5968a.m4276k(jMax, this.f5971d, abstractC1781q));
                this.f5973f = abstractC1781qM4373i;
                int iMo4424b3 = abstractC1781qM4373i.mo4424b();
                for (int i11 = 0; i11 < iMo4424b3; i11++) {
                    AbstractC1781q abstractC1781q7 = this.f5973f;
                    float fMo4423a = abstractC1781q7.mo4423a(i11);
                    this.f5968a.getClass();
                    this.f5968a.getClass();
                    abstractC1781q7.mo4427e(i11, AbstractC3754e0.m7907q(fMo4423a, -0.0f, 0.0f));
                }
                return;
            }
            if (abstractC1781q4 == null) {
                AbstractC1416l.m3831g("targetVector");
                throw null;
            }
            C0119x c0119x2 = (C0119x) c1671c.f5520g;
            float fMo4423a2 = abstractC1781q2.mo4423a(i9);
            float fMo4423a3 = abstractC1781q.mo4423a(i9);
            C1491v0 c1491v0 = (C1491v0) c0119x2.f310h;
            double dM4005b = c1491v0.m4005b(fMo4423a3);
            double d10 = AbstractC1493w0.f4952a;
            int i12 = i9;
            abstractC1781q4.mo4427e(i12, (Math.signum(fMo4423a3) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * dM4005b) * ((double) (c1491v0.f4946a * c1491v0.f4947b))))) + fMo4423a2);
            i9 = i12 + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: a */
    public final boolean mo4394a() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: b */
    public final long mo4395b() {
        return this.f5975h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: c */
    public final C1771m1 mo4396c() {
        return this.f5969b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: d */
    public final AbstractC1781q mo4397d(long j3) {
        if (m4398e(j3)) {
            return this.f5973f;
        }
        return this.f5968a.m4276k(j3, this.f5971d, this.f5972e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: f */
    public final Object mo4399f(long j3) {
        if (m4398e(j3)) {
            return this.f5974g;
        }
        InterfaceC1231l interfaceC1231l = this.f5969b.f5913b;
        C1671c c1671c = this.f5968a;
        AbstractC1781q abstractC1781q = (AbstractC1781q) c1671c.f5521h;
        AbstractC1781q abstractC1781q2 = this.f5971d;
        if (abstractC1781q == null) {
            c1671c.f5521h = abstractC1781q2.mo4425c();
        }
        AbstractC1781q abstractC1781q3 = (AbstractC1781q) c1671c.f5521h;
        if (abstractC1781q3 == null) {
            AbstractC1416l.m3831g("valueVector");
            throw null;
        }
        int iMo4424b = abstractC1781q3.mo4424b();
        int i9 = 0;
        while (true) {
            AbstractC1781q abstractC1781q4 = (AbstractC1781q) c1671c.f5521h;
            if (i9 >= iMo4424b) {
                if (abstractC1781q4 != null) {
                    return interfaceC1231l.invoke(abstractC1781q4);
                }
                AbstractC1416l.m3831g("valueVector");
                throw null;
            }
            if (abstractC1781q4 == null) {
                AbstractC1416l.m3831g("valueVector");
                throw null;
            }
            C0119x c0119x = (C0119x) c1671c.f5520g;
            float fMo4423a = abstractC1781q2.mo4423a(i9);
            long j4 = j3 / 1000000;
            C1489u0 c1489u0M4004a = ((C1491v0) c0119x.f310h).m4004a(this.f5972e.mo4423a(i9));
            long j5 = c1489u0M4004a.f4943c;
            abstractC1781q4.mo4427e(i9, (Math.signum(c1489u0M4004a.f4941a) * c1489u0M4004a.f4942b * AbstractC1443b.m3986a(j5 > 0 ? j4 / j5 : 1.0f).f4784a) + fMo4423a);
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1751g
    /* JADX INFO: renamed from: g */
    public final Object mo4400g() {
        return this.f5974g;
    }
}
