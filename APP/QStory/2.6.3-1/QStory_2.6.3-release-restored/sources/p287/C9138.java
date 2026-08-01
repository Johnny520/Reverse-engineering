package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4079;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p160.C8376;
import p275.C9073;
import p275.C9074;
import p276.C9075;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9138 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C9149 f23267 = new C9149(ToNumberPolicy.DOUBLE, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4079 f23268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4085 f23269;

    public C9138(C4085 c4085, InterfaceC4079 interfaceC4079) {
        this.f23269 = c4085;
        this.f23268 = interfaceC4079;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Serializable m14404(C9074 c9074, JsonToken jsonToken) throws IOException {
        int i = AbstractC9139.f23270[jsonToken.ordinal()];
        if (i == 1) {
            c9074.m14356();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        c9074.m14355();
        return new LinkedTreeMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Serializable m14405(C9074 c9074, JsonToken jsonToken) {
        int i = AbstractC9139.f23270[jsonToken.ordinal()];
        if (i == 3) {
            return c9074.m14348();
        }
        if (i == 4) {
            return this.f23268.readNumber(c9074);
        }
        if (i == 5) {
            return Boolean.valueOf(c9074.m14357());
        }
        if (i == 6) {
            c9074.m14352();
            return null;
        }
        C8376.m13333(jsonToken, "Unexpected token: ");
        return null;
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) throws IOException {
        if (obj == null) {
            c9073.m14337();
            return;
        }
        Class<?> cls = obj.getClass();
        C4085 c4085 = this.f23269;
        c4085.getClass();
        AbstractC4083 abstractC4083M7899 = c4085.m7899(new C9075(cls));
        if (!(abstractC4083M7899 instanceof C9138)) {
            abstractC4083M7899.mo7881(c9073, obj);
        } else {
            c9073.m14331();
            c9073.m14344();
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        JsonToken jsonTokenM14346 = c9074.m14346();
        Object objM14404 = m14404(c9074, jsonTokenM14346);
        if (objM14404 == null) {
            return m14405(c9074, jsonTokenM14346);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c9074.m14360()) {
                String strM14350 = objM14404 instanceof Map ? c9074.m14350() : null;
                JsonToken jsonTokenM143462 = c9074.m14346();
                Serializable serializableM14404 = m14404(c9074, jsonTokenM143462);
                boolean z = serializableM14404 != null;
                if (serializableM14404 == null) {
                    serializableM14404 = m14405(c9074, jsonTokenM143462);
                }
                if (objM14404 instanceof List) {
                    ((List) objM14404).add(serializableM14404);
                } else {
                    ((Map) objM14404).put(strM14350, serializableM14404);
                }
                if (z) {
                    arrayDeque.addLast(objM14404);
                    objM14404 = serializableM14404;
                }
            } else {
                if (objM14404 instanceof List) {
                    c9074.m14363();
                } else {
                    c9074.m14367();
                }
                if (arrayDeque.isEmpty()) {
                    return objM14404;
                }
                objM14404 = arrayDeque.removeLast();
            }
        }
    }
}
