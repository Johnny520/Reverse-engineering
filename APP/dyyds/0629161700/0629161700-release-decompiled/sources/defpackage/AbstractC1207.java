package defpackage;

/* JADX INFO: renamed from: ᛷᛱᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1207 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final int f5448 = 0;

    static {
            java.lang.String r0 = "java.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            r2 = -1
            java.lang.String r3 = "[._]"
            r4 = 3
            java.lang.String[] r3 = r0.split(r3, r4)     // Catch: java.lang.NumberFormatException -> L22
            r4 = r3[r1]     // Catch: java.lang.NumberFormatException -> L22
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L22
            r5 = 1
            if (r4 != r5) goto L23
            int r6 = r3.length     // Catch: java.lang.NumberFormatException -> L22
            if (r6 <= r5) goto L23
            r3 = r3[r5]     // Catch: java.lang.NumberFormatException -> L22
            int r4 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L22
            goto L23
        L22:
            r4 = r2
        L23:
            if (r4 != r2) goto L4b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L4a
            r3.<init>()     // Catch: java.lang.NumberFormatException -> L4a
        L2a:
            int r4 = r0.length()     // Catch: java.lang.NumberFormatException -> L4a
            if (r1 >= r4) goto L40
            char r4 = r0.charAt(r1)     // Catch: java.lang.NumberFormatException -> L4a
            boolean r5 = java.lang.Character.isDigit(r4)     // Catch: java.lang.NumberFormatException -> L4a
            if (r5 == 0) goto L40
            r3.append(r4)     // Catch: java.lang.NumberFormatException -> L4a
            int r1 = r1 + 1
            goto L2a
        L40:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.NumberFormatException -> L4a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L4a
            r4 = r0
            goto L4b
        L4a:
            r4 = r2
        L4b:
            if (r4 != r2) goto L4e
            r4 = 6
        L4e:
            defpackage.AbstractC1207.f5448 = r4
            return
    }
}
