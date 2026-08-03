package z5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i5.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f22559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f22560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.List f22561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f22562m;

    public b(java.lang.String r1, java.util.List r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f22559j = r1
            r0.f22560k = r3
            a2.a r1 = a6.a.f58a
            r1.getClass()
            if (r2 != 0) goto L11
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            goto L52
        L11:
            boolean r1 = r2 instanceof java.util.List
            if (r1 == 0) goto L31
            java.util.Iterator r1 = r2.iterator()
        L19:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = r3 instanceof java.lang.String
            if (r3 != 0) goto L19
            goto L31
        L2a:
            java.util.List r2 = (java.util.List) r2
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            goto L52
        L31:
            java.util.Iterator r1 = r2.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L3a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r1.next()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            goto L3a
        L4e:
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
        L52:
            r0.f22561l = r1
            r0.f22562m = r4
            return
    }

    public static z5.b i1(i5.b r4) {
            boolean r0 = r4 instanceof z5.b
            if (r0 == 0) goto L7
            z5.b r4 = (z5.b) r4
            return r4
        L7:
            z5.b r0 = new z5.b
            java.lang.String r1 = r4.f1()
            java.lang.String r2 = r4.getName()
            java.util.List r3 = r4.g1()
            java.lang.String r4 = r4.h1()
            r0.<init>(r1, r3, r2, r4)
            return r0
    }

    @Override // i5.b
    public final java.lang.String f1() {
            r1 = this;
            java.lang.String r0 = r1.f22559j
            return r0
    }

    @Override // i5.b
    public final java.util.List g1() {
            r1 = this;
            java.util.List r0 = r1.f22561l
            return r0
    }

    @Override // i5.b
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f22560k
            return r0
    }

    @Override // i5.b
    public final java.lang.String h1() {
            r1 = this;
            java.lang.String r0 = r1.f22562m
            return r0
    }
}
