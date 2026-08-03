package p347xa;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: xa.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5754o {

    /* JADX INFO: renamed from: a */
    public final List f23423a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f23424b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5754o(ArrayList arrayList, List list) {
        this.f23423a = list;
        this.f23424b = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5754o)) {
            return false;
        }
        C5754o c5754o = (C5754o) obj;
        return this.f23423a.equals(c5754o.f23423a) && this.f23424b.equals(c5754o.f23424b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f23424b.hashCode() + (this.f23423a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SnsAvatarMenuMethods(createMethods=" + this.f23423a + ", clickMethods=" + this.f23424b + ")";
    }
}
