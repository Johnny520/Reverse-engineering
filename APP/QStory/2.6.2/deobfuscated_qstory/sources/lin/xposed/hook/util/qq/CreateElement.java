package lin.xposed.hook.util.qq;

import android.media.MediaMetadataRetriever;
import android.os.Environment;
import android.util.Log;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p035.AbstractC6340;
import p036.AbstractC6353;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class CreateElement {
    public static String cachePicPath(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("http:") && !lowerCase.startsWith("https:")) {
            return str;
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        String str2 = AbstractC3932.m8321("img") + "/";
        AbstractC6353.m11903(str, str2.concat(strSubstring));
        return str2.concat(strSubstring);
    }

    public static String cachePttPath(String str) {
        String str2 = Environment.getExternalStorageDirectory() + "/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/" + QQEnvTool.getCurrentUin() + "/ptt/";
        if (!str.toLowerCase().startsWith("http:") && !str.toLowerCase().startsWith("https:")) {
            StringBuilder sbM149 = AbstractC0053.m149(str2);
            sbM149.append(new File(str).getName());
            String string = sbM149.toString();
            try {
                AbstractC0455.m1170(str, string);
                return string;
            } catch (IOException e) {
                C5919.m11252(e);
                return null;
            }
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        StringBuilder sbM11553 = AbstractC6136.m11553(str2, strSubstring);
        sbM11553.append(".aac");
        AbstractC6353.m11903(str, sbM11553.toString());
        return str2 + strSubstring + ".aac";
    }

    public static String cacheVideoPath(String str) {
        String str2 = AbstractC3932.m8321("video") + "/";
        if (!str.toLowerCase().startsWith("http:") && !str.toLowerCase().startsWith("https:")) {
            StringBuilder sbM149 = AbstractC0053.m149(str2);
            sbM149.append(new File(str).getName());
            String string = sbM149.toString();
            try {
                AbstractC0455.m1170(str, string);
                return string;
            } catch (IOException e) {
                C5919.m11252(e);
                return null;
            }
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        StringBuilder sbM11553 = AbstractC6136.m11553(str2, strSubstring);
        sbM11553.append(".mp4");
        AbstractC6353.m11903(str, sbM11553.toString());
        return str2 + strSubstring + ".mp4";
    }

    public static Object createArkElement(String str) {
        Class clsM11838 = AbstractC6340.f17461 >= 7518 ? AbstractC6318.m11838("com.tencent.qqnt.msg.data.a") : AbstractC6318.m11838("com.tencent.qqnt.msg.data.b");
        try {
            Object objNewInstance = clsM11838.newInstance();
            if (((Boolean) XposedHelpers.callMethod(objNewInstance, "o", new Class[]{String.class}, new Object[]{str})).booleanValue()) {
                return XposedHelpers.callMethod(QQEnvTool.getQRouteApi(AbstractC6318.m11838("com.tencent.qqnt.msg.api.IMsgUtilApi")), "createArkElement", new Class[]{clsM11838}, new Object[]{objNewInstance});
            }
            AbstractC6154.m11561("\u5361\u7247\u683c\u5f0f\u6709\u95ee\u9898:" + str);
            return null;
        } catch (IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    public static Object createAtTextElement(String str, String str2) {
        String string;
        int i;
        String strM6668 = "@";
        if (str2.equals("0")) {
            string = strM6668.concat("\u5168\u4f53\u6210\u5458");
            i = 1;
        } else {
            StringBuilder sbM149 = AbstractC0053.m149(strM6668);
            sbM149.append(QQNTTroopTool.getMemberName(str, str2));
            string = sbM149.toString();
            i = 2;
        }
        return createAtTextElement(string, str2, i);
    }

    public static Object createEmojiElement(String str) {
        return XposedHelpers.callMethod(AbstractC6136.m11554(-3937646491167098279L), "createPicElement", new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{cachePicPath(str), Boolean.TRUE, 1});
    }

    public static Object createFileElement(String str) {
        return XposedHelpers.callMethod(AbstractC6136.m11554(-3937646491167098279L), "createFileElement", new Class[]{String.class}, new Object[]{str});
    }

    public static Object createJsonGrayTipElement(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        boolean z = (str2.contains("http://") || str2.contains("https://")) ? false : true;
        try {
            jSONObject.put("align", "center");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("col", 3);
            jSONObject2.put("jp", str2);
            jSONObject2.put("txt", str);
            jSONObject2.put("type", z ? "nor" : "url");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("items", jSONArray);
            Object objM11389 = AbstractC6087.m11389(new Object[]{Integer.valueOf(z ? 1014 : 1015), jSONObject.toString(), "", Boolean.FALSE, null}, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE, AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.XmlToJsonParam")}, AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.JsonGrayElement"));
            Object objM11392 = AbstractC6087.m11392(AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.GrayTipElement"), new Object[0]);
            AbstractC6317.m11835(objM11392, "subElementType", null, 17);
            AbstractC6317.m11835(objM11392, "jsonGrayTipElement", null, objM11389);
            Object objM113922 = AbstractC6087.m11392(AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.MsgElement"), new Object[0]);
            XposedHelpers.callMethod(objM113922, "setElementType", new Class[]{Integer.TYPE}, new Object[]{8});
            XposedHelpers.callMethod(objM113922, "setGrayTipElement", new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.GrayTipElement")}, new Object[]{objM11392});
            return objM113922;
        } catch (Exception e) {
            Log.d("\u62a5\u9519:createJsonGrayTipElement", String.valueOf(e));
            return null;
        }
    }

    public static Object createPicElement(String str) {
        return XposedHelpers.callMethod(AbstractC6136.m11554(-3937646491167098279L), "createPicElement", new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{cachePicPath(str), Boolean.TRUE, 0});
    }

    public static Object createPttElement(String str) {
        String strCachePttPath = cachePttPath(str);
        return XposedHelpers.callMethod(AbstractC6136.m11554(-3937646491167098279L), "createPttElement", new Class[]{String.class, Integer.TYPE, ArrayList.class}, new Object[]{strCachePttPath, Integer.valueOf((int) getDuration(strCachePttPath)), new ArrayList(Arrays.asList((byte) 28, (byte) 26, (byte) 43, (byte) 29, (byte) 31, (byte) 61, (byte) 34, (byte) 49, (byte) 51, (byte) 56, (byte) 52, (byte) 74, (byte) 41, (byte) 62, (byte) 66, (byte) 46, (byte) 25, (byte) 57, (byte) 51, (byte) 70, (byte) 33, (byte) 45, (byte) 39, (byte) 27, (byte) 68, (byte) 58, (byte) 46, (byte) 59, (byte) 59, (byte) 63))});
    }

    public static Object createReplyElement(long j) {
        return XposedHelpers.callMethod(AbstractC6136.m11554(-3937646491167098279L), "createReplyElement", new Class[]{Long.TYPE}, new Object[]{Long.valueOf(j)});
    }

    public static Object createTextElement(String str) {
        return XposedHelpers.callMethod(AbstractC6136.m11554(-3937646491167098279L), "createTextElement", new Class[]{String.class}, new Object[]{str});
    }

    public static Object createVideoElement(String str) {
        return XposedHelpers.callMethod(AbstractC6136.m11554(-3937646491167098279L), "createVideoElement", new Class[]{String.class}, new Object[]{cacheVideoPath(str)});
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
        return XposedHelpers.callMethod(AbstractC6136.m11554(-3937646491167098279L), "createAtTextElement", new Class[]{String.class, String.class, Integer.TYPE}, new Object[]{str, str2, Integer.valueOf(i)});
    }
}
