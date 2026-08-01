package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3055;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.C4537;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4796;
import p007.C6157;
import p070.InterfaceC6908;
import p071.AbstractC6913;
import p085.C7053;
import p086.C7063;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4992 extends AbstractC5003 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f14403 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Class f14404;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5184 f14405;

    public C4992(Class cls) {
        cls.getClass();
        this.f14404 = cls;
        this.f14405 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C4991(this, 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4992) {
            return AbstractC4395.m8907(this.f14404, ((C4992) obj).f14404);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14404.hashCode();
    }

    public final String toString() {
        return "file class " + AbstractC4431.m8977(this.f14404).m9327();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final ArrayList m9971() {
        List list = (List) ((C4993) this.f14405.getValue()).f14410.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4344.m8804(((C4537) it.next()).f13231, arrayList);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final Collection mo9931(C4691 c4691) {
        C5074 c5074 = ((C4993) this.f14405.getValue()).f14408;
        InterfaceC5088 interfaceC5088 = C4993.f14406[1];
        Object objInvoke = c5074.invoke();
        objInvoke.getClass();
        return ((InterfaceC7254) objInvoke).mo9167(c4691, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final Class mo9972() {
        Class cls = (Class) ((C4993) this.f14405.getValue()).f14407.getValue();
        return cls == null ? this.f14404 : cls;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final C4536 mo9932(int i) {
        C4537 c4537 = (C4537) AbstractC4344.m8781((List) ((C4993) this.f14405.getValue()).f14410.getValue());
        if (c4537 == null) {
            return null;
        }
        C7063 c7063 = C7053.f18945;
        c7063.getClass();
        ArrayList arrayList = ((C7053) AbstractC3055.m6635(c4537.f13228, c7063)).f18946;
        if (arrayList != null) {
            return (C4536) AbstractC4344.m8818(i, arrayList);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final InterfaceC4473 mo9933(int i) {
        C5074 c5074 = ((C4993) this.f14405.getValue()).f14408;
        InterfaceC5088 interfaceC5088 = C4993.f14406[1];
        Object objInvoke = c5074.invoke();
        objInvoke.getClass();
        InterfaceC7254 interfaceC7254 = (InterfaceC7254) objInvoke;
        C4796 c4796 = interfaceC7254 instanceof C4796 ? (C4796) interfaceC7254 : null;
        if (c4796 != null) {
            C4824 c4824 = c4796.f13977;
            ProtoBuf$Package protoBuf$Package = c4796.f13978;
            C4725 c4725 = AbstractC6913.f18436;
            c4725.getClass();
            protoBuf$Package.getClass();
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) (i < protoBuf$Package.getExtensionCount(c4725) ? protoBuf$Package.getExtension(c4725, i) : null);
            if (protoBuf$Property != null) {
                C4974 c4974 = new C4974(this);
                InterfaceC6908 interfaceC6908 = c4824.f14061;
                ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
                typeTable.getClass();
                return (InterfaceC4473) AbstractC5067.m10060(this.f14404, c4974, protoBuf$Property, interfaceC6908, new C6157(typeTable), c4824.f14057, C5050.f14573);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final Collection mo9934(C4691 c4691) {
        C5074 c5074 = ((C4993) this.f14405.getValue()).f14408;
        InterfaceC5088 interfaceC5088 = C4993.f14406[1];
        Object objInvoke = c5074.invoke();
        objInvoke.getClass();
        return ((InterfaceC7254) objInvoke).mo9165(c4691, NoLookupLocation.FROM_REFLECTION);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5003
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final Collection mo9935() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.jvm.internal.InterfaceC4387
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Class mo8879() {
        return this.f14404;
    }
}
