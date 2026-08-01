package p058L;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p160f3.InterfaceC2160t;
import p204n0.C2683b;

/* JADX INFO: renamed from: L.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0912N extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2838h;

    /* JADX INFO: renamed from: i */
    public int f2839i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0920W f2840j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0912N(C0920W c0920w, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f2838h = i5;
        this.f2840j = c0920w;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f2838h) {
            case 0:
                long j5 = ((C2683b) obj).f8556a;
                return new C0912N(this.f2840j, (InterfaceC1046d) obj2, 0).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0912N) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0912N) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2838h) {
            case 0:
                return new C0912N(this.f2840j, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0912N(this.f2840j, interfaceC1046d, 1);
            default:
                return new C0912N(this.f2840j, interfaceC1046d, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p058L.C0912N.mo8p(java.lang.Object):java.lang.Object");
    }
}
