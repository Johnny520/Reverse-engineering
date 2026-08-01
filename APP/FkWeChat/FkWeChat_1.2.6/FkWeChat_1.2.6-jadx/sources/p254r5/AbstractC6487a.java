package p254r5;

import p309v5.InterfaceC8837s;

/* JADX INFO: renamed from: r5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6487a implements InterfaceC8837s, Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC6487a abstractC6487a) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC6487a.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : mo25727c(abstractC6487a);
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo25727c(AbstractC6487a abstractC6487a);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo25728h();

    /* JADX INFO: renamed from: j */
    public abstract String mo25729j();
}
