package a;

/* JADX INFO: renamed from: a.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0099d5<T> implements java.util.Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.C0081c5 f432a;

    public C0099d5(a.C0081c5 r1) {
            r0 = this;
            r0.<init>()
            r0.f432a = r1
            return
    }

    @Override // java.util.Comparator
    public final int compare(T r2, T r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            a.c5 r0 = r1.f432a
            r0.getClass()
            int r3 = a.C0081c5.f(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = a.C0081c5.f(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = a.C0435w1.f(r3, r2)
            return r2
    }
}
