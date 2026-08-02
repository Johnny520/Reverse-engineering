package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.function.IntConsumer;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: pe */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0577pe implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8266h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8267i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f8268j;

    public /* synthetic */ RunnableC0577pe(int i, int i2, Object obj) {
        this.f8266h = i2;
        this.f8268j = obj;
        this.f8267i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8266h;
        int i2 = this.f8267i;
        Object obj = this.f8268j;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            default:
                Activity activity = (Activity) obj;
                sz0 sz0Var = AbstractC0731te.f10689a;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    Dialog dialog = (Dialog) sz0Var.f10436i;
                    int i3 = 1;
                    if (dialog == null || !dialog.isShowing()) {
                        String string = activity.getString(R.string.nuke_core_dex_analysis_title);
                        string.getClass();
                        String string2 = activity.getString(R.string.nuke_core_dex_analysis_analyzing, 0, Integer.valueOf(i2));
                        string2.getClass();
                        sz0 sz0Var2 = new sz0(string2);
                        final l80 l80Var = new l80();
                        boolean z = l80Var.f5982k;
                        la1 la1Var = l80Var.f5979h;
                        if (!z) {
                            l80Var.f5980i.m4432a(null);
                            la1Var.m2892e(z91.ON_CREATE);
                            l80Var.f5982k = true;
                        }
                        C0328ix c0328ix = new C0328ix(activity);
                        c0328ix.setTag(R.id.view_tree_lifecycle_owner, l80Var);
                        c0328ix.setTag(R.id.view_tree_saved_state_registry_owner, l80Var);
                        c0328ix.setTag(R.id.view_tree_view_model_store_owner, l80Var);
                        c0328ix.setViewCompositionStrategy(new hh1(29, la1Var));
                        c0328ix.setContent(new C0402kw(-507549839, true, new s70(sz0Var2, string, i3)));
                        Dialog dialog2 = new Dialog(activity);
                        dialog2.requestWindowFeature(1);
                        dialog2.setCancelable(false);
                        dialog2.setCanceledOnTouchOutside(false);
                        dialog2.setContentView(c0328ix);
                        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: r70
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                sz0 sz0Var3 = AbstractC0731te.f10689a;
                                l80Var.m2875a();
                                sz0Var3.f10436i = null;
                                sz0Var3.f10437j = null;
                            }
                        });
                        sz0Var.f10437j = sz0Var2;
                        sz0Var.f10436i = dialog2;
                        dialog2.show();
                        if (l80Var.f5982k && !l80Var.f5983l) {
                            la1Var.m2892e(z91.ON_START);
                            la1Var.m2892e(z91.ON_RESUME);
                        }
                        Window window = dialog2.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(new ColorDrawable(0));
                            window.setDimAmount(0.36f);
                            window.setLayout(-2, -2);
                        }
                    }
                    break;
                }
                break;
        }
    }
}
