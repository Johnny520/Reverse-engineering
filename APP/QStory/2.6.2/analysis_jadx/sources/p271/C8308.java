package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3246;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p144.C7546;
import p259.C8243;
import p259.C8244;
import p260.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8308 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8319 f22923 = new C8319(ToNumberPolicy.DOUBLE, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3246 f22924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3252 f22925;

    public C8308(C3252 c3252, InterfaceC3246 interfaceC3246) {
        this.f22925 = c3252;
        this.f22924 = interfaceC3246;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Serializable m13828(C8244 c8244, JsonToken jsonToken) throws IOException {
        int i = AbstractC8309.f22926[jsonToken.ordinal()];
        if (i == 1) {
            c8244.m13779();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        c8244.m13778();
        return new LinkedTreeMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Serializable m13829(C8244 c8244, JsonToken jsonToken) {
        int i = AbstractC8309.f22926[jsonToken.ordinal()];
        if (i == 3) {
            return c8244.m13771();
        }
        if (i == 4) {
            return this.f22924.readNumber(c8244);
        }
        if (i == 5) {
            return Boolean.valueOf(c8244.m13783());
        }
        if (i == 6) {
            c8244.m13775();
            return null;
        }
        C7546.m12745(jsonToken, "Unexpected token: ");
        return null;
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) throws IOException {
        if (obj == null) {
            c8243.m13762();
            return;
        }
        Class<?> cls = obj.getClass();
        C3252 c3252 = this.f22925;
        c3252.getClass();
        AbstractC3250 abstractC3250M7353 = c3252.m7353(new C8245(cls));
        if (!(abstractC3250M7353 instanceof C8308)) {
            abstractC3250M7353.mo7335(c8243, obj);
        } else {
            c8243.m13755();
            c8243.m13768();
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        JsonToken jsonTokenM13770 = c8244.m13770();
        Object objM13828 = m13828(c8244, jsonTokenM13770);
        if (objM13828 == null) {
            return m13829(c8244, jsonTokenM13770);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c8244.m13784()) {
                String strM13773 = objM13828 instanceof Map ? c8244.m13773() : null;
                JsonToken jsonTokenM137702 = c8244.m13770();
                Serializable serializableM13828 = m13828(c8244, jsonTokenM137702);
                boolean z = serializableM13828 != null;
                if (serializableM13828 == null) {
                    serializableM13828 = m13829(c8244, jsonTokenM137702);
                }
                if (objM13828 instanceof List) {
                    ((List) objM13828).add(serializableM13828);
                } else {
                    ((Map) objM13828).put(strM13773, serializableM13828);
                }
                if (z) {
                    arrayDeque.addLast(objM13828);
                    objM13828 = serializableM13828;
                }
            } else {
                if (objM13828 instanceof List) {
                    c8244.m13786();
                } else {
                    c8244.m13790();
                }
                if (arrayDeque.isEmpty()) {
                    return objM13828;
                }
                objM13828 = arrayDeque.removeLast();
            }
        }
    }
}
