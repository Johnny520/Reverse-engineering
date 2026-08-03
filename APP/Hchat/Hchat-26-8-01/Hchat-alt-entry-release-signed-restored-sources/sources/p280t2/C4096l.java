package p280t2;

import java.util.ArrayList;
import p068eh.AbstractC0921a;
import p324w2.AbstractC4679a;

/* JADX INFO: renamed from: t2.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4096l {

    /* JADX INFO: renamed from: b */
    public static final C4096l f13558b = new C4096l(0);

    /* JADX INFO: renamed from: c */
    public static final C4096l f13559c = new C4096l(1);

    /* JADX INFO: renamed from: d */
    public static final C4096l f13560d = new C4096l(2);

    /* JADX INFO: renamed from: a */
    public final int f13561a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4096l(int i9) {
        this.f13561a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4096l) {
            return this.f13561a == ((C4096l) obj).f13561a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13561a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f13561a;
        if (i9 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i9 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i9 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return AbstractC0921a.m2254q(new StringBuilder("TextDecoration["), AbstractC4679a.m9170a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
