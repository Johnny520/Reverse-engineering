package p029F0;

import java.util.Map;
import p041H0.C0564I;
import p041H0.C0615r;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: F0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0366D implements InterfaceC0378P {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1148b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f1149c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC1601c f1150d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0367E f1151e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0373K f1152f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1601c f1153g;

    public C0366D(int i5, int i6, Map map, InterfaceC1601c interfaceC1601c, C0367E c0367e, C0373K c0373k, InterfaceC1601c interfaceC1601c2) {
        this.f1147a = i5;
        this.f1148b = i6;
        this.f1149c = map;
        this.f1150d = interfaceC1601c;
        this.f1151e = c0367e;
        this.f1152f = c0373k;
        this.f1153g = interfaceC1601c2;
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: a */
    public final Map mo607a() {
        return this.f1149c;
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: b */
    public final void mo608b() {
        C0615r c0615r;
        C0564I c0564i = this.f1152f.f1171d;
        boolean zMo606z = this.f1151e.mo606z();
        InterfaceC1601c interfaceC1601c = this.f1153g;
        if (!zMo606z || (c0615r = c0564i.f1699J.f1893c.f1971V) == null) {
            interfaceC1601c.mo1h(c0564i.f1699J.f1893c.f1782o);
        } else {
            interfaceC1601c.mo1h(c0615r.f1782o);
        }
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: c */
    public final int mo609c() {
        return this.f1148b;
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: d */
    public final InterfaceC1601c mo610d() {
        return this.f1150d;
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: e */
    public final int mo611e() {
        return this.f1147a;
    }
}
