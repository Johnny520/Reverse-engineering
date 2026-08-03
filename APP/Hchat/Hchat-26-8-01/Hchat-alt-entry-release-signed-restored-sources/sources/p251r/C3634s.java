package p251r;

import p051db.C0763a;
import p085fg.InterfaceC1231l;
import p265s.AbstractC3840k0;
import p276sf.C3967n;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4666q;

/* JADX INFO: renamed from: r.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3634s implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11777g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11778h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [wb.ho.W6(db.c, int):java.util.List] */
    public /* synthetic */ C3634s(int i9) {
        this.f11778h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f11777g) {
            case 0:
                AbstractC3840k0 abstractC3840k0 = (AbstractC3840k0) obj;
                AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
                AbstractC4666q.m9154k(abstractC4655fM9148e, AbstractC4666q.m9151h(abstractC4655fM9148e), abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null);
                abstractC3840k0.getClass();
                return C3967n.f12976a;
            default:
                C0763a c0763a = (C0763a) obj;
                c0763a.getClass();
                return Boolean.valueOf(c0763a.f2286a == this.f11778h);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [r.z.<init>(int, int):void] */
    public /* synthetic */ C3634s(C3641z c3641z, int i9) {
        this.f11778h = i9;
    }
}
