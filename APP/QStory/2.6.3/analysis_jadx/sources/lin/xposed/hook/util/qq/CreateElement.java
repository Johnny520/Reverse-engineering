package lin.xposed.hook.util.qq;

import android.media.MediaMetadataRetriever;
import android.os.Environment;
import android.util.Log;
import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.AbstractC2905;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.AbstractC5062;
import org.json.JSONArray;
import org.json.JSONObject;
import p009.AbstractC6183;
import p010.AbstractC6185;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p037.AbstractC6370;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class CreateElement {
    public static String cachePicPath(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜")) && !lowerCase.startsWith(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜呜喵~喵呜喵呜喵呜呜喵"))) {
            return str;
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        String str2 = AbstractC3933.m8311(AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜呜喵呜")) + AbstractC8405.m13973("喵呜喵呜呜呜喵喵");
        AbstractC6370.m11951(str, str2.concat(strSubstring));
        return str2.concat(strSubstring);
    }

    public static String cachePttPath(String str) {
        String str2 = Environment.getExternalStorageDirectory() + AbstractC8405.m13972(597) + QQEnvTool.getCurrentUin() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜呜喵喵~喵呜喵喵呜喵呜喵");
        if (!str.toLowerCase().startsWith(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜")) && !str.toLowerCase().startsWith(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜呜喵~喵呜喵呜喵呜呜喵"))) {
            StringBuilder sbM140 = AbstractC0053.m140(str2);
            sbM140.append(new File(str).getName());
            String string = sbM140.toString();
            try {
                AbstractC5062.m10050(str, string);
                return string;
            } catch (IOException e) {
                C5925.m11313(e);
                return null;
            }
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        StringBuilder sbM11584 = AbstractC6183.m11584(str2, strSubstring);
        sbM11584.append(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵呜呜"));
        AbstractC6370.m11951(str, sbM11584.toString());
        return str2 + strSubstring + AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜喵呜呜");
    }

    public static String cacheVideoPath(String str) {
        String str2 = AbstractC3933.m8311(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜喵")) + AbstractC8405.m13973("喵呜喵呜呜呜喵喵");
        if (!str.toLowerCase().startsWith(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜")) && !str.toLowerCase().startsWith(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵喵喵呜喵呜呜喵~喵呜喵呜喵呜呜喵"))) {
            StringBuilder sbM140 = AbstractC0053.m140(str2);
            sbM140.append(new File(str).getName());
            String string = sbM140.toString();
            try {
                AbstractC5062.m10050(str, string);
                return string;
            } catch (IOException e) {
                C5925.m11313(e);
                return null;
            }
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        StringBuilder sbM11584 = AbstractC6183.m11584(str2, strSubstring);
        sbM11584.append(AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜呜喵喵喵~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜喵喵"));
        AbstractC6370.m11951(str, sbM11584.toString());
        return str2 + strSubstring + AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵呜呜喵喵喵~喵喵喵喵呜喵呜喵~喵呜喵呜呜呜喵喵");
    }

    public static Object createArkElement(String str) {
        Class clsM11866 = AbstractC6358.f17508 >= 7518 ? AbstractC6337.m11866(AbstractC8405.m13972(893)) : AbstractC6337.m11866(AbstractC8405.m13972(894));
        try {
            Object objNewInstance = clsM11866.newInstance();
            if (((Boolean) XposedHelpers.callMethod(objNewInstance, AbstractC8405.m13973("喵喵喵呜呜呜喵喵"), new Class[]{String.class}, new Object[]{str})).booleanValue()) {
                return XposedHelpers.callMethod(QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(874))), AbstractC8405.m13972(896), new Class[]{clsM11866}, new Object[]{objNewInstance});
            }
            AbstractC6185.m11592(AbstractC8405.m13972(895) + str);
            return null;
        } catch (IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    public static Object createAtTextElement(String str, String str2) {
        String string;
        int i;
        String strM13973 = AbstractC8405.m13973("喵喵呜呜喵喵呜呜");
        if (str2.equals(AbstractC8405.m13973("喵呜喵喵喵喵呜呜"))) {
            string = strM13973.concat(AbstractC8405.m13972(878));
            i = 1;
        } else {
            StringBuilder sbM140 = AbstractC0053.m140(strM13973);
            sbM140.append(QQNTTroopTool.getMemberName(str, str2));
            string = sbM140.toString();
            i = 2;
        }
        return createAtTextElement(string, str2, i);
    }

    public static Object createEmojiElement(String str) {
        return XposedHelpers.callMethod(AbstractC6183.m11587(874), AbstractC8405.m13972(876), new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{cachePicPath(str), Boolean.TRUE, 1});
    }

    public static Object createFileElement(String str) {
        return XposedHelpers.callMethod(AbstractC6183.m11587(874), AbstractC8405.m13972(880), new Class[]{String.class}, new Object[]{str});
    }

    public static Object createJsonGrayTipElement(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        boolean z = (str2.contains(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜呜呜喵~喵喵喵呜呜喵喵喵~喵呜喵呜呜呜呜呜~喵呜喵喵喵喵呜呜~喵呜喵喵呜呜呜喵")) || str2.contains(AbstractC8405.m13972(883))) ? false : true;
        try {
            jSONObject.put(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜喵呜呜"), AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵"), 3);
            jSONObject2.put(AbstractC8405.m13973("喵喵喵呜呜喵喵呜~喵喵喵喵喵呜喵呜"), str2);
            jSONObject2.put(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜呜呜喵"), str);
            jSONObject2.put(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"), AbstractC8405.m13973(z ? "喵喵喵呜呜呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵" : "喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put(AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵呜喵呜呜喵"), jSONArray);
            Object objM6285 = AbstractC2905.m6285(new Object[]{Integer.valueOf(z ? 1014 : 1015), jSONObject.toString(), "", Boolean.FALSE, null}, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE, AbstractC6337.m11866(AbstractC8405.m13972(885))}, AbstractC6337.m11866(AbstractC8405.m13972(884)));
            Object objM6286 = AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(886)), new Object[0]);
            AbstractC6336.m11863(objM6286, AbstractC8405.m13972(887), null, 17);
            AbstractC6336.m11863(objM6286, AbstractC8405.m13972(888), null, objM6285);
            Object objM62862 = AbstractC2905.m6286(AbstractC6337.m11866(AbstractC8405.m13972(889)), new Object[0]);
            XposedHelpers.callMethod(objM62862, AbstractC8405.m13972(890), new Class[]{Integer.TYPE}, new Object[]{8});
            XposedHelpers.callMethod(objM62862, AbstractC8405.m13972(891), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(886))}, new Object[]{objM6286});
            return objM62862;
        } catch (Exception e) {
            Log.d(AbstractC8405.m13972(892), String.valueOf(e));
            return null;
        }
    }

    public static Object createPicElement(String str) {
        return XposedHelpers.callMethod(AbstractC6183.m11587(874), AbstractC8405.m13972(876), new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{cachePicPath(str), Boolean.TRUE, 0});
    }

    public static Object createPttElement(String str) {
        String strCachePttPath = cachePttPath(str);
        return XposedHelpers.callMethod(AbstractC6183.m11587(874), AbstractC8405.m13972(881), new Class[]{String.class, Integer.TYPE, ArrayList.class}, new Object[]{strCachePttPath, Integer.valueOf((int) getDuration(strCachePttPath)), new ArrayList(Arrays.asList((byte) 28, (byte) 26, (byte) 43, (byte) 29, (byte) 31, (byte) 61, (byte) 34, (byte) 49, (byte) 51, (byte) 56, (byte) 52, (byte) 74, (byte) 41, (byte) 62, (byte) 66, (byte) 46, (byte) 25, (byte) 57, (byte) 51, (byte) 70, (byte) 33, (byte) 45, (byte) 39, (byte) 27, (byte) 68, (byte) 58, (byte) 46, (byte) 59, (byte) 59, (byte) 63))});
    }

    public static Object createReplyElement(long j) {
        return XposedHelpers.callMethod(AbstractC6183.m11587(874), AbstractC8405.m13972(879), new Class[]{Long.TYPE}, new Object[]{Long.valueOf(j)});
    }

    public static Object createTextElement(String str) {
        return XposedHelpers.callMethod(AbstractC6183.m11587(874), AbstractC8405.m13972(875), new Class[]{String.class}, new Object[]{str});
    }

    public static Object createVideoElement(String str) {
        return XposedHelpers.callMethod(AbstractC6183.m11587(874), AbstractC8405.m13972(882), new Class[]{String.class}, new Object[]{cacheVideoPath(str)});
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
        return XposedHelpers.callMethod(AbstractC6183.m11587(874), AbstractC8405.m13972(877), new Class[]{String.class, String.class, Integer.TYPE}, new Object[]{str, str2, Integer.valueOf(i)});
    }
}
