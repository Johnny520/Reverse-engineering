package p055;

import android.content.Intent;
import androidx.compose.runtime.internal.C2080;
import p035.C7092;
import p042.AbstractC7140;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7248 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(193));
        String strM14531 = AbstractC9234.m14531(194);
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3963 = strM14531;
        c2080.f3964 = new Class[]{Intent.class};
        m12390(c7164M12412.m12414(), new C7092(13));
    }
}
