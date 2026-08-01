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
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7017 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17361 = AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵呜呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜呜呜呜~喵呜喵喵呜喵呜喵"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m12160(Throwable th) {
        String strM14532;
        StringBuilder sb = new StringBuilder(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(m12166());
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(827));
        sb.append(AbstractC7187.f17854);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(828));
        sb.append(AbstractC9234.m14532("喵呜喵喵喵喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵喵呜呜喵喵~喵呜喵喵喵呜呜喵~喵呜喵呜喵呜呜喵"));
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(829));
        try {
            Field field = XposedBridge.class.getField(AbstractC9234.m14532("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜呜喵呜"));
            field.setAccessible(true);
            strM14532 = (String) field.get(null);
        } catch (Exception unused) {
            strM14532 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜喵呜喵喵喵喵~呜喵喵喵呜呜呜呜~呜呜呜呜呜喵呜喵~呜呜喵喵呜喵喵呜");
        }
        sb.append(strM14532);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(830));
        sb.append(Build.BRAND);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(831));
        sb.append(Build.VERSION.RELEASE);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(832));
        sb.append(Build.VERSION.SDK_INT);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(833));
        sb.append(Build.DEVICE);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC9234.m14531(834));
        sb.append(Build.MODEL);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb.append(Log.getStackTraceString(th));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12161(Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append(exc);
        sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            if (!stackTraceElement.getClassName().equals(AbstractC7017.class.getName())) {
                sb.append(stackTraceElement);
                sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m12162(String str) {
        try {
            AbstractC7390.m12610(f17361, Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC9234.m14531(824));
            AbstractC7014.m12151(str + AbstractC9234.m14531(825) + Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC9234.m14531(824));
        } catch (Exception unused) {
            AbstractC7014.m12151(AbstractC9234.m14531(826));
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
            sbM700.append(AbstractC9234.m14531(823));
            sbM700.append(File.separator);
            string = sbM700.toString();
        } else {
            StringBuilder sbM7002 = AbstractC0900.m700(str3);
            sbM7002.append(AbstractC9234.m14532("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜"));
            sbM7002.append(File.separator);
            string = sbM7002.toString();
        }
        sb.append(string);
        sb.append(str);
        sb.append(AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵喵喵喵呜喵~喵喵喵呜呜呜喵喵"));
        String string2 = sb.toString();
        StringBuilder sb2 = new StringBuilder(m12166());
        sb2.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        sb2.append(str2);
        if (obj instanceof Exception) {
            sb2.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
            sb2.append(m12161((Exception) obj));
        }
        sb2.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜~喵呜呜呜呜呜呜呜"));
        AbstractC5894.m10615(string2, sb2.toString(), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12165(Exception exc) {
        m12164(AbstractC9234.m14531(835), exc.toString(), exc, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m12166() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC9234.m14531(836));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(AbstractC9234.m14532("喵喵呜呜喵呜呜喵"), Locale.CHINA);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(AbstractC9234.m14531(837));
        Calendar calendar = Calendar.getInstance();
        String strReplace = simpleDateFormat.format(calendar.getTime());
        String strReplace2 = simpleDateFormat2.format(calendar.getTime());
        String str = simpleDateFormat3.format(calendar.getTime());
        if (strReplace.contains(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵~喵呜喵呜呜喵喵喵"))) {
            strReplace = strReplace.replace(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵~喵呜喵呜呜喵喵喵"), AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵"));
        }
        if (strReplace.contains(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜喵喵呜喵~喵呜喵呜呜喵喵喵"))) {
            strReplace = strReplace.replace(AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜喵喵呜喵~喵呜喵呜呜喵喵喵"), AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜喵喵呜喵"));
        }
        if (strReplace2.contains(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜喵喵呜喵喵~呜呜喵呜喵喵呜喵"))) {
            strReplace2 = strReplace2.replace(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜喵喵呜喵喵~呜呜喵呜喵喵呜喵"), AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜呜喵呜~呜呜呜喵喵呜喵呜~呜喵喵喵呜呜呜喵~呜呜呜呜呜喵喵呜~呜呜呜呜喵喵呜呜"));
        }
        return strReplace + strReplace2 + str;
    }
}
