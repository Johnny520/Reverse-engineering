package androidx.compose.runtime;

import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3812;
import io.ktor.util.C5038;
import io.ktor.util.C5043;
import io.ktor.util.C5044;
import io.ktor.util.InterfaceC5046;
import io.ktor.util.InterfaceC5047;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5640;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5649;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5647;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5652;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6039;
import net.bytebuddy.description.method.MethodDescription;
import p062.InterfaceC7308;
import p062.InterfaceC7310;
import p068.InterfaceC7387;
import p086.InterfaceC7737;
import p115.AbstractC8071;
import p116.InterfaceC8073;
import p244.C8847;
import p244.C8851;
import p244.C8856;
import p244.InterfaceC8862;
import p244.InterfaceC8863;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2167 implements InterfaceC5047, InterfaceC5644, InterfaceC7308, InterfaceC8073, InterfaceC8863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f4240;

    public AbstractC2167(int i) {
        switch (i) {
            case 1:
                this.f4240 = new ArrayDeque(20);
                break;
            case 2:
                this.f4240 = new C5038();
                break;
            default:
                this.f4240 = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m2965(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public static /* synthetic */ void m2966(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p062.InterfaceC7308
    public InterfaceC7310 getAnnotations() {
        InterfaceC7310 interfaceC7310 = (InterfaceC7310) this.f4240;
        if (interfaceC7310 != null) {
            return interfaceC7310;
        }
        m2965(1);
        throw null;
    }

    @Override // p116.InterfaceC8073
    public AbstractC5714 getType() {
        AbstractC5714 abstractC5714 = (AbstractC5714) this.f4240;
        if (abstractC5714 != null) {
            return abstractC5714;
        }
        m2966(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public List mo2967(AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind) {
        AbstractC8071 abstractC8071 = (AbstractC8071) this.f4240;
        InterfaceC7737 interfaceC7737 = abstractC5640.f14364;
        interfaceC5533.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC5533 instanceof ProtoBuf$Function) {
            List<ProtoBuf$Annotation> extensionReceiverAnnotationList = ((ProtoBuf$Function) interfaceC5533).getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            abstractC8071.getClass();
            return m2977(extensionReceiverAnnotationList, null, interfaceC7737);
        }
        if (!(interfaceC5533 instanceof ProtoBuf$Property)) {
            C5043.m9151(interfaceC5533, "Unknown message: ");
            return null;
        }
        int i = AbstractC5649.f14379[annotatedCallableKind.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            C5043.m9151(annotatedCallableKind, "Unsupported callable kind with property proto for receiver annotations: ");
            return null;
        }
        List<ProtoBuf$Annotation> extensionReceiverAnnotationList2 = ((ProtoBuf$Property) interfaceC5533).getExtensionReceiverAnnotationList();
        extensionReceiverAnnotationList2.getClass();
        abstractC8071.getClass();
        return m2977(extensionReceiverAnnotationList2, null, interfaceC7737);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public List mo2968(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        List<ProtoBuf$Annotation> backingFieldAnnotationList = protoBuf$Property.getBackingFieldAnnotationList();
        backingFieldAnnotationList.getClass();
        ((AbstractC8071) this.f4240).getClass();
        return m2977(backingFieldAnnotationList, null, abstractC5640.f14364);
    }

    @Override // io.ktor.util.InterfaceC5047
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void mo2969(String str, List list) {
        str.getClass();
        list.getClass();
        List listM2974 = m2974(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo2972((String) it.next());
        }
        AbstractC5176.m9363(list, listM2974);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List mo2970(AbstractC5640 abstractC5640, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        abstractC5640.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$EnumEntry.getAnnotationList();
        annotationList.getClass();
        return m2977(annotationList, (List) protoBuf$EnumEntry.getExtension(((AbstractC8071) this.f4240).f19643), abstractC5640.f14364);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public void mo2971(String str) {
        str.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public abstract void mo2960(InterfaceC6039 interfaceC6039);

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public void mo2972(String str) {
        str.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public String m2973(String str) {
        List listM2976 = m2976(str);
        if (listM2976 != null) {
            return (String) AbstractC5176.m9374(listM2976);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public List m2974(String str) {
        Map map = (Map) this.f4240;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        mo2971(str);
        map.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public void m2975(InterfaceC3812 interfaceC3812) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f4240;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC3812);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public abstract InterfaceC7387 mo2961(InterfaceC6032 interfaceC6032);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public List m2976(String str) {
        str.getClass();
        return (List) ((Map) this.f4240).get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public ArrayList m2977(List list, List list2, InterfaceC7737 interfaceC7737) {
        if (list.isEmpty()) {
            list = list2 == null ? EmptyList.INSTANCE : list2;
        }
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : list) {
            protoBuf$Annotation.getClass();
            interfaceC7737.getClass();
            arrayList.add(((C5647) this).f14378.m10113(protoBuf$Annotation, interfaceC7737));
        }
        return arrayList;
    }

    @Override // io.ktor.util.InterfaceC5047
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Set mo2978() {
        Set setEntrySet = ((Map) this.f4240).entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List mo2979(C5652 c5652) {
        c5652.getClass();
        ProtoBuf$Class protoBuf$Class = c5652.f14389;
        List<ProtoBuf$Annotation> annotationList = protoBuf$Class.getAnnotationList();
        annotationList.getClass();
        return m2977(annotationList, (List) protoBuf$Class.getExtension(((AbstractC8071) this.f4240).f19640), c5652.f14364);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public List mo2980(AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC5533.getClass();
        annotatedCallableKind.getClass();
        List listMo2982 = protoBuf$ValueParameter != null ? mo2982(abstractC5640, interfaceC5533, annotatedCallableKind, i, protoBuf$ValueParameter) : null;
        return listMo2982 == null ? EmptyList.INSTANCE : listMo2982;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ArrayList mo2981(ProtoBuf$Type protoBuf$Type, InterfaceC7737 interfaceC7737) {
        protoBuf$Type.getClass();
        interfaceC7737.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$Type.getAnnotationList();
        annotationList.getClass();
        return m2977(annotationList, (List) protoBuf$Type.getExtension(((AbstractC8071) this.f4240).f19645), interfaceC7737);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public List mo2982(AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC5533.getClass();
        annotatedCallableKind.getClass();
        protoBuf$ValueParameter.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$ValueParameter.getAnnotationList();
        annotationList.getClass();
        return m2977(annotationList, (List) protoBuf$ValueParameter.getExtension(((AbstractC8071) this.f4240).f19648), abstractC5640.f14364);
    }

    @Override // io.ktor.util.InterfaceC5047
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public void mo2983(String str, String str2) {
        str.getClass();
        str2.getClass();
        mo2972(str2);
        m2974(str).add(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public List mo2984(AbstractC5640 abstractC5640, InterfaceC5533 interfaceC5533, AnnotatedCallableKind annotatedCallableKind) {
        AbstractC8071 abstractC8071 = (AbstractC8071) this.f4240;
        InterfaceC7737 interfaceC7737 = abstractC5640.f14364;
        interfaceC5533.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC5533 instanceof ProtoBuf$Constructor) {
            ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) interfaceC5533;
            List<ProtoBuf$Annotation> annotationList = protoBuf$Constructor.getAnnotationList();
            annotationList.getClass();
            return m2977(annotationList, (List) protoBuf$Constructor.getExtension(abstractC8071.f19641), interfaceC7737);
        }
        if (interfaceC5533 instanceof ProtoBuf$Function) {
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) interfaceC5533;
            List<ProtoBuf$Annotation> annotationList2 = protoBuf$Function.getAnnotationList();
            annotationList2.getClass();
            return m2977(annotationList2, (List) protoBuf$Function.getExtension(abstractC8071.f19639), interfaceC7737);
        }
        if (!(interfaceC5533 instanceof ProtoBuf$Property)) {
            C5043.m9151(interfaceC5533, "Unknown message: ");
            return null;
        }
        int i = AbstractC5649.f14379[annotatedCallableKind.ordinal()];
        if (i == 1) {
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) interfaceC5533;
            List<ProtoBuf$Annotation> annotationList3 = protoBuf$Property.getAnnotationList();
            annotationList3.getClass();
            return m2977(annotationList3, (List) protoBuf$Property.getExtension(abstractC8071.f19638), interfaceC7737);
        }
        if (i == 2) {
            ProtoBuf$Property protoBuf$Property2 = (ProtoBuf$Property) interfaceC5533;
            List<ProtoBuf$Annotation> getterAnnotationList = protoBuf$Property2.getGetterAnnotationList();
            getterAnnotationList.getClass();
            return m2977(getterAnnotationList, (List) protoBuf$Property2.getExtension(abstractC8071.f19637), interfaceC7737);
        }
        if (i != 3) {
            C6755.m11870("Unsupported callable kind with property proto");
            return null;
        }
        ProtoBuf$Property protoBuf$Property3 = (ProtoBuf$Property) interfaceC5533;
        List<ProtoBuf$Annotation> setterAnnotationList = protoBuf$Property3.getSetterAnnotationList();
        setterAnnotationList.getClass();
        return m2977(setterAnnotationList, (List) protoBuf$Property3.getExtension(abstractC8071.f19644), interfaceC7737);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public abstract void mo2962(InterfaceC6032 interfaceC6032);

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public void m2985(InterfaceC5046 interfaceC5046) {
        interfaceC5046.getClass();
        interfaceC5046.mo8914(new C5044(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public abstract void mo2963();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public abstract void mo2964();

    @Override // p244.InterfaceC8863
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8862 mo877(C8856 c8856) {
        return new C8851((C8847) this.f4240, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public List mo2986(AbstractC5640 abstractC5640, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        List<ProtoBuf$Annotation> delegateFieldAnnotationList = protoBuf$Property.getDelegateFieldAnnotationList();
        delegateFieldAnnotationList.getClass();
        ((AbstractC8071) this.f4240).getClass();
        return m2977(delegateFieldAnnotationList, null, abstractC5640.f14364);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC5644
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public ArrayList mo2987(ProtoBuf$TypeParameter protoBuf$TypeParameter, InterfaceC7737 interfaceC7737) {
        protoBuf$TypeParameter.getClass();
        interfaceC7737.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$TypeParameter.getAnnotationList();
        annotationList.getClass();
        return m2977(annotationList, (List) protoBuf$TypeParameter.getExtension(((AbstractC8071) this.f4240).f19646), interfaceC7737);
    }

    public AbstractC2167(InterfaceC7310 interfaceC7310) {
        if (interfaceC7310 != null) {
            this.f4240 = interfaceC7310;
        } else {
            m2965(0);
            throw null;
        }
    }

    public AbstractC2167(AbstractC5714 abstractC5714) {
        if (abstractC5714 != null) {
            this.f4240 = abstractC5714;
        } else {
            m2966(0);
            throw null;
        }
    }

    public AbstractC2167(C8847 c8847) {
        this.f4240 = c8847;
    }

    public AbstractC2167(AbstractC8071 abstractC8071) {
        abstractC8071.getClass();
        this.f4240 = abstractC8071;
    }
}
