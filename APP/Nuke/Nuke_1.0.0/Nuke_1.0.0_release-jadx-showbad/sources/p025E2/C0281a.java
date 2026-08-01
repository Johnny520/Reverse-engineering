package p025E2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import me.dartcv.nuke.BuildConfig;
import p061L2.AbstractC0972l;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p179i4.AbstractC2352g;
import p275z2.C3516b;

/* JADX INFO: renamed from: E2.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0281a implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f906d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3516b f907e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0281a(C3516b c3516b, int i5) {
        this.f906d = i5;
        this.f907e = c3516b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        boolean zM490d;
        boolean zM490d2;
        switch (this.f906d) {
            case 0:
                zM490d = AbstractC0284d.m490d((List) obj, AbstractC0972l.m2007e0(((Executable) obj2).getParameterTypes()), this.f907e);
                return Boolean.valueOf(zM490d);
            case BuildConfig.VERSION_CODE /* 1 */:
                List list = (List) obj;
                Annotation[][] parameterAnnotations = ((Executable) obj2).getParameterAnnotations();
                ArrayList arrayList = new ArrayList(parameterAnnotations.length);
                boolean z5 = false;
                for (Annotation[] annotationArr : parameterAnnotations) {
                    ArrayList arrayList2 = new ArrayList(annotationArr.length);
                    for (Annotation annotation : annotationArr) {
                        arrayList2.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation)));
                    }
                    arrayList.add(arrayList2);
                }
                if (list.size() == arrayList.size()) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    for (Object obj3 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            AbstractC2352g.m4187J();
                            throw null;
                        }
                        if (AbstractC0284d.m490d((Collection) obj3, (List) arrayList.get(i5), this.f907e)) {
                            arrayList3.add(obj3);
                        }
                        i5 = i6;
                    }
                    if (arrayList3.size() == arrayList.size()) {
                        z5 = true;
                    }
                }
                return Boolean.valueOf(z5);
            case 2:
                zM490d = AbstractC1665j.m2981a(((Method) obj2).getReturnType(), AbstractC0284d.m504r(obj, this.f907e, "Method: returnType"));
                return Boolean.valueOf(zM490d);
            case 3:
                List list2 = (List) obj;
                Annotation[][] parameterAnnotations2 = ((Executable) obj2).getParameterAnnotations();
                ArrayList arrayList4 = new ArrayList(parameterAnnotations2.length);
                boolean z6 = false;
                for (Annotation[] annotationArr2 : parameterAnnotations2) {
                    ArrayList arrayList5 = new ArrayList(annotationArr2.length);
                    for (Annotation annotation2 : annotationArr2) {
                        arrayList5.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation2)));
                    }
                    arrayList4.add(arrayList5);
                }
                if (list2.size() == arrayList4.size()) {
                    ArrayList arrayList6 = new ArrayList();
                    int i7 = 0;
                    for (Object obj4 : list2) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            AbstractC2352g.m4187J();
                            throw null;
                        }
                        if (AbstractC0284d.m490d((Collection) obj4, (List) arrayList4.get(i7), this.f907e)) {
                            arrayList6.add(obj4);
                        }
                        i7 = i8;
                    }
                    if (arrayList6.size() == arrayList4.size()) {
                        z6 = true;
                    }
                }
                zM490d = !z6;
                return Boolean.valueOf(zM490d);
            case 4:
                zM490d = AbstractC0284d.m491e(this.f907e, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM490d);
            case 5:
                zM490d = AbstractC0284d.m492f(this.f907e, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM490d);
            case 6:
                zM490d = AbstractC0284d.m493g(this.f907e, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM490d);
            case 7:
                zM490d2 = AbstractC0284d.m490d((List) obj, AbstractC0972l.m2007e0(((Executable) obj2).getParameterTypes()), this.f907e);
                break;
            case 8:
                zM490d = AbstractC0284d.m494h(this.f907e, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM490d);
            case 9:
                zM490d = AbstractC0284d.m495i(this.f907e, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM490d);
            case 10:
                zM490d = AbstractC0284d.m496j(this.f907e, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM490d);
            case 11:
                zM490d = AbstractC0284d.m497k(this.f907e, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM490d);
            case 12:
                zM490d = AbstractC0284d.m498l(this.f907e, (Set) obj, (Executable) obj2);
                return Boolean.valueOf(zM490d);
            case 13:
                zM490d = AbstractC0284d.m490d((Set) obj, AbstractC0972l.m2007e0(((Executable) obj2).getExceptionTypes()), this.f907e);
                return Boolean.valueOf(zM490d);
            case 14:
                zM490d2 = AbstractC0284d.m490d((Set) obj, AbstractC0972l.m2007e0(((Executable) obj2).getExceptionTypes()), this.f907e);
                break;
            case 15:
                Set set = (Set) obj;
                Annotation[] annotationArrM500n = AbstractC0284d.m500n((Member) obj2);
                ArrayList arrayList7 = new ArrayList(annotationArrM500n.length);
                for (Annotation annotation3 : annotationArrM500n) {
                    arrayList7.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation3)));
                }
                zM490d = AbstractC0284d.m490d(set, arrayList7, this.f907e);
                return Boolean.valueOf(zM490d);
            case 16:
                Set set2 = (Set) obj;
                Annotation[] annotationArrM500n2 = AbstractC0284d.m500n((Member) obj2);
                ArrayList arrayList8 = new ArrayList(annotationArrM500n2.length);
                for (Annotation annotation4 : annotationArrM500n2) {
                    arrayList8.add(AbstractC1784a.m3238x(AbstractC1784a.m3235u(annotation4)));
                }
                zM490d2 = AbstractC0284d.m490d(set2, arrayList8, this.f907e);
                break;
            default:
                zM490d = AbstractC1665j.m2981a(((Field) obj2).getType(), AbstractC0284d.m504r(obj, this.f907e, "Field: type"));
                return Boolean.valueOf(zM490d);
        }
        zM490d = !zM490d2;
        return Boolean.valueOf(zM490d);
    }
}
