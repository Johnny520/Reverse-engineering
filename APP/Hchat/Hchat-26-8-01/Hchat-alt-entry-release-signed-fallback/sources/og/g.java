package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends tf.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f9825h;

    public g(java.util.List r2) {
            r1 = this;
            r0 = 1
            r1.f9824g = r0
            r2.getClass()
            r1.<init>()
            r1.f9825h = r2
            return
    }

    public g(og.i r2) {
            r1 = this;
            r0 = 0
            r1.f9824g = r0
            r1.<init>()
            r1.f9825h = r2
            return
    }

    @Override // tf.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f9824g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.contains(r2)
            return r2
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r2 = 0
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = super.contains(r2)
        L16:
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            int r0 = r1.f9824g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f9825h
            java.util.List r0 = (java.util.List) r0
            int r2 = tf.m.k1(r2, r1)
            java.lang.Object r2 = r0.get(r2)
            return r2
        L12:
            java.lang.Object r0 = r1.f9825h
            og.i r0 = (og.i) r0
            java.util.regex.Matcher r0 = r0.f9828a
            java.lang.String r2 = r0.group(r2)
            if (r2 != 0) goto L20
            java.lang.String r2 = ""
        L20:
            return r2
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            int r0 = r1.f9824g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f9825h
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            return r0
        Le:
            java.lang.Object r0 = r1.f9825h
            og.i r0 = (og.i) r0
            java.util.regex.Matcher r0 = r0.f9828a
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }

    @Override // tf.f, java.util.List
    public /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f9824g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r2 = super.indexOf(r2)
            return r2
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r2 = -1
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = super.indexOf(r2)
        L16:
            return r2
    }

    @Override // tf.f, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.f9824g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.util.Iterator r0 = super.iterator()
            return r0
        La:
            tf.z r0 = new tf.z
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // tf.f, java.util.List
    public /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f9824g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r2 = super.lastIndexOf(r2)
            return r2
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r2 = -1
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = super.lastIndexOf(r2)
        L16:
            return r2
    }

    @Override // tf.f, java.util.List
    public java.util.ListIterator listIterator() {
            r2 = this;
            int r0 = r2.f9824g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.util.ListIterator r0 = super.listIterator()
            return r0
        La:
            tf.z r0 = new tf.z
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // tf.f, java.util.List
    public java.util.ListIterator listIterator(int r2) {
            r1 = this;
            int r0 = r1.f9824g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.util.ListIterator r2 = super.listIterator(r2)
            return r2
        La:
            tf.z r0 = new tf.z
            r0.<init>(r1, r2)
            return r0
    }
}
