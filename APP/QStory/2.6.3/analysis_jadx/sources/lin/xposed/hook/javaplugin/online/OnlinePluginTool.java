package lin.xposed.hook.javaplugin.online;

import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import p007.C6125;
import p007.C6127;
import p007.C6131;
import p011.C6203;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class OnlinePluginTool {
    public String url = AbstractC8405.m13972(692);

    public void downloadScript(long j, File file) {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        C6127 c6127 = new C6127();
        C1245 c1245 = new C1245(6);
        c1245.m2151(this.url + AbstractC8405.m13972(694) + j);
        C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(c6131M11634.f16770.m11518());
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
                c6131M11634.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, i);
            bufferedInputStream.close();
            throw th;
        }
    }

    public JSONArray getOnlinePluginList(String str) {
        C6127 c6127 = new C6127(new C6127().m11517());
        C1245 c1245 = new C1245(6);
        c1245.m2151(this.url + AbstractC8405.m13972(693) + str);
        c1245.m2158("GET", null);
        c1245.m2166(AbstractC8405.m13973("喵喵呜呜喵喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵呜喵呜呜喵喵呜~喵呜喵呜呜喵呜喵~喵呜喵呜喵喵喵喵"));
        c1245.m2166(AbstractC8405.m13972(27), AbstractC8405.m13972(28));
        C6131 c6131M11634 = new C6203(c6127, new C6125(c1245)).m11634();
        JSONObject jSONObjectM6374 = InterfaceC2916.m6374(c6131M11634.f16770.m11519());
        c6131M11634.close();
        return jSONObjectM6374.getJSONArray(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"));
    }
}
