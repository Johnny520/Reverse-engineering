package p176i1;

import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1666k;
import p117X2.C1674s;
import p153e1.C2015k;

/* JADX INFO: renamed from: i1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2309y extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1674s f7521e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2310z f7522f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2015k f7523g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f7524h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f7525i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2309y(C1674s c1674s, C2310z c2310z, C2015k c2015k, long j5, long j6) {
        super(0);
        this.f7521e = c1674s;
        this.f7522f = c2310z;
        this.f7523g = c2015k;
        this.f7524h = j5;
        this.f7525i = j6;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        C2310z c2310z = this.f7522f;
        this.f7521e.f5708d = c2310z.getPositionProvider().mo567e(this.f7523g, this.f7524h, c2310z.getParentLayoutDirection(), this.f7525i);
        return C0891q.f2780a;
    }
}
