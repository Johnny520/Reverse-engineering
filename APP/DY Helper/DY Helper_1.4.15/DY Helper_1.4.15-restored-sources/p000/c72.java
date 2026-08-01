package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class c72 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f1985 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.String[] f1986 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.lang.String[] f1987 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.c72.f1985 = r0
            java.lang.String r0 = "userId"
            java.lang.String r1 = "id"
            java.lang.String r2 = "uid"
            java.lang.String r3 = "user_id"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            p000.c72.f1986 = r0
            java.lang.String r0 = "sec_uid"
            java.lang.String r1 = "secUid"
            java.lang.String r2 = "sec_user_id"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            p000.c72.f1987 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m1146(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto Lc
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto Ld
        Lc:
            r2 = r0
        Ld:
            if (r2 != 0) goto L11
            java.lang.String r2 = ""
        L11:
            int r1 = r2.length()
            if (r1 <= 0) goto L20
            java.lang.String r1 = "null"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L20
            return r2
        L20:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m1147(android.content.Intent r6, java.lang.String[] r7) {
            r0 = 0
            if (r6 != 0) goto L5
            goto L61
        L5:
            int r1 = r7.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L29
            r4 = r7[r3]
            java.lang.String r4 = r6.getStringExtra(r4)     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L18:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L1d
            r4 = r0
        L1d:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = m1146(r4)
            if (r4 == 0) goto L26
            return r4
        L26:
            int r3 = r3 + 1
            goto L8
        L29:
            android.net.Uri r6 = r6.getData()     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            r6 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r6)
            r6 = r1
        L35:
            boolean r1 = r6 instanceof p000.eo1
            if (r1 == 0) goto L3a
            r6 = r0
        L3a:
            android.net.Uri r6 = (android.net.Uri) r6
            if (r6 != 0) goto L3f
            goto L61
        L3f:
            int r1 = r7.length
        L40:
            if (r2 >= r1) goto L61
            r3 = r7[r2]
            java.lang.String r3 = r6.getQueryParameter(r3)     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L50:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L55
            r3 = r0
        L55:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = m1146(r3)
            if (r3 == 0) goto L5e
            return r3
        L5e:
            int r2 = r2 + 1
            goto L40
        L61:
            return r0
    }
}
