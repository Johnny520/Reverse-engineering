package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gx0 extends p000.AbstractC1099 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4500;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f4501;

    public gx0(p000.ix0 r2) {
            r1 = this;
            r0 = 0
            r1.f4500 = r0
            r1.<init>()
            r1.f4501 = r2
            return
    }

    public gx0(java.util.List r2) {
            r1 = this;
            r0 = 1
            r1.f4500 = r0
            r2.getClass()
            r1.<init>()
            r1.f4501 = r2
            return
    }

    @Override // p000.AbstractC1089, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f4500
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.contains(r2)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r1 = 0
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = super.contains(r2)
        L16:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r5) {
            r4 = this;
            int r0 = r4.f4500
            switch(r0) {
                case 0: goto L40;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f4501
            java.util.List r0 = (java.util.List) r0
            if (r5 < 0) goto L1b
            int r1 = p000.AbstractC1021yh.m6858(r4)
            if (r5 > r1) goto L1b
            int r4 = p000.AbstractC1021yh.m6858(r4)
            int r4 = r4 - r5
            java.lang.Object r4 = r0.get(r4)
            return r4
        L1b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Element index "
            java.lang.String r2 = " must be in range ["
            java.lang.StringBuilder r5 = p000.a12.m19(r5, r1, r2)
            xm0 r1 = new xm0
            int r4 = p000.AbstractC1021yh.m6858(r4)
            r2 = 1
            r3 = 0
            r1.<init>(r3, r4, r2)
            r5.append(r1)
            java.lang.String r4 = "]."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.<init>(r4)
            throw r0
        L40:
            java.lang.Object r4 = r4.f4501
            ix0 r4 = (p000.ix0) r4
            java.util.regex.Matcher r4 = r4.f5234
            java.lang.String r4 = r4.group(r5)
            if (r4 != 0) goto L4e
            java.lang.String r4 = ""
        L4e:
            return r4
    }

    @Override // p000.AbstractC1099, java.util.List
    public /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f4500
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.indexOf(r2)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r1 = -1
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = super.indexOf(r2)
        L16:
            return r1
    }

    @Override // p000.AbstractC1099, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f4500
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.util.Iterator r2 = super.iterator()
            return r2
        La:
            ko1 r0 = new ko1
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p000.AbstractC1099, java.util.List
    public /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f4500
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.lastIndexOf(r2)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r1 = -1
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = super.lastIndexOf(r2)
        L16:
            return r1
    }

    @Override // p000.AbstractC1099, java.util.List
    public java.util.ListIterator listIterator() {
            r2 = this;
            int r0 = r2.f4500
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.util.ListIterator r2 = super.listIterator()
            return r2
        La:
            ko1 r0 = new ko1
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p000.AbstractC1099, java.util.List
    public java.util.ListIterator listIterator(int r2) {
            r1 = this;
            int r0 = r1.f4500
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.util.ListIterator r1 = super.listIterator(r2)
            return r1
        La:
            ko1 r0 = new ko1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p000.AbstractC1089
    /* JADX INFO: renamed from: α */
    public final int mo2340() {
            r1 = this;
            int r0 = r1.f4500
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f4501
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            return r1
        Le:
            java.lang.Object r1 = r1.f4501
            ix0 r1 = (p000.ix0) r1
            java.util.regex.Matcher r1 = r1.f5234
            int r1 = r1.groupCount()
            int r1 = r1 + 1
            return r1
    }
}
