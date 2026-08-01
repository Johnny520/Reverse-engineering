package kotlinx.serialization.protobuf.internal;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.runtime.internal.C2080;
import androidx.core.view.AbstractC3112;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C6009;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p025.AbstractC7012;
import p047.C7156;
import p103.AbstractC7934;
import p103.C7899;
import p103.C7906;
import p103.C7932;
import p103.C7940;
import p103.C7947;
import p103.C7956;
import p103.C7962;
import p105.InterfaceC8013;
import p106.InterfaceC8016;
import p106.InterfaceC8018;
import p107.C8022;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6353 extends AbstractC3112 implements InterfaceC8016, InterfaceC8018 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C7940 f15601;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC8020 f15602;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6357 f15603;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public HashMap f15604;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15605;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int[] f15606;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public HashMap f15607;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7156 f15608;

    public C6353(C7156 c7156, C6357 c6357, InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        this.f15608 = c7156;
        this.f15603 = c6357;
        this.f15602 = interfaceC8020;
        this.f15601 = new C7940(interfaceC8020, new ProtobufDecoder$elementMarker$1(this));
        int iMo12939 = interfaceC8020.mo12939();
        if (iMo12939 >= 32) {
            m11336(interfaceC8020, iMo12939);
            return;
        }
        int i = iMo12939 + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < iMo12939; i3++) {
            int iM1728 = AbstractC1298.m1728(interfaceC8020, i3, false);
            if (iM1728 > iMo12939 || iM1728 == -2) {
                m11336(interfaceC8020, iMo12939);
                return;
            }
            iArr[iM1728] = i3;
        }
        this.f15606 = iArr;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo11211(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return m11340(mo11320(interfaceC8020, i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final byte mo11212(C7956 c7956, int i) {
        c7956.getClass();
        return (byte) m11341(mo11320(c7956, i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final InterfaceC8016 mo11213(C7956 c7956, int i) {
        c7956.getClass();
        long jMo11320 = mo11320(c7956, i);
        c7956.mo12942(i).getClass();
        m4826(jMo11320);
        return this;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final double mo11214(C7956 c7956, int i) {
        c7956.getClass();
        return m11339(mo11320(c7956, i));
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final Object mo11216(InterfaceC8013 interfaceC8013) {
        interfaceC8013.getClass();
        return m11343(interfaceC8013, null);
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo11217() {
        return !this.f15605;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final char mo11219(C7956 c7956, int i) {
        c7956.getClass();
        return (char) m11341(mo11320(c7956, i));
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final String mo11221() {
        return mo11334(m4827());
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo11224() {
        return m11341(m4827());
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo11227() {
        return m11335(m4827());
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final short mo11228(C7956 c7956, int i) {
        c7956.getClass();
        return (short) m11341(mo11320(c7956, i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final float mo11229(C7956 c7956, int i) {
        c7956.getClass();
        return m11342(mo11320(c7956, i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final int mo11230(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return m11341(mo11320(interfaceC8020, i));
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final int mo11231(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        int iM11341 = m11341(m4827());
        if (iM11341 < interfaceC8020.mo12939() && iM11341 >= 0 && AbstractC1298.m1728(interfaceC8020, iM11341, true) == iM11341) {
            return iM11341;
        }
        int iMo12939 = interfaceC8020.mo12939();
        for (int i = 0; i < iMo12939; i++) {
            if (AbstractC1298.m1728(interfaceC8020, i, true) == iM11341) {
                return i;
            }
        }
        throw new ProtobufDecodingException(iM11341 + " is not among valid " + this.f15602.mo12941() + " enum proto numbers", null, 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public String mo11334(long j) {
        C6357 c6357 = this.f15603;
        try {
            if (j != 19500) {
                return c6357.m11350();
            }
            int iM11349 = c6357.m11349(ProtoIntegerType.DEFAULT);
            C6357.m11344(iM11349);
            C6349 c6349 = c6357.f15617;
            byte[] bArr = c6349.f15593;
            int i = c6349.f15591;
            String strM10694 = AbstractC5971.m10694(i, bArr, i + iM11349);
            c6349.f15591 += iM11349;
            return strM10694;
        } catch (ProtobufDecodingException e) {
            C5043.m9158((int) (j & 2147483647L), this.f15602.mo12941(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final long m11335(long j) {
        C6357 c6357 = this.f15603;
        try {
            return j == 19500 ? c6357.m11348(ProtoIntegerType.DEFAULT) : c6357.m11358(AbstractC1298.m1723(j));
        } catch (ProtobufDecodingException e) {
            C5043.m9158((int) (j & 2147483647L), this.f15602.mo12941(), e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏 */
    public long mo11320(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return AbstractC1298.m1736(interfaceC8020, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final void m11336(InterfaceC8020 interfaceC8020, int i) {
        HashMap map = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (AbstractC1298.m1728(interfaceC8020, i3, false) == -2) {
                List listM1732 = AbstractC1298.m1732(interfaceC8020.mo12942(i3), this.f15608.f17781);
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM1732, 10));
                Iterator it = listM1732.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (AbstractC1298.m1736((InterfaceC8020) it.next(), 0) & 2147483647L)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(Integer.valueOf(((Number) it2.next()).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                map.put(Integer.valueOf(AbstractC1298.m1728(interfaceC8020, i3, false)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.f15604 = new HashMap(i2, 1.0f);
        }
        this.f15607 = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.飘花落叶言子苏哲世楪兰, kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲世苏兰] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲世苏兰] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final byte[] m11337(byte[] bArr) {
        long jM4825 = m4825();
        C6357 c6357 = this.f15603;
        try {
            this = jM4825 == 19500 ? c6357.m11356() : c6357.m11345();
            return bArr == null ? this : AbstractC5179.m9413(bArr, this);
        } catch (ProtobufDecodingException e) {
            C5043.m9158((int) (jM4825 & 2147483647L), this.f15602.mo12941(), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final LinkedHashMap m11338(InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8013.getClass();
        C7906 c7906 = (C7906) interfaceC8013;
        InterfaceC8013 interfaceC80132 = c7906.f19332;
        InterfaceC8013 interfaceC80133 = c7906.f19331;
        interfaceC80132.getClass();
        interfaceC80133.getClass();
        C7899 c7899 = new C7899(interfaceC80132, interfaceC80133, 0);
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new C7932(c7899, 2).m12961(this, map != null ? map.entrySet() : null);
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(set, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo11233(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        m4826(mo11320(interfaceC8020, i));
        return m11343(interfaceC8013, obj);
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo11234(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        m4826(mo11320(interfaceC8020, i));
        if (this.f15605) {
            return null;
        }
        return m11343(interfaceC8013, obj);
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8018 mo11235(InterfaceC8020 interfaceC8020) {
        Integer num;
        InterfaceC8020 interfaceC80202 = this.f15602;
        interfaceC8020.getClass();
        try {
            AbstractC9019 kind = interfaceC8020.getKind();
            C8027 c8027 = C8027.f19555;
            boolean zM9466 = AbstractC5227.m9466(kind, c8027);
            C7156 c7156 = this.f15608;
            C6357 c6357 = this.f15603;
            try {
                if (zM9466) {
                    long jM4825 = m4825();
                    if (!AbstractC5227.m9466(interfaceC80202.getKind(), c8027) || jM4825 == 19500 || interfaceC80202.equals(interfaceC8020)) {
                        return (c6357.f15615 == ProtoWireType.SIZE_DELIMITED && AbstractC1298.m1709(interfaceC8020.mo12942(0))) ? new C6363(c7156, new C6357(c6357.m11347()), interfaceC8020) : new C6351(c7156, c6357, jM4825, interfaceC8020);
                    }
                    C6357 c6357M5635 = AbstractC3400.m5635(c6357, jM4825);
                    c6357M5635.m11353();
                    return new C6351(c7156, c6357M5635, 1 | ProtoIntegerType.DEFAULT.getSignature(), interfaceC8020);
                }
                if (!AbstractC5227.m9466(kind, C8027.f19554) && !AbstractC5227.m9466(kind, C8027.f19552) && !(kind instanceof C8022)) {
                    if (AbstractC5227.m9466(kind, C8027.f19553)) {
                        return new C6347(c7156, new C6357(m4825() == 19500 ? c6357.m11346() : c6357.m11347()), m4825(), interfaceC8020);
                    }
                    throw new SerializationException("Primitives are not supported at top-level");
                }
                long jM48252 = m4825();
                if (jM48252 == 19500 && AbstractC5227.m9466(interfaceC80202, interfaceC8020)) {
                    return this;
                }
                if (!AbstractC1298.m1710(jM48252)) {
                    return new C6353(c7156, AbstractC3400.m5635(c6357, jM48252), interfaceC8020);
                }
                int i = ((int) (jM48252 & 2147483647L)) - 1;
                HashMap map = this.f15604;
                if (map != null && (num = (Integer) map.get(Integer.valueOf(i))) != null) {
                    jM48252 = (jM48252 & 1152921500311879680L) | ((long) num.intValue());
                }
                return new C6362(c7156, c6357, jM48252, interfaceC8020);
            } catch (ProtobufDecodingException e) {
                e = e;
            }
        } catch (ProtobufDecodingException e2) {
            e = e2;
        }
        throw new ProtobufDecodingException("Fail to begin structure for " + interfaceC8020.mo12941() + " in " + interfaceC80202.mo12941() + " at proto number " + ((int) (2147483647L & m4825())), e);
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C2080 mo11236() {
        return this.f15608.f17781;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo11277(InterfaceC8020 interfaceC8020) {
        int iIntValue;
        HashMap map;
        C6357 c6357 = this.f15603;
        interfaceC8020.getClass();
        while (true) {
            try {
                int iM11353 = c6357.m11353();
                C7940 c7940 = this.f15601;
                if (iM11353 == -1) {
                    return c7940.m12962();
                }
                if (iM11353 == 0) {
                    throw new SerializationException("0 is not allowed as the protobuf field number in " + interfaceC8020.mo12941() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.f15606;
                if (iArr != null) {
                    iIntValue = (iM11353 < 0 || iM11353 >= iArr.length) ? -1 : iArr[iM11353];
                } else {
                    HashMap map2 = this.f15607;
                    map2.getClass();
                    Object obj = map2.get(Integer.valueOf(iM11353));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (AbstractC1298.m1710(AbstractC1298.m1736(interfaceC8020, iIntValue)) && (map = this.f15604) != null) {
                    }
                    c7940.m12963(iIntValue);
                    return iIntValue;
                }
                c6357.m11354();
            } catch (ProtobufDecodingException e) {
                throw new ProtobufDecodingException("Fail to get element index for " + interfaceC8020.mo12941() + " in " + this.f15602.mo12941(), e);
            }
        }
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final String mo11245(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return mo11334(mo11320(interfaceC8020, i));
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC8016 mo11248(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        m4826(m4827());
        return this;
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final char mo11249() {
        return (char) m11341(m4827());
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo11250() {
        return m11340(m4827());
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final double mo11255() {
        return m11339(m4827());
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final float mo11256() {
        return m11342(m4827());
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo11257() {
        return (short) m11341(m4827());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final double m11339(long j) {
        C6357 c6357 = this.f15603;
        try {
            return j == 19500 ? Double.longBitsToDouble(c6357.m11351()) : c6357.m11355();
        } catch (ProtobufDecodingException e) {
            C5043.m9158((int) (j & 2147483647L), this.f15602.mo12941(), e);
            return 0.0d;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean m11340(long j) {
        int iM11341 = m11341(j);
        if (iM11341 == 0) {
            return false;
        }
        if (iM11341 == 1) {
            return true;
        }
        throw new SerializationException(AbstractC7012.m12147(iM11341, "Unexpected boolean value: "));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final int m11341(long j) {
        C6357 c6357 = this.f15603;
        try {
            return j == 19500 ? c6357.m11349(ProtoIntegerType.DEFAULT) : c6357.m11360(AbstractC1298.m1723(j));
        } catch (ProtobufDecodingException e) {
            C5043.m9158((int) (j & 2147483647L), this.f15602.mo12941(), e);
            return 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final float m11342(long j) {
        C6357 c6357 = this.f15603;
        try {
            return j == 19500 ? Float.intBitsToFloat(c6357.m11357()) : c6357.m11359();
        } catch (ProtobufDecodingException e) {
            C5043.m9158((int) (j & 2147483647L), this.f15602.mo12941(), e);
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final Object m11343(InterfaceC8013 interfaceC8013, Object obj) {
        String string;
        C8027 c8027 = C8027.f19553;
        interfaceC8013.getClass();
        try {
            if (interfaceC8013 instanceof C7906) {
                return m11338(interfaceC8013, obj);
            }
            if (AbstractC5227.m9466(interfaceC8013.getDescriptor(), C7947.f19399.f19409)) {
                return m11337((byte[]) obj);
            }
            if (!AbstractC5227.m9466(interfaceC8013.getDescriptor(), C7962.f19430.f19409)) {
                return interfaceC8013 instanceof AbstractC7934 ? ((AbstractC7934) interfaceC8013).m12961(this, obj) : interfaceC8013.deserialize(this);
            }
            C6009 c6009 = (C6009) obj;
            byte[] bArr = c6009 != null ? c6009.f15085 : null;
            return new C6009(m11337(bArr != null ? bArr : null));
        } catch (ProtobufDecodingException e) {
            long jM4825 = m4825();
            InterfaceC8020 descriptor = interfaceC8013.getDescriptor();
            InterfaceC8020 interfaceC8020 = this.f15602;
            if (AbstractC5227.m9466(interfaceC8020, descriptor)) {
                string = "Error while decoding " + interfaceC8020.mo12941();
            } else if (AbstractC5227.m9466(interfaceC8020.getKind(), C8027.f19555) && !AbstractC5227.m9466(interfaceC8013.getDescriptor().getKind(), c8027)) {
                StringBuilder sb = new StringBuilder("Error while decoding index ");
                sb.append(((int) (jM4825 & 2147483647L)) - 1);
                sb.append(" in repeated field of ");
                sb.append(interfaceC8013.getDescriptor().mo12941());
                string = sb.toString();
            } else if (AbstractC5227.m9466(interfaceC8020.getKind(), c8027)) {
                int i = ((int) (jM4825 & 2147483647L)) - 1;
                int i2 = i / 2;
                string = "Error while decoding " + (i % 2 == 0 ? "key" : "value") + " of index " + i2 + " in map field of " + interfaceC8013.getDescriptor().mo12941();
            } else {
                string = "Error while decoding " + interfaceC8013.getDescriptor().mo12941() + " at proto number " + ((int) (jM4825 & 2147483647L)) + " of " + interfaceC8020.mo12941();
            }
            throw new ProtobufDecodingException(string, e);
        }
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final long mo11258(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return m11335(mo11320(interfaceC8020, i));
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo11259() {
        return (byte) m11341(m4827());
    }
}
