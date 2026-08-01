package lin.xposed.hook.javaplugin.online;

import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import p023.C6954;
import p023.C6956;
import p023.C6960;
import p027.C7032;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        C6956 c6956 = new C6956();
        C2080 c2080 = new C2080(6);
        c2080.m2711(this.url + "/plugin/downloadPlugin?id=" + j);
        C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(c6960M12193.f17115.m12077());
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
                c6960M12193.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, i);
            bufferedInputStream.close();
            throw th;
        }
    }

    public JSONArray getOnlinePluginList(String str) {
        C6956 c6956 = new C6956(new C6956().m12076());
        C2080 c2080 = new C2080(6);
        c2080.m2711(this.url + "/plugin/get-online-plugin-list/" + str);
        c2080.m2718("GET", null);
        c2080.m2726("Accept", "*/*");
        c2080.m2726("Connection", "keep-alive");
        C6960 c6960M12193 = new C7032(c6956, new C6954(c2080)).m12193();
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(c6960M12193.f17115.m12078());
        c6960M12193.close();
        return jSONObjectM6934.getJSONArray("data");
    }
}
