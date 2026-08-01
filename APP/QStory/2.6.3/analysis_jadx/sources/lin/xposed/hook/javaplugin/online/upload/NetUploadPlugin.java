package lin.xposed.hook.javaplugin.online.upload;

import android.text.TextUtils;
import androidx.compose.runtime.internal.C1245;
import bsh.C2633;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.AbstractC3066;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.text.Regex;
import lin.xposed.hook.javaplugin.C5554;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import okio.ByteString;
import p004.C6114;
import p007.AbstractC6133;
import p007.C6122;
import p007.C6124;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p007.C6142;
import p007.C6144;
import p011.C6203;
import p013.AbstractC6230;
import p037.AbstractC6371;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class NetUploadPlugin {
    private final String password = AbstractC8405.m13972(695);
    private final String url = AbstractC8405.m13972(692);
    private final String uploadStateUrl = AbstractC8405.m13972(696);
    private final String requestUploadPluginFileUrl = AbstractC8405.m13972(697);
    private final String requestTokenUrl = AbstractC8405.m13972(698);
    private final String requestUploadPluginInfoUrl = AbstractC8405.m13972(699);

    public String requestToken(String str, String str2, int i) {
        C6144 c6144M6711;
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵喵呜~呜呜喵呜喵喵喵喵~呜喵喵喵呜呜呜呜~呜呜呜呜呜喵呜喵~呜呜喵喵呜喵喵呜");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC8405.m13972(700), str);
        jSONObject.put(AbstractC8405.m13972(701), str2);
        jSONObject.put(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"), Integer.valueOf(i));
        C6127 c6127Build = OkHttpClientBuilder.build();
        String strM13972 = AbstractC8405.m13972(702);
        Regex regex = C6144.f16859;
        try {
            c6144M6711 = AbstractC3056.m6711(strM13972);
        } catch (IllegalArgumentException unused) {
            c6144M6711 = null;
        }
        String strM11955 = AbstractC6371.m11955(jSONObject.toString(), AbstractC8405.m13972(695));
        int i2 = AbstractC6133.f16789;
        C6122 c6122M6841 = AbstractC3065.m6841(strM11955, c6144M6711);
        C1245 c1245 = new C1245(6);
        c1245.m2151(AbstractC8405.m13972(698));
        c1245.m2158(AbstractC8405.m13973("喵喵呜喵喵喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵呜呜呜呜喵喵"), c6122M6841);
        c1245.m2166(AbstractC8405.m13972(25), AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
        c1245.m2166(AbstractC8405.m13972(39), AbstractC8405.m13972(702));
        c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
        C6125 c6125 = new C6125(c1245);
        c6127Build.getClass();
        C6131 c6131M11634 = new C6203(c6127Build, c6125).m11634();
        String strReplace = c6131M11634.f16770.m11519().replace(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"), "");
        c6131M11634.close();
        JSONObject jSONObjectM6374 = InterfaceC2916.m6374(AbstractC6371.m11957(strReplace, AbstractC8405.m13972(695)));
        if (jSONObjectM6374 == null) {
            C2633.m5339(AbstractC8405.m13972(703));
            return null;
        }
        if (jSONObjectM6374.getIntValue(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) == 201) {
            return jSONObjectM6374.getString(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"));
        }
        if (jSONObjectM6374.getIntValue(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) != 403) {
            return jSONObjectM6374.getString(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
        }
        C2633.m5339(AbstractC8405.m13972(704));
        return null;
    }

    public String requestUploadState(String str) {
        C6144 c6144M6711;
        C6127 c6127Build = OkHttpClientBuilder.build();
        String strM13972 = AbstractC8405.m13972(702);
        Regex regex = C6144.f16859;
        try {
            c6144M6711 = AbstractC3056.m6711(strM13972);
        } catch (IllegalArgumentException unused) {
            c6144M6711 = null;
        }
        int i = AbstractC6133.f16789;
        C6122 c6122M6841 = AbstractC3065.m6841("", c6144M6711);
        C1245 c1245 = new C1245(6);
        c1245.m2151(AbstractC8405.m13972(696));
        c1245.m2166(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), str);
        c1245.m2158(AbstractC8405.m13973("喵喵呜喵喵喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵呜呜呜呜喵喵"), c6122M6841);
        c1245.m2166(AbstractC8405.m13972(25), AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
        c1245.m2166(AbstractC8405.m13972(39), AbstractC8405.m13972(702));
        c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
        C6125 c6125 = new C6125(c1245);
        c6127Build.getClass();
        C6131 c6131M11634 = new C6203(c6127Build, c6125).m11634();
        String strReplace = c6131M11634.f16770.m11519().replace(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"), "");
        c6131M11634.close();
        JSONObject jSONObjectM6374 = InterfaceC2916.m6374(AbstractC6371.m11957(strReplace, AbstractC8405.m13972(695)));
        if (jSONObjectM6374 != null) {
            return jSONObjectM6374.getIntValue(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) == 200 ? jSONObjectM6374.getString(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜")) : jSONObjectM6374.getString(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
        }
        C2633.m5339(AbstractC8405.m13972(703));
        return null;
    }

    public String uploadPluginFile(String str, File file) {
        C6144 c6144M6711;
        C6127 c6127Build = OkHttpClientBuilder.build();
        String string = UUID.randomUUID().toString();
        string.getClass();
        ByteString.Companion.getClass();
        ByteString byteStringM11510 = C6114.m11510(string);
        C6144 c6144 = C6142.f16819;
        ArrayList arrayList = new ArrayList();
        C6144 c61442 = C6142.f16821;
        c61442.getClass();
        if (!c61442.f16861.equals("multipart")) {
            C5554.m10872(c61442, "multipart != ");
            return null;
        }
        String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜");
        String name = file.getName();
        int i = AbstractC6133.f16789;
        String strM13972 = AbstractC8405.m13972(710);
        Regex regex = C6144.f16859;
        try {
            c6144M6711 = AbstractC3056.m6711(strM13972);
        } catch (IllegalArgumentException unused) {
            c6144M6711 = null;
        }
        arrayList.add(AbstractC3066.m6864(strM13973, name, new C6124(c6144M6711, file)));
        if (arrayList.isEmpty()) {
            C5925.m11311("Multipart body must have at least one part.");
            return null;
        }
        C6142 c6142 = new C6142(byteStringM11510, c61442, AbstractC6230.m11703(arrayList));
        C1245 c1245 = new C1245(6);
        c1245.m2151(AbstractC8405.m13972(697));
        c1245.m2158("POST", c6142);
        c1245.m2166(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), str);
        c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
        c1245.m2166(AbstractC8405.m13972(39), AbstractC8405.m13972(711));
        C6125 c6125 = new C6125(c1245);
        c6127Build.getClass();
        C6131 c6131M11634 = new C6203(c6127Build, c6125).m11634();
        String strM11519 = c6131M11634.f16770.m11519();
        c6131M11634.close();
        JSONObject jSONObjectM6374 = InterfaceC2916.m6374(strM11519);
        if (jSONObjectM6374 != null) {
            return jSONObjectM6374.getIntValue(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) == 200 ? jSONObjectM6374.getString(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜")) : jSONObjectM6374.getString(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
        }
        C2633.m5339(AbstractC8405.m13972(703));
        return null;
    }

    public String uploadPluginInfo(String str, PluginInfo pluginInfo) {
        C6144 c6144M6711;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC8405.m13972(629), pluginInfo.getPluginID());
        jSONObject.put(AbstractC8405.m13972(705), pluginInfo.getPluginName());
        jSONObject.put(AbstractC8405.m13972(706), pluginInfo.getPluginAuthor());
        jSONObject.put(AbstractC8405.m13972(707), pluginInfo.getPluginVersion());
        jSONObject.put(AbstractC8405.m13972(708), pluginInfo.getPluginDesc());
        jSONObject.put(AbstractC8405.m13972(709), pluginInfo.getDate());
        C6127 c6127Build = OkHttpClientBuilder.build();
        String strM13972 = AbstractC8405.m13972(702);
        Regex regex = C6144.f16859;
        try {
            c6144M6711 = AbstractC3056.m6711(strM13972);
        } catch (IllegalArgumentException unused) {
            c6144M6711 = null;
        }
        int i = AbstractC6133.f16789;
        C6122 c6122M6841 = AbstractC3065.m6841(AbstractC6371.m11955(jSONObject.toString(), AbstractC8405.m13972(695)), c6144M6711);
        C1245 c1245 = new C1245(6);
        c1245.m2151(AbstractC8405.m13972(699));
        c1245.m2158(AbstractC8405.m13973("喵喵呜喵喵喵呜呜~喵喵呜呜呜喵呜喵~喵喵呜喵呜喵喵呜~喵喵呜呜呜呜喵喵"), c6122M6841);
        c1245.m2166(AbstractC8405.m13972(39), AbstractC8405.m13972(702));
        c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
        c1245.m2166(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), str);
        C6125 c6125 = new C6125(c1245);
        c6127Build.getClass();
        C6131 c6131M11634 = new C6203(c6127Build, c6125).m11634();
        String strReplace = c6131M11634.f16770.m11519().replace(AbstractC8405.m13973("喵呜喵呜喵喵喵呜"), "");
        c6131M11634.close();
        JSONObject jSONObjectM6374 = InterfaceC2916.m6374(AbstractC6371.m11957(strReplace, AbstractC8405.m13972(695)));
        if (jSONObjectM6374 != null) {
            return jSONObjectM6374.getIntValue(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜"), 403) == 200 ? jSONObjectM6374.getString(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜")) : jSONObjectM6374.getString(AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵喵呜喵喵"));
        }
        C2633.m5339(AbstractC8405.m13972(703));
        return null;
    }
}
