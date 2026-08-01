package kotlin.reflect.jvm.internal;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.C1322;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.AbstractC5090;
import kotlin.reflect.C5085;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4413;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4420;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4422;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4423;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4478;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4446;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.load.java.C4610;
import kotlin.reflect.jvm.internal.impl.load.java.C4620;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4589;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4592;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4600;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4810;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4801;
import kotlin.reflect.jvm.internal.impl.storage.C4840;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4880;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.checker.C4849;
import kotlin.reflect.jvm.internal.impl.types.checker.C4862;
import kotlin.reflect.jvm.internal.types.AbstractC4934;
import kotlin.reflect.jvm.internal.types.C4921;
import kotlin.reflect.jvm.internal.types.C4938;
import net.bytebuddy.description.method.MethodDescription;
import okhttp3.internal.http2.ErrorCode;
import p009.AbstractC6183;
import p009.C6174;
import p013.AbstractC6225;
import p019.C6268;
import p019.C6277;
import p034.AbstractC6347;
import p046.InterfaceC6481;
import p047.C6491;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p077.C6971;
import p079.AbstractC6989;
import p079.AbstractC6996;
import p079.AbstractC7002;
import p079.AbstractC7014;
import p079.C6983;
import p079.C6988;
import p079.C7006;
import p079.C7016;
import p079.C7018;
import p083.C7038;
import p083.C7041;
import p083.InterfaceC7037;
import p084.C7046;
import p084.C7048;
import p097.InterfaceC7220;
import p101.C7265;
import p103.C7274;
import p350.C8858;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5028 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14501;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f14502;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14503;

    public C5028(AbstractC4575 abstractC4575, C4446 c4446, Ref$ObjectRef ref$ObjectRef) {
        this.f14503 = 8;
        this.f14501 = abstractC4575;
        this.f14502 = ref$ObjectRef;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() throws Throwable {
        C5085 c5085M10100;
        C5085 c5085;
        ErrorCode errorCode;
        int i = this.f14503;
        C5176 c5176 = C5176.f14739;
        int i2 = 0;
        int i3 = 1;
        IOException iOException = null;
        iOException = null;
        Object obj = this.f14501;
        Object obj2 = this.f14502;
        switch (i) {
            case 0:
                C5026 c5026 = (C5026) obj;
                String str = (String) obj2;
                AbstractC5003 abstractC5003 = c5026.f14498;
                String str2 = c5026.f14499;
                abstractC5003.getClass();
                str2.getClass();
                Collection collectionM8797 = str.equals(MethodDescription.CONSTRUCTOR_INTERNAL_NAME) ? AbstractC4344.m8797(abstractC5003.mo9935()) : abstractC5003.mo9934(C4691.m9330(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionM8797) {
                    if (AbstractC4395.m8907(AbstractC5068.m10079((InterfaceC4484) obj3).mo9995(), str2)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC4484) AbstractC4344.m8779(arrayList);
                }
                String strM8810 = AbstractC4344.m8810(collectionM8797, "\n", null, null, C5016.f14464, 30);
                StringBuilder sbM11582 = AbstractC6183.m11582("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbM11582.append(abstractC5003);
                sbM11582.append(':');
                sbM11582.append(strM8810.length() == 0 ? " no members found" : "\n".concat(strM8810));
                throw new KotlinReflectionInternalError(sbM11582.toString());
            case 1:
                C5004 c5004 = (C5004) obj2;
                InterfaceC4477 interfaceC4477Mo9211 = ((AbstractC4882) obj).mo9722().mo9211();
                if (!(interfaceC4477Mo9211 instanceof AbstractC6989)) {
                    C4211.m8595(interfaceC4477Mo9211, "Supertype not a class: ");
                    return null;
                }
                Class clsM10072 = AbstractC5067.m10072((AbstractC6989) interfaceC4477Mo9211);
                if (clsM10072 == null) {
                    C4211.m8607("Unsupported superclass of ", c5004, ": ", interfaceC4477Mo9211);
                    return null;
                }
                Class cls = c5004.f14424;
                if (AbstractC4395.m8907(cls.getSuperclass(), clsM10072)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int iM8852 = AbstractC4347.m8852(clsM10072, interfaces);
                if (iM8852 < 0) {
                    C4211.m8607("No superclass of ", c5004, " in Java reflection for ", interfaceC4477Mo9211);
                    return null;
                }
                Type type = cls.getGenericInterfaces()[iM8852];
                type.getClass();
                return type;
            case 2:
                C4980 c4980 = (C4980) obj;
                C5070 c5070 = (C5070) obj2;
                C4534 c4534 = c4980.f14372.f13186;
                if (c4534 == null) {
                    AbstractC4395.m8908("type");
                    throw null;
                }
                ClassLoader classLoader = c4980.f14374.mo9943().mo8879().getClassLoader();
                classLoader.getClass();
                return AbstractC3933.m8290(c4534, classLoader, c5070, new C5012(c4980, 13));
            case 3:
                C4422 c4422 = (C4422) obj;
                C4845 c4845 = (C4845) obj2;
                InterfaceC6558 interfaceC6558 = c4422.f13035;
                C6988 c6988 = c4422.f13036;
                C7016 c7016 = new C7016((InterfaceC4499) interfaceC6558.invoke(c6988), C4422.f13033, Modality.ABSTRACT, ClassKind.INTERFACE, AbstractC6347.m11928(c6988.f18699.m12025()), c4845);
                c7016.m12357(new C4413(c4845, c7016), EmptySet.INSTANCE, null);
                return c7016;
            case 4:
                C4423 c4423 = (C4423) obj;
                C6988 c6988M12037 = c4423.m12037();
                c6988M12037.getClass();
                return new C4420(c6988M12037, (C4845) obj2, new C1322(c4423, i3));
            case 5:
                C4420 c4420 = (C4420) obj;
                C6988 c69882 = c4420.m8963().f13042;
                C4422.f13031.getClass();
                return AbstractC4491.m9075(c69882, C4422.f13032, new C0325((C4845) obj2, c4420.m8963().f13042)).mo9025();
            case 6:
                C4600 c4600 = (C4600) obj;
                C0325 c0325 = c4600.f13425;
                C7041 c7041 = (C7041) c0325.f1095;
                C0325 c03252 = new C0325(new C7041(c7041.f18894, c7041.f18893, c7041.f18892, c7041.f18891, c7041.f18890, c7041.f18889, c7041.f18907, c7041.f18911, c7041.f18912, c7041.f18909, c7041.f18910, c7041.f18902, c7041.f18901, c7041.f18905, c7041.f18906, c7041.f18903, c7041.f18904, c7041.f18896, c7041.f18895, c7041.f18899, c7041.f18900, c7041.f18897), (InterfaceC7037) c0325.f1096, (InterfaceC5184) c0325.f1094);
                InterfaceC4499 interfaceC4499Mo9028 = c4600.mo9028();
                interfaceC4499Mo9028.getClass();
                return new C4600(c03252, interfaceC4499Mo9028, c4600.f13432, (AbstractC6989) obj2);
            case 7:
                C6971 c6971 = ((C7041) ((C0325) obj).f1095).f18893;
                C4687 c4687 = ((C4589) obj2).f13380.f18687;
                c6971.getClass();
                c4687.getClass();
                return null;
            case 8:
                C7048 c7048 = ((C7041) ((AbstractC4575) obj).f13336.f1095).f18907;
                InterfaceC4473 interfaceC4473 = (InterfaceC4473) ((Ref$ObjectRef) obj2).element;
                c7048.getClass();
                interfaceC4473.getClass();
                return null;
            case 9:
                C4824 c4824 = ((C4810) obj).f14026;
                return c4824.f14062.f14088.mo2421((ProtoBuf$Type) obj2, c4824.f14061);
            case 10:
                C4801 c4801 = (C4801) obj;
                return AbstractC4344.m8797(c4801.f13994.f14062.f14088.mo2410(c4801.f13997, (ProtoBuf$EnumEntry) obj2));
            case 11:
                InterfaceC7220 interfaceC7220 = (InterfaceC7220) ((C4880) obj2).f14187.invoke();
                ((C4849) ((AbstractC4861) obj)).getClass();
                interfaceC7220.getClass();
                return (AbstractC4882) interfaceC7220;
            case 12:
                AbstractC4861 abstractC4861 = (AbstractC4861) obj2;
                Iterable iterable = (List) ((C4862) obj).f14144.getValue();
                if (iterable == null) {
                    iterable = EmptyList.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AbstractC4914) it.next()).mo9721(abstractC4861));
                }
                return arrayList2;
            case 13:
                C4938 c4938 = (C4938) obj;
                InterfaceC6543 interfaceC6543 = (InterfaceC6543) obj2;
                List listMo9726 = c4938.f14294.mo9726();
                if (listMo9726.isEmpty()) {
                    return EmptyList.INSTANCE;
                }
                ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(listMo9726, 10));
                int i4 = 0;
                for (Object obj4 : listMo9726) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC6347.m11920();
                        throw null;
                    }
                    AbstractC4870 abstractC4870 = (AbstractC4870) obj4;
                    C5034 c5034 = interfaceC6543 == null ? null : new C5034(new C4921(c4938, 1), i4, i2);
                    if (abstractC4870.mo9740()) {
                        c5085M10100 = C5085.f14636;
                    } else {
                        AbstractC4882 abstractC4882Mo9741 = abstractC4870.mo9741();
                        abstractC4882Mo9741.getClass();
                        C4938 c49382 = new C4938(abstractC4882Mo9741, c5034, false);
                        int i6 = AbstractC4934.f14285[abstractC4870.mo9742().ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                c5085 = new C5085(c49382, KVariance.IN);
                            } else {
                                if (i6 != 3) {
                                    C4211.m8611();
                                    return null;
                                }
                                c5085 = new C5085(c49382, KVariance.OUT);
                            }
                            c5085M10100 = c5085;
                        } else {
                            C5085 c50852 = C5085.f14636;
                            c5085M10100 = AbstractC5090.m10100(c49382);
                        }
                    }
                    arrayList3.add(c5085M10100);
                    i4 = i5;
                }
                return arrayList3;
            case 14:
                ((InterfaceC6558) obj).invoke(((C8858) obj2).f24976);
                return c5176;
            case 15:
                ((InterfaceC6558) obj).invoke((C6174) obj2);
                return c5176;
            case 16:
                C6277 c6277 = (C6277) obj2;
                C6268 c6268 = (C6268) obj;
                ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
                try {
                } catch (IOException e) {
                    iOException = e;
                    errorCode = errorCode2;
                } catch (Throwable th) {
                    th = th;
                    errorCode = errorCode2;
                    c6277.m11807(errorCode, errorCode2, iOException);
                    AbstractC6225.m11680(c6268);
                    throw th;
                }
                if (!c6268.m11783(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (c6268.m11783(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    try {
                        c6277.m11807(errorCode, ErrorCode.CANCEL, null);
                    } catch (IOException e2) {
                        iOException = e2;
                        ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                        c6277.m11807(errorCode3, errorCode3, iOException);
                    }
                    AbstractC6225.m11680(c6268);
                    return c5176;
                } catch (Throwable th2) {
                    th = th2;
                    c6277.m11807(errorCode, errorCode2, iOException);
                    AbstractC6225.m11680(c6268);
                    throw th;
                }
            case 17:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj).getCanonicalName());
                AbstractC4344.m8809(((Map) obj2).entrySet(), sb, ", ", "(", ")", C6491.f17783, 48);
                return sb.toString();
            case 18:
                C4874.f14175.getClass();
                C4874 c4874 = C4874.f14176;
                InterfaceC4873 interfaceC4873Mo9001 = ((AbstractC7014) obj2).mo9001();
                List list = Collections.EMPTY_LIST;
                C1322 c1322 = new C1322(this, 15);
                C4840 c4840 = C4845.f14123;
                c4840.getClass();
                return AbstractC4893.m9819(list, c4874, interfaceC4873Mo9001, new C7265(c4840, c1322), false);
            case 19:
                C7274 c7274 = new C7274();
                Iterator it2 = ((AbstractC7002) obj2).mo9030().iterator();
                while (it2.hasNext()) {
                    c7274.add(((InterfaceC4484) it2.next()).mo9005((C4919) obj));
                }
                return c7274;
            case 20:
                C6983 c6983 = (C6983) obj;
                C7018 c7018 = (C7018) obj2;
                C4845 c48452 = c6983.f18683;
                AbstractC6996 abstractC6996 = c6983.f18682;
                InterfaceC6481 annotations = c7018.getAnnotations();
                CallableMemberDescriptor$Kind kind = c7018.getKind();
                kind.getClass();
                AbstractC6996 abstractC69962 = c6983.f18682;
                InterfaceC4462 interfaceC4462Mo9026 = abstractC69962.mo9026();
                interfaceC4462Mo9026.getClass();
                C6983 c69832 = new C6983(c48452, abstractC6996, c7018, c6983, annotations, kind, interfaceC4462Mo9026);
                C6983.f18680.getClass();
                C4919 c4919M9856 = abstractC69962.mo9519() == null ? null : C4919.m9856(abstractC69962.mo9521());
                if (c4919M9856 == null) {
                    return null;
                }
                C7006 c7006 = c7018.f18774;
                C7006 c7006Mo9005 = c7006 != null ? c7006.mo9005(c4919M9856) : null;
                List listMo9037 = c7018.mo9037();
                listMo9037.getClass();
                ArrayList arrayList4 = new ArrayList(AbstractC4345.m8822(listMo9037, 10));
                Iterator it3 = listMo9037.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((C7006) it3.next()).mo9005(c4919M9856));
                }
                List listMo9015 = abstractC69962.mo9015();
                List listMo9035 = c6983.mo9035();
                AbstractC4882 abstractC4882 = c6983.f18785;
                abstractC4882.getClass();
                c69832.mo12297(null, c7006Mo9005, arrayList4, listMo9015, listMo9035, abstractC4882, Modality.FINAL, abstractC69962.f18752);
                return c69832;
            case 21:
                C0325 c03253 = (C0325) obj;
                InterfaceC6481 annotations2 = ((InterfaceC4478) obj2).getAnnotations();
                c03253.getClass();
                annotations2.getClass();
                return C4610.m9218(((C7041) c03253.f1095).f18903, (C4620) ((InterfaceC5184) c03253.f1094).getValue(), annotations2);
            case 22:
                C0325 c03254 = (C0325) obj;
                InterfaceC6481 interfaceC6481 = (InterfaceC6481) obj2;
                c03254.getClass();
                interfaceC6481.getClass();
                return C4610.m9218(((C7041) c03254.f1095).f18903, (C4620) ((InterfaceC5184) c03254.f1094).getValue(), interfaceC6481);
            case 23:
                return new C4592(((C7038) obj).f18882, (C4435) obj2);
            default:
                return ((C7041) ((C0325) obj).f1095).f18905.mo9061().m12039(((C7046) obj2).f18925).mo9025();
        }
    }

    public /* synthetic */ C5028(Object obj, int i, Object obj2) {
        this.f14503 = i;
        this.f14501 = obj;
        this.f14502 = obj2;
    }

    public /* synthetic */ C5028(int i, Object obj, Object obj2, boolean z) {
        this.f14503 = i;
        this.f14502 = obj;
        this.f14501 = obj2;
    }
}
