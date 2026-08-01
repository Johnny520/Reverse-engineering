package kotlin.reflect.jvm.internal;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.C1322;
import io.ktor.util.C4210;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.AbstractC5089;
import kotlin.reflect.C5084;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4412;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4419;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4421;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4422;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4434;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4445;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.load.java.C4609;
import kotlin.reflect.jvm.internal.impl.load.java.C4619;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4588;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4591;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4599;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4809;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4800;
import kotlin.reflect.jvm.internal.impl.storage.C4839;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4879;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4848;
import kotlin.reflect.jvm.internal.impl.types.checker.C4861;
import kotlin.reflect.jvm.internal.types.AbstractC4933;
import kotlin.reflect.jvm.internal.types.C4920;
import kotlin.reflect.jvm.internal.types.C4937;
import net.bytebuddy.description.method.MethodDescription;
import okhttp3.internal.http2.ErrorCode;
import p007.AbstractC6136;
import p007.C6143;
import p017.AbstractC6233;
import p022.C6272;
import p022.C6281;
import p033.AbstractC6325;
import p046.InterfaceC6480;
import p047.C6490;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p077.C6970;
import p079.AbstractC6988;
import p079.AbstractC6995;
import p079.AbstractC7001;
import p079.AbstractC7013;
import p079.C6982;
import p079.C6987;
import p079.C7005;
import p079.C7015;
import p079.C7017;
import p083.C7037;
import p083.C7040;
import p083.InterfaceC7036;
import p084.C7045;
import p084.C7047;
import p097.InterfaceC7219;
import p101.C7264;
import p103.C7273;
import p253.AbstractC8189;
import p354.C8890;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5027 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14500;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14501;

    public C5027(AbstractC4574 abstractC4574, C4445 c4445, Ref$ObjectRef ref$ObjectRef) {
        this.f14501 = 8;
        this.f14499 = abstractC4574;
        this.f14500 = ref$ObjectRef;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() throws Throwable {
        C5084 c5084M10096;
        C5084 c5084;
        ErrorCode errorCode;
        int i = this.f14501;
        C5175 c5175 = C5175.f14739;
        int i2 = 0;
        int i3 = 1;
        IOException iOException = null;
        iOException = null;
        Object obj = this.f14499;
        Object obj2 = this.f14500;
        switch (i) {
            case 0:
                C5025 c5025 = (C5025) obj;
                String str = (String) obj2;
                AbstractC5002 abstractC5002 = c5025.f14496;
                String str2 = c5025.f14497;
                abstractC5002.getClass();
                str2.getClass();
                Collection collectionM8804 = str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME) ? AbstractC4343.m8804(abstractC5002.mo9938()) : abstractC5002.mo9937(C4690.m9340(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionM8804) {
                    if (AbstractC4394.m8917(AbstractC5067.m10075((InterfaceC4483) obj3).mo9998(), str2)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC4483) AbstractC4343.m8818(arrayList);
                }
                String strM8813 = AbstractC4343.m8813(collectionM8804, "\n", null, null, C5015.f14462, 30);
                StringBuilder sbM11551 = AbstractC6136.m11551("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbM11551.append(abstractC5002);
                sbM11551.append(':');
                sbM11551.append(strM8813.length() == 0 ? " no members found" : "\n".concat(strM8813));
                throw new KotlinReflectionInternalError(sbM11551.toString());
            case 1:
                C5003 c5003 = (C5003) obj2;
                InterfaceC4476 interfaceC4476Mo9221 = ((AbstractC4881) obj).mo9732().mo9221();
                if (!(interfaceC4476Mo9221 instanceof AbstractC6988)) {
                    C4210.m8605(interfaceC4476Mo9221, "Supertype not a class: ");
                    return null;
                }
                Class clsM10068 = AbstractC5066.m10068((AbstractC6988) interfaceC4476Mo9221);
                if (clsM10068 == null) {
                    C4210.m8617("Unsupported superclass of ", c5003, ": ", interfaceC4476Mo9221);
                    return null;
                }
                Class cls = c5003.f14422;
                if (AbstractC4394.m8917(cls.getSuperclass(), clsM10068)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int iM8844 = AbstractC4346.m8844(clsM10068, interfaces);
                if (iM8844 < 0) {
                    C4210.m8617("No superclass of ", c5003, " in Java reflection for ", interfaceC4476Mo9221);
                    return null;
                }
                Type type = cls.getGenericInterfaces()[iM8844];
                type.getClass();
                return type;
            case 2:
                C4979 c4979 = (C4979) obj;
                C5069 c5069 = (C5069) obj2;
                C4533 c4533 = c4979.f14370.f13182;
                if (c4533 == null) {
                    AbstractC4394.m8918("type");
                    throw null;
                }
                ClassLoader classLoader = c4979.f14372.mo9946().mo8889().getClassLoader();
                classLoader.getClass();
                return AbstractC6325.m11846(c4533, classLoader, c5069, new C5011(c4979, 13));
            case 3:
                C4421 c4421 = (C4421) obj;
                C4844 c4844 = (C4844) obj2;
                InterfaceC6557 interfaceC6557 = c4421.f13031;
                C6987 c6987 = c4421.f13032;
                C7015 c7015 = new C7015((InterfaceC4498) interfaceC6557.invoke(c6987), C4421.f13029, Modality.ABSTRACT, ClassKind.INTERFACE, AbstractC8189.m13660(c6987.f18704.m11982()), c4844);
                c7015.m12330(new C4412(c4844, c7015), EmptySet.INSTANCE, null);
                return c7015;
            case 4:
                C4422 c4422 = (C4422) obj;
                C6987 c6987M11994 = c4422.m11994();
                c6987M11994.getClass();
                return new C4419(c6987M11994, (C4844) obj2, new C1322(c4422, i3));
            case 5:
                C4419 c4419 = (C4419) obj;
                C6987 c69872 = c4419.m8973().f13038;
                C4421.f13027.getClass();
                return AbstractC4490.m9085(c69872, C4421.f13028, new C0325((C4844) obj2, c4419.m8973().f13038)).mo9035();
            case 6:
                C4599 c4599 = (C4599) obj;
                C0325 c0325 = c4599.f13421;
                C7040 c7040 = (C7040) c0325.f1095;
                C0325 c03252 = new C0325(new C7040(c7040.f18899, c7040.f18898, c7040.f18897, c7040.f18896, c7040.f18895, c7040.f18894, c7040.f18912, c7040.f18916, c7040.f18917, c7040.f18914, c7040.f18915, c7040.f18907, c7040.f18906, c7040.f18910, c7040.f18911, c7040.f18908, c7040.f18909, c7040.f18901, c7040.f18900, c7040.f18904, c7040.f18905, c7040.f18902), (InterfaceC7036) c0325.f1096, (InterfaceC5183) c0325.f1094);
                InterfaceC4498 interfaceC4498Mo9038 = c4599.mo9038();
                interfaceC4498Mo9038.getClass();
                return new C4599(c03252, interfaceC4498Mo9038, c4599.f13428, (AbstractC6988) obj2);
            case 7:
                C6970 c6970 = ((C7040) ((C0325) obj).f1095).f18898;
                C4686 c4686 = ((C4588) obj2).f13376.f18692;
                c6970.getClass();
                c4686.getClass();
                return null;
            case 8:
                C7047 c7047 = ((C7040) ((AbstractC4574) obj).f13332.f1095).f18912;
                InterfaceC4472 interfaceC4472 = (InterfaceC4472) ((Ref$ObjectRef) obj2).element;
                c7047.getClass();
                interfaceC4472.getClass();
                return null;
            case 9:
                C4823 c4823 = ((C4809) obj).f14022;
                return c4823.f14058.f14084.mo2411((ProtoBuf$Type) obj2, c4823.f14057);
            case 10:
                C4800 c4800 = (C4800) obj;
                return AbstractC4343.m8804(c4800.f13990.f14058.f14084.mo2400(c4800.f13993, (ProtoBuf$EnumEntry) obj2));
            case 11:
                InterfaceC7219 interfaceC7219 = (InterfaceC7219) ((C4879) obj2).f14183.invoke();
                ((C4848) ((AbstractC4860) obj)).getClass();
                interfaceC7219.getClass();
                return (AbstractC4881) interfaceC7219;
            case 12:
                AbstractC4860 abstractC4860 = (AbstractC4860) obj2;
                Iterable iterable = (List) ((C4861) obj).f14140.getValue();
                if (iterable == null) {
                    iterable = EmptyList.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AbstractC4913) it.next()).mo9731(abstractC4860));
                }
                return arrayList2;
            case 13:
                C4937 c4937 = (C4937) obj;
                InterfaceC6542 interfaceC6542 = (InterfaceC6542) obj2;
                List listMo9736 = c4937.f14292.mo9736();
                if (listMo9736.isEmpty()) {
                    return EmptyList.INSTANCE;
                }
                ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(listMo9736, 10));
                int i4 = 0;
                for (Object obj4 : listMo9736) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC8189.m13662();
                        throw null;
                    }
                    AbstractC4869 abstractC4869 = (AbstractC4869) obj4;
                    C5033 c5033 = interfaceC6542 == null ? null : new C5033(new C4920(c4937, 1), i4, i2);
                    if (abstractC4869.mo9750()) {
                        c5084M10096 = C5084.f14636;
                    } else {
                        AbstractC4881 abstractC4881Mo9751 = abstractC4869.mo9751();
                        abstractC4881Mo9751.getClass();
                        C4937 c49372 = new C4937(abstractC4881Mo9751, c5033, false);
                        int i6 = AbstractC4933.f14283[abstractC4869.mo9752().ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                c5084 = new C5084(c49372, KVariance.IN);
                            } else {
                                if (i6 != 3) {
                                    C4210.m8621();
                                    return null;
                                }
                                c5084 = new C5084(c49372, KVariance.OUT);
                            }
                            c5084M10096 = c5084;
                        } else {
                            C5084 c50842 = C5084.f14636;
                            c5084M10096 = AbstractC5089.m10096(c49372);
                        }
                    }
                    arrayList3.add(c5084M10096);
                    i4 = i5;
                }
                return arrayList3;
            case 14:
                ((InterfaceC6557) obj).invoke(((C8890) obj2).f25052);
                return c5175;
            case 15:
                ((InterfaceC6557) obj).invoke((C6143) obj2);
                return c5175;
            case 16:
                C6281 c6281 = (C6281) obj2;
                C6272 c6272 = (C6272) obj;
                ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
                try {
                } catch (IOException e) {
                    iOException = e;
                    errorCode = errorCode2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode2;
                    c6281.m11790(errorCode, errorCode2, iOException);
                    AbstractC6233.m11690(c6272);
                    throw th;
                }
                if (!c6272.m11766(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (c6272.m11766(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    try {
                        c6281.m11790(errorCode, ErrorCode.CANCEL, null);
                    } catch (IOException e2) {
                        iOException = e2;
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        c6281.m11790(errorCode3, errorCode3, iOException);
                    }
                    AbstractC6233.m11690(c6272);
                    return c5175;
                } catch (Throwable th2) {
                    th = th2;
                    c6281.m11790(errorCode, errorCode2, iOException);
                    AbstractC6233.m11690(c6272);
                    throw th;
                }
            case 17:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj).getCanonicalName());
                AbstractC4343.m8829(((Map) obj2).entrySet(), sb, ", ", "(", ")", C6490.f17787, 48);
                return sb.toString();
            case 18:
                C4873.f14171.getClass();
                C4873 c4873 = C4873.f14172;
                InterfaceC4872 interfaceC4872Mo9011 = ((AbstractC7013) obj2).mo9011();
                List list = Collections.EMPTY_LIST;
                C1322 c1322 = new C1322(this, 15);
                C4839 c4839 = C4844.f14119;
                c4839.getClass();
                return AbstractC4892.m9825(list, c4873, interfaceC4872Mo9011, new C7264(c4839, c1322), false);
            case 19:
                C7273 c7273 = new C7273();
                Iterator it2 = ((AbstractC7001) obj2).mo9040().iterator();
                while (it2.hasNext()) {
                    c7273.add(((InterfaceC4483) it2.next()).mo9015((C4918) obj));
                }
                return c7273;
            case 20:
                C6982 c6982 = (C6982) obj;
                C7017 c7017 = (C7017) obj2;
                C4844 c48442 = c6982.f18688;
                AbstractC6995 abstractC6995 = c6982.f18687;
                InterfaceC6480 annotations = c7017.getAnnotations();
                CallableMemberDescriptor$Kind kind = c7017.getKind();
                kind.getClass();
                AbstractC6995 abstractC69952 = c6982.f18687;
                InterfaceC4461 interfaceC4461Mo9036 = abstractC69952.mo9036();
                interfaceC4461Mo9036.getClass();
                C6982 c69822 = new C6982(c48442, abstractC6995, c7017, c6982, annotations, kind, interfaceC4461Mo9036);
                C6982.f18685.getClass();
                C4918 c4918M9862 = abstractC69952.mo9529() == null ? null : C4918.m9862(abstractC69952.mo9531());
                if (c4918M9862 == null) {
                    return null;
                }
                C7005 c7005 = c7017.f18779;
                C7005 c7005Mo9015 = c7005 != null ? c7005.mo9015(c4918M9862) : null;
                List listMo9047 = c7017.mo9047();
                listMo9047.getClass();
                ArrayList arrayList4 = new ArrayList(AbstractC4344.m8832(listMo9047, 10));
                Iterator it3 = listMo9047.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((C7005) it3.next()).mo9015(c4918M9862));
                }
                List listMo9025 = abstractC69952.mo9025();
                List listMo9045 = c6982.mo9045();
                AbstractC4881 abstractC4881 = c6982.f18790;
                abstractC4881.getClass();
                c69822.mo12270(null, c7005Mo9015, arrayList4, listMo9025, listMo9045, abstractC4881, Modality.FINAL, abstractC69952.f18757);
                return c69822;
            case 21:
                C0325 c03253 = (C0325) obj;
                InterfaceC6480 annotations2 = ((InterfaceC4477) obj2).getAnnotations();
                c03253.getClass();
                annotations2.getClass();
                return C4609.m9228(((C7040) c03253.f1095).f18908, (C4619) ((InterfaceC5183) c03253.f1094).getValue(), annotations2);
            case 22:
                C0325 c03254 = (C0325) obj;
                InterfaceC6480 interfaceC6480 = (InterfaceC6480) obj2;
                c03254.getClass();
                interfaceC6480.getClass();
                return C4609.m9228(((C7040) c03254.f1095).f18908, (C4619) ((InterfaceC5183) c03254.f1094).getValue(), interfaceC6480);
            case 23:
                return new C4591(((C7037) obj).f18887, (C4434) obj2);
            default:
                return ((C7040) ((C0325) obj).f1095).f18910.mo9071().m11996(((C7045) obj2).f18930).mo9035();
        }
    }

    public /* synthetic */ C5027(Object obj, int i, Object obj2) {
        this.f14501 = i;
        this.f14499 = obj;
        this.f14500 = obj2;
    }

    public /* synthetic */ C5027(int i, Object obj, Object obj2, boolean z) {
        this.f14501 = i;
        this.f14500 = obj;
        this.f14499 = obj2;
    }
}
