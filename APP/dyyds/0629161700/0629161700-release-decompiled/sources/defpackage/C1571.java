package defpackage;

/* JADX INFO: renamed from: ᛸᲁᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1571 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.Map f6947 = null;

    static {
            java.lang.String r0 = "http.agent"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Ld
            goto L3d
        Ld:
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length()
            r2.<init>(r3)
            r3 = 0
        L1b:
            if (r3 >= r1) goto L39
            char r4 = r0.charAt(r3)
            r5 = 31
            if (r4 > r5) goto L29
            r5 = 9
            if (r4 != r5) goto L31
        L29:
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 >= r5) goto L31
            r2.append(r4)
            goto L36
        L31:
            r4 = 63
            r2.append(r4)
        L36:
            int r3 = r3 + 1
            goto L1b
        L39:
            java.lang.String r0 = r2.toString()
        L3d:
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 2
            r1.<init>(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L57
            ᲇᛶᲁᛲ r2 = new ᲇᛶᲁᛲ
            r2.<init>(r0)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            java.lang.String r2 = "User-Agent"
            r1.put(r2, r0)
        L57:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            defpackage.C1571.f6947 = r0
            return
    }
}
