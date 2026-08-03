package p015b0;

import androidx.lifecycle.C0119x;
import p293u2.C4240j;
import p293u2.C4241k;
import p293u2.C4242l;
import p293u2.EnumC4243m;
import p358y2.InterfaceC5965b0;

/* JADX INFO: renamed from: b0.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0159y implements InterfaceC5965b0 {

    /* JADX INFO: renamed from: g */
    public final C0119x f417g;

    /* JADX INFO: renamed from: h */
    public C4242l f418h;

    /* JADX INFO: renamed from: i */
    public EnumC4243m f419i;

    /* JADX INFO: renamed from: j */
    public C4242l f420j;

    /* JADX INFO: renamed from: k */
    public C4240j f421k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0159y(C0119x c0119x) {
        this.f417g = c0119x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p358y2.InterfaceC5965b0
    /* JADX INFO: renamed from: e */
    public final long mo600e(C4241k c4241k, long j3, EnumC4243m enumC4243m, long j4) {
        C4240j c4240j = this.f421k;
        if (c4240j != null) {
            C4242l c4242l = this.f418h;
            if ((c4242l == null ? false : C4242l.m8534a(c4242l.f13918a, j3)) && this.f419i == enumC4243m) {
                C4242l c4242l2 = this.f420j;
                if (c4242l2 != null ? C4242l.m8534a(c4242l2.f13918a, j4) : false) {
                    return c4240j.f13912a;
                }
            }
        }
        long jMo600e = this.f417g.mo600e(c4241k, j3, enumC4243m, j4);
        this.f418h = new C4242l(j3);
        this.f419i = enumC4243m;
        this.f420j = new C4242l(j4);
        this.f421k = new C4240j(jMo600e);
        return jMo600e;
    }
}
