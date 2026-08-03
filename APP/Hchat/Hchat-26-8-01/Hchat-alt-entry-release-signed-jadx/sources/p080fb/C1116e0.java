package p080fb;

import java.util.List;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1116e0 {

    /* JADX INFO: renamed from: a */
    public final String f3662a;

    /* JADX INFO: renamed from: b */
    public final List f3663b;

    /* JADX INFO: renamed from: c */
    public final List f3664c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1116e0(String str, List list, List list2) {
        this.f3662a = str;
        this.f3663b = list;
        this.f3664c = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1116e0)) {
            return false;
        }
        C1116e0 c1116e0 = (C1116e0) obj;
        return this.f3662a.equals(c1116e0.f3662a) && this.f3663b.equals(c1116e0.f3663b) && this.f3664c.equals(c1116e0.f3664c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3664c.hashCode() + AbstractC2091b.m5158e(this.f3663b, this.f3662a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ReadResult(context=" + this.f3662a + ", imagePaths=" + this.f3663b + ", notes=" + this.f3664c + ")";
    }
}
