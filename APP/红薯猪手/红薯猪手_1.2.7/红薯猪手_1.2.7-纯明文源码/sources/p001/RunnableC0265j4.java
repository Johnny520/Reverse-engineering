package p001;

import android.app.Application;
import android.os.Build;
import android.widget.LinearLayout;
import com.tendcloud.tenddata.TalkingDataProfile;
import com.tendcloud.tenddata.TalkingDataProfileType;
import com.tendcloud.tenddata.TalkingDataSDK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import p001.AbstractC0356q;
import p001.C0279k4;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.j4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0265j4 implements Runnable {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f872;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Object f873;

    public /* synthetic */ RunnableC0265j4(int i, Object obj) {
        this.f872 = i;
        this.f873 = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f872) {
            case 0:
                C0279k4 c0279k4 = (C0279k4) this.f873;
                synchronized (c0279k4) {
                    c0279k4.f1624 = false;
                    C0279k4.b bVar = c0279k4.f1626;
                    synchronized (bVar) {
                        Arrays.fill(bVar.f909, false);
                        bVar.f1631 = true;
                        break;
                    }
                }
                return;
            case 1:
                String str = (String) this.f873;
                C0237h4.m1090("$text", str);
                int i = C0330o.f1000;
                C0330o.m1173(0, str);
                return;
            case 2:
                LinearLayout linearLayout = (LinearLayout) this.f873;
                String str2 = C0475z1.f1221;
                C0237h4.m1090("$linearLayout", linearLayout);
                C0274k c0274k = C0283k8.f1632;
                C0292l3.m1141(new C0137a2(C0283k8.a.m884().mo985().getAll(), linearLayout));
                return;
            default:
                Application application = (Application) this.f873;
                C0237h4.m1090("$application", application);
                TalkingDataSDK.startA(application);
                C0286kb c0286kb = AbstractC0356q.f1031;
                if (AbstractC0356q.c.m1193(application)) {
                    List listM906 = C0328nb.m906();
                    String str3 = (String) listM906.get(1);
                    if (str3.length() > 0) {
                        String str4 = (String) listM906.get(0);
                        String str5 = (String) listM906.get(2);
                        TalkingDataProfileType talkingDataProfileType = C0155b6.m1012().length() > 0 ? TalkingDataProfileType.TYPE1 : C0155b6.m822() ? TalkingDataProfileType.TYPE2 : C0155b6.m821() ? TalkingDataProfileType.TYPE3 : C0155b6.m1015() ? TalkingDataProfileType.TYPE7 : C0155b6.m1014() ? TalkingDataProfileType.TYPE4 : C0155b6.m1016() ? TalkingDataProfileType.TYPE5 : TalkingDataProfileType.TYPE6;
                        TalkingDataProfile talkingDataProfileCreateProfile = TalkingDataProfile.createProfile();
                        talkingDataProfileCreateProfile.setName(str4);
                        talkingDataProfileCreateProfile.setType(talkingDataProfileType);
                        talkingDataProfileCreateProfile.setProperty1(str5);
                        TalkingDataSDK.onLogin(str3, talkingDataProfileCreateProfile);
                    }
                }
                ArrayList arrayList = new ArrayList(C0328nb.m906());
                if (((CharSequence) arrayList.get(1)).length() > 0) {
                    String str6 = (String) arrayList.get(0);
                    String str7 = (String) arrayList.get(1);
                    String str8 = (String) arrayList.get(2);
                    HashMap map = new HashMap();
                    map.put("userName", str6);
                    map.put("uid", str7);
                    map.put("redid", str8);
                    map.put("aVer", String.valueOf(C0292l3.f1686));
                    String strM1013 = C0155b6.m1013();
                    map.put("mVer", "32");
                    map.put("platform", strM1013);
                    map.put("model", Build.MODEL);
                    TalkingDataSDK.onEvent(application, "onUserOpen", map);
                }
                if ((C0283k8.f1633.length() == 0) || C0237h4.m864("075d4550b2de3e810358deeb1b9b3c3f", C0283k8.f1633)) {
                    return;
                }
                List listM9062 = C0328nb.m906();
                if (((CharSequence) listM9062.get(1)).length() > 0) {
                    String str9 = (String) listM9062.get(0);
                    String str10 = (String) listM9062.get(1);
                    String str11 = (String) listM9062.get(2);
                    if (str11.length() > 0) {
                        String str12 = "sign_" + str11;
                        C0364q7[] c0364q7Arr = {new C0364q7("uid", str10), new C0364q7("redid", str11), new C0364q7("nick", str9)};
                        LinkedHashMap linkedHashMap = new LinkedHashMap((int) ((3 / 0.75f) + 1.0f));
                        for (int i2 = 0; i2 < 3; i2++) {
                            C0364q7 c0364q7 = c0364q7Arr[i2];
                            linkedHashMap.put(c0364q7.f1045, c0364q7.f1046);
                        }
                        TalkingDataSDK.onEvent(application, str12, linkedHashMap);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
