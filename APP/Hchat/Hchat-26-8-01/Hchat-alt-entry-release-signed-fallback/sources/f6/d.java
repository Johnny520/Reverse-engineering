package f6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f6.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f3312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient int f3313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f6.e f3314k;

    public d(f6.e r1, int r2, int r3) {
            r0 = this;
            r0.f3314k = r1
            r0.<init>()
            r0.f3312i = r2
            r0.f3313j = r3
            return
    }

    @Override // f6.a
    public final java.lang.Object[] b() {
            r1 = this;
            f6.e r0 = r1.f3314k
            java.lang.Object[] r0 = r0.b()
            return r0
    }

    @Override // f6.a
    public final int c() {
            r2 = this;
            f6.e r0 = r2.f3314k
            int r0 = r0.d()
            int r1 = r2.f3312i
            int r0 = r0 + r1
            int r1 = r2.f3313j
            int r0 = r0 + r1
            return r0
    }

    @Override // f6.a
    public final int d() {
            r2 = this;
            f6.e r0 = r2.f3314k
            int r0 = r0.d()
            int r1 = r2.f3312i
            int r0 = r0 + r1
            return r0
    }

    @Override // f6.a
    public final boolean e() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.f3313j
            oh.h.o(r2, r0)
            int r0 = r1.f3312i
            int r2 = r2 + r0
            f6.e r0 = r1.f3314k
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // f6.e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            f6.c r0 = r1.i(r0)
            return r0
    }

    @Override // f6.e
    public final f6.e j(int r2, int r3) {
            r1 = this;
            int r0 = r1.f3313j
            oh.h.p(r2, r3, r0)
            int r0 = r1.f3312i
            int r2 = r2 + r0
            int r3 = r3 + r0
            f6.e r0 = r1.f3314k
            f6.e r2 = r0.j(r2, r3)
            return r2
    }

    @Override // f6.e, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            f6.c r0 = r1.i(r0)
            return r0
    }

    @Override // f6.e, java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            f6.c r1 = r0.i(r1)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f3313j
            return r0
    }

    @Override // f6.e, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            f6.e r1 = r0.j(r1, r2)
            return r1
    }
}
