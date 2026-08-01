package p089;

import androidx.compose.foundation.C1030;
import com.alibaba.fastjson2.AbstractC2904;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5092;
import kotlinx.serialization.SerializationException;
import lin.xposed.hook.javaplugin.C5553;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世苏兰子楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7181 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f19172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EmptyList f19173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5092 f19174;

    public C7181(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        this.f19174 = interfaceC5092;
        this.f19173 = EmptyList.INSTANCE;
        this.f19172 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C1030(this, 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 descriptor = getDescriptor();
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        interfaceC7188Mo6876.getClass();
        Object objMo6874 = null;
        while (true) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(getDescriptor());
            if (iMo10672 == -1) {
                if (objMo6874 != null) {
                    interfaceC7188Mo6876.mo6877(descriptor);
                    return objMo6874;
                }
                C5553.m10815((String) ref$ObjectRef.element, "Polymorphic value has not been read for class ");
                return null;
            }
            if (iMo10672 != 0) {
                T t = ref$ObjectRef.element;
                if (iMo10672 != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) t;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iMo10672);
                    throw new SerializationException(sb.toString());
                }
                if (t == 0) {
                    C5919.m11249("Cannot read polymorphic value before its type token");
                    return null;
                }
                ref$ObjectRef.element = t;
                objMo6874 = interfaceC7188Mo6876.mo6874(getDescriptor(), iMo10672, AbstractC2904.m6266(this, interfaceC7188Mo6876, (String) t), null);
            } else {
                ref$ObjectRef.element = interfaceC7188Mo6876.mo6878(getDescriptor(), iMo10672);
            }
        }
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return (InterfaceC7190) this.f19172.getValue();
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        obj.getClass();
        InterfaceC7183 interfaceC7183M6258 = AbstractC2904.m6258(this, interfaceC7185, obj);
        InterfaceC7190 descriptor = getDescriptor();
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(descriptor);
        interfaceC7187Mo6800.mo6814(getDescriptor(), 0, interfaceC7183M6258.getDescriptor().mo12355());
        interfaceC7187Mo6800.mo6791(getDescriptor(), 1, interfaceC7183M6258, obj);
        interfaceC7187Mo6800.mo6801(descriptor);
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f19174 + ')';
    }
}
