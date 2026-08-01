package p350y1;

import java.util.List;
import p185m8.AbstractC5114x;
import p265s1.AbstractC7105l3;
import p265s1.AbstractC7110m3;
import p265s1.AbstractC7133r1;
import p265s1.AbstractC7154v2;
import p265s1.AbstractC7168z0;
import p265s1.C7048a1;
import p265s1.C7128q1;

/* JADX INFO: renamed from: y1.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9527o {

    /* JADX INFO: renamed from: a */
    public static final List f32495a = AbstractC5114x.m20800o();

    /* JADX INFO: renamed from: b */
    public static final int f32496b = AbstractC7105l3.f23607a.m27996a();

    /* JADX INFO: renamed from: c */
    public static final int f32497c = AbstractC7110m3.f23617a.m28010b();

    /* JADX INFO: renamed from: d */
    public static final int f32498d = AbstractC7168z0.f23700a.m28333z();

    /* JADX INFO: renamed from: e */
    public static final long f32499e = C7128q1.f23644b.m28146g();

    /* JADX INFO: renamed from: f */
    public static final int f32500f = AbstractC7154v2.f23684a.m28243b();

    /* JADX INFO: renamed from: a */
    public static final int m37279a() {
        return f32500f;
    }

    /* JADX INFO: renamed from: b */
    public static final int m37280b() {
        return f32496b;
    }

    /* JADX INFO: renamed from: c */
    public static final int m37281c() {
        return f32497c;
    }

    /* JADX INFO: renamed from: d */
    public static final List m37282d() {
        return f32495a;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m37283e(long j10, long j11) {
        return C7128q1.m28136v(j10) == C7128q1.m28136v(j11) && C7128q1.m28135u(j10) == C7128q1.m28135u(j11) && C7128q1.m28133s(j10) == C7128q1.m28133s(j11);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m37284f(AbstractC7133r1 abstractC7133r1) {
        if (!(abstractC7133r1 instanceof C7048a1)) {
            return abstractC7133r1 == null;
        }
        C7048a1 c7048a1 = (C7048a1) abstractC7133r1;
        int iM27742b = c7048a1.m27742b();
        AbstractC7168z0.a aVar = AbstractC7168z0.f23700a;
        return AbstractC7168z0.m28276E(iM27742b, aVar.m28333z()) || AbstractC7168z0.m28276E(c7048a1.m27742b(), aVar.m28306B());
    }

    /* JADX INFO: renamed from: g */
    public static final long m37285g(long j10) {
        return C7128q1.m28132r(j10) == 1.0f ? j10 : C7128q1.m28129o(j10, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
