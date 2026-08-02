package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cg1 implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1530h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ yf1 f1531i;

    public /* synthetic */ cg1(yf1 yf1Var, int i) {
        this.f1530h = i;
        this.f1531i = yf1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        boolean zM5086l;
        int i = this.f1530h;
        boolean z = false;
        yf1 yf1Var = this.f1531i;
        switch (i) {
            case 0:
                zM5086l = t11.m5086l(((rg1) obj2).f9553c.getReturnType(), AbstractC0738tl.m5303c0(obj, yf1Var, "Method: returnType"));
                return Boolean.valueOf(zM5086l);
            case 1:
                zM5086l = t11.m5086l(((gi0) obj2).f3532c.getType(), AbstractC0738tl.m5303c0(obj, yf1Var, "Field: type"));
                return Boolean.valueOf(zM5086l);
            case 2:
                List list = (List) obj;
                Member member = ((bh0) obj2).f853b;
                member.getClass();
                List listM3105t0 = AbstractC0460mg.m3105t0(((Executable) member).getParameterTypes());
                if (list.size() == listM3105t0.size()) {
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            Class cls = (Class) listM3105t0.get(i2);
                            Class clsM5303c0 = AbstractC0738tl.m5303c0(next, yf1Var, null);
                            Class clsM3691A = p40.m3691A(d72.m967a(j93.class));
                            if (clsM3691A == null) {
                                clsM3691A = j93.class;
                            }
                            if (clsM5303c0.equals(clsM3691A) || t11.m5086l(cls, clsM5303c0)) {
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
                Member member2 = ((bh0) obj2).f853b;
                member2.getClass();
                Annotation[][] parameterAnnotations = ((Executable) member2).getParameterAnnotations();
                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                for (Annotation[] annotationArr : parameterAnnotations) {
                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                    for (Annotation annotation : annotationArr) {
                        arrayList2.add(p40.m3741y(p40.m3738v(annotation)));
                    }
                    arrayList.add(arrayList2);
                }
                if (list2.size() == arrayList.size()) {
                    Iterator it2 = list2.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            int i5 = i4 + 1;
                            if (AbstractC0738tl.m5319r((Collection) it2.next(), (List) arrayList.get(i4), yf1Var)) {
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
                Member member3 = ((bh0) obj2).f853b;
                member3.getClass();
                Annotation[][] parameterAnnotations2 = ((Executable) member3).getParameterAnnotations();
                ArrayList arrayList3 = new ArrayList(parameterAnnotations2.length);
                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                    ArrayList arrayList4 = new ArrayList(annotationArr2.length);
                    for (Annotation annotation2 : annotationArr2) {
                        arrayList4.add(p40.m3741y(p40.m3738v(annotation2)));
                    }
                    arrayList3.add(arrayList4);
                }
                if (list3.size() == arrayList3.size()) {
                    Iterator it3 = list3.iterator();
                    int i6 = 0;
                    while (it3.hasNext()) {
                        int i7 = i6 + 1;
                        if (AbstractC0738tl.m5319r((Collection) it3.next(), (List) arrayList3.get(i6), yf1Var)) {
                            i6 = i7;
                        }
                    }
                    z = true;
                }
                zM5086l = !z;
                return Boolean.valueOf(zM5086l);
            case 5:
                List list4 = (List) obj;
                Member member4 = ((bh0) obj2).f853b;
                member4.getClass();
                List listM3105t02 = AbstractC0460mg.m3105t0(((Executable) member4).getParameterTypes());
                if (list4.size() == listM3105t02.size()) {
                    int i8 = 0;
                    for (Object obj3 : list4) {
                        int i9 = i8 + 1;
                        Class cls2 = (Class) listM3105t02.get(i8);
                        Class clsM5303c02 = AbstractC0738tl.m5303c0(obj3, yf1Var, null);
                        Class clsM3691A2 = p40.m3691A(d72.m967a(j93.class));
                        if (clsM3691A2 == null) {
                            clsM3691A2 = j93.class;
                        }
                        if (clsM5303c02.equals(clsM3691A2) || t11.m5086l(cls2, clsM5303c02)) {
                            i8 = i9;
                        }
                    }
                    z = true;
                }
                zM5086l = !z;
                return Boolean.valueOf(zM5086l);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                Set set = (Set) obj;
                Member member5 = ((bh0) obj2).f853b;
                member5.getClass();
                List listM3105t03 = AbstractC0460mg.m3105t0(((Executable) member5).getExceptionTypes());
                if (set.size() == listM3105t03.size()) {
                    Iterator it4 = set.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i11 = i10 + 1;
                            Class cls3 = (Class) listM3105t03.get(i10);
                            Class clsM5303c03 = AbstractC0738tl.m5303c0(next2, yf1Var, null);
                            Class clsM3691A3 = p40.m3691A(d72.m967a(j93.class));
                            if (clsM3691A3 == null) {
                                clsM3691A3 = j93.class;
                            }
                            if (clsM5303c03.equals(clsM3691A3) || t11.m5086l(cls3, clsM5303c03)) {
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
                Member member6 = ((bh0) obj2).f853b;
                member6.getClass();
                List listM3105t04 = AbstractC0460mg.m3105t0(((Executable) member6).getExceptionTypes());
                if (set2.size() == listM3105t04.size()) {
                    int i12 = 0;
                    for (Object obj4 : set2) {
                        int i13 = i12 + 1;
                        Class cls4 = (Class) listM3105t04.get(i12);
                        Class clsM5303c04 = AbstractC0738tl.m5303c0(obj4, yf1Var, null);
                        Class clsM3691A4 = p40.m3691A(d72.m967a(j93.class));
                        if (clsM3691A4 == null) {
                            clsM3691A4 = j93.class;
                        }
                        if (clsM5303c04.equals(clsM3691A4) || t11.m5086l(cls4, clsM5303c04)) {
                            i12 = i13;
                        }
                    }
                    z = true;
                }
                zM5086l = !z;
                return Boolean.valueOf(zM5086l);
            case 8:
                Set set3 = (Set) obj;
                Annotation[] annotationArrM5884a = ((wf1) obj2).m5884a();
                ArrayList arrayList5 = new ArrayList(annotationArrM5884a.length);
                for (Annotation annotation3 : annotationArrM5884a) {
                    arrayList5.add(p40.m3741y(p40.m3738v(annotation3)));
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
                            Class clsM5303c05 = AbstractC0738tl.m5303c0(next3, yf1Var, null);
                            Class clsM3691A5 = p40.m3691A(d72.m967a(j93.class));
                            if (clsM3691A5 == null) {
                                clsM3691A5 = j93.class;
                            }
                            if (clsM5303c05.equals(clsM3691A5) || t11.m5086l(cls5, clsM5303c05)) {
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
                Annotation[] annotationArrM5884a2 = ((wf1) obj2).m5884a();
                ArrayList arrayList6 = new ArrayList(annotationArrM5884a2.length);
                for (Annotation annotation4 : annotationArrM5884a2) {
                    arrayList6.add(p40.m3741y(p40.m3738v(annotation4)));
                }
                Set set6 = set5;
                if (set6.size() == arrayList6.size()) {
                    int i16 = 0;
                    for (Object obj5 : set6) {
                        int i17 = i16 + 1;
                        Class cls6 = (Class) arrayList6.get(i16);
                        Class clsM5303c06 = AbstractC0738tl.m5303c0(obj5, yf1Var, null);
                        Class clsM3691A6 = p40.m3691A(d72.m967a(j93.class));
                        if (clsM3691A6 == null) {
                            clsM3691A6 = j93.class;
                        }
                        if (clsM5303c06.equals(clsM3691A6) || t11.m5086l(cls6, clsM5303c06)) {
                            i16 = i17;
                        }
                    }
                    z = true;
                }
                zM5086l = !z;
                return Boolean.valueOf(zM5086l);
        }
    }
}
