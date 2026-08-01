package p028F;

import p121Y1.C1753n;
import p153e1.C2014j;
import p153e1.C2015k;
import p153e1.C2016l;
import p153e1.EnumC2017m;
import p176i1.InterfaceC2282C;

/* JADX INFO: renamed from: F.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0357r implements InterfaceC2282C {

    /* JADX INFO: renamed from: d */
    public final C1753n f1120d;

    /* JADX INFO: renamed from: e */
    public C2016l f1121e;

    /* JADX INFO: renamed from: f */
    public EnumC2017m f1122f;

    /* JADX INFO: renamed from: g */
    public C2016l f1123g;

    /* JADX INFO: renamed from: h */
    public C2014j f1124h;

    public C0357r(C1753n c1753n) {
        this.f1120d = c1753n;
    }

    @Override // p176i1.InterfaceC2282C
    /* JADX INFO: renamed from: e */
    public final long mo567e(C2015k c2015k, long j5, EnumC2017m enumC2017m, long j6) {
        C2014j c2014j = this.f1124h;
        if (c2014j != null) {
            C2016l c2016l = this.f1121e;
            if ((c2016l == null ? false : C2016l.m3704a(c2016l.f6741a, j5)) && this.f1122f == enumC2017m) {
                C2016l c2016l2 = this.f1123g;
                if (c2016l2 != null ? C2016l.m3704a(c2016l2.f6741a, j6) : false) {
                    return c2014j.f6735a;
                }
            }
        }
        long jMo567e = this.f1120d.mo567e(c2015k, j5, enumC2017m, j6);
        this.f1121e = new C2016l(j5);
        this.f1122f = enumC2017m;
        this.f1123g = new C2016l(j6);
        this.f1124h = new C2014j(jMo567e);
        return jMo567e;
    }
}
