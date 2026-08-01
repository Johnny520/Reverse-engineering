package ac;

import java.util.Arrays;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: ac.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0236x {
    /* JADX INFO: renamed from: f */
    public static final int m578f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* JADX INFO: renamed from: g */
    public static final Object[] m579g(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC5102r.m20665q(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC5102r.m20660l(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: h */
    public static final Object[] m580h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC5102r.m20665q(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC5102r.m20660l(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: i */
    public static final Object[] m581i(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC5102r.m20665q(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC5102r.m20660l(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: j */
    public static final Object[] m582j(Object[] objArr, int i10, int i11, C0232t c0232t) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC5102r.m20665q(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC5102r.m20660l(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i11 - 2] = c0232t;
        AbstractC5102r.m20660l(objArr, objArr2, i11 - 1, i11, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: k */
    public static final Object[] m583k(Object[] objArr, int i10, int i11, Object obj, Object obj2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        AbstractC5102r.m20660l(objArrCopyOf, objArrCopyOf, i10 + 2, i10 + 1, objArr.length);
        AbstractC5102r.m20660l(objArrCopyOf, objArrCopyOf, i11 + 2, i11, i10);
        objArrCopyOf[i11] = obj;
        objArrCopyOf[i11 + 1] = obj2;
        return objArrCopyOf;
    }
}
