package p311v4;

import p376z4.InterfaceC6097k;

/* JADX INFO: renamed from: v4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4446a implements InterfaceC6097k, Comparable {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC4446a abstractC4446a) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC4446a.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : mo8896e(abstractC4446a);
    }

    /* JADX INFO: renamed from: e */
    public abstract int mo8896e(AbstractC4446a abstractC4446a);

    /* JADX INFO: renamed from: i */
    public abstract boolean mo8897i();

    /* JADX INFO: renamed from: j */
    public abstract String mo8898j();
}
