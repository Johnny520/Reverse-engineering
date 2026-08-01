package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.AbstractC4089;
import com.google.gson.C4080;
import com.google.gson.C4086;
import com.google.gson.C4087;
import com.google.gson.C4088;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import p160.C8376;
import p275.C9073;
import p275.C9074;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9144 extends AbstractC4083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9144 f23285 = new C9144();

    private C9144() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m14407(C9073 c9073, AbstractC4089 abstractC4089) throws IOException {
        if (abstractC4089 == null || (abstractC4089 instanceof C4086)) {
            c9073.m14337();
            return;
        }
        if (abstractC4089 instanceof C4080) {
            C4080 c4080 = (C4080) abstractC4089;
            Serializable serializable = c4080.f11264;
            if (serializable instanceof Number) {
                c9073.m14327(c4080.m7890());
                return;
            } else if (serializable instanceof Boolean) {
                c9073.m14329(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(c4080.m7889()));
                return;
            } else {
                c9073.m14330(c4080.m7889());
                return;
            }
        }
        boolean z = abstractC4089 instanceof C4088;
        if (z) {
            c9073.m14332();
            if (!z) {
                C8376.m13333(abstractC4089, "Not a JSON Array: ");
                return;
            }
            Iterator it = ((C4088) abstractC4089).f11298.iterator();
            while (it.hasNext()) {
                m14407(c9073, (AbstractC4089) it.next());
            }
            c9073.m14340();
            return;
        }
        boolean z2 = abstractC4089 instanceof C4087;
        if (!z2) {
            C8376.m13323(abstractC4089.getClass(), "Couldn't write ");
            return;
        }
        c9073.m14331();
        if (!z2) {
            C8376.m13333(abstractC4089, "Not a JSON Object: ");
            return;
        }
        for (Map.Entry entry : ((C4087) abstractC4089).f11297.entrySet()) {
            c9073.m14342((String) entry.getKey());
            m14407(c9073, (AbstractC4089) entry.getValue());
        }
        c9073.m14344();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static AbstractC4089 m14408(C9074 c9074, JsonToken jsonToken) throws IOException {
        int i = AbstractC9145.f23286[jsonToken.ordinal()];
        if (i == 1) {
            c9074.m14356();
            return new C4088();
        }
        if (i != 2) {
            return null;
        }
        c9074.m14355();
        return new C4087();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static AbstractC4089 m14409(C9074 c9074, JsonToken jsonToken) {
        int i = AbstractC9145.f23286[jsonToken.ordinal()];
        if (i == 3) {
            return new C4080(c9074.m14348());
        }
        if (i == 4) {
            return new C4080(new LazilyParsedNumber(c9074.m14348()));
        }
        if (i == 5) {
            return new C4080(Boolean.valueOf(c9074.m14357()));
        }
        if (i == 6) {
            c9074.m14352();
            return C4086.f11296;
        }
        C8376.m13333(jsonToken, "Unexpected token: ");
        return null;
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ void mo7881(C9073 c9073, Object obj) throws IOException {
        m14407(c9073, (AbstractC4089) obj);
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) throws IOException {
        JsonToken jsonTokenM14346 = c9074.m14346();
        AbstractC4089 abstractC4089M14408 = m14408(c9074, jsonTokenM14346);
        if (abstractC4089M14408 == null) {
            return m14409(c9074, jsonTokenM14346);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c9074.m14360()) {
                String strM14350 = abstractC4089M14408 instanceof C4087 ? c9074.m14350() : null;
                JsonToken jsonTokenM143462 = c9074.m14346();
                AbstractC4089 abstractC4089M144082 = m14408(c9074, jsonTokenM143462);
                boolean z = abstractC4089M144082 != null;
                if (abstractC4089M144082 == null) {
                    abstractC4089M144082 = m14409(c9074, jsonTokenM143462);
                }
                if (abstractC4089M14408 instanceof C4088) {
                    ((C4088) abstractC4089M14408).f11298.add(abstractC4089M144082);
                } else {
                    ((C4087) abstractC4089M14408).f11297.put(strM14350, abstractC4089M144082);
                }
                if (z) {
                    arrayDeque.addLast(abstractC4089M14408);
                    abstractC4089M14408 = abstractC4089M144082;
                }
            } else {
                if (abstractC4089M14408 instanceof C4088) {
                    c9074.m14363();
                } else {
                    c9074.m14367();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC4089M14408;
                }
                abstractC4089M14408 = (AbstractC4089) arrayDeque.removeLast();
            }
        }
    }
}
