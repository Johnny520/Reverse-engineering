package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dm1 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final dm1 f2113b = new dm1(0);

    /* JADX INFO: renamed from: c */
    public static final dm1 f2114c = new dm1(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2115a;

    public /* synthetic */ dm1(int i) {
        this.f2115a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2115a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f2115a) {
            case 0:
                return f2114c;
            default:
                return f2113b;
        }
    }
}
