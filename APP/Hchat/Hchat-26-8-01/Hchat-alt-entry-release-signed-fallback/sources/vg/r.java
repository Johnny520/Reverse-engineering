package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14358a = 0;

    static {
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.Class<a.a> r1 = a.a.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r2 = 0
            r0 = r0[r2]
            java.lang.StackTraceElement r2 = new java.lang.StackTraceElement
            java.lang.String r3 = "_COROUTINE."
            java.lang.String r1 = r3.concat(r1)
            java.lang.String r3 = r0.getFileName()
            int r0 = r0.getLineNumber()
            java.lang.String r4 = "_"
            r2.<init>(r1, r4, r3, r0)
            java.lang.Class<yf.a> r0 = yf.a.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L35:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L3c
            goto L3e
        L3c:
            java.lang.String r0 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
        L3e:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class<vg.r> r0 = vg.r.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L47
            goto L4e
        L47:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L4e:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L55
            goto L57
        L55:
            java.lang.String r0 = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
        L57:
            java.lang.String r0 = (java.lang.String) r0
            return
    }
}
