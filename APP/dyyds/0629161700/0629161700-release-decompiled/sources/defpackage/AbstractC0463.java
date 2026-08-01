package defpackage;

/* JADX INFO: renamed from: ᛳᛴᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0463 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.List f2338 = null;

    static {
            r0 = 0
            r1 = 1
            java.lang.String r2 = "java.sql.Date"
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto L35
            ᛳᛴᲀᛵ r2 = new ᛳᛴᲀᛵ
            java.lang.Class<java.sql.Date> r3 = java.sql.Date.class
            r2.<init>(r3, r0)
            ᛳᛴᲀᛵ r2 = new ᛳᛴᲀᛵ
            java.lang.Class<java.sql.Timestamp> r3 = java.sql.Timestamp.class
            r2.<init>(r3, r1)
            r2 = 3
            ᛷᲈᲀᲈ[] r2 = new defpackage.InterfaceC1405[r2]
            ᛶᛱᛶ$ᛷᲁᛳᛳ r3 = defpackage.C1009.f4479
            r2[r0] = r3
            ᲀᲈᲈᲈ$ᛷᲁᛳᛳ r0 = defpackage.C1789.f7871
            r2[r1] = r0
            ᛸᛷᲈᲈ r0 = defpackage.C0148.f1112
            r1 = 2
            r2[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            defpackage.AbstractC0463.f2338 = r0
            goto L39
        L35:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            defpackage.AbstractC0463.f2338 = r0
        L39:
            return
    }
}
