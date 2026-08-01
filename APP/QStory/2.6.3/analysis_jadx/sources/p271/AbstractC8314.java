package p271;

import androidx.collection.C0276;
import com.google.gson.AbstractC3251;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import p175.AbstractC7739;
import p259.C8244;
import p259.C8245;
import p269.AbstractC8268;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8314 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8312 f22939;

    public AbstractC8314(C8312 c8312) {
        this.f22939 = c8312;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo13842(Object obj, C8245 c8245, C8313 c8313);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract Object mo13843(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract Object mo13844();

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        if (obj == null) {
            c8244.m13778();
            return;
        }
        c8244.m13772();
        try {
            Iterator it = this.f22939.f22928.iterator();
            while (it.hasNext()) {
                ((C8313) it.next()).m13847(c8244, obj);
            }
            c8244.m13785();
        } catch (IllegalAccessException e) {
            AbstractC7739 abstractC7739 = AbstractC8268.f22884;
            C0276.m848("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        if (c8245.m13787() == JsonToken.NULL) {
            c8245.m13793();
            return null;
        }
        Object objMo13844 = mo13844();
        Map map = this.f22939.f22929;
        try {
            c8245.m13796();
            while (c8245.m13801()) {
                C8313 c8313 = (C8313) map.get(c8245.m13791());
                if (c8313 == null) {
                    c8245.m13811();
                } else {
                    mo13842(objMo13844, c8245, c8313);
                }
            }
            c8245.m13808();
            return mo13843(objMo13844);
        } catch (IllegalAccessException e) {
            AbstractC7739 abstractC7739 = AbstractC8268.f22884;
            C0276.m848("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }
}
