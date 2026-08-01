package kotlin.reflect.jvm.internal;

import androidx.compose.animation.core.C1171;
import androidx.compose.p001ui.semantics.C2780;
import androidx.window.area.AbstractC3400;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.AbstractC3898;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC6016;
import kotlin.Metadata;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.KVariance;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5327;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5449;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5356;
import kotlin.reflect.jvm.internal.impl.p009km.C5359;
import kotlin.reflect.jvm.internal.impl.p009km.C5362;
import kotlin.reflect.jvm.internal.impl.p009km.C5363;
import kotlin.reflect.jvm.internal.impl.p009km.C5365;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.impl.p009km.ClassKind;
import kotlin.reflect.jvm.internal.impl.p009km.KmVariance;
import kotlin.reflect.jvm.internal.impl.p009km.Modality;
import kotlin.reflect.jvm.internal.impl.p009km.Visibility;
import kotlin.reflect.jvm.internal.impl.p009km.internal.AbstractC5340;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5347;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.types.C5770;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p061.AbstractC7302;
import p061.C7291;
import p061.C7294;
import p065.AbstractC7351;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p068.InterfaceC7372;
import p095.AbstractC7818;
import p119.AbstractC8104;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5878 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5836 f14904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C5877 f14905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14906;

    public /* synthetic */ C5878(C5877 c5877, C5836 c5836, int i) {
        this.f14906 = i;
        this.f14905 = c5877;
        this.f14904 = c5836;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ac  */
    /* JADX WARN: Type inference failed for: r0v47, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.ArrayList] */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException, InvocationTargetException {
        String str;
        Object arrayList;
        Class[] clsArr;
        HashMap map;
        Field fieldM10655;
        Class<?> declaringClass;
        ArrayList arrayList2;
        Field declaredField;
        InterfaceC5925 interfaceC5925Mo9476;
        InterfaceC6016 interfaceC6016;
        C5877 c5877;
        ArrayList arrayList3 = null;
        c5902M10556 = null;
        c5902M10556 = null;
        C5902 c5902M10556 = null;
        switch (this.f14906) {
            case 0:
                C5836 c5836 = this.f14904;
                C5877 c58772 = this.f14905;
                if (AbstractC5905.f14965) {
                    Metadata metadata = (Metadata) c5836.f14769.getAnnotation(Metadata.class);
                    if (metadata == null) {
                        return null;
                    }
                    AbstractC5894 abstractC5894M8861 = AbstractC4765.m8861(metadata);
                    C5347 c5347 = abstractC5894M8861 instanceof C5347 ? (C5347) abstractC5894M8861 : null;
                    if (c5347 != null) {
                        return c5347.f13504;
                    }
                    return null;
                }
                AbstractC7818 abstractC7818M10558 = c58772.m10558();
                if (!(abstractC7818M10558 instanceof C7294)) {
                    C5633 c5633 = abstractC7818M10558 instanceof C5633 ? (C5633) abstractC7818M10558 : null;
                    if (c5633 != null) {
                        return AbstractC5340.m9663(c5633.f14348, c5633.f14339.f14406, false, 6);
                    }
                    return null;
                }
                C7294 c7294 = (C7294) abstractC7818M10558;
                AbstractC7302 abstractC7302 = c7294.f18088;
                if (!(abstractC7302 instanceof C7291)) {
                    C5043.m9172("Unsupported function type kind: ", abstractC7302, " (", abstractC7818M10558);
                    return null;
                }
                int i = c7294.f18085;
                C5381 c5381 = new C5381();
                ArrayList arrayList4 = c5381.f13632;
                c5381.f13633 = AbstractC7012.m12147(i, "kotlin/Function");
                ClassKind classKind = ClassKind.INTERFACE;
                InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
                classKind.getClass();
                C1171 c1171 = AbstractC5377.f13605;
                InterfaceC5920[] interfaceC5920Arr2 = AbstractC5377.f13608;
                c1171.m1557(c5381, interfaceC5920Arr2[9], classKind);
                Modality modality = Modality.ABSTRACT;
                modality.getClass();
                AbstractC5377.f13607.m1557(c5381, interfaceC5920Arr2[7], modality);
                Visibility visibility = Visibility.PUBLIC;
                visibility.getClass();
                AbstractC5377.f13606.m1557(c5381, interfaceC5920Arr2[8], visibility);
                if (1 <= i) {
                    int i2 = 1;
                    while (true) {
                        String strM12147 = AbstractC7012.m12147(i2, "P");
                        KmVariance kmVariance = KmVariance.f305IN;
                        kmVariance.getClass();
                        arrayList4.add(new C5356(0, strM12147, i2, kmVariance));
                        if (i2 != i) {
                            i2++;
                        }
                    }
                }
                int i3 = i + 1;
                KmVariance kmVariance2 = KmVariance.OUT;
                kmVariance2.getClass();
                arrayList4.add(new C5356(0, "R", i3, kmVariance2));
                ArrayList arrayList5 = c5381.f13631;
                C5366 c5366 = new C5366(0);
                c5366.f13552 = new C5365("kotlin/Function");
                ArrayList arrayList6 = c5366.f13551;
                KmVariance kmVariance3 = KmVariance.INVARIANT;
                C5366 c53662 = new C5366(0);
                c53662.f13552 = new C5363(i3);
                arrayList6.add(new C5359(kmVariance3, c53662));
                arrayList5.add(c5366);
                return c5381;
            case 1:
                C5836 c58362 = this.f14904;
                C5877 c58773 = this.f14905;
                Class cls = c58362.f14769;
                if (AbstractC5227.m9466(cls, Object.class)) {
                    return EmptyList.INSTANCE;
                }
                if (AbstractC5905.f14967) {
                    Collection<AbstractC5714> collectionMo10053 = c58773.m10558().mo9560().mo10053();
                    collectionMo10053.getClass();
                    ArrayList arrayList7 = new ArrayList(collectionMo10053.size());
                    C5836 c58363 = c58773.f14889;
                    for (AbstractC5714 abstractC5714 : collectionMo10053) {
                        abstractC5714.getClass();
                        arrayList7.add(new C5770(abstractC5714, new C5860(abstractC5714, 1, c58363), false));
                    }
                    AbstractC7818 abstractC7818M105582 = c58773.m10558();
                    C5523 c5523 = AbstractC7359.f18265;
                    if (!AbstractC7359.m12578(abstractC7818M105582, AbstractC7356.f18230) && !AbstractC7359.m12578(abstractC7818M105582, AbstractC7356.f18229)) {
                        if (arrayList7.isEmpty()) {
                            arrayList7.add(AbstractC5904.f14964);
                        } else {
                            Iterator it = arrayList7.iterator();
                            while (it.hasNext()) {
                                InterfaceC5924 interfaceC5924Mo9458 = ((InterfaceC5919) it.next()).mo9458();
                                C5836 c58364 = interfaceC5924Mo9458 instanceof C5836 ? (C5836) interfaceC5924Mo9458 : null;
                                if (c58364 == null || (c58364.m10544() != ClassKind.INTERFACE && c58364.m10544() != ClassKind.ANNOTATION_CLASS)) {
                                }
                            }
                            arrayList7.add(AbstractC5904.f14964);
                        }
                    }
                    return AbstractC8104.m13049(arrayList7);
                }
                ArrayList arrayList8 = new ArrayList();
                C5381 c5381M10557 = c58773.m10557();
                ArrayList<C5366> arrayList9 = c5381M10557 != null ? c5381M10557.f13631 : null;
                if (arrayList9 != null) {
                    for (C5366 c53663 : arrayList9) {
                        AbstractC3898 abstractC3898M9690 = c53663.m9690();
                        C5365 c5365 = abstractC3898M9690 instanceof C5365 ? (C5365) abstractC3898M9690 : null;
                        if (c5365 == null || (str = c5365.f13547) == null) {
                            StringBuilder sb = new StringBuilder("Supertype of ");
                            sb.append(c58362);
                            AbstractC3898 abstractC3898M96902 = c53663.m9690();
                            sb.append(" not a class: ");
                            sb.append(abstractC3898M96902);
                            throw new KotlinReflectionInternalError(sb.toString());
                        }
                        C5520 c5520M8850 = AbstractC4765.m8850(str);
                        Class clsM10634 = AbstractC5899.m10634(AbstractC5263.m9533(cls), c5520M8850, 0);
                        if (clsM10634 == null) {
                            C5043.m9166("Unsupported superclass of ", c58362, ": ", c5520M8850);
                            return null;
                        }
                        arrayList8.add(AbstractC4765.m8849(c53663, AbstractC5263.m9533(cls), c58773.m10556(), new C5874(c58362, clsM10634, c5520M8850, i)));
                    }
                    if (cls.isArray()) {
                        arrayList8.add(AbstractC5904.f14962);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        InterfaceC5919 interfaceC5919 = AbstractC5904.f14961;
                        if (!arrayList8.contains(interfaceC5919)) {
                            C5906 c5906 = c58773.f14899;
                            InterfaceC5920 interfaceC5920 = C5877.f14881[3];
                            String str2 = (String) c5906.invoke();
                            if (str2 != null && AbstractC5971.m10698(str2, "kotlin.", false)) {
                                arrayList8.add(interfaceC5919);
                            }
                        }
                    }
                } else {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    if (genericSuperclass != null) {
                        if (genericSuperclass.equals(Object.class)) {
                            genericSuperclass = null;
                        }
                        if (genericSuperclass != null) {
                            arrayList8.add(AbstractC3897.m7363(genericSuperclass, AbstractC5171.m9335(), TypeNullability.NOT_NULL, false, 4));
                        }
                    }
                    Type[] genericInterfaces = cls.getGenericInterfaces();
                    genericInterfaces.getClass();
                    for (Type type : genericInterfaces) {
                        type.getClass();
                        arrayList8.add(AbstractC3897.m7363(type, AbstractC5171.m9335(), TypeNullability.NOT_NULL, false, 4));
                    }
                }
                if (arrayList8.isEmpty()) {
                    arrayList8.add(AbstractC5904.f14964);
                } else {
                    Iterator it2 = arrayList8.iterator();
                    while (it2.hasNext()) {
                        InterfaceC5924 interfaceC5924Mo94582 = ((InterfaceC5919) it2.next()).mo9458();
                        C5836 c58365 = interfaceC5924Mo94582 instanceof C5836 ? (C5836) interfaceC5924Mo94582 : null;
                        if (c58365 == null || (c58365.m10544() != ClassKind.INTERFACE && c58365.m10544() != ClassKind.ANNOTATION_CLASS)) {
                        }
                    }
                    arrayList8.add(AbstractC5904.f14964);
                }
                return AbstractC8104.m13049(arrayList8);
            case 2:
                C5836 c58366 = this.f14904;
                C5877 c58774 = this.f14905;
                Class cls2 = c58366.f14769;
                ClassLoader classLoaderM9533 = AbstractC5263.m9533(cls2);
                C5381 c5381M105572 = c58774.m10557();
                if (c5381M105572 != null) {
                    ArrayList arrayList10 = c5381M105572.f13644;
                    arrayList = new ArrayList();
                    Iterator it3 = arrayList10.iterator();
                    while (it3.hasNext()) {
                        InterfaceC5925 interfaceC5925M8868 = AbstractC4765.m8868(classLoaderM9533, (String) it3.next());
                        if (interfaceC5925M8868 != null) {
                            arrayList.add(interfaceC5925M8868);
                        }
                    }
                } else if (AbstractC5227.m9466(AbstractC3888.m7253(cls2), Boolean.TRUE)) {
                    Method method = (Method) AbstractC3888.m7248().f1441;
                    if (method == null) {
                        clsArr = null;
                    } else {
                        Object objInvoke = method.invoke(cls2, null);
                        objInvoke.getClass();
                        clsArr = (Class[]) objInvoke;
                    }
                    if (clsArr != null) {
                        arrayList3 = new ArrayList(clsArr.length);
                        int length = clsArr.length;
                        while (i < length) {
                            Class cls3 = clsArr[i];
                            cls3.getClass();
                            arrayList3.add(AbstractC5228.f13320.mo9476(cls3));
                            i++;
                        }
                    }
                    arrayList = arrayList3 == null ? EmptyList.INSTANCE : arrayList3;
                } else {
                    arrayList = EmptyList.INSTANCE;
                }
                arrayList.getClass();
                return arrayList;
            case 3:
                C5877 c58775 = this.f14905;
                Class cls4 = this.f14904.f14769;
                C5381 c5381M105573 = c58775.m10557();
                if (c5381M105573 == null || !AbstractC5377.f13603.m1137(c5381M105573, AbstractC5377.f13608[14])) {
                    return null;
                }
                C5366 c53664 = c5381M105573.f13635;
                if (c53664 != null) {
                    ClassLoader classLoader = cls4.getClassLoader();
                    classLoader.getClass();
                    return AbstractC4765.m8849(c53664, classLoader, c58775.m10556(), null);
                }
                Object obj = null;
                for (Object obj2 : c5381M105573.f13629) {
                    C5368 c5368 = (C5368) obj2;
                    if (AbstractC5227.m9466(c5368.f13562, c5381M105573.f13636) && c5368.f13567.isEmpty() && c5368.f13558 == null) {
                        if (i != 0) {
                            C6755.m11869("Collection contains more than one matching element.");
                            return null;
                        }
                        obj = obj2;
                        i = 1;
                    }
                }
                if (i == 0) {
                    C5043.m9176("Collection contains no element matching the predicate.");
                    return null;
                }
                C5366 c53665 = ((C5368) obj).f13572;
                if (c53665 == null) {
                    AbstractC5227.m9467("returnType");
                    throw null;
                }
                ClassLoader classLoader2 = cls4.getClassLoader();
                classLoader2.getClass();
                return AbstractC4765.m8849(c53665, classLoader2, c58775.m10556(), null);
            case 4:
                C5877 c58776 = this.f14905;
                C5836 c58367 = this.f14904;
                boolean zM10555 = c58776.m10555();
                if (zM10555) {
                    C5906 c59062 = c58776.f14887;
                    InterfaceC5920[] interfaceC5920Arr3 = C5877.f14881;
                    InterfaceC5920 interfaceC59202 = interfaceC5920Arr3[14];
                    Object objInvoke2 = c59062.invoke();
                    objInvoke2.getClass();
                    C5906 c59063 = c58776.f14886;
                    InterfaceC5920 interfaceC59203 = interfaceC5920Arr3[15];
                    Object objInvoke3 = c59063.invoke();
                    objInvoke3.getClass();
                    return AbstractC5176.m9352((Collection) objInvoke3, (Collection) objInvoke2);
                }
                if (zM10555) {
                    C5043.m9170();
                    return null;
                }
                C2780 c2780 = AbstractC5889.f14943;
                C5773 c5773 = C5773.f14645;
                C5906 c59064 = ((C5877) c58367.f14770.getValue()).f14888;
                InterfaceC5920 interfaceC59204 = C5877.f14881[18];
                Object objInvoke4 = c59064.invoke();
                objInvoke4.getClass();
                C5891 c5891 = (C5891) objInvoke4;
                HashMap map2 = c5891.f14947;
                Object[] objArr = AbstractC3889.m7316(c58367).getAnnotation(Metadata.class) != null;
                Object[] objArr2 = c5891.f14946 && c58367.m10544() != ClassKind.ENUM_CLASS && objArr == true;
                i = (c5891.f14945 || objArr2 == true) ? 1 : 0;
                if (i == 1) {
                    int size = map2.size();
                    map = new HashMap(size >= 3 ? (size / 3) + size + 1 : 3);
                    for (Map.Entry entry : map2.entrySet()) {
                        AbstractC5856 abstractC5856 = (AbstractC5856) entry.getValue();
                        if (objArr2 == false || !AbstractC5889.m10563(abstractC5856)) {
                            if (!AbstractC5227.m9466(abstractC5856.mo10501().getVisibility(), AbstractC5449.f13863) || AbstractC5227.m9466(abstractC5856.mo10502().mo9438().getPackage(), AbstractC3889.m7316(c58367).getPackage())) {
                                map.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                } else {
                    if (i != 0) {
                        C5043.m9170();
                        return null;
                    }
                    map = new HashMap(map2);
                }
                HashMap map3 = new HashMap();
                for (AbstractC5856 abstractC58562 : AbstractC5889.m10565(c58367)) {
                    if (AbstractC5889.m10563(abstractC58562) && c58367.m10544() == ClassKind.INTERFACE && (!(abstractC58562 instanceof InterfaceC5920) || (fieldM10655 = AbstractC5913.m10655((InterfaceC5920) abstractC58562)) == null || (declaringClass = fieldM10655.getDeclaringClass()) == null || declaringClass.getAnnotation(Metadata.class) != null)) {
                        if (objArr == true) {
                            throw new IllegalStateException(("Kotlin doesn't have statics. '" + abstractC58562.getName() + "' appears to be declared static member in '" + c58367.getSimpleName() + '\'').toString());
                        }
                        map.put(AbstractC5889.m10568(abstractC58562, c5773), abstractC58562);
                    } else if (abstractC58562.getVisibility() == KVisibility.PRIVATE) {
                        if (objArr == true) {
                            map3.put(AbstractC5889.m10568(abstractC58562, C5887.f14941), abstractC58562);
                        } else {
                            map.put(AbstractC5889.m10568(abstractC58562, c5773), abstractC58562);
                        }
                    }
                }
                Collection collectionValues = map.values();
                collectionValues.getClass();
                return AbstractC5176.m9352(map3.values(), collectionValues);
            case 5:
                C5836 c58368 = this.f14904;
                C5877 c58777 = this.f14905;
                if (c58368.m10544() == ClassKind.INTERFACE || c58368.m10544() == ClassKind.OBJECT || c58368.m10544() == ClassKind.COMPANION_OBJECT || c58368.m10544() == ClassKind.ENUM_ENTRY) {
                    return EmptyList.INSTANCE;
                }
                if (AbstractC5905.f14967 || c58777.m10557() == null) {
                    Collection collectionMo10494 = c58368.mo10494();
                    ArrayList arrayList11 = new ArrayList(AbstractC5177.m9381(collectionMo10494, 10));
                    Iterator it4 = collectionMo10494.iterator();
                    while (it4.hasNext()) {
                        arrayList11.add(new C5858(c58368, (InterfaceC5327) it4.next()));
                    }
                    return arrayList11;
                }
                C5381 c5381M10541 = c58368.m10541();
                Iterable<C5362> iterable = c5381M10541 != null ? c5381M10541.f13641 : null;
                if (iterable == null) {
                    iterable = EmptyList.INSTANCE;
                }
                ArrayList arrayList12 = new ArrayList(AbstractC5177.m9381(iterable, 10));
                for (C5362 c5362 : iterable) {
                    c5362.getClass();
                    C5348 c5348 = AbstractC3888.m7273(c5362).f19295;
                    if (c5348 == null) {
                        throw new KotlinReflectionInternalError("No signature for constructor (" + c5362.f13543.size() + " parameters, declared in " + c58368 + ')');
                    }
                    arrayList12.add(new C5838(c58368, c5348.toString(), CallableReference.NO_RECEIVER, c5362));
                }
                return arrayList12;
            case 6:
                C5877 c58778 = this.f14905;
                Class cls5 = this.f14904.f14769;
                C5381 c5381M105574 = c58778.m10557();
                if (c5381M105574 != null) {
                    String str3 = c5381M105574.f13633;
                    if (str3 == null) {
                        AbstractC5227.m9467("name");
                        throw null;
                    }
                    C5520 c5520M88502 = AbstractC4765.m8850(str3);
                    ClassLoader classLoaderM95332 = AbstractC5263.m9533(cls5);
                    ArrayList arrayList13 = c5381M105574.f13645;
                    arrayList2 = new ArrayList();
                    Iterator it5 = arrayList13.iterator();
                    while (it5.hasNext()) {
                        Class clsM106342 = AbstractC5899.m10634(classLoaderM95332, c5520M88502.m9884(C5523.m9889((String) it5.next())), 0);
                        InterfaceC5925 interfaceC5925Mo94762 = clsM106342 != null ? AbstractC5228.f13320.mo9476(clsM106342) : null;
                        if (interfaceC5925Mo94762 != null) {
                            arrayList2.add(interfaceC5925Mo94762);
                        }
                    }
                } else {
                    Class<?>[] declaredClasses = cls5.getDeclaredClasses();
                    declaredClasses.getClass();
                    arrayList2 = new ArrayList();
                    int length2 = declaredClasses.length;
                    while (i < length2) {
                        Class<?> cls6 = declaredClasses[i];
                        cls6.getClass();
                        arrayList2.add(AbstractC5228.f13320.mo9476(cls6));
                        i++;
                    }
                }
                return arrayList2;
            case 7:
                C5877 c58779 = this.f14905;
                Class cls7 = this.f14904.f14769;
                C5381 c5381M105575 = c58779.m10557();
                if (c5381M105575 == null) {
                    return null;
                }
                if (AbstractC5377.m9692(c5381M105575) != ClassKind.OBJECT && AbstractC5377.m9692(c5381M105575) != ClassKind.COMPANION_OBJECT) {
                    return null;
                }
                if (AbstractC5377.m9692(c5381M105575) == ClassKind.COMPANION_OBJECT) {
                    LinkedHashSet linkedHashSet = AbstractC7351.f18176;
                    String str4 = c5381M105575.f13633;
                    if (str4 == null) {
                        AbstractC5227.m9467("name");
                        throw null;
                    }
                    if (AbstractC5176.m9365(linkedHashSet, AbstractC4765.m8850(str4).m9883())) {
                        declaredField = cls7.getDeclaredField("INSTANCE");
                    } else {
                        Class<?> enclosingClass = cls7.getEnclosingClass();
                        String str5 = c5381M105575.f13633;
                        if (str5 == null) {
                            AbstractC5227.m9467("name");
                            throw null;
                        }
                        if (AbstractC5971.m10698(str5, ".", false)) {
                            C6755.m11873("Local class is not supported: ".concat(str5));
                            return null;
                        }
                        declaredField = enclosingClass.getDeclaredField(AbstractC5976.m10701(AbstractC5976.m10701(str5, '/'), TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                    }
                }
                Object obj3 = declaredField.get(null);
                obj3.getClass();
                return obj3;
            case 8:
                C5877 c587710 = this.f14905;
                C5836 c58369 = this.f14904;
                if (AbstractC5905.f14967) {
                    List<InterfaceC5295> listMo9574 = c587710.m10558().mo9574();
                    listMo9574.getClass();
                    ArrayList arrayList14 = new ArrayList(AbstractC5177.m9381(listMo9574, 10));
                    for (InterfaceC5295 interfaceC5295 : listMo9574) {
                        interfaceC5295.getClass();
                        arrayList14.add(new C5821(c58369, interfaceC5295));
                    }
                    return arrayList14;
                }
                if (c587710.m10557() != null) {
                    return c587710.m10556().f14958;
                }
                TypeVariable[] typeParameters = c58369.f14769.getTypeParameters();
                typeParameters.getClass();
                int iM9331 = AbstractC5171.m9331(typeParameters.length);
                if (iM9331 < 16) {
                    iM9331 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
                for (TypeVariable typeVariable : typeParameters) {
                    C5836 c5836M7388 = AbstractC3897.m7388(typeVariable);
                    String name = typeVariable.getName();
                    name.getClass();
                    linkedHashMap.put(typeVariable, new C5821(c5836M7388, name, KVariance.INVARIANT));
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    TypeVariable typeVariable2 = (TypeVariable) entry2.getKey();
                    C5821 c5821 = (C5821) entry2.getValue();
                    Type[] bounds = typeVariable2.getBounds();
                    bounds.getClass();
                    ArrayList arrayList15 = new ArrayList(bounds.length);
                    for (Type type2 : bounds) {
                        type2.getClass();
                        arrayList15.add(AbstractC3897.m7363(type2, linkedHashMap, null, false, 6));
                    }
                    c5821.getClass();
                    c5821.f14741 = arrayList15;
                }
                return AbstractC5176.m9356(linkedHashMap.values());
            default:
                C5877 c587711 = this.f14905;
                C5836 c583610 = this.f14904;
                Class cls8 = c583610.f14769;
                if (c587711.m10557() == null) {
                    return C5902.f14955;
                }
                C5902 c5902 = C5902.f14955;
                C5381 c5381M105576 = c587711.m10557();
                c5381M105576.getClass();
                ArrayList arrayList16 = c5381M105576.f13632;
                Class<?> enclosingClass2 = cls8.getEnclosingClass();
                if (enclosingClass2 != null) {
                    C5381 c5381M105577 = c587711.m10557();
                    c5381M105577.getClass();
                    if (!AbstractC5377.f13604.m1137(c5381M105577, AbstractC5377.f13608[10])) {
                        enclosingClass2 = null;
                    }
                    interfaceC5925Mo9476 = enclosingClass2 != null ? AbstractC5228.f13320.mo9476(enclosingClass2) : null;
                }
                C5836 c583611 = interfaceC5925Mo9476 instanceof C5836 ? (C5836) interfaceC5925Mo9476 : null;
                if (c583611 != null && (interfaceC6016 = c583611.f14770) != null && (c5877 = (C5877) interfaceC6016.getValue()) != null) {
                    c5902M10556 = c5877.m10556();
                }
                return AbstractC3400.m5654(arrayList16, c5902M10556, c583610, AbstractC5263.m9533(cls8));
        }
    }

    public /* synthetic */ C5878(C5836 c5836, C5877 c5877, int i) {
        this.f14906 = i;
        this.f14904 = c5836;
        this.f14905 = c5877;
    }
}
