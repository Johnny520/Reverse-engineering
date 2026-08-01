package p010;

import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.activity.AbstractC0053;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p036.AbstractC6358;
import p053.AbstractC6561;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17016 = AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜呜呜呜~喵呜喵喵呜喵呜喵"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m11601(Throwable th) {
        String strM13973;
        StringBuilder sb = new StringBuilder(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(m11607());
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(827));
        sb.append(AbstractC6358.f17509);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(828));
        sb.append(AbstractC8405.m13973("喵呜喵喵喵喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵喵呜呜喵喵~喵呜喵喵喵呜呜喵~喵呜喵呜喵呜呜喵"));
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(829));
        try {
            Field field = XposedBridge.class.getField(AbstractC8405.m13973("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜呜喵呜"));
            field.setAccessible(true);
            strM13973 = (String) field.get(null);
        } catch (Exception unused) {
            strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜喵呜喵喵喵喵~呜喵喵喵呜呜呜呜~呜呜呜呜呜喵呜喵~呜呜喵喵呜喵喵呜");
        }
        sb.append(strM13973);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(830));
        sb.append(Build.BRAND);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(831));
        sb.append(Build.VERSION.RELEASE);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(832));
        sb.append(Build.VERSION.SDK_INT);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(833));
        sb.append(Build.DEVICE);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(AbstractC8405.m13972(834));
        sb.append(Build.MODEL);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb.append(Log.getStackTraceString(th));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m11602(Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append(exc);
        sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            if (!stackTraceElement.getClassName().equals(AbstractC6188.class.getName())) {
                sb.append(stackTraceElement);
                sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11603(String str) {
        try {
            AbstractC6561.m12051(f17016, Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC8405.m13972(824));
            AbstractC6185.m11592(str + AbstractC8405.m13972(825) + Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC8405.m13972(824));
        } catch (Exception unused) {
            AbstractC6185.m11592(AbstractC8405.m13972(826));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11604(Object obj, String str) {
        m11605(str, String.valueOf(obj), obj, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11605(String str, String str2, Object obj, boolean z) {
        String string;
        StringBuilder sb = new StringBuilder();
        String str3 = f17016;
        if (z) {
            StringBuilder sbM140 = AbstractC0053.m140(str3);
            sbM140.append(AbstractC8405.m13972(823));
            sbM140.append(File.separator);
            string = sbM140.toString();
        } else {
            StringBuilder sbM1402 = AbstractC0053.m140(str3);
            sbM1402.append(AbstractC8405.m13973("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵呜喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜"));
            sbM1402.append(File.separator);
            string = sbM1402.toString();
        }
        sb.append(string);
        sb.append(str);
        sb.append(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵喵喵喵呜喵~喵喵喵呜呜呜喵喵"));
        String string2 = sb.toString();
        StringBuilder sb2 = new StringBuilder(m11607());
        sb2.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        sb2.append(str2);
        if (obj instanceof Exception) {
            sb2.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
            sb2.append(m11602((Exception) obj));
        }
        sb2.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜~喵呜呜呜呜呜呜呜"));
        AbstractC5062.m10056(string2, sb2.toString(), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11606(Exception exc) {
        m11605(AbstractC8405.m13972(835), exc.toString(), exc, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m11607() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC8405.m13972(836));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(AbstractC8405.m13973("喵喵呜呜喵呜呜喵"), Locale.CHINA);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(AbstractC8405.m13972(837));
        Calendar calendar = Calendar.getInstance();
        String strReplace = simpleDateFormat.format(calendar.getTime());
        String strReplace2 = simpleDateFormat2.format(calendar.getTime());
        String str = simpleDateFormat3.format(calendar.getTime());
        if (strReplace.contains(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵~喵呜喵呜呜喵喵喵"))) {
            strReplace = strReplace.replace(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵~喵呜喵呜呜喵喵喵"), AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜喵喵呜呜喵喵~呜呜喵喵呜呜呜喵"));
        }
        if (strReplace.contains(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜喵喵呜喵~喵呜喵呜呜喵喵喵"))) {
            strReplace = strReplace.replace(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜喵喵呜喵~喵呜喵呜呜喵喵喵"), AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜呜呜喵喵呜喵"));
        }
        if (strReplace2.contains(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜喵喵呜喵喵~呜呜喵呜喵喵呜喵"))) {
            strReplace2 = strReplace2.replace(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜喵喵呜喵喵~呜呜喵呜喵喵呜喵"), AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜呜喵呜~呜呜呜喵喵呜喵呜~呜喵喵喵呜呜呜喵~呜呜呜呜呜喵喵呜~呜呜呜呜喵喵呜呜"));
        }
        return strReplace + strReplace2 + str;
    }
}
