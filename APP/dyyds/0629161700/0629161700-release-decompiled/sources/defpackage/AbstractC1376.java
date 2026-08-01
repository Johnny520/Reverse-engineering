package defpackage;

/* JADX INFO: renamed from: ᛷᲁᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1376 extends defpackage.AbstractC1865 {
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public static void m2542(java.util.ArrayList r1, java.lang.Iterable r2) {
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto La
            java.util.Collection r2 = (java.util.Collection) r2
            r1.addAll(r2)
            return
        La:
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto Le
        L1c:
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static void m2543(java.util.AbstractCollection r0, java.lang.Object[] r1) {
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.addAll(r1)
            return
    }
}
