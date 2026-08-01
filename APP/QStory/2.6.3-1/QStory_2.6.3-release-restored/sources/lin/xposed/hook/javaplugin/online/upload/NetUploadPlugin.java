package lin.xposed.hook.javaplugin.online.upload;

import android.text.TextUtils;
import androidx.compose.runtime.internal.C2080;
import bsh.C3466;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.AbstractC3898;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.C6385;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import okio.ByteString;
import p020.C6943;
import p023.AbstractC6962;
import p023.C6951;
import p023.C6953;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p023.C6971;
import p023.C6973;
import p027.C7032;
import p029.AbstractC7059;
import p053.AbstractC7200;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class NetUploadPlugin {
    private final String password = "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR";
    private final String url = "https://plugin.sacz.top";
    private final String uploadStateUrl = "https://plugin.sacz.top/plugin-upload/confirmUploadStatus";
    private final String requestUploadPluginFileUrl = "https://plugin.sacz.top/plugin-upload/uploadFile";
    private final String requestTokenUrl = "https://plugin.sacz.top/plugin-upload/readyToUpload";
    private final String requestUploadPluginInfoUrl = "https://plugin.sacz.top/plugin-upload/uploadInfo";

    public String requestToken(String str, String str2, int i) {
        C6973 c6973M7271;
        if (TextUtils.isEmpty(str2)) {
            str2 = "未知";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uploaderUin", str);
        jSONObject.put("uploaderNickName", str2);
        jSONObject.put("type", Integer.valueOf(i));
        C6956 c6956Build = OkHttpClientBuilder.build();
        String strM14531 = "text/plain";
        Regex regex = C6973.f17204;
        try {
            c6973M7271 = AbstractC3888.m7271(strM14531);
        } catch (IllegalArgumentException unused) {
            c6973M7271 = null;
        }
        String strM12514 = AbstractC7200.m12514(jSONObject.toString(), "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR");
        int i2 = AbstractC6962.f17134;
        C6951 c6951M7401 = AbstractC3897.m7401(strM12514, c6973M7271);
        C2080 c2080 = new C2080(6);
        c2080.m2711("https://plugin.sacz.top/plugin-upload/readyToUpload");
        c2080.m2718("POST", c6951M7401);
        c2080.m2726("User-Agent", "Android");
        c2080.m2726("Content-Type", "text/plain");
        c2080.m2726("Accept", "*/*");
        c2080.m2726("Connection", "keep-alive");
        C6954 c6954 = new C6954(c2080);
        c6956Build.getClass();
        C6960 c6960M12193 = new C7032(c6956Build, c6954).m12193();
        String strReplace = c6960M12193.f17115.m12078().replace("\"", "");
        c6960M12193.close();
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7200.m12516(strReplace, "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR"));
        if (jSONObjectM6934 == null) {
            C3466.m5899("server return json : null");
            return null;
        }
        if (jSONObjectM6934.getIntValue("code", 403) == 201) {
            return jSONObjectM6934.getString("data");
        }
        if (jSONObjectM6934.getIntValue("code", 403) != 403) {
            return jSONObjectM6934.getString("message");
        }
        C3466.m5899("Don't upload frequently(请勿频繁上传)");
        return null;
    }

    public String requestUploadState(String str) {
        C6973 c6973M7271;
        C6956 c6956Build = OkHttpClientBuilder.build();
        String strM14531 = "text/plain";
        Regex regex = C6973.f17204;
        try {
            c6973M7271 = AbstractC3888.m7271(strM14531);
        } catch (IllegalArgumentException unused) {
            c6973M7271 = null;
        }
        int i = AbstractC6962.f17134;
        C6951 c6951M7401 = AbstractC3897.m7401("", c6973M7271);
        C2080 c2080 = new C2080(6);
        c2080.m2711("https://plugin.sacz.top/plugin-upload/confirmUploadStatus");
        c2080.m2726("token", str);
        c2080.m2718("POST", c6951M7401);
        c2080.m2726("User-Agent", "Android");
        c2080.m2726("Content-Type", "text/plain");
        c2080.m2726("Accept", "*/*");
        c2080.m2726("Connection", "keep-alive");
        C6954 c6954 = new C6954(c2080);
        c6956Build.getClass();
        C6960 c6960M12193 = new C7032(c6956Build, c6954).m12193();
        String strReplace = c6960M12193.f17115.m12078().replace("\"", "");
        c6960M12193.close();
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7200.m12516(strReplace, "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR"));
        if (jSONObjectM6934 != null) {
            return jSONObjectM6934.getIntValue("code", 403) == 200 ? jSONObjectM6934.getString("data") : jSONObjectM6934.getString("message");
        }
        C3466.m5899("server return json : null");
        return null;
    }

    public String uploadPluginFile(String str, File file) {
        C6973 c6973M7271;
        C6956 c6956Build = OkHttpClientBuilder.build();
        String string = UUID.randomUUID().toString();
        string.getClass();
        ByteString.Companion.getClass();
        ByteString byteStringM12069 = C6943.m12069(string);
        C6973 c6973 = C6971.f17164;
        ArrayList arrayList = new ArrayList();
        C6973 c69732 = C6971.f17166;
        c69732.getClass();
        if (!c69732.f17206.equals("multipart")) {
            C6385.m11431(c69732, "multipart != ");
            return null;
        }
        String strM14532 = "file";
        String name = file.getName();
        int i = AbstractC6962.f17134;
        String strM14531 = "application/octet-stream";
        Regex regex = C6973.f17204;
        try {
            c6973M7271 = AbstractC3888.m7271(strM14531);
        } catch (IllegalArgumentException unused) {
            c6973M7271 = null;
        }
        arrayList.add(AbstractC3898.m7424(strM14532, name, new C6953(c6973M7271, file)));
        if (arrayList.isEmpty()) {
            C6755.m11870("Multipart body must have at least one part.");
            return null;
        }
        C6971 c6971 = new C6971(byteStringM12069, c69732, AbstractC7059.m12262(arrayList));
        C2080 c2080 = new C2080(6);
        c2080.m2711("https://plugin.sacz.top/plugin-upload/uploadFile");
        c2080.m2718("POST", c6971);
        c2080.m2726("token", str);
        c2080.m2726("Accept", "*/*");
        c2080.m2726("Connection", "keep-alive");
        c2080.m2726("Content-Type", "multipart/form-data; boundary=--------------------------237281582881051963083898");
        C6954 c6954 = new C6954(c2080);
        c6956Build.getClass();
        C6960 c6960M12193 = new C7032(c6956Build, c6954).m12193();
        String strM12078 = c6960M12193.f17115.m12078();
        c6960M12193.close();
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(strM12078);
        if (jSONObjectM6934 != null) {
            return jSONObjectM6934.getIntValue("code", 403) == 200 ? jSONObjectM6934.getString("data") : jSONObjectM6934.getString("message");
        }
        C3466.m5899("server return json : null");
        return null;
    }

    public String uploadPluginInfo(String str, PluginInfo pluginInfo) {
        C6973 c6973M7271;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pluginID", pluginInfo.getPluginID());
        jSONObject.put("pluginName", pluginInfo.getPluginName());
        jSONObject.put("pluginAuthor", pluginInfo.getPluginAuthor());
        jSONObject.put("pluginVersion", pluginInfo.getPluginVersion());
        jSONObject.put("pluginDesc", pluginInfo.getPluginDesc());
        jSONObject.put("pluginTime", pluginInfo.getDate());
        C6956 c6956Build = OkHttpClientBuilder.build();
        String strM14531 = "text/plain";
        Regex regex = C6973.f17204;
        try {
            c6973M7271 = AbstractC3888.m7271(strM14531);
        } catch (IllegalArgumentException unused) {
            c6973M7271 = null;
        }
        int i = AbstractC6962.f17134;
        C6951 c6951M7401 = AbstractC3897.m7401(AbstractC7200.m12514(jSONObject.toString(), "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR"), c6973M7271);
        C2080 c2080 = new C2080(6);
        c2080.m2711("https://plugin.sacz.top/plugin-upload/uploadInfo");
        c2080.m2718("POST", c6951M7401);
        c2080.m2726("Content-Type", "text/plain");
        c2080.m2726("Accept", "*/*");
        c2080.m2726("Connection", "keep-alive");
        c2080.m2726("token", str);
        C6954 c6954 = new C6954(c2080);
        c6956Build.getClass();
        C6960 c6960M12193 = new C7032(c6956Build, c6954).m12193();
        String strReplace = c6960M12193.f17115.m12078().replace("\"", "");
        c6960M12193.close();
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7200.m12516(strReplace, "N5ETOHF7D5SCZ5X52BQV9OV5P0I603AR"));
        if (jSONObjectM6934 != null) {
            return jSONObjectM6934.getIntValue("code", 403) == 200 ? jSONObjectM6934.getString("data") : jSONObjectM6934.getString("message");
        }
        C3466.m5899("server return json : null");
        return null;
    }
}
