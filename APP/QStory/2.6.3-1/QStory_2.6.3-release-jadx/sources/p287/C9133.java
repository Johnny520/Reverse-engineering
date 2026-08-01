package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4081;
import java.util.Date;
import p276.C9075;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9133 implements InterfaceC4081 {
    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }

    @Override // com.google.gson.InterfaceC4081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4083 mo7880(C4085 c4085, C9075 c9075) {
        if (c9075.f23160 == Date.class) {
            return new C9150(AbstractC9151.f23299, 2, 2);
        }
        return null;
    }
}
