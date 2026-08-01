package p076P;

import com.bumptech.glide.AbstractC1924f;
import p056K2.C0891q;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p244u.C3251U;

/* JADX INFO: renamed from: P.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1103p implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f3560d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3251U f3561e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1843e f3562f;

    public C1103p(long j5, C3251U c3251u, C1843e c1843e) {
        this.f3560d = j5;
        this.f3561e = c3251u;
        this.f3562f = c1843e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1383r c1383r = (C1383r) interfaceC1373m;
        if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC1924f.m3492a(this.f3560d, ((C1093g0) c1383r.m2590j(AbstractC1095h0.f3516a)).f3493m, AbstractC1848j.m3314c(417635459, new C1102o(0, this.f3562f, this.f3561e), c1383r), c1383r, 384);
        } else {
            c1383r.m2563R();
        }
        return C0891q.f2780a;
    }
}
