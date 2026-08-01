package p108V3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: V3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1551d {

    /* JADX INFO: renamed from: a */
    public final String f5402a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1551d(String str) {
        AbstractC1665j.m2985e(str, "url");
        this.f5402a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1551d) && AbstractC1665j.m2981a(this.f5402a, ((C1551d) obj).f5402a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5402a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0231b.m400k("ExternalLinkRequest(url=", this.f5402a, ")");
    }
}
