package defpackage;

/* JADX INFO: renamed from: ᛳᛶᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0499 extends java.util.AbstractSet {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.util.Map f2479;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2480;

    public /* synthetic */ C0499(java.util.Map r1, int r2) {
            r0 = this;
            r0.f2480 = r2
            r0.f2479 = r1
            r0.<init>()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
            r2 = this;
            int r0 = r2.f2480
            java.util.Map r1 = r2.f2479
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L7;
            }
        L7:
            super.clear()
            return
        Lb:
            ᛵᲇᛳᛳ r1 = (defpackage.C0977) r1
            r1.clear()
            return
        L11:
            ᛵᲇᛳᛳ r1 = (defpackage.C0977) r1
            r1.clear()
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f2480
            java.util.Map r1 = r3.f2479
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r3 = super.contains(r4)
            return r3
        Lc:
            ᛵᲇᛳᛳ r1 = (defpackage.C0977) r1
            boolean r3 = r1.containsKey(r4)
            return r3
        L13:
            boolean r3 = r4 instanceof java.util.Map.Entry
            r0 = 0
            if (r3 == 0) goto L3b
            ᛵᲇᛳᛳ r1 = (defpackage.C0977) r1
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r3 = r4.getKey()
            r2 = 0
            if (r3 == 0) goto L28
            ᛳᛸᛶᛷ r3 = r1.m1918(r3, r0)     // Catch: java.lang.ClassCastException -> L28
            goto L29
        L28:
            r3 = r2
        L29:
            if (r3 == 0) goto L38
            java.lang.Object r1 = r3.f2600
            java.lang.Object r4 = r4.getValue()
            boolean r4 = java.util.Objects.equals(r1, r4)
            if (r4 == 0) goto L38
            r2 = r3
        L38:
            if (r2 == 0) goto L3b
            r0 = 1
        L3b:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f2480
            java.util.Map r2 = r2.f2479
            switch(r0) {
                case 0: goto L18;
                case 1: goto Lf;
                default: goto L7;
            }
        L7:
            ᲇᲇᲀᲀ r0 = new ᲇᲇᲀᲀ
            ᛸᛶᛱᛲ r2 = (defpackage.C1499) r2
            r0.<init>(r2)
            return r0
        Lf:
            ᲀᲀᛲ r0 = new ᲀᲀᛲ
            ᛵᲇᛳᛳ r2 = (defpackage.C0977) r2
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L18:
            ᲀᲀᛲ r0 = new ᲀᲀᛲ
            ᛵᲇᛳᛳ r2 = (defpackage.C0977) r2
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f2480
            r1 = 0
            java.util.Map r2 = r5.f2479
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L20;
                case 1: goto Lf;
                default: goto La;
            }
        La:
            boolean r5 = super.remove(r6)
            return r5
        Lf:
            ᛵᲇᛳᛳ r2 = (defpackage.C0977) r2
            if (r6 == 0) goto L17
            ᛳᛸᛶᛷ r1 = r2.m1918(r6, r3)     // Catch: java.lang.ClassCastException -> L17
        L17:
            if (r1 == 0) goto L1c
            r2.m1917(r1, r4)
        L1c:
            if (r1 == 0) goto L1f
            r3 = r4
        L1f:
            return r3
        L20:
            ᛵᲇᛳᛳ r2 = (defpackage.C0977) r2
            boolean r5 = r6 instanceof java.util.Map.Entry
            if (r5 != 0) goto L27
            goto L4b
        L27:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r5 = r6.getKey()
            if (r5 == 0) goto L34
            ᛳᛸᛶᛷ r5 = r2.m1918(r5, r3)     // Catch: java.lang.ClassCastException -> L34
            goto L35
        L34:
            r5 = r1
        L35:
            if (r5 == 0) goto L44
            java.lang.Object r0 = r5.f2600
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r0, r6)
            if (r6 == 0) goto L44
            r1 = r5
        L44:
            if (r1 != 0) goto L47
            goto L4b
        L47:
            r2.m1917(r1, r4)
            r3 = r4
        L4b:
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            int r0 = r1.f2480
            java.util.Map r1 = r1.f2479
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            ᛸᛶᛱᛲ r1 = (defpackage.C1499) r1
            int r1 = r1.f6994
            return r1
        Lc:
            ᛵᲇᛳᛳ r1 = (defpackage.C0977) r1
            int r1 = r1.f4377
            return r1
        L11:
            ᛵᲇᛳᛳ r1 = (defpackage.C0977) r1
            int r1 = r1.f4377
            return r1
    }
}
