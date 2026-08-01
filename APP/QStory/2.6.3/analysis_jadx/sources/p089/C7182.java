package p089;

import androidx.compose.foundation.C1030;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlinx.serialization.SerializationException;
import lin.xposed.hook.javaplugin.C5554;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世苏兰子楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7182 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f19167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EmptyList f19168;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5093 f19169;

    public C7182(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        this.f19169 = interfaceC5093;
        this.f19168 = EmptyList.INSTANCE;
        this.f19167 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C1030(this, 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 descriptor = getDescriptor();
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        interfaceC7189Mo10676.getClass();
        Object objMo10674 = null;
        while (true) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(getDescriptor());
            if (iMo10718 == -1) {
                if (objMo10674 != null) {
                    interfaceC7189Mo10676.mo10678(descriptor);
                    return objMo10674;
                }
                C5554.m10872((String) ref$ObjectRef.element, "Polymorphic value has not been read for class ");
                return null;
            }
            if (iMo10718 != 0) {
                T t = ref$ObjectRef.element;
                if (iMo10718 != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) t;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iMo10718);
                    throw new SerializationException(sb.toString());
                }
                if (t == 0) {
                    C5925.m11310("Cannot read polymorphic value before its type token");
                    return null;
                }
                ref$ObjectRef.element = t;
                objMo10674 = interfaceC7189Mo10676.mo10674(getDescriptor(), iMo10718, AbstractC5062.m10045(this, interfaceC7189Mo10676, (String) t), null);
            } else {
                ref$ObjectRef.element = interfaceC7189Mo10676.mo10686(getDescriptor(), iMo10718);
            }
        }
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return (InterfaceC7191) this.f19167.getValue();
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        obj.getClass();
        InterfaceC7184 interfaceC7184M10044 = AbstractC5062.m10044(this, interfaceC7186, obj);
        InterfaceC7191 descriptor = getDescriptor();
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(descriptor);
        interfaceC7188Mo10710.mo10735(getDescriptor(), 0, interfaceC7184M10044.getDescriptor().mo12382());
        interfaceC7188Mo10710.mo10719(getDescriptor(), 1, interfaceC7184M10044, obj);
        interfaceC7188Mo10710.mo10711(descriptor);
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f19169 + ')';
    }
}
