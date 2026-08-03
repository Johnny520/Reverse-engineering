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
                C0237h4.m1090(C0341oa.m915(new byte[]{71, -55, 108, -86, -13}, new byte[]{99, -67, 9, -46, -121, -109}), str);
                int i = C0330o.f1000;
                C0330o.m1173(0, str);
                return;
            case 2:
                LinearLayout linearLayout = (LinearLayout) this.f873;
                String str2 = C0475z1.f1221;
                C0237h4.m1090(C0341oa.m915(new byte[]{-8, -94, 118, -121, 85, 59, -82, -126, 126, -112, 95, 47, -88}, new byte[]{-36, -50, 31, -23, 48, 90}), linearLayout);
                C0274k c0274k = C0283k8.f1632;
                C0292l3.m1141(new C0137a2(C0283k8.a.m884().mo985().getAll(), linearLayout));
                return;
            default:
                Application application = (Application) this.f873;
                C0237h4.m1090(C0341oa.m915(new byte[]{-57, 124, 6, -101, -123, 46, -128, 124, 2, -126, -122, 41}, new byte[]{-29, 29, 118, -21, -23, 71}), application);
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
                    map.put(C0341oa.m915(new byte[]{-73, -36, 42, 98, 105, -78, -81, -54}, new byte[]{-62, -81, 79, 16, 39, -45}), str6);
                    map.put(C0341oa.m915(new byte[]{-118, 78, 66}, new byte[]{-1, 39, 38, -21, 34, -48}), str7);
                    map.put(C0341oa.m915(new byte[]{-38, -123, 99, -36, -15}, new byte[]{-88, -32, 7, -75, -107, -26}), str8);
                    map.put(C0341oa.m915(new byte[]{38, -106, -102, -102}, new byte[]{71, -64, -1, -24, -80, 21}), String.valueOf(C0292l3.f1686));
                    String strM1013 = C0155b6.m1013();
                    map.put(C0341oa.m915(new byte[]{-39, 80, -45, -118}, new byte[]{-76, 6, -74, -8, 48, -29}), C0341oa.m915(new byte[]{-55, 20}, new byte[]{-6, 38, 49, -113, 74, -128}));
                    map.put(C0341oa.m915(new byte[]{102, 76, 84, -29, 115, 74, 100, 77}, new byte[]{22, 32, 53, -105, 21, 37}), strM1013);
                    map.put(C0341oa.m915(new byte[]{21, -10, -42, -65, 32}, new byte[]{120, -103, -78, -38, 76, 65}), Build.MODEL);
                    TalkingDataSDK.onEvent(application, C0341oa.m915(new byte[]{-75, 7, -53, 42, 35, -42, -107, 25, -5, 55}, new byte[]{-38, 105, -98, 89, 70, -92}), map);
                }
                if ((C0283k8.f1633.length() == 0) || C0237h4.m864(C0272jb.m1099(C0341oa.m915(new byte[]{-57, -35, -104, 72, -51, 124, -70, -94, -73, 6, -3, 76, -60, -17, -99, 5, -79, 2, -70, -38, -87, 73, -4, 83, -58, -16, -100, 86, -78, 82, -60, -20}, new byte[]{-5, -98, -39, 56, -115, 61})), C0283k8.f1633)) {
                    return;
                }
                List listM9062 = C0328nb.m906();
                if (((CharSequence) listM9062.get(1)).length() > 0) {
                    String str9 = (String) listM9062.get(0);
                    String str10 = (String) listM9062.get(1);
                    String str11 = (String) listM9062.get(2);
                    if (str11.length() > 0) {
                        String str12 = "sign_" + str11;
                        C0364q7[] c0364q7Arr = {new C0364q7(C0341oa.m915(new byte[]{12, -37, 103}, new byte[]{121, -78, 3, 26, 76, 83}), str10), new C0364q7(C0341oa.m915(new byte[]{-23, 120, -52, 78, -74}, new byte[]{-101, 29, -88, 39, -46, 20}), str11), new C0364q7(C0341oa.m915(new byte[]{17, 120, 58, 33}, new byte[]{127, 17, 89, 74, -18, -105}), str9)};
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
