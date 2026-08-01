package defpackage;

/* JADX INFO: renamed from: ᛸᛱᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1418 implements java.lang.Iterable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.WeakHashMap f6207;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C0672 f6208;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0672 f6209;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f6210;

    public C1418() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f6207 = r0
            r0 = 0
            r1.f6210 = r0
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.C1418
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛸᛱᛴᲀ r6 = (defpackage.C1418) r6
            int r1 = r5.f6210
            int r3 = r6.f6210
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            ᲈᲁᛸᛶ r1 = (defpackage.C2340) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            ᲈᲁᛸᛶ r3 = (defpackage.C2340) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            ᲈᲁᛸᛶ r6 = (defpackage.C2340) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L5:
            r1 = r3
            ᲈᲁᛸᛶ r1 = (defpackage.C2340) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            goto L5
        L1a:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            ᲈᲁᛸᛶ r0 = new ᲈᲁᛸᛶ
            ᛴᛵᛳ r1 = r4.f6209
            ᛴᛵᛳ r2 = r4.f6208
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.WeakHashMap r4 = r4.f6207
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.put(r0, r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            r1 = r3
            ᲈᲁᛸᛶ r1 = (defpackage.C2340) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto Lb
            java.lang.String r1 = ", "
            r0.append(r1)
            goto Lb
        L2d:
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C0672 mo2601(java.lang.Object r2) {
            r1 = this;
            ᛴᛵᛳ r1 = r1.f6209
        L2:
            if (r1 == 0) goto L10
            java.lang.Object r0 = r1.f3255
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            ᛴᛵᛳ r1 = r1.f3253
            goto L2
        L10:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.Object mo2602(java.lang.Object r4) {
            r3 = this;
            ᛴᛵᛳ r4 = r3.mo2601(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.f6210
            int r1 = r1 + (-1)
            r3.f6210 = r1
            java.util.WeakHashMap r1 = r3.f6207
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2e
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            ᛷᛸᲈᛳ r2 = (defpackage.AbstractC1346) r2
            r2.mo793(r4)
            goto L1e
        L2e:
            ᛴᛵᛳ r1 = r4.f3256
            ᛴᛵᛳ r2 = r4.f3253
            if (r1 == 0) goto L37
            r1.f3253 = r2
            goto L39
        L37:
            r3.f6209 = r2
        L39:
            ᛴᛵᛳ r2 = r4.f3253
            if (r2 == 0) goto L40
            r2.f3256 = r1
            goto L42
        L40:
            r3.f6208 = r1
        L42:
            r4.f3253 = r0
            r4.f3256 = r0
            java.lang.Object r3 = r4.f3254
            return r3
    }
}
