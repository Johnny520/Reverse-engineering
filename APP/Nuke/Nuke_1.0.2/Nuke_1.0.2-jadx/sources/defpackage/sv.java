package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sv implements fa1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ sv(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fa1
    public final void g(ia1 ia1Var, z91 z91Var) {
        int i = this.h;
        Object obj = this.j;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                ot1 ot1Var = (ot1) obj2;
                dw dwVar = (dw) obj;
                if (z91Var == z91.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = dwVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    ot1Var.b(onBackInvokedDispatcher);
                }
                break;
            default:
                ng1 ng1Var = (ng1) obj2;
                aa1 aa1Var = (aa1) obj;
                ng1Var.getClass();
                qv qvVar = ng1Var.a;
                CopyOnWriteArrayList copyOnWriteArrayList = ng1Var.b;
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
                            qvVar.run();
                        }
                    } else {
                        ng1Var.a();
                    }
                } else {
                    copyOnWriteArrayList.add(null);
                    qvVar.run();
                }
                break;
        }
    }
}
