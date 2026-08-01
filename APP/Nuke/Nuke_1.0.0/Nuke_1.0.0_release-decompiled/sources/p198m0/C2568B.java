package p198m0;

import java.util.Comparator;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: m0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2568B implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final C2568B f8194a = new C2568B();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C2567A c2567a = (C2567A) obj;
        C2567A c2567a2 = (C2567A) obj2;
        int i5 = 0;
        if (AbstractC2573d.m4511r(c2567a) && AbstractC2573d.m4511r(c2567a2)) {
            C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567a);
            C0564I c0564iM1044t2 = AbstractC0601k.m1044t(c2567a2);
            if (!AbstractC1665j.m2981a(c0564iM1044t, c0564iM1044t2)) {
                Object[] objArr = new C0564I[16];
                int i6 = 0;
                while (c0564iM1044t != null) {
                    int i7 = i6 + 1;
                    if (objArr.length < i7) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i7, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i6 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i6 + 0);
                    }
                    objArr[0] = c0564iM1044t;
                    i6++;
                    c0564iM1044t = c0564iM1044t.m839u();
                }
                Object[] objArr3 = new C0564I[16];
                int i8 = 0;
                while (c0564iM1044t2 != null) {
                    int i9 = i8 + 1;
                    if (objArr3.length < i9) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i9, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i8 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i8 + 0);
                    }
                    objArr3[0] = c0564iM1044t2;
                    i8++;
                    c0564iM1044t2 = c0564iM1044t2.m839u();
                }
                int iMin = Math.min(i6 - 1, i8 - 1);
                if (iMin >= 0) {
                    while (AbstractC1665j.m2981a(objArr[i5], objArr3[i5])) {
                        if (i5 != iMin) {
                            i5++;
                        }
                    }
                    return AbstractC1665j.m2987g(((C0564I) objArr[i5]).m840v(), ((C0564I) objArr3[i5]).m840v());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (AbstractC2573d.m4511r(c2567a)) {
                return -1;
            }
            if (AbstractC2573d.m4511r(c2567a2)) {
                return 1;
            }
        }
        return 0;
    }
}
