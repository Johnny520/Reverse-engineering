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
        C0237h4.m1089("AccountManagerCls", str);
        Object objM928 = C0373r3.m928(str, C0283k8.f1632.f1612);
        Object objM926 = objM928 != null ? C0373r3.m926(objM928, C0283k8.f1632.f896, new Object[0]) : null;
        ArrayList arrayListM1107 = C0272jb.m1107("", "", "");
        if (objM926 != null) {
            String str2 = (String) C0373r3.m1204(objM926, "nickname");
            if (str2 == null) {
                str2 = "";
            }
            arrayListM1107.set(0, str2);
            String str3 = (String) C0373r3.m1204(objM926, "userid");
            if (str3 == null) {
                str3 = "";
            }
            arrayListM1107.set(1, str3);
            String str4 = (String) C0373r3.m1204(objM926, "redId");
            if (str4 == null) {
                str4 = "";
            }
            arrayListM1107.set(2, str4);
        }
        if (((CharSequence) arrayListM1107.get(1)).length() == 0) {
            C0325n8.f994.getClass();
            JSONObject jSONObjectM905 = C0325n8.m905();
            if (jSONObjectM905 != null) {
                String strOptString = jSONObjectM905.optString("nickname");
                C0237h4.m1089("optString(...)", strOptString);
                arrayListM1107.set(0, strOptString);
                String strOptString2 = jSONObjectM905.optString("userid");
                C0237h4.m1089("optString(...)", strOptString2);
                arrayListM1107.set(1, strOptString2);
                String strOptString3 = jSONObjectM905.optString("red_id");
                C0237h4.m1089("optString(...)", strOptString3);
                arrayListM1107.set(2, strOptString3);
            }
        }
        return ((CharSequence) arrayListM1107.get(1)).length() > 0 ? arrayListM1107 : C0272jb.m1106("", "", "");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m907(Application application) {
        "application";
        C0286kb c0286kb = AbstractC0356q.f1031;
        if (AbstractC0356q.c.m1193(application)) {
            TalkingDataSDK.setVerboseLogDisable();
            TalkingDataSDK.initSDK(application, "68249E83B57A4F57B266976A593469F2", C0155b6.m1013(), "1.2.7-32");
            TalkingDataSDK.setReportUncaughtExceptions(false);
            AbstractC0356q.c.m921().postDelayed(new RunnableC0265j4(3, application), 3000L);
        }
    }
}
