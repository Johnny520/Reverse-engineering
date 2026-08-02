package defpackage;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zq1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ yk2 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zq1(AtomicBoolean atomicBoolean, mp mpVar, yk2 yk2Var) {
        this.a = atomicBoolean;
        this.b = mpVar;
        this.c = yk2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws j90 {
        if (this.a.get()) {
            return;
        }
        mp mpVar = this.b;
        if (mpVar.y()) {
            mpVar.n(new zk2(12, "UI_DISMISSED", vi0.j("The UI request from ", this.c.b, " was dismissed.")));
        }
    }
}
