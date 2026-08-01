package p271;

import androidx.collection.C0276;
import com.google.gson.AbstractC3250;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p175.AbstractC7738;
import p259.C8243;
import p259.C8244;
import p269.AbstractC8267;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8313 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8311 f22940;

    public AbstractC8313(C8311 c8311) {
        this.f22940 = c8311;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo13825(Object obj, C8244 c8244, C8312 c8312);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract Object mo13826(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract Object mo13827();

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        if (obj == null) {
            c8243.m13762();
            return;
        }
        c8243.m13755();
        try {
            Iterator it = this.f22940.f22929.iterator();
            while (it.hasNext()) {
                ((C8312) it.next()).m13830(c8243, obj);
            }
            c8243.m13768();
        } catch (IllegalAccessException e) {
            AbstractC7738 abstractC7738 = AbstractC8267.f22885;
            C0276.m847("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        if (c8244.m13770() == JsonToken.NULL) {
            c8244.m13775();
            return null;
        }
        Object objMo13827 = mo13827();
        Map map = this.f22940.f22930;
        try {
            c8244.m13778();
            while (c8244.m13784()) {
                C8312 c8312 = (C8312) map.get(c8244.m13773());
                if (c8312 == null) {
                    c8244.m13793();
                } else {
                    mo13825(objMo13827, c8244, c8312);
                }
            }
            c8244.m13790();
            return mo13826(objMo13827);
        } catch (IllegalAccessException e) {
            AbstractC7738 abstractC7738 = AbstractC8267.f22885;
            C0276.m847("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }
}
