package p001;

import android.text.TextUtils;
import p001.C0178d1;
import p001.C0463y2;

/* JADX INFO: renamed from: ۟.x9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0457x9 extends AbstractC0335o4 implements InterfaceC0222g3<String, Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0344p0 f1194;

    public C0457x9(C0344p0 c0344p0) {
        this.f1194 = c0344p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Boolean mo984(String str) {
        String strM915;
        String str2 = str;
        C0237h4.m1090(C0341oa.m915(new byte[]{1, -79, -77, -45}, new byte[]{117, -44, -53, -89, 107, 105}), str2);
        String string = C0432va.m1260(str2).toString();
        if (!TextUtils.isEmpty(string)) {
            if (C0406ta.m1244(string, C0341oa.m915(new byte[]{-101}, new byte[]{-25, -72, -101, 126, -126, -41}))) {
                string = string.substring(0, C0432va.m1254(string));
                strM915 = C0341oa.m915(new byte[]{120, -63, -100, 11, -35, -92, 98, -38, -103, 80, -121, -8, 37, -99}, new byte[]{11, -76, -2, 120, -87, -42});
            } else if (C0406ta.m942(string, C0341oa.m915(new byte[]{94}, new byte[]{34, -68, 30, -83, -47, -79}))) {
                string = string.substring(1, string.length());
                strM915 = C0341oa.m915(new byte[]{48, 119, -117, -3, -34, 121, 42, 108, -114, -90, -124, 37, 109, 43}, new byte[]{67, 2, -23, -114, -86, 11});
            }
            C0237h4.m1089(strM915, string);
        }
        this.f1194.m916(string);
        C0286kb c0286kb = C0178d1.f750;
        C0178d1.b.m841().mo850(this.f1194.f1018, string);
        if (C0237h4.m864(this.f1194.f1018, EnumC0164c1.f1386.f728)) {
            boolean z = C0463y2.f1203;
            C0463y2.a.m1272(string);
        } else {
            boolean z2 = C0463y2.f1203;
            C0463y2.a.m1271(string);
        }
        int i = C0330o.f1000;
        C0330o.m1173(1, C0341oa.m915(new byte[]{-49, -125, -70, -80, 67, 33, -49, -106, -104, -66, 111, 39, -49, -117, -124, -66, 80, 51, -52, -109, -65}, new byte[]{42, 6, 55, 89, -60, -84}));
        return Boolean.TRUE;
    }
}
