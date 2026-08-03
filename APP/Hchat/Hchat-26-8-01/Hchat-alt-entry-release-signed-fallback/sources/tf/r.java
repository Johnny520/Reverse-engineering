package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends tf.q {
    public static void h1(java.util.Collection r1, java.lang.Iterable r2) {
            r1.getClass()
            r2.getClass()
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            return
        L10:
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto L14
        L22:
            return
    }

    public static boolean i1(fg.l r7, java.util.List r8) {
            r8.getClass()
            boolean r0 = r8 instanceof java.util.RandomAccess
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L39
            boolean r0 = r8 instanceof hg.a
            if (r0 == 0) goto L19
            boolean r0 = r8 instanceof hg.b
            if (r0 == 0) goto L12
            goto L19
        L12:
            java.lang.String r7 = "kotlin.collections.MutableIterable"
            gg.x.f(r8, r7)
            r7 = 0
            throw r7
        L19:
            java.util.Iterator r8 = r8.iterator()
        L1d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r8.next()
            java.lang.Object r0 = r7.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L1d
            r8.remove()
            r2 = r1
            goto L1d
        L38:
            return r2
        L39:
            int r0 = r8.size()
            int r0 = r0 - r1
            if (r0 < 0) goto L5f
            r3 = r2
            r4 = r3
        L42:
            java.lang.Object r5 = r8.get(r3)
            java.lang.Object r6 = r7.invoke(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != r1) goto L53
            goto L5a
        L53:
            if (r4 == r3) goto L58
            r8.set(r4, r5)
        L58:
            int r4 = r4 + 1
        L5a:
            if (r3 == r0) goto L60
            int r3 = r3 + 1
            goto L42
        L5f:
            r4 = r2
        L60:
            int r7 = r8.size()
            if (r4 >= r7) goto L76
            int r7 = r8.size()
            int r7 = r7 - r1
            if (r4 > r7) goto L75
        L6d:
            r8.remove(r7)
            if (r7 == r4) goto L75
            int r7 = r7 + (-1)
            goto L6d
        L75:
            return r1
        L76:
            return r2
    }

    public static java.lang.Object j1(java.util.AbstractList r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.remove(r0)
            return r1
    }
}
