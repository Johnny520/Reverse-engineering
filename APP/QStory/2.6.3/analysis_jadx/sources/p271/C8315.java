package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.AbstractC3257;
import com.google.gson.C3248;
import com.google.gson.C3254;
import com.google.gson.C3255;
import com.google.gson.C3256;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import p144.C7547;
import p259.C8244;
import p259.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8315 extends AbstractC3251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8315 f22940 = new C8315();

    private C8315() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m13848(C8244 c8244, AbstractC3257 abstractC3257) throws IOException {
        if (abstractC3257 == null || (abstractC3257 instanceof C3254)) {
            c8244.m13778();
            return;
        }
        if (abstractC3257 instanceof C3248) {
            C3248 c3248 = (C3248) abstractC3257;
            Serializable serializable = c3248.f10919;
            if (serializable instanceof Number) {
                c8244.m13768(c3248.m7331());
                return;
            } else if (serializable instanceof Boolean) {
                c8244.m13770(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c3248.m7330()));
                return;
            } else {
                c8244.m13771(c3248.m7330());
                return;
            }
        }
        boolean z = abstractC3257 instanceof C3256;
        if (z) {
            c8244.m13773();
            if (!z) {
                C7547.m12774(abstractC3257, "Not a JSON Array: ");
                return;
            }
            Iterator it = ((C3256) abstractC3257).f10953.iterator();
            while (it.hasNext()) {
                m13848(c8244, (AbstractC3257) it.next());
            }
            c8244.m13781();
            return;
        }
        boolean z2 = abstractC3257 instanceof C3255;
        if (!z2) {
            C7547.m12764(abstractC3257.getClass(), "Couldn't write ");
            return;
        }
        c8244.m13772();
        if (!z2) {
            C7547.m12774(abstractC3257, "Not a JSON Object: ");
            return;
        }
        for (Map.Entry entry : ((C3255) abstractC3257).f10952.entrySet()) {
            c8244.m13783((String) entry.getKey());
            m13848(c8244, (AbstractC3257) entry.getValue());
        }
        c8244.m13785();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static AbstractC3257 m13849(C8245 c8245, JsonToken jsonToken) throws IOException {
        int i = AbstractC8316.f22941[jsonToken.ordinal()];
        if (i == 1) {
            c8245.m13797();
            return new C3256();
        }
        if (i != 2) {
            return null;
        }
        c8245.m13796();
        return new C3255();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC3257 m13850(C8245 c8245, JsonToken jsonToken) {
        int i = AbstractC8316.f22941[jsonToken.ordinal()];
        if (i == 3) {
            return new C3248(c8245.m13789());
        }
        if (i == 4) {
            return new C3248(new LazilyParsedNumber(c8245.m13789()));
        }
        if (i == 5) {
            return new C3248(Boolean.valueOf(c8245.m13798()));
        }
        if (i == 6) {
            c8245.m13793();
            return C3254.f10951;
        }
        C7547.m12774(jsonToken, "Unexpected token: ");
        return null;
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ void mo7322(C8244 c8244, Object obj) throws IOException {
        m13848(c8244, (AbstractC3257) obj);
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) throws IOException {
        JsonToken jsonTokenM13787 = c8245.m13787();
        AbstractC3257 abstractC3257M13849 = m13849(c8245, jsonTokenM13787);
        if (abstractC3257M13849 == null) {
            return m13850(c8245, jsonTokenM13787);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c8245.m13801()) {
                String strM13791 = abstractC3257M13849 instanceof C3255 ? c8245.m13791() : null;
                JsonToken jsonTokenM137872 = c8245.m13787();
                AbstractC3257 abstractC3257M138492 = m13849(c8245, jsonTokenM137872);
                boolean z = abstractC3257M138492 != null;
                if (abstractC3257M138492 == null) {
                    abstractC3257M138492 = m13850(c8245, jsonTokenM137872);
                }
                if (abstractC3257M13849 instanceof C3256) {
                    ((C3256) abstractC3257M13849).f10953.add(abstractC3257M138492);
                } else {
                    ((C3255) abstractC3257M13849).f10952.put(strM13791, abstractC3257M138492);
                }
                if (z) {
                    arrayDeque.addLast(abstractC3257M13849);
                    abstractC3257M13849 = abstractC3257M138492;
                }
            } else {
                if (abstractC3257M13849 instanceof C3256) {
                    c8245.m13804();
                } else {
                    c8245.m13808();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC3257M13849;
                }
                abstractC3257M13849 = (AbstractC3257) arrayDeque.removeLast();
            }
        }
    }
}
