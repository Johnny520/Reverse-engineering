package p000;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zq1 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f14062a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0469mp f14063b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yk2 f14064c;

    public zq1(AtomicBoolean atomicBoolean, C0469mp c0469mp, yk2 yk2Var) {
        this.f14062a = atomicBoolean;
        this.f14063b = c0469mp;
        this.f14064c = yk2Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws j90 {
        if (this.f14062a.get()) {
            return;
        }
        C0469mp c0469mp = this.f14063b;
        if (c0469mp.m3155y()) {
            c0469mp.mo2512n(new zk2(12, "UI_DISMISSED", vi0.m5691j("The UI request from ", this.f14064c.f13503b, " was dismissed.")));
        }
    }
}
