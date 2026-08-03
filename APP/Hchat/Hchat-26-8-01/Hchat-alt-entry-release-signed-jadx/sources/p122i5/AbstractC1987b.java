package p122i5;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import p000a.AbstractC0000a;
import p046d6.AbstractC0707d;
import p136j8.C2104o;
import p239q5.C3440a;
import p312v5.InterfaceC4479b;

/* JADX INFO: renamed from: i5.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1987b extends AbstractC0000a implements InterfaceC4479b, Comparable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC1987b abstractC1987b) {
        int iCompareTo = mo4929f1().compareTo(abstractC1987b.mo4929f1());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(abstractC1987b.getName());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int iCompareTo3 = mo4931h1().compareTo(abstractC1987b.mo4931h1());
        return iCompareTo3 != 0 ? iCompareTo3 : AbstractC0707d.m1875b(mo4930g1(), abstractC1987b.mo4930g1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AbstractC1987b)) {
            return false;
        }
        AbstractC1987b abstractC1987b = (AbstractC1987b) obj;
        return mo4929f1().equals(abstractC1987b.mo4929f1()) && getName().equals(abstractC1987b.getName()) && mo4931h1().equals(abstractC1987b.mo4931h1()) && AbstractC0707d.m1878e(mo4930g1(), abstractC1987b.mo4930g1());
    }

    /* JADX INFO: renamed from: f1 */
    public abstract String mo4929f1();

    /* JADX INFO: renamed from: g1 */
    public abstract List mo4930g1();

    public abstract String getName();

    /* JADX INFO: renamed from: h1 */
    public abstract String mo4931h1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return mo4930g1().hashCode() + ((mo4931h1().hashCode() + ((getName().hashCode() + (mo4929f1().hashCode() * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C3440a(stringWriter).mo2078i(this);
            return stringWriter.toString();
        } catch (IOException unused) {
            C2104o.m5281f("Unexpected IOException");
            return null;
        }
    }
}
