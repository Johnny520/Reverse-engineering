package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import io.ktor.client.plugins.AbstractC4765;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.C5874;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5531;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5637;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5642;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5645;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5655;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.sequences.AbstractC5954;
import p023.C6986;
import p062.C7311;
import p062.C7314;
import p062.InterfaceC7310;
import p068.InterfaceC7387;
import p086.AbstractC7728;
import p086.AbstractC7738;
import p086.InterfaceC7737;
import p119.AbstractC8104;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5632 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5623 f14333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14334;

    public /* synthetic */ C5632(C5623 c5623, int i) {
        this.f14334 = i;
        this.f14333 = c5623;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        Collection<ProtoBuf$Function> collectionM10669;
        Collection<ProtoBuf$Property> collectionM106692;
        ProtoBuf$TypeAlias delimitedFrom;
        C5322 c5322;
        int i = this.f14334;
        int i2 = 6;
        C5623 c5623 = this.f14333;
        switch (i) {
            case 0:
                C5523 c5523 = (C5523) obj;
                c5523.getClass();
                LinkedHashMap linkedHashMap = c5623.f14301;
                InterfaceC5531 interfaceC5531 = ProtoBuf$Function.PARSER;
                interfaceC5531.getClass();
                AbstractC5627 abstractC5627 = c5623.f14304;
                byte[] bArr = (byte[]) linkedHashMap.get(c5523);
                if (bArr == null || (collectionM10669 = AbstractC5954.m10669(AbstractC5954.m10668(new C5874(interfaceC5531, new ByteArrayInputStream(bArr), abstractC5627, i2)))) == null) {
                    collectionM10669 = EmptyList.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(collectionM10669.size());
                for (ProtoBuf$Function protoBuf$Function : collectionM10669) {
                    C5655 c5655 = abstractC5627.f14322.f14410;
                    protoBuf$Function.getClass();
                    C5626 c5626M10114 = c5655.m10114(protoBuf$Function);
                    if (!abstractC5627.mo10086(c5626M10114)) {
                        c5626M10114 = null;
                    }
                    if (c5626M10114 != null) {
                        arrayList.add(c5626M10114);
                    }
                }
                abstractC5627.mo10093(arrayList, c5523);
                return AbstractC8104.m13049(arrayList);
            case 1:
                C5523 c55232 = (C5523) obj;
                c55232.getClass();
                LinkedHashMap linkedHashMap2 = c5623.f14300;
                InterfaceC5531 interfaceC55312 = ProtoBuf$Property.PARSER;
                interfaceC55312.getClass();
                AbstractC5627 abstractC56272 = c5623.f14304;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c55232);
                if (bArr2 == null || (collectionM106692 = AbstractC5954.m10669(AbstractC5954.m10668(new C5874(interfaceC55312, new ByteArrayInputStream(bArr2), abstractC56272, i2)))) == null) {
                    collectionM106692 = EmptyList.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList(collectionM106692.size());
                for (ProtoBuf$Property protoBuf$Property : collectionM106692) {
                    C5655 c56552 = abstractC56272.f14322.f14410;
                    protoBuf$Property.getClass();
                    arrayList2.add(c56552.m10121(protoBuf$Property, false));
                }
                abstractC56272.mo10090(arrayList2, c55232);
                return AbstractC8104.m13049(arrayList2);
            default:
                C5523 c55233 = (C5523) obj;
                c55233.getClass();
                C5656 c5656 = c5623.f14304.f14322;
                byte[] bArr3 = (byte[]) c5623.f14299.get(c55233);
                if (bArr3 == null || (delimitedFrom = ProtoBuf$TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr3), c5656.f14407.f14445)) == null) {
                    return null;
                }
                C5655 c56553 = c5656.f14410;
                C5656 c56562 = c56553.f14401;
                InterfaceC7737 interfaceC7737 = c56562.f14406;
                C6986 c6986 = c56562.f14404;
                List<ProtoBuf$Annotation> annotationList = delimitedFrom.getAnnotationList();
                annotationList.getClass();
                ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(annotationList, 10));
                for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                    C5645 c5645 = c56553.f14400;
                    protoBuf$Annotation.getClass();
                    arrayList3.add(c5645.m10113(protoBuf$Annotation, interfaceC7737));
                }
                InterfaceC7310 c7314 = arrayList3.isEmpty() ? C7311.f18113 : new C7314(0, arrayList3);
                ProtoBuf$Visibility protoBuf$Visibility = (ProtoBuf$Visibility) AbstractC7728.f18726.mo12740(delimitedFrom.getFlags());
                switch (protoBuf$Visibility == null ? -1 : AbstractC5637.f14356[protoBuf$Visibility.ordinal()]) {
                    case 1:
                        c5322 = AbstractC5321.f13462;
                        c5322.getClass();
                        break;
                    case 2:
                        c5322 = AbstractC5321.f13465;
                        c5322.getClass();
                        break;
                    case 3:
                        c5322 = AbstractC5321.f13464;
                        c5322.getClass();
                        break;
                    case 4:
                        c5322 = AbstractC5321.f13463;
                        c5322.getClass();
                        break;
                    case 5:
                        c5322 = AbstractC5321.f13461;
                        c5322.getClass();
                        break;
                    case 6:
                        c5322 = AbstractC5321.f13460;
                        c5322.getClass();
                        break;
                    default:
                        c5322 = AbstractC5321.f13465;
                        c5322.getClass();
                        break;
                }
                C5620 c5620 = new C5620(c56562.f14407.f14437, c56562.f14405, c7314, AbstractC4765.m8875(interfaceC7737, delimitedFrom.getName()), c5322, delimitedFrom, c56562.f14406, c6986, c56562.f14403, c56562.f14409);
                List<ProtoBuf$TypeParameter> typeParameterList = delimitedFrom.getTypeParameterList();
                typeParameterList.getClass();
                C5642 c5642 = c56562.m10123(c5620, typeParameterList, c56562.f14406, c56562.f14404, c56562.f14403, c56562.f14402).f14408;
                c5620.m10079(c5642.m10109(), c5642.m10107(AbstractC7738.m12755(delimitedFrom, c6986), false), c5642.m10107(AbstractC7738.m12745(delimitedFrom, c6986), false));
                return c5620;
        }
    }
}
