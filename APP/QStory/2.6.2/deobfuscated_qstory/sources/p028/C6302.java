package p028;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import java.io.File;
import p035.AbstractC6340;
import p036.AbstractC6354;

/* JADX INFO: renamed from: 飘花落叶言世哲子兰苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6302 extends C6301 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17384;

    public C6302(String str, String str2) {
        super(str);
        this.f17384 = str2;
        try {
            this.f17382 = InterfaceC2915.m6316(new String(AbstractC6354.m11908(str2, AbstractC0455.m1144(new File(mo11810())))));
        } catch (Exception unused) {
            this.f17382 = new JSONObject();
        }
    }

    @Override // p028.C6301
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo11807() {
        AbstractC0455.m1146(mo11810(), AbstractC6354.m11906(this.f17384, this.f17382.toString().getBytes()));
    }

    @Override // p028.C6301
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11810() {
        return AbstractC6340.f17460.getDataDir() + "/databases/" + this.f17383;
    }

    @Override // p028.C6301
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11809() {
    }
}
