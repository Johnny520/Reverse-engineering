package p000;

/* JADX INFO: renamed from: dz */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0147dz implements t23, Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC0147dz abstractC0147dz) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC0147dz.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : mo626e(abstractC0147dz);
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo626e(AbstractC0147dz abstractC0147dz);

    /* JADX INFO: renamed from: f */
    public abstract String mo24f();
}
