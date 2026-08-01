package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class up1 implements java.lang.Iterable {

    /* JADX INFO: renamed from: ε */
    public p000.rp1 f10925;

    /* JADX INFO: renamed from: ζ */
    public p000.rp1 f10926;

    /* JADX INFO: renamed from: η */
    public final java.util.WeakHashMap f10927;

    /* JADX INFO: renamed from: θ */
    public int f10928;

    public up1() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f10927 = r0
            r0 = 0
            r1.f10928 = r0
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p000.up1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            up1 r6 = (p000.up1) r6
            int r1 = r5.f10928
            int r3 = r6.f10928
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            qp1 r1 = (p000.qp1) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            qp1 r3 = (p000.qp1) r3
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
            qp1 r6 = (p000.qp1) r6
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
            qp1 r1 = (p000.qp1) r1
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
            qp1 r0 = new qp1
            rp1 r1 = r4.f10925
            rp1 r2 = r4.f10926
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.util.WeakHashMap r4 = r4.f10927
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
            qp1 r1 = (p000.qp1) r1
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

    /* JADX INFO: renamed from: α */
    public p000.rp1 mo3105(java.lang.Object r2) {
            r1 = this;
            rp1 r1 = r1.f10925
        L2:
            if (r1 == 0) goto L10
            java.lang.Object r0 = r1.f9432
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            rp1 r1 = r1.f9434
            goto L2
        L10:
            return r1
    }

    /* JADX INFO: renamed from: β */
    public java.lang.Object mo3106(java.lang.Object r4) {
            r3 = this;
            rp1 r4 = r3.mo3105(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.f10928
            int r1 = r1 + (-1)
            r3.f10928 = r1
            java.util.WeakHashMap r1 = r3.f10927
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2e
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            tp1 r2 = (p000.tp1) r2
            r2.mo4940(r4)
            goto L1e
        L2e:
            rp1 r1 = r4.f9435
            rp1 r2 = r4.f9434
            if (r1 == 0) goto L37
            r1.f9434 = r2
            goto L39
        L37:
            r3.f10925 = r2
        L39:
            rp1 r2 = r4.f9434
            if (r2 == 0) goto L40
            r2.f9435 = r1
            goto L42
        L40:
            r3.f10926 = r1
        L42:
            r4.f9434 = r0
            r4.f9435 = r0
            java.lang.Object r3 = r4.f9433
            return r3
    }
}
