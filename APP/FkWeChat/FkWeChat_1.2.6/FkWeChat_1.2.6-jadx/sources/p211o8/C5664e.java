package p211o8;

import java.util.Comparator;

/* JADX INFO: renamed from: o8.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5664e implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final C5664e f17791a = new C5664e();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C5663d.f17790a;
    }
}
