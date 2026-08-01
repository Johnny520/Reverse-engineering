package p029;

import com.alibaba.fastjson2.JSONObject;
import io.ktor.client.plugins.AbstractC3933;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲子兰苏楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6320 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public JSONObject f17431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17432;

    public C6320(String str) {
        this.f17432 = str;
        mo11837();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo11835() {
        try {
            AbstractC5062.m10056(mo11838(), this.f17431.toString(), false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11836(Object obj, String str) {
        this.f17431.put(str, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo11837() {
        try {
            this.f17431 = JSONObject.parseObject(AbstractC5062.m10028(mo11838()));
        } catch (Exception unused) {
            this.f17431 = new JSONObject();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String mo11838() {
        return AbstractC3933.m8315() + AbstractC8405.m13972(8) + this.f17432;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m11839(String str) {
        try {
            return this.f17431.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m11840(Object obj, String str) {
        try {
            if (!this.f17431.containsKey(str)) {
                m11836(obj, str);
            }
            return this.f17431.get(str);
        } catch (Exception unused) {
            return obj;
        }
    }
}
