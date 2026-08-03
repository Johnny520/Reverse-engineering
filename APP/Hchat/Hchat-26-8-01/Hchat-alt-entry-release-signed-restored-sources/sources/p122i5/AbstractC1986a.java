package p122i5;

import java.io.IOException;
import java.io.StringWriter;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import p239q5.C3440a;
import p312v5.InterfaceC4479b;

/* JADX INFO: renamed from: i5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1986a extends AbstractC0000a implements InterfaceC4479b, Comparable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC1986a abstractC1986a) {
        int iCompareTo = mo4927f1().compareTo(abstractC1986a.mo4927f1());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = getName().compareTo(abstractC1986a.getName());
        return iCompareTo2 != 0 ? iCompareTo2 : getType().compareTo(abstractC1986a.getType());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC1986a)) {
            return false;
        }
        AbstractC1986a abstractC1986a = (AbstractC1986a) obj;
        return mo4927f1().equals(abstractC1986a.mo4927f1()) && getName().equals(abstractC1986a.getName()) && getType().equals(abstractC1986a.getType());
    }

    /* JADX INFO: renamed from: f1 */
    public abstract String mo4927f1();

    public abstract String getName();

    public abstract String getType();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return getType().hashCode() + ((getName().hashCode() + (mo4927f1().hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C3440a(stringWriter).mo2077h(this);
            return stringWriter.toString();
        } catch (IOException unused) {
            C2104o.m5281f("Unexpected IOException");
            return null;
        }
    }
}
