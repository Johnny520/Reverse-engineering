package a;

import java.lang.Enum;

/* JADX INFO: renamed from: a.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118e6<T extends java.lang.Enum<T>> extends a.AbstractC0433w<T> implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T[] f451a;

    public C0118e6(T[] r1) {
            r0 = this;
            r0.<init>()
            r0.f451a = r1
            return
    }

    @Override // a.AbstractC0397u
    public final int a() {
            r1 = this;
            T extends java.lang.Enum<T>[] r0 = r1.f451a
            int r0 = r0.length
            return r0
    }

    @Override // a.AbstractC0397u, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L1f
        L5:
            java.lang.Enum r4 = (java.lang.Enum) r4
            java.lang.String r0 = "element"
            a.C0193i9.e(r4, r0)
            T extends java.lang.Enum<T>[] r0 = r3.f451a
            int r1 = r4.ordinal()
            if (r1 < 0) goto L1a
            int r2 = r0.length
            if (r1 >= r2) goto L1a
            r0 = r0[r1]
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != r4) goto L1f
            r4 = 1
            return r4
        L1f:
            r4 = 0
            return r4
    }

    @Override // java.util.List
    public final java.lang.Object get(int r5) {
            r4 = this;
            T extends java.lang.Enum<T>[] r0 = r4.f451a
            int r1 = r0.length
            if (r5 < 0) goto La
            if (r5 >= r1) goto La
            r5 = r0[r5]
            return r5
        La:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "index: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ", size: "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // a.AbstractC0433w, java.util.List
    public final int indexOf(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L1e
        L5:
            java.lang.Enum r4 = (java.lang.Enum) r4
            java.lang.String r0 = "element"
            a.C0193i9.e(r4, r0)
            int r0 = r4.ordinal()
            T extends java.lang.Enum<T>[] r1 = r3.f451a
            if (r0 < 0) goto L1a
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            r1 = r1[r0]
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != r4) goto L1e
            return r0
        L1e:
            r4 = -1
            return r4
    }

    @Override // a.AbstractC0433w, java.util.List
    public final int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            java.lang.Enum r2 = (java.lang.Enum) r2
            java.lang.String r0 = "element"
            a.C0193i9.e(r2, r0)
            int r2 = r1.indexOf(r2)
            return r2
    }
}
