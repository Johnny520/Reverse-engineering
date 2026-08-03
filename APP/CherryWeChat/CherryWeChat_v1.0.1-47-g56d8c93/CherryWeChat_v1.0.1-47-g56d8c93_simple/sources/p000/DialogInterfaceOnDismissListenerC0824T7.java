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

    public /* synthetic */ DialogInterfaceOnDismissListenerC0824T7(int r1, Object r2) {
        this.f2596a = r1;
        this.f2597b = r2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r2) {
        switch(this.f2596a) {
            case 0: goto L18;
            case 1: goto L11;
            default: goto L4;
        };
    L4:
        Context r22 = (Context) this.f2597b;
        if ((r22 instanceof Activity) == false) goto L7;
        Activity r23 = (Activity) r22;
    L8:
        if (r23 == null) goto L20;
        r23.finish();
        return;
    L20:
        return;
    L7:
        r23 = null;
        goto L8
    L11:
        Context r24 = ((C2112jq) this.f2597b).getContext();
        if ((r24 instanceof Activity) == false) goto L14;
        Activity r25 = (Activity) r24;
    L15:
        if (r25 == null) goto L21;
        r25.finish();
        return;
    L21:
        return;
    L14:
        r25 = null;
        goto L15
    L18:
        ((ViewOnClickListenerC0996X7) this.f2597b).f3182d = null;
    }
}
