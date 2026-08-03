package p001;

import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: renamed from: ۟.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0330o {

    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ int f1000 = 0;

    /* JADX INFO: renamed from: ۟.o$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0236h3<String, View, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ TextView f1001;

        public a(TextView textView) {
            this.f1001 = textView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0236h3
        /* JADX INFO: renamed from: ۥ۟ */
        public final C0433vb mo863(String str, View view) {
            String str2 = str;
            C0237h4.m1090(C0341oa.m915(new byte[]{14}, new byte[]{122, -53, 98, -35, -14, 14}), str2);
            C0237h4.m1090(C0341oa.m915(new byte[]{-37, 112, -103, -34, -28, 71, -118, 126, -126, -62, -86, 78, -122, 99, -106, -36, -17, 74, -126, 99, -41, -128, -76}, new byte[]{-25, 17, -9, -79, -118, 62}), view);
            TextView textView = this.f1001;
            int i = C0330o.f1000;
            C0330o.m910(str2);
            textView.setHighlightColor(0);
            return C0433vb.f1163;
        }
    }

    static {
        C0341oa.m915(new byte[]{-56, -69, 1, 95, -29, 30, -42, -74, 90, 6, -29, 15, -43}, new byte[]{-91, -34, 47, 40, -122, 119});
        C0341oa.m915(new byte[]{3, 98, -14, 11, -50, -39, 28, 127, -26, 64, -58, -124, 1, 113, -5, 68, -59, -49, 30}, new byte[]{108, 16, -107, 37, -94, -86});
        C0341oa.m915(new byte[]{-99, -49, 42, -107, -11, -116, -99, -54, 46, -38, -20, -57, -105, -39, 53, -53, -9, -102, -105, -39, 99, -42, -7, -121, -109, -38, 40, -55}, new byte[]{-14, -67, 77, -69, -104, -23});
        C0341oa.m915(new byte[]{-108, 9, -114, -34, 98, 118, -112, 72, -101, -128, 111, 112, -110, 2}, new byte[]{-9, 102, -29, -16, 0, 3});
    }

    /* JADX DEBUG: Class process forced to load method for inline: ۟.va.ۥۡۢ(java.lang.CharSequence, java.lang.String, int, boolean, int):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public static void m910(String str) {
        String strSubstring;
        String strM915;
        C0237h4.m1090(C0341oa.m915(new byte[]{-8, -52, 116}, new byte[]{-115, -66, 24, -31, -60, 10}), str);
        if (!C0406ta.m1245(str)) {
            if (C0432va.m1253(str, C0341oa.m915(new byte[]{78}, new byte[]{116, 54, 106, 23, -101, 124}))) {
                strSubstring = str.substring(C0432va.m1256(str, C0341oa.m915(new byte[]{97}, new byte[]{91, 0, 57, -88, 2, -74}), 0, false, 6) + 1);
                C0237h4.m1089(C0341oa.m915(new byte[]{78, -84, 79, 91, -126, -70, 84, -73, 74, 0, -40, -26, 19, -16}, new byte[]{61, -39, 45, 40, -10, -56}), strSubstring);
            } else {
                strSubstring = "";
            }
            if (C0406ta.m942(str, C0341oa.m915(new byte[]{-28, -64, 111, -115}, new byte[]{-107, -79, 8, -73, -64, 70}))) {
                m1167(strSubstring);
                return;
            }
            if (C0406ta.m942(str, C0341oa.m915(new byte[]{-25, 44, -42}, new byte[]{-106, 93, -20, 103, -78, 57}))) {
                C0341oa.m915(new byte[]{-54, -59, 36, -99, 41}, new byte[]{-69, -76, 106, -24, 68, -56});
                try {
                    C0292l3.m893().startActivity(new Intent(C0341oa.m915(new byte[]{-88, -69, 6, -36, 120, -65, -83, -5, 11, -64, 99, -77, -89, -95, 76, -49, 116, -94, -96, -70, 12, -128, 65, -97, -116, -126}, new byte[]{-55, -43, 98, -82, 23, -42}), Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + strSubstring)));
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (C0406ta.m942(str, C0341oa.m915(new byte[]{3, 118, 44, -43, 90}, new byte[]{96, 25, 92, -84, 96, -115}))) {
                m911(strSubstring);
                strM915 = C0341oa.m915(new byte[]{-53, 65, 58, 114, 0, 20, -53, 126, 62, 114, 44, 41, -55, 68, 16, 127, 16, 45, -56, 107, 55}, new byte[]{46, -10, -120, -105, -92, -103});
            } else {
                if (C0406ta.m942(str, C0341oa.m915(new byte[]{-35, -65, -27, -5, 55, -86}, new byte[]{-87, -48, -124, -120, 67, -112}))) {
                    m1173(0, strSubstring);
                    return;
                }
                if (C0406ta.m942(str, C0341oa.m915(new byte[]{-4, -52, -114}, new byte[]{-111, -68, -76, 82, -57, 81}))) {
                    m911(strSubstring);
                    m1173(1, C0341oa.m915(new byte[]{-22, -112, -32, -78, -9, 79, -22, -81, -28, -78, -42, 110, -21, -101, -59, -78, -36, 117, -32, -101, -34, -65, -4, 117, -22, -81, -30, -78, -19, 108, -21, -104, -13, -65, -20, 89, -25, -122, -34, -80, -31, 90, -25, -109, -26, -79, -61, 94, -24, -109, -16, -78, -42, 110, -21, -101, -59, -78, -36, 117}, new byte[]{15, 39, 82, 87, 83, -62}));
                    return;
                } else {
                    if (C0432va.m1253(str, C0341oa.m915(new byte[]{127, -47, 73}, new byte[]{69, -2, 102, 67, 53, -98})) || C0432va.m1253(str, C0341oa.m915(new byte[]{126, -125, -44, 28}, new byte[]{22, -9, -96, 108, 91, 62}))) {
                        m1170(str);
                        return;
                    }
                    strM915 = "处理url失败:" + str;
                }
            }
            m1173(0, strM915);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m911(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{116, 127, 15, -21, 118, -73}, new byte[]{72, 11, 103, -126, 5, -119}), str);
        ClipData clipDataNewPlainText = ClipData.newPlainText(C0341oa.m915(new byte[]{-46, 103, 58, 1, -33, 89, -56, 96, 54, 65, -56, 28, -45, 105, 36, 74, -44, 66, -39, 109, 59, 95, -55, 64}, new byte[]{-79, 8, 87, 47, -84, 50}), str);
        Context context = C0292l3.f937;
        if (context == null) {
            C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
            throw null;
        }
        Object systemService = context.getSystemService(C0341oa.m915(new byte[]{112, -65, 0, 87, 86, -11, 114, -95, 13}, new byte[]{19, -45, 105, 39, 52, -102}));
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Intent m1164(String str) {
        C0341oa.m915(new byte[]{98, 38, 57, 2, -28, 109, 119, 9, 59, 4, -32}, new byte[]{18, 71, 90, 105, -123, 10});
        Intent intentAddFlags = new Intent(C0341oa.m915(new byte[]{33, 124, 20, 7, 43, -74, 36, 60, 3, 16, 48, -85, 41, 124, 23, 6, 106, -98, 16, 66, 60, 60, 7, -98, 20, 91, 63, 59, 27, -101, 5, 70, 49, 60, 8, -116, 31, 65, 53, 33, 16, -106, 14, 85, 35}, new byte[]{64, 18, 112, 117, 68, -33})).setData(Uri.parse("package:" + str)).addFlags(268435456);
        C0237h4.m1089(C0341oa.m915(new byte[]{-83, 6, -71, 61, 60, 41, -85, 17, -11, 85, 126, 102, -27}, new byte[]{-52, 98, -35, 123, 80, 72}), intentAddFlags);
        return intentAddFlags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static String m1165(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{75, -59, 0, -46}, new byte[]{63, -96, 120, -90, -99, 82}), str);
        if (str.length() == 0) {
            return "";
        }
        List<String> listM1106 = C0272jb.m1106(C0341oa.m915(new byte[]{-19}, new byte[]{-79, -12, -119, -90, 39, 105}), C0341oa.m915(new byte[]{21}, new byte[]{61, 79, 87, 6, -80, 29}), C0341oa.m915(new byte[]{-90}, new byte[]{-3, -107, -79, 118, 3, -76}), C0341oa.m915(new byte[]{0}, new byte[]{123, -53, 56, 12, -116, 16}), C0341oa.m915(new byte[]{-66}, new byte[]{-61, 112, 38, 78, 98, 38}), C0341oa.m915(new byte[]{-126}, new byte[]{-33, 120, 95, 98, -81, 88}), C0341oa.m915(new byte[]{37}, new byte[]{12, 109, -14, -6, 64, -119}), C0341oa.m915(new byte[]{-45}, new byte[]{-115, -11, -104, 63, 81, 87}), C0341oa.m915(new byte[]{-58}, new byte[]{-21, -97, -99, -21, 77, -7}), C0341oa.m915(new byte[]{63}, new byte[]{27, -75, 89, 68, -116, -85}), C0341oa.m915(new byte[]{-125}, new byte[]{-1, 49, 84, -73, 52, 118}), C0341oa.m915(new byte[]{21}, new byte[]{42, -81, -105, -60, 107, 61}), C0341oa.m915(new byte[]{106}, new byte[]{64, -82, -74, 111, 21, 95}), C0341oa.m915(new byte[]{122}, new byte[]{81, 91, 27, 127, 8, 25}), C0341oa.m915(new byte[]{93}, new byte[]{115, 84, 120, 103, -53, -98}));
        ArrayList arrayList = new ArrayList();
        for (String strM1247 : C0432va.m1259(str, new String[]{C0341oa.m915(new byte[]{59}, new byte[]{71, -34, -88, -46, 19, -6})})) {
            try {
                C0237h4.m1090("pattern", strM1247);
                C0237h4.m1089("compile(...)", Pattern.compile(strM1247));
                arrayList.add(strM1247);
            } catch (Exception unused) {
                for (String str2 : listM1106) {
                    strM1247 = C0406ta.m1247(strM1247, str2, "\\" + str2);
                }
                arrayList.add(strM1247);
            }
        }
        return C0331o0.m1177(arrayList, C0341oa.m915(new byte[]{-119}, new byte[]{-11, -79, -73, -117, -103, -9}), null, null, null, 62);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static boolean m1166(JSONArray jSONArray) {
        return jSONArray != null && jSONArray.length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static void m1167(String str) {
        C0341oa.m915(new byte[]{-69, 90, -61}, new byte[]{-48, 63, -70, 65, -51, -103});
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26jump_from%3Dwebapi%26k%3D" + str));
        try {
            m1173(0, C0341oa.m915(new byte[]{72, 116, -21, -56, -120, 13, -15, -110, -65, -98, -111}, new byte[]{-96, -61, 88, 32, 53, -95}));
            Context context = C0292l3.f937;
            if (context != null) {
                context.startActivity(intent);
            } else {
                C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
                throw null;
            }
        } catch (Exception e) {
            m1173(0, "跳转QQ群失败:" + e.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static void m1168() {
        Context context = C0292l3.f937;
        if (context == null) {
            C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
            throw null;
        }
        Object systemService = context.getSystemService(C0341oa.m915(new byte[]{52, 36, -3, -113, -104, -68, 33, 62}, new byte[]{85, 71, -119, -26, -18, -43}));
        C0237h4.m1088(C0341oa.m915(new byte[]{-91, -112, -19, 10, 48, 93, -86, -117, -17, 9, 100, 30, -87, -128, -95, 5, 113, 77, -65, -59, -11, 9, 48, 80, -92, -117, -84, 8, 101, 82, -89, -59, -11, 31, 96, 91, -21, -124, -17, 2, 98, 81, -94, -127, -81, 7, 96, 78, -27, -92, -30, 18, 121, 72, -94, -111, -8, 43, 113, 80, -86, -126, -28, 20}, new byte[]{-53, -27, -127, 102, 16, 62}), systemService);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        C0237h4.m1089(C0341oa.m915(new byte[]{75, 25, -47, -27, -49, -56, 66, 21, -53, -48, -5, -42, 92, 44, -41, -40, -39, -61, 95, 15, -64, -60, -110, -120, 2, 82, -116}, new byte[]{44, 124, -91, -73, -70, -90}), runningAppProcesses);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid != Process.myPid()) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static int m1169(JSONArray jSONArray) {
        C0237h4.m1090(C0341oa.m915(new byte[]{-15, 86, -118, 27, -72, -61}, new byte[]{-51, 34, -30, 114, -53, -3}), jSONArray);
        return jSONArray.length() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static void m1170(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{99, 23, 112}, new byte[]{22, 101, 28, -116, -51, -105}), str);
        try {
            Context context = C0292l3.f937;
            if (context == null) {
                C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
                throw null;
            }
            Intent intent = new Intent(C0341oa.m915(new byte[]{55, -123, 13, -50, -33, 18, 50, -59, 0, -46, -60, 30, 56, -97, 71, -35, -45, 15, 63, -124, 7, -110, -26, 50, 19, -68}, new byte[]{86, -21, 105, -68, -80, 123}), Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
            m1173(0, C0341oa.m915(new byte[]{-58, 40, 75, 45, 92, 42, -55, 50, 102, 46, 110, 15, -59, 5, 105, 32, 84, 15}, new byte[]{32, -95, -40, -56, -32, -86}));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static void m1171(boolean z) {
        String str;
        String packageName = C0292l3.m1138().getPackageName();
        C0237h4.m1089(C0341oa.m915(new byte[]{24, -25, -96, 123, -118, -115, 20, -29, -77, 78, -91, -113, 18, -25, -4, 5, -59, -64, 86}, new byte[]{127, -126, -44, 43, -21, -18}), packageName);
        C0341oa.m915(new byte[]{54, -76, 91, 9, -18, 19, 35}, new byte[]{70, -33, 60, 71, -113, 126});
        C0341oa.m915(new byte[]{-43, 4, 116}, new byte[]{-91, 111, 19, -88, 26, -51});
        Intent intentAddFlags = null;
        Intent intent = new Intent(C0341oa.m915(new byte[]{-43, -55, 7, 86, 77, 48, -48, -119, 10, 74, 86, 60, -38, -45, 77, 69, 65, 45, -35, -56, 13, 10, 111, 24, -3, -23}, new byte[]{-76, -89, 99, 36, 34, 89}), (Uri) null);
        intent.addCategory(C0341oa.m915(new byte[]{-72, 84, -22, 0, -14, 39, -67, 20, -25, 28, -23, 43, -73, 78, -96, 17, -4, 58, -68, 93, -31, 0, -28, 96, -107, 123, -37, 60, -34, 6, -100, 104}, new byte[]{-39, 58, -114, 114, -99, 78}));
        intent.setPackage(packageName);
        Context context = C0292l3.f937;
        if (context == null) {
            C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
            throw null;
        }
        PackageManager packageManager = context.getPackageManager();
        C0237h4.m1089(C0341oa.m915(new byte[]{-50, 60, 35, 41, 68, -126, -62, 56, 48, 28, 104, -128, -57, 56, 48, 28, 87, -55, -121, 119, 121, 80}, new byte[]{-87, 89, 87, 121, 37, -31}), packageManager);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        C0237h4.m1089(C0341oa.m915(new byte[]{-7, -98, 65, 12, 88, 46, -26, -97, 65, 16, 85, 38, -21, -97, 77, 8, 72, 19, -31, -114, 87, 86, 15, 73, -90, -62}, new byte[]{-120, -21, 36, 126, 33, 103}), listQueryIntentActivities);
        if (listQueryIntentActivities.size() == 0) {
            str = "";
        } else {
            str = listQueryIntentActivities.get(0).activityInfo.name;
            C0237h4.m1089(C0341oa.m915(new byte[]{-53, 116, -82, -102}, new byte[]{-91, 21, -61, -1, -44, -67}), str);
        }
        if (!(str.length() == 0)) {
            Intent intent2 = new Intent(C0341oa.m915(new byte[]{125, 68, -80, -128, 78, 77, 120, 4, -67, -100, 85, 65, 114, 94, -6, -109, 66, 80, 117, 69, -70, -36, 108, 101, 85, 100}, new byte[]{28, 42, -44, -14, 33, 36}));
            intent2.addCategory(C0341oa.m915(new byte[]{-2, 75, 114, -15, -68, -127, -5, 11, 127, -19, -89, -115, -15, 81, 56, -32, -78, -100, -6, 66, 121, -15, -86, -58, -45, 100, 67, -51, -112, -96, -38, 119}, new byte[]{-97, 37, 22, -125, -45, -24}));
            intent2.setClassName(packageName, str);
            intentAddFlags = intent2.addFlags(268435456);
        }
        if (intentAddFlags == null) {
            m1173(0, C0341oa.m915(new byte[]{78, -110, -69, 16, 32, -24, -61, 68, 117, -110, -25, 38, -56, 64, 67, -100, -55, 17, -62, 108, 96, 20, 62, -20, -62, 88, 126, -99, -6, 57}, new byte[]{39, -4, -49, 117, 78, -100}));
            return;
        }
        intentAddFlags.addFlags(335577088);
        C0292l3.m1138().startActivity(intentAddFlags);
        if (z) {
            m1168();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public static void m1172(TextView textView) {
        C0341oa.m915(new byte[]{95, -50, 43, -31, 71, -12}, new byte[]{99, -70, 67, -120, 52, -54});
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (textView.getText() instanceof Spannable) {
            CharSequence text = textView.getText();
            C0237h4.m1088(C0341oa.m915(new byte[]{-8, -37, -35, -39, 43, -25, -9, -64, -33, -38, 127, -92, -12, -53, -111, -42, 106, -9, -30, -114, -59, -38, 43, -22, -7, -64, -100, -37, 126, -24, -6, -114, -59, -52, 123, -31, -74, -49, -33, -47, 121, -21, -1, -54, -97, -63, 110, -4, -30, -128, -30, -59, 106, -22, -8, -49, -45, -39, 110}, new byte[]{-106, -82, -79, -75, 11, -124}), text);
            Spannable spannable = (Spannable) text;
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, textView.getText().length(), URLSpan.class);
            C0237h4.m865(uRLSpanArr);
            if (uRLSpanArr.length == 0) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
            spannableStringBuilder.clearSpans();
            for (URLSpan uRLSpan : uRLSpanArr) {
                String url = uRLSpan.getURL();
                C0237h4.m1089(C0341oa.m915(new byte[]{-51, 80, 10, -36, 43, 69, -126, 27, 80, -89, 80}, new byte[]{-86, 53, 126, -119, 121, 9}), url);
                spannableStringBuilder.setSpan(new C0290l1(url, new a(textView)), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 33);
            }
            textView.setText(spannableStringBuilder);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static void m1173(int i, String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{68, -71, -64, -5, 55, -105}, new byte[]{120, -51, -88, -110, 68, -87}), str);
        if (C0406ta.m1245(str)) {
            return;
        }
        if (!C0237h4.m864(Looper.getMainLooper(), Looper.myLooper())) {
            C0292l3.m1141(new C0343p(str, i));
            return;
        }
        Context context = C0292l3.f937;
        if (context != null) {
            Toast.makeText(context, str, i).show();
        } else {
            C0237h4.m1092(C0341oa.m915(new byte[]{-121, -105, 15, -3, -9, 78, -112}, new byte[]{-28, -8, 97, -119, -110, 54}));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static String m1174(String str, String str2) {
        C0341oa.m915(new byte[]{-94, 64, 110, 30, 98, -29}, new byte[]{-98, 52, 6, 119, 17, -35});
        C0341oa.m915(new byte[]{-78, -118, 86, 76, 15}, new byte[]{-47, -27, 58, 35, 125, 125});
        return "<font color='" + str2 + "'>" + str + "</font>";
    }

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public static Spanned m1175(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{2, 71, 5, -56, -54, 6}, new byte[]{62, 51, 109, -95, -71, 56}), str);
        Spanned spannedFromHtml = Html.fromHtml(str);
        C0237h4.m1089(C0341oa.m915(new byte[]{-48, -96, 126, 55, -126, -52, -37, -66, 57, 116, -28, -106, -97}, new byte[]{-74, -46, 17, 90, -54, -72}), spannedFromHtml);
        return spannedFromHtml;
    }
}
