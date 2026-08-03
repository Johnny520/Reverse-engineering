package p000a;

import java.util.Comparator;

/* JADX INFO: renamed from: a.d5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0532d5<T> implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0513c5 f1923a;

    public C0532d5(C0513c5 c0513c5) {
        this.f1923a = c0513c5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        this.f1923a.getClass();
        return C0889w1.m2147f(Integer.valueOf(C0513c5.m1263f((String) t2)), Integer.valueOf(C0513c5.m1263f((String) t)));
    }
}
