package p076P;

import p056K2.C0891q;
import p091S.AbstractC1234f;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p211o0.InterfaceC2738M;

/* JADX INFO: renamed from: P.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1094h implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1603e f3507d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1603e f3508e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2738M f3509f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f3510g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f3511h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f3512i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f3513j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f3514k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C1843e f3515l;

    public C1094h(InterfaceC1603e interfaceC1603e, InterfaceC1603e interfaceC1603e2, InterfaceC2738M interfaceC2738M, long j5, float f2, long j6, long j7, long j8, C1843e c1843e) {
        this.f3507d = interfaceC1603e;
        this.f3508e = interfaceC1603e2;
        this.f3509f = interfaceC2738M;
        this.f3510g = j5;
        this.f3511h = f2;
        this.f3512i = j6;
        this.f3513j = j7;
        this.f3514k = j8;
        this.f3515l = c1843e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
        int iIntValue = ((Number) obj2).intValue();
        C1383r c1383r = (C1383r) interfaceC1373m;
        if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
            AbstractC1096i.m2149a(AbstractC1848j.m3314c(1367541877, new C1092g(this.f3515l, 1), c1383r), null, this.f3507d, this.f3508e, this.f3509f, this.f3510g, this.f3511h, AbstractC1105r.m2155c(AbstractC1234f.f4202a, c1383r), this.f3512i, this.f3513j, this.f3514k, c1383r, 6);
        } else {
            c1383r.m2563R();
        }
        return C0891q.f2780a;
    }
}
