package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.function.IntConsumer;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ pe(int i, int i2, Object obj) {
        this.h = i2;
        this.j = obj;
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.h;
        int i2 = this.i;
        Object obj = this.j;
        switch (i) {
            case 0:
                ((IntConsumer) obj).accept(i2);
                break;
            default:
                Activity activity = (Activity) obj;
                sz0 sz0Var = te.a;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    Dialog dialog = (Dialog) sz0Var.i;
                    int i3 = 1;
                    if (dialog == null || !dialog.isShowing()) {
                        String string = activity.getString(R.string.nuke_core_dex_analysis_title);
                        string.getClass();
                        String string2 = activity.getString(R.string.nuke_core_dex_analysis_analyzing, 0, Integer.valueOf(i2));
                        string2.getClass();
                        sz0 sz0Var2 = new sz0(string2);
                        final l80 l80Var = new l80();
                        boolean z = l80Var.k;
                        la1 la1Var = l80Var.h;
                        if (!z) {
                            l80Var.i.a(null);
                            la1Var.e(z91.ON_CREATE);
                            l80Var.k = true;
                        }
                        ix ixVar = new ix(activity);
                        ixVar.setTag(R.id.view_tree_lifecycle_owner, l80Var);
                        ixVar.setTag(R.id.view_tree_saved_state_registry_owner, l80Var);
                        ixVar.setTag(R.id.view_tree_view_model_store_owner, l80Var);
                        ixVar.setViewCompositionStrategy(new hh1(29, la1Var));
                        ixVar.setContent(new kw(-507549839, true, new s70(sz0Var2, string, i3)));
                        Dialog dialog2 = new Dialog(activity);
                        dialog2.requestWindowFeature(1);
                        dialog2.setCancelable(false);
                        dialog2.setCanceledOnTouchOutside(false);
                        dialog2.setContentView(ixVar);
                        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: r70
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                sz0 sz0Var3 = te.a;
                                l80Var.a();
                                sz0Var3.i = null;
                                sz0Var3.j = null;
                            }
                        });
                        sz0Var.j = sz0Var2;
                        sz0Var.i = dialog2;
                        dialog2.show();
                        if (l80Var.k && !l80Var.l) {
                            la1Var.e(z91.ON_START);
                            la1Var.e(z91.ON_RESUME);
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
