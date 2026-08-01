package va;

/* JADX INFO: renamed from: va.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8889a implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC8889a abstractC8889a) {
        abstractC8889a.getClass();
        int iCompareTo = mo34074c().compareTo(abstractC8889a.mo34074c());
        if (iCompareTo == 0 && !mo34075g() && abstractC8889a.mo34075g()) {
            return 1;
        }
        return iCompareTo;
    }

    /* JADX INFO: renamed from: c */
    public abstract EnumC8890b mo34074c();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo34075g();
}
