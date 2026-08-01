package p026;

import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.activity.AbstractC0900;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p052.AbstractC7187;
import p069.AbstractC7390;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7017 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17361 = AbstractC4765.m8874().concat("/Log/");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m12160(Throwable th) {
        String strM14532;
        StringBuilder sb = new StringBuilder("\n");
        sb.append(m12166());
        sb.append("\n");
        sb.append("QQVersion:");
        sb.append(AbstractC7187.f17854);
        sb.append("\n");
        sb.append("QStoryVersion:");
        sb.append("2.6.3");
        sb.append("\n");
        sb.append("XPosedTag:");
        try {
            Field field = XposedBridge.class.getField("TAG");
            field.setAccessible(true);
            strM14532 = (String) field.get(null);
        } catch (Exception unused) {
            strM14532 = "未知";
        }
        sb.append(strM14532);
        sb.append("\n");
        sb.append("DeviceBrand:");
        sb.append(Build.BRAND);
        sb.append("\n");
        sb.append("AndroidVersion:");
        sb.append(Build.VERSION.RELEASE);
        sb.append("\n");
        sb.append("AndroidSDK:");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("\n");
        sb.append("DeviceName:");
        sb.append(Build.DEVICE);
        sb.append("\n");
        sb.append("SystemModel:");
        sb.append(Build.MODEL);
        sb.append("\n");
        sb.append(Log.getStackTraceString(th));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12161(Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append(exc);
        sb.append("\n");
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            if (!stackTraceElement.getClassName().equals(AbstractC7017.class.getName())) {
                sb.append(stackTraceElement);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m12162(String str) {
        try {
            AbstractC7390.m12610(f17361, Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/ModuleLog.zip");
            AbstractC7014.m12151(str + " 已输出文件到" + Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/ModuleLog.zip");
        } catch (Exception unused) {
            AbstractC7014.m12151("打包异常文件夹失败");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m12163(Object obj, String str) {
        m12164(str, String.valueOf(obj), obj, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12164(String str, String str2, Object obj, boolean z) {
        String string;
        StringBuilder sb = new StringBuilder();
        String str3 = f17361;
        if (z) {
            StringBuilder sbM700 = AbstractC0900.m700(str3);
            sbM700.append("ErrorLog");
            sbM700.append(File.separator);
            string = sbM700.toString();
        } else {
            StringBuilder sbM7002 = AbstractC0900.m700(str3);
            sbM7002.append("RunLog");
            sbM7002.append(File.separator);
            string = sbM7002.toString();
        }
        sb.append(string);
        sb.append(str);
        sb.append(".txt");
        String string2 = sb.toString();
        StringBuilder sb2 = new StringBuilder(m12166());
        sb2.append("\n");
        sb2.append(str2);
        if (obj instanceof Exception) {
            sb2.append("\n");
            sb2.append(m12161((Exception) obj));
        }
        sb2.append("\n\n");
        AbstractC5894.m10615(string2, sb2.toString(), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12165(Exception exc) {
        m12164("Error Log", exc.toString(), exc, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m12166() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("E", Locale.CHINA);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String strReplace = simpleDateFormat.format(calendar.getTime());
        String strReplace2 = simpleDateFormat2.format(calendar.getTime());
        String str = simpleDateFormat3.format(calendar.getTime());
        if (strReplace.contains("年0")) {
            strReplace = strReplace.replace("年0", "年");
        }
        if (strReplace.contains("月0")) {
            strReplace = strReplace.replace("月0", "月");
        }
        if (strReplace2.contains("周")) {
            strReplace2 = strReplace2.replace("周", "星期");
        }
        return strReplace + strReplace2 + str;
    }
}
