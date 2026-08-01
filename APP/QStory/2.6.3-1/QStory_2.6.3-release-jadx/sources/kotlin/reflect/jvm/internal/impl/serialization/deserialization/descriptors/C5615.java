package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.C5302;
import kotlin.reflect.jvm.internal.impl.descriptors.C5315;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5655;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5667;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import p023.C6986;
import p050.AbstractC7176;
import p062.C7311;
import p068.InterfaceC7372;
import p082.AbstractC7699;
import p082.AbstractC7705;
import p082.C7700;
import p082.C7712;
import p086.AbstractC7728;
import p086.AbstractC7738;
import p086.InterfaceC7737;
import p095.AbstractC7818;
import p095.AbstractC7838;
import p095.C7847;
import p113.InterfaceC8048;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5615 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5633 f14272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14273;

    public /* synthetic */ C5615(C5633 c5633, int i) {
        this.f14273 = i;
        this.f14272 = c5633;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02a9  */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object c5302;
        InterfaceC8048 interfaceC8048;
        Object next;
        C5322 c5322;
        int i = this.f14273;
        boolean z = false;
        int i2 = 1;
        C5633 c5633 = this.f14272;
        switch (i) {
            case 0:
                if (!c5633.isInline() && !c5633.mo9573()) {
                    return null;
                }
                boolean zM12743 = c5633.f14351.m12743(1, 5, 1);
                ProtoBuf$Class protoBuf$Class = c5633.f14348;
                C5656 c5656 = c5633.f14339;
                InterfaceC7737 interfaceC7737 = c5656.f14406;
                C6986 c6986 = c5656.f14404;
                DeserializedClassDescriptor$computeValueClassRepresentation$1 deserializedClassDescriptor$computeValueClassRepresentation$1 = new DeserializedClassDescriptor$computeValueClassRepresentation$1(c5656.f14408);
                DeserializedClassDescriptor$computeValueClassRepresentation$2 deserializedClassDescriptor$computeValueClassRepresentation$2 = new DeserializedClassDescriptor$computeValueClassRepresentation$2(c5633);
                protoBuf$Class.getClass();
                interfaceC7737.getClass();
                if (protoBuf$Class.hasInlineClassUnderlyingPropertyName()) {
                    C5523 c5523M9890 = C5523.m9890(interfaceC7737.getString(protoBuf$Class.getInlineClassUnderlyingPropertyName()));
                    ProtoBuf$Type protoBuf$TypeM12757 = AbstractC7738.m12757(protoBuf$Class, c6986);
                    if ((protoBuf$TypeM12757 == null || (interfaceC8048 = (InterfaceC8048) deserializedClassDescriptor$computeValueClassRepresentation$1.invoke((Object) protoBuf$TypeM12757)) == null) && (interfaceC8048 = (InterfaceC8048) deserializedClassDescriptor$computeValueClassRepresentation$2.invoke((Object) c5523M9890)) == null) {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + C5523.m9890(interfaceC7737.getString(protoBuf$Class.getFqName())) + " with property " + c5523M9890).toString());
                    }
                    c5302 = new C5315(c5523M9890, interfaceC8048);
                } else if (zM12743 && AbstractC7728.f18744.mo12740(protoBuf$Class.getFlags()).booleanValue()) {
                    List<ProtoBuf$Constructor> constructorList = protoBuf$Class.getConstructorList();
                    constructorList.getClass();
                    Iterator<T> it = constructorList.iterator();
                    Object obj = null;
                    while (true) {
                        if (it.hasNext()) {
                            Object next2 = it.next();
                            if (!AbstractC7728.f18736.mo12740(((ProtoBuf$Constructor) next2).getFlags()).booleanValue()) {
                                if (!z) {
                                    z = true;
                                    obj = next2;
                                }
                            }
                        } else if (!z) {
                        }
                    }
                    obj = null;
                    ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) obj;
                    if (protoBuf$Constructor != null) {
                        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
                        valueParameterList.getClass();
                        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(valueParameterList, 10));
                        for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                            arrayList.add(new Pair(C5523.m9890(interfaceC7737.getString(protoBuf$ValueParameter.getName())), deserializedClassDescriptor$computeValueClassRepresentation$1.invoke((Object) AbstractC7738.m12754(protoBuf$ValueParameter, c6986))));
                        }
                        c5302 = new C5302(arrayList);
                    }
                } else {
                    c5302 = null;
                }
                if (c5302 != null) {
                    return c5302;
                }
                if (zM12743) {
                    return null;
                }
                C7847 c7847Mo9577 = c5633.mo9577();
                if (c7847Mo9577 == null) {
                    C5043.m9151(c5633, "Inline class has no primary constructor: ");
                    return null;
                }
                List listMo9594 = c7847Mo9577.mo9594();
                listMo9594.getClass();
                C5523 name = ((AbstractC7838) ((InterfaceC5288) AbstractC5176.m9379(listMo9594))).getName();
                name.getClass();
                AbstractC5710 abstractC5710M10100 = c5633.m10100(name);
                if (abstractC5710M10100 != null) {
                    return new C5315(name, abstractC5710M10100);
                }
                C5043.m9151(c5633, "Value class has no underlying property: ");
                return null;
            case 1:
                C5633 c56332 = this.f14272;
                ClassKind classKind = c56332.f14340;
                if (!classKind.isSingleton()) {
                    List<ProtoBuf$Constructor> constructorList2 = c56332.f14348.getConstructorList();
                    constructorList2.getClass();
                    Iterator<T> it2 = constructorList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (!AbstractC7728.f18736.mo12740(((ProtoBuf$Constructor) next).getFlags()).booleanValue()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    ProtoBuf$Constructor protoBuf$Constructor2 = (ProtoBuf$Constructor) next;
                    if (protoBuf$Constructor2 != null) {
                        return c56332.f14339.f14410.m10115(protoBuf$Constructor2, true);
                    }
                    return null;
                }
                C7700 c7700 = new C7700(c56332, null, C7311.f18113, true, CallableMemberDescriptor$Kind.DECLARATION, InterfaceC5294.f13436);
                List list = Collections.EMPTY_LIST;
                int i3 = AbstractC7699.f18657;
                if (classKind == ClassKind.ENUM_CLASS || classKind.isSingleton()) {
                    c5322 = AbstractC5321.f13465;
                    if (c5322 == null) {
                        AbstractC7699.m12665(49);
                        throw null;
                    }
                } else if (AbstractC7699.m12670(c56332)) {
                    c5322 = AbstractC5321.f13465;
                    if (c5322 == null) {
                        AbstractC7699.m12665(51);
                        throw null;
                    }
                } else if (AbstractC7699.m12677(c56332)) {
                    c5322 = AbstractC5321.f13474;
                    if (c5322 == null) {
                        AbstractC7699.m12665(52);
                        throw null;
                    }
                } else {
                    c5322 = AbstractC5321.f13461;
                    if (c5322 == null) {
                        AbstractC7699.m12665(53);
                        throw null;
                    }
                }
                c7700.m12921(list, c5322);
                c7700.f19130 = c56332.mo9584();
                return c7700;
            case 2:
                C5656 c56562 = c5633.f14339;
                List<ProtoBuf$Constructor> constructorList3 = c5633.f14348.getConstructorList();
                constructorList3.getClass();
                ArrayList<ProtoBuf$Constructor> arrayList2 = new ArrayList();
                for (Object obj2 : constructorList3) {
                    if (AbstractC7728.f18736.mo12740(((ProtoBuf$Constructor) obj2).getFlags()).booleanValue()) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList2, 10));
                for (ProtoBuf$Constructor protoBuf$Constructor3 : arrayList2) {
                    C5655 c5655 = c56562.f14410;
                    protoBuf$Constructor3.getClass();
                    arrayList3.add(c5655.m10115(protoBuf$Constructor3, false));
                }
                return AbstractC5176.m9352(c56562.f14407.f14440.mo9517(c5633), AbstractC5176.m9352(AbstractC7176.m12489(c5633.mo9577()), arrayList3));
            case 3:
                ProtoBuf$Class protoBuf$Class2 = c5633.f14348;
                if (!protoBuf$Class2.hasCompanionObjectName()) {
                    return null;
                }
                InterfaceC5309 interfaceC5309Mo9714 = c5633.m10099().mo9714(AbstractC4765.m8875(c5633.f14339.f14406, protoBuf$Class2.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
                if (interfaceC5309Mo9714 instanceof AbstractC7818) {
                    return (AbstractC7818) interfaceC5309Mo9714;
                }
                return null;
            case 4:
                Modality modality = c5633.f14350;
                Modality modality2 = Modality.SEALED;
                if (modality != modality2) {
                    return EmptyList.INSTANCE;
                }
                List<Integer> sealedSubclassFqNameList = c5633.f14348.getSealedSubclassFqNameList();
                sealedSubclassFqNameList.getClass();
                if (sealedSubclassFqNameList.isEmpty()) {
                    if (modality != modality2) {
                        return EmptyList.INSTANCE;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    InterfaceC5331 interfaceC5331 = c5633.f14346;
                    if (interfaceC5331 instanceof InterfaceC5298) {
                        AbstractC7705.m12684(c5633, linkedHashSet, ((InterfaceC5298) interfaceC5331).mo9509(), false);
                    }
                    AbstractC7705.m12684(c5633, linkedHashSet, c5633.mo9774(), true);
                    return AbstractC5176.m9337(linkedHashSet, new C7712(i2));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Integer num : sealedSubclassFqNameList) {
                    C5656 c56563 = c5633.f14339;
                    C5665 c5665 = c56563.f14407;
                    InterfaceC7737 interfaceC77372 = c56563.f14406;
                    num.getClass();
                    C5520 c5520M8878 = AbstractC4765.m8878(interfaceC77372, num.intValue());
                    C5667 c5667 = c5665.f14438;
                    Set set = C5667.f14454;
                    AbstractC7818 abstractC7818M10126 = c5667.m10126(c5520M8878, null);
                    if (abstractC7818M10126 != null) {
                        arrayList4.add(abstractC7818M10126);
                    }
                }
                return arrayList4;
            case 5:
                return AbstractC5176.m9356(c5633.f14339.f14407.f14433.mo2979(c5633.f14342));
            default:
                return AbstractC5323.m9637(c5633);
        }
    }
}
