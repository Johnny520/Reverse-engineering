package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0107;
import androidx.appcompat.app.C0108;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4211;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4415;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4796;
import kotlin.reflect.jvm.internal.types.AbstractC4926;
import kotlin.reflect.jvm.internal.types.C4927;
import kotlin.text.AbstractC5139;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p065.C6868;
import p070.C6898;
import p072.C6923;
import p077.C6967;
import p077.C6970;
import p077.C6971;
import p101.C7255;
import p101.InterfaceC7254;
import p175.AbstractC7739;
import p251.AbstractC8175;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5012 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14440;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14441;

    public /* synthetic */ C5012(Object obj, int i) {
        this.f14441 = i;
        this.f14440 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Iterable] */
    @Override // p052.InterfaceC6543
    public final Object invoke() {
        ?? M11928;
        C0107 c0107;
        String property;
        List listM8846;
        int i = this.f14441;
        int length = 0;
        Iterable iterableAsList = null;
        Object obj = this.f14440;
        switch (i) {
            case 0:
                return (Class) obj;
            case 1:
                Object obj2 = ((Ref$ObjectRef) obj).element;
                if (obj2 != null) {
                    return (C4927) obj2;
                }
                AbstractC4395.m8908("result");
                throw null;
            case 2:
                C5074 c5074 = ((AbstractC4926) obj).f14263;
                Type type = c5074 != null ? (Type) c5074.invoke() : null;
                type.getClass();
                return AbstractC4431.m8975(type);
            case 3:
                return new C5027((C5019) obj);
            case 4:
                return new C5018((C5022) obj);
            case 5:
                return new C5023((C5020) obj);
            case 6:
                return new C5021((C4957) obj);
            case 7:
                return new C4945((C4944) obj);
            case 8:
                C4993 c4993 = (C4993) obj;
                C5074 c50742 = c4993.f14409;
                InterfaceC5088 interfaceC5088 = C4993.f14406[0];
                C6970 c6970 = (C6970) c50742.invoke();
                if (c6970 == null) {
                    return C7255.f19336;
                }
                C5074 c50743 = c4993.f14421;
                InterfaceC5088 interfaceC50882 = AbstractC5002.f14420[0];
                Object objInvoke = c50743.invoke();
                objInvoke.getClass();
                C0108 c0108 = ((C6967) objInvoke).f18655;
                C4651 c4651 = (C4651) c0108.f319;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0108.f318;
                Class cls = c6970.f18661;
                C4688 c4688M8977 = AbstractC4431.m8977(cls);
                Object obj3 = concurrentHashMap.get(c4688M8977);
                if (obj3 == null) {
                    C4687 c4687 = AbstractC4431.m8977(cls).f13699;
                    C6923 c6923 = c6970.f18660;
                    KotlinClassHeader$Kind kotlinClassHeader$Kind = c6923.f18473;
                    KotlinClassHeader$Kind kotlinClassHeader$Kind2 = KotlinClassHeader$Kind.MULTIFILE_CLASS;
                    if (kotlinClassHeader$Kind == kotlinClassHeader$Kind2) {
                        String[] strArr = c6923.f18471;
                        if (kotlinClassHeader$Kind != kotlinClassHeader$Kind2) {
                            strArr = null;
                        }
                        if (strArr != null) {
                            iterableAsList = Arrays.asList(strArr);
                            iterableAsList.getClass();
                        }
                        if (iterableAsList == null) {
                            iterableAsList = EmptyList.INSTANCE;
                        }
                        M11928 = new ArrayList();
                        Iterator it = iterableAsList.iterator();
                        while (it.hasNext()) {
                            C4687 c46872 = new C4687(C6868.m12089((String) it.next()).f18310.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                            C4688 c4688 = new C4688(c46872.m9320(), c46872.f13696.m9318());
                            C6971 c6971 = (C6971) c0108.f320;
                            c4651.m9256().f14090.getClass();
                            C6970 c6970M6754 = AbstractC3057.m6754(c6971, c4688, C6898.f18356);
                            if (c6970M6754 != null) {
                                M11928.add(c6970M6754);
                            }
                        }
                    } else {
                        M11928 = AbstractC6347.m11928(c6970);
                    }
                    C4415 c4415 = new C4415(c4651.m9256().f14091, c4687, 1);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = M11928.iterator();
                    while (it2.hasNext()) {
                        C4796 c4796M9258 = c4651.m9258(c4415, (C6970) it2.next());
                        if (c4796M9258 != null) {
                            arrayList.add(c4796M9258);
                        }
                    }
                    InterfaceC7254 interfaceC7254M6722 = AbstractC3056.m6722("package " + c4687 + " (" + c6970 + ')', AbstractC4344.m8797(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c4688M8977, interfaceC7254M6722);
                    obj3 = objPutIfAbsent == null ? interfaceC7254M6722 : objPutIfAbsent;
                }
                obj3.getClass();
                return (InterfaceC7254) obj3;
            case 9:
                return new C4996((C4997) obj);
            case 10:
                return new C4994((C4995) obj);
            case 11:
                return new C4999((C4998) obj);
            case 12:
                C4976 c4976 = (C4976) obj;
                Type typeM13642 = AbstractC8175.m13642(c4976);
                return typeM13642 == null ? c4976.mo9941().getReturnType() : typeM13642;
            case 13:
                C4980 c4980 = (C4980) obj;
                AbstractC5007 abstractC5007 = c4980.f14374;
                if ((abstractC5007.mo9943() instanceof C4992) || AbstractC5062.m10040(abstractC5007)) {
                    return (Type) abstractC5007.mo9941().getParameterTypes().get(c4980.f14373);
                }
                C5554.m10872(abstractC5007, "Only constructors and top-level callables are supported for now: ");
                return null;
            case 14:
                return AbstractC7739.m13086((AbstractC4979) obj, true);
            case 15:
                return new C4985((C4984) obj);
            default:
                AbstractC5060 abstractC5060 = (AbstractC5060) obj;
                Member memberMo11996 = abstractC5060.mo9955().mo9941().mo11996();
                if (memberMo11996 instanceof Method) {
                    if (!Modifier.isStatic(((Method) memberMo11996).getModifiers())) {
                        C5554.m10872(memberMo11996, "Only static methods are supported for now: ");
                        return null;
                    }
                    c0107 = new C0107((Executable) memberMo11996, abstractC5060.getIndex(), 5);
                } else {
                    if (!(memberMo11996 instanceof Constructor)) {
                        C4211.m8595(memberMo11996, "Unsupported parameter owner: ");
                        return null;
                    }
                    Constructor constructor = (Constructor) memberMo11996;
                    Class declaringClass = constructor.getDeclaringClass();
                    declaringClass.getClass();
                    if (AbstractC4396.f12975.mo8917(declaringClass).mo8882() && (property = System.getProperty(ClassFileVersion.VersionLocator.JAVA_VERSION)) != null && AbstractC5139.m10139(property, "1.", false)) {
                        length = -1;
                    } else if (constructor.getDeclaringClass().isEnum()) {
                        length = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                    }
                    c0107 = new C0107((Executable) memberMo11996, abstractC5060.getIndex() + length, 5);
                }
                int i2 = c0107.f314;
                Executable executable = (Executable) c0107.f315;
                if (executable instanceof Method) {
                    Annotation[] annotationArr = ((Method) executable).getParameterAnnotations()[i2];
                    annotationArr.getClass();
                    listM8846 = AbstractC4347.m8846(annotationArr);
                } else if (executable instanceof Constructor) {
                    Annotation[] annotationArr2 = ((Constructor) executable).getParameterAnnotations()[i2];
                    annotationArr2.getClass();
                    listM8846 = AbstractC4347.m8846(annotationArr2);
                } else {
                    listM8846 = EmptyList.INSTANCE;
                }
                return AbstractC5067.m10066(listM8846);
        }
    }
}
