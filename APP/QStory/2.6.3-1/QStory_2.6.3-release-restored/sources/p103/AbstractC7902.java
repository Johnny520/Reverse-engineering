package p103;

import com.bumptech.glide.AbstractC3898;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlinx.serialization.SerializationException;
import p025.AbstractC7012;
import p104.AbstractC8005;
import p104.InterfaceC8007;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.C8019;
import p107.C8022;
import p107.InterfaceC8020;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7902 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f19322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f19323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f19324 = 1;

    public AbstractC7902(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        this.f19323 = interfaceC5925;
        this.f19322 = AbstractC9004.m14208("JsonContentPolymorphicSerializer<" + interfaceC5925.getSimpleName() + '>', C8022.f19539, new InterfaceC8020[0]);
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        switch (this.f19324) {
            case 0:
                InterfaceC8020 descriptor = getDescriptor();
                InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(descriptor);
                interfaceC8018Mo11235.getClass();
                Object obj = AbstractC7973.f19447;
                Object objMo11233 = obj;
                Object objMo112332 = objMo11233;
                while (true) {
                    int iMo11277 = interfaceC8018Mo11235.mo11277(getDescriptor());
                    if (iMo11277 == -1) {
                        if (objMo11233 == obj) {
                            throw new SerializationException("Element 'key' is missing");
                        }
                        if (objMo112332 == obj) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        Object objMo12945 = mo12945(objMo11233, objMo112332);
                        interfaceC8018Mo11235.mo11237(descriptor);
                        return objMo12945;
                    }
                    if (iMo11277 == 0) {
                        objMo11233 = interfaceC8018Mo11235.mo11233(getDescriptor(), 0, (InterfaceC8013) this.f19323, null);
                    } else {
                        if (iMo11277 != 1) {
                            throw new SerializationException(AbstractC7012.m12147(iMo11277, "Invalid index: "));
                        }
                        objMo112332 = interfaceC8018Mo11235.mo11233(getDescriptor(), 1, (InterfaceC8013) this.f19322, null);
                    }
                }
                break;
            default:
                InterfaceC8007 interfaceC8007M7410 = AbstractC3898.m7410(interfaceC8016);
                AbstractC8005 abstractC8005Mo11240 = interfaceC8007M7410.mo11240();
                InterfaceC8013 interfaceC8013Mo12633 = mo12633(abstractC8005Mo11240);
                interfaceC8013Mo12633.getClass();
                return interfaceC8007M7410.mo11215().m12986(interfaceC8013Mo12633, abstractC8005Mo11240);
        }
    }

    @Override // p105.InterfaceC8013
    public InterfaceC8020 getDescriptor() {
        return (C8019) this.f19322;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        int i = this.f19324;
        Object obj2 = this.f19323;
        switch (i) {
            case 0:
                InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(getDescriptor());
                interfaceC8017Mo11269.mo11278(getDescriptor(), 0, (InterfaceC8013) obj2, mo12947(obj));
                interfaceC8017Mo11269.mo11278(getDescriptor(), 1, (InterfaceC8013) this.f19322, mo12946(obj));
                interfaceC8017Mo11269.mo11270(getDescriptor());
                return;
            default:
                obj.getClass();
                InterfaceC5925 interfaceC5925 = (InterfaceC5925) obj2;
                InterfaceC8013 interfaceC8013M2717 = interfaceC8015.mo11205().m2717(interfaceC5925, obj);
                if (interfaceC8013M2717 == null) {
                    Class<?> cls = obj.getClass();
                    C5229 c5229 = AbstractC5228.f13320;
                    InterfaceC8013 interfaceC8013M10429 = AbstractC5754.m10429(c5229.mo9476(cls));
                    if (interfaceC8013M10429 == null) {
                        InterfaceC5925 interfaceC5925Mo9476 = c5229.mo9476(obj.getClass());
                        String simpleName = interfaceC5925Mo9476.getSimpleName();
                        if (simpleName == null) {
                            simpleName = String.valueOf(interfaceC5925Mo9476);
                        }
                        throw new SerializationException("Class '" + simpleName + "' is not registered for polymorphic serialization " + ("in the scope of '" + interfaceC5925.getSimpleName() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
                    }
                    interfaceC8013M2717 = interfaceC8013M10429;
                }
                interfaceC8013M2717.serialize(interfaceC8015, obj);
                return;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract Object mo12945(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract InterfaceC8013 mo12633(AbstractC8005 abstractC8005);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract Object mo12946(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo12947(Object obj);

    public AbstractC7902(InterfaceC8013 interfaceC8013, InterfaceC8013 interfaceC80132) {
        this.f19323 = interfaceC8013;
        this.f19322 = interfaceC80132;
    }
}
