package p000;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: vg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0851vg implements v90 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6710d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6711e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f6712f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0851vg(int i, Object obj, Object obj2) {
        this.f6710d = i;
        this.f6711e = obj;
        this.f6712f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v90
    /* JADX INFO: renamed from: e */
    public final void mo350e(x90 x90Var, q90 q90Var) {
        int i = this.f6710d;
        Object obj = this.f6712f;
        Object obj2 = this.f6711e;
        switch (i) {
            case 0:
                bl0 bl0Var = (bl0) obj2;
                AbstractActivityC0246gh abstractActivityC0246gh = (AbstractActivityC0246gh) obj;
                if (q90Var == q90.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = abstractActivityC0246gh.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    bl0Var.m357b(onBackInvokedDispatcher);
                }
                break;
            default:
                de0 de0Var = (de0) obj2;
                r90 r90Var = (r90) obj;
                de0Var.getClass();
                RunnableC0802ug runnableC0802ug = de0Var.f1059a;
                CopyOnWriteArrayList copyOnWriteArrayList = de0Var.f1060b;
                q90.Companion.getClass();
                int iOrdinal = r90Var.ordinal();
                if (q90Var != (iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : q90.ON_RESUME : q90.ON_START : q90.ON_CREATE)) {
                    q90 q90Var2 = q90.ON_DESTROY;
                    if (q90Var != q90Var2) {
                        int iOrdinal2 = r90Var.ordinal();
                        if (iOrdinal2 != 2) {
                            q90Var2 = iOrdinal2 != 3 ? iOrdinal2 != 4 ? null : q90.ON_PAUSE : q90.ON_STOP;
                        }
                        if (q90Var == q90Var2) {
                            copyOnWriteArrayList.remove((Object) null);
                            runnableC0802ug.run();
                        }
                    } else {
                        de0Var.m686a();
                    }
                } else {
                    copyOnWriteArrayList.add(null);
                    runnableC0802ug.run();
                }
                break;
        }
    }
}
