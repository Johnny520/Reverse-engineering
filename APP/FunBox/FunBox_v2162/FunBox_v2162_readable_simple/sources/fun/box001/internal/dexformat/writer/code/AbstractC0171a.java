package fun.box001.internal.dexformat.writer.code;

import fun.box001.internal.dexformat.output.InterfaceC0209k;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171a implements InterfaceC0209k, Comparable {
    /* JADX INFO: renamed from: b */
    public final int m425b(AbstractC0171a r3) {
        Class<?> r0 = getClass();
        Class<?> r1 = r3.getClass();
        if (r0 == r1) goto L7;
        return r0.getName().compareTo(r1.getName());
    L7:
        return mo426e(r3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return m425b((AbstractC0171a) r1);
    }

    /* JADX INFO: renamed from: e */
    protected abstract int mo426e(AbstractC0171a r1);

    /* JADX INFO: renamed from: f */
    public abstract String mo427f();
}
