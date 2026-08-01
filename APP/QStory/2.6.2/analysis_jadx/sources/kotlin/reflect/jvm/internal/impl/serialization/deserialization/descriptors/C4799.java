package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5041;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4804;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4809;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4812;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4822;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.sequences.AbstractC5121;
import p015.C6230;
import p046.C6481;
import p046.C6484;
import p046.InterfaceC6480;
import p052.InterfaceC6557;
import p070.AbstractC6898;
import p070.AbstractC6908;
import p070.InterfaceC6907;
import p103.AbstractC7274;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4799 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4790 f13984;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13985;

    public /* synthetic */ C4799(C4790 c4790, int i) {
        this.f13985 = i;
        this.f13984 = c4790;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        Collection<ProtoBuf$Function> collectionM10106;
        Collection<ProtoBuf$Property> collectionM101062;
        ProtoBuf$TypeAlias delimitedFrom;
        C4489 c4489;
        int i = this.f13985;
        int i2 = 6;
        C4790 c4790 = this.f13984;
        switch (i) {
            case 0:
                C4690 c4690 = (C4690) obj;
                c4690.getClass();
                LinkedHashMap linkedHashMap = c4790.f13952;
                InterfaceC4698 interfaceC4698 = ProtoBuf$Function.PARSER;
                interfaceC4698.getClass();
                AbstractC4794 abstractC4794 = c4790.f13955;
                byte[] bArr = (byte[]) linkedHashMap.get(c4690);
                if (bArr == null || (collectionM10106 = AbstractC5121.m10106(AbstractC5121.m10113(new C5041(interfaceC4698, new ByteArrayInputStream(bArr), abstractC4794, i2)))) == null) {
                    collectionM10106 = EmptyList.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(collectionM10106.size());
                for (ProtoBuf$Function protoBuf$Function : collectionM10106) {
                    C4822 c4822 = abstractC4794.f13973.f14061;
                    protoBuf$Function.getClass();
                    C4793 c4793M9565 = c4822.m9565(protoBuf$Function);
                    if (!abstractC4794.mo9537(c4793M9565)) {
                        c4793M9565 = null;
                    }
                    if (c4793M9565 != null) {
                        arrayList.add(c4793M9565);
                    }
                }
                abstractC4794.mo9544(arrayList, c4690);
                return AbstractC7274.m12463(arrayList);
            case 1:
                C4690 c46902 = (C4690) obj;
                c46902.getClass();
                LinkedHashMap linkedHashMap2 = c4790.f13951;
                InterfaceC4698 interfaceC46982 = ProtoBuf$Property.PARSER;
                interfaceC46982.getClass();
                AbstractC4794 abstractC47942 = c4790.f13955;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c46902);
                if (bArr2 == null || (collectionM101062 = AbstractC5121.m10106(AbstractC5121.m10113(new C5041(interfaceC46982, new ByteArrayInputStream(bArr2), abstractC47942, i2)))) == null) {
                    collectionM101062 = EmptyList.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList(collectionM101062.size());
                for (ProtoBuf$Property protoBuf$Property : collectionM101062) {
                    C4822 c48222 = abstractC47942.f13973.f14061;
                    protoBuf$Property.getClass();
                    arrayList2.add(c48222.m9572(protoBuf$Property, false));
                }
                abstractC47942.mo9541(arrayList2, c46902);
                return AbstractC7274.m12463(arrayList2);
            default:
                C4690 c46903 = (C4690) obj;
                c46903.getClass();
                C4823 c4823 = c4790.f13955.f13973;
                byte[] bArr3 = (byte[]) c4790.f13950.get(c46903);
                if (bArr3 == null || (delimitedFrom = ProtoBuf$TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr3), c4823.f14058.f14096)) == null) {
                    return null;
                }
                C4822 c48223 = c4823.f14061;
                C4823 c48232 = c48223.f14052;
                InterfaceC6907 interfaceC6907 = c48232.f14057;
                C6230 c6230 = c48232.f14055;
                List<ProtoBuf$Annotation> annotationList = delimitedFrom.getAnnotationList();
                annotationList.getClass();
                ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(annotationList, 10));
                for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                    C4812 c4812 = c48223.f14051;
                    protoBuf$Annotation.getClass();
                    arrayList3.add(c4812.m9564(protoBuf$Annotation, interfaceC6907));
                }
                InterfaceC6480 c6484 = arrayList3.isEmpty() ? C6481.f17772 : new C6484(0, arrayList3);
                ProtoBuf$Visibility protoBuf$Visibility = (ProtoBuf$Visibility) AbstractC6898.f18386.mo12153(delimitedFrom.getFlags());
                switch (protoBuf$Visibility == null ? -1 : AbstractC4804.f14007[protoBuf$Visibility.ordinal()]) {
                    case 1:
                        c4489 = AbstractC4488.f13113;
                        c4489.getClass();
                        break;
                    case 2:
                        c4489 = AbstractC4488.f13116;
                        c4489.getClass();
                        break;
                    case 3:
                        c4489 = AbstractC4488.f13115;
                        c4489.getClass();
                        break;
                    case 4:
                        c4489 = AbstractC4488.f13114;
                        c4489.getClass();
                        break;
                    case 5:
                        c4489 = AbstractC4488.f13112;
                        c4489.getClass();
                        break;
                    case 6:
                        c4489 = AbstractC4488.f13111;
                        c4489.getClass();
                        break;
                    default:
                        c4489 = AbstractC4488.f13116;
                        c4489.getClass();
                        break;
                }
                C4787 c4787 = new C4787(c48232.f14058.f14088, c48232.f14056, c6484, AbstractC7738.m13047(interfaceC6907, delimitedFrom.getName()), c4489, delimitedFrom, c48232.f14057, c6230, c48232.f14054, c48232.f14060);
                List<ProtoBuf$TypeParameter> typeParameterList = delimitedFrom.getTypeParameterList();
                typeParameterList.getClass();
                C4809 c4809 = c48232.m9574(c4787, typeParameterList, c48232.f14057, c48232.f14055, c48232.f14054, c48232.f14053).f14059;
                c4787.m9530(c4809.m9560(), c4809.m9558(AbstractC6908.m12168(delimitedFrom, c6230), false), c4809.m9558(AbstractC6908.m12158(delimitedFrom, c6230), false));
                return c4787;
        }
    }
}
