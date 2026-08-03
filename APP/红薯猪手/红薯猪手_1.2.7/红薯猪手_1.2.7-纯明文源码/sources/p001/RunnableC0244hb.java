package p001;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: ۟.hb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0244hb implements Runnable {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f846 = 1;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ AbstractAlertDialogC0230gb f847;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ CharSequence f1511;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final /* synthetic */ int f1512;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ C0352p8 f1513;

    public /* synthetic */ RunnableC0244hb(AbstractAlertDialogC0230gb abstractAlertDialogC0230gb, CharSequence charSequence, int i, C0352p8 c0352p8) {
        this.f847 = abstractAlertDialogC0230gb;
        this.f1511 = charSequence;
        this.f1512 = i;
        this.f1513 = c0352p8;
    }

    public /* synthetic */ RunnableC0244hb(C0352p8 c0352p8, int i, AlertDialogC0441w6 alertDialogC0441w6, CharSequence charSequence) {
        this.f1513 = c0352p8;
        this.f1512 = i;
        this.f847 = alertDialogC0441w6;
        this.f1511 = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.f846) {
            case 0:
                C0352p8 c0352p8 = this.f1513;
                int i = this.f1512;
                AbstractAlertDialogC0230gb abstractAlertDialogC0230gb = this.f847;
                CharSequence charSequence = this.f1511;
                C0237h4.m1090("$currNum", c0352p8);
                C0237h4.m1090("$this_showButtonTime", abstractAlertDialogC0230gb);
                while (c0352p8.f1028 < i) {
                    Context context = abstractAlertDialogC0230gb.f1217;
                    C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", context);
                    ((Activity) context).runOnUiThread(new RunnableC0244hb(abstractAlertDialogC0230gb, charSequence, i, c0352p8));
                    c0352p8.f1028++;
                    Thread.sleep(1000L);
                }
                Context context2 = abstractAlertDialogC0230gb.f1217;
                C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", context2);
                ((Activity) context2).runOnUiThread(new RunnableC0258ib(abstractAlertDialogC0230gb, charSequence, 0));
                break;
            default:
                AbstractAlertDialogC0230gb abstractAlertDialogC0230gb2 = this.f847;
                CharSequence charSequence2 = this.f1511;
                int i2 = this.f1512;
                C0352p8 c0352p82 = this.f1513;
                C0237h4.m1090("$this_showButtonTime", abstractAlertDialogC0230gb2);
                C0237h4.m1090("$currNum", c0352p82);
                abstractAlertDialogC0230gb2.f1486.setText(((Object) charSequence2) + "(" + (i2 - c0352p82.f1028) + ")");
                break;
        }
    }
}
