package p332wb;

import java.util.ArrayList;

/* JADX INFO: renamed from: wb.h5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4936h5 {

    /* JADX INFO: renamed from: a */
    public final String f17526a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f17527b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4936h5(String str, ArrayList arrayList) {
        this.f17526a = str;
        this.f17527b = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4936h5)) {
            return false;
        }
        C4936h5 c4936h5 = (C4936h5) obj;
        return this.f17526a.equals(c4936h5.f17526a) && this.f17527b.equals(c4936h5.f17527b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f17527b.hashCode() + (this.f17526a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MessageBlockBatchBindingEditorRequest(title=" + this.f17526a + ", bindings=" + this.f17527b + ")";
    }
}
