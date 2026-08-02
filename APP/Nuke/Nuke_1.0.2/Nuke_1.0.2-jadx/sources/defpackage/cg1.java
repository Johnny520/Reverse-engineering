package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cg1 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ yf1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ cg1(yf1 yf1Var, int i) {
        this.h = i;
        this.i = yf1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        boolean zL;
        int i = this.h;
        boolean z = false;
        yf1 yf1Var = this.i;
        switch (i) {
            case 0:
                zL = t11.l(((rg1) obj2).c.getReturnType(), tl.c0(obj, yf1Var, "Method: returnType"));
                return Boolean.valueOf(zL);
            case 1:
                zL = t11.l(((gi0) obj2).c.getType(), tl.c0(obj, yf1Var, "Field: type"));
                return Boolean.valueOf(zL);
            case 2:
                List list = (List) obj;
                Member member = ((bh0) obj2).b;
                member.getClass();
                List listT0 = mg.t0(((Executable) member).getParameterTypes());
                if (list.size() == listT0.size()) {
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            Class cls = (Class) listT0.get(i2);
                            Class clsC0 = tl.c0(next, yf1Var, null);
                            Class clsA = p40.A(d72.a(j93.class));
                            if (clsA == null) {
                                clsA = j93.class;
                            }
                            if (clsC0.equals(clsA) || t11.l(cls, clsC0)) {
                                i2 = i3;
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                List list2 = (List) obj;
                Member member2 = ((bh0) obj2).b;
                member2.getClass();
                Annotation[][] parameterAnnotations = ((Executable) member2).getParameterAnnotations();
                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                for (Annotation[] annotationArr : parameterAnnotations) {
                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                    for (Annotation annotation : annotationArr) {
                        arrayList2.add(p40.y(p40.v(annotation)));
                    }
                    arrayList.add(arrayList2);
                }
                if (list2.size() == arrayList.size()) {
                    Iterator it2 = list2.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            int i5 = i4 + 1;
                            if (tl.r((Collection) it2.next(), (List) arrayList.get(i4), yf1Var)) {
                                i4 = i5;
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                List list3 = (List) obj;
                Member member3 = ((bh0) obj2).b;
                member3.getClass();
                Annotation[][] parameterAnnotations2 = ((Executable) member3).getParameterAnnotations();
                ArrayList arrayList3 = new ArrayList(parameterAnnotations2.length);
                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                    ArrayList arrayList4 = new ArrayList(annotationArr2.length);
                    for (Annotation annotation2 : annotationArr2) {
                        arrayList4.add(p40.y(p40.v(annotation2)));
                    }
                    arrayList3.add(arrayList4);
                }
                if (list3.size() == arrayList3.size()) {
                    Iterator it3 = list3.iterator();
                    int i6 = 0;
                    while (it3.hasNext()) {
                        int i7 = i6 + 1;
                        if (tl.r((Collection) it3.next(), (List) arrayList3.get(i6), yf1Var)) {
                            i6 = i7;
                        }
                    }
                    z = true;
                }
                zL = !z;
                return Boolean.valueOf(zL);
            case 5:
                List list4 = (List) obj;
                Member member4 = ((bh0) obj2).b;
                member4.getClass();
                List listT02 = mg.t0(((Executable) member4).getParameterTypes());
                if (list4.size() == listT02.size()) {
                    int i8 = 0;
                    for (Object obj3 : list4) {
                        int i9 = i8 + 1;
                        Class cls2 = (Class) listT02.get(i8);
                        Class clsC02 = tl.c0(obj3, yf1Var, null);
                        Class clsA2 = p40.A(d72.a(j93.class));
                        if (clsA2 == null) {
                            clsA2 = j93.class;
                        }
                        if (clsC02.equals(clsA2) || t11.l(cls2, clsC02)) {
                            i8 = i9;
                        }
                    }
                    z = true;
                }
                zL = !z;
                return Boolean.valueOf(zL);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                Set set = (Set) obj;
                Member member5 = ((bh0) obj2).b;
                member5.getClass();
                List listT03 = mg.t0(((Executable) member5).getExceptionTypes());
                if (set.size() == listT03.size()) {
                    Iterator it4 = set.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i11 = i10 + 1;
                            Class cls3 = (Class) listT03.get(i10);
                            Class clsC03 = tl.c0(next2, yf1Var, null);
                            Class clsA3 = p40.A(d72.a(j93.class));
                            if (clsA3 == null) {
                                clsA3 = j93.class;
                            }
                            if (clsC03.equals(clsA3) || t11.l(cls3, clsC03)) {
                                i10 = i11;
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                Set set2 = (Set) obj;
                Member member6 = ((bh0) obj2).b;
                member6.getClass();
                List listT04 = mg.t0(((Executable) member6).getExceptionTypes());
                if (set2.size() == listT04.size()) {
                    int i12 = 0;
                    for (Object obj4 : set2) {
                        int i13 = i12 + 1;
                        Class cls4 = (Class) listT04.get(i12);
                        Class clsC04 = tl.c0(obj4, yf1Var, null);
                        Class clsA4 = p40.A(d72.a(j93.class));
                        if (clsA4 == null) {
                            clsA4 = j93.class;
                        }
                        if (clsC04.equals(clsA4) || t11.l(cls4, clsC04)) {
                            i12 = i13;
                        }
                    }
                    z = true;
                }
                zL = !z;
                return Boolean.valueOf(zL);
            case 8:
                Set set3 = (Set) obj;
                Annotation[] annotationArrA = ((wf1) obj2).a();
                ArrayList arrayList5 = new ArrayList(annotationArrA.length);
                for (Annotation annotation3 : annotationArrA) {
                    arrayList5.add(p40.y(p40.v(annotation3)));
                }
                Set set4 = set3;
                if (set4.size() == arrayList5.size()) {
                    Iterator it5 = set4.iterator();
                    int i14 = 0;
                    while (true) {
                        if (it5.hasNext()) {
                            Object next3 = it5.next();
                            int i15 = i14 + 1;
                            Class cls5 = (Class) arrayList5.get(i14);
                            Class clsC05 = tl.c0(next3, yf1Var, null);
                            Class clsA5 = p40.A(d72.a(j93.class));
                            if (clsA5 == null) {
                                clsA5 = j93.class;
                            }
                            if (clsC05.equals(clsA5) || t11.l(cls5, clsC05)) {
                                i14 = i15;
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                Set set5 = (Set) obj;
                Annotation[] annotationArrA2 = ((wf1) obj2).a();
                ArrayList arrayList6 = new ArrayList(annotationArrA2.length);
                for (Annotation annotation4 : annotationArrA2) {
                    arrayList6.add(p40.y(p40.v(annotation4)));
                }
                Set set6 = set5;
                if (set6.size() == arrayList6.size()) {
                    int i16 = 0;
                    for (Object obj5 : set6) {
                        int i17 = i16 + 1;
                        Class cls6 = (Class) arrayList6.get(i16);
                        Class clsC06 = tl.c0(obj5, yf1Var, null);
                        Class clsA6 = p40.A(d72.a(j93.class));
                        if (clsA6 == null) {
                            clsA6 = j93.class;
                        }
                        if (clsC06.equals(clsA6) || t11.l(cls6, clsC06)) {
                            i16 = i17;
                        }
                    }
                    z = true;
                }
                zL = !z;
                return Boolean.valueOf(zL);
        }
    }
}
