package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic3 {

    /* JADX INFO: renamed from: a */
    public static sx0 f4559a;

    /* JADX INFO: renamed from: a */
    public static final Object[] m2327a(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC0460mg.m3091f0(objArr, objArr2, 0, i, 6);
        AbstractC0460mg.m3088c0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public static final Object[] m2328b(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC0460mg.m3091f0(objArr, objArr2, 0, i, 6);
        AbstractC0460mg.m3088c0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: c */
    public static final Object[] m2329c(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0460mg.m3091f0(objArr, objArr2, 0, i, 6);
        AbstractC0460mg.m3088c0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: d */
    public static final int m2330d(int i, int i2) {
        return (i >> i2) & 31;
    }
}
