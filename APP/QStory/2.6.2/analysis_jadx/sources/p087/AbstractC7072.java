package p087;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlinx.serialization.SerializationException;
import p007.AbstractC6136;
import p088.AbstractC7175;
import p088.InterfaceC7177;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.C7189;
import p091.C7192;
import p091.InterfaceC7190;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7072 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f18982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f18983;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f18984 = 1;

    public AbstractC7072(InterfaceC5092 interfaceC5092) {
        interfaceC5092.getClass();
        this.f18983 = interfaceC5092;
        this.f18982 = AbstractC5061.m10032("JsonContentPolymorphicSerializer<" + interfaceC5092.getSimpleName() + '>', C7192.f19198, new InterfaceC7190[0]);
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        switch (this.f18984) {
            case 0:
                InterfaceC7190 descriptor = getDescriptor();
                InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(descriptor);
                interfaceC7188Mo6876.getClass();
                Object obj = AbstractC7143.f19107;
                Object objMo6874 = obj;
                Object objMo68742 = objMo6874;
                while (true) {
                    int iMo10672 = interfaceC7188Mo6876.mo10672(getDescriptor());
                    if (iMo10672 == -1) {
                        if (objMo6874 == obj) {
                            throw new SerializationException("Element 'key' is missing");
                        }
                        if (objMo68742 == obj) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        Object objMo12359 = mo12359(objMo6874, objMo68742);
                        interfaceC7188Mo6876.mo6877(descriptor);
                        return objMo12359;
                    }
                    if (iMo10672 == 0) {
                        objMo6874 = interfaceC7188Mo6876.mo6874(getDescriptor(), 0, (InterfaceC7183) this.f18983, null);
                    } else {
                        if (iMo10672 != 1) {
                            throw new SerializationException(AbstractC6136.m11556(iMo10672, "Invalid index: "));
                        }
                        objMo68742 = interfaceC7188Mo6876.mo6874(getDescriptor(), 1, (InterfaceC7183) this.f18982, null);
                    }
                }
                break;
            default:
                InterfaceC7177 interfaceC7177M14661 = AbstractC9124.m14661(interfaceC7186);
                AbstractC7175 abstractC7175Mo10655 = interfaceC7177M14661.mo10655();
                InterfaceC7183 interfaceC7183Mo12046 = mo12046(abstractC7175Mo10655);
                interfaceC7183Mo12046.getClass();
                return interfaceC7177M14661.mo10643().m12400(interfaceC7183Mo12046, abstractC7175Mo10655);
        }
    }

    @Override // p089.InterfaceC7183
    public InterfaceC7190 getDescriptor() {
        return (C7189) this.f18982;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        int i = this.f18984;
        Object obj2 = this.f18983;
        switch (i) {
            case 0:
                InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(getDescriptor());
                interfaceC7187Mo6800.mo6791(getDescriptor(), 0, (InterfaceC7183) obj2, mo12361(obj));
                interfaceC7187Mo6800.mo6791(getDescriptor(), 1, (InterfaceC7183) this.f18982, mo12360(obj));
                interfaceC7187Mo6800.mo6801(getDescriptor());
                return;
            default:
                obj.getClass();
                InterfaceC5092 interfaceC5092 = (InterfaceC5092) obj2;
                InterfaceC7183 interfaceC7183M2147 = interfaceC7185.mo10641().m2147(interfaceC5092, obj);
                if (interfaceC7183M2147 == null) {
                    Class<?> cls = obj.getClass();
                    C4396 c4396 = AbstractC4395.f12971;
                    InterfaceC7183 interfaceC7183M6704 = AbstractC3056.m6704(c4396.mo8927(cls));
                    if (interfaceC7183M6704 == null) {
                        InterfaceC5092 interfaceC5092Mo8927 = c4396.mo8927(obj.getClass());
                        String simpleName = interfaceC5092Mo8927.getSimpleName();
                        if (simpleName == null) {
                            simpleName = String.valueOf(interfaceC5092Mo8927);
                        }
                        throw new SerializationException("Class '" + simpleName + "' is not registered for polymorphic serialization " + ("in the scope of '" + interfaceC5092.getSimpleName() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
                    }
                    interfaceC7183M2147 = interfaceC7183M6704;
                }
                interfaceC7183M2147.serialize(interfaceC7185, obj);
                return;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract Object mo12359(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract InterfaceC7183 mo12046(AbstractC7175 abstractC7175);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Object mo12360(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo12361(Object obj);

    public AbstractC7072(InterfaceC7183 interfaceC7183, InterfaceC7183 interfaceC71832) {
        this.f18983 = interfaceC7183;
        this.f18982 = interfaceC71832;
    }
}
