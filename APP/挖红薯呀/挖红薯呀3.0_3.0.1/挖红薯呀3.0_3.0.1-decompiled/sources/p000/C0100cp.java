package p000;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* JADX INFO: renamed from: cp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0100cp implements MediaScannerConnection.OnScanCompletedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f871a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [hp.D(java.lang.String, int, boolean, android.content.Context, long, java.lang.String, int):void, hp.H(android.content.Context, java.lang.String, java.lang.String, int):boolean, hp.J(android.content.Context, java.lang.String, java.lang.String, int):boolean, hp.L(android.content.Context, java.lang.String, int):boolean, hp.Q(java.lang.String, boolean, android.content.Context, java.lang.String, long):void, hp.x(java.util.List, android.content.Context):void, vz.r(android.content.Context, byte[], int, java.lang.String, long):void] */
    public /* synthetic */ C0100cp(int i) {
        this.f871a = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: vz.b(java.lang.String, android.net.Uri):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        switch (this.f871a) {
            case 0:
                C0291hp.m1438E(str, uri);
                break;
            case 1:
                C0291hp.m1441I(str, uri);
                break;
            case 2:
                C0291hp.m1445M(str, uri);
                break;
            case 3:
                C0291hp.m1443K(str, uri);
                break;
            case 4:
                C0291hp.m1485y(str, uri);
                break;
            case 5:
                C0291hp.m1449R(str, uri);
                break;
            default:
                C0870vz.m4817s(str, uri);
                break;
        }
    }
}
