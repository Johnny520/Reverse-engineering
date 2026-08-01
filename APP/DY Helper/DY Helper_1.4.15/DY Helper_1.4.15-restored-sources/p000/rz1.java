package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class rz1 {

    /* JADX INFO: renamed from: α */
    public static final /* synthetic */ int f9635 = 0;

    static {
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.Class<pd2> r1 = p000.pd2.class
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
            java.lang.Class<q8> r0 = p000.AbstractC0715q8.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L35:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L3c
            goto L3e
        L3c:
            java.lang.String r0 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
        L3e:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class<rz1> r0 = p000.rz1.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L47
            goto L4e
        L47:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L4e:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L55
            goto L57
        L55:
            java.lang.String r0 = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
        L57:
            java.lang.String r0 = (java.lang.String) r0
            return
    }
}
