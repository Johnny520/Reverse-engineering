package p010;

import android.os.Build;
import android.os.Environment;
import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p007.AbstractC6136;
import p035.AbstractC6340;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6157 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f16779 = AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937632936250312103L));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m11570(Throwable th) {
        String strM6668;
        StringBuilder sb = new StringBuilder(AbstractC3056.m6668(-3937560690605426087L));
        sb.append(m11576());
        sb.append(AbstractC3056.m6668(-3937560690605426087L));
        sb.append(AbstractC3056.m6668(-3937633627740046759L));
        AbstractC6136.m11531(sb, AbstractC6340.f17462, -3937560690605426087L);
        AbstractC6136.m11547(-3937633537545733543L, sb, -3937562241088619943L);
        AbstractC6136.m11547(-3937560690605426087L, sb, -3937633464531289511L);
        try {
            Field field = XposedBridge.class.getField(AbstractC3056.m6668(-3937633842488411559L));
            field.setAccessible(true);
            strM6668 = (String) field.get(null);
        } catch (Exception unused) {
            strM6668 = AbstractC3056.m6668(-3937627554656290215L);
        }
        AbstractC6136.m11531(sb, strM6668, -3937560690605426087L);
        sb.append(AbstractC3056.m6668(-3937633477416191399L));
        AbstractC6136.m11531(sb, Build.BRAND, -3937560690605426087L);
        sb.append(AbstractC3056.m6668(-3937633430171551143L));
        AbstractC6136.m11531(sb, Build.VERSION.RELEASE, -3937560690605426087L);
        sb.append(AbstractC3056.m6668(-3937633361452074407L));
        AbstractC6136.m11533(sb, Build.VERSION.SDK_INT, -3937560690605426087L);
        sb.append(AbstractC3056.m6668(-3937633241192990119L));
        AbstractC6136.m11531(sb, Build.DEVICE, -3937560690605426087L);
        sb.append(AbstractC3056.m6668(-3937633189653382567L));
        sb.append(Build.MODEL);
        sb.append(AbstractC3056.m6668(-3937560690605426087L));
        sb.append(Log.getStackTraceString(th));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m11571(Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append(exc);
        sb.append(AbstractC3056.m6668(-3937560690605426087L));
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            if (!stackTraceElement.getClassName().equals(AbstractC6157.class.getName())) {
                sb.append(stackTraceElement);
                sb.append(AbstractC3056.m6668(-3937560690605426087L));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11572(String str) {
        try {
            AbstractC3054.m6616(f16779, Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC3056.m6668(-3937633825308542375L));
            AbstractC6154.m11561(str + AbstractC3056.m6668(-3937633653509850535L) + Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC3056.m6668(-3937633825308542375L));
        } catch (Exception unused) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937633687869588903L));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11573(Object obj, String str) {
        m11574(str, String.valueOf(obj), obj, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11574(String str, String str2, Object obj, boolean z) {
        String string;
        StringBuilder sb = new StringBuilder();
        String str3 = f16779;
        if (z) {
            StringBuilder sbM149 = AbstractC0053.m149(str3);
            sbM149.append(AbstractC3056.m6668(-3937633803833705895L));
            sbM149.append(File.separator);
            string = sbM149.toString();
        } else {
            StringBuilder sbM1492 = AbstractC0053.m149(str3);
            sbM1492.append(AbstractC3056.m6668(-3937633911207888295L));
            sbM1492.append(File.separator);
            string = sbM1492.toString();
        }
        sb.append(string);
        sb.append(str);
        sb.append(AbstractC3056.m6668(-3937633047919461799L));
        String string2 = sb.toString();
        StringBuilder sb2 = new StringBuilder(m11576());
        AbstractC6136.m11544(-3937560690605426087L, sb2, str2);
        if (obj instanceof Exception) {
            sb2.append(AbstractC3056.m6668(-3937560690605426087L));
            sb2.append(m11571((Exception) obj));
        }
        sb2.append(AbstractC3056.m6668(-3937633035034559911L));
        AbstractC0455.m1145(string2, sb2.toString(), true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11575(Exception exc) {
        m11574(AbstractC3056.m6668(-3937633211128219047L), exc.toString(), exc, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static String m11576() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC3056.m6668(-3937633082279200167L));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(AbstractC3056.m6668(-3937632962020115879L), Locale.CHINA);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(AbstractC3056.m6668(-3937632970610050471L));
        Calendar calendar = Calendar.getInstance();
        String strReplace = simpleDateFormat.format(calendar.getTime());
        String strReplace2 = simpleDateFormat2.format(calendar.getTime());
        String str = simpleDateFormat3.format(calendar.getTime());
        if (strReplace.contains(AbstractC3056.m6668(-3937632906185541031L))) {
            strReplace = strReplace.replace(AbstractC3056.m6668(-3937632906185541031L), AbstractC3056.m6668(-3937632919070442919L));
        }
        if (strReplace.contains(AbstractC3056.m6668(-3937632893300639143L))) {
            strReplace = strReplace.replace(AbstractC3056.m6668(-3937632893300639143L), AbstractC3056.m6668(-3937632940545279399L));
        }
        if (strReplace2.contains(AbstractC3056.m6668(-3937632949135213991L))) {
            strReplace2 = strReplace2.replace(AbstractC3056.m6668(-3937632949135213991L), AbstractC3056.m6668(-3937632923365410215L));
        }
        return strReplace + strReplace2 + str;
    }
}
