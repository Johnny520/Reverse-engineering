package yyds;

import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: yyds.ᲇᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2409 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11844;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0903 f11845;

    public /* synthetic */ C2409(C0903 c0903, int i) {
        this.f11844 = i;
        this.f11845 = c0903;
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        boolean zM3188;
        int i = this.f11844;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        z = false;
        C0903 c0903 = this.f11845;
        switch (i) {
            case 0:
                List list = (List) obj;
                List listM3940 = AbstractC2070.m3940(((Executable) obj2).getParameterTypes());
                if (list.size() == listM3940.size()) {
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            Class cls = (Class) listM3940.get(i2);
                            Class clsM1094 = AbstractC0384.m1094(next, c0903, null);
                            Class clsM1450 = AbstractC0578.m1450(AbstractC1700.m3448(AbstractC0364.class));
                            if (clsM1450 == null) {
                                clsM1450 = AbstractC0364.class;
                            }
                            if (AbstractC1544.m3188(clsM1094, clsM1450) || AbstractC1544.m3188(cls, clsM1094)) {
                                i2 = i3;
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                List list2 = (List) obj;
                Annotation[][] parameterAnnotations = ((Executable) obj2).getParameterAnnotations();
                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                for (Annotation[] annotationArr : parameterAnnotations) {
                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                    for (Annotation annotation : annotationArr) {
                        arrayList2.add(AbstractC0578.m1456(annotation).mo3993());
                    }
                    arrayList.add(arrayList2);
                }
                if (list2.size() == arrayList.size()) {
                    Iterator it2 = list2.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            int i5 = i4 + 1;
                            if (AbstractC0384.m1092((Collection) it2.next(), (List) arrayList.get(i4), c0903)) {
                                i4 = i5;
                            }
                        } else {
                            z4 = true;
                        }
                    }
                }
                return Boolean.valueOf(z4);
            case 2:
                zM3188 = AbstractC1544.m3188(((Method) obj2).getReturnType(), AbstractC0384.m1094(obj, c0903, "Method: returnType"));
                return Boolean.valueOf(zM3188);
            case 3:
                List list3 = (List) obj;
                Annotation[][] parameterAnnotations2 = ((Executable) obj2).getParameterAnnotations();
                ArrayList arrayList3 = new ArrayList(parameterAnnotations2.length);
                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                    ArrayList arrayList4 = new ArrayList(annotationArr2.length);
                    for (Annotation annotation2 : annotationArr2) {
                        arrayList4.add(AbstractC0578.m1456(annotation2).mo3993());
                    }
                    arrayList3.add(arrayList4);
                }
                if (list3.size() == arrayList3.size()) {
                    Iterator it3 = list3.iterator();
                    int i6 = 0;
                    while (it3.hasNext()) {
                        int i7 = i6 + 1;
                        if (AbstractC0384.m1092((Collection) it3.next(), (List) arrayList3.get(i6), c0903)) {
                            i6 = i7;
                        }
                    }
                    z3 = true;
                }
                zM3188 = !z3;
                return Boolean.valueOf(zM3188);
            case 4:
                zM3188 = AbstractC0384.m1089(c0903, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3188);
            case 5:
                zM3188 = AbstractC0384.m1091(c0903, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3188);
            case 6:
                zM3188 = AbstractC0384.m1102(c0903, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3188);
            case 7:
                List list4 = (List) obj;
                List listM39402 = AbstractC2070.m3940(((Executable) obj2).getParameterTypes());
                if (list4.size() == listM39402.size()) {
                    int i8 = 0;
                    for (Object obj3 : list4) {
                        int i9 = i8 + 1;
                        Class cls2 = (Class) listM39402.get(i8);
                        Class clsM10942 = AbstractC0384.m1094(obj3, c0903, null);
                        Class clsM14502 = AbstractC0578.m1450(AbstractC1700.m3448(AbstractC0364.class));
                        if (clsM14502 == null) {
                            clsM14502 = AbstractC0364.class;
                        }
                        if (AbstractC1544.m3188(clsM10942, clsM14502) || AbstractC1544.m3188(cls2, clsM10942)) {
                            i8 = i9;
                        }
                    }
                    z3 = true;
                }
                zM3188 = !z3;
                return Boolean.valueOf(zM3188);
            case 8:
                zM3188 = AbstractC0384.m1100(c0903, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3188);
            case 9:
                zM3188 = AbstractC0384.m1101(c0903, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3188);
            case 10:
                zM3188 = AbstractC0384.m1090(c0903, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3188);
            case 11:
                zM3188 = AbstractC0384.m1088(c0903, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3188);
            case 12:
                zM3188 = AbstractC0384.m1095(c0903, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM3188);
            case 13:
                Set set = (Set) obj;
                List listM39403 = AbstractC2070.m3940(((Executable) obj2).getExceptionTypes());
                if (set.size() == listM39403.size()) {
                    Iterator it4 = set.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            int i11 = i10 + 1;
                            Class cls3 = (Class) listM39403.get(i10);
                            Class clsM10943 = AbstractC0384.m1094(next2, c0903, null);
                            Class clsM14503 = AbstractC0578.m1450(AbstractC1700.m3448(AbstractC0364.class));
                            if (clsM14503 == null) {
                                clsM14503 = AbstractC0364.class;
                            }
                            if (AbstractC1544.m3188(clsM10943, clsM14503) || AbstractC1544.m3188(cls3, clsM10943)) {
                                i10 = i11;
                            }
                        } else {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 14:
                Set set2 = (Set) obj;
                List listM39404 = AbstractC2070.m3940(((Executable) obj2).getExceptionTypes());
                if (set2.size() == listM39404.size()) {
                    int i12 = 0;
                    for (Object obj4 : set2) {
                        int i13 = i12 + 1;
                        Class cls4 = (Class) listM39404.get(i12);
                        Class clsM10944 = AbstractC0384.m1094(obj4, c0903, null);
                        Class clsM14504 = AbstractC0578.m1450(AbstractC1700.m3448(AbstractC0364.class));
                        if (clsM14504 == null) {
                            clsM14504 = AbstractC0364.class;
                        }
                        if (AbstractC1544.m3188(clsM10944, clsM14504) || AbstractC1544.m3188(cls4, clsM10944)) {
                            i12 = i13;
                        }
                    }
                    z3 = true;
                }
                zM3188 = !z3;
                return Boolean.valueOf(zM3188);
            case 15:
                Set set3 = (Set) obj;
                Annotation[] annotationArrM1098 = AbstractC0384.m1098((Member) obj2);
                ArrayList arrayList5 = new ArrayList(annotationArrM1098.length);
                for (Annotation annotation3 : annotationArrM1098) {
                    arrayList5.add(AbstractC0578.m1456(annotation3).mo3993());
                }
                zM3188 = AbstractC0384.m1092(set3, arrayList5, c0903);
                return Boolean.valueOf(zM3188);
            case 16:
                Set set4 = (Set) obj;
                Annotation[] annotationArrM10982 = AbstractC0384.m1098((Member) obj2);
                ArrayList arrayList6 = new ArrayList(annotationArrM10982.length);
                for (Annotation annotation4 : annotationArrM10982) {
                    arrayList6.add(AbstractC0578.m1456(annotation4).mo3993());
                }
                zM3188 = !AbstractC0384.m1092(set4, arrayList6, c0903);
                return Boolean.valueOf(zM3188);
            default:
                zM3188 = AbstractC1544.m3188(((Field) obj2).getType(), AbstractC0384.m1094(obj, c0903, "Field: type"));
                return Boolean.valueOf(zM3188);
        }
    }
}
