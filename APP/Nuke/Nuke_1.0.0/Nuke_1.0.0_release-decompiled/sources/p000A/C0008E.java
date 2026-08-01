package p000A;

import me.dartcv.nuke.BuildConfig;
import nuke.p209ui.HomeActivity;
import p051J.C0811c;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p178i3.C2338s;
import p178i3.InterfaceC2333n;

/* JADX INFO: renamed from: A.E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0008E implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f43d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f44e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f45f;

    public /* synthetic */ C0008E(int i5, Object obj, boolean z5) {
        this.f43d = i5;
        this.f44e = z5;
        this.f45f = obj;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        InterfaceC2333n interfaceC2333nM1419i;
        switch (this.f43d) {
            case 0:
                C0811c c0811c = (C0811c) this.f45f;
                boolean z5 = this.f44e;
                C0891q c0891q = C0891q.f2780a;
                if (z5 && (interfaceC2333nM1419i = c0811c.m1419i()) != null) {
                    ((C2338s) interfaceC2333nM1419i).m4159q(c0891q);
                }
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                return HomeActivity.m4778j((HomeActivity) this.f45f, this.f44e);
            default:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f45f;
                if (this.f44e) {
                    interfaceC1599a.mo6a();
                }
                return C0891q.f2780a;
        }
    }

    public /* synthetic */ C0008E(HomeActivity homeActivity, boolean z5) {
        this.f43d = 1;
        this.f45f = homeActivity;
        this.f44e = z5;
    }
}
