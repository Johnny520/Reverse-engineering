package p287;

import androidx.collection.C1123;
import com.google.gson.AbstractC4083;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p191.AbstractC8568;
import p275.C9073;
import p275.C9074;
import p285.AbstractC9097;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9143 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9141 f23284;

    public AbstractC9143(C9141 c9141) {
        this.f23284 = c9141;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo14401(Object obj, C9074 c9074, C9142 c9142);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract Object mo14402(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract Object mo14403();

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        if (obj == null) {
            c9073.m14337();
            return;
        }
        c9073.m14331();
        try {
            Iterator it = this.f23284.f23273.iterator();
            while (it.hasNext()) {
                ((C9142) it.next()).m14406(c9073, obj);
            }
            c9073.m14344();
        } catch (IllegalAccessException e) {
            AbstractC8568 abstractC8568 = AbstractC9097.f23229;
            C1123.m1408("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        if (c9074.m14346() == JsonToken.NULL) {
            c9074.m14352();
            return null;
        }
        Object objMo14403 = mo14403();
        Map map = this.f23284.f23274;
        try {
            c9074.m14355();
            while (c9074.m14360()) {
                C9142 c9142 = (C9142) map.get(c9074.m14350());
                if (c9142 == null) {
                    c9074.m14370();
                } else {
                    mo14401(objMo14403, c9074, c9142);
                }
            }
            c9074.m14367();
            return mo14402(objMo14403);
        } catch (IllegalAccessException e) {
            AbstractC8568 abstractC8568 = AbstractC9097.f23229;
            C1123.m1408("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }
}
