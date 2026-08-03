package ke;

import ae.C0076g;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import p038ce.C0548a;
import p259r9.AbstractC3754e0;
import p302ud.C4305a;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4318n;
import p343x6.AbstractC5700d;
import p350xd.C5777d;

/* JADX INFO: renamed from: ke.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2392a extends AbstractC3754e0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7857j;

    /* JADX INFO: renamed from: k */
    public final Object f7858k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2392a(Object obj, int i9) {
        this.f7857j = i9;
        this.f7858k = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: a */
    public boolean mo2614a(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        switch (this.f7857j) {
            case 4:
                return ((C0548a) this.f7858k).test(interfaceC4318n);
            default:
                return super.mo2614a(c4322r, interfaceC4318n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: b */
    public void mo2615b(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        boolean z9;
        switch (this.f7857j) {
            case 1:
                if (interfaceC4318n instanceof C5777d) {
                    C5777d c5777d = (C5777d) interfaceC4318n;
                    C2402k c2402k = (C2402k) ((Supplier) this.f7858k).get();
                    c2402k.f7871l = c5777d;
                    int i9 = 0;
                    while (true) {
                        AbstractC5700d.m10279h0(c4322r, c2402k, c5777d);
                        if (c2402k.f7872m) {
                            c2402k.f7872m = false;
                            c2402k.f7869j.clear();
                            c2402k.f7870k.clear();
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        int i10 = i9 + 1;
                        if (i9 > 20) {
                            c4322r.m6383L("Unexpected iteration count in SwitchBreakVisitor. Please report as an issue");
                        } else if (z9) {
                            i9 = i10;
                        }
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p259r9.AbstractC3754e0, ke.InterfaceC2396e
    /* JADX INFO: renamed from: d */
    public void mo2617d(C4322r c4322r, InterfaceC4312h interfaceC4312h) {
        switch (this.f7857j) {
            case 0:
                if (interfaceC4312h instanceof C4305a) {
                    ((HashSet) this.f7858k).add((C4305a) interfaceC4312h);
                    break;
                }
                break;
            case 2:
                ((Consumer) this.f7858k).accept(interfaceC4312h);
                break;
            case 3:
                if (interfaceC4312h instanceof C4305a) {
                    ((C0076g) this.f7858k).accept((C4305a) interfaceC4312h);
                }
                break;
        }
    }
}
