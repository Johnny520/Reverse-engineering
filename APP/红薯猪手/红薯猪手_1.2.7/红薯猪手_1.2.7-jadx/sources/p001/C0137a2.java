package p001;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import java.util.List;

/* JADX INFO: renamed from: ۟.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0137a2 extends AbstractC0335o4 implements InterfaceC0222g3<Activity, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ List<C0264j3> f674;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ LinearLayout f675;

    public C0137a2(List<C0264j3> list, LinearLayout linearLayout) {
        this.f674 = list;
        this.f675 = linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(Activity activity) {
        C0237h4.m1090(C0341oa.m915(new byte[]{59, -89}, new byte[]{82, -45, -2, -126, -30, -126}), activity);
        if (this.f674.isEmpty()) {
            int i = C0330o.f1000;
            C0330o.m1173(0, C0341oa.m915(new byte[]{-49, 32, -27, -101, 114, 100, -63, 18, -10, -105, 121, 122, -52, 50, -49, -101, 97, 102, -51, 4, -13, -103, 71, 110}, new byte[]{41, -68, 73, 126, -18, -44}));
        } else {
            Context context = this.f675.getContext();
            C0237h4.m1089(C0341oa.m915(new byte[]{18, 95, -74, 10, -120, 5, 1, 95, -70, 61, -49, 69, 91, 20, -21}, new byte[]{117, 58, -62, 73, -25, 107}), context);
            new AlertDialogC0147ac(context, this.f674).show();
        }
        return C0433vb.f1163;
    }
}
