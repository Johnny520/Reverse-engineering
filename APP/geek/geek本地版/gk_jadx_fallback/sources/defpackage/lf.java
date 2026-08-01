package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class lf {
    public static final defpackage.eg a = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.main.delay"
            int r1 = defpackage.r50.a
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
            kf r0 = defpackage.kf.i
            goto L21
        L17:
            xf r0 = defpackage.wg.a
            jo r0 = defpackage.ls.a
            jo r1 = r0.e
            if (r0 != 0) goto L21
            kf r0 = defpackage.kf.i
        L21:
            defpackage.lf.a = r0
            return
    }
}
