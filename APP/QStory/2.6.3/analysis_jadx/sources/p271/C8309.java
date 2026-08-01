package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3247;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p144.C7547;
import p259.C8244;
import p259.C8245;
import p260.C8246;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8309 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8320 f22922 = new C8320(ToNumberPolicy.DOUBLE, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3247 f22923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3253 f22924;

    public C8309(C3253 c3253, InterfaceC3247 interfaceC3247) {
        this.f22924 = c3253;
        this.f22923 = interfaceC3247;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Serializable m13845(C8245 c8245, JsonToken jsonToken) throws IOException {
        int i = AbstractC8310.f22925[jsonToken.ordinal()];
        if (i == 1) {
            c8245.m13797();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        c8245.m13796();
        return new LinkedTreeMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Serializable m13846(C8245 c8245, JsonToken jsonToken) {
        int i = AbstractC8310.f22925[jsonToken.ordinal()];
        if (i == 3) {
            return c8245.m13789();
        }
        if (i == 4) {
            return this.f22923.readNumber(c8245);
        }
        if (i == 5) {
            return Boolean.valueOf(c8245.m13798());
        }
        if (i == 6) {
            c8245.m13793();
            return null;
        }
        C7547.m12774(jsonToken, "Unexpected token: ");
        return null;
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) throws IOException {
        if (obj == null) {
            c8244.m13778();
            return;
        }
        Class<?> cls = obj.getClass();
        C3253 c3253 = this.f22924;
        c3253.getClass();
        AbstractC3251 abstractC3251M7340 = c3253.m7340(new C8246(cls));
        if (!(abstractC3251M7340 instanceof C8309)) {
            abstractC3251M7340.mo7322(c8244, obj);
        } else {
            c8244.m13772();
            c8244.m13785();
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        JsonToken jsonTokenM13787 = c8245.m13787();
        Object objM13845 = m13845(c8245, jsonTokenM13787);
        if (objM13845 == null) {
            return m13846(c8245, jsonTokenM13787);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c8245.m13801()) {
                String strM13791 = objM13845 instanceof Map ? c8245.m13791() : null;
                JsonToken jsonTokenM137872 = c8245.m13787();
                Serializable serializableM13845 = m13845(c8245, jsonTokenM137872);
                boolean z = serializableM13845 != null;
                if (serializableM13845 == null) {
                    serializableM13845 = m13846(c8245, jsonTokenM137872);
                }
                if (objM13845 instanceof List) {
                    ((List) objM13845).add(serializableM13845);
                } else {
                    ((Map) objM13845).put(strM13791, serializableM13845);
                }
                if (z) {
                    arrayDeque.addLast(objM13845);
                    objM13845 = serializableM13845;
                }
            } else {
                if (objM13845 instanceof List) {
                    c8245.m13804();
                } else {
                    c8245.m13808();
                }
                if (arrayDeque.isEmpty()) {
                    return objM13845;
                }
                objM13845 = arrayDeque.removeLast();
            }
        }
    }
}
