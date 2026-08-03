package p001;

import android.app.Application;
import com.tendcloud.tenddata.TalkingDataSDK;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p001.AbstractC0356q;

/* JADX INFO: renamed from: ۟.nb */
/* JADX INFO: loaded from: classes.dex */
public final class C0328nb {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public static List m906() {
        String str = C0283k8.f1632.f1611;
        C0237h4.m1089(C0341oa.m915(new byte[]{100, -15, -16, 66, -13, -83, 81, -33, -14, 67, -25, -92, 64, -32, -48, 65, -11}, new byte[]{37, -110, -109, 45, -122, -61}), str);
        Object objM928 = C0373r3.m928(str, C0283k8.f1632.f1612);
        Object objM926 = objM928 != null ? C0373r3.m926(objM928, C0283k8.f1632.f896, new Object[0]) : null;
        ArrayList arrayListM1107 = C0272jb.m1107("", "", "");
        if (objM926 != null) {
            String str2 = (String) C0373r3.m1204(objM926, C0341oa.m915(new byte[]{-2, -39, -76, -69, -107, -120, -3, -43}, new byte[]{-112, -80, -41, -48, -5, -23}));
            if (str2 == null) {
                str2 = "";
            }
            arrayListM1107.set(0, str2);
            String str3 = (String) C0373r3.m1204(objM926, C0341oa.m915(new byte[]{-36, -79, 17, -1, 77, -15}, new byte[]{-87, -62, 116, -115, 36, -107}));
            if (str3 == null) {
                str3 = "";
            }
            arrayListM1107.set(1, str3);
            String str4 = (String) C0373r3.m1204(objM926, C0341oa.m915(new byte[]{-77, 23, 8, -68, -106}, new byte[]{-63, 114, 108, -11, -14, 90}));
            if (str4 == null) {
                str4 = "";
            }
            arrayListM1107.set(2, str4);
        }
        if (((CharSequence) arrayListM1107.get(1)).length() == 0) {
            C0325n8.f994.getClass();
            JSONObject jSONObjectM905 = C0325n8.m905();
            if (jSONObjectM905 != null) {
                String strOptString = jSONObjectM905.optString(C0341oa.m915(new byte[]{38, -59, -97, -91, 113, 4, 37, -55}, new byte[]{72, -84, -4, -50, 31, 101}));
                C0237h4.m1089(C0341oa.m915(new byte[]{64, 35, 16, -94, 39, 88, 70, 61, 3, -39, 125, 4, 1, 122}, new byte[]{47, 83, 100, -15, 83, 42}), strOptString);
                arrayListM1107.set(0, strOptString);
                String strOptString2 = jSONObjectM905.optString(C0341oa.m915(new byte[]{9, 79, -108, 46, -80, 114}, new byte[]{124, 60, -15, 92, -39, 22}));
                C0237h4.m1089(C0341oa.m915(new byte[]{-21, -22, 67, -61, 44, 30, -19, -12, 80, -72, 118, 66, -86, -77}, new byte[]{-124, -102, 55, -112, 88, 108}), strOptString2);
                arrayListM1107.set(1, strOptString2);
                String strOptString3 = jSONObjectM905.optString(C0341oa.m915(new byte[]{110, 26, -48, 126, 33, -76}, new byte[]{28, 127, -76, 33, 72, -48}));
                C0237h4.m1089(C0341oa.m915(new byte[]{-113, 5, -77, 28, -37, -39, -119, 27, -96, 103, -127, -123, -50, 92}, new byte[]{-32, 117, -57, 79, -81, -85}), strOptString3);
                arrayListM1107.set(2, strOptString3);
            }
        }
        return ((CharSequence) arrayListM1107.get(1)).length() > 0 ? arrayListM1107 : C0272jb.m1106("", "", "");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m907(Application application) {
        C0341oa.m915(new byte[]{-63, -47, -122, 28, 103, 27, -63, -43, -97, 31, 96}, new byte[]{-96, -95, -10, 112, 14, 120});
        C0286kb c0286kb = AbstractC0356q.f1031;
        if (AbstractC0356q.c.m1193(application)) {
            TalkingDataSDK.setVerboseLogDisable();
            TalkingDataSDK.initSDK(application, C0272jb.m1099(C0341oa.m915(new byte[]{-9, 95, -75, -70, 104, -17, -15, 36, -59, -69, 110, -13, -11, 73, -54, -71, 99, -128, -9, 89, -50, -71, 111, -13, -12, 94, -76, -70, 111, -5, -25, 37}, new byte[]{-75, 27, -117, -6, 45, -66})), C0155b6.m1013(), C0341oa.m915(new byte[]{-88, 52, 105, 108, 99, -112, -86, 40}, new byte[]{-103, 26, 91, 66, 84, -67}));
            TalkingDataSDK.setReportUncaughtExceptions(false);
            AbstractC0356q.c.m921().postDelayed(new RunnableC0265j4(3, application), 3000L);
        }
    }
}
