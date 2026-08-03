package p343x6;

import gg.AbstractC1416l;
import gg.AbstractC1426v;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1235p;
import p256r6.C3709c;
import p272s6.AbstractC3931b;
import p297u6.C4274a;
import p297u6.C4275b;
import p297u6.C4276c;
import p297u6.C4277d;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: x6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5697a implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23165g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3709c f23166h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5697a(C3709c c3709c, int i9) {
        this.f23165g = i9;
        this.f23166h = c3709c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        boolean zEquals;
        Class cls;
        Class cls2;
        boolean z9;
        boolean z10;
        Class cls3;
        Class cls4;
        boolean z11;
        boolean z12;
        Class cls5;
        Class cls6;
        boolean zM10305f;
        Class cls7;
        Class cls8;
        Annotation[] declaredAnnotations;
        Class cls9;
        Annotation[] declaredAnnotations2;
        Class cls10;
        switch (this.f23165g) {
            case 0:
                Class<?> type = ((C4275b) obj2).f14190c.getType();
                type.getClass();
                zEquals = type.equals(C5703g.m10310k(obj, this.f23166h, "Field: type"));
                return Boolean.valueOf(zEquals);
            case 1:
                List list = (List) obj;
                Class<?>[] parameterTypes = ((C4274a) obj2).f14188c.getParameterTypes();
                parameterTypes.getClass();
                List listM8375L0 = AbstractC4165l.m8375L0(parameterTypes);
                boolean z13 = false;
                if (list.size() == listM8375L0.size()) {
                    Iterator it = list.iterator();
                    int i9 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i10 = i9 + 1;
                            Class cls11 = (Class) listM8375L0.get(i9);
                            Class clsM10310k = C5703g.m10310k(next, this.f23166h, null);
                            cls = AbstractC3931b.class;
                            Class<AbstractC3931b> clsM51a0 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls));
                            if (clsM10310k.equals(clsM51a0 != null ? clsM51a0 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls11, clsM10310k)) {
                                i9 = i10;
                            }
                        } else {
                            z13 = true;
                        }
                    }
                }
                return Boolean.valueOf(z13);
            case 2:
                Class<?> returnType = ((C4277d) obj2).f14193c.getReturnType();
                returnType.getClass();
                zEquals = returnType.equals(C5703g.m10310k(obj, this.f23166h, "Method: returnType"));
                return Boolean.valueOf(zEquals);
            case 3:
                List list2 = (List) obj;
                Annotation[][] parameterAnnotations = ((C4274a) obj2).f14188c.getParameterAnnotations();
                parameterAnnotations.getClass();
                Annotation[][] annotationArr = parameterAnnotations;
                ArrayList arrayList = new ArrayList(annotationArr.length);
                boolean z14 = false;
                for (Annotation[] annotationArr2 : annotationArr) {
                    ArrayList arrayList2 = new ArrayList(annotationArr2.length);
                    for (Annotation annotation : annotationArr2) {
                        Class clsMo3818a = AbstractC0000a.m31Q(annotation).mo3818a();
                        clsMo3818a.getClass();
                        arrayList2.add(clsMo3818a);
                    }
                    arrayList.add(arrayList2);
                }
                if (list2.size() == arrayList.size()) {
                    Iterator it2 = list2.iterator();
                    int i11 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            int i12 = i11 + 1;
                            if (C5703g.m10305f((Collection) it2.next(), (List) arrayList.get(i11), this.f23166h)) {
                                i11 = i12;
                            }
                        } else {
                            z14 = true;
                        }
                    }
                }
                return Boolean.valueOf(z14);
            case 4:
                List list3 = (List) obj;
                Annotation[][] parameterAnnotations2 = ((C4274a) obj2).f14188c.getParameterAnnotations();
                parameterAnnotations2.getClass();
                Annotation[][] annotationArr3 = parameterAnnotations2;
                ArrayList arrayList3 = new ArrayList(annotationArr3.length);
                boolean z15 = false;
                for (Annotation[] annotationArr4 : annotationArr3) {
                    ArrayList arrayList4 = new ArrayList(annotationArr4.length);
                    for (Annotation annotation2 : annotationArr4) {
                        Class clsMo3818a2 = AbstractC0000a.m31Q(annotation2).mo3818a();
                        clsMo3818a2.getClass();
                        arrayList4.add(clsMo3818a2);
                    }
                    arrayList3.add(arrayList4);
                }
                if (list3.size() == arrayList3.size()) {
                    Iterator it3 = list3.iterator();
                    int i13 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            int i14 = i13 + 1;
                            if (C5703g.m10305f((Collection) it3.next(), (List) arrayList3.get(i13), this.f23166h)) {
                                i13 = i14;
                            }
                        } else {
                            z15 = true;
                        }
                    }
                }
                zEquals = !z15;
                return Boolean.valueOf(zEquals);
            case 5:
                ((C4274a) obj2).getClass();
                boolean z16 = false;
                ArrayList arrayList5 = new ArrayList(0);
                Set set = (Set) obj;
                if (set.size() == arrayList5.size()) {
                    Iterator it4 = set.iterator();
                    int i15 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i16 = i15 + 1;
                            Class cls12 = (Class) arrayList5.get(i15);
                            Class clsM10310k2 = C5703g.m10310k(next2, this.f23166h, null);
                            cls2 = AbstractC3931b.class;
                            Class<AbstractC3931b> clsM51a02 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls2));
                            if (clsM10310k2.equals(clsM51a02 != null ? clsM51a02 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls12, clsM10310k2)) {
                                i15 = i16;
                            }
                        } else {
                            z16 = true;
                        }
                    }
                }
                return Boolean.valueOf(z16);
            case 6:
                ((C4274a) obj2).getClass();
                z9 = false;
                ArrayList arrayList6 = new ArrayList(0);
                Set set2 = (Set) obj;
                z10 = true;
                if (set2.size() == arrayList6.size()) {
                    int i17 = 0;
                    for (Object obj3 : set2) {
                        int i18 = i17 + 1;
                        Class cls13 = (Class) arrayList6.get(i17);
                        Class clsM10310k3 = C5703g.m10310k(obj3, this.f23166h, null);
                        cls3 = AbstractC3931b.class;
                        Class<AbstractC3931b> clsM51a03 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls3));
                        if (clsM10310k3.equals(clsM51a03 != null ? clsM51a03 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls13, clsM10310k3)) {
                            i17 = i18;
                        }
                    }
                    z9 = z10;
                }
                zEquals = !z9;
                return Boolean.valueOf(zEquals);
            case 7:
                ((C4274a) obj2).getClass();
                boolean z17 = false;
                ArrayList arrayList7 = new ArrayList(0);
                Set set3 = (Set) obj;
                if (set3.size() == arrayList7.size()) {
                    Iterator it5 = set3.iterator();
                    int i19 = 0;
                    while (true) {
                        if (it5.hasNext()) {
                            Object next3 = it5.next();
                            int i20 = i19 + 1;
                            Class cls14 = (Class) arrayList7.get(i19);
                            Class clsM10310k4 = C5703g.m10310k(next3, this.f23166h, null);
                            cls4 = AbstractC3931b.class;
                            Class<AbstractC3931b> clsM51a04 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls4));
                            if (clsM10310k4.equals(clsM51a04 != null ? clsM51a04 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls14, clsM10310k4)) {
                                i19 = i20;
                            }
                        } else {
                            z17 = true;
                        }
                    }
                }
                return Boolean.valueOf(z17);
            case 8:
                List list4 = (List) obj;
                Class<?>[] parameterTypes2 = ((C4274a) obj2).f14188c.getParameterTypes();
                parameterTypes2.getClass();
                List listM8375L02 = AbstractC4165l.m8375L0(parameterTypes2);
                z11 = true;
                z12 = false;
                if (list4.size() == listM8375L02.size()) {
                    int i21 = 0;
                    for (Object obj4 : list4) {
                        int i22 = i21 + 1;
                        Class cls15 = (Class) listM8375L02.get(i21);
                        Class clsM10310k5 = C5703g.m10310k(obj4, this.f23166h, null);
                        cls5 = AbstractC3931b.class;
                        Class<AbstractC3931b> clsM51a05 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls5));
                        if (clsM10310k5.equals(clsM51a05 != null ? clsM51a05 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls15, clsM10310k5)) {
                            i21 = i22;
                        }
                    }
                    z12 = z11;
                }
                zEquals = !z12;
                return Boolean.valueOf(zEquals);
            case 9:
                ((C4274a) obj2).getClass();
                z9 = false;
                ArrayList arrayList8 = new ArrayList(0);
                Set set4 = (Set) obj;
                z10 = true;
                if (set4.size() == arrayList8.size()) {
                    int i23 = 0;
                    for (Object obj5 : set4) {
                        int i24 = i23 + 1;
                        Class cls16 = (Class) arrayList8.get(i23);
                        Class clsM10310k6 = C5703g.m10310k(obj5, this.f23166h, null);
                        cls6 = AbstractC3931b.class;
                        Class<AbstractC3931b> clsM51a06 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls6));
                        if (clsM10310k6.equals(clsM51a06 != null ? clsM51a06 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls16, clsM10310k6)) {
                            i23 = i24;
                        }
                    }
                    z9 = z10;
                }
                zEquals = !z9;
                return Boolean.valueOf(zEquals);
            case 10:
                ((C4274a) obj2).getClass();
                zEquals = C5703g.m10305f((Set) obj, C5703g.m10304e(new AnnotatedElement[0]), this.f23166h);
                return Boolean.valueOf(zEquals);
            case 11:
                ((C4274a) obj2).getClass();
                zM10305f = C5703g.m10305f((Set) obj, C5703g.m10304e(new AnnotatedElement[0]), this.f23166h);
                zEquals = !zM10305f;
                return Boolean.valueOf(zEquals);
            case 12:
                ((C4274a) obj2).getClass();
                zEquals = C5703g.m10305f((Set) obj, C5703g.m10304e(new AnnotatedElement[0]), this.f23166h);
                return Boolean.valueOf(zEquals);
            case 13:
                ((C4274a) obj2).getClass();
                zM10305f = C5703g.m10305f((Set) obj, C5703g.m10304e(new AnnotatedElement[0]), this.f23166h);
                zEquals = !zM10305f;
                return Boolean.valueOf(zEquals);
            case 14:
                Set set5 = (Set) obj;
                Class<?>[] exceptionTypes = ((C4274a) obj2).f14188c.getExceptionTypes();
                exceptionTypes.getClass();
                List listM8375L03 = AbstractC4165l.m8375L0(exceptionTypes);
                boolean z18 = false;
                if (set5.size() == listM8375L03.size()) {
                    Iterator it6 = set5.iterator();
                    int i25 = 0;
                    while (true) {
                        if (it6.hasNext()) {
                            Object next4 = it6.next();
                            int i26 = i25 + 1;
                            Class cls17 = (Class) listM8375L03.get(i25);
                            Class clsM10310k7 = C5703g.m10310k(next4, this.f23166h, null);
                            cls7 = AbstractC3931b.class;
                            Class<AbstractC3931b> clsM51a07 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls7));
                            if (clsM10310k7.equals(clsM51a07 != null ? clsM51a07 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls17, clsM10310k7)) {
                                i25 = i26;
                            }
                        } else {
                            z18 = true;
                        }
                    }
                }
                return Boolean.valueOf(z18);
            case 15:
                Set set6 = (Set) obj;
                Class<?>[] exceptionTypes2 = ((C4274a) obj2).f14188c.getExceptionTypes();
                exceptionTypes2.getClass();
                List listM8375L04 = AbstractC4165l.m8375L0(exceptionTypes2);
                z11 = true;
                z12 = false;
                if (set6.size() == listM8375L04.size()) {
                    int i27 = 0;
                    for (Object obj6 : set6) {
                        int i28 = i27 + 1;
                        Class cls18 = (Class) listM8375L04.get(i27);
                        Class clsM10310k8 = C5703g.m10310k(obj6, this.f23166h, null);
                        cls8 = AbstractC3931b.class;
                        Class<AbstractC3931b> clsM51a08 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls8));
                        if (clsM10310k8.equals(clsM51a08 != null ? clsM51a08 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls18, clsM10310k8)) {
                            i27 = i28;
                        }
                    }
                    z12 = z11;
                }
                zEquals = !z12;
                return Boolean.valueOf(zEquals);
            case 16:
                Set set7 = (Set) obj;
                Member memberMo8594a = ((C4276c) obj2).mo8594a();
                AnnotatedElement annotatedElement = memberMo8594a instanceof AnnotatedElement ? (AnnotatedElement) memberMo8594a : null;
                boolean z19 = false;
                if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
                    declaredAnnotations = new Annotation[0];
                }
                ArrayList arrayList9 = new ArrayList(declaredAnnotations.length);
                for (Annotation annotation3 : declaredAnnotations) {
                    Class clsMo3818a3 = AbstractC0000a.m31Q(annotation3).mo3818a();
                    clsMo3818a3.getClass();
                    arrayList9.add(clsMo3818a3);
                }
                Set set8 = set7;
                if (set8.size() == arrayList9.size()) {
                    Iterator it7 = set8.iterator();
                    int i29 = 0;
                    while (true) {
                        if (it7.hasNext()) {
                            Object next5 = it7.next();
                            int i30 = i29 + 1;
                            Class cls19 = (Class) arrayList9.get(i29);
                            Class clsM10310k9 = C5703g.m10310k(next5, this.f23166h, null);
                            cls9 = AbstractC3931b.class;
                            Class<AbstractC3931b> clsM51a09 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls9));
                            if (clsM10310k9.equals(clsM51a09 != null ? clsM51a09 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls19, clsM10310k9)) {
                                i29 = i30;
                            }
                        } else {
                            z19 = true;
                        }
                    }
                }
                return Boolean.valueOf(z19);
            default:
                Set set9 = (Set) obj;
                Member memberMo8594a2 = ((C4276c) obj2).mo8594a();
                AnnotatedElement annotatedElement2 = memberMo8594a2 instanceof AnnotatedElement ? (AnnotatedElement) memberMo8594a2 : null;
                boolean z20 = false;
                if (annotatedElement2 == null || (declaredAnnotations2 = annotatedElement2.getDeclaredAnnotations()) == null) {
                    declaredAnnotations2 = new Annotation[0];
                }
                ArrayList arrayList10 = new ArrayList(declaredAnnotations2.length);
                for (Annotation annotation4 : declaredAnnotations2) {
                    Class clsMo3818a4 = AbstractC0000a.m31Q(annotation4).mo3818a();
                    clsMo3818a4.getClass();
                    arrayList10.add(clsMo3818a4);
                }
                Set set10 = set9;
                if (set10.size() == arrayList10.size()) {
                    Iterator it8 = set10.iterator();
                    int i31 = 0;
                    while (true) {
                        if (it8.hasNext()) {
                            Object next6 = it8.next();
                            int i32 = i31 + 1;
                            Class cls20 = (Class) arrayList10.get(i31);
                            Class clsM10310k10 = C5703g.m10310k(next6, this.f23166h, null);
                            cls10 = AbstractC3931b.class;
                            Class<AbstractC3931b> clsM51a010 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls10));
                            if (clsM10310k10.equals(clsM51a010 != null ? clsM51a010 : AbstractC3931b.class) || AbstractC1416l.m3825a(cls20, clsM10310k10)) {
                                i31 = i32;
                            }
                        } else {
                            z20 = true;
                        }
                    }
                }
                zEquals = !z20;
                return Boolean.valueOf(zEquals);
        }
    }
}
