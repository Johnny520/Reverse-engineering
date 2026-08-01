package p069N2;

import java.util.Comparator;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: N2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1020b implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final C1020b f3162b = new C1020b(0);

    /* JADX INFO: renamed from: c */
    public static final C1020b f3163c = new C1020b(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3164a;

    public /* synthetic */ C1020b(int i5) {
        this.f3164a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3164a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC1665j.m2985e(comparable, "a");
                AbstractC1665j.m2985e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC1665j.m2985e(comparable3, "a");
                AbstractC1665j.m2985e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f3164a) {
            case 0:
                return f3163c;
            default:
                return f3162b;
        }
    }
}
