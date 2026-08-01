package lin.xposed.hook.javaplugin.online.upload;

import android.text.TextUtils;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1245;
import bsh.C2632;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.C5553;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import okio.ByteString;
import p005.C6123;
import p013.C6177;
import p015.AbstractC6206;
import p015.C6195;
import p015.C6197;
import p015.C6198;
import p015.C6200;
import p015.C6204;
import p015.C6215;
import p015.C6217;
import p017.AbstractC6238;
import p036.AbstractC6354;
import p253.AbstractC8189;
import p316.C8675;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class NetUploadPlugin {
    private final String password = "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR";
    private final String url = "https://plugin.sacz.top";
    private final String uploadStateUrl = "https://plugin.sacz.top/plugin-upload/confirmUploadStatus";
    private final String requestUploadPluginFileUrl = "https://plugin.sacz.top/plugin-upload/uploadFile";
    private final String requestTokenUrl = "https://plugin.sacz.top/plugin-upload/readyToUpload";
    private final String requestUploadPluginInfoUrl = "https://plugin.sacz.top/plugin-upload/uploadInfo";

    public String requestToken(String str, String str2, int i) {
        C6217 c6217M13679;
        if (TextUtils.isEmpty(str2)) {
            str2 = "\u672a\u77e5";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uploaderUin", str);
        jSONObject.put("uploaderNickName", str2);
        jSONObject.put("type", Integer.valueOf(i));
        C6200 c6200Build = OkHttpClientBuilder.build();
        String strM6668 = "text/plain";
        Regex regex = C6217.f17098;
        try {
            c6217M13679 = AbstractC8189.m13679(strM6668);
        } catch (IllegalArgumentException unused) {
            c6217M13679 = null;
        }
        String strM11907 = AbstractC6354.m11907(jSONObject.toString(), "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR");
        int i2 = AbstractC6206.f17028;
        C6195 c6195M14360 = C8675.m14360(strM11907, c6217M13679);
        C1245 c1245 = new C1245(6);
        c1245.m2141("https://plugin.sacz.top/plugin-upload/readyToUpload");
        c1245.m2148("POST", c6195M14360);
        c1245.m2156("User-Agent", "Android");
        c1245.m2156("Content-Type", "text/plain");
        c1245.m2156("Accept", "*/*");
        c1245.m2156("Connection", "keep-alive");
        C6198 c6198 = new C6198(c1245);
        c6200Build.getClass();
        C6204 c6204M11615 = new C6177(c6200Build, c6198).m11615();
        String strReplace = c6204M11615.f17009.m11648().replace("\"", "");
        c6204M11615.close();
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6354.m11909(strReplace, "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR"));
        if (jSONObjectM6316 == null) {
            C2632.m5294("server return json : null");
            return null;
        }
        if (jSONObjectM6316.getIntValue("code", 403) == 201) {
            return jSONObjectM6316.getString("data");
        }
        if (jSONObjectM6316.getIntValue("code", 403) != 403) {
            return jSONObjectM6316.getString("message");
        }
        C2632.m5294("Don't upload frequently(\u8bf7\u52ff\u9891\u7e41\u4e0a\u4f20)");
        return null;
    }

    public String requestUploadState(String str) {
        C6217 c6217M13679;
        C6200 c6200Build = OkHttpClientBuilder.build();
        String strM6668 = "text/plain";
        Regex regex = C6217.f17098;
        try {
            c6217M13679 = AbstractC8189.m13679(strM6668);
        } catch (IllegalArgumentException unused) {
            c6217M13679 = null;
        }
        int i = AbstractC6206.f17028;
        C6195 c6195M14360 = C8675.m14360("", c6217M13679);
        C1245 c1245 = new C1245(6);
        c1245.m2141("https://plugin.sacz.top/plugin-upload/confirmUploadStatus");
        c1245.m2156("token", str);
        c1245.m2148("POST", c6195M14360);
        c1245.m2156("User-Agent", "Android");
        c1245.m2156("Content-Type", "text/plain");
        c1245.m2156("Accept", "*/*");
        c1245.m2156("Connection", "keep-alive");
        C6198 c6198 = new C6198(c1245);
        c6200Build.getClass();
        C6204 c6204M11615 = new C6177(c6200Build, c6198).m11615();
        String strReplace = c6204M11615.f17009.m11648().replace("\"", "");
        c6204M11615.close();
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6354.m11909(strReplace, "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR"));
        if (jSONObjectM6316 != null) {
            return jSONObjectM6316.getIntValue("code", 403) == 200 ? jSONObjectM6316.getString("data") : jSONObjectM6316.getString("message");
        }
        C2632.m5294("server return json : null");
        return null;
    }

    public String uploadPluginFile(String str, File file) {
        C6217 c6217M13679;
        C6200 c6200Build = OkHttpClientBuilder.build();
        String string = UUID.randomUUID().toString();
        string.getClass();
        ByteString.Companion.getClass();
        ByteString byteStringM11517 = C6123.m11517(string);
        C6217 c6217 = C6215.f17058;
        ArrayList arrayList = new ArrayList();
        C6217 c62172 = C6215.f17060;
        c62172.getClass();
        if (!c62172.f17100.equals("multipart")) {
            C5553.m10815(c62172, "multipart != ");
            return null;
        }
        String strM6668 = "file";
        String name = file.getName();
        int i = AbstractC6206.f17028;
        String strM66682 = "application/octet-stream";
        Regex regex = C6217.f17098;
        try {
            c6217M13679 = AbstractC8189.m13679(strM66682);
        } catch (IllegalArgumentException unused) {
            c6217M13679 = null;
        }
        arrayList.add(AbstractC0455.m1169(strM6668, name, new C6197(c6217M13679, file)));
        if (arrayList.isEmpty()) {
            C5919.m11250("Multipart body must have at least one part.");
            return null;
        }
        C6215 c6215 = new C6215(byteStringM11517, c62172, AbstractC6238.m11711(arrayList));
        C1245 c1245 = new C1245(6);
        c1245.m2141("https://plugin.sacz.top/plugin-upload/uploadFile");
        c1245.m2148("POST", c6215);
        c1245.m2156("token", str);
        c1245.m2156("Accept", "*/*");
        c1245.m2156("Connection", "keep-alive");
        c1245.m2156("Content-Type", "multipart/form-data; boundary=--------------------------237281582881051963083898");
        C6198 c6198 = new C6198(c1245);
        c6200Build.getClass();
        C6204 c6204M11615 = new C6177(c6200Build, c6198).m11615();
        String strM11648 = c6204M11615.f17009.m11648();
        c6204M11615.close();
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(strM11648);
        if (jSONObjectM6316 != null) {
            return jSONObjectM6316.getIntValue("code", 403) == 200 ? jSONObjectM6316.getString("data") : jSONObjectM6316.getString("message");
        }
        C2632.m5294("server return json : null");
        return null;
    }

    public String uploadPluginInfo(String str, PluginInfo pluginInfo) {
        C6217 c6217M13679;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pluginID", pluginInfo.getPluginID());
        jSONObject.put("pluginName", pluginInfo.getPluginName());
        jSONObject.put("pluginAuthor", pluginInfo.getPluginAuthor());
        jSONObject.put("pluginVersion", pluginInfo.getPluginVersion());
        jSONObject.put("pluginDesc", pluginInfo.getPluginDesc());
        jSONObject.put("pluginTime", pluginInfo.getDate());
        C6200 c6200Build = OkHttpClientBuilder.build();
        String strM6668 = "text/plain";
        Regex regex = C6217.f17098;
        try {
            c6217M13679 = AbstractC8189.m13679(strM6668);
        } catch (IllegalArgumentException unused) {
            c6217M13679 = null;
        }
        int i = AbstractC6206.f17028;
        C6195 c6195M14360 = C8675.m14360(AbstractC6354.m11907(jSONObject.toString(), "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR"), c6217M13679);
        C1245 c1245 = new C1245(6);
        c1245.m2141("https://plugin.sacz.top/plugin-upload/uploadInfo");
        c1245.m2148("POST", c6195M14360);
        c1245.m2156("Content-Type", "text/plain");
        c1245.m2156("Accept", "*/*");
        c1245.m2156("Connection", "keep-alive");
        c1245.m2156("token", str);
        C6198 c6198 = new C6198(c1245);
        c6200Build.getClass();
        C6204 c6204M11615 = new C6177(c6200Build, c6198).m11615();
        String strReplace = c6204M11615.f17009.m11648().replace("\"", "");
        c6204M11615.close();
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6354.m11909(strReplace, "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR"));
        if (jSONObjectM6316 != null) {
            return jSONObjectM6316.getIntValue("code", 403) == 200 ? jSONObjectM6316.getString("data") : jSONObjectM6316.getString("message");
        }
        C2632.m5294("server return json : null");
        return null;
    }
}
