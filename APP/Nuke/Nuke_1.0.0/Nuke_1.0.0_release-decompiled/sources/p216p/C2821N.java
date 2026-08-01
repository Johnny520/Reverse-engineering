package p216p;

import me.dartcv.nuke.BuildConfig;
import p029F0.InterfaceC0430v;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p204n0.C2683b;

/* JADX INFO: renamed from: p.N */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2821N implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8876d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2822O f8877e;

    public /* synthetic */ C2821N(C2822O c2822o, int i5) {
        this.f8876d = i5;
        this.f8877e = c2822o;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f8876d) {
            case 0:
                this.f8877e.m5022L0();
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C2683b(this.f8877e.f8888z);
            default:
                InterfaceC0430v interfaceC0430v = (InterfaceC0430v) this.f8877e.f8886x.getValue();
                return new C2683b(interfaceC0430v != null ? interfaceC0430v.mo638R(0L) : 9205357640488583168L);
        }
    }
}
