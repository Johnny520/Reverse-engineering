package p000A;

import me.dartcv.nuke.BuildConfig;
import p007B0.C0174G;
import p029F0.AbstractC0435z;
import p029F0.InterfaceC0430v;
import p056K2.C0891q;
import p095T.InterfaceC1359f;
import p112W2.InterfaceC1601c;
import p211o0.C2730E;

/* JADX INFO: renamed from: A.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0001A0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9d;

    /* JADX INFO: renamed from: e */
    public Object f10e;

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f9d) {
            case 0:
                float[] fArr = ((C2730E) obj).f8675a;
                InterfaceC0430v interfaceC0430v = (InterfaceC0430v) this.f10e;
                if (interfaceC0430v.mo632D()) {
                    AbstractC0435z.m693f(interfaceC0430v).mo644s(interfaceC0430v, fArr);
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0174G c0174g = (C0174G) this.f10e;
                if (c0174g != null) {
                    c0174g.f618c = zBooleanValue;
                }
                break;
            default:
                ((InterfaceC1359f) this.f10e).cancel();
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0001A0(int i5, Object obj) {
        this.f9d = i5;
        this.f10e = obj;
    }
}
