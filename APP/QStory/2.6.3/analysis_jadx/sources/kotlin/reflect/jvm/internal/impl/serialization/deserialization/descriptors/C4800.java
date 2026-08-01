package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import io.ktor.client.plugins.AbstractC3933;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5042;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4805;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4810;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4813;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.sequences.AbstractC5122;
import p007.C6157;
import p046.C6482;
import p046.C6485;
import p046.InterfaceC6481;
import p052.InterfaceC6558;
import p070.AbstractC6899;
import p070.AbstractC6909;
import p070.InterfaceC6908;
import p103.AbstractC7275;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4800 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4791 f13988;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13989;

    public /* synthetic */ C4800(C4791 c4791, int i) {
        this.f13989 = i;
        this.f13988 = c4791;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        Collection<ProtoBuf$Function> collectionM10110;
        Collection<ProtoBuf$Property> collectionM101102;
        ProtoBuf$TypeAlias delimitedFrom;
        C4490 c4490;
        int i = this.f13989;
        int i2 = 6;
        C4791 c4791 = this.f13988;
        switch (i) {
            case 0:
                C4691 c4691 = (C4691) obj;
                c4691.getClass();
                LinkedHashMap linkedHashMap = c4791.f13956;
                InterfaceC4699 interfaceC4699 = ProtoBuf$Function.PARSER;
                interfaceC4699.getClass();
                AbstractC4795 abstractC4795 = c4791.f13959;
                byte[] bArr = (byte[]) linkedHashMap.get(c4691);
                if (bArr == null || (collectionM10110 = AbstractC5122.m10110(AbstractC5122.m10109(new C5042(interfaceC4699, new ByteArrayInputStream(bArr), abstractC4795, i2)))) == null) {
                    collectionM10110 = EmptyList.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(collectionM10110.size());
                for (ProtoBuf$Function protoBuf$Function : collectionM10110) {
                    C4823 c4823 = abstractC4795.f13977.f14065;
                    protoBuf$Function.getClass();
                    C4794 c4794M9555 = c4823.m9555(protoBuf$Function);
                    if (!abstractC4795.mo9527(c4794M9555)) {
                        c4794M9555 = null;
                    }
                    if (c4794M9555 != null) {
                        arrayList.add(c4794M9555);
                    }
                }
                abstractC4795.mo9534(arrayList, c4691);
                return AbstractC7275.m12490(arrayList);
            case 1:
                C4691 c46912 = (C4691) obj;
                c46912.getClass();
                LinkedHashMap linkedHashMap2 = c4791.f13955;
                InterfaceC4699 interfaceC46992 = ProtoBuf$Property.PARSER;
                interfaceC46992.getClass();
                AbstractC4795 abstractC47952 = c4791.f13959;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c46912);
                if (bArr2 == null || (collectionM101102 = AbstractC5122.m10110(AbstractC5122.m10109(new C5042(interfaceC46992, new ByteArrayInputStream(bArr2), abstractC47952, i2)))) == null) {
                    collectionM101102 = EmptyList.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList(collectionM101102.size());
                for (ProtoBuf$Property protoBuf$Property : collectionM101102) {
                    C4823 c48232 = abstractC47952.f13977.f14065;
                    protoBuf$Property.getClass();
                    arrayList2.add(c48232.m9562(protoBuf$Property, false));
                }
                abstractC47952.mo9531(arrayList2, c46912);
                return AbstractC7275.m12490(arrayList2);
            default:
                C4691 c46913 = (C4691) obj;
                c46913.getClass();
                C4824 c4824 = c4791.f13959.f13977;
                byte[] bArr3 = (byte[]) c4791.f13954.get(c46913);
                if (bArr3 == null || (delimitedFrom = ProtoBuf$TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr3), c4824.f14062.f14100)) == null) {
                    return null;
                }
                C4823 c48233 = c4824.f14065;
                C4824 c48242 = c48233.f14056;
                InterfaceC6908 interfaceC6908 = c48242.f14061;
                C6157 c6157 = c48242.f14059;
                List<ProtoBuf$Annotation> annotationList = delimitedFrom.getAnnotationList();
                annotationList.getClass();
                ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(annotationList, 10));
                for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                    C4813 c4813 = c48233.f14055;
                    protoBuf$Annotation.getClass();
                    arrayList3.add(c4813.m9554(protoBuf$Annotation, interfaceC6908));
                }
                InterfaceC6481 c6485 = arrayList3.isEmpty() ? C6482.f17768 : new C6485(0, arrayList3);
                ProtoBuf$Visibility protoBuf$Visibility = (ProtoBuf$Visibility) AbstractC6899.f18381.mo12181(delimitedFrom.getFlags());
                switch (protoBuf$Visibility == null ? -1 : AbstractC4805.f14011[protoBuf$Visibility.ordinal()]) {
                    case 1:
                        c4490 = AbstractC4489.f13117;
                        c4490.getClass();
                        break;
                    case 2:
                        c4490 = AbstractC4489.f13120;
                        c4490.getClass();
                        break;
                    case 3:
                        c4490 = AbstractC4489.f13119;
                        c4490.getClass();
                        break;
                    case 4:
                        c4490 = AbstractC4489.f13118;
                        c4490.getClass();
                        break;
                    case 5:
                        c4490 = AbstractC4489.f13116;
                        c4490.getClass();
                        break;
                    case 6:
                        c4490 = AbstractC4489.f13115;
                        c4490.getClass();
                        break;
                    default:
                        c4490 = AbstractC4489.f13120;
                        c4490.getClass();
                        break;
                }
                C4788 c4788 = new C4788(c48242.f14062.f14092, c48242.f14060, c6485, AbstractC3933.m8316(interfaceC6908, delimitedFrom.getName()), c4490, delimitedFrom, c48242.f14061, c6157, c48242.f14058, c48242.f14064);
                List<ProtoBuf$TypeParameter> typeParameterList = delimitedFrom.getTypeParameterList();
                typeParameterList.getClass();
                C4810 c4810 = c48242.m9564(c4788, typeParameterList, c48242.f14061, c48242.f14059, c48242.f14058, c48242.f14057).f14063;
                c4788.m9520(c4810.m9550(), c4810.m9548(AbstractC6909.m12196(delimitedFrom, c6157), false), c4810.m9548(AbstractC6909.m12186(delimitedFrom, c6157), false));
                return c4788;
        }
    }
}
