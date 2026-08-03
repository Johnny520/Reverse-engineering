package p001;

import android.app.Activity;
import android.content.Context;
import android.media.MediaScannerConnection;

/* JADX INFO: renamed from: ۟.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0423v1 extends AbstractC0335o4 implements InterfaceC0222g3<Activity, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ String f1147;

    public C0423v1(String str) {
        this.f1147 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(Activity activity) {
        C0237h4.m1090("it", activity);
        int i = C0330o.f1000;
        String str = this.f1147;
        C0237h4.m1090("path", str);
        Context context = C0292l3.f937;
        if (context != null) {
            MediaScannerConnection.scanFile(context, new String[]{str}, null, null);
            return C0433vb.f1163;
        }
        C0237h4.m1092("context");
        throw null;
    }
}
