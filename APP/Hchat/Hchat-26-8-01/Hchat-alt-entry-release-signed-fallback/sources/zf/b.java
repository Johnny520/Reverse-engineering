package zf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends tf.f implements zf.a, java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Enum[] f22681g;

    public b(java.lang.Enum[] r1) {
            r0 = this;
            r0.<init>()
            r0.f22681g = r1
            return
    }

    @Override // tf.a, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L17
        L5:
            java.lang.Enum r3 = (java.lang.Enum) r3
            java.lang.Enum[] r0 = r2.f22681g
            int r1 = r3.ordinal()
            java.lang.Object r0 = tf.l.C0(r1, r0)
            java.lang.Enum r0 = (java.lang.Enum) r0
            if (r0 != r3) goto L17
            r3 = 1
            return r3
        L17:
            r3 = 0
            return r3
    }

    @Override // java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            tf.c r0 = tf.f.Companion
            java.lang.Enum[] r1 = r3.f22681g
            int r2 = r1.length
            r0.getClass()
            tf.c.a(r4, r2)
            r4 = r1[r4]
            return r4
    }

    @Override // tf.a
    public final int getSize() {
            r1 = this;
            java.lang.Enum[] r0 = r1.f22681g
            int r0 = r0.length
            return r0
    }

    @Override // tf.f, java.util.List
    public final int indexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r0 = r4.ordinal()
            java.lang.Enum[] r2 = r3.f22681g
            java.lang.Object r2 = tf.l.C0(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r4) goto L17
            return r0
        L17:
            return r1
    }

    @Override // tf.f, java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r0 = r4.ordinal()
            java.lang.Enum[] r2 = r3.f22681g
            java.lang.Object r2 = tf.l.C0(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r4) goto L17
            return r0
        L17:
            return r1
    }
}
