package p001;

import android.content.Context;
import android.view.View;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۟.t0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0396t0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f1096;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Object f1097;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ C0461y0 f1806;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnLongClickListenerC0396t0(XC_MethodHook.MethodHookParam methodHookParam, C0461y0 c0461y0, int i) {
        this.f1096 = i;
        this.f1097 = methodHookParam;
        this.f1806 = c0461y0;
    }

    public /* synthetic */ ViewOnLongClickListenerC0396t0(C0461y0 c0461y0, Object obj) {
        this.f1096 = 2;
        this.f1806 = c0461y0;
        this.f1097 = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f1096) {
            case 0:
                C0461y0.m1266((XC_MethodHook.MethodHookParam) this.f1097, this.f1806);
                break;
            case 1:
                C0461y0.m1265((XC_MethodHook.MethodHookParam) this.f1097, this.f1806);
                break;
            default:
                C0461y0 c0461y0 = this.f1806;
                Object obj = this.f1097;
                C0237h4.m1090(C0341oa.m915(new byte[]{-35, 26, 60, 120, -57, 24}, new byte[]{-87, 114, 85, 11, -29, 40}), c0461y0);
                Context context = view.getContext();
                C0237h4.m1089(C0341oa.m915(new byte[]{39, -88, 15, -118, 11, -102, 52, -88, 3, -67, 76, -38, 110, -29, 82}, new byte[]{64, -51, 123, -55, 100, -12}), context);
                C0461y0.m1267(context, obj);
                break;
        }
        return true;
    }
}
