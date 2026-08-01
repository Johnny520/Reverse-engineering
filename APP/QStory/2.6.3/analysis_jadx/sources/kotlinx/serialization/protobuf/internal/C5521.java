package kotlinx.serialization.protobuf.internal;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1245;
import androidx.core.view.AbstractC2279;
import androidx.window.area.AbstractC2567;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C5177;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p009.AbstractC6183;
import p031.C6327;
import p087.AbstractC7105;
import p087.C7070;
import p087.C7077;
import p087.C7103;
import p087.C7111;
import p087.C7118;
import p087.C7127;
import p087.C7133;
import p089.InterfaceC7184;
import p090.InterfaceC7187;
import p090.InterfaceC7189;
import p091.C7193;
import p091.C7198;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5521 extends AbstractC2279 implements InterfaceC7187, InterfaceC7189 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7111 f15256;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7191 f15257;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5525 f15258;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public HashMap f15259;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15260;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int[] f15261;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public HashMap f15262;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6327 f15263;

    public C5521(C6327 c6327, C5525 c5525, InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        this.f15263 = c6327;
        this.f15258 = c5525;
        this.f15257 = interfaceC7191;
        this.f15256 = new C7111(interfaceC7191, new ProtobufDecoder$elementMarker$1(this));
        int iMo12380 = interfaceC7191.mo12380();
        if (iMo12380 >= 32) {
            m10777(interfaceC7191, iMo12380);
            return;
        }
        int i = iMo12380 + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < iMo12380; i3++) {
            int iM1168 = AbstractC0455.m1168(interfaceC7191, i3, false);
            if (iM1168 > iMo12380 || iM1168 == -2) {
                m10777(interfaceC7191, iMo12380);
                return;
            }
            iArr[iM1168] = i3;
        }
        this.f15261 = iArr;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo10652(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return m10781(mo10761(interfaceC7191, i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final byte mo10653(C7127 c7127, int i) {
        c7127.getClass();
        return (byte) m10782(mo10761(c7127, i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final InterfaceC7187 mo10654(C7127 c7127, int i) {
        c7127.getClass();
        long jMo10761 = mo10761(c7127, i);
        c7127.mo12383(i).getClass();
        m4266(jMo10761);
        return this;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final double mo10655(C7127 c7127, int i) {
        c7127.getClass();
        return m10780(mo10761(c7127, i));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo10657(InterfaceC7184 interfaceC7184) {
        interfaceC7184.getClass();
        return m10784(interfaceC7184, null);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo10658() {
        return !this.f15260;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final char mo10660(C7127 c7127, int i) {
        c7127.getClass();
        return (char) m10782(mo10761(c7127, i));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final String mo10662() {
        return mo10775(m4267());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo10665() {
        return m10782(m4267());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo10668() {
        return m10776(m4267());
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final short mo10669(C7127 c7127, int i) {
        c7127.getClass();
        return (short) m10782(mo10761(c7127, i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final float mo10670(C7127 c7127, int i) {
        c7127.getClass();
        return m10783(mo10761(c7127, i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final int mo10671(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return m10782(mo10761(interfaceC7191, i));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final int mo10672(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        int iM10782 = m10782(m4267());
        if (iM10782 < interfaceC7191.mo12380() && iM10782 >= 0 && AbstractC0455.m1168(interfaceC7191, iM10782, true) == iM10782) {
            return iM10782;
        }
        int iMo12380 = interfaceC7191.mo12380();
        for (int i = 0; i < iMo12380; i++) {
            if (AbstractC0455.m1168(interfaceC7191, i, true) == iM10782) {
                return i;
            }
        }
        throw new ProtobufDecodingException(iM10782 + " is not among valid " + this.f15257.mo12382() + " enum proto numbers", null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public String mo10775(long j) {
        C5525 c5525 = this.f15258;
        try {
            if (j != 19500) {
                return c5525.m10791();
            }
            int iM10790 = c5525.m10790(ProtoIntegerType.DEFAULT);
            C5525.m10785(iM10790);
            C5517 c5517 = c5525.f15272;
            byte[] bArr = c5517.f15248;
            int i = c5517.f15246;
            String strM10135 = AbstractC5139.m10135(i, bArr, i + iM10790);
            c5517.f15246 += iM10790;
            return strM10135;
        } catch (ProtobufDecodingException e) {
            C4211.m8599((int) (j & 2147483647L), this.f15257.mo12382(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final long m10776(long j) {
        C5525 c5525 = this.f15258;
        try {
            return j == 19500 ? c5525.m10789(ProtoIntegerType.DEFAULT) : c5525.m10799(AbstractC0455.m1163(j));
        } catch (ProtobufDecodingException e) {
            C4211.m8599((int) (j & 2147483647L), this.f15257.mo12382(), e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public long mo10761(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return AbstractC0455.m1176(interfaceC7191, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final void m10777(InterfaceC7191 interfaceC7191, int i) {
        HashMap map = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (AbstractC0455.m1168(interfaceC7191, i3, false) == -2) {
                List listM1172 = AbstractC0455.m1172(interfaceC7191.mo12383(i3), this.f15263.f17436);
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM1172, 10));
                Iterator it = listM1172.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (AbstractC0455.m1176((InterfaceC7191) it.next(), 0) & 2147483647L)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(Integer.valueOf(((Number) it2.next()).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                map.put(Integer.valueOf(AbstractC0455.m1168(interfaceC7191, i3, false)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.f15259 = new HashMap(i2, 1.0f);
        }
        this.f15262 = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.飘花落叶言子苏哲世楪兰, kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲世苏兰] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲世苏兰] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final byte[] m10778(byte[] bArr) {
        long jM4265 = m4265();
        C5525 c5525 = this.f15258;
        try {
            this = jM4265 == 19500 ? c5525.m10797() : c5525.m10786();
            return bArr == null ? this : AbstractC4347.m8854(bArr, this);
        } catch (ProtobufDecodingException e) {
            C4211.m8599((int) (jM4265 & 2147483647L), this.f15257.mo12382(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final LinkedHashMap m10779(InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7184.getClass();
        C7077 c7077 = (C7077) interfaceC7184;
        InterfaceC7184 interfaceC71842 = c7077.f18987;
        InterfaceC7184 interfaceC71843 = c7077.f18986;
        interfaceC71842.getClass();
        interfaceC71843.getClass();
        C7070 c7070 = new C7070(interfaceC71842, interfaceC71843, 0);
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new C7103(c7070, 2).m12402(this, map != null ? map.entrySet() : null);
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(set, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo10674(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        m4266(mo10761(interfaceC7191, i));
        return m10784(interfaceC7184, obj);
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo10675(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        m4266(mo10761(interfaceC7191, i));
        if (this.f15260) {
            return null;
        }
        return m10784(interfaceC7184, obj);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC7189 mo10676(InterfaceC7191 interfaceC7191) {
        Integer num;
        InterfaceC7191 interfaceC71912 = this.f15257;
        interfaceC7191.getClass();
        try {
            AbstractC8190 kind = interfaceC7191.getKind();
            C7198 c7198 = C7198.f19210;
            boolean zM8907 = AbstractC4395.m8907(kind, c7198);
            C6327 c6327 = this.f15263;
            C5525 c5525 = this.f15258;
            try {
                if (zM8907) {
                    long jM4265 = m4265();
                    if (!AbstractC4395.m8907(interfaceC71912.getKind(), c7198) || jM4265 == 19500 || interfaceC71912.equals(interfaceC7191)) {
                        return (c5525.f15270 == ProtoWireType.SIZE_DELIMITED && AbstractC0455.m1149(interfaceC7191.mo12383(0))) ? new C5531(c6327, new C5525(c5525.m10788()), interfaceC7191) : new C5519(c6327, c5525, jM4265, interfaceC7191);
                    }
                    C5525 c5525M5075 = AbstractC2567.m5075(c5525, jM4265);
                    c5525M5075.m10794();
                    return new C5519(c6327, c5525M5075, 1 | ProtoIntegerType.DEFAULT.getSignature(), interfaceC7191);
                }
                if (!AbstractC4395.m8907(kind, C7198.f19209) && !AbstractC4395.m8907(kind, C7198.f19207) && !(kind instanceof C7193)) {
                    if (AbstractC4395.m8907(kind, C7198.f19208)) {
                        return new C5515(c6327, new C5525(m4265() == 19500 ? c5525.m10787() : c5525.m10788()), m4265(), interfaceC7191);
                    }
                    throw new SerializationException("Primitives are not supported at top-level");
                }
                long jM42652 = m4265();
                if (jM42652 == 19500 && AbstractC4395.m8907(interfaceC71912, interfaceC7191)) {
                    return this;
                }
                if (!AbstractC0455.m1150(jM42652)) {
                    return new C5521(c6327, AbstractC2567.m5075(c5525, jM42652), interfaceC7191);
                }
                int i = ((int) (jM42652 & 2147483647L)) - 1;
                HashMap map = this.f15259;
                if (map != null && (num = (Integer) map.get(Integer.valueOf(i))) != null) {
                    jM42652 = (jM42652 & 1152921500311879680L) | ((long) num.intValue());
                }
                return new C5530(c6327, c5525, jM42652, interfaceC7191);
            } catch (ProtobufDecodingException e) {
                e = e;
            }
        } catch (ProtobufDecodingException e2) {
            e = e2;
        }
        throw new ProtobufDecodingException("Fail to begin structure for " + interfaceC7191.mo12382() + " in " + interfaceC71912.mo12382() + " at proto number " + ((int) (2147483647L & m4265())), e);
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10677() {
        return this.f15263.f17436;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10678(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo10718(InterfaceC7191 interfaceC7191) {
        int iIntValue;
        HashMap map;
        C5525 c5525 = this.f15258;
        interfaceC7191.getClass();
        while (true) {
            try {
                int iM10794 = c5525.m10794();
                C7111 c7111 = this.f15256;
                if (iM10794 == -1) {
                    return c7111.m12403();
                }
                if (iM10794 == 0) {
                    throw new SerializationException("0 is not allowed as the protobuf field number in " + interfaceC7191.mo12382() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.f15261;
                if (iArr != null) {
                    iIntValue = (iM10794 < 0 || iM10794 >= iArr.length) ? -1 : iArr[iM10794];
                } else {
                    HashMap map2 = this.f15262;
                    map2.getClass();
                    Object obj = map2.get(Integer.valueOf(iM10794));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (AbstractC0455.m1150(AbstractC0455.m1176(interfaceC7191, iIntValue)) && (map = this.f15259) != null) {
                    }
                    c7111.m12404(iIntValue);
                    return iIntValue;
                }
                c5525.m10795();
            } catch (ProtobufDecodingException e) {
                throw new ProtobufDecodingException("Fail to get element index for " + interfaceC7191.mo12382() + " in " + this.f15257.mo12382(), e);
            }
        }
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final String mo10686(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return mo10775(mo10761(interfaceC7191, i));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7187 mo10689(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        m4266(m4267());
        return this;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final char mo10690() {
        return (char) m10782(m4267());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo10691() {
        return m10781(m4267());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final double mo10696() {
        return m10780(m4267());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final float mo10697() {
        return m10783(m4267());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo10698() {
        return (short) m10782(m4267());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final double m10780(long j) {
        C5525 c5525 = this.f15258;
        try {
            return j == 19500 ? Double.longBitsToDouble(c5525.m10792()) : c5525.m10796();
        } catch (ProtobufDecodingException e) {
            C4211.m8599((int) (j & 2147483647L), this.f15257.mo12382(), e);
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean m10781(long j) {
        int iM10782 = m10782(j);
        if (iM10782 == 0) {
            return false;
        }
        if (iM10782 == 1) {
            return true;
        }
        throw new SerializationException(AbstractC6183.m11588(iM10782, "Unexpected boolean value: "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final int m10782(long j) {
        C5525 c5525 = this.f15258;
        try {
            return j == 19500 ? c5525.m10790(ProtoIntegerType.DEFAULT) : c5525.m10801(AbstractC0455.m1163(j));
        } catch (ProtobufDecodingException e) {
            C4211.m8599((int) (j & 2147483647L), this.f15257.mo12382(), e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final float m10783(long j) {
        C5525 c5525 = this.f15258;
        try {
            return j == 19500 ? Float.intBitsToFloat(c5525.m10798()) : c5525.m10800();
        } catch (ProtobufDecodingException e) {
            C4211.m8599((int) (j & 2147483647L), this.f15257.mo12382(), e);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final Object m10784(InterfaceC7184 interfaceC7184, Object obj) {
        String string;
        C7198 c7198 = C7198.f19208;
        interfaceC7184.getClass();
        try {
            if (interfaceC7184 instanceof C7077) {
                return m10779(interfaceC7184, obj);
            }
            if (AbstractC4395.m8907(interfaceC7184.getDescriptor(), C7118.f19054.f19064)) {
                return m10778((byte[]) obj);
            }
            if (!AbstractC4395.m8907(interfaceC7184.getDescriptor(), C7133.f19085.f19064)) {
                return interfaceC7184 instanceof AbstractC7105 ? ((AbstractC7105) interfaceC7184).m12402(this, obj) : interfaceC7184.deserialize(this);
            }
            C5177 c5177 = (C5177) obj;
            byte[] bArr = c5177 != null ? c5177.f14740 : null;
            return new C5177(m10778(bArr != null ? bArr : null));
        } catch (ProtobufDecodingException e) {
            long jM4265 = m4265();
            InterfaceC7191 descriptor = interfaceC7184.getDescriptor();
            InterfaceC7191 interfaceC7191 = this.f15257;
            if (AbstractC4395.m8907(interfaceC7191, descriptor)) {
                string = "Error while decoding " + interfaceC7191.mo12382();
            } else if (AbstractC4395.m8907(interfaceC7191.getKind(), C7198.f19210) && !AbstractC4395.m8907(interfaceC7184.getDescriptor().getKind(), c7198)) {
                StringBuilder sb = new StringBuilder("Error while decoding index ");
                sb.append(((int) (jM4265 & 2147483647L)) - 1);
                sb.append(" in repeated field of ");
                sb.append(interfaceC7184.getDescriptor().mo12382());
                string = sb.toString();
            } else if (AbstractC4395.m8907(interfaceC7191.getKind(), c7198)) {
                int i = ((int) (jM4265 & 2147483647L)) - 1;
                int i2 = i / 2;
                string = "Error while decoding " + (i % 2 == 0 ? "key" : "value") + " of index " + i2 + " in map field of " + interfaceC7184.getDescriptor().mo12382();
            } else {
                string = "Error while decoding " + interfaceC7184.getDescriptor().mo12382() + " at proto number " + ((int) (jM4265 & 2147483647L)) + " of " + interfaceC7191.mo12382();
            }
            throw new ProtobufDecodingException(string, e);
        }
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final long mo10699(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return m10776(mo10761(interfaceC7191, i));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo10700() {
        return (byte) m10782(m4267());
    }
}
