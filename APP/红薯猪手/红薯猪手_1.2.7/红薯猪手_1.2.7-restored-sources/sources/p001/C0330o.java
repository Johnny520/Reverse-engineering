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
            C0237h4.m1090("t", str2);
            C0237h4.m1090("<anonymous parameter 1>", view);
            TextView textView = this.f1001;
            int i = C0330o.f1000;
            C0330o.m910(str2);
            textView.setHighlightColor(0);
            return C0433vb.f1163;
        }
    }

    static {
        "me.weishu.exp";
        "org.lsposed.manager";
        "org.meowcat.edxposed.manager";
        "com.bug.xposed";
    }

    /* JADX DEBUG: Class process forced to load method for inline: ۟.va.ۥۡۢ(java.lang.CharSequence, java.lang.String, int, boolean, int):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public static void m910(String str) {
        String strSubstring;
        String strM915;
        C0237h4.m1090("url", str);
        if (!C0406ta.m1245(str)) {
            if (C0432va.m1253(str, ":")) {
                strSubstring = str.substring(C0432va.m1256(str, ":", 0, false, 6) + 1);
                C0237h4.m1089("substring(...)", strSubstring);
            } else {
                strSubstring = "";
            }
            if (C0406ta.m942(str, "qqg:")) {
                m1167(strSubstring);
                return;
            }
            if (C0406ta.m942(str, "qq:")) {
                "qqNum";
                try {
                    C0292l3.m893().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + strSubstring)));
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if (C0406ta.m942(str, "copy:")) {
                m911(strSubstring);
                strM915 = "已复制到粘贴板";
            } else {
                if (C0406ta.m942(str, "toast:")) {
                    m1173(0, strSubstring);
                    return;
                }
                if (C0406ta.m942(str, "mp:")) {
                    m911(strSubstring);
                    m1173(1, "已复制公众号，请到微信进行粘贴搜索公众号");
                    return;
                } else {
                    if (C0432va.m1253(str, "://") || C0432va.m1253(str, "http")) {
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
        C0237h4.m1090("<this>", str);
        ClipData clipDataNewPlainText = ClipData.newPlainText("com.skyhand.basexphelper", str);
        Context context = C0292l3.f937;
        if (context == null) {
            C0237h4.m1092("context");
            throw null;
        }
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Intent m1164(String str) {
        "packageName";
        Intent intentAddFlags = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.parse("package:" + str)).addFlags(268435456);
        C0237h4.m1089("addFlags(...)", intentAddFlags);
        return intentAddFlags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static String m1165(String str) {
        C0237h4.m1090("text", str);
        if (str.length() == 0) {
            return "";
        }
        List<String> listM1106 = C0272jb.m1106("\\\", "(", "[", "{", "}", "]", ")", "^", "-", "$", "|", "?", "*", "+", ".");
        ArrayList arrayList = new ArrayList();
        for (String strM1247 : C0432va.m1259(str, new String[]{"|"})) {
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
        return C0331o0.m1177(arrayList, "|", null, null, null, 62);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static boolean m1166(JSONArray jSONArray) {
        return jSONArray != null && jSONArray.length() > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static void m1167(String str) {
        "key";
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setData(Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26jump_from%3Dwebapi%26k%3D" + str));
        try {
            m1173(0, "跳转QQ群");
            Context context = C0292l3.f937;
            if (context != null) {
                context.startActivity(intent);
            } else {
                C0237h4.m1092("context");
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
            C0237h4.m1092("context");
            throw null;
        }
        Object systemService = context.getSystemService("activity");
        C0237h4.m1088("null cannot be cast to non-null type android.app.ActivityManager", systemService);
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        C0237h4.m1089("getRunningAppProcesses(...)", runningAppProcesses);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid != Process.myPid()) {
                Process.killProcess(runningAppProcessInfo.pid);
            }
        }
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static int m1169(JSONArray jSONArray) {
        C0237h4.m1090("<this>", jSONArray);
        return jSONArray.length() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static void m1170(String str) {
        C0237h4.m1090("url", str);
        try {
            Context context = C0292l3.f937;
            if (context == null) {
                C0237h4.m1092("context");
                throw null;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
            m1173(0, "打开链接失败");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static void m1171(boolean z) {
        String str;
        String packageName = C0292l3.m1138().getPackageName();
        C0237h4.m1089("getPackageName(...)", packageName);
        "pkgName";
        "pkg";
        Intent intentAddFlags = null;
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(packageName);
        Context context = C0292l3.f937;
        if (context == null) {
            C0237h4.m1092("context");
            throw null;
        }
        PackageManager packageManager = context.getPackageManager();
        C0237h4.m1089("getPackageManager(...)", packageManager);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        C0237h4.m1089("queryIntentActivities(...)", listQueryIntentActivities);
        if (listQueryIntentActivities.size() == 0) {
            str = "";
        } else {
            str = listQueryIntentActivities.get(0).activityInfo.name;
            C0237h4.m1089("name", str);
        }
        if (!(str.length() == 0)) {
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.addCategory("android.intent.category.LAUNCHER");
            intent2.setClassName(packageName, str);
            intentAddFlags = intent2.addFlags(268435456);
        }
        if (intentAddFlags == null) {
            m1173(0, "intent为空，重启app失败");
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
        "<this>";
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (textView.getText() instanceof Spannable) {
            CharSequence text = textView.getText();
            C0237h4.m1088("null cannot be cast to non-null type android.text.Spannable", text);
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
                C0237h4.m1089("getURL(...)", url);
                spannableStringBuilder.setSpan(new C0290l1(url, new a(textView)), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 33);
            }
            textView.setText(spannableStringBuilder);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static void m1173(int i, String str) {
        C0237h4.m1090("<this>", str);
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
            C0237h4.m1092("context");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static String m1174(String str, String str2) {
        "<this>";
        "color";
        return "<font color='" + str2 + "'>" + str + "</font>";
    }

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public static Spanned m1175(String str) {
        C0237h4.m1090("<this>", str);
        Spanned spannedFromHtml = Html.fromHtml(str);
        C0237h4.m1089("fromHtml(...)", spannedFromHtml);
        return spannedFromHtml;
    }
}
