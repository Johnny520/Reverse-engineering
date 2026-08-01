package p236s3;

import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;
import p214o3.C2799b;
import p214o3.InterfaceC2798a;
import p225q3.InterfaceC2933d;

/* JADX INFO: renamed from: s3.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3194j {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2933d[] f9952a = new InterfaceC2933d[0];

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2798a[] f9953b = new InterfaceC2798a[0];

    /* JADX INFO: renamed from: a */
    public static final Set m5459a(InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(interfaceC2933d, "<this>");
        if (interfaceC2933d instanceof InterfaceC3188d) {
            return ((InterfaceC3188d) interfaceC2933d).mo5458g();
        }
        HashSet hashSet = new HashSet(interfaceC2933d.mo5133d());
        int iMo5133d = interfaceC2933d.mo5133d();
        for (int i5 = 0; i5 < iMo5133d; i5++) {
            hashSet.add(interfaceC2933d.mo5134e(i5));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2933d[] m5460b(List list) {
        InterfaceC2933d[] interfaceC2933dArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC2933dArr = (InterfaceC2933d[]) list.toArray(new InterfaceC2933d[0])) == null) ? f9952a : interfaceC2933dArr;
    }

    /* JADX INFO: renamed from: c */
    public static final int m5461c(InterfaceC2933d interfaceC2933d, InterfaceC2933d[] interfaceC2933dArr) {
        AbstractC1665j.m2985e(interfaceC2933dArr, "typeParams");
        int iHashCode = (interfaceC2933d.mo5131b().hashCode() * 31) + Arrays.hashCode(interfaceC2933dArr);
        int iMo5133d = interfaceC2933d.mo5133d();
        int i5 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo5133d > 0)) {
                break;
            }
            int i6 = iMo5133d - 1;
            int i7 = i5 * 31;
            String strMo5131b = interfaceC2933d.mo5138j(interfaceC2933d.mo5133d() - iMo5133d).mo5131b();
            if (strMo5131b != null) {
                iHashCode2 = strMo5131b.hashCode();
            }
            i5 = i7 + iHashCode2;
            iMo5133d = i6;
        }
        int iMo5133d2 = interfaceC2933d.mo5133d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo5133d2 > 0)) {
                return (((iHashCode * 31) + i5) * 31) + iHashCode3;
            }
            int i8 = iMo5133d2 - 1;
            int i9 = iHashCode3 * 31;
            AbstractC1924f abstractC1924fMo5132c = interfaceC2933d.mo5138j(interfaceC2933d.mo5133d() - iMo5133d2).mo5132c();
            iHashCode3 = i9 + (abstractC1924fMo5132c != null ? abstractC1924fMo5132c.hashCode() : 0);
            iMo5133d2 = i8;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m5462d(int i5, int i6, InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i7 = (~i5) & i6;
        for (int i8 = 0; i8 < 32; i8++) {
            if ((i7 & 1) != 0) {
                arrayList.add(interfaceC2933d.mo5134e(i8));
            }
            i7 >>>= 1;
        }
        String strMo5131b = interfaceC2933d.mo5131b();
        AbstractC1665j.m2985e(strMo5131b, "serialName");
        throw new C2799b(arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strMo5131b + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strMo5131b + "', but they were missing", null, arrayList, strMo5131b);
    }

    /* JADX INFO: renamed from: e */
    public static final String m5463e(InterfaceC2933d interfaceC2933d) {
        return AbstractC0973m.m2016W(AbstractC1926h.m3557J(0, interfaceC2933d.mo5133d()), ", ", interfaceC2933d.mo5131b() + '(', ")", new C3197m(0, interfaceC2933d), 24);
    }
}
