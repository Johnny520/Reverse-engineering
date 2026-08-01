package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.C4724;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4795;
import p015.C6230;
import p070.InterfaceC6907;
import p071.AbstractC6912;
import p085.C7052;
import p086.C7062;
import p101.InterfaceC7253;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4991 extends AbstractC5002 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f14401 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f14402;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5183 f14403;

    public C4991(Class cls) {
        cls.getClass();
        this.f14402 = cls;
        this.f14403 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C4990(this, 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4991) {
            return AbstractC4394.m8917(this.f14402, ((C4991) obj).f14402);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14402.hashCode();
    }

    public final String toString() {
        return "file class " + AbstractC4430.m8987(this.f14402).m9337();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final ArrayList m9974() {
        List list = (List) ((C4992) this.f14403.getValue()).f14408.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4343.m8794(((C4536) it.next()).f13227, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final Collection mo9934(C4690 c4690) {
        C5073 c5073 = ((C4992) this.f14403.getValue()).f14406;
        InterfaceC5087 interfaceC5087 = C4992.f14404[1];
        Object objInvoke = c5073.invoke();
        objInvoke.getClass();
        return ((InterfaceC7253) objInvoke).mo9177(c4690, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Class mo9975() {
        Class cls = (Class) ((C4992) this.f14403.getValue()).f14405.getValue();
        return cls == null ? this.f14402 : cls;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final C4535 mo9935(int i) {
        C4536 c4536 = (C4536) AbstractC4343.m8815((List) ((C4992) this.f14403.getValue()).f14408.getValue());
        if (c4536 == null) {
            return null;
        }
        C7062 c7062 = C7052.f18950;
        c7062.getClass();
        ArrayList arrayList = ((C7052) AbstractC8189.m13664(c4536.f13224, c7062)).f18951;
        if (arrayList != null) {
            return (C4535) AbstractC4343.m8831(i, arrayList);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final InterfaceC4472 mo9936(int i) {
        C5073 c5073 = ((C4992) this.f14403.getValue()).f14406;
        InterfaceC5087 interfaceC5087 = C4992.f14404[1];
        Object objInvoke = c5073.invoke();
        objInvoke.getClass();
        InterfaceC7253 interfaceC7253 = (InterfaceC7253) objInvoke;
        C4795 c4795 = interfaceC7253 instanceof C4795 ? (C4795) interfaceC7253 : null;
        if (c4795 != null) {
            C4823 c4823 = c4795.f13973;
            ProtoBuf$Package protoBuf$Package = c4795.f13974;
            C4724 c4724 = AbstractC6912.f18441;
            c4724.getClass();
            protoBuf$Package.getClass();
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) (i < protoBuf$Package.getExtensionCount(c4724) ? protoBuf$Package.getExtension(c4724, i) : null);
            if (protoBuf$Property != null) {
                C4973 c4973 = new C4973(this);
                InterfaceC6907 interfaceC6907 = c4823.f14057;
                ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
                typeTable.getClass();
                return (InterfaceC4472) AbstractC5066.m10056(this.f14402, c4973, protoBuf$Property, interfaceC6907, new C6230(typeTable), c4823.f14053, C5049.f14571);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final Collection mo9937(C4690 c4690) {
        C5073 c5073 = ((C4992) this.f14403.getValue()).f14406;
        InterfaceC5087 interfaceC5087 = C4992.f14404[1];
        Object objInvoke = c5073.invoke();
        objInvoke.getClass();
        return ((InterfaceC7253) objInvoke).mo9175(c4690, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5002
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Collection mo9938() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.jvm.internal.InterfaceC4386
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Class mo8889() {
        return this.f14402;
    }
}
