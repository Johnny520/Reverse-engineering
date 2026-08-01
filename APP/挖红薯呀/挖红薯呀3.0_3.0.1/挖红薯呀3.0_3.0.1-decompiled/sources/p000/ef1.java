package p000;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1442a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [kf1.O0(android.app.Activity):void, kf1.Q0(android.app.Activity):void] */
    public /* synthetic */ ef1(int i) {
        this.f1442a = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: kf1.B(android.content.DialogInterface, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f1442a) {
            case 0:
                kf1.m1825R0(dialogInterface, i);
                break;
            default:
                kf1.m1821P0(dialogInterface, i);
                break;
        }
    }
}
