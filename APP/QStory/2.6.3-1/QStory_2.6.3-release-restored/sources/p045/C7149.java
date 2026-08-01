package p045;

import com.alibaba.fastjson2.JSONObject;
import io.ktor.client.plugins.AbstractC4765;
import kotlin.reflect.jvm.internal.AbstractC5894;

/* JADX INFO: renamed from: 飘花落叶言世哲子兰苏楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7149 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public JSONObject f17776;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17777;

    public C7149(String str) {
        this.f17777 = str;
        mo12396();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo12394() {
        try {
            AbstractC5894.m10615(mo12397(), this.f17776.toString(), false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12395(Object obj, String str) {
        this.f17776.put(str, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo12396() {
        try {
            this.f17776 = JSONObject.parseObject(AbstractC5894.m10587(mo12397()));
        } catch (Exception unused) {
            this.f17776 = new JSONObject();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String mo12397() {
        return AbstractC4765.m8874() + "/data/simple/" + this.f17777;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m12398(String str) {
        try {
            return this.f17776.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m12399(Object obj, String str) {
        try {
            if (!this.f17776.containsKey(str)) {
                m12395(obj, str);
            }
            return this.f17776.get(str);
        } catch (Exception unused) {
            return obj;
        }
    }
}
