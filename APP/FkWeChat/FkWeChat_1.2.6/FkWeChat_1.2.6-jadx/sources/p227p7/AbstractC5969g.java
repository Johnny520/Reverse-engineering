package p227p7;

import java.util.List;
import java.util.Set;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5081g0;
import p215oc.C5725t;
import p281t6.C8161n0;
import p281t6.C8169v;

/* JADX INFO: renamed from: p7.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5969g {

    /* JADX INFO: renamed from: a */
    public final Set f18904a = AbstractC5068b1.m20483e();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m23962b(AbstractC5969g abstractC5969g, String str, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: append");
            return;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        abstractC5969g.m23963a(str, str2, z10);
    }

    /* JADX INFO: renamed from: a */
    public final void m23963a(String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        if (m23966g().contains(str)) {
            return;
        }
        if (z10 && C8169v.f27347a.m31687p(str)) {
            throw new C8161n0(str);
        }
        C8169v c8169v = C8169v.f27347a;
        c8169v.m31672a(str);
        c8169v.m31673b(str2);
        mo7370d(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m23964c(String str) {
        str.getClass();
        return m23965e(str) != null;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo7370d(String str, String str2);

    /* JADX INFO: renamed from: e */
    public String m23965e(String str) {
        str.getClass();
        return (String) AbstractC5081g0.m20578l0(mo7371f(str));
    }

    /* JADX INFO: renamed from: f */
    public abstract List mo7371f(String str);

    /* JADX INFO: renamed from: g */
    public Set m23966g() {
        return this.f18904a;
    }
}
