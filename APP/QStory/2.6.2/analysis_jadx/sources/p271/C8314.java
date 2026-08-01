package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.AbstractC3256;
import com.google.gson.C3247;
import com.google.gson.C3253;
import com.google.gson.C3254;
import com.google.gson.C3255;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import p144.C7546;
import p259.C8243;
import p259.C8244;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8314 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8314 f22941 = new C8314();

    private C8314() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m13831(C8243 c8243, AbstractC3256 abstractC3256) throws IOException {
        if (abstractC3256 == null || (abstractC3256 instanceof C3253)) {
            c8243.m13762();
            return;
        }
        if (abstractC3256 instanceof C3247) {
            C3247 c3247 = (C3247) abstractC3256;
            Serializable serializable = c3247.f10914;
            if (serializable instanceof Number) {
                c8243.m13751(c3247.m7344());
                return;
            } else if (serializable instanceof Boolean) {
                c8243.m13753(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c3247.m7343()));
                return;
            } else {
                c8243.m13754(c3247.m7343());
                return;
            }
        }
        boolean z = abstractC3256 instanceof C3255;
        if (z) {
            c8243.m13756();
            if (!z) {
                C7546.m12745(abstractC3256, "Not a JSON Array: ");
                return;
            }
            Iterator it = ((C3255) abstractC3256).f10948.iterator();
            while (it.hasNext()) {
                m13831(c8243, (AbstractC3256) it.next());
            }
            c8243.m13764();
            return;
        }
        boolean z2 = abstractC3256 instanceof C3254;
        if (!z2) {
            C7546.m12735(abstractC3256.getClass(), "Couldn't write ");
            return;
        }
        c8243.m13755();
        if (!z2) {
            C7546.m12745(abstractC3256, "Not a JSON Object: ");
            return;
        }
        for (Map.Entry entry : ((C3254) abstractC3256).f10947.entrySet()) {
            c8243.m13766((String) entry.getKey());
            m13831(c8243, (AbstractC3256) entry.getValue());
        }
        c8243.m13768();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static AbstractC3256 m13832(C8244 c8244, JsonToken jsonToken) throws IOException {
        int i = AbstractC8315.f22942[jsonToken.ordinal()];
        if (i == 1) {
            c8244.m13779();
            return new C3255();
        }
        if (i != 2) {
            return null;
        }
        c8244.m13778();
        return new C3254();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC3256 m13833(C8244 c8244, JsonToken jsonToken) {
        int i = AbstractC8315.f22942[jsonToken.ordinal()];
        if (i == 3) {
            return new C3247(c8244.m13771());
        }
        if (i == 4) {
            return new C3247(new LazilyParsedNumber(c8244.m13771()));
        }
        if (i == 5) {
            return new C3247(Boolean.valueOf(c8244.m13783()));
        }
        if (i == 6) {
            c8244.m13775();
            return C3253.f10946;
        }
        C7546.m12745(jsonToken, "Unexpected token: ");
        return null;
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ void mo7335(C8243 c8243, Object obj) throws IOException {
        m13831(c8243, (AbstractC3256) obj);
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) throws IOException {
        JsonToken jsonTokenM13770 = c8244.m13770();
        AbstractC3256 abstractC3256M13832 = m13832(c8244, jsonTokenM13770);
        if (abstractC3256M13832 == null) {
            return m13833(c8244, jsonTokenM13770);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c8244.m13784()) {
                String strM13773 = abstractC3256M13832 instanceof C3254 ? c8244.m13773() : null;
                JsonToken jsonTokenM137702 = c8244.m13770();
                AbstractC3256 abstractC3256M138322 = m13832(c8244, jsonTokenM137702);
                boolean z = abstractC3256M138322 != null;
                if (abstractC3256M138322 == null) {
                    abstractC3256M138322 = m13833(c8244, jsonTokenM137702);
                }
                if (abstractC3256M13832 instanceof C3255) {
                    ((C3255) abstractC3256M13832).f10948.add(abstractC3256M138322);
                } else {
                    ((C3254) abstractC3256M13832).f10947.put(strM13773, abstractC3256M138322);
                }
                if (z) {
                    arrayDeque.addLast(abstractC3256M13832);
                    abstractC3256M13832 = abstractC3256M138322;
                }
            } else {
                if (abstractC3256M13832 instanceof C3255) {
                    c8244.m13786();
                } else {
                    c8244.m13790();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC3256M13832;
                }
                abstractC3256M13832 = (AbstractC3256) arrayDeque.removeLast();
            }
        }
    }
}
