package p135b;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CopyOnWriteArrayList;
import p002A1.EnumC0140m;
import p002A1.EnumC0141n;
import p002A1.InterfaceC0143p;
import p002A1.InterfaceC0145r;
import p117X2.AbstractC1665j;
import p229r1.C3079i;

/* JADX INFO: renamed from: b.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1815c implements InterfaceC0143p {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6208d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6209e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f6210f;

    public /* synthetic */ C1815c(int i5, Object obj, Object obj2) {
        this.f6208d = i5;
        this.f6209e = obj;
        this.f6210f = obj2;
    }

    @Override // p002A1.InterfaceC0143p
    /* JADX INFO: renamed from: d */
    public final void mo147d(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
        switch (this.f6208d) {
            case 0:
                C1809A c1809a = (C1809A) this.f6209e;
                AbstractActivityC1823k abstractActivityC1823k = (AbstractActivityC1823k) this.f6210f;
                if (enumC0140m == EnumC0140m.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = abstractActivityC1823k.getOnBackInvokedDispatcher();
                    AbstractC1665j.m2984d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
                    c1809a.m3286b(onBackInvokedDispatcher);
                }
                break;
            default:
                C3079i c3079i = (C3079i) this.f6209e;
                EnumC0141n enumC0141n = (EnumC0141n) this.f6210f;
                c3079i.getClass();
                RunnableC1814b runnableC1814b = c3079i.f9793a;
                CopyOnWriteArrayList copyOnWriteArrayList = c3079i.f9794b;
                EnumC0140m.Companion.getClass();
                int iOrdinal = enumC0141n.ordinal();
                if (enumC0140m != (iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0140m.ON_RESUME : EnumC0140m.ON_START : EnumC0140m.ON_CREATE)) {
                    EnumC0140m enumC0140m2 = EnumC0140m.ON_DESTROY;
                    if (enumC0140m != enumC0140m2) {
                        int iOrdinal2 = enumC0141n.ordinal();
                        if (iOrdinal2 != 2) {
                            enumC0140m2 = iOrdinal2 != 3 ? iOrdinal2 != 4 ? null : EnumC0140m.ON_PAUSE : EnumC0140m.ON_STOP;
                        }
                        if (enumC0140m == enumC0140m2) {
                            copyOnWriteArrayList.remove((Object) null);
                            runnableC1814b.run();
                        }
                    } else {
                        c3079i.m5398a();
                    }
                } else {
                    copyOnWriteArrayList.add(null);
                    runnableC1814b.run();
                }
                break;
        }
    }
}
