package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3887;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5369;
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5628;
import p023.C6986;
import p086.InterfaceC7737;
import p087.AbstractC7742;
import p101.C7882;
import p102.C7892;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5824 extends AbstractC5835 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f14748 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f14749;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6016 f14750;

    public C5824(Class cls) {
        cls.getClass();
        this.f14749 = cls;
        this.f14750 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5823(this, 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5824) {
            return AbstractC5227.m9466(this.f14749, ((C5824) obj).f14749);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14749.hashCode();
    }

    public final String toString() {
        return "file class " + AbstractC5263.m9536(this.f14749).m9886();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final ArrayList m10530() {
        List list = (List) ((C5825) this.f14750.getValue()).f14755.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5176.m9363(((C5369) it.next()).f13576, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final Collection mo10490(C5523 c5523) {
        C5906 c5906 = ((C5825) this.f14750.getValue()).f14753;
        InterfaceC5920 interfaceC5920 = C5825.f14751[1];
        Object objInvoke = c5906.invoke();
        objInvoke.getClass();
        return ((InterfaceC8083) objInvoke).mo9726(c5523, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Class mo10531() {
        Class cls = (Class) ((C5825) this.f14750.getValue()).f14752.getValue();
        return cls == null ? this.f14749 : cls;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final C5368 mo10491(int i) {
        C5369 c5369 = (C5369) AbstractC5176.m9340((List) ((C5825) this.f14750.getValue()).f14755.getValue());
        if (c5369 == null) {
            return null;
        }
        C7892 c7892 = C7882.f19290;
        c7892.getClass();
        ArrayList arrayList = ((C7882) AbstractC3887.m7195(c5369.f13573, c7892)).f19291;
        if (arrayList != null) {
            return (C5368) AbstractC5176.m9377(i, arrayList);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final InterfaceC5305 mo10492(int i) {
        C5906 c5906 = ((C5825) this.f14750.getValue()).f14753;
        InterfaceC5920 interfaceC5920 = C5825.f14751[1];
        Object objInvoke = c5906.invoke();
        objInvoke.getClass();
        InterfaceC8083 interfaceC8083 = (InterfaceC8083) objInvoke;
        C5628 c5628 = interfaceC8083 instanceof C5628 ? (C5628) interfaceC8083 : null;
        if (c5628 != null) {
            C5656 c5656 = c5628.f14322;
            ProtoBuf$Package protoBuf$Package = c5628.f14323;
            C5557 c5557 = AbstractC7742.f18781;
            c5557.getClass();
            protoBuf$Package.getClass();
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) (i < protoBuf$Package.getExtensionCount(c5557) ? protoBuf$Package.getExtension(c5557, i) : null);
            if (protoBuf$Property != null) {
                C5806 c5806 = new C5806(this);
                InterfaceC7737 interfaceC7737 = c5656.f14406;
                ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
                typeTable.getClass();
                return (InterfaceC5305) AbstractC5899.m10619(this.f14749, c5806, protoBuf$Property, interfaceC7737, new C6986(typeTable), c5656.f14402, C5882.f14918);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final Collection mo10493(C5523 c5523) {
        C5906 c5906 = ((C5825) this.f14750.getValue()).f14753;
        InterfaceC5920 interfaceC5920 = C5825.f14751[1];
        Object objInvoke = c5906.invoke();
        objInvoke.getClass();
        return ((InterfaceC8083) objInvoke).mo9724(c5523, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5835
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Collection mo10494() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.jvm.internal.InterfaceC5219
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Class mo9438() {
        return this.f14749;
    }
}
