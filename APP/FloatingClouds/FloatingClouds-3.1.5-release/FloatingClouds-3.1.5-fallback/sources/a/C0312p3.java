package a;

/* JADX INFO: renamed from: a.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0312p3 extends a.C0294o3 {
    public static <T> int g0(java.lang.Iterable<? extends T> r1, int r2) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L10
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            return r1
        L10:
            return r2
    }
}
