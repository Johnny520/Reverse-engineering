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
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class CreateElement {
    public static String cachePicPath(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("http:") && !lowerCase.startsWith("https:")) {
            return str;
        }
        String strSubstring = String.valueOf(Math.random()).substring(2);
        String str2 = AbstractC4765.m8870("img") + "/";
        AbstractC7199.m12510(str, str2.concat(strSubstring));
        return str2.concat(strSubstring);
    }

    public static String cachePttPath(String str) {
        String str2 = Environment.getExternalStorageDirectory() + "/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/" + QQEnvTool.getCurrentUin() + "/ptt/";
        if (!str.toLowerCase().startsWith("http:") && !str.toLowerCase().startsWith("https:")) {
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
        sbM12143.append(".aac");
        AbstractC7199.m12510(str, sbM12143.toString());
        return str2 + strSubstring + ".aac";
    }

    public static String cacheVideoPath(String str) {
        String str2 = AbstractC4765.m8870("video") + "/";
        if (!str.toLowerCase().startsWith("http:") && !str.toLowerCase().startsWith("https:")) {
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
        sbM12143.append(".mp4");
        AbstractC7199.m12510(str, sbM12143.toString());
        return str2 + strSubstring + ".mp4";
    }

    public static Object createArkElement(String str) {
        Class clsM12425 = AbstractC7187.f17853 >= 7518 ? AbstractC7166.m12425("com.tencent.qqnt.msg.data.a") : AbstractC7166.m12425("com.tencent.qqnt.msg.data.b");
        try {
            Object objNewInstance = clsM12425.newInstance();
            if (((Boolean) XposedHelpers.callMethod(objNewInstance, "o", new Class[]{String.class}, new Object[]{str})).booleanValue()) {
                return XposedHelpers.callMethod(QQEnvTool.getQRouteApi(AbstractC7166.m12425("com.tencent.qqnt.msg.api.IMsgUtilApi")), "createArkElement", new Class[]{clsM12425}, new Object[]{objNewInstance});
            }
            AbstractC7014.m12151("卡片格式有问题:" + str);
            return null;
        } catch (IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    public static Object createAtTextElement(String str, String str2) {
        String string;
        int i;
        String strM14532 = "@";
        if (str2.equals("0")) {
            string = strM14532.concat("全体成员");
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
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), "createPicElement", new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{cachePicPath(str), Boolean.TRUE, 1});
    }

    public static Object createFileElement(String str) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), "createFileElement", new Class[]{String.class}, new Object[]{str});
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
            jSONObject2.put("type", (z ? "nor" : "url"));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("items", jSONArray);
            Object objM6845 = AbstractC3738.m6845(new Object[]{Integer.valueOf(z ? 1014 : 1015), jSONObject.toString(), "", Boolean.FALSE, null}, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE, AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.XmlToJsonParam")}, AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.JsonGrayElement"));
            Object objM6846 = AbstractC3738.m6846(AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.GrayTipElement"), new Object[0]);
            AbstractC7165.m12422(objM6846, "subElementType", null, 17);
            AbstractC7165.m12422(objM6846, "jsonGrayTipElement", null, objM6845);
            Object objM68462 = AbstractC3738.m6846(AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.MsgElement"), new Object[0]);
            XposedHelpers.callMethod(objM68462, "setElementType", new Class[]{Integer.TYPE}, new Object[]{8});
            XposedHelpers.callMethod(objM68462, "setGrayTipElement", new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.GrayTipElement")}, new Object[]{objM6846});
            return objM68462;
        } catch (Exception e) {
            Log.d("报错:createJsonGrayTipElement", String.valueOf(e));
            return null;
        }
    }

    public static Object createPicElement(String str) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), "createPicElement", new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, new Object[]{cachePicPath(str), Boolean.TRUE, 0});
    }

    public static Object createPttElement(String str) {
        String strCachePttPath = cachePttPath(str);
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), "createPttElement", new Class[]{String.class, Integer.TYPE, ArrayList.class}, new Object[]{strCachePttPath, Integer.valueOf((int) getDuration(strCachePttPath)), new ArrayList(Arrays.asList((byte) 28, (byte) 26, (byte) 43, (byte) 29, (byte) 31, (byte) 61, (byte) 34, (byte) 49, (byte) 51, (byte) 56, (byte) 52, (byte) 74, (byte) 41, (byte) 62, (byte) 66, (byte) 46, (byte) 25, (byte) 57, (byte) 51, (byte) 70, (byte) 33, (byte) 45, (byte) 39, (byte) 27, (byte) 68, (byte) 58, (byte) 46, (byte) 59, (byte) 59, (byte) 63))});
    }

    public static Object createReplyElement(long j) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), "createReplyElement", new Class[]{Long.TYPE}, new Object[]{Long.valueOf(j)});
    }

    public static Object createTextElement(String str) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), "createTextElement", new Class[]{String.class}, new Object[]{str});
    }

    public static Object createVideoElement(String str) {
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), "createVideoElement", new Class[]{String.class}, new Object[]{cacheVideoPath(str)});
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
        return XposedHelpers.callMethod(AbstractC7012.m12146(874), "createAtTextElement", new Class[]{String.class, String.class, Integer.TYPE}, new Object[]{str, str2, Integer.valueOf(i)});
    }
}
