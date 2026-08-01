package p125i7;

import io.ktor.utils.p131io.InterfaceC3468g;
import p010a9.InterfaceC0173a;
import p034c7.InterfaceC1355b;
import p034c7.InterfaceC1368h0;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p210o7.C5651c;
import p210o7.InterfaceC5655g;
import p281t6.InterfaceC8163p;

/* JADX INFO: renamed from: i7.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3222l implements InterfaceC5655g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1368h0 f8623a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4705l f8624b;

    /* JADX INFO: renamed from: c */
    public final C5651c f8625c;
    private volatile /* synthetic */ Object receiveChannel;

    public AbstractC3222l(InterfaceC1368h0 interfaceC1368h0) {
        interfaceC1368h0.getClass();
        this.f8623a = interfaceC1368h0;
        this.receiveChannel = null;
        this.f8624b = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: i7.k
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC3222l.m12241b(this.f8620q);
            }
        });
        C5651c c5651c = new C5651c(interfaceC1368h0.mo5367F().mo3742p());
        c5651c.m3727G(interfaceC1368h0.mo5367F().m5378R());
        this.f8625c = c5651c;
    }

    /* JADX INFO: renamed from: b */
    public static C3246x m12241b(AbstractC3222l abstractC3222l) {
        return new C3246x(abstractC3222l.mo7347c());
    }

    @Override // p210o7.InterfaceC5655g
    /* JADX INFO: renamed from: a */
    public C5651c mo12242a() {
        return this.f8625c;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC8163p mo7347c();

    /* JADX INFO: renamed from: d */
    public abstract InterfaceC3468g mo7348d();

    @Override // p210o7.InterfaceC5652d
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ InterfaceC1355b mo12243e() {
        return this.f8623a;
    }

    @Override // p210o7.InterfaceC5652d
    /* JADX INFO: renamed from: g */
    public final InterfaceC8163p mo12244g() {
        return (InterfaceC8163p) this.f8624b.getValue();
    }

    @Override // p210o7.InterfaceC5652d
    /* JADX INFO: renamed from: j */
    public final InterfaceC3468g mo12245j() {
        InterfaceC3468g interfaceC3468g = (InterfaceC3468g) this.receiveChannel;
        return interfaceC3468g == null ? mo7348d() : interfaceC3468g;
    }
}
