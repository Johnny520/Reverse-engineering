package p000;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: renamed from: T7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC0824T7 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2597b;

    public /* synthetic */ DialogInterfaceOnDismissListenerC0824T7(int i, Object obj) {
        this.f2596a = i;
        this.f2597b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f2596a) {
            case 0:
                ((ViewOnClickListenerC0996X7) this.f2597b).f3182d = null;
                break;
            case 1:
                Context context = ((C2112jq) this.f2597b).getContext();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.finish();
                }
                break;
            default:
                Context context2 = (Context) this.f2597b;
                Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity2 != null) {
                    activity2.finish();
                }
                break;
        }
    }
}
