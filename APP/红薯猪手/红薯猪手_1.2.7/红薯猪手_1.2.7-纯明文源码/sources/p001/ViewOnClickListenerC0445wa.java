package p001;

import android.view.View;

/* JADX INFO: renamed from: ۟.wa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0445wa implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f1178;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ AbstractAlertDialogC0471ya f1179;

    public /* synthetic */ ViewOnClickListenerC0445wa(AbstractAlertDialogC0471ya abstractAlertDialogC0471ya, int i) {
        this.f1178 = i;
        this.f1179 = abstractAlertDialogC0471ya;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1178) {
            case 0:
                AbstractAlertDialogC0471ya abstractAlertDialogC0471ya = this.f1179;
                C0237h4.m1090("this$0", abstractAlertDialogC0471ya);
                abstractAlertDialogC0471ya.dismiss();
                break;
            default:
                AbstractAlertDialogC0471ya abstractAlertDialogC0471ya2 = this.f1179;
                C0237h4.m1090("this$0", abstractAlertDialogC0471ya2);
                if (C0237h4.m864(C0373r3.m1201(abstractAlertDialogC0471ya2, "mCancelable"), Boolean.TRUE)) {
                    abstractAlertDialogC0471ya2.dismiss();
                }
                break;
        }
    }
}
