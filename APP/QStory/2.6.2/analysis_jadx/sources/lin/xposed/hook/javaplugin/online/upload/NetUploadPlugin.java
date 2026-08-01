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
    private final String password = AbstractC3056.m6668(-3937628581153473959L);
    private final String url = AbstractC3056.m6668(-3937629014945170855L);
    private final String uploadStateUrl = AbstractC3056.m6668(-3937628448009487783L);
    private final String requestUploadPluginFileUrl = AbstractC3056.m6668(-3937628250440992167L);
    private final String requestTokenUrl = AbstractC3056.m6668(-3937628048577529255L);
    private final String requestUploadPluginInfoUrl = AbstractC3056.m6668(-3937627756519753127L);

    public String requestToken(String str, String str2, int i) {
        C6217 c6217M13679;
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC3056.m6668(-3937627554656290215L);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC3056.m6668(-3937627533181453735L), str);
        jSONObject.put(AbstractC3056.m6668(-3937627481641846183L), str2);
        jSONObject.put(AbstractC3056.m6668(-3937627417217336743L), Integer.valueOf(i));
        C6200 c6200Build = OkHttpClientBuilder.build();
        String strM6668 = AbstractC3056.m6668(-3937627404332434855L);
        Regex regex = C6217.f17098;
        try {
            c6217M13679 = AbstractC8189.m13679(strM6668);
        } catch (IllegalArgumentException unused) {
            c6217M13679 = null;
        }
        String strM11907 = AbstractC6354.m11907(jSONObject.toString(), AbstractC3056.m6668(-3937628581153473959L));
        int i2 = AbstractC6206.f17028;
        C6195 c6195M14360 = C8675.m14360(strM11907, c6217M13679);
        C1245 c1245 = new C1245(6);
        c1245.m2141(AbstractC3056.m6668(-3937628048577529255L));
        c1245.m2148(AbstractC3056.m6668(-3937557581049103783L), c6195M14360);
        c1245.m2156(AbstractC3056.m6668(-3937559956166018471L), AbstractC3056.m6668(-3937627348497860007L));
        c1245.m2156(AbstractC3056.m6668(-3937557503739692455L), AbstractC3056.m6668(-3937627404332434855L));
        c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
        c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
        C6198 c6198 = new C6198(c1245);
        c6200Build.getClass();
        C6204 c6204M11615 = new C6177(c6200Build, c6198).m11615();
        String strReplace = c6204M11615.f17009.m11648().replace(AbstractC3056.m6668(-3937557258926556583L), AbstractC3056.m6668(-3937561979095614887L));
        c6204M11615.close();
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6354.m11909(strReplace, AbstractC3056.m6668(-3937628581153473959L)));
        if (jSONObjectM6316 == null) {
            C2632.m5294(AbstractC3056.m6668(-3937627382857598375L));
            return null;
        }
        if (jSONObjectM6316.getIntValue(AbstractC3056.m6668(-3937627185289102759L), 403) == 201) {
            return jSONObjectM6316.getString(AbstractC3056.m6668(-3937589565670557095L));
        }
        if (jSONObjectM6316.getIntValue(AbstractC3056.m6668(-3937627185289102759L), 403) != 403) {
            return jSONObjectM6316.getString(AbstractC3056.m6668(-3937627103684724135L));
        }
        C2632.m5294(AbstractC3056.m6668(-3937627241123677607L));
        return null;
    }

    public String requestUploadState(String str) {
        C6217 c6217M13679;
        C6200 c6200Build = OkHttpClientBuilder.build();
        String strM6668 = AbstractC3056.m6668(-3937627404332434855L);
        Regex regex = C6217.f17098;
        try {
            c6217M13679 = AbstractC8189.m13679(strM6668);
        } catch (IllegalArgumentException unused) {
            c6217M13679 = null;
        }
        int i = AbstractC6206.f17028;
        C6195 c6195M14360 = C8675.m14360(AbstractC3056.m6668(-3937561979095614887L), c6217M13679);
        C1245 c1245 = new C1245(6);
        c1245.m2141(AbstractC3056.m6668(-3937628448009487783L));
        c1245.m2156(AbstractC3056.m6668(-3937626811626948007L), str);
        c1245.m2148(AbstractC3056.m6668(-3937557581049103783L), c6195M14360);
        c1245.m2156(AbstractC3056.m6668(-3937559956166018471L), AbstractC3056.m6668(-3937627348497860007L));
        c1245.m2156(AbstractC3056.m6668(-3937557503739692455L), AbstractC3056.m6668(-3937627404332434855L));
        c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
        c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
        C6198 c6198 = new C6198(c1245);
        c6200Build.getClass();
        C6204 c6204M11615 = new C6177(c6200Build, c6198).m11615();
        String strReplace = c6204M11615.f17009.m11648().replace(AbstractC3056.m6668(-3937557258926556583L), AbstractC3056.m6668(-3937561979095614887L));
        c6204M11615.close();
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6354.m11909(strReplace, AbstractC3056.m6668(-3937628581153473959L)));
        if (jSONObjectM6316 != null) {
            return jSONObjectM6316.getIntValue(AbstractC3056.m6668(-3937627185289102759L), 403) == 200 ? jSONObjectM6316.getString(AbstractC3056.m6668(-3937589565670557095L)) : jSONObjectM6316.getString(AbstractC3056.m6668(-3937627103684724135L));
        }
        C2632.m5294(AbstractC3056.m6668(-3937627382857598375L));
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
        String strM6668 = AbstractC3056.m6668(-3937626734317536679L);
        String name = file.getName();
        int i = AbstractC6206.f17028;
        String strM66682 = AbstractC3056.m6668(-3937626755792373159L);
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
        c1245.m2141(AbstractC3056.m6668(-3937628250440992167L));
        c1245.m2148("POST", c6215);
        c1245.m2156(AbstractC3056.m6668(-3937626811626948007L), str);
        c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
        c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
        c1245.m2156(AbstractC3056.m6668(-3937557503739692455L), AbstractC3056.m6668(-3937626588288648615L));
        C6198 c6198 = new C6198(c1245);
        c6200Build.getClass();
        C6204 c6204M11615 = new C6177(c6200Build, c6198).m11615();
        String strM11648 = c6204M11615.f17009.m11648();
        c6204M11615.close();
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(strM11648);
        if (jSONObjectM6316 != null) {
            return jSONObjectM6316.getIntValue(AbstractC3056.m6668(-3937627185289102759L), 403) == 200 ? jSONObjectM6316.getString(AbstractC3056.m6668(-3937589565670557095L)) : jSONObjectM6316.getString(AbstractC3056.m6668(-3937627103684724135L));
        }
        C2632.m5294(AbstractC3056.m6668(-3937627382857598375L));
        return null;
    }

    public String uploadPluginInfo(String str, PluginInfo pluginInfo) {
        C6217 c6217M13679;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC3056.m6668(-3937616039848969639L), pluginInfo.getPluginID());
        jSONObject.put(AbstractC3056.m6668(-3937627000605509031L), pluginInfo.getPluginName());
        jSONObject.put(AbstractC3056.m6668(-3937627013490410919L), pluginInfo.getPluginAuthor());
        jSONObject.put(AbstractC3056.m6668(-3937626966245770663L), pluginInfo.getPluginVersion());
        jSONObject.put(AbstractC3056.m6668(-3937626854576620967L), pluginInfo.getPluginDesc());
        jSONObject.put(AbstractC3056.m6668(-3937626798742046119L), pluginInfo.getDate());
        C6200 c6200Build = OkHttpClientBuilder.build();
        String strM6668 = AbstractC3056.m6668(-3937627404332434855L);
        Regex regex = C6217.f17098;
        try {
            c6217M13679 = AbstractC8189.m13679(strM6668);
        } catch (IllegalArgumentException unused) {
            c6217M13679 = null;
        }
        int i = AbstractC6206.f17028;
        C6195 c6195M14360 = C8675.m14360(AbstractC6354.m11907(jSONObject.toString(), AbstractC3056.m6668(-3937628581153473959L)), c6217M13679);
        C1245 c1245 = new C1245(6);
        c1245.m2141(AbstractC3056.m6668(-3937627756519753127L));
        c1245.m2148(AbstractC3056.m6668(-3937557581049103783L), c6195M14360);
        c1245.m2156(AbstractC3056.m6668(-3937557503739692455L), AbstractC3056.m6668(-3937627404332434855L));
        c1245.m2156(AbstractC3056.m6668(-3937559419295106471L), AbstractC3056.m6668(-3937559311920924071L));
        c1245.m2156(AbstractC3056.m6668(-3937559294741054887L), AbstractC3056.m6668(-3937559238906480039L));
        c1245.m2156(AbstractC3056.m6668(-3937626811626948007L), str);
        C6198 c6198 = new C6198(c1245);
        c6200Build.getClass();
        C6204 c6204M11615 = new C6177(c6200Build, c6198).m11615();
        String strReplace = c6204M11615.f17009.m11648().replace(AbstractC3056.m6668(-3937557258926556583L), AbstractC3056.m6668(-3937561979095614887L));
        c6204M11615.close();
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6354.m11909(strReplace, AbstractC3056.m6668(-3937628581153473959L)));
        if (jSONObjectM6316 != null) {
            return jSONObjectM6316.getIntValue(AbstractC3056.m6668(-3937627185289102759L), 403) == 200 ? jSONObjectM6316.getString(AbstractC3056.m6668(-3937589565670557095L)) : jSONObjectM6316.getString(AbstractC3056.m6668(-3937627103684724135L));
        }
        C2632.m5294(AbstractC3056.m6668(-3937627382857598375L));
        return null;
    }
}
