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
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class NetUploadPlugin {
    private final String password = AbstractC9234.m14531(695);
    private final String url = AbstractC9234.m14531(692);
    private final String uploadStateUrl = AbstractC9234.m14531(696);
    private final String requestUploadPluginFileUrl = AbstractC9234.m14531(697);
    private final String requestTokenUrl = AbstractC9234.m14531(698);
    private final String requestUploadPluginInfoUrl = AbstractC9234.m14531(699);

    public String requestToken(String str, String str2, int i) {
        C6973 c6973M7271;
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜喵呜喵喵喵喵~呜喵喵喵呜呜呜呜~呜呜呜呜呜喵呜喵~呜呜喵喵呜喵喵呜");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC9234.m14531(700), str);
        jSONObject.put(AbstractC9234.m14531(701), str2);
        jSONObject.put(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"), Integer.valueOf(i));
        C6956 c6956Build = OkHttpClientBuilder.build();
        String strM14531 = AbstractC9234.m14531(702);
        Regex regex = C6973.f17204;
        try {
            c6973M7271 = AbstractC3888.m7271(strM14531);
        } catch (IllegalArgumentException unused) {
            c6973M7271 = null;
        }
        String strM12514 = AbstractC7200.m12514(jSONObject.toString(), AbstractC9234.m14531(695));
        int i2 = AbstractC6962.f17134;
        C6951 c6951M7401 = AbstractC3897.m7401(strM12514, c6973M7271);
        C2080 c2080 = new C2080(6);
        c2080.m2711(AbstractC9234.m14531(698));
        c2080.m2718(AbstractC9234.m14532("喵喵呜喵喵喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵呜呜呜呜喵喵"), c6951M7401);
        c2080.m2726(AbstractC9234.m14531(25), AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
        c2080.m2726(AbstractC9234.m14531(39), AbstractC9234.m14531(702));
        c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
        C6954 c6954 = new C6954(c2080);
        c6956Build.getClass();
        C6960 c6960M12193 = new C7032(c6956Build, c6954).m12193();
        String strReplace = c6960M12193.f17115.m12078().replace(AbstractC9234.m14532("喵呜喵呜喵喵喵呜"), "");
        c6960M12193.close();
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7200.m12516(strReplace, AbstractC9234.m14531(695)));
        if (jSONObjectM6934 == null) {
            C3466.m5899(AbstractC9234.m14531(703));
            return null;
        }
        if (jSONObjectM6934.getIntValue(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) == 201) {
            return jSONObjectM6934.getString(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"));
        }
        if (jSONObjectM6934.getIntValue(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) != 403) {
            return jSONObjectM6934.getString(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
        }
        C3466.m5899(AbstractC9234.m14531(704));
        return null;
    }

    public String requestUploadState(String str) {
        C6973 c6973M7271;
        C6956 c6956Build = OkHttpClientBuilder.build();
        String strM14531 = AbstractC9234.m14531(702);
        Regex regex = C6973.f17204;
        try {
            c6973M7271 = AbstractC3888.m7271(strM14531);
        } catch (IllegalArgumentException unused) {
            c6973M7271 = null;
        }
        int i = AbstractC6962.f17134;
        C6951 c6951M7401 = AbstractC3897.m7401("", c6973M7271);
        C2080 c2080 = new C2080(6);
        c2080.m2711(AbstractC9234.m14531(696));
        c2080.m2726(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), str);
        c2080.m2718(AbstractC9234.m14532("喵喵呜喵喵喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵呜呜呜呜喵喵"), c6951M7401);
        c2080.m2726(AbstractC9234.m14531(25), AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
        c2080.m2726(AbstractC9234.m14531(39), AbstractC9234.m14531(702));
        c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
        C6954 c6954 = new C6954(c2080);
        c6956Build.getClass();
        C6960 c6960M12193 = new C7032(c6956Build, c6954).m12193();
        String strReplace = c6960M12193.f17115.m12078().replace(AbstractC9234.m14532("喵呜喵呜喵喵喵呜"), "");
        c6960M12193.close();
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7200.m12516(strReplace, AbstractC9234.m14531(695)));
        if (jSONObjectM6934 != null) {
            return jSONObjectM6934.getIntValue(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) == 200 ? jSONObjectM6934.getString(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜")) : jSONObjectM6934.getString(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
        }
        C3466.m5899(AbstractC9234.m14531(703));
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
        String strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜");
        String name = file.getName();
        int i = AbstractC6962.f17134;
        String strM14531 = AbstractC9234.m14531(710);
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
        c2080.m2711(AbstractC9234.m14531(697));
        c2080.m2718("POST", c6971);
        c2080.m2726(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), str);
        c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
        c2080.m2726(AbstractC9234.m14531(39), AbstractC9234.m14531(711));
        C6954 c6954 = new C6954(c2080);
        c6956Build.getClass();
        C6960 c6960M12193 = new C7032(c6956Build, c6954).m12193();
        String strM12078 = c6960M12193.f17115.m12078();
        c6960M12193.close();
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(strM12078);
        if (jSONObjectM6934 != null) {
            return jSONObjectM6934.getIntValue(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) == 200 ? jSONObjectM6934.getString(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜")) : jSONObjectM6934.getString(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
        }
        C3466.m5899(AbstractC9234.m14531(703));
        return null;
    }

    public String uploadPluginInfo(String str, PluginInfo pluginInfo) {
        C6973 c6973M7271;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC9234.m14531(629), pluginInfo.getPluginID());
        jSONObject.put(AbstractC9234.m14531(705), pluginInfo.getPluginName());
        jSONObject.put(AbstractC9234.m14531(706), pluginInfo.getPluginAuthor());
        jSONObject.put(AbstractC9234.m14531(707), pluginInfo.getPluginVersion());
        jSONObject.put(AbstractC9234.m14531(708), pluginInfo.getPluginDesc());
        jSONObject.put(AbstractC9234.m14531(709), pluginInfo.getDate());
        C6956 c6956Build = OkHttpClientBuilder.build();
        String strM14531 = AbstractC9234.m14531(702);
        Regex regex = C6973.f17204;
        try {
            c6973M7271 = AbstractC3888.m7271(strM14531);
        } catch (IllegalArgumentException unused) {
            c6973M7271 = null;
        }
        int i = AbstractC6962.f17134;
        C6951 c6951M7401 = AbstractC3897.m7401(AbstractC7200.m12514(jSONObject.toString(), AbstractC9234.m14531(695)), c6973M7271);
        C2080 c2080 = new C2080(6);
        c2080.m2711(AbstractC9234.m14531(699));
        c2080.m2718(AbstractC9234.m14532("喵喵呜喵喵喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵呜呜呜呜喵喵"), c6951M7401);
        c2080.m2726(AbstractC9234.m14531(39), AbstractC9234.m14531(702));
        c2080.m2726(AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c2080.m2726(AbstractC9234.m14531(27), AbstractC9234.m14531(28));
        c2080.m2726(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), str);
        C6954 c6954 = new C6954(c2080);
        c6956Build.getClass();
        C6960 c6960M12193 = new C7032(c6956Build, c6954).m12193();
        String strReplace = c6960M12193.f17115.m12078().replace(AbstractC9234.m14532("喵呜喵呜喵喵喵呜"), "");
        c6960M12193.close();
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7200.m12516(strReplace, AbstractC9234.m14531(695)));
        if (jSONObjectM6934 != null) {
            return jSONObjectM6934.getIntValue(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) == 200 ? jSONObjectM6934.getString(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜")) : jSONObjectM6934.getString(AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
        }
        C3466.m5899(AbstractC9234.m14531(703));
        return null;
    }
}
