package androidx.compose.runtime;

import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import io.ktor.util.C4205;
import io.ktor.util.C4210;
import io.ktor.util.C4211;
import io.ktor.util.InterfaceC4213;
import io.ktor.util.InterfaceC4214;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
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
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4807;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC4816;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4814;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4819;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.channels.InterfaceC5206;
import net.bytebuddy.description.method.MethodDescription;
import p046.InterfaceC6478;
import p046.InterfaceC6480;
import p052.InterfaceC6557;
import p070.InterfaceC6907;
import p099.AbstractC7241;
import p100.InterfaceC7243;
import p228.C8017;
import p228.C8021;
import p228.C8026;
import p228.InterfaceC8032;
import p228.InterfaceC8033;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1332 implements InterfaceC4214, InterfaceC4811, InterfaceC6478, InterfaceC7243, InterfaceC8033 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f3894;

    public AbstractC1332(int i) {
        switch (i) {
            case 1:
                this.f3894 = new ArrayDeque(20);
                break;
            case 2:
                this.f3894 = new C4205();
                break;
            default:
                this.f3894 = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public static /* synthetic */ void m2395(int i) {
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
    public static /* synthetic */ void m2396(int i) {
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

    @Override // p046.InterfaceC6478
    public InterfaceC6480 getAnnotations() {
        InterfaceC6480 interfaceC6480 = (InterfaceC6480) this.f3894;
        if (interfaceC6480 != null) {
            return interfaceC6480;
        }
        m2395(1);
        throw null;
    }

    @Override // p100.InterfaceC7243
    public AbstractC4881 getType() {
        AbstractC4881 abstractC4881 = (AbstractC4881) this.f3894;
        if (abstractC4881 != null) {
            return abstractC4881;
        }
        m2396(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public List mo2397(AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind) {
        AbstractC7241 abstractC7241 = (AbstractC7241) this.f3894;
        InterfaceC6907 interfaceC6907 = abstractC4807.f14015;
        interfaceC4700.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC4700 instanceof ProtoBuf$Function) {
            List<ProtoBuf$Annotation> extensionReceiverAnnotationList = ((ProtoBuf$Function) interfaceC4700).getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            abstractC7241.getClass();
            return m2407(extensionReceiverAnnotationList, null, interfaceC6907);
        }
        if (!(interfaceC4700 instanceof ProtoBuf$Property)) {
            C4210.m8602(interfaceC4700, "Unknown message: ");
            return null;
        }
        int i = AbstractC4816.f14030[annotatedCallableKind.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            C4210.m8602(annotatedCallableKind, "Unsupported callable kind with property proto for receiver annotations: ");
            return null;
        }
        List<ProtoBuf$Annotation> extensionReceiverAnnotationList2 = ((ProtoBuf$Property) interfaceC4700).getExtensionReceiverAnnotationList();
        extensionReceiverAnnotationList2.getClass();
        abstractC7241.getClass();
        return m2407(extensionReceiverAnnotationList2, null, interfaceC6907);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public List mo2398(AbstractC4807 abstractC4807, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        List<ProtoBuf$Annotation> backingFieldAnnotationList = protoBuf$Property.getBackingFieldAnnotationList();
        backingFieldAnnotationList.getClass();
        ((AbstractC7241) this.f3894).getClass();
        return m2407(backingFieldAnnotationList, null, abstractC4807.f14015);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void mo2399(String str, List list) {
        str.getClass();
        list.getClass();
        List listM2404 = m2404(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mo2402((String) it.next());
        }
        AbstractC4343.m8794(list, listM2404);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List mo2400(AbstractC4807 abstractC4807, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        abstractC4807.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$EnumEntry.getAnnotationList();
        annotationList.getClass();
        return m2407(annotationList, (List) protoBuf$EnumEntry.getExtension(((AbstractC7241) this.f3894).f19303), abstractC4807.f14015);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public void mo2401(String str) {
        str.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public abstract void mo2390(InterfaceC5206 interfaceC5206);

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public void mo2402(String str) {
        str.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public String m2403(String str) {
        List listM2406 = m2406(str);
        if (listM2406 != null) {
            return (String) AbstractC4343.m8830(listM2406);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public List m2404(String str) {
        Map map = (Map) this.f3894;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        mo2401(str);
        map.put(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public void m2405(InterfaceC2979 interfaceC2979) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f3894;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC2979);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public abstract InterfaceC6557 mo2391(InterfaceC5199 interfaceC5199);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public List m2406(String str) {
        str.getClass();
        return (List) ((Map) this.f3894).get(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public ArrayList m2407(List list, List list2, InterfaceC6907 interfaceC6907) {
        if (list.isEmpty()) {
            list = list2 == null ? EmptyList.INSTANCE : list2;
        }
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : list) {
            protoBuf$Annotation.getClass();
            interfaceC6907.getClass();
            arrayList.add(((C4814) this).f14029.m9564(protoBuf$Annotation, interfaceC6907));
        }
        return arrayList;
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Set mo2408() {
        Set setEntrySet = ((Map) this.f3894).entrySet();
        setEntrySet.getClass();
        Set setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public List mo2409(C4819 c4819) {
        c4819.getClass();
        ProtoBuf$Class protoBuf$Class = c4819.f14040;
        List<ProtoBuf$Annotation> annotationList = protoBuf$Class.getAnnotationList();
        annotationList.getClass();
        return m2407(annotationList, (List) protoBuf$Class.getExtension(((AbstractC7241) this.f3894).f19300), c4819.f14015);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public List mo2410(AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC4700.getClass();
        annotatedCallableKind.getClass();
        List listMo2412 = protoBuf$ValueParameter != null ? mo2412(abstractC4807, interfaceC4700, annotatedCallableKind, i, protoBuf$ValueParameter) : null;
        return listMo2412 == null ? EmptyList.INSTANCE : listMo2412;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public ArrayList mo2411(ProtoBuf$Type protoBuf$Type, InterfaceC6907 interfaceC6907) {
        protoBuf$Type.getClass();
        interfaceC6907.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$Type.getAnnotationList();
        annotationList.getClass();
        return m2407(annotationList, (List) protoBuf$Type.getExtension(((AbstractC7241) this.f3894).f19305), interfaceC6907);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public List mo2412(AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        interfaceC4700.getClass();
        annotatedCallableKind.getClass();
        protoBuf$ValueParameter.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$ValueParameter.getAnnotationList();
        annotationList.getClass();
        return m2407(annotationList, (List) protoBuf$ValueParameter.getExtension(((AbstractC7241) this.f3894).f19308), abstractC4807.f14015);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public void mo2413(String str, String str2) {
        str.getClass();
        str2.getClass();
        mo2402(str2);
        m2404(str).add(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public List mo2414(AbstractC4807 abstractC4807, InterfaceC4700 interfaceC4700, AnnotatedCallableKind annotatedCallableKind) {
        AbstractC7241 abstractC7241 = (AbstractC7241) this.f3894;
        InterfaceC6907 interfaceC6907 = abstractC4807.f14015;
        interfaceC4700.getClass();
        annotatedCallableKind.getClass();
        if (interfaceC4700 instanceof ProtoBuf$Constructor) {
            ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) interfaceC4700;
            List<ProtoBuf$Annotation> annotationList = protoBuf$Constructor.getAnnotationList();
            annotationList.getClass();
            return m2407(annotationList, (List) protoBuf$Constructor.getExtension(abstractC7241.f19301), interfaceC6907);
        }
        if (interfaceC4700 instanceof ProtoBuf$Function) {
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) interfaceC4700;
            List<ProtoBuf$Annotation> annotationList2 = protoBuf$Function.getAnnotationList();
            annotationList2.getClass();
            return m2407(annotationList2, (List) protoBuf$Function.getExtension(abstractC7241.f19299), interfaceC6907);
        }
        if (!(interfaceC4700 instanceof ProtoBuf$Property)) {
            C4210.m8602(interfaceC4700, "Unknown message: ");
            return null;
        }
        int i = AbstractC4816.f14030[annotatedCallableKind.ordinal()];
        if (i == 1) {
            ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) interfaceC4700;
            List<ProtoBuf$Annotation> annotationList3 = protoBuf$Property.getAnnotationList();
            annotationList3.getClass();
            return m2407(annotationList3, (List) protoBuf$Property.getExtension(abstractC7241.f19298), interfaceC6907);
        }
        if (i == 2) {
            ProtoBuf$Property protoBuf$Property2 = (ProtoBuf$Property) interfaceC4700;
            List<ProtoBuf$Annotation> getterAnnotationList = protoBuf$Property2.getGetterAnnotationList();
            getterAnnotationList.getClass();
            return m2407(getterAnnotationList, (List) protoBuf$Property2.getExtension(abstractC7241.f19297), interfaceC6907);
        }
        if (i != 3) {
            C5919.m11250("Unsupported callable kind with property proto");
            return null;
        }
        ProtoBuf$Property protoBuf$Property3 = (ProtoBuf$Property) interfaceC4700;
        List<ProtoBuf$Annotation> setterAnnotationList = protoBuf$Property3.getSetterAnnotationList();
        setterAnnotationList.getClass();
        return m2407(setterAnnotationList, (List) protoBuf$Property3.getExtension(abstractC7241.f19304), interfaceC6907);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public abstract void mo2392(InterfaceC5199 interfaceC5199);

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public void m2415(InterfaceC4213 interfaceC4213) {
        interfaceC4213.getClass();
        interfaceC4213.mo8365(new C4211(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public abstract void mo2393();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public abstract void mo2394();

    @Override // p228.InterfaceC8033
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public InterfaceC8032 mo316(C8026 c8026) {
        return new C8021((C8017) this.f3894, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public List mo2416(AbstractC4807 abstractC4807, ProtoBuf$Property protoBuf$Property) {
        protoBuf$Property.getClass();
        List<ProtoBuf$Annotation> delegateFieldAnnotationList = protoBuf$Property.getDelegateFieldAnnotationList();
        delegateFieldAnnotationList.getClass();
        ((AbstractC7241) this.f3894).getClass();
        return m2407(delegateFieldAnnotationList, null, abstractC4807.f14015);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC4811
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public ArrayList mo2417(ProtoBuf$TypeParameter protoBuf$TypeParameter, InterfaceC6907 interfaceC6907) {
        protoBuf$TypeParameter.getClass();
        interfaceC6907.getClass();
        List<ProtoBuf$Annotation> annotationList = protoBuf$TypeParameter.getAnnotationList();
        annotationList.getClass();
        return m2407(annotationList, (List) protoBuf$TypeParameter.getExtension(((AbstractC7241) this.f3894).f19306), interfaceC6907);
    }

    public AbstractC1332(InterfaceC6480 interfaceC6480) {
        if (interfaceC6480 != null) {
            this.f3894 = interfaceC6480;
        } else {
            m2395(0);
            throw null;
        }
    }

    public AbstractC1332(AbstractC4881 abstractC4881) {
        if (abstractC4881 != null) {
            this.f3894 = abstractC4881;
        } else {
            m2396(0);
            throw null;
        }
    }

    public AbstractC1332(C8017 c8017) {
        this.f3894 = c8017;
    }

    public AbstractC1332(AbstractC7241 abstractC7241) {
        abstractC7241.getClass();
        this.f3894 = abstractC7241;
    }
}
