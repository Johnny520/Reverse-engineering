package p319vf;

import java.util.Comparator;

/* JADX INFO: renamed from: vf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4551a implements Comparator {

    /* JADX INFO: renamed from: h */
    public static final C4551a f15010h = new C4551a(0);

    /* JADX INFO: renamed from: i */
    public static final C4551a f15011i = new C4551a(1);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15012g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [vf.a.<clinit>():void] */
    public /* synthetic */ C4551a(int i9) {
        this.f15012g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15012g) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f15012g) {
            case 0:
                return f15011i;
            default:
                return f15010h;
        }
    }
}
