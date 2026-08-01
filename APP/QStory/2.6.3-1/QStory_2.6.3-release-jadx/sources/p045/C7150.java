package p045;

import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONObject;
import java.io.File;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p052.AbstractC7187;
import p053.AbstractC7200;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲子兰苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7150 extends C7149 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f17778;

    public C7150(String str, String str2) {
        super(str);
        this.f17778 = str2;
        try {
            this.f17776 = InterfaceC3749.m6934(new String(AbstractC7200.m12515(str2, AbstractC5894.m10588(new File(mo12397())))));
        } catch (Exception unused) {
            this.f17776 = new JSONObject();
        }
    }

    @Override // p045.C7149
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12394() {
        AbstractC5894.m10570(mo12397(), AbstractC7200.m12513(this.f17778, this.f17776.toString().getBytes()));
    }

    @Override // p045.C7149
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo12397() {
        return AbstractC7187.f17852.getDataDir() + AbstractC9234.m14531(7) + this.f17777;
    }

    @Override // p045.C7149
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12396() {
    }
}
