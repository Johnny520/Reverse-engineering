package kotlinx.serialization.protobuf.internal;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.runtime.internal.C2080;
import androidx.core.view.AbstractC3112;
import androidx.core.view.C3075;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.C6009;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5964;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.ProtoIntegerType;
import p047.C7156;
import p103.C7899;
import p103.C7906;
import p103.C7933;
import p103.C7947;
import p103.C7956;
import p103.C7962;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8017;
import p107.C8022;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6352 extends AbstractC3112 implements InterfaceC8015, InterfaceC8017 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C3075 f15597;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7156 f15598;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC8020 f15599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ProtobufTaggedEncoder$NullableMode f15600;

    public C6352(C7156 c7156, C3075 c3075, InterfaceC8020 interfaceC8020) {
        c7156.getClass();
        c3075.getClass();
        interfaceC8020.getClass();
        this.f15600 = ProtobufTaggedEncoder$NullableMode.NOT_NULL;
        this.f15598 = c7156;
        this.f15597 = c3075;
        this.f15599 = interfaceC8020;
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo11204(int i) {
        m11329(i, m4827());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo11278(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        ProtobufTaggedEncoder$NullableMode protobufTaggedEncoder$NullableMode;
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        if (interfaceC8020.mo12944(i)) {
            protobufTaggedEncoder$NullableMode = ProtobufTaggedEncoder$NullableMode.OPTIONAL;
        } else {
            InterfaceC8020 interfaceC8020Mo12942 = interfaceC8020.mo12942(i);
            if (interfaceC8020Mo12942.mo12969()) {
                AbstractC9019 kind = interfaceC8020Mo12942.getKind();
                if (!AbstractC5227.m9466(kind, C8027.f19553)) {
                    C8027 c8027 = C8027.f19555;
                    protobufTaggedEncoder$NullableMode = AbstractC5227.m9466(kind, c8027) ? ProtobufTaggedEncoder$NullableMode.COLLECTION : AbstractC5227.m9466(interfaceC8020.getKind(), c8027) ? ProtobufTaggedEncoder$NullableMode.LIST_ELEMENT : ProtobufTaggedEncoder$NullableMode.ACCEPTABLE;
                }
            } else {
                protobufTaggedEncoder$NullableMode = ProtobufTaggedEncoder$NullableMode.NOT_NULL;
            }
        }
        this.f15600 = protobufTaggedEncoder$NullableMode;
        m4826(mo11318(interfaceC8020, i));
        mo11264(interfaceC8013, obj);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo11264(InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8013.getClass();
        if (interfaceC8013 instanceof C7906) {
            C7906 c7906 = (C7906) interfaceC8013;
            InterfaceC8013 interfaceC80132 = c7906.f19332;
            InterfaceC8013 interfaceC80133 = c7906.f19331;
            interfaceC80132.getClass();
            interfaceC80133.getClass();
            C7899 c7899 = new C7899(interfaceC80132, interfaceC80133, 0);
            InterfaceC8020 descriptor = c7899.getDescriptor();
            descriptor.getClass();
            C7933 c7933 = new C7933(descriptor, 3);
            obj.getClass();
            Set setEntrySet = ((Map) obj).entrySet();
            Set set = setEntrySet;
            set.getClass();
            int size = set.size();
            InterfaceC8017 interfaceC8017Mo11328 = mo11328(c7933, size);
            Set set2 = setEntrySet;
            set2.getClass();
            Iterator it = set2.iterator();
            for (int i = 0; i < size; i++) {
                interfaceC8017Mo11328.mo11278(c7933, i, c7899, it.next());
            }
            interfaceC8017Mo11328.mo11270(c7933);
            return;
        }
        boolean zM9466 = AbstractC5227.m9466(interfaceC8013.getDescriptor(), C7947.f19399.f19409);
        C3075 c3075 = this.f15597;
        if (zM9466) {
            obj.getClass();
            byte[] bArr = (byte[]) obj;
            long jM4827 = m4827();
            if (jM4827 == 19500) {
                c3075.m4731(bArr);
                return;
            }
            c3075.getClass();
            C3075.m4699(c3075, (C6348) c3075.f6882, ProtoWireType.SIZE_DELIMITED.wireIntWithTag((int) (jM4827 & 2147483647L)));
            c3075.m4731(bArr);
            return;
        }
        if (!AbstractC5227.m9466(interfaceC8013.getDescriptor(), C7962.f19430.f19409)) {
            interfaceC8013.serialize(this, obj);
            return;
        }
        obj.getClass();
        byte[] bArr2 = ((C6009) obj).f15085;
        long jM48272 = m4827();
        if (jM48272 == 19500) {
            c3075.m4731(bArr2);
            return;
        }
        c3075.getClass();
        C3075.m4699(c3075, (C6348) c3075.f6882, ProtoWireType.SIZE_DELIMITED.wireIntWithTag((int) (jM48272 & 2147483647L)));
        c3075.m4731(bArr2);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo11279(C7956 c7956, int i, char c) {
        c7956.getClass();
        m11329(c, mo11318(c7956, i));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo11280(C7956 c7956, int i, byte b) {
        c7956.getClass();
        m11329(b, mo11318(c7956, i));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo11265(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        long jM4827 = m4827();
        int iM1728 = AbstractC1298.m1728(interfaceC8020, i, true);
        C3075 c3075 = this.f15597;
        if (jM4827 == 19500) {
            C3075.m4699(c3075, (C6348) c3075.f6882, iM1728);
        } else {
            c3075.m4732(iM1728, (int) (jM4827 & 2147483647L), ProtoIntegerType.DEFAULT);
        }
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo11266(char c) {
        m11329(c, m4827());
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo11281(InterfaceC8020 interfaceC8020, int i, long j) {
        interfaceC8020.getClass();
        m11332(mo11318(interfaceC8020, i), j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public long mo11318(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return AbstractC1298.m1736(interfaceC8020, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public void mo11319(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo11268() {
        ProtobufTaggedEncoder$NullableMode protobufTaggedEncoder$NullableMode = this.f15600;
        if (protobufTaggedEncoder$NullableMode != ProtobufTaggedEncoder$NullableMode.ACCEPTABLE) {
            int i = AbstractC6354.f15609[protobufTaggedEncoder$NullableMode.ordinal()];
            throw new SerializationException(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "'null' is not supported in ProtoBuf" : "'null' is not allowed for not-null properties" : "'null' is not supported as the value of a list element in ProtoBuf" : "'null' is not supported as the value of collection types in ProtoBuf" : "'null' is not supported for optional properties in ProtoBuf");
        }
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC8017 mo11269(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        AbstractC9019 kind = interfaceC8020.getKind();
        if (AbstractC5227.m9466(kind, C8027.f19555)) {
            if (!AbstractC1298.m1709(interfaceC8020.mo12942(0)) || (m4825() & 4294967296L) == 0) {
                return new C6350(m4825(), this.f15597, this.f15598, interfaceC8020);
            }
            return new C6360(m4825(), this.f15597, this.f15598, interfaceC8020);
        }
        if (!AbstractC5227.m9466(kind, C8027.f19554) && !AbstractC5227.m9466(kind, C8027.f19552) && !(kind instanceof C8022)) {
            if (AbstractC5227.m9466(kind, C8027.f19553)) {
                return new C6346(m4825(), this.f15597, this.f15598, interfaceC8020);
            }
            throw new SerializationException("This serial kind is not supported as structure: " + interfaceC8020);
        }
        long jM4825 = m4825();
        if (jM4825 == 19500 && interfaceC8020.equals(this.f15599)) {
            return this;
        }
        boolean zM1710 = AbstractC1298.m1710(jM4825);
        C7156 c7156 = this.f15598;
        return zM1710 ? new C6358(c7156, this.f15597, interfaceC8020) : new C6345(m4825(), this.f15597, c7156, interfaceC8020);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C2080 mo11205() {
        return this.f15598.f17781;
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11270(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        int i = this.f6966;
        if (i >= 0) {
            if (i < 0) {
                throw new SerializationException("No tag in stack for requested element");
            }
            long[] jArr = (long[]) this.f6965;
            this.f6966 = i - 1;
            long j = jArr[i];
        }
        mo11319(interfaceC8020);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo11284(C7956 c7956, int i, short s) {
        c7956.getClass();
        m11329(s, mo11318(c7956, i));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo11285(C7956 c7956, int i, float f) {
        c7956.getClass();
        m11330(f, mo11318(c7956, i));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo11271(float f) {
        m11330(f, m4827());
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo11272(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        this.f15598.getClass();
        return false;
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo11288(int i, int i2, InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        m11329(i2, mo11318(interfaceC8020, i));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo11273(boolean z) {
        m11329(z ? 1 : 0, m4827());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo11274(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        ProtobufTaggedEncoder$NullableMode protobufTaggedEncoder$NullableMode;
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        if (interfaceC8020.mo12944(i)) {
            protobufTaggedEncoder$NullableMode = ProtobufTaggedEncoder$NullableMode.OPTIONAL;
        } else {
            AbstractC9019 kind = interfaceC8020.mo12942(i).getKind();
            if (!AbstractC5227.m9466(kind, C8027.f19553)) {
                C8027 c8027 = C8027.f19555;
                protobufTaggedEncoder$NullableMode = AbstractC5227.m9466(kind, c8027) ? ProtobufTaggedEncoder$NullableMode.COLLECTION : AbstractC5227.m9466(interfaceC8020.getKind(), c8027) ? ProtobufTaggedEncoder$NullableMode.LIST_ELEMENT : ProtobufTaggedEncoder$NullableMode.ACCEPTABLE;
            }
        }
        this.f15600 = protobufTaggedEncoder$NullableMode;
        m4826(mo11318(interfaceC8020, i));
        m12995(interfaceC8013, obj);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public InterfaceC8015 mo11275(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        m4826(m4827());
        return this;
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC8015 mo11293(C7956 c7956, int i) {
        c7956.getClass();
        long jMo11318 = mo11318(c7956, i);
        c7956.mo12942(i).getClass();
        m4826(jMo11318);
        return this;
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo11206(byte b) {
        m11329(b, m4827());
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo11276(double d) {
        m11333(m4827(), d);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo11207(short s) {
        m11329(s, m4827());
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo11208(String str) {
        str.getClass();
        mo11331(m4827(), str);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public InterfaceC8017 mo11328(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        AbstractC9019 kind = interfaceC8020.getKind();
        C8027 c8027 = C8027.f19555;
        if (!AbstractC5227.m9466(kind, c8027)) {
            if (AbstractC5227.m9466(kind, C8027.f19553)) {
                return new C6346(((long[]) this.f6965)[this.f6966], this.f15597, this.f15598, interfaceC8020);
            }
            throw new SerializationException("This serial kind is not supported as collection: " + interfaceC8020);
        }
        long jM4825 = m4825();
        if ((4294967296L & jM4825) != 0 && AbstractC1298.m1709(interfaceC8020.mo12942(0))) {
            return new C6360(m4825(), this.f15597, this.f15598, interfaceC8020);
        }
        if (jM4825 == 19500) {
            C3075 c3075 = this.f15597;
            C3075.m4699(c3075, (C6348) c3075.f6882, i);
        }
        InterfaceC8020 interfaceC80202 = this.f15599;
        if (!AbstractC5227.m9466(interfaceC80202.getKind(), c8027) || jM4825 == 19500 || interfaceC80202.equals(interfaceC8020)) {
            return new C6350(jM4825, this.f15597, this.f15598, interfaceC8020);
        }
        return new C6345(this.f15598, this.f15597, jM4825, interfaceC8020, new C6348());
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void m11329(int i, long j) {
        C3075 c3075 = this.f15597;
        if (j == 19500) {
            C3075.m4699(c3075, (C6348) c3075.f6882, i);
        } else {
            c3075.m4732(i, (int) (2147483647L & j), AbstractC1298.m1723(j));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m11330(float f, long j) {
        C3075 c3075 = this.f15597;
        if (j == 19500) {
            ((C6348) c3075.f6882).m11322(Integer.reverseBytes(Float.floatToRawIntBits(f)));
            return;
        }
        C3075.m4699(c3075, (C6348) c3075.f6882, ProtoWireType.i32.wireIntWithTag((int) (j & 2147483647L)));
        ((C6348) c3075.f6882).m11322(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public void mo11331(long j, String str) {
        str.getClass();
        C3075 c3075 = this.f15597;
        if (j == 19500) {
            c3075.getClass();
            byte[] bytes = str.getBytes(AbstractC5964.f15033);
            bytes.getClass();
            c3075.m4731(bytes);
            return;
        }
        c3075.getClass();
        byte[] bytes2 = str.getBytes(AbstractC5964.f15033);
        bytes2.getClass();
        C3075.m4699(c3075, (C6348) c3075.f6882, ProtoWireType.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
        c3075.m4731(bytes2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void m11332(long j, long j2) {
        C3075 c3075 = this.f15597;
        if (j == 19500) {
            c3075.m4716((C6348) c3075.f6882, j2, ProtoIntegerType.DEFAULT);
            return;
        }
        int i = (int) (2147483647L & j);
        ProtoIntegerType protoIntegerTypeM1723 = AbstractC1298.m1723(j);
        c3075.getClass();
        C6348 c6348 = (C6348) c3075.f6882;
        protoIntegerTypeM1723.getClass();
        C3075.m4699(c3075, c6348, (protoIntegerTypeM1723 == ProtoIntegerType.FIXED ? ProtoWireType.i64 : ProtoWireType.VARINT).wireIntWithTag(i));
        c3075.m4716(c6348, j2, protoIntegerTypeM1723);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final void m11333(long j, double d) {
        C3075 c3075 = this.f15597;
        if (j == 19500) {
            ((C6348) c3075.f6882).m11321(Long.reverseBytes(Double.doubleToRawLongBits(d)));
            return;
        }
        C3075.m4699(c3075, (C6348) c3075.f6882, ProtoWireType.i64.wireIntWithTag((int) (j & 2147483647L)));
        ((C6348) c3075.f6882).m11321(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final void mo11294(InterfaceC8020 interfaceC8020, int i, String str) {
        interfaceC8020.getClass();
        str.getClass();
        mo11331(mo11318(interfaceC8020, i), str);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final void mo11295(C7956 c7956, int i, double d) {
        c7956.getClass();
        m11333(mo11318(c7956, i), d);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final void mo11296(InterfaceC8020 interfaceC8020, int i, boolean z) {
        interfaceC8020.getClass();
        m11329(z ? 1 : 0, mo11318(interfaceC8020, i));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo11210(long j) {
        m11332(m4827(), j);
    }
}
