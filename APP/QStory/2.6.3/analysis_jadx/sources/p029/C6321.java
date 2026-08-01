package p029;

import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONObject;
import java.io.File;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p036.AbstractC6358;
import p037.AbstractC6371;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲子兰苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6321 extends C6320 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17433;

    public C6321(String str, String str2) {
        super(str);
        this.f17433 = str2;
        try {
            this.f17431 = InterfaceC2916.m6374(new String(AbstractC6371.m11956(str2, AbstractC5062.m10029(new File(mo11838())))));
        } catch (Exception unused) {
            this.f17431 = new JSONObject();
        }
    }

    @Override // p029.C6320
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo11835() {
        AbstractC5062.m10011(mo11838(), AbstractC6371.m11954(this.f17433, this.f17431.toString().getBytes()));
    }

    @Override // p029.C6320
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo11838() {
        return AbstractC6358.f17507.getDataDir() + AbstractC8405.m13972(7) + this.f17432;
    }

    @Override // p029.C6320
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11837() {
    }
}
