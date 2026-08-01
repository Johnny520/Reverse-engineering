package lin.xposed.hook.javaplugin.online;

import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import p007.AbstractC6136;
import p013.C6177;
import p015.C6198;
import p015.C6200;
import p015.C6204;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class OnlinePluginTool {
    public String url = "https://plugin.sacz.top";

    public void downloadScript(long j, File file) {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        C6200 c6200 = new C6200();
        C1245 c1245 = new C1245(6);
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11531(sb, this.url, -3937628705707525543L);
        sb.append(j);
        c1245.m2141(sb.toString());
        C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(c6204M11615.f17009.m11647());
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bArr = new byte[2048];
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
                c6204M11615.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, i);
            bufferedInputStream.close();
            throw th;
        }
    }

    public JSONArray getOnlinePluginList(String str) {
        C6200 c6200 = new C6200(new C6200().m11646());
        C1245 c1245 = new C1245(6);
        c1245.m2141(this.url + "/plugin/get-online-plugin-list/" + str);
        c1245.m2148("GET", null);
        c1245.m2156("Accept", "*/*");
        c1245.m2156("Connection", "keep-alive");
        C6204 c6204M11615 = new C6177(c6200, new C6198(c1245)).m11615();
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(c6204M11615.f17009.m11648());
        c6204M11615.close();
        return jSONObjectM6316.getJSONArray("data");
    }
}
