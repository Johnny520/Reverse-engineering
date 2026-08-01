package p061e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.fragment.app.AbstractC0429g;
import p027N0.AbstractC0223g;
import p070i0.AbstractC0731a;
import p086r0.C0858M1;
import p086r0.C0950w;
import p086r0.C0956y;
import p102z0.AbstractC1121d;
import p102z0.AbstractC1126i;
import p102z0.C1120c;
import p102z0.C1124g;

/* JADX INFO: renamed from: e.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0542r extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1772b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0542r(int i2, Object obj) {
        this.f1771a = i2;
        this.f1772b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f1771a) {
            case 0:
                ((AbstractC0429g) this.f1772b).mo830h();
                break;
            case 1:
                if (AbstractC0223g.m414a(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_OFF")) {
                    C0956y c0956y = (C0956y) this.f1772b;
                    c0956y.f3442e = true;
                    C0950w c0950w = c0956y.f3441d;
                    if (c0950w != null) {
                        c0950w.m2125j("screen-off");
                    }
                }
                break;
            case 2:
                if (AbstractC0223g.m414a(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_OFF") && context != null) {
                    ((C0858M1) this.f1772b).getClass();
                    C0858M1.m1758d(context);
                    break;
                }
                break;
            default:
                if (AbstractC0223g.m414a(intent != null ? intent.getAction() : null, "com.lu.wxmask.action.CONFIG_CHANGED") && intent.getIntExtra("sourcePid", -1) != Process.myPid()) {
                    AbstractC0731a.m1384a("config changed broadcast received", ((Context) this.f1772b).getPackageName());
                    boolean z2 = AbstractC1126i.f3786a;
                    C1124g.m2419J();
                    C1124g.m2441q(null);
                    C1120c c1120c = AbstractC1121d.f3779a;
                    AbstractC1121d.f3781c = null;
                    AbstractC1121d.f3782d = null;
                    C1124g.m2425a();
                }
                break;
        }
    }
}
