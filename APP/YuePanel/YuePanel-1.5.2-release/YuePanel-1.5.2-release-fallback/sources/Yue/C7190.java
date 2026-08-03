package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7190 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String m27678(char r5) {
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            Yue.C3329.m13904(r0, r1)
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            java.lang.String r3 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            Yue.C3329.m13905(r0, r3)
            int r3 = r0.length()
            r4 = 1
            if (r3 <= r4) goto L4d
            r3 = 329(0x149, float:4.61E-43)
            if (r5 != r3) goto L20
            goto L4c
        L20:
            r5 = 0
            char r5 = r0.charAt(r5)
            Yue.C3329.m13904(r0, r1)
            java.lang.String r0 = r0.substring(r4)
            java.lang.String r3 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r0, r3)
            Yue.C3329.m13904(r0, r1)
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            Yue.C3329.m13905(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L4c:
            return r0
        L4d:
            char r5 = java.lang.Character.toTitleCase(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            return r5
    }
}
