package p001;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import p001.AlertDialogC0403t7;

/* JADX INFO: renamed from: ۟.x7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0455x7 extends AbstractC0335o4 implements InterfaceC0208f3<C0138a3> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ Context f1190;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ AlertDialogC0403t7 f1191;

    public C0455x7(Activity activity, AlertDialogC0403t7 alertDialogC0403t7) {
        this.f1190 = activity;
        this.f1191 = alertDialogC0403t7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0208f3
    /* JADX INFO: renamed from: ۥ */
    public final C0138a3 mo7() {
        C0138a3 c0138a3 = new C0138a3(this.f1190);
        AlertDialogC0403t7 alertDialogC0403t7 = this.f1191;
        c0138a3.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        c0138a3.setBackgroundColor(0);
        c0138a3.setAdapter((AlertDialogC0403t7.a) alertDialogC0403t7.f1820.m886());
        c0138a3.setCurrentItem(alertDialogC0403t7.f1818);
        c0138a3.setOnPageChangeListener(new C0442w7(alertDialogC0403t7));
        return c0138a3;
    }
}
