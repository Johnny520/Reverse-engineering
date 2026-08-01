package p047I0;

import android.view.View;
import java.util.ArrayList;
import me.dartcv.nuke.BuildConfig;
import p002A1.EnumC0140m;
import p002A1.InterfaceC0143p;
import p002A1.InterfaceC0145r;
import p027E4.C0330q;
import p056K2.C0891q;
import p068N1.C1013c;
import p074O2.InterfaceC1046d;
import p095T.C1400z0;
import p117X2.C1675t;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p160f3.InterfaceC2133f;
import p190k3.C2455c;

/* JADX INFO: renamed from: I0.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0727f1 implements InterfaceC0143p {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2455c f2295d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0711a0 f2296e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1400z0 f2297f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1675t f2298g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ View f2299h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0727f1(C2455c c2455c, C0711a0 c0711a0, C1400z0 c1400z0, C1675t c1675t, View view) {
        this.f2295d = c2455c;
        this.f2296e = c0711a0;
        this.f2297f = c1400z0;
        this.f2298g = c1675t;
        this.f2299h = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0143p
    /* JADX INFO: renamed from: d */
    public final void mo147d(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
        boolean z5;
        InterfaceC2133f interfaceC2133fM2689y = null;
        switch (AbstractC0718c1.f2268a[enumC0140m.ordinal()]) {
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC2162v.m3994p(this.f2295d, null, new C0724e1(this.f2298g, this.f2297f, interfaceC0145r, this, this.f2299h, null), 1);
                return;
            case 2:
                C0711a0 c0711a0 = this.f2296e;
                if (c0711a0 != null) {
                    C1013c c1013c = (C1013c) c0711a0.f2253f;
                    synchronized (c1013c.f3129b) {
                        try {
                            synchronized (c1013c.f3129b) {
                                z5 = c1013c.f3128a;
                            }
                            if (!z5) {
                                ArrayList arrayList = (ArrayList) c1013c.f3130c;
                                c1013c.f3130c = (ArrayList) c1013c.f3131d;
                                c1013c.f3131d = arrayList;
                                c1013c.f3128a = true;
                                int size = arrayList.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    ((InterfaceC1046d) arrayList.get(i5)).mo278i(C0891q.f2780a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                C1400z0 c1400z0 = this.f2297f;
                synchronized (c1400z0.f4997c) {
                    if (c1400z0.f5014t) {
                        c1400z0.f5014t = false;
                        interfaceC2133fM2689y = c1400z0.m2689y();
                    }
                    break;
                }
                if (interfaceC2133fM2689y != null) {
                    ((C2135g) interfaceC2133fM2689y).mo278i(C0891q.f2780a);
                    return;
                }
                return;
            case 3:
                C1400z0 c1400z02 = this.f2297f;
                synchronized (c1400z02.f4997c) {
                    c1400z02.f5014t = true;
                }
                return;
            case 4:
                this.f2297f.m2688x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new C0330q();
        }
    }
}
