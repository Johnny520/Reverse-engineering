package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexformat.output.InterfaceC0209k;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171a implements InterfaceC0209k, Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC0171a abstractC0171a) {
        Class<?> cls = getClass();
        Class<?> cls2 = abstractC0171a.getClass();
        return cls != cls2 ? cls.getName().compareTo(cls2.getName()) : mo426e(abstractC0171a);
    }

    /* JADX INFO: renamed from: e */
    protected abstract int mo426e(AbstractC0171a abstractC0171a);

    /* JADX INFO: renamed from: f */
    public abstract String mo427f();
}
