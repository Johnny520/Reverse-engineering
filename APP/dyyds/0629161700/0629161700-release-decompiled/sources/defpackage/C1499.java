package defpackage;

/* JADX INFO: renamed from: ᛸᛶᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1499 extends defpackage.C1580 implements java.util.Map {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C2349 f6597;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0499 f6598;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C2313 f6599;

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            ᛳᛶᛳᛷ r0 = r2.f6598
            if (r0 != 0) goto Lc
            ᛳᛶᛳᛷ r0 = new ᛳᛶᛳᛷ
            r1 = 2
            r0.<init>(r2, r1)
            r2.f6598 = r0
        Lc:
            return r0
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r1 = this;
            ᲈᛸᲁᲁ r0 = r1.f6599
            if (r0 != 0) goto Lb
            ᲈᛸᲁᲁ r0 = new ᲈᛸᲁᲁ
            r0.<init>(r1)
            r1.f6599 = r0
        Lb:
            return r0
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r3) {
            r2 = this;
            int r0 = r2.f6994
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.m2864(r1)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L12
        L2a:
            return
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            ᲈᲇᛳ r0 = r1.f6597
            if (r0 != 0) goto Lb
            ᲈᲇᛳ r0 = new ᲈᲇᛳ
            r0.<init>(r1)
            r1.f6597 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean m2699(java.util.Collection r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = super.containsKey(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final boolean m2700(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.f6994
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r3.next()
            super.remove(r1)
            goto L6
        L14:
            int r2 = r2.f6994
            if (r0 == r2) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }
}
