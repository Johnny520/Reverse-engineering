package p001;

import android.view.View;

/* JADX INFO: renamed from: ۟.ja */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0271ja implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f882;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Object f883;

    public /* synthetic */ ViewOnClickListenerC0271ja(int i, Object obj) {
        this.f882 = i;
        this.f883 = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object objM1202;
        String str;
        Object objM12022;
        Object objM12023;
        Object objM12024;
        String string;
        Object objM12025;
        String string2;
        String str2 = "";
        String string3 = null;
        switch (this.f882) {
            case 0:
                Object obj = this.f883;
                C0325n8 c0325n8 = C0325n8.f994;
                C0237h4.m865(obj);
                Object objM12026 = C0373r3.m1202(obj, C0341oa.m915(new byte[]{4, -98, 10, -35}, new byte[]{113, -19, 111, -81, -7, -55}), false);
                if (objM12026 != null && (objM12022 = C0373r3.m1202(objM12026, C0341oa.m915(new byte[]{-17, -1, 94, 18, 4, 34}, new byte[]{-102, -116, 59, 96, 109, 70}), false)) != null) {
                    string3 = objM12022.toString();
                }
                c0325n8.getClass();
                C0325n8.m1160(string3);
                break;
            case 1:
                Object obj2 = this.f883;
                C0325n8 c0325n82 = C0325n8.f994;
                C0237h4.m865(obj2);
                Object objM12027 = C0373r3.m1202(obj2, C0341oa.m915(new byte[]{32, -36, 90, 104}, new byte[]{85, -81, 63, 26, 8, -11}), false);
                if (objM12027 != null && (objM12023 = C0373r3.m1202(objM12027, C0341oa.m915(new byte[]{-102, -40, -18, 90, -40, -39}, new byte[]{-17, -85, -117, 40, -79, -67}), false)) != null) {
                    string3 = objM12023.toString();
                }
                c0325n82.getClass();
                C0325n8.m1160(string3);
                break;
            case 2:
                Object obj3 = this.f883;
                C0325n8 c0325n83 = C0325n8.f994;
                C0237h4.m865(obj3);
                Object objM12028 = C0373r3.m1202(obj3, C0341oa.m915(new byte[]{98, 121, 92, 76}, new byte[]{23, 10, 57, 62, 103, 7}), false);
                if (objM12028 != null && (objM12024 = C0373r3.m1202(objM12028, C0341oa.m915(new byte[]{-84, 17, -78, 113, 112, -125}, new byte[]{-39, 98, -41, 3, 25, -25}), false)) != null && (string = objM12024.toString()) != null) {
                    str2 = string;
                }
                c0325n83.getClass();
                C0325n8.m1160(str2);
                break;
            case 3:
                Object obj4 = this.f883;
                C0325n8 c0325n84 = C0325n8.f994;
                C0237h4.m865(obj4);
                Object objM12029 = C0373r3.m1202(obj4, C0341oa.m915(new byte[]{5, 73, -111, -74}, new byte[]{112, 58, -12, -60, 116, 103}), false);
                if (objM12029 != null && (objM12025 = C0373r3.m1202(objM12029, C0341oa.m915(new byte[]{-35, -21, -103, -85, 70, 66}, new byte[]{-88, -104, -4, -39, 47, 38}), false)) != null && (string2 = objM12025.toString()) != null) {
                    str2 = string2;
                }
                c0325n84.getClass();
                C0325n8.m1160(str2);
                break;
            default:
                Object obj5 = this.f883;
                C0237h4.m865(obj5);
                Object objM120210 = C0373r3.m1202(obj5, C0283k8.f1632.f1585, false);
                if (objM120210 != null && (objM1202 = C0373r3.m1202(objM120210, C0283k8.f1632.f1586, false)) != null && (str = (String) C0373r3.m1204(objM1202, C0283k8.f1632.f1587)) != null) {
                    str2 = str;
                }
                if (str2.length() > 0) {
                    String str3 = C0327na.f998;
                    if (C0432va.m1253(str2, str3)) {
                        String strSubstring = str2.substring(C0432va.m1256(str2, str3 + "=", 0, false, 6) + 4);
                        C0237h4.m1089(C0341oa.m915(new byte[]{-88, 55, 37, -84, 48, 48, -78, 44, 32, -9, 106, 108, -11, 107}, new byte[]{-37, 66, 71, -33, 68, 66}), strSubstring);
                        C0325n8.f994.getClass();
                        C0325n8.m1160(strSubstring);
                    }
                }
                break;
        }
    }
}
