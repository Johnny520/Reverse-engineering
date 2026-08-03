package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qg.y f11119a = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.main.delay"
            int r1 = vg.s.f14359a
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L11
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L17
            qg.w r0 = qg.w.f11113p
            goto L21
        L17:
            xg.e r0 = qg.c0.f11038a
            rg.e r0 = vg.m.f14353a
            rg.e r1 = r0.f11960l
            if (r0 != 0) goto L21
            qg.w r0 = qg.w.f11113p
        L21:
            qg.x.f11119a = r0
            return
    }
}
