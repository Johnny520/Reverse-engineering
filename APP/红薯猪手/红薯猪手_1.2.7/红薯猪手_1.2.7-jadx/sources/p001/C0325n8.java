package p001;

import android.R;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.mmkv.MMKV;
import de.robv.android.xposed.XC_MethodHook;
import org.json.JSONObject;
import p001.AbstractC0356q;

/* JADX INFO: renamed from: ۟.n8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0325n8 {

    /* JADX INFO: renamed from: ۥ */
    public static final C0325n8 f994;

    /* JADX INFO: renamed from: ۥ۟ */
    public static MMKV f995;

    /* JADX INFO: renamed from: ۟.n8$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC0208f3<C0433vb> f996;

        public a(InterfaceC0208f3<C0433vb> interfaceC0208f3) {
            this.f996 = interfaceC0208f3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final C0433vb mo7() {
            this.f996.mo7();
            return C0433vb.f1163;
        }
    }

    static {
        C0341oa.m915(new byte[]{-103, 8, -49, -40, 96, -71, 77, -119, 68, 16, -7, -53, -25, 19, -112, -88, 127, -59, -46, 23, -109, -125, 90, -62, -64, 61, 74, 92, -67, 19, 77, -119, 86, -38, 112, -125, -103, 3, -5, 30, 40, -127, -24, 79, -40, -114, 42, -94, -45, 79, -11, -125, 43, -107, -15, 65, -18, -128, 40, -119, -58, 67, -55, -93, 42, -128, -28, -21, 31, 72, -86, 125, 20, -56, 2, 81, -13, 79, 14, -103, 68, 16, -17, -55, -61, 9, -109, -102, 66, 13, -104, 24, -21, -37, 98, -75, -108, 8, -14, -42, 97, -105, 48, -50, 0, 91, -65, 69, 19, -45, 25, -37, 64, -126, -108, 36, -53, -37, 107, -100, -108, 19, -45, 2, -83, 95, 66, -108, 88, 30, 41, -69, -52, 66, -44, -96, -17, -55, -61, 58, -109, -109, 87, -56, -15, 50, -109, -126, 111, -54, -48, 51, -98, -112, 127, -53, -21, 7, -112, -114, 123, -56, -15, 23, 58, 87, -71, 72, 12, -49, 25, 74, -96, 17, 30, -43, 72, 10, -31, 13, -102, 49, -58, -37, 109, -77, 92, 66, -7, -111, 39, -86, -42, 66, -40, -92, 43, -108, -11, 65, -34, -97, 41, -90, -29, 78, -48, -88, 38, -116, -55, 78, -17, -70, 39, -110, -19, 64, -20, -70, 43, -112, -15, 64, -53, -112, -13, 79, 14, -103, 67, 16, -17, -55, -61, 9, -109, -102, 66, 13, -103, 40, -39, -42, 76, -112, -102, 48, -42, -40, 124, -72, -103, 41, -51, -41, 86, -119, -107, 1, -32, -41, 110, -104, -101, 11, -38, -38, 119, -83, -107, 6, -61, -39, 85, -87, -101, 60, -62, -40, 93, -128, -101, 11, -30, -42, 97, -99, 64, -59, 4, 0, -7, 3, 92, 65, -32, -114, 42, -113, -30, -121, -109, -79, 96, -56, -14, 28, -97, -89, 107, -56, -12, 33, -110, -124, 100, -60, -17, 25, -112, -80, 106, -54, -26, 35, -111, -86, 103, -53, -12, 16, -110, -127, 110, -53, -3, 8, -98, -127, 114, -59, -60, 13}, new byte[]{124, -89, 118, 62, -49, 45});
        f994 = new C0325n8();
        C0341oa.m915(new byte[]{-32, 65, -68, 105, 72, 48, -54, 91, -79, 122, 89, 5, -48, 121, -22}, new byte[]{-87, 47, -40, 12, 48, 113});
    }

    /* JADX INFO: renamed from: ۥ */
    public static String m904() {
        JSONObject jSONObjectM905 = m905();
        String strOptString = jSONObjectM905 != null ? jSONObjectM905.optString(C0341oa.m915(new byte[]{120, 122, 45, -99, -20, -42}, new byte[]{10, 31, 73, -62, -123, -78})) : null;
        if (strOptString == null) {
            strOptString = "";
        }
        return strOptString.length() > 0 ? strOptString : "";
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static JSONObject m905() {
        String string;
        String string2;
        String str = "";
        if (f995 == null) {
            f995 = MMKV.mmkvWithID(C0341oa.m915(new byte[]{109, -91, -111, 21, 73, -20, 96, -83, -107, 85, 31, -3, 102, -71}, new byte[]{14, -54, -4, 59, 49, -123}), 2, "");
        }
        MMKV mmkv = f995;
        if (mmkv != null && (string = mmkv.getString(C0341oa.m915(new byte[]{1, -18, 6, 72, -2, -41, 25, -24, 32, 98, -23, -41, 24, -30, 17, 113, -11}, new byte[]{106, -117, 127, 23, -102, -78}), "")) != null && (string2 = C0432va.m1260(string).toString()) != null) {
            str = string2;
        }
        if (C0406ta.m942(str, C0341oa.m915(new byte[]{-11}, new byte[]{-114, 109, -35, -100, 59, -80}))) {
            return new JSONObject(str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m1158() {
        Context context = C0292l3.f937;
        if (context == null) {
            C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
            throw null;
        }
        if (context.getSharedPreferences(C0341oa.m915(new byte[]{-128, 32, 69, -25, 30, 83, -124, 17, 105, -22, 18, 83, -68, 62, 104, -28, 29}, new byte[]{-29, 78, 26, -127, 123, 61}), 0).getInt(C0341oa.m915(new byte[]{-88, 63, 124, -72, -1, -122, -96, 33, 83, -114, -30, -119, -84, 55, 83, -111, -67}, new byte[]{-55, 79, 12, -25, -116, -19}), 0) == 2) {
            return true;
        }
        Context context2 = C0292l3.f937;
        if (context2 == null) {
            C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
            throw null;
        }
        Object systemService = context2.getSystemService(C0341oa.m915(new byte[]{-19, 48, 57, 23, 27, -20}, new byte[]{-104, 89, 84, 120, 127, -119}));
        UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
        return uiModeManager != null && uiModeManager.getNightMode() == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static View m1159(XC_MethodHook.MethodHookParam methodHookParam) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-42, 126, -28, 47, -121, -110}, new byte[]{-22, 10, -116, 70, -12, -84}), methodHookParam);
        Object obj = methodHookParam.thisObject;
        C0237h4.m1089(C0341oa.m915(new byte[]{-39, -73, 21, 80, -121, -40, -57, -70, 31, 87}, new byte[]{-83, -33, 124, 35, -56, -70}), obj);
        Object objM926 = C0373r3.m926(obj, C0341oa.m915(new byte[]{-67, 127, 12, 28, -66, 99, -87, 127, 22, 56, -87, 116}, new byte[]{-38, 26, 120, 76, -52, 6}), new Object[0]);
        if (objM926 != null) {
            return (View) C0373r3.m927(objM926, C0341oa.m915(new byte[]{-105, -92, -109, -48, -87, 96, -121}, new byte[]{-16, -63, -25, -122, -64, 5}), new Object[0]);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1160(String str) {
        boolean z = true;
        if (str == null) {
            z = false;
        } else {
            if (!(str.length() > 0)) {
            }
        }
        if (z) {
            Activity activityM893 = C0292l3.m893();
            String str2 = C0283k8.f1632.f1598;
            C0237h4.m1089(C0341oa.m915(new byte[]{-97, 17, 84, -49, -124, -56, -76, 6, 118, -13, -107, -46, -112, 23, 87, -23, -122, -55, -91, 13, 96, -20, -125}, new byte[]{-47, 116, 35, -128, -16, -96}), str2);
            Intent intent = new Intent(activityM893, (Class<?>) C0373r3.m1199(str2, null, 3));
            intent.putExtra(C0341oa.m915(new byte[]{-31, 36, 79}, new byte[]{-108, 77, 43, 5, -8, -61}), str);
            activityM893.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static void m1161(Activity activity, InterfaceC0208f3 interfaceC0208f3) {
        int i = 3;
        C0341oa.m915(new byte[]{-35, 83, 32}, new byte[]{-68, 48, 84, 69, 72, 43});
        C0341oa.m915(new byte[]{-114, 63, 31, -107, -106, 10, -116, 48, 29}, new byte[]{-19, 83, 118, -10, -3, 72});
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(R.id.content);
        if (frameLayout != null) {
            C0286kb c0286kb = AbstractC0356q.f1031;
            AbstractC0356q.c.m921().postDelayed(new RunnableC0154b5(frameLayout, activity, interfaceC0208f3, i), 100L);
        }
    }
}
