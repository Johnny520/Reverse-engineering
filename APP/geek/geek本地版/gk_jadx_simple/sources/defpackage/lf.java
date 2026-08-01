package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class lf {
    public static final eg a = null;

    static {
        int r1 = r50.a;
        String r0 = System.getProperty("kotlinx.coroutines.main.delay");     // Catch: SecurityException -> L5
    L6:
        if (r0 == null) goto L8;
        boolean r02 = Boolean.parseBoolean(r0);
    L9:
        if (r02 == true) goto L11;
        eg r03 = kf.i;
    L14:
        a = r03;
        return;
    L11:
        xf r04 = wg.a;
        jo r05 = ls.a;
        jo r12 = r05.e;
        r03 = r05;
        if (r05 != null) goto L14;
        r03 = kf.i;
        goto L14
    L8:
        r02 = false;
    L5:
        r0 = null;
        goto L6
    }
}
