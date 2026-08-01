package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class xv1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f12329 = null;

    static {
            java.lang.String r0 = "下载音频"
            java.lang.String r0 = p000.w71.m6327(r0)
            java.lang.String r1 = "download_default"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.xv1.f12329 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.List m6786() {
            java.lang.String r0 = "share_panel_actions"
            java.lang.String r1 = ""
            java.lang.String r0 = p000.ui1.m5893(r0, r1)
            boolean r2 = p000.q02.m4671(r0)
            r3 = 0
            if (r2 == 0) goto L11
            goto L79
        L11:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            zt0 r0 = p000.AbstractC1021yh.m6893()     // Catch: java.lang.Throwable -> L2f
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L2f
            r5 = 0
            r6 = r5
        L20:
            if (r6 >= r4) goto L31
            java.lang.String r7 = r2.optString(r6, r1)     // Catch: java.lang.Throwable -> L2f
            r7.getClass()     // Catch: java.lang.Throwable -> L2f
            r0.add(r7)     // Catch: java.lang.Throwable -> L2f
            int r6 = r6 + 1
            goto L20
        L2f:
            r0 = move-exception
            goto L6b
        L31:
            zt0 r0 = p000.AbstractC1021yh.m6883(r0)     // Catch: java.lang.Throwable -> L2f
            r0.getClass()     // Catch: java.lang.Throwable -> L2f
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.util.ListIterator r0 = r0.listIterator(r5)     // Catch: java.lang.Throwable -> L2f
        L41:
            r2 = r0
            le0 r2 = (p000.le0) r2     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L66
            java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2f
            java.lang.CharSequence r2 = p000.q02.m4660(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2f
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L2f
            if (r4 <= 0) goto L5f
            goto L60
        L5f:
            r2 = r3
        L60:
            if (r2 == 0) goto L41
            r1.add(r2)     // Catch: java.lang.Throwable -> L2f
            goto L41
        L66:
            java.util.List r0 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> L2f
            goto L71
        L6b:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L71:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L76
            goto L77
        L76:
            r3 = r0
        L77:
            java.util.List r3 = (java.util.List) r3
        L79:
            if (r3 != 0) goto L7d
            java.util.List r3 = p000.xv1.f12329
        L7d:
            return r3
    }
}
