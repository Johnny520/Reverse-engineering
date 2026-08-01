package p087;

import com.bumptech.glide.AbstractC3066;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlinx.serialization.SerializationException;
import p009.AbstractC6183;
import p088.AbstractC7176;
import p088.InterfaceC7178;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.C7190;
import p091.C7193;
import p091.InterfaceC7191;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7073 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f18977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f18978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f18979 = 1;

    public AbstractC7073(InterfaceC5093 interfaceC5093) {
        interfaceC5093.getClass();
        this.f18978 = interfaceC5093;
        this.f18977 = AbstractC8175.m13649("JsonContentPolymorphicSerializer<" + interfaceC5093.getSimpleName() + '>', C7193.f19194, new InterfaceC7191[0]);
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        switch (this.f18979) {
            case 0:
                InterfaceC7191 descriptor = getDescriptor();
                InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(descriptor);
                interfaceC7189Mo10676.getClass();
                Object obj = AbstractC7144.f19102;
                Object objMo10674 = obj;
                Object objMo106742 = objMo10674;
                while (true) {
                    int iMo10718 = interfaceC7189Mo10676.mo10718(getDescriptor());
                    if (iMo10718 == -1) {
                        if (objMo10674 == obj) {
                            throw new SerializationException("Element 'key' is missing");
                        }
                        if (objMo106742 == obj) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        Object objMo12386 = mo12386(objMo10674, objMo106742);
                        interfaceC7189Mo10676.mo10678(descriptor);
                        return objMo12386;
                    }
                    if (iMo10718 == 0) {
                        objMo10674 = interfaceC7189Mo10676.mo10674(getDescriptor(), 0, (InterfaceC7184) this.f18978, null);
                    } else {
                        if (iMo10718 != 1) {
                            throw new SerializationException(AbstractC6183.m11588(iMo10718, "Invalid index: "));
                        }
                        objMo106742 = interfaceC7189Mo10676.mo10674(getDescriptor(), 1, (InterfaceC7184) this.f18977, null);
                    }
                }
                break;
            default:
                InterfaceC7178 interfaceC7178M6850 = AbstractC3066.m6850(interfaceC7187);
                AbstractC7176 abstractC7176Mo10681 = interfaceC7178M6850.mo10681();
                InterfaceC7184 interfaceC7184Mo12074 = mo12074(abstractC7176Mo10681);
                interfaceC7184Mo12074.getClass();
                return interfaceC7178M6850.mo10656().m12427(interfaceC7184Mo12074, abstractC7176Mo10681);
        }
    }

    @Override // p089.InterfaceC7184
    public InterfaceC7191 getDescriptor() {
        return (C7190) this.f18977;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        int i = this.f18979;
        Object obj2 = this.f18978;
        switch (i) {
            case 0:
                InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(getDescriptor());
                interfaceC7188Mo10710.mo10719(getDescriptor(), 0, (InterfaceC7184) obj2, mo12388(obj));
                interfaceC7188Mo10710.mo10719(getDescriptor(), 1, (InterfaceC7184) this.f18977, mo12387(obj));
                interfaceC7188Mo10710.mo10711(getDescriptor());
                return;
            default:
                obj.getClass();
                InterfaceC5093 interfaceC5093 = (InterfaceC5093) obj2;
                InterfaceC7184 interfaceC7184M2157 = interfaceC7186.mo10646().m2157(interfaceC5093, obj);
                if (interfaceC7184M2157 == null) {
                    Class<?> cls = obj.getClass();
                    C4397 c4397 = AbstractC4396.f12975;
                    InterfaceC7184 interfaceC7184M9870 = AbstractC4922.m9870(c4397.mo8917(cls));
                    if (interfaceC7184M9870 == null) {
                        InterfaceC5093 interfaceC5093Mo8917 = c4397.mo8917(obj.getClass());
                        String simpleName = interfaceC5093Mo8917.getSimpleName();
                        if (simpleName == null) {
                            simpleName = String.valueOf(interfaceC5093Mo8917);
                        }
                        throw new SerializationException("Class '" + simpleName + "' is not registered for polymorphic serialization " + ("in the scope of '" + interfaceC5093.getSimpleName() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
                    }
                    interfaceC7184M2157 = interfaceC7184M9870;
                }
                interfaceC7184M2157.serialize(interfaceC7186, obj);
                return;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract Object mo12386(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract InterfaceC7184 mo12074(AbstractC7176 abstractC7176);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Object mo12387(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo12388(Object obj);

    public AbstractC7073(InterfaceC7184 interfaceC7184, InterfaceC7184 interfaceC71842) {
        this.f18978 = interfaceC7184;
        this.f18977 = interfaceC71842;
    }
}
