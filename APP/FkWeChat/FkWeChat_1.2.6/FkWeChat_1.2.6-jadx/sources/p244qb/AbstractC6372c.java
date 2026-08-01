package p244qb;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: qb.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6372c {
    /* JADX INFO: renamed from: a */
    public static final boolean m25355a(Throwable th) {
        th.getClass();
        Class<?> superclass = th.getClass();
        while (!AbstractC1061t.m3842c(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final RuntimeException m25356b(Throwable th) throws Throwable {
        th.getClass();
        throw th;
    }
}
