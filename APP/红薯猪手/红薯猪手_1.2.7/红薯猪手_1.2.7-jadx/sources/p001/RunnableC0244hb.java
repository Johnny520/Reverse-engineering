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
                C0237h4.m1090(C0341oa.m915(new byte[]{105, 70, 49, 60, -28, -30, 56, 72}, new byte[]{77, 37, 68, 78, -106, -84}), c0352p8);
                C0237h4.m1090(C0341oa.m915(new byte[]{25, -45, 62, 46, -82, 34, 78, -49, 57, 48, -97, 8, 73, -45, 57, 41, -119, 20, 80, -62}, new byte[]{61, -89, 86, 71, -35, 125}), abstractAlertDialogC0230gb);
                while (c0352p8.f1028 < i) {
                    Context context = abstractAlertDialogC0230gb.f1217;
                    C0237h4.m1088(C0341oa.m915(new byte[]{105, 108, 107, 26, -68, 33, 102, 119, 105, 25, -24, 98, 101, 124, 39, 21, -3, 49, 115, 57, 115, 25, -68, 44, 104, 119, 42, 24, -23, 46, 107, 57, 115, 15, -20, 39, 39, 120, 105, 18, -18, 45, 110, 125, 41, 23, -20, 50, 41, 88, 100, 2, -11, 52, 110, 109, 126}, new byte[]{7, 25, 7, 118, -100, 66}), context);
                    ((Activity) context).runOnUiThread(new RunnableC0244hb(abstractAlertDialogC0230gb, charSequence, i, c0352p8));
                    c0352p8.f1028++;
                    Thread.sleep(1000L);
                }
                Context context2 = abstractAlertDialogC0230gb.f1217;
                C0237h4.m1088(C0341oa.m915(new byte[]{26, 123, -97, 118, 77, -81, 21, 96, -99, 117, 25, -20, 22, 107, -45, 121, 12, -65, 0, 46, -121, 117, 77, -94, 27, 96, -34, 116, 24, -96, 24, 46, -121, 99, 29, -87, 84, 111, -99, 126, 31, -93, 29, 106, -35, 123, 29, -68, 90, 79, -112, 110, 4, -70, 29, 122, -118}, new byte[]{116, 14, -13, 26, 109, -52}), context2);
                ((Activity) context2).runOnUiThread(new RunnableC0258ib(abstractAlertDialogC0230gb, charSequence, 0));
                break;
            default:
                AbstractAlertDialogC0230gb abstractAlertDialogC0230gb2 = this.f847;
                CharSequence charSequence2 = this.f1511;
                int i2 = this.f1512;
                C0352p8 c0352p82 = this.f1513;
                C0237h4.m1090(C0341oa.m915(new byte[]{-97, -89, 28, -55, -100, 87, -56, -69, 27, -41, -83, 125, -49, -89, 27, -50, -69, 97, -42, -74}, new byte[]{-69, -45, 116, -96, -17, 8}), abstractAlertDialogC0230gb2);
                C0237h4.m1090(C0341oa.m915(new byte[]{-45, 60, -38, 71, -35, 51, -126, 50}, new byte[]{-9, 95, -81, 53, -81, 125}), c0352p82);
                abstractAlertDialogC0230gb2.f1486.setText(((Object) charSequence2) + "(" + (i2 - c0352p82.f1028) + ")");
                break;
        }
    }
}
