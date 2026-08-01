package lin.xposed.hook.util.p011qq;

import android.media.MediaMetadataRetriever;
import android.os.Environment;
import android.util.Log;
import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.AbstractC3738;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.AbstractC5894;
import org.json.JSONArray;
import org.json.JSONObject;
import p025.AbstractC7012;
import p026.AbstractC7014;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p053.AbstractC7199;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class CreateElement {
    public static String cachePicPath(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜")) && !lowerCase.startsWith(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜呜喵~喵呜喵呜喵呜呜喵"))) {
            return str;
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        String str2 = AbstractC4765.m8870(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜喵呜")) + AbstractC9234.m14532("喵呜喵呜呜呜喵喵");
        AbstractC7199.m12510(str, str2.concat(strSubstring));
        return str2.concat(strSubstring);
    }

    public static String cachePttPath(String str) {
        String str2 = Environment.getExternalStorageDirectory() + AbstractC9234.m14531(597) + QQEnvTool.getCurrentUin() + AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵呜喵");
        if (!str.toLowerCase().startsWith(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜")) && !str.toLowerCase().startsWith(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜呜喵~喵呜喵呜喵呜呜喵"))) {
            StringBuilder sbM700 = AbstractC0900.m700(str2);
            sbM700.append(new File(str).getName());
            String string = sbM700.toString();
            try {
                AbstractC5894.m10609(str, string);
                return string;
            } catch (IOException e) {
                C6755.m11872(e);
                return null;
            }
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        StringBuilder sbM12143 = AbstractC7012.m12143(str2, strSubstring);
        sbM12143.append(AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵呜呜"));
        AbstractC7199.m12510(str, sbM12143.toString());
        return str2 + strSubstring + AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵呜呜");
    }

    public static String cacheVideoPath(String str) {
        String str2 = AbstractC4765.m8870(AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵")) + AbstractC9234.m14532("喵呜喵呜呜呜喵喵");
        if (!str.toLowerCase().startsWith(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜")) && !str.toLowerCase().startsWith(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜呜喵~喵呜喵呜喵呜呜喵"))) {
            StringBuilder sbM700 = AbstractC0900.m700(str2);
            sbM700.append(new File(str).getName());
            String string = sbM700.toString();
            try {
                AbstractC5894.m10609(str, string);
                return string;
            } catch (IOException e) {
                C6755.m11872(e);
                return null;
            }
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        StringBuilder sbM12143 = AbstractC7012.m12143(str2, strSubstring);
        sbM12143.append(AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵呜呜喵喵喵~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜喵喵"));
        AbstractC7199.m12510(str, sbM12143.toString());
        return str2 + strSubstring + AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵呜呜喵喵喵~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜喵喵");
    }

    public static Object createArkElement(String str) {
        Class clsM12425 = AbstractC7187.f17853 >= 7518 ? AbstractC7166.m12425(AbstractC9234.m14531(893)) : AbstractC7166.m12425(AbstractC9234.m14531(894));
        try {
            Object objNewInstance = clsM12425.newInstance();
            if (((Boolean) XposedHelpers.callMethod(objNewInstance, AbstractC9234.m14532("喵喵喵呜呜呜喵喵"), new Class[]{String.class}, new Object[]{str})).booleanValue()) {
                return XposedHelpers.callMethod(QQEnvTool.getQRouteApi(AbstractC7166.m12425(AbstractC9234.m14531(874))), AbstractC9234.m14531(896), new Class[]{clsM12425}, new Object[]{objNewInstance});
            }
            AbstractC7014.m12151(AbstractC9234.m14531(895) + str);
            return null;
        } catch (IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    public static Object createAtTextElement(String str, String str2) {
        String string;
        int i;
        String strM14532 = AbstractC9234.m14532("喵喵呜呜喵喵呜呜");
        if (str2.equals(AbstractC9234.m14532("喵呜喵喵喵喵呜呜"))) {
            string = strM14532.concat(AbstractC9234.m14531(878));
            i = 1;
        } else {
            StringBuilder sbM700 = AbstractC0900.m700(strM14532);
            sbM700.append(QQNTTroopTool.getMemberName(str, str2));
            string = sbM700.toString();
            i = 2;
        }
        return createAtTextElement(string, str2, i);
    }

    public static Object createEmojiElement(String str) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), AbstractC9234.m14531(876), new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{cachePicPath(str), Boolean.TRUE, 1});
    }

    public static Object createFileElement(String str) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), AbstractC9234.m14531(880), new Class[]{String.class}, new Object[]{str});
    }

    public static Object createJsonGrayTipElement(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        boolean z = (str2.contains(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜~喵呜喵喵喵喵呜呜~喵呜喵喵呜呜呜喵")) || str2.contains(AbstractC9234.m14531(883))) ? false : true;
        try {
            jSONObject.put(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜喵呜呜"), AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵"), 3);
            jSONObject2.put(AbstractC9234.m14532("喵喵喵呜呜喵喵呜~喵喵喵喵喵呜喵呜"), str2);
            jSONObject2.put(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜呜呜喵"), str);
            jSONObject2.put(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"), AbstractC9234.m14532(z ? "喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵" : "喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵呜喵呜呜喵"), jSONArray);
            Object objM6845 = AbstractC3738.m6845(new Object[]{Integer.valueOf(z ? 1014 : 1015), jSONObject.toString(), "", Boolean.FALSE, null}, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE, AbstractC7166.m12425(AbstractC9234.m14531(885))}, AbstractC7166.m12425(AbstractC9234.m14531(884)));
            Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425(AbstractC9234.m14531(886)), new Object[0]);
            AbstractC7165.m12422(objM6846, AbstractC9234.m14531(887), null, 17);
            AbstractC7165.m12422(objM6846, AbstractC9234.m14531(888), null, objM6845);
            Object objM68462 = AbstractC3738.m6846(AbstractC7166.m12425(AbstractC9234.m14531(889)), new Object[0]);
            XposedHelpers.callMethod(objM68462, AbstractC9234.m14531(890), new Class[]{Integer.TYPE}, new Object[]{8});
            XposedHelpers.callMethod(objM68462, AbstractC9234.m14531(891), new Class[]{AbstractC7166.m12425(AbstractC9234.m14531(886))}, new Object[]{objM6846});
            return objM68462;
        } catch (Exception e) {
            Log.d(AbstractC9234.m14531(892), String.valueOf(e));
            return null;
        }
    }

    public static Object createPicElement(String str) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), AbstractC9234.m14531(876), new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{cachePicPath(str), Boolean.TRUE, 0});
    }

    public static Object createPttElement(String str) {
        String strCachePttPath = cachePttPath(str);
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), AbstractC9234.m14531(881), new Class[]{String.class, Integer.TYPE, ArrayList.class}, new Object[]{strCachePttPath, Integer.valueOf((int) getDuration(strCachePttPath)), new ArrayList(Arrays.asList((byte) 28, (byte) 26, (byte) 43, (byte) 29, (byte) 31, (byte) 61, (byte) 34, (byte) 49, (byte) 51, (byte) 56, (byte) 52, (byte) 74, (byte) 41, (byte) 62, (byte) 66, (byte) 46, (byte) 25, (byte) 57, (byte) 51, (byte) 70, (byte) 33, (byte) 45, (byte) 39, (byte) 27, (byte) 68, (byte) 58, (byte) 46, (byte) 59, (byte) 59, (byte) 63))});
    }

    public static Object createReplyElement(long j) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), AbstractC9234.m14531(879), new Class[]{Long.TYPE}, new Object[]{Long.valueOf(j)});
    }

    public static Object createTextElement(String str) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), AbstractC9234.m14531(875), new Class[]{String.class}, new Object[]{str});
    }

    public static Object createVideoElement(String str) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), AbstractC9234.m14531(882), new Class[]{String.class}, new Object[]{cacheVideoPath(str)});
    }

    public static long getDuration(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        if (str != null) {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(str);
                } catch (IOException unused) {
                    return 0L;
                }
            } catch (Exception unused2) {
                mediaMetadataRetriever.release();
                return 0L;
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }
        long j = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        try {
            mediaMetadataRetriever.release();
            return j;
        } catch (IOException unused4) {
            return j;
        }
    }

    public static Object createAtTextElement(String str, String str2, int i) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), AbstractC9234.m14531(877), new Class[]{String.class, String.class, Integer.TYPE}, new Object[]{str, str2, Integer.valueOf(i)});
    }
}
