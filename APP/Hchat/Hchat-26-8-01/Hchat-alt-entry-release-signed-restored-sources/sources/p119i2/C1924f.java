package p119i2;

import java.util.Comparator;

/* JADX INFO: renamed from: i2.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1924f implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6512g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [be.k.<init>(i2.g, i2.n0, java.util.List, u2.c, m2.d):void, i2.g.<init>(java.util.List, java.lang.String):void] */
    public /* synthetic */ C1924f(int i9) {
        this.f6512g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6512g) {
        }
        return Integer.valueOf(((C1922e) obj).f6504b).compareTo(Integer.valueOf(((C1922e) obj2).f6504b));
    }
}
