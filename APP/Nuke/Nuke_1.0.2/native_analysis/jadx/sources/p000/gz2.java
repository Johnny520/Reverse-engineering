package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gz2 {

    /* JADX INFO: renamed from: b */
    public static final gz2 f3746b = new gz2(0);

    /* JADX INFO: renamed from: c */
    public static final gz2 f3747c = new gz2(1);

    /* JADX INFO: renamed from: d */
    public static final gz2 f3748d = new gz2(2);

    /* JADX INFO: renamed from: a */
    public final int f3749a;

    public gz2(int i) {
        this.f3749a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gz2) {
            return this.f3749a == ((gz2) obj).f3749a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3749a;
    }

    public final String toString() {
        int i = this.f3749a;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return hk1.m2210i(new StringBuilder("TextDecoration["), sb1.m4781a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
