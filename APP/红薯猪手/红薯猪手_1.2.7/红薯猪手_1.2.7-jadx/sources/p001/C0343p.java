package p001;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/* JADX INFO: renamed from: ۟.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0343p extends AbstractC0335o4 implements InterfaceC0222g3<Activity, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ String f1015;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ int f1016;

    public C0343p(String str, int i) {
        this.f1015 = str;
        this.f1016 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(Activity activity) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-14, -17}, new byte[]{-101, -101, 25, -44, -117, 33}), activity);
        Context context = C0292l3.f937;
        if (context != null) {
            Toast.makeText(context, this.f1015, this.f1016).show();
            return C0433vb.f1163;
        }
        C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
        throw null;
    }
}
