package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5168;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC5401;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5625;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5626;
import kotlin.reflect.jvm.internal.types.C5770;
import p050.AbstractC7176;
import p086.InterfaceC7737;
import p095.AbstractC7823;
import p095.C7808;
import p095.C7835;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5856 extends AbstractC5895 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5906 f14830;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5906 f14831;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C5906 f14832;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5906 f14833;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5883 f14834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5906 f14835;

    public AbstractC5856(C5883 c5883) {
        c5883.getClass();
        this.f14834 = c5883;
        this.f14835 = C9496.m14937(null, new C5865(this, 0));
        this.f14831 = C9496.m14937(null, new C5865(this, 1));
        this.f14830 = C9496.m14937(null, new C5865(this, 2));
        this.f14832 = C9496.m14937(null, new C5865(this, 3));
        this.f14833 = C9496.m14937(null, new C5865(this, 4));
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        Object objInvoke = this.f14835.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getParameters() {
        Object objInvoke = this.f14830.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final InterfaceC5919 getReturnType() {
        Object objInvoke = this.f14832.invoke();
        objInvoke.getClass();
        return (InterfaceC5919) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getTypeParameters() {
        Object objInvoke = this.f14833.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final KVisibility getVisibility() {
        C5322 visibility = mo10501().getVisibility();
        visibility.getClass();
        C5519 c5519 = AbstractC5899.f14953;
        if (visibility.equals(AbstractC5321.f13461)) {
            return KVisibility.PUBLIC;
        }
        if (visibility.equals(AbstractC5321.f13463)) {
            return KVisibility.PROTECTED;
        }
        if (visibility.equals(AbstractC5321.f13462)) {
            return KVisibility.INTERNAL;
        }
        if (visibility.equals(AbstractC5321.f13465) || visibility.equals(AbstractC5321.f13464)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isAbstract() {
        return m10549() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isFinal() {
        return m10549() == Modality.FINAL;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final boolean isOpen() {
        return m10549() == Modality.OPEN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract AbstractC5856 mo10506(C5883 c5883);

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo10520() {
        Object objInvoke = this.f14831.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Modality m10549() {
        Modality modality = this.f14834.f14924;
        if (modality != null) {
            return modality;
        }
        Modality modalityMo9568 = mo10501().mo9568();
        modalityMo9568.getClass();
        return modalityMo9568;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract InterfaceC5312 mo10501();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m10550(boolean z) {
        Pair pair;
        Collection collection;
        InterfaceC5312 interfaceC5312Mo10501 = mo10501();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        if (z) {
            C7835 c7835M10633 = AbstractC5899.m10633(this);
            if (c7835M10633 != null) {
                arrayList.add(new C5787(this, arrayList.size(), KParameter$Kind.INSTANCE, new C5857(c7835M10633, 0)));
            }
            if (interfaceC5312Mo10501 instanceof C5626) {
                C5626 c5626 = (C5626) interfaceC5312Mo10501;
                pair = new Pair(c5626.f14315, c5626.f14316.getContextParameterList());
            } else if (interfaceC5312Mo10501 instanceof C5625) {
                C5625 c5625 = (C5625) interfaceC5312Mo10501;
                pair = new Pair(c5625.f14309, c5625.f14312.getContextParameterList());
            } else if (interfaceC5312Mo10501 instanceof AbstractC7823) {
                InterfaceC5305 interfaceC5305M12885 = ((AbstractC7823) interfaceC5312Mo10501).m12885();
                C5625 c56252 = interfaceC5305M12885 instanceof C5625 ? (C5625) interfaceC5305M12885 : null;
                pair = c56252 != null ? new Pair(c56252.f14309, c56252.f14312.getContextParameterList()) : null;
            }
            if (pair == null) {
                collection = EmptyList.INSTANCE;
            } else {
                InterfaceC7737 interfaceC7737 = (InterfaceC7737) pair.component1();
                List list = (List) pair.component2();
                List listMo9596 = interfaceC5312Mo10501.mo9596();
                listMo9596.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(listMo9596, 10));
                int i2 = 0;
                for (Object obj : listMo9596) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC7176.m12479();
                        throw null;
                    }
                    C7835 c7835 = (C7835) obj;
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new C7808(interfaceC5312Mo10501, null, i2, c7835.getAnnotations(), C5523.m9890(interfaceC7737.getString(((ProtoBuf$ValueParameter) list.get(i2)).getName())), c7835.getType(), false, false, false, null, InterfaceC5294.f13436));
                    arrayList2 = arrayList3;
                    i2 = i3;
                    interfaceC7737 = interfaceC7737;
                    list = list;
                }
                collection = arrayList2;
            }
            int size = collection.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new C5787(this, arrayList.size(), KParameter$Kind.CONTEXT, new C5866(collection, i4, i)));
            }
            C7835 c7835Mo9591 = interfaceC5312Mo10501.mo9591();
            if (c7835Mo9591 != null) {
                arrayList.add(new C5787(this, arrayList.size(), KParameter$Kind.EXTENSION_RECEIVER, new C5857(c7835Mo9591, 1)));
            }
        }
        int size2 = interfaceC5312Mo10501.mo9594().size();
        for (int i5 = 0; i5 < size2; i5++) {
            arrayList.add(new C5787(this, arrayList.size(), KParameter$Kind.VALUE, new C5866(interfaceC5312Mo10501, i5, 2)));
        }
        if (AbstractC5894.m10597(this) && (interfaceC5312Mo10501 instanceof InterfaceC5401) && arrayList.size() > 1) {
            AbstractC5168.m9325(arrayList, new C5864(i));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract C5770 mo10503();
}
