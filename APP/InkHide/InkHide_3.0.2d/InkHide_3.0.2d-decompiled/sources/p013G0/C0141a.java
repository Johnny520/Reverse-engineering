package p013G0;

import java.util.Comparator;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: G0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0141a implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final C0141a f440b = new C0141a(0);

    /* JADX INFO: renamed from: c */
    public static final C0141a f441c = new C0141a(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f442a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [G0.a.<clinit>():void] */
    public /* synthetic */ C0141a(int i2) {
        this.f442a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f442a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC0223g.m418e(comparable, "a");
                AbstractC0223g.m418e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC0223g.m418e(comparable3, "a");
                AbstractC0223g.m418e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f442a) {
            case 0:
                return f441c;
            default:
                return f440b;
        }
    }
}
