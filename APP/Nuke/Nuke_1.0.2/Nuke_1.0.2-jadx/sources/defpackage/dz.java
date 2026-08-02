package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dz implements t23, Comparable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(dz dzVar) {
        Class<?> cls = getClass();
        Class<?> cls2 = dzVar.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : e(dzVar);
    }

    public abstract int e(dz dzVar);

    public abstract String f();
}
