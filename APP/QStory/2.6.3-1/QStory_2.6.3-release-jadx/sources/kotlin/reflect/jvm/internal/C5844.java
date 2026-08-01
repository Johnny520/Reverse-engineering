package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0954;
import androidx.appcompat.app.C0955;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
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
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5247;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5483;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5628;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.reflect.jvm.internal.types.C5759;
import kotlin.text.AbstractC5971;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p081.C7697;
import p086.C7727;
import p088.C7752;
import p093.C7796;
import p093.C7799;
import p093.C7800;
import p117.C8084;
import p117.InterfaceC8083;
import p191.AbstractC8568;
import p267.AbstractC9004;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5844 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14785;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14786;

    public /* synthetic */ C5844(Object obj, int i) {
        this.f14786 = i;
        this.f14785 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Iterable] */
    @Override // p068.InterfaceC7372
    public final Object invoke() {
        ?? M12487;
        C0954 c0954;
        String property;
        List listM9405;
        int i = this.f14786;
        int length = 0;
        Iterable iterableAsList = null;
        Object obj = this.f14785;
        switch (i) {
            case 0:
                return (Class) obj;
            case 1:
                Object obj2 = ((Ref$ObjectRef) obj).element;
                if (obj2 != null) {
                    return (C5759) obj2;
                }
                AbstractC5227.m9467("result");
                throw null;
            case 2:
                C5906 c5906 = ((AbstractC5758) obj).f14608;
                Type type = c5906 != null ? (Type) c5906.invoke() : null;
                type.getClass();
                return AbstractC5263.m9534(type);
            case 3:
                return new C5859((C5851) obj);
            case 4:
                return new C5850((C5854) obj);
            case 5:
                return new C5855((C5852) obj);
            case 6:
                return new C5853((C5789) obj);
            case 7:
                return new C5777((C5776) obj);
            case 8:
                C5825 c5825 = (C5825) obj;
                C5906 c59062 = c5825.f14754;
                InterfaceC5920 interfaceC5920 = C5825.f14751[0];
                C7799 c7799 = (C7799) c59062.invoke();
                if (c7799 == null) {
                    return C8084.f19681;
                }
                C5906 c59063 = c5825.f14766;
                InterfaceC5920 interfaceC59202 = AbstractC5834.f14765[0];
                Object objInvoke = c59063.invoke();
                objInvoke.getClass();
                C0955 c0955 = ((C7796) objInvoke).f19000;
                C5483 c5483 = (C5483) c0955.f664;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0955.f663;
                Class cls = c7799.f19006;
                C5520 c5520M9536 = AbstractC5263.m9536(cls);
                Object obj3 = concurrentHashMap.get(c5520M9536);
                if (obj3 == null) {
                    C5519 c5519 = AbstractC5263.m9536(cls).f14044;
                    C7752 c7752 = c7799.f19005;
                    KotlinClassHeader$Kind kotlinClassHeader$Kind = c7752.f18818;
                    KotlinClassHeader$Kind kotlinClassHeader$Kind2 = KotlinClassHeader$Kind.MULTIFILE_CLASS;
                    if (kotlinClassHeader$Kind == kotlinClassHeader$Kind2) {
                        String[] strArr = c7752.f18816;
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
                        M12487 = new ArrayList();
                        Iterator it = iterableAsList.iterator();
                        while (it.hasNext()) {
                            C5519 c55192 = new C5519(C7697.m12648((String) it.next()).f18655.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                            C5520 c5520 = new C5520(c55192.m9879(), c55192.f14041.m9877());
                            C7800 c7800 = (C7800) c0955.f665;
                            c5483.m9815().f14435.getClass();
                            C7799 c7799M7314 = AbstractC3889.m7314(c7800, c5520, C7727.f18701);
                            if (c7799M7314 != null) {
                                M12487.add(c7799M7314);
                            }
                        }
                    } else {
                        M12487 = AbstractC7176.m12487(c7799);
                    }
                    C5247 c5247 = new C5247(c5483.m9815().f14436, c5519, 1);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = M12487.iterator();
                    while (it2.hasNext()) {
                        C5628 c5628M9817 = c5483.m9817(c5247, (C7799) it2.next());
                        if (c5628M9817 != null) {
                            arrayList.add(c5628M9817);
                        }
                    }
                    InterfaceC8083 interfaceC8083M7282 = AbstractC3888.m7282("package " + c5519 + " (" + c7799 + ')', AbstractC5176.m9356(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c5520M9536, interfaceC8083M7282);
                    obj3 = objPutIfAbsent == null ? interfaceC8083M7282 : objPutIfAbsent;
                }
                obj3.getClass();
                return (InterfaceC8083) obj3;
            case 9:
                return new C5828((C5829) obj);
            case 10:
                return new C5826((C5827) obj);
            case 11:
                return new C5831((C5830) obj);
            case 12:
                C5808 c5808 = (C5808) obj;
                Type typeM14201 = AbstractC9004.m14201(c5808);
                return typeM14201 == null ? c5808.mo10500().getReturnType() : typeM14201;
            case 13:
                C5812 c5812 = (C5812) obj;
                AbstractC5839 abstractC5839 = c5812.f14719;
                if ((abstractC5839.mo10502() instanceof C5824) || AbstractC5894.m10599(abstractC5839)) {
                    return (Type) abstractC5839.mo10500().getParameterTypes().get(c5812.f14718);
                }
                C6385.m11431(abstractC5839, "Only constructors and top-level callables are supported for now: ");
                return null;
            case 14:
                return AbstractC8568.m13645((AbstractC5811) obj, true);
            case 15:
                return new C5817((C5816) obj);
            default:
                AbstractC5892 abstractC5892 = (AbstractC5892) obj;
                Member memberMo12555 = abstractC5892.mo10514().mo10500().mo12555();
                if (memberMo12555 instanceof Method) {
                    if (!Modifier.isStatic(((Method) memberMo12555).getModifiers())) {
                        C6385.m11431(memberMo12555, "Only static methods are supported for now: ");
                        return null;
                    }
                    c0954 = new C0954((Executable) memberMo12555, abstractC5892.getIndex(), 5);
                } else {
                    if (!(memberMo12555 instanceof Constructor)) {
                        C5043.m9154(memberMo12555, "Unsupported parameter owner: ");
                        return null;
                    }
                    Constructor constructor = (Constructor) memberMo12555;
                    Class declaringClass = constructor.getDeclaringClass();
                    declaringClass.getClass();
                    if (AbstractC5228.f13320.mo9476(declaringClass).mo9441() && (property = System.getProperty(ClassFileVersion.VersionLocator.JAVA_VERSION)) != null && AbstractC5971.m10698(property, "1.", false)) {
                        length = -1;
                    } else if (constructor.getDeclaringClass().isEnum()) {
                        length = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                    }
                    c0954 = new C0954((Executable) memberMo12555, abstractC5892.getIndex() + length, 5);
                }
                int i2 = c0954.f659;
                Executable executable = (Executable) c0954.f660;
                if (executable instanceof Method) {
                    Annotation[] annotationArr = ((Method) executable).getParameterAnnotations()[i2];
                    annotationArr.getClass();
                    listM9405 = AbstractC5179.m9405(annotationArr);
                } else if (executable instanceof Constructor) {
                    Annotation[] annotationArr2 = ((Constructor) executable).getParameterAnnotations()[i2];
                    annotationArr2.getClass();
                    listM9405 = AbstractC5179.m9405(annotationArr2);
                } else {
                    listM9405 = EmptyList.INSTANCE;
                }
                return AbstractC5899.m10625(listM9405);
        }
    }
}
