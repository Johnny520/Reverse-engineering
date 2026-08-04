package yyds;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: yyds.ᛵᛴᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1085 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4993;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f4994;

    public /* synthetic */ C1085(int i, Object obj) {
        this.f4993 = i;
        this.f4994 = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f4993) {
            case 0:
                ((AbstractC2315) this.f4994).mo3658();
                break;
            default:
                if (AbstractC1544.m3188(intent != null ? intent.getAction() : null, AbstractC2328.m4341(-757709113295726L))) {
                    C2336.f11496.m4354(AbstractC2328.m4341(-757919566693230L));
                    C1221 c1221 = C1221.f5600;
                    C1221.f5601 = true;
                    ((NotificationManager) this.f4994).cancel(1001);
                    AbstractC1960.m3789(AbstractC2328.m4341(-757958221398894L));
                }
                break;
        }
    }
}
