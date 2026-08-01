package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0107;
import androidx.appcompat.app.C0108;
import com.alibaba.fastjson2.AbstractC2904;
import io.ktor.util.C4210;
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
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4414;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4650;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4795;
import kotlin.reflect.jvm.internal.types.AbstractC4925;
import kotlin.reflect.jvm.internal.types.C4926;
import kotlin.text.AbstractC5138;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6542;
import p065.C6867;
import p070.C6897;
import p072.C6922;
import p077.C6966;
import p077.C6969;
import p077.C6970;
import p101.C7254;
import p101.InterfaceC7253;
import p253.AbstractC8189;
import p316.C8675;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5011 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14438;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14439;

    public /* synthetic */ C5011(Object obj, int i) {
        this.f14439 = i;
        this.f14438 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Iterable] */
    @Override // p052.InterfaceC6542
    public final Object invoke() {
        ?? M13660;
        C0107 c0107;
        String property;
        List listM8850;
        int i = this.f14439;
        int length = 0;
        Iterable iterableAsList = null;
        Object obj = this.f14438;
        switch (i) {
            case 0:
                return (Class) obj;
            case 1:
                Object obj2 = ((Ref$ObjectRef) obj).element;
                if (obj2 != null) {
                    return (C4926) obj2;
                }
                AbstractC4394.m8918("result");
                throw null;
            case 2:
                C5073 c5073 = ((AbstractC4925) obj).f14261;
                Type type = c5073 != null ? (Type) c5073.invoke() : null;
                type.getClass();
                return AbstractC4430.m8985(type);
            case 3:
                return new C5026((C5018) obj);
            case 4:
                return new C5017((C5021) obj);
            case 5:
                return new C5022((C5019) obj);
            case 6:
                return new C5020((C4956) obj);
            case 7:
                return new C4944((C4943) obj);
            case 8:
                C4992 c4992 = (C4992) obj;
                C5073 c50732 = c4992.f14407;
                InterfaceC5087 interfaceC5087 = C4992.f14404[0];
                C6969 c6969 = (C6969) c50732.invoke();
                if (c6969 == null) {
                    return C7254.f19341;
                }
                C5073 c50733 = c4992.f14419;
                InterfaceC5087 interfaceC50872 = AbstractC5001.f14418[0];
                Object objInvoke = c50733.invoke();
                objInvoke.getClass();
                C0108 c0108 = ((C6966) objInvoke).f18660;
                C4650 c4650 = (C4650) c0108.f319;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0108.f318;
                Class cls = c6969.f18666;
                C4687 c4687M8987 = AbstractC4430.m8987(cls);
                Object obj3 = concurrentHashMap.get(c4687M8987);
                if (obj3 == null) {
                    C4686 c4686 = AbstractC4430.m8987(cls).f13695;
                    C6922 c6922 = c6969.f18665;
                    KotlinClassHeader$Kind kotlinClassHeader$Kind = c6922.f18478;
                    KotlinClassHeader$Kind kotlinClassHeader$Kind2 = KotlinClassHeader$Kind.MULTIFILE_CLASS;
                    if (kotlinClassHeader$Kind == kotlinClassHeader$Kind2) {
                        String[] strArr = c6922.f18476;
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
                        M13660 = new ArrayList();
                        Iterator it = iterableAsList.iterator();
                        while (it.hasNext()) {
                            C4686 c46862 = new C4686(C6867.m12061((String) it.next()).f18315.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                            C4687 c4687 = new C4687(c46862.m9330(), c46862.f13692.m9328());
                            C6970 c6970 = (C6970) c0108.f320;
                            c4650.m9266().f14086.getClass();
                            C6969 c6969M10040 = AbstractC5061.m10040(c6970, c4687, C6897.f18361);
                            if (c6969M10040 != null) {
                                M13660.add(c6969M10040);
                            }
                        }
                    } else {
                        M13660 = AbstractC8189.m13660(c6969);
                    }
                    C4414 c4414 = new C4414(c4650.m9266().f14087, c4686, 1);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = M13660.iterator();
                    while (it2.hasNext()) {
                        C4795 c4795M9268 = c4650.m9268(c4414, (C6969) it2.next());
                        if (c4795M9268 != null) {
                            arrayList.add(c4795M9268);
                        }
                    }
                    InterfaceC7253 interfaceC7253M13667 = AbstractC8189.m13667("package " + c4686 + " (" + c6969 + ')', AbstractC4343.m8804(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(c4687M8987, interfaceC7253M13667);
                    obj3 = objPutIfAbsent == null ? interfaceC7253M13667 : objPutIfAbsent;
                }
                obj3.getClass();
                return (InterfaceC7253) obj3;
            case 9:
                return new C4995((C4996) obj);
            case 10:
                return new C4993((C4994) obj);
            case 11:
                return new C4998((C4997) obj);
            case 12:
                C4975 c4975 = (C4975) obj;
                Type typeM6268 = AbstractC2904.m6268(c4975);
                return typeM6268 == null ? c4975.mo9944().getReturnType() : typeM6268;
            case 13:
                C4979 c4979 = (C4979) obj;
                AbstractC5006 abstractC5006 = c4979.f14372;
                if ((abstractC5006.mo9946() instanceof C4991) || AbstractC5061.m10027(abstractC5006)) {
                    return (Type) abstractC5006.mo9944().getParameterTypes().get(c4979.f14371);
                }
                C5553.m10815(abstractC5006, "Only constructors and top-level callables are supported for now: ");
                return null;
            case 14:
                return C8675.m14366((AbstractC4978) obj, true);
            case 15:
                return new C4984((C4983) obj);
            default:
                AbstractC5059 abstractC5059 = (AbstractC5059) obj;
                Member memberMo11953 = abstractC5059.mo9958().mo9944().mo11953();
                if (memberMo11953 instanceof Method) {
                    if (!Modifier.isStatic(((Method) memberMo11953).getModifiers())) {
                        C5553.m10815(memberMo11953, "Only static methods are supported for now: ");
                        return null;
                    }
                    c0107 = new C0107((Executable) memberMo11953, abstractC5059.getIndex(), 5);
                } else {
                    if (!(memberMo11953 instanceof Constructor)) {
                        C4210.m8605(memberMo11953, "Unsupported parameter owner: ");
                        return null;
                    }
                    Constructor constructor = (Constructor) memberMo11953;
                    Class declaringClass = constructor.getDeclaringClass();
                    declaringClass.getClass();
                    if (AbstractC4395.f12971.mo8927(declaringClass).mo8892() && (property = System.getProperty(ClassFileVersion.VersionLocator.JAVA_VERSION)) != null && AbstractC5138.m10125(property, "1.", false)) {
                        length = -1;
                    } else if (constructor.getDeclaringClass().isEnum()) {
                        length = (constructor.getParameterAnnotations().length - constructor.getParameterTypes().length) + 2;
                    }
                    c0107 = new C0107((Executable) memberMo11953, abstractC5059.getIndex() + length, 5);
                }
                int i2 = c0107.f314;
                Executable executable = (Executable) c0107.f315;
                if (executable instanceof Method) {
                    Annotation[] annotationArr = ((Method) executable).getParameterAnnotations()[i2];
                    annotationArr.getClass();
                    listM8850 = AbstractC4346.m8850(annotationArr);
                } else if (executable instanceof Constructor) {
                    Annotation[] annotationArr2 = ((Constructor) executable).getParameterAnnotations()[i2];
                    annotationArr2.getClass();
                    listM8850 = AbstractC4346.m8850(annotationArr2);
                } else {
                    listM8850 = EmptyList.INSTANCE;
                }
                return AbstractC5066.m10062(listM8850);
        }
    }
}
