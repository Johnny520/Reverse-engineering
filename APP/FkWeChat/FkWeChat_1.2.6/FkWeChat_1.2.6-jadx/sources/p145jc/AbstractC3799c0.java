package p145jc;

import p000a.C0000a;
import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p257r8.AbstractC6532a;

/* JADX INFO: renamed from: jc.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3799c0 {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement f10972a = new C0000a().m0a();

    /* JADX INFO: renamed from: b */
    public static final String f10973b;

    /* JADX INFO: renamed from: c */
    public static final String f10974c;

    static {
        Object objM18798b;
        Object objM18798b2;
        try {
            C4712s.a aVar = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC6532a.class.getCanonicalName());
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        if (C4712s.m18801e(objM18798b) != null) {
            objM18798b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f10973b = (String) objM18798b;
        try {
            objM18798b2 = C4712s.m18798b(AbstractC3799c0.class.getCanonicalName());
        } catch (Throwable th2) {
            C4712s.a aVar3 = C4712s.f13928r;
            objM18798b2 = C4712s.m18798b(AbstractC4713t.m18807a(th2));
        }
        if (C4712s.m18801e(objM18798b2) != null) {
            objM18798b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f10974c = (String) objM18798b2;
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m15149a(Throwable th) {
        return th;
    }
}
