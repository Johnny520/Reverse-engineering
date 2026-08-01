package p047I0;

import android.os.Build;
import me.dartcv.nuke.BuildConfig;
import p051J.C0822n;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p158f0.C2085q;
import p178i3.InterfaceC2324e;
import p232s.C3157d;
import p232s.C3158e;
import p232s.C3159f;
import p232s.C3160g;
import p232s.C3163j;
import p232s.C3164k;
import p232s.C3165l;
import p232s.InterfaceC3161h;

/* JADX INFO: renamed from: I0.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0721d1 implements InterfaceC2324e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2278d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2279e;

    public /* synthetic */ C0721d1(int i5, Object obj) {
        this.f2278d = i5;
        this.f2279e = obj;
    }

    @Override // p178i3.InterfaceC2324e
    /* JADX INFO: renamed from: c */
    public final Object mo9c(Object obj, InterfaceC1046d interfaceC1046d) {
        switch (this.f2278d) {
            case 0:
                ((C0670F0) this.f2279e).f2150d.m2508h(((Number) obj).floatValue());
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0822n c0822n = (C0822n) this.f2279e;
                if (Build.VERSION.SDK_INT >= 34) {
                    c0822n.m1454a().startStylusHandwriting(c0822n.f2641b);
                }
                break;
            default:
                InterfaceC3161h interfaceC3161h = (InterfaceC3161h) obj;
                C2085q c2085q = (C2085q) this.f2279e;
                if (interfaceC3161h instanceof C3159f) {
                    c2085q.add(interfaceC3161h);
                } else if (interfaceC3161h instanceof C3160g) {
                    c2085q.remove(((C3160g) interfaceC3161h).f9913a);
                } else if (interfaceC3161h instanceof C3157d) {
                    c2085q.add(interfaceC3161h);
                } else if (interfaceC3161h instanceof C3158e) {
                    c2085q.remove(((C3158e) interfaceC3161h).f9912a);
                } else if (interfaceC3161h instanceof C3164k) {
                    c2085q.add(interfaceC3161h);
                } else if (interfaceC3161h instanceof C3165l) {
                    c2085q.remove(((C3165l) interfaceC3161h).f9917a);
                } else if (interfaceC3161h instanceof C3163j) {
                    c2085q.remove(((C3163j) interfaceC3161h).f9915a);
                }
                break;
        }
        return C0891q.f2780a;
    }
}
