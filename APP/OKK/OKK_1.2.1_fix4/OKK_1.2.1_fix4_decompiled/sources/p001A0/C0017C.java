package p001A0;

import p043Y.AbstractC0454m;
import p043Y.InterfaceC0452k;
import p043Y.InterfaceC0453l;

/* JADX INFO: renamed from: A0.C */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0017C implements InterfaceC0022H, InterfaceC0453l {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f52f;

    public /* synthetic */ C0017C(int i2) {
        this.f52f = i2;
    }

    @Override // p043Y.InterfaceC0453l
    /* JADX INFO: renamed from: a */
    public void mo54a(InterfaceC0452k interfaceC0452k, AbstractC0454m abstractC0454m) {
        switch (this.f52f) {
            case 2:
                interfaceC0452k.mo1068f(abstractC0454m);
                break;
            case 3:
                interfaceC0452k.mo1043d(abstractC0454m);
                break;
            case 4:
                interfaceC0452k.mo1042c(abstractC0454m);
                break;
            case 5:
                interfaceC0452k.mo1040a();
                break;
            default:
                interfaceC0452k.mo1044e();
                break;
        }
    }
}
