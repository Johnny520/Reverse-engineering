package a;

/* JADX INFO: renamed from: a.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0480ya extends a.AbstractC0397u<a.C0444wa> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.Z7 f770a;

    public C0480ya(a.Z7 r1) {
            r0 = this;
            r0.<init>()
            r0.f770a = r1
            return
    }

    @Override // a.AbstractC0397u
    public final int a() {
            r1 = this;
            a.Z7 r0 = r1.f770a
            java.lang.Object r0 = r0.f371a
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }

    @Override // a.AbstractC0397u, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r2 instanceof a.C0444wa
        L6:
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            a.wa r2 = (a.C0444wa) r2
            boolean r2 = super.contains(r2)
            return r2
    }

    @Override // a.AbstractC0397u, java.util.Collection
    public final boolean isEmpty() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<a.C0444wa> iterator() {
            r4 = this;
            a.f9 r0 = new a.f9
            int r1 = r4.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r0.<init>(r3, r1, r2)
            a.M1 r1 = new a.M1
            r2 = 1
            r1.<init>(r2, r0)
            a.t r0 = new a.t
            r2 = 7
            r0.<init>(r2, r4)
            a.Bf r2 = new a.Bf
            r2.<init>(r1, r0)
            a.Bf$a r0 = new a.Bf$a
            r0.<init>(r2)
            return r0
    }
}
