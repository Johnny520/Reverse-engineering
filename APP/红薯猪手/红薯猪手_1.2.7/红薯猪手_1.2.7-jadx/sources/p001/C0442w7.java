package p001;

import android.annotation.SuppressLint;
import android.widget.TextView;
import p001.C0287kc;

/* JADX INFO: renamed from: ۟.w7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0442w7 extends C0287kc.k {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ AlertDialogC0403t7 f1171;

    public C0442w7(AlertDialogC0403t7 alertDialogC0403t7) {
        this.f1171 = alertDialogC0403t7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.C0287kc.h
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final void mo1136(int i) {
        AlertDialogC0403t7 alertDialogC0403t7 = this.f1171;
        int i2 = AlertDialogC0403t7.f1111;
        ((TextView) alertDialogC0403t7.f1819.m886()).setText((i + 1) + "/" + this.f1171.f1817.size());
    }
}
