package p147d1;

import java.util.ArrayList;
import p011B4.AbstractC0231b;
import p164g1.AbstractC2179a;

/* JADX INFO: renamed from: d1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1962l {

    /* JADX INFO: renamed from: b */
    public static final C1962l f6640b = new C1962l(0);

    /* JADX INFO: renamed from: c */
    public static final C1962l f6641c = new C1962l(1);

    /* JADX INFO: renamed from: d */
    public static final C1962l f6642d = new C1962l(2);

    /* JADX INFO: renamed from: a */
    public final int f6643a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1962l(int i5) {
        this.f6643a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1962l) {
            return this.f6643a == ((C1962l) obj).f6643a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6643a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i5 = this.f6643a;
        if (i5 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i5 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i5 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return AbstractC0231b.m402m(new StringBuilder("TextDecoration["), AbstractC2179a.m4007a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
