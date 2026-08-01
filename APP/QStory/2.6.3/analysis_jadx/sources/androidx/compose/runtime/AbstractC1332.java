package androidx.compose.runtime;

import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2980;
import io.ktor.util.C4206;
import io.ktor.util.C4211;
import io.ktor.util.C4212;
import io.ktor.util.InterfaceC4214;
import io.ktor.util.InterfaceC4215;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
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
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4808;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4817;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4815;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4820;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlinx.coroutines.channels.InterfaceC5200;
import kotlinx.coroutines.channels.InterfaceC5207;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6479;
import p046.InterfaceC6481;
import p052.InterfaceC6558;
import p070.InterfaceC6908;
import p099.AbstractC7242;
import p100.InterfaceC7244;
import p228.C8018;
import p228.C8022;
import p228.C8027;
import p228.InterfaceC8033;
import p228.InterfaceC8034;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1332 implements InterfaceC4215, InterfaceC4812, InterfaceC6479, InterfaceC7244, InterfaceC8034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f3895;

    public AbstractC1332(int i) {
        switch (i) {
            case 1:
                this.f3895 = new ArrayDeque(20);
                break;
            case 2:
                this.f3895 = new C4206();
                break;
            default:
                this.f3895 = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m2405(int i) {
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
    public static /* synthetic */ void m2406(int i) {
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

    @Override // p046.InterfaceC6479
    public InterfaceC6481 getAnnotations() {
        InterfaceC6481 interfaceC6481 = (InterfaceC6481) this.f3895;
        if (interfaceC6481 != null) {
            return interfaceC6481;
        }
        m2405(1);
        throw null;
    }

    @Override // p100.InterfaceC7244
    public AbstractC4882 getType() {
        AbstractC4882 abstractC4882 = (AbstractC4882) this.f3895;
        if (abstractC4882 != null) {
            return abstractC4882;
        }
        m2406(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public List mo2407(AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind) {
        AbstractC7242 abstractC7242 = (AbstractC7242) this.f3895;
        InterfaceC6908 interfaceC6908 = abstractC4808.f14019;
        interfaceC4701.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC4701 instanceof ProtoBuf$Function) {
            List<ProtoBuf$Annotation> extensionReceiverAnnotationList = ((ProtoBuf$Function) interfaceC4701).getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            abstractC7242.getClass();
            return m2417(extensionReceiverAnnotationList, null, interfaceC6908);
        }
        if (!(interfaceC4701 instanceof ProtoBuf$Property)) {
            C4211.m8592(interfaceC4701, "Unknown message: ");
            return null;
        }
        int i = AbstractC4817.f14034[annotatedCallableKind.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            C4211.m8592(annotatedCallableKind, "Unsupported callable kind with property proto for receiver annotations: ");
            return null;
        }
        List<ProtoBuf$Annotation> extensionReceiverAnnotationList2 = ((ProtoBuf$Property) interfaceC4701).getExtensionReceiverAnnotationList();
        extensionReceiverAnnotationList2.getClass();
        abstractC7242.getClass();
        return m2417(extensionReceiverAnnotationList2, null, interfaceC6908);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public List mo2408(AbstractC4808 abstractC4808, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        List<ProtoBuf$Annotation> backingFieldAnnotationList = protoBuf$Property.getBackingFieldAnnotationList();
        backingFieldAnnotationList.getClass();
        ((AbstractC7242) this.f3895).getClass();
        return m2417(backingFieldAnnotationList, null, abstractC4808.f14019);
    }

    @Override // io.ktor.util.InterfaceC4215
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void mo2409(String str, List list) {
        str.getClass();
        list.getClass();
        List listM2414 = m2414(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo2412((String) it.next());
        }
        AbstractC4344.m8804(list, listM2414);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List mo2410(AbstractC4808 abstractC4808, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        abstractC4808.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$EnumEntry.getAnnotationList();
        annotationList.getClass();
        return m2417(annotationList, (List) protoBuf$EnumEntry.getExtension(((AbstractC7242) this.f3895).f19298), abstractC4808.f14019);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public void mo2411(String str) {
        str.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public abstract void mo2400(InterfaceC5207 interfaceC5207);

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public void mo2412(String str) {
        str.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public String m2413(String str) {
        List listM2416 = m2416(str);
        if (listM2416 != null) {
            return (String) AbstractC4344.m8815(listM2416);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public List m2414(String str) {
        Map map = (Map) this.f3895;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        mo2411(str);
        map.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public void m2415(InterfaceC2980 interfaceC2980) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3895;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC2980);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public abstract InterfaceC6558 mo2401(InterfaceC5200 interfaceC5200);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public List m2416(String str) {
        str.getClass();
        return (List) ((Map) this.f3895).get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public ArrayList m2417(List list, List list2, InterfaceC6908 interfaceC6908) {
        if (list.isEmpty()) {
            list = list2 == null ? EmptyList.INSTANCE : list2;
        }
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : list) {
            protoBuf$Annotation.getClass();
            interfaceC6908.getClass();
            arrayList.add(((C4815) this).f14033.m9554(protoBuf$Annotation, interfaceC6908));
        }
        return arrayList;
    }

    @Override // io.ktor.util.InterfaceC4215
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Set mo2418() {
        Set setEntrySet = ((Map) this.f3895).entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List mo2419(C4820 c4820) {
        c4820.getClass();
        ProtoBuf$Class protoBuf$Class = c4820.f14044;
        List<ProtoBuf$Annotation> annotationList = protoBuf$Class.getAnnotationList();
        annotationList.getClass();
        return m2417(annotationList, (List) protoBuf$Class.getExtension(((AbstractC7242) this.f3895).f19295), c4820.f14019);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public List mo2420(AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC4701.getClass();
        annotatedCallableKind.getClass();
        List listMo2422 = protoBuf$ValueParameter != null ? mo2422(abstractC4808, interfaceC4701, annotatedCallableKind, i, protoBuf$ValueParameter) : null;
        return listMo2422 == null ? EmptyList.INSTANCE : listMo2422;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ArrayList mo2421(ProtoBuf$Type protoBuf$Type, InterfaceC6908 interfaceC6908) {
        protoBuf$Type.getClass();
        interfaceC6908.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$Type.getAnnotationList();
        annotationList.getClass();
        return m2417(annotationList, (List) protoBuf$Type.getExtension(((AbstractC7242) this.f3895).f19300), interfaceC6908);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public List mo2422(AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC4701.getClass();
        annotatedCallableKind.getClass();
        protoBuf$ValueParameter.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$ValueParameter.getAnnotationList();
        annotationList.getClass();
        return m2417(annotationList, (List) protoBuf$ValueParameter.getExtension(((AbstractC7242) this.f3895).f19303), abstractC4808.f14019);
    }

    @Override // io.ktor.util.InterfaceC4215
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public void mo2423(String str, String str2) {
        str.getClass();
        str2.getClass();
        mo2412(str2);
        m2414(str).add(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public List mo2424(AbstractC4808 abstractC4808, InterfaceC4701 interfaceC4701, AnnotatedCallableKind annotatedCallableKind) {
        AbstractC7242 abstractC7242 = (AbstractC7242) this.f3895;
        InterfaceC6908 interfaceC6908 = abstractC4808.f14019;
        interfaceC4701.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC4701 instanceof ProtoBuf$Constructor) {
            ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) interfaceC4701;
            List<ProtoBuf$Annotation> annotationList = protoBuf$Constructor.getAnnotationList();
            annotationList.getClass();
            return m2417(annotationList, (List) protoBuf$Constructor.getExtension(abstractC7242.f19296), interfaceC6908);
        }
        if (interfaceC4701 instanceof ProtoBuf$Function) {
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) interfaceC4701;
            List<ProtoBuf$Annotation> annotationList2 = protoBuf$Function.getAnnotationList();
            annotationList2.getClass();
            return m2417(annotationList2, (List) protoBuf$Function.getExtension(abstractC7242.f19294), interfaceC6908);
        }
        if (!(interfaceC4701 instanceof ProtoBuf$Property)) {
            C4211.m8592(interfaceC4701, "Unknown message: ");
            return null;
        }
        int i = AbstractC4817.f14034[annotatedCallableKind.ordinal()];
        if (i == 1) {
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) interfaceC4701;
            List<ProtoBuf$Annotation> annotationList3 = protoBuf$Property.getAnnotationList();
            annotationList3.getClass();
            return m2417(annotationList3, (List) protoBuf$Property.getExtension(abstractC7242.f19293), interfaceC6908);
        }
        if (i == 2) {
            ProtoBuf$Property protoBuf$Property2 = (ProtoBuf$Property) interfaceC4701;
            List<ProtoBuf$Annotation> getterAnnotationList = protoBuf$Property2.getGetterAnnotationList();
            getterAnnotationList.getClass();
            return m2417(getterAnnotationList, (List) protoBuf$Property2.getExtension(abstractC7242.f19292), interfaceC6908);
        }
        if (i != 3) {
            C5925.m11311("Unsupported callable kind with property proto");
            return null;
        }
        ProtoBuf$Property protoBuf$Property3 = (ProtoBuf$Property) interfaceC4701;
        List<ProtoBuf$Annotation> setterAnnotationList = protoBuf$Property3.getSetterAnnotationList();
        setterAnnotationList.getClass();
        return m2417(setterAnnotationList, (List) protoBuf$Property3.getExtension(abstractC7242.f19299), interfaceC6908);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public abstract void mo2402(InterfaceC5200 interfaceC5200);

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public void m2425(InterfaceC4214 interfaceC4214) {
        interfaceC4214.getClass();
        interfaceC4214.mo8355(new C4212(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public abstract void mo2403();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public abstract void mo2404();

    @Override // p228.InterfaceC8034
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8033 mo317(C8027 c8027) {
        return new C8022((C8018) this.f3895, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public List mo2426(AbstractC4808 abstractC4808, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        List<ProtoBuf$Annotation> delegateFieldAnnotationList = protoBuf$Property.getDelegateFieldAnnotationList();
        delegateFieldAnnotationList.getClass();
        ((AbstractC7242) this.f3895).getClass();
        return m2417(delegateFieldAnnotationList, null, abstractC4808.f14019);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4812
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public ArrayList mo2427(ProtoBuf$TypeParameter protoBuf$TypeParameter, InterfaceC6908 interfaceC6908) {
        protoBuf$TypeParameter.getClass();
        interfaceC6908.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$TypeParameter.getAnnotationList();
        annotationList.getClass();
        return m2417(annotationList, (List) protoBuf$TypeParameter.getExtension(((AbstractC7242) this.f3895).f19301), interfaceC6908);
    }

    public AbstractC1332(InterfaceC6481 interfaceC6481) {
        if (interfaceC6481 != null) {
            this.f3895 = interfaceC6481;
        } else {
            m2405(0);
            throw null;
        }
    }

    public AbstractC1332(AbstractC4882 abstractC4882) {
        if (abstractC4882 != null) {
            this.f3895 = abstractC4882;
        } else {
            m2406(0);
            throw null;
        }
    }

    public AbstractC1332(C8018 c8018) {
        this.f3895 = c8018;
    }

    public AbstractC1332(AbstractC7242 abstractC7242) {
        abstractC7242.getClass();
        this.f3895 = abstractC7242;
    }
}
