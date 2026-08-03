package p041d1;

import gg.AbstractC1416l;
import java.util.Comparator;
import p136j8.C2104o;
import p339x1.AbstractC5618k;
import p339x1.C5602f0;

/* JADX INFO: renamed from: d1.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0657d0 implements Comparator {

    /* JADX INFO: renamed from: g */
    public static final C0657d0 f2031g = new C0657d0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0653b0 c0653b0 = (C0653b0) obj;
        C0653b0 c0653b02 = (C0653b0) obj2;
        int i9 = 0;
        if (AbstractC0656d.m1826r(c0653b0) && AbstractC0656d.m1826r(c0653b02)) {
            C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0);
            C5602f0 c5602f0M10167w2 = AbstractC5618k.m10167w(c0653b02);
            if (!AbstractC1416l.m3825a(c5602f0M10167w, c5602f0M10167w2)) {
                Object[] objArr = new C5602f0[16];
                int i10 = 0;
                while (c5602f0M10167w != null) {
                    int i11 = i10 + 1;
                    if (objArr.length < i11) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i11, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i10 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i10 + 0);
                    }
                    objArr[0] = c5602f0M10167w;
                    i10++;
                    c5602f0M10167w = c5602f0M10167w.m10049u();
                }
                Object[] objArr3 = new C5602f0[16];
                int i12 = 0;
                while (c5602f0M10167w2 != null) {
                    int i13 = i12 + 1;
                    if (objArr3.length < i13) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i13, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i12 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i12 + 0);
                    }
                    objArr3[0] = c5602f0M10167w2;
                    i12++;
                    c5602f0M10167w2 = c5602f0M10167w2.m10049u();
                }
                int iMin = Math.min(i10 - 1, i12 - 1);
                if (iMin >= 0) {
                    while (AbstractC1416l.m3825a(objArr[i9], objArr3[i9])) {
                        if (i9 != iMin) {
                            i9++;
                        }
                    }
                    return AbstractC1416l.m3827c(((C5602f0) objArr[i9]).m10050v(), ((C5602f0) objArr3[i9]).m10050v());
                }
                C2104o.m5276A("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (AbstractC0656d.m1826r(c0653b0)) {
                return -1;
            }
            if (AbstractC0656d.m1826r(c0653b02)) {
                return 1;
            }
        }
        return 0;
    }
}
