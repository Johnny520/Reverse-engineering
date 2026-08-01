package kotlin.reflect.jvm.internal;

import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5443;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5481;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5522;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5625;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5634;
import kotlin.text.AbstractC5976;
import net.bytebuddy.utility.JavaConstant;
import p023.C6986;
import p050.AbstractC7173;
import p083.C7716;
import p083.C7722;
import p086.AbstractC7741;
import p086.InterfaceC7737;
import p087.AbstractC7742;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5881 extends AbstractC7173 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C6986 f14911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7737 f14912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final JvmProtoBuf$JvmPropertySignature f14913;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ProtoBuf$Property f14914;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5305 f14915;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f14916;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5881(InterfaceC5305 interfaceC5305, ProtoBuf$Property protoBuf$Property, JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature, InterfaceC7737 interfaceC7737, C6986 c6986) {
        String string;
        String string2;
        protoBuf$Property.getClass();
        interfaceC7737.getClass();
        c6986.getClass();
        this.f14915 = interfaceC5305;
        this.f14914 = protoBuf$Property;
        this.f14913 = jvmProtoBuf$JvmPropertySignature;
        this.f14912 = interfaceC7737;
        this.f14911 = c6986;
        if (jvmProtoBuf$JvmPropertySignature.hasGetter()) {
            string2 = interfaceC7737.getString(jvmProtoBuf$JvmPropertySignature.getGetter().getName()).concat(interfaceC7737.getString(jvmProtoBuf$JvmPropertySignature.getGetter().getDesc()));
        } else {
            C5558 c5558 = C7722.f18692;
            C7716 c7716M12729 = C7722.m12729(protoBuf$Property, interfaceC7737, c6986, true);
            if (c7716M12729 == null) {
                C5043.m9154(interfaceC5305, "No field signature for property: ");
                throw null;
            }
            String str = c7716M12729.f18681;
            String str2 = c7716M12729.f18680;
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC5443.m9789(str));
            InterfaceC5331 interfaceC5331Mo9587 = interfaceC5305.mo9587();
            interfaceC5331Mo9587.getClass();
            if (AbstractC5227.m9466(interfaceC5305.getVisibility(), AbstractC5321.f13462) && (interfaceC5331Mo9587 instanceof C5633)) {
                ProtoBuf$Class protoBuf$Class = ((C5633) interfaceC5331Mo9587).f14348;
                C5557 c5557 = AbstractC7742.f18779;
                c5557.getClass();
                Integer num = (Integer) AbstractC7741.m12763(protoBuf$Class, c5557);
                string = "$" + AbstractC5522.f14048.replace(num != null ? interfaceC7737.getString(num.intValue()) : "main", JavaConstant.Dynamic.DEFAULT_NAME);
            } else if (AbstractC5227.m9466(interfaceC5305.getVisibility(), AbstractC5321.f13465) && (interfaceC5331Mo9587 instanceof InterfaceC5298)) {
                InterfaceC5634 interfaceC5634 = ((C5625) interfaceC5305).f14310;
                if (interfaceC5634 instanceof C5481) {
                    C5481 c5481 = (C5481) interfaceC5634;
                    if (c5481.f13929 != null) {
                        StringBuilder sb2 = new StringBuilder("$");
                        String strM12651 = c5481.f13931.m12651();
                        strM12651.getClass();
                        sb2.append(C5523.m9889(AbstractC5976.m10701(strM12651, '/')).m9894());
                        string = sb2.toString();
                    }
                }
            } else {
                string = "";
            }
            sb.append(string);
            sb.append("()");
            sb.append(str2);
            string2 = sb.toString();
        }
        this.f14916 = string2;
    }

    @Override // p050.AbstractC7173
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo10560() {
        return this.f14916;
    }
}
