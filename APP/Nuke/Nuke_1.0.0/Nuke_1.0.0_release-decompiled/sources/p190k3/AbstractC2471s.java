package p190k3;

import p056K2.AbstractC0885k;
import p084Q2.AbstractC1176a;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;

/* JADX INFO: renamed from: k3.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2471s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f7959a = 0;

    static {
        Object objM3229o;
        Object objM3229o2;
        Exception exc = new Exception();
        String simpleName = AbstractC1785a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objM3229o = AbstractC1176a.class.getCanonicalName();
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (AbstractC0885k.m1902a(objM3229o) != null) {
            objM3229o = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objM3229o2 = AbstractC2471s.class.getCanonicalName();
        } catch (Throwable th2) {
            objM3229o2 = AbstractC1784a.m3229o(th2);
        }
        if (AbstractC0885k.m1902a(objM3229o2) != null) {
            objM3229o2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
