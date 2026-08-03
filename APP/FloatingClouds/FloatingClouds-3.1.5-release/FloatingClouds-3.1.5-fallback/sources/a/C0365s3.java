package a;

/* JADX INFO: renamed from: a.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0365s3 extends a.C0347r3 {
    public static void h0(java.util.AbstractCollection r1, java.util.Collection r2) {
            java.lang.String r0 = "elements"
            a.C0193i9.e(r2, r0)
            r1.addAll(r2)
            return
    }

    public static void i0(java.util.List r6, a.D7 r7) {
            boolean r0 = r6 instanceof java.util.RandomAccess
            r1 = 1
            if (r0 != 0) goto L33
            boolean r0 = r6 instanceof a.InterfaceC0336q9
            if (r0 == 0) goto L15
            boolean r0 = r6 instanceof a.InterfaceC0353r9
            if (r0 == 0) goto Le
            goto L15
        Le:
            java.lang.String r7 = "kotlin.collections.MutableIterable"
            a.Kf.c(r6, r7)
            r6 = 0
            throw r6
        L15:
            java.util.Iterator r6 = r6.iterator()
        L19:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r6.next()
            java.lang.Object r0 = r7.f(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r1) goto L19
            r6.remove()
            goto L19
        L33:
            int r0 = a.C0294o3.c0(r6)
            r2 = 0
            if (r0 < 0) goto L59
            r3 = r2
        L3b:
            java.lang.Object r4 = r6.get(r2)
            java.lang.Object r5 = r7.f(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != r1) goto L4c
            goto L53
        L4c:
            if (r3 == r2) goto L51
            r6.set(r3, r4)
        L51:
            int r3 = r3 + 1
        L53:
            if (r2 == r0) goto L58
            int r2 = r2 + 1
            goto L3b
        L58:
            r2 = r3
        L59:
            int r7 = r6.size()
            if (r2 >= r7) goto L6d
            int r7 = a.C0294o3.c0(r6)
            if (r2 > r7) goto L6d
        L65:
            r6.remove(r7)
            if (r7 == r2) goto L6d
            int r7 = r7 + (-1)
            goto L65
        L6d:
            return
    }

    public static void j0(java.util.List r2, java.util.Comparator r3) {
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto La
            java.util.Collections.sort(r2, r3)
        La:
            return
    }
}
