package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: vi */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0811vi extends n21 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11971o = AtomicReferenceFieldUpdater.newUpdater(C0811vi.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: l */
    public final C0469mp f11972l;

    /* JADX INFO: renamed from: m */
    public ca0 f11973m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0887xi f11974n;

    public C0811vi(C0887xi c0887xi, C0469mp c0469mp) {
        this.f11974n = c0887xi;
        this.f11972l = c0469mp;
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: k */
    public final boolean mo1214k() {
        return false;
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: l */
    public final void mo1215l(Throwable th) throws j90 {
        C0469mp c0469mp = this.f11972l;
        if (th != null) {
            hh1 hh1VarM3143H = c0469mp.m3143H(new C0557ov(th, false), null);
            if (hh1VarM3143H != null) {
                c0469mp.mo2507C(hh1VarM3143H);
                C0848wi c0848wi = (C0848wi) f11971o.get(this);
                if (c0848wi != null) {
                    c0848wi.m5898b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0887xi.f13039b;
        C0887xi c0887xi = this.f11974n;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0887xi) == 0) {
            n60[] n60VarArr = c0887xi.f13040a;
            ArrayList arrayList = new ArrayList(n60VarArr.length);
            for (n60 n60Var : n60VarArr) {
                arrayList.add(n60Var.m3251e());
            }
            c0469mp.mo2509h(arrayList);
        }
    }
}
