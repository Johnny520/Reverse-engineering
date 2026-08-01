package p028;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3932;

/* JADX INFO: renamed from: 飘花落叶言世哲子兰苏楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6301 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public JSONObject f17382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17383;

    public C6301(String str) {
        this.f17383 = str;
        mo11809();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void mo11807() {
        try {
            AbstractC0455.m1145(mo11810(), this.f17382.toString(), false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11808(Object obj, String str) {
        this.f17382.put(str, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo11809() {
        try {
            this.f17382 = JSONObject.parseObject(AbstractC0455.m1142(mo11810()));
        } catch (Exception unused) {
            this.f17382 = new JSONObject();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String mo11810() {
        return AbstractC3932.m8313() + AbstractC3056.m6668(-3937561880311367079L) + this.f17383;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m11811(String str) {
        try {
            return this.f17382.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m11812(Object obj, String str) {
        try {
            if (!this.f17382.containsKey(str)) {
                m11808(obj, str);
            }
            return this.f17382.get(str);
        } catch (Exception unused) {
            return obj;
        }
    }
}
