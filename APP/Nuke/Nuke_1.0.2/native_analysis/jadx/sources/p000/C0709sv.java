package p000;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: sv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0709sv implements fa1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10376h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f10377i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f10378j;

    public /* synthetic */ C0709sv(int i, Object obj, Object obj2) {
        this.f10376h = i;
        this.f10377i = obj;
        this.f10378j = obj2;
    }

    @Override // p000.fa1
    /* JADX INFO: renamed from: g */
    public final void mo533g(ia1 ia1Var, z91 z91Var) {
        int i = this.f10376h;
        Object obj = this.f10378j;
        Object obj2 = this.f10377i;
        switch (i) {
            case 0:
                ot1 ot1Var = (ot1) obj2;
                AbstractActivityC0144dw abstractActivityC0144dw = (AbstractActivityC0144dw) obj;
                if (z91Var == z91.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = abstractActivityC0144dw.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    ot1Var.m3640b(onBackInvokedDispatcher);
                }
                break;
            default:
                ng1 ng1Var = (ng1) obj2;
                aa1 aa1Var = (aa1) obj;
                ng1Var.getClass();
                RunnableC0633qv runnableC0633qv = ng1Var.f7149a;
                CopyOnWriteArrayList copyOnWriteArrayList = ng1Var.f7150b;
                z91.Companion.getClass();
                int iOrdinal = aa1Var.ordinal();
                if (z91Var != (iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : z91.ON_RESUME : z91.ON_START : z91.ON_CREATE)) {
                    z91 z91Var2 = z91.ON_DESTROY;
                    if (z91Var != z91Var2) {
                        int iOrdinal2 = aa1Var.ordinal();
                        if (iOrdinal2 != 2) {
                            z91Var2 = iOrdinal2 != 3 ? iOrdinal2 != 4 ? null : z91.ON_PAUSE : z91.ON_STOP;
                        }
                        if (z91Var == z91Var2) {
                            copyOnWriteArrayList.remove((Object) null);
                            runnableC0633qv.run();
                        }
                    } else {
                        ng1Var.m3307a();
                    }
                } else {
                    copyOnWriteArrayList.add(null);
                    runnableC0633qv.run();
                }
                break;
        }
    }
}
