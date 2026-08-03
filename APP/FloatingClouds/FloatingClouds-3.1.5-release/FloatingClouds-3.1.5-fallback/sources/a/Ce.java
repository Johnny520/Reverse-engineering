package a;

/* JADX INFO: loaded from: classes.dex */
public class Ce extends a.Be {
    public static java.lang.String W(java.lang.String r1) {
            int r0 = r1.length()
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L9
            r0 = 0
        L9:
            java.lang.String r1 = X(r1, r0)
            return r1
    }

    public static java.lang.String X(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            if (r2 < 0) goto L19
            int r0 = r1.length()
            if (r2 <= r0) goto Le
            r2 = r0
        Le:
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
            java.lang.String r2 = "substring(...)"
            a.C0193i9.d(r1, r2)
            return r1
        L19:
            java.lang.String r1 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = a.C0487z.c(r2, r1, r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static java.lang.String Y(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r1, r0)
            if (r2 < 0) goto L19
            int r0 = r1.length()
            if (r2 <= r0) goto Le
            r2 = r0
        Le:
            int r0 = r0 - r2
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r2 = "substring(...)"
            a.C0193i9.d(r1, r2)
            return r1
        L19:
            java.lang.String r1 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r1 = a.C0487z.c(r2, r1, r0)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }
}
