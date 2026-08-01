package kotlinx.serialization.protobuf.internal;

import androidx.compose.runtime.internal.C1245;
import androidx.core.view.AbstractC2279;
import com.bumptech.glide.AbstractC3064;
import io.ktor.client.plugins.AbstractC3932;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C5176;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5138;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p007.AbstractC6136;
import p030.C6308;
import p087.AbstractC7104;
import p087.C7069;
import p087.C7076;
import p087.C7102;
import p087.C7110;
import p087.C7117;
import p087.C7126;
import p087.C7132;
import p089.InterfaceC7183;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.C7192;
import p091.C7197;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5520 extends AbstractC2279 implements InterfaceC7186, InterfaceC7188 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7110 f15256;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7190 f15257;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5524 f15258;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public HashMap f15259;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15260;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int[] f15261;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public HashMap f15262;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6308 f15263;

    public C5520(C6308 c6308, C5524 c5524, InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        this.f15263 = c6308;
        this.f15258 = c5524;
        this.f15257 = interfaceC7190;
        this.f15256 = new C7110(interfaceC7190, new ProtobufDecoder$elementMarker$1(this));
        int iMo12353 = interfaceC7190.mo12353();
        if (iMo12353 >= 32) {
            m10720(interfaceC7190, iMo12353);
            return;
        }
        int i = iMo12353 + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < iMo12353; i3++) {
            int iM6766 = AbstractC3064.m6766(interfaceC7190, i3, false);
            if (iM6766 > iMo12353 || iM6766 == -2) {
                m10720(interfaceC7190, iMo12353);
                return;
            }
            iArr[iM6766] = i3;
        }
        this.f15261 = iArr;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo6861(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return m10724(mo10704(interfaceC7190, i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final byte mo6862(C7126 c7126, int i) {
        c7126.getClass();
        return (byte) m10725(mo10704(c7126, i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final InterfaceC7186 mo6863(C7126 c7126, int i) {
        c7126.getClass();
        long jMo10704 = mo10704(c7126, i);
        c7126.mo12356(i).getClass();
        m4256(jMo10704);
        return this;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final double mo6864(C7126 c7126, int i) {
        c7126.getClass();
        return m10723(mo10704(c7126, i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo10644(InterfaceC7183 interfaceC7183) {
        interfaceC7183.getClass();
        return m10727(interfaceC7183, null);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo6865() {
        return !this.f15260;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final char mo6866(C7126 c7126, int i) {
        c7126.getClass();
        return (char) m10725(mo10704(c7126, i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final String mo6867() {
        return mo10718(m4257());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo6868() {
        return m10725(m4257());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo6869() {
        return m10719(m4257());
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final short mo6870(C7126 c7126, int i) {
        c7126.getClass();
        return (short) m10725(mo10704(c7126, i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final float mo6871(C7126 c7126, int i) {
        c7126.getClass();
        return m10726(mo10704(c7126, i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final int mo6872(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return m10725(mo10704(interfaceC7190, i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final int mo6873(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        int iM10725 = m10725(m4257());
        if (iM10725 < interfaceC7190.mo12353() && iM10725 >= 0 && AbstractC3064.m6766(interfaceC7190, iM10725, true) == iM10725) {
            return iM10725;
        }
        int iMo12353 = interfaceC7190.mo12353();
        for (int i = 0; i < iMo12353; i++) {
            if (AbstractC3064.m6766(interfaceC7190, i, true) == iM10725) {
                return i;
            }
        }
        throw new ProtobufDecodingException(iM10725 + " is not among valid " + this.f15257.mo12355() + " enum proto numbers", null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public String mo10718(long j) {
        C5524 c5524 = this.f15258;
        try {
            if (j != 19500) {
                return c5524.m10734();
            }
            int iM10733 = c5524.m10733(ProtoIntegerType.DEFAULT);
            C5524.m10728(iM10733);
            C5516 c5516 = c5524.f15272;
            byte[] bArr = c5516.f15248;
            int i = c5516.f15246;
            String strM10134 = AbstractC5138.m10134(i, bArr, i + iM10733);
            c5516.f15246 += iM10733;
            return strM10134;
        } catch (ProtobufDecodingException e) {
            C4210.m8609((int) (j & 2147483647L), this.f15257.mo12355(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final long m10719(long j) {
        C5524 c5524 = this.f15258;
        try {
            return j == 19500 ? c5524.m10732(ProtoIntegerType.DEFAULT) : c5524.m10742(AbstractC3064.m6757(j));
        } catch (ProtobufDecodingException e) {
            C4210.m8609((int) (j & 2147483647L), this.f15257.mo12355(), e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public long mo10704(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return AbstractC3064.m6767(interfaceC7190, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final void m10720(InterfaceC7190 interfaceC7190, int i) {
        HashMap map = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (AbstractC3064.m6766(interfaceC7190, i3, false) == -2) {
                List listM6763 = AbstractC3064.m6763(interfaceC7190.mo12356(i3), this.f15263.f17387);
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM6763, 10));
                Iterator it = listM6763.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (AbstractC3064.m6767((InterfaceC7190) it.next(), 0) & 2147483647L)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(Integer.valueOf(((Number) it2.next()).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                map.put(Integer.valueOf(AbstractC3064.m6766(interfaceC7190, i3, false)), Integer.valueOf(i3));
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
    public final byte[] m10721(byte[] bArr) {
        long jM4255 = m4255();
        C5524 c5524 = this.f15258;
        try {
            this = jM4255 == 19500 ? c5524.m10740() : c5524.m10729();
            return bArr == null ? this : AbstractC4346.m8858(bArr, this);
        } catch (ProtobufDecodingException e) {
            C4210.m8609((int) (jM4255 & 2147483647L), this.f15257.mo12355(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final LinkedHashMap m10722(InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7183.getClass();
        C7076 c7076 = (C7076) interfaceC7183;
        InterfaceC7183 interfaceC71832 = c7076.f18992;
        InterfaceC7183 interfaceC71833 = c7076.f18991;
        interfaceC71832.getClass();
        interfaceC71833.getClass();
        C7069 c7069 = new C7069(interfaceC71832, interfaceC71833, 0);
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new C7102(c7069, 2).m12375(this, map != null ? map.entrySet() : null);
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(set, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6874(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        m4256(mo10704(interfaceC7190, i));
        return m10727(interfaceC7183, obj);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo6875(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        m4256(mo10704(interfaceC7190, i));
        if (this.f15260) {
            return null;
        }
        return m10727(interfaceC7183, obj);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC7188 mo6876(InterfaceC7190 interfaceC7190) {
        Integer num;
        InterfaceC7190 interfaceC71902 = this.f15257;
        interfaceC7190.getClass();
        try {
            AbstractC4921 kind = interfaceC7190.getKind();
            C7197 c7197 = C7197.f19212;
            boolean zM8917 = AbstractC4394.m8917(kind, c7197);
            C6308 c6308 = this.f15263;
            C5524 c5524 = this.f15258;
            try {
                if (zM8917) {
                    long jM4255 = m4255();
                    if (!AbstractC4394.m8917(interfaceC71902.getKind(), c7197) || jM4255 == 19500 || interfaceC71902.equals(interfaceC7190)) {
                        return (c5524.f15270 == ProtoWireType.SIZE_DELIMITED && AbstractC3064.m6777(interfaceC7190.mo12356(0))) ? new C5530(c6308, new C5524(c5524.m10731()), interfaceC7190) : new C5518(c6308, c5524, jM4255, interfaceC7190);
                    }
                    C5524 c5524M8307 = AbstractC3932.m8307(c5524, jM4255);
                    c5524M8307.m10737();
                    return new C5518(c6308, c5524M8307, 1 | ProtoIntegerType.DEFAULT.getSignature(), interfaceC7190);
                }
                if (!AbstractC4394.m8917(kind, C7197.f19213) && !AbstractC4394.m8917(kind, C7197.f19214) && !(kind instanceof C7192)) {
                    if (AbstractC4394.m8917(kind, C7197.f19215)) {
                        return new C5514(c6308, new C5524(m4255() == 19500 ? c5524.m10730() : c5524.m10731()), m4255(), interfaceC7190);
                    }
                    throw new SerializationException("Primitives are not supported at top-level");
                }
                long jM42552 = m4255();
                if (jM42552 == 19500 && AbstractC4394.m8917(interfaceC71902, interfaceC7190)) {
                    return this;
                }
                if (!AbstractC3064.m6778(jM42552)) {
                    return new C5520(c6308, AbstractC3932.m8307(c5524, jM42552), interfaceC7190);
                }
                int i = ((int) (jM42552 & 2147483647L)) - 1;
                HashMap map = this.f15259;
                if (map != null && (num = (Integer) map.get(Integer.valueOf(i))) != null) {
                    jM42552 = (jM42552 & 1152921500311879680L) | ((long) num.intValue());
                }
                return new C5529(c6308, c5524, jM42552, interfaceC7190);
            } catch (ProtobufDecodingException e) {
                e = e;
            }
        } catch (ProtobufDecodingException e2) {
            e = e2;
        }
        throw new ProtobufDecodingException("Fail to begin structure for " + interfaceC7190.mo12355() + " in " + interfaceC71902.mo12355() + " at proto number " + ((int) (2147483647L & m4255())), e);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10652() {
        return this.f15263.f17387;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6877(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo10672(InterfaceC7190 interfaceC7190) {
        int iIntValue;
        HashMap map;
        C5524 c5524 = this.f15258;
        interfaceC7190.getClass();
        while (true) {
            try {
                int iM10737 = c5524.m10737();
                C7110 c7110 = this.f15256;
                if (iM10737 == -1) {
                    return c7110.m12376();
                }
                if (iM10737 == 0) {
                    throw new SerializationException("0 is not allowed as the protobuf field number in " + interfaceC7190.mo12355() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.f15261;
                if (iArr != null) {
                    iIntValue = (iM10737 < 0 || iM10737 >= iArr.length) ? -1 : iArr[iM10737];
                } else {
                    HashMap map2 = this.f15262;
                    map2.getClass();
                    Object obj = map2.get(Integer.valueOf(iM10737));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (AbstractC3064.m6778(AbstractC3064.m6767(interfaceC7190, iIntValue)) && (map = this.f15259) != null) {
                    }
                    c7110.m12377(iIntValue);
                    return iIntValue;
                }
                c5524.m10738();
            } catch (ProtobufDecodingException e) {
                throw new ProtobufDecodingException("Fail to get element index for " + interfaceC7190.mo12355() + " in " + this.f15257.mo12355(), e);
            }
        }
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final String mo6878(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return mo10718(mo10704(interfaceC7190, i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7186 mo6880(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        m4256(m4257());
        return this;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final char mo6881() {
        return (char) m10725(m4257());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6882() {
        return m10724(m4257());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final double mo6883() {
        return m10723(m4257());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final float mo6884() {
        return m10726(m4257());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo6885() {
        return (short) m10725(m4257());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final double m10723(long j) {
        C5524 c5524 = this.f15258;
        try {
            return j == 19500 ? Double.longBitsToDouble(c5524.m10735()) : c5524.m10739();
        } catch (ProtobufDecodingException e) {
            C4210.m8609((int) (j & 2147483647L), this.f15257.mo12355(), e);
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean m10724(long j) {
        int iM10725 = m10725(j);
        if (iM10725 == 0) {
            return false;
        }
        if (iM10725 == 1) {
            return true;
        }
        throw new SerializationException(AbstractC6136.m11556(iM10725, "Unexpected boolean value: "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final int m10725(long j) {
        C5524 c5524 = this.f15258;
        try {
            return j == 19500 ? c5524.m10733(ProtoIntegerType.DEFAULT) : c5524.m10744(AbstractC3064.m6757(j));
        } catch (ProtobufDecodingException e) {
            C4210.m8609((int) (j & 2147483647L), this.f15257.mo12355(), e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final float m10726(long j) {
        C5524 c5524 = this.f15258;
        try {
            return j == 19500 ? Float.intBitsToFloat(c5524.m10741()) : c5524.m10743();
        } catch (ProtobufDecodingException e) {
            C4210.m8609((int) (j & 2147483647L), this.f15257.mo12355(), e);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final Object m10727(InterfaceC7183 interfaceC7183, Object obj) {
        String string;
        C7197 c7197 = C7197.f19215;
        interfaceC7183.getClass();
        try {
            if (interfaceC7183 instanceof C7076) {
                return m10722(interfaceC7183, obj);
            }
            if (AbstractC4394.m8917(interfaceC7183.getDescriptor(), C7117.f19059.f19069)) {
                return m10721((byte[]) obj);
            }
            if (!AbstractC4394.m8917(interfaceC7183.getDescriptor(), C7132.f19090.f19069)) {
                return interfaceC7183 instanceof AbstractC7104 ? ((AbstractC7104) interfaceC7183).m12375(this, obj) : interfaceC7183.deserialize(this);
            }
            C5176 c5176 = (C5176) obj;
            byte[] bArr = c5176 != null ? c5176.f14740 : null;
            return new C5176(m10721(bArr != null ? bArr : null));
        } catch (ProtobufDecodingException e) {
            long jM4255 = m4255();
            InterfaceC7190 descriptor = interfaceC7183.getDescriptor();
            InterfaceC7190 interfaceC7190 = this.f15257;
            if (AbstractC4394.m8917(interfaceC7190, descriptor)) {
                string = "Error while decoding " + interfaceC7190.mo12355();
            } else if (AbstractC4394.m8917(interfaceC7190.getKind(), C7197.f19212) && !AbstractC4394.m8917(interfaceC7183.getDescriptor().getKind(), c7197)) {
                StringBuilder sb = new StringBuilder("Error while decoding index ");
                sb.append(((int) (jM4255 & 2147483647L)) - 1);
                sb.append(" in repeated field of ");
                sb.append(interfaceC7183.getDescriptor().mo12355());
                string = sb.toString();
            } else if (AbstractC4394.m8917(interfaceC7190.getKind(), c7197)) {
                int i = ((int) (jM4255 & 2147483647L)) - 1;
                int i2 = i / 2;
                string = "Error while decoding " + (i % 2 == 0 ? "key" : "value") + " of index " + i2 + " in map field of " + interfaceC7183.getDescriptor().mo12355();
            } else {
                string = "Error while decoding " + interfaceC7183.getDescriptor().mo12355() + " at proto number " + ((int) (jM4255 & 2147483647L)) + " of " + interfaceC7190.mo12355();
            }
            throw new ProtobufDecodingException(string, e);
        }
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final long mo6886(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return m10719(mo10704(interfaceC7190, i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo6887() {
        return (byte) m10725(m4257());
    }
}
