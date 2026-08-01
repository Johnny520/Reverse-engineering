package androidx.compose.foundation.lazy;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.collection.C1093;
import androidx.compose.foundation.gestures.C1365;
import androidx.compose.foundation.lazy.layout.C1519;
import androidx.compose.foundation.lazy.layout.C1531;
import androidx.compose.foundation.relocation.C1611;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.runtime.AbstractC2140;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2069;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.AbstractC2081;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.C2080;
import androidx.compose.runtime.tooling.C2129;
import androidx.compose.runtime.tooling.C2131;
import com.bumptech.glide.AbstractC3889;
import com.google.protobuf.C4515;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.server.application.C4890;
import io.ktor.server.engine.C4934;
import io.ktor.server.engine.internal.ReloadingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.AbstractC5913;
import kotlin.reflect.jvm.AbstractC5914;
import kotlin.reflect.jvm.internal.AbstractC5899;
import kotlin.reflect.jvm.internal.C5824;
import kotlin.reflect.jvm.internal.C5825;
import kotlin.reflect.jvm.internal.C5906;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p023.C6964;
import p023.C6968;
import p023.C6979;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p064.C7348;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p093.C7799;
import p128.C8157;
import p142.C8269;
import p142.C8270;
import p142.InterfaceC8259;
import p191.AbstractC8568;
import p192.AbstractC8570;
import p209.C8657;
import p221.C8735;
import p268.AbstractC9016;
import p269.AbstractC9019;
import p366.C9684;
import p366.C9686;
import p371.C9719;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1596 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f2537;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2538;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2539;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2540;

    public /* synthetic */ C1596(C2159 c2159, C8270 c8270, C2069 c2069, AbstractC2140 abstractC2140) {
        this.f2540 = 2;
        this.f2538 = c2159;
        this.f2539 = c8270;
        this.f2537 = c2069;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0255  */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        Method methodM10654;
        int iLastIndexOf;
        Class<?> clsLoadClass;
        InterfaceC5942 interfaceC5942M10656;
        C5824 c5824;
        Object next;
        Method declaredMethod;
        InterfaceC5942 interfaceC5942M106562;
        int i2 = this.f2540;
        C6008 c6008 = C6008.f15084;
        Object obj = this.f2537;
        Object obj2 = this.f2539;
        Object obj3 = this.f2538;
        switch (i2) {
            case 0:
                C1582 c1582 = (C1582) obj2;
                C1601 c1601 = (C1601) ((C2197) obj3).getValue();
                return new C1603(c1582, c1601, (C1586) obj, new C1519((C7348) ((C1531) c1582.f2450.f2497).getValue(), c1601));
            case 1:
                C1611 c1611 = (C1611) obj3;
                C8157 c8157M2134 = C1611.m2134(c1611, (AbstractC2629) obj2, (InterfaceC7372) obj);
                if (c8157M2134 == null) {
                    return null;
                }
                C1365 c1365 = c1611.f2586;
                if (C8735.m13916(c1365.f1883, -1L)) {
                    AbstractC8570.m13654("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c8157M2134.m13083(c1365.m1878(c8157M2134, c1365.m1880(), 0L) ^ (-9223372034707292160L));
            case 2:
                C2159 c2159 = (C2159) obj3;
                C8270 c8270 = (C8270) obj2;
                C2069 c2069 = (C2069) obj;
                C8269 c8269 = c2159.f4189;
                C8270 c82702 = c8269.f20489;
                try {
                    c8269.f20489 = c8270;
                    C2069 c20692 = c2159.f4199;
                    int[] iArr = c2159.f4218;
                    C1093 c1093 = c2159.f4213;
                    c2159.f4218 = null;
                    c2159.f4213 = null;
                    try {
                        c2159.f4199 = c2069;
                        boolean z = c8269.f20486;
                        try {
                            c8269.f20486 = false;
                            c2159.m2909(null, null);
                            return c6008;
                        } finally {
                            c8269.f20486 = z;
                        }
                    } finally {
                        c2159.f4199 = c20692;
                        c2159.f4218 = iArr;
                        c2159.f4213 = c1093;
                    }
                } finally {
                    c8269.f20489 = c82702;
                }
            case 3:
                ((AbstractC2081) obj3).mo2730();
                AtomicInt atomicInt = (AtomicInt) ((C2080) obj2).f3963;
                int i3 = ((Ref$IntRef) obj).element;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return c6008;
            case 4:
                C4934 c4934 = (C4934) obj3;
                ClassLoader classLoader = (ClassLoader) obj2;
                C4890 c4890 = (C4890) obj;
                Iterator it = c4934.f12809.iterator();
                while (it.hasNext()) {
                    C4934.m9061((String) it.next(), classLoader, c4890);
                }
                for (InterfaceC7387 interfaceC7387 : c4934.f12802.f12696) {
                    interfaceC7387.getClass();
                    InterfaceC5942 interfaceC5942 = interfaceC7387 instanceof InterfaceC5942 ? (InterfaceC5942) interfaceC7387 : null;
                    try {
                        C4934.m9061((interfaceC5942 == null || (methodM10654 = AbstractC5913.m10654(interfaceC5942)) == null) ? interfaceC7387.getClass().getName().concat(".invoke") : methodM10654.getDeclaringClass().getName() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + methodM10654.getName(), classLoader, c4890);
                    } catch (ReloadingException unused) {
                        interfaceC7387.invoke(c4890);
                    }
                }
                return c6008;
            case 5:
                ClassLoader classLoader2 = (ClassLoader) obj3;
                String str = (String) obj2;
                C4890 c48902 = (C4890) obj;
                classLoader2.getClass();
                str.getClass();
                int i4 = 2;
                char[] cArr = {TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '#'};
                int iM10717 = AbstractC5976.m10717(str);
                str.getClass();
                if (cArr.length == 1 && (str instanceof String)) {
                    iLastIndexOf = str.lastIndexOf(AbstractC5179.m9409(cArr), iM10717);
                } else {
                    int length = str.length() - 1;
                    if (iM10717 > length) {
                        iM10717 = length;
                    }
                    while (true) {
                        if (-1 < iM10717) {
                            char cCharAt = str.charAt(iM10717);
                            for (char c : cArr) {
                                if (AbstractC8568.m13637(c, cCharAt, false)) {
                                    iLastIndexOf = iM10717;
                                }
                            }
                            iM10717--;
                        } else {
                            iLastIndexOf = -1;
                        }
                    }
                }
                if (iLastIndexOf == -1) {
                    throw new ReloadingException(AbstractC7012.m12149('\'', "Module function cannot be found for the fully qualified name '", str));
                }
                String strSubstring = str.substring(0, iLastIndexOf);
                String strSubstring2 = str.substring(iLastIndexOf + 1);
                ThreadLocal threadLocal = AbstractC9016.f22905;
                try {
                    clsLoadClass = classLoader2.loadClass(strSubstring);
                    break;
                } catch (ClassNotFoundException unused2) {
                    clsLoadClass = null;
                }
                if (clsLoadClass == null) {
                    throw new ReloadingException(AbstractC7012.m12149('\'', "Module function cannot be found for the fully qualified name '", str));
                }
                Method[] methods = clsLoadClass.getMethods();
                methods.getClass();
                ArrayList<Method> arrayList = new ArrayList();
                for (Method method : methods) {
                    if (AbstractC5227.m9466(method.getName(), strSubstring2) && Modifier.isStatic(method.getModifiers())) {
                        arrayList.add(method);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Method method2 : arrayList) {
                    method2.getClass();
                    if (Modifier.isStatic(method2.getModifiers())) {
                        Class<?> declaringClass = method2.getDeclaringClass();
                        declaringClass.getClass();
                        C7799 c7799M14244 = AbstractC9019.m14244(declaringClass);
                        KotlinClassHeader$Kind kotlinClassHeader$Kind = c7799M14244 != null ? c7799M14244.f19005.f18818 : null;
                        int i5 = kotlinClassHeader$Kind == null ? -1 : AbstractC5914.f14976[kotlinClassHeader$Kind.ordinal()];
                        if (i5 == 1 || i5 == i4 || i5 == 3) {
                            Class<?> declaringClass2 = method2.getDeclaringClass();
                            declaringClass2.getClass();
                            c5824 = new C5824(declaringClass2);
                        } else {
                            c5824 = null;
                        }
                        if (c5824 != null) {
                            C5906 c5906 = ((C5825) c5824.f14750.getValue()).f14756;
                            InterfaceC5920 interfaceC5920 = C5825.f14751[i4];
                            Object objInvoke = c5906.invoke();
                            objInvoke.getClass();
                            interfaceC5942M10656 = AbstractC5913.m10656((Collection) objInvoke, method2);
                        } else {
                            Class<?> declaringClass3 = method2.getDeclaringClass();
                            declaringClass3.getClass();
                            Iterator it2 = AbstractC5228.f13320.mo9476(declaringClass3).mo9445().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (((InterfaceC5925) next).mo9436()) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            InterfaceC5925 interfaceC5925 = (InterfaceC5925) next;
                            if (interfaceC5925 != null) {
                                Class clsM7316 = AbstractC3889.m7316(interfaceC5925);
                                String name = method2.getName();
                                name.getClass();
                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                Class[] clsArr = (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length);
                                C5519 c5519 = AbstractC5899.f14953;
                                try {
                                    declaredMethod = clsM7316.getDeclaredMethod(name, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                                } catch (NoSuchMethodException unused3) {
                                    declaredMethod = null;
                                }
                                if (declaredMethod == null || (interfaceC5942M106562 = AbstractC5913.m10656(AbstractC5238.m9494(interfaceC5925), declaredMethod)) == null) {
                                    Class<?> declaringClass4 = method2.getDeclaringClass();
                                    declaringClass4.getClass();
                                    interfaceC5942M10656 = AbstractC5913.m10656(AbstractC5238.m9494(AbstractC5228.f13320.mo9476(declaringClass4)), method2);
                                } else {
                                    interfaceC5942M10656 = interfaceC5942M106562;
                                }
                                break;
                            }
                        }
                    }
                    if (interfaceC5942M10656 != null) {
                        arrayList2.add(interfaceC5942M10656);
                    }
                    i4 = 2;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    if (AbstractC9016.m14234((InterfaceC5942) obj4)) {
                        arrayList3.add(obj4);
                    }
                }
                InterfaceC5942 interfaceC5942M14235 = AbstractC9016.m14235(arrayList3);
                if (interfaceC5942M14235 != null) {
                    List parameters = interfaceC5942M14235.getParameters();
                    if (parameters == null || !parameters.isEmpty()) {
                        Iterator it3 = parameters.iterator();
                        while (it3.hasNext()) {
                            if (((InterfaceC5940) it3.next()).getKind() != KParameter$Kind.INSTANCE) {
                            }
                        }
                    }
                    AbstractC4765.m8864(null, interfaceC5942M14235, c48902);
                    return c6008;
                }
                try {
                    if (InterfaceC7387.class.isAssignableFrom(clsLoadClass)) {
                        Constructor<?>[] declaredConstructors = clsLoadClass.getDeclaredConstructors();
                        declaredConstructors.getClass();
                        Constructor constructor = (Constructor) AbstractC5179.m9408(declaredConstructors);
                        if (constructor.getParameterCount() != 0) {
                            throw new ReloadingException("Module function with captured variables cannot be instantiated '" + str + '\'');
                        }
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        objNewInstance.getClass();
                        AbstractC5220.m9447(1, objNewInstance);
                        ((InterfaceC7387) objNewInstance).invoke(c48902);
                        return c6008;
                    }
                } catch (NoSuchMethodError unused4) {
                }
                Metadata metadata = (Metadata) clsLoadClass.getAnnotation(Metadata.class);
                if (metadata == null || metadata.m152k() != 1) {
                    metadata = null;
                }
                InterfaceC5925 interfaceC5925Mo9476 = metadata != null ? AbstractC5228.f13320.mo9476(clsLoadClass) : null;
                if (interfaceC5925Mo9476 == null) {
                    throw new ReloadingException(AbstractC7012.m12149('\'', "Module function cannot be found for the fully qualified name '", str));
                }
                ArrayList arrayListM9494 = AbstractC5238.m9494(interfaceC5925Mo9476);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : arrayListM9494) {
                    InterfaceC5942 interfaceC59422 = (InterfaceC5942) obj5;
                    if (AbstractC5227.m9466(interfaceC59422.getName(), strSubstring2) && AbstractC9016.m14234(interfaceC59422)) {
                        arrayList4.add(obj5);
                    }
                }
                InterfaceC5942 interfaceC5942M142352 = AbstractC9016.m14235(arrayList4);
                if (interfaceC5942M142352 == null) {
                    throw new ClassNotFoundException(AbstractC7012.m12149('\'', "Module function cannot be found for the fully qualified name '", str));
                }
                Object objMo9439 = interfaceC5925Mo9476.mo9439();
                if (objMo9439 == null) {
                    Collection collectionMo9442 = interfaceC5925Mo9476.mo9442();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj6 : collectionMo9442) {
                        List<InterfaceC5940> parameters2 = ((InterfaceC5942) obj6).getParameters();
                        if (parameters2 == null || !parameters2.isEmpty()) {
                            for (InterfaceC5940 interfaceC5940 : parameters2) {
                                if (interfaceC5940.mo10513() || AbstractC9016.m14233(interfaceC5940, AbstractC9016.f22904) || AbstractC9016.m14233(interfaceC5940, AbstractC9016.f22903)) {
                                }
                            }
                        }
                        arrayList5.add(obj6);
                    }
                    InterfaceC5942 interfaceC5942M142353 = AbstractC9016.m14235(arrayList5);
                    if (interfaceC5942M142353 == null) {
                        C4515.m8484(interfaceC5925Mo9476, "There are no applicable constructors found in class ");
                        return null;
                    }
                    objMo9439 = AbstractC4765.m8864(null, interfaceC5942M142353, c48902);
                }
                AbstractC4765.m8864(objMo9439, interfaceC5942M142352, c48902);
                return c6008;
            case 6:
                ((InterfaceC7383) obj3).invoke(((C9686) obj2).f25319, (View) obj);
                return c6008;
            case 7:
                ((InterfaceC7383) obj3).invoke(((C9684) obj2).f25315, (View) obj);
                return c6008;
            case 8:
                List<Certificate> listMo12003 = (List) obj2;
                String str2 = (String) obj;
                AbstractC7390 abstractC7390 = ((C6964) obj3).f17136;
                if (abstractC7390 != null) {
                    listMo12003 = abstractC7390.mo12003(str2, listMo12003);
                }
                ArrayList arrayList6 = new ArrayList(AbstractC5177.m9381(listMo12003, 10));
                for (Certificate certificate : listMo12003) {
                    certificate.getClass();
                    arrayList6.add((X509Certificate) certificate);
                }
                return arrayList6;
            case 9:
                AbstractC7390 abstractC73902 = ((C6964) obj3).f17136;
                abstractC73902.getClass();
                return abstractC73902.mo12003(((C6968) obj).f17160.f17226, ((C6979) obj2).m12106());
            case 10:
                C2065 c2065 = (C2065) obj3;
                C2070 c2070 = (C2070) obj2;
                InterfaceC8259 interfaceC8259 = (InterfaceC8259) obj;
                if (c2065 != null) {
                    c2070.m2678(c2070.m2676(c2065) - c2070.f3915);
                }
                List listM10438 = AbstractC5754.m10438(c2070, null, c2070.f3915, null);
                C2129 c2129 = (C2129) AbstractC5176.m9371(listM10438);
                Integer num = c2129 != null ? c2129.f4126 : null;
                List listMo2860 = interfaceC8259.mo2860(num);
                if (num != null && !listMo2860.isEmpty()) {
                    listMo2860 = AbstractC5176.m9352(AbstractC5176.m9364(1, listMo2860), AbstractC7176.m12487(new C2129(((C2129) AbstractC5176.m9379(listMo2860)).f4127, null, num)));
                }
                return new C2131(AbstractC5176.m9352(listMo2860, listM10438), interfaceC8259.mo2859());
            case 11:
                TextView textView = (TextView) obj2;
                Button button = (Button) obj;
                textView.getClass();
                button.getClass();
                ((C9719) obj3).m15099(textView, button);
                return c6008;
            default:
                TextView textView2 = (TextView) obj2;
                Button button2 = (Button) obj;
                textView2.getClass();
                button2.getClass();
                ((C8657) obj3).m13750(textView2, button2);
                return c6008;
        }
    }

    public /* synthetic */ C1596(Object obj, Object obj2, Object obj3, int i) {
        this.f2540 = i;
        this.f2538 = obj;
        this.f2539 = obj2;
        this.f2537 = obj3;
    }
}
