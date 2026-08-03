package p001;

import android.app.Activity;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: ۟.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0410u1 extends AbstractC0335o4 implements InterfaceC0222g3<Activity, C0433vb> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ List<String> f1121;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ TextView f1122;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ int f1823;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final /* synthetic */ C0352p8 f1824;

    public C0410u1(List<String> list, TextView textView, int i, C0352p8 c0352p8) {
        this.f1121 = list;
        this.f1122 = textView;
        this.f1823 = i;
        this.f1824 = c0352p8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final C0433vb mo984(Activity activity) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-28, 14}, new byte[]{-115, 122, -29, -8, 101, 31}), activity);
        if (this.f1121.size() == 1) {
            TextView textView = this.f1122;
            StringBuilder sbM924 = C0372r2.m924(C0341oa.m915(new byte[]{-69, 59, 100, 58, 78, -49, -69, 59, 66, -24, -45}, new byte[]{95, -125, -17, -46, -13, 114}), Integer.valueOf(this.f1823));
            sbM924.append(C0341oa.m915(new byte[]{23}, new byte[]{50, -116, -17, -104, -102, -29}));
            textView.setText(sbM924.toString());
        } else {
            TextView textView2 = this.f1122;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1824.f1028 + 1);
            sb.append(C0341oa.m915(new byte[]{43}, new byte[]{4, -23, -12, 31, -120, -24}));
            sb.append(this.f1121.size());
            sb.append(C0341oa.m915(new byte[]{-32, -99, -73, -50, 95, -45, 87, -99, -73, -24, -115}, new byte[]{-22, 121, 15, 69, -73, 110}));
            sb.append(this.f1823);
            sb.append(C0341oa.m915(new byte[]{-67}, new byte[]{-104, -10, -91, 46, 104, 77}));
            textView2.setText(sb);
        }
        return C0433vb.f1163;
    }
}
