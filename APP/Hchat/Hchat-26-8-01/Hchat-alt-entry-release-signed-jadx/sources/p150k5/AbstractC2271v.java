package p150k5;

import java.util.Objects;

/* JADX INFO: renamed from: k5.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2271v implements Comparable {
    /* JADX INFO: renamed from: a */
    public abstract String mo5497a();

    /* JADX INFO: renamed from: b */
    public abstract int mo5498b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        AbstractC2271v abstractC2271v = (AbstractC2271v) obj;
        String strMo5497a = mo5497a();
        if (strMo5497a == null) {
            if (abstractC2271v.mo5497a() != null) {
                return 1;
            }
        } else {
            if (abstractC2271v.mo5497a() == null) {
                return -1;
            }
            int iCompareTo = strMo5497a.compareTo(abstractC2271v.mo5497a());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.compare(mo5498b(), abstractC2271v.mo5498b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC2271v)) {
            return false;
        }
        AbstractC2271v abstractC2271v = (AbstractC2271v) obj;
        return Objects.equals(mo5497a(), abstractC2271v.mo5497a()) && mo5498b() == abstractC2271v.mo5498b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String strMo5497a = mo5497a();
        return mo5498b() + ((strMo5497a == null ? 0 : strMo5497a.hashCode()) * 31);
    }
}
