package kotlin.reflect.jvm.internal;

import io.ktor.util.C5043;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5160;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5443;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.text.C5980;
import kotlin.text.InterfaceC5982;
import p025.AbstractC7012;
import p050.AbstractC7173;
import p065.AbstractC7351;
import p068.InterfaceC7372;
import p082.AbstractC7699;
import p083.C7716;
import p083.C7722;
import p095.AbstractC7818;
import p095.C7840;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5786 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5774 f14671;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14672;

    public /* synthetic */ C5786(AbstractC5774 abstractC5774, int i) {
        this.f14672 = i;
        this.f14671 = abstractC5774;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e4  */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws IOException {
        Class<?> clsM10631;
        int i = this.f14672;
        int i2 = 3;
        AbstractC5774 abstractC5774 = this.f14671;
        switch (i) {
            case 0:
                C5520 c5520 = AbstractC5900.f14954;
                InterfaceC5305 interfaceC5305Mo10501 = abstractC5774.mo10501();
                AbstractC5835 abstractC5835 = abstractC5774.f14653;
                AbstractC7173 abstractC7173M10639 = AbstractC5900.m10639(interfaceC5305Mo10501);
                if (!(abstractC7173M10639 instanceof C5881)) {
                    if (abstractC7173M10639 instanceof C5884) {
                        return ((C5884) abstractC7173M10639).f14929;
                    }
                    if ((abstractC7173M10639 instanceof C5885) || (abstractC7173M10639 instanceof C5880)) {
                        return null;
                    }
                    C5043.m9170();
                    return null;
                }
                C5881 c5881 = (C5881) abstractC7173M10639;
                ProtoBuf$Property protoBuf$Property = c5881.f14914;
                InterfaceC5305 interfaceC5305 = c5881.f14915;
                C5558 c5558 = C7722.f18692;
                C7716 c7716M12729 = C7722.m12729(protoBuf$Property, c5881.f14912, c5881.f14911, true);
                if (c7716M12729 == null) {
                    return null;
                }
                if (interfaceC5305.getKind() != CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
                    InterfaceC5331 interfaceC5331Mo9587 = interfaceC5305.mo9587();
                    if (interfaceC5331Mo9587 == null) {
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                    }
                    if (AbstractC7699.m12674(interfaceC5331Mo9587)) {
                        InterfaceC5331 interfaceC5331Mo95872 = interfaceC5331Mo9587.mo9587();
                        if (AbstractC7699.m12675(interfaceC5331Mo95872, ClassKind.CLASS) || AbstractC7699.m12675(interfaceC5331Mo95872, ClassKind.ENUM_CLASS)) {
                            AbstractC7818 abstractC7818 = (AbstractC7818) interfaceC5331Mo9587;
                            LinkedHashSet linkedHashSet = AbstractC7351.f18176;
                            if (AbstractC7699.m12674(abstractC7818)) {
                                LinkedHashSet linkedHashSet2 = AbstractC7351.f18176;
                                C5520 c5520M10057 = AbstractC5605.m10057(abstractC7818);
                                if (AbstractC5176.m9365(linkedHashSet2, c5520M10057 != null ? c5520M10057.m9883() : null)) {
                                    if (AbstractC7699.m12674(interfaceC5305.mo9587())) {
                                        C7840 c7840Mo9583 = interfaceC5305.mo9583();
                                        if ((c7840Mo9583 == null || !c7840Mo9583.getAnnotations().mo10077(AbstractC5443.f13817)) ? interfaceC5305.getAnnotations().mo10077(AbstractC5443.f13817) : true) {
                                        }
                                    } else if (!C7722.m12727(protoBuf$Property)) {
                                        InterfaceC5331 interfaceC5331Mo95873 = interfaceC5305.mo9587();
                                        clsM10631 = interfaceC5331Mo95873 instanceof AbstractC7818 ? AbstractC5899.m10631((AbstractC7818) interfaceC5331Mo95873) : abstractC5835.mo9438();
                                    }
                                }
                            }
                            clsM10631 = abstractC5835.mo9438().getEnclosingClass();
                        }
                    }
                }
                if (clsM10631 == null) {
                    return null;
                }
                try {
                    return clsM10631.getDeclaredField(c7716M12729.f18681);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
            case 1:
                AbstractC5835 abstractC58352 = abstractC5774.f14653;
                String str = abstractC5774.f14654;
                String str2 = abstractC5774.f14652;
                abstractC58352.getClass();
                str.getClass();
                str2.getClass();
                InterfaceC5982 interfaceC5982MatchEntire = AbstractC5835.f14767.matchEntire(str2);
                if (interfaceC5982MatchEntire != null) {
                    String str3 = (String) ((C5160) ((C5980) interfaceC5982MatchEntire).m10740()).get(1);
                    InterfaceC5305 interfaceC5305Mo10492 = abstractC58352.mo10492(Integer.parseInt(str3));
                    if (interfaceC5305Mo10492 != null) {
                        return interfaceC5305Mo10492;
                    }
                    StringBuilder sbM12144 = AbstractC7012.m12144("Local property #", str3, " not found in ");
                    sbM12144.append(abstractC58352.mo9438());
                    throw new KotlinReflectionInternalError(sbM12144.toString());
                }
                Collection collectionMo10490 = abstractC58352.mo10490(C5523.m9889(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionMo10490) {
                    if (AbstractC5227.m9466(AbstractC5900.m10639((InterfaceC5305) obj).mo10560(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbM12141 = AbstractC7012.m12141("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                    sbM12141.append(abstractC58352);
                    throw new KotlinReflectionInternalError(sbM12141.toString());
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC5305) AbstractC5176.m9338(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    C5322 visibility = ((InterfaceC5305) obj2).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap(new C5864(i2));
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                List list = (List) AbstractC5176.m9366(collectionValues);
                if (list.size() == 1) {
                    return (InterfaceC5305) AbstractC5176.m9379(list);
                }
                String strM9369 = AbstractC5176.m9369(abstractC58352.mo10490(C5523.m9889(str)), "\n", null, null, C5848.f14811, 30);
                StringBuilder sbM121412 = AbstractC7012.m12141("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbM121412.append(abstractC58352);
                sbM121412.append(':');
                sbM121412.append(strM9369.length() == 0 ? " no members found" : "\n".concat(strM9369));
                throw new KotlinReflectionInternalError(sbM121412.toString());
            default:
                return abstractC5774.mo10500().getReturnType();
        }
    }
}
