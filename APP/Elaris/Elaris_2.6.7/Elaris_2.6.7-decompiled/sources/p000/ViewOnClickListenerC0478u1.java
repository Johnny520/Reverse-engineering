package p000;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: u1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0478u1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f936c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0478u1(Object obj, Object obj2, int i) {
        this.f934a = i;
        this.f935b = obj;
        this.f936c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f934a;
        Object obj = this.f936c;
        Object obj2 = this.f935b;
        switch (i) {
            case 0:
                String str = (String) obj2;
                C0193e2 c0193e2 = (C0193e2) obj;
                if (!str.equals(c0193e2.f222i)) {
                    c0193e2.f222i = str;
                    AbstractC0225g2.m424j(c0193e2, c0193e2.f221h);
                    break;
                }
                break;
            case 1:
                ((RunnableC0239h0) obj2).run();
                ((Dialog) obj).dismiss();
                break;
            default:
                C0026b9 c0026b9 = (C0026b9) obj;
                C0362o8 c0362o8 = ((C0565z8) obj2).f1141b;
                if (c0362o8 != null) {
                    Dialog dialog = c0362o8.f645a;
                    AtomicBoolean atomicBoolean = c0362o8.f646b;
                    Activity activity = c0362o8.f647c;
                    ClassLoader classLoader = c0362o8.f648d;
                    C0410pd c0410pd = c0362o8.f649e;
                    if (dialog.isShowing() && atomicBoolean.compareAndSet(false, true)) {
                        dialog.dismiss();
                        AbstractC0260i5.m562Q1(activity, classLoader, c0410pd, c0026b9, "");
                        break;
                    }
                }
                break;
        }
    }
}
