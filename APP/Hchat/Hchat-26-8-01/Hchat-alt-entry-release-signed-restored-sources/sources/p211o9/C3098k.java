package p211o9;

import gg.AbstractC1416l;
import java.util.List;

/* JADX INFO: renamed from: o9.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3098k {

    /* JADX INFO: renamed from: a */
    public final String f10005a;

    /* JADX INFO: renamed from: b */
    public final List f10006b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3098k(String str, List list) {
        str.getClass();
        this.f10005a = str;
        this.f10006b = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3098k)) {
            return false;
        }
        C3098k c3098k = (C3098k) obj;
        return AbstractC1416l.m3825a(this.f10005a, c3098k.f10005a) && this.f10006b.equals(c3098k.f10006b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10006b.hashCode() + (this.f10005a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ParsedAtContent(content=" + this.f10005a + ", atList=" + this.f10006b + ")";
    }
}
