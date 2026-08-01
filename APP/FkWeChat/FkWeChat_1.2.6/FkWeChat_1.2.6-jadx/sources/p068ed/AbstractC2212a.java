package p068ed;

import android.content.Context;
import gd.C2763d0;
import gd.C2764e;
import gd.C2772m;
import gd.C2777r;
import gd.C2783x;
import id.C3413f;
import id.C3416i;
import me.yun.fkwechat.core.config.AppConfig;
import me.yun.fkwechat.core.config.ConfigRepo;
import p114hd.C3004b;
import p114hd.C3006d;
import p114hd.C3009g;
import p114hd.C3011i;
import p114hd.C3014l;
import p114hd.C3016n;
import p146jd.C3842g;
import p146jd.C3852q;
import p162kd.C4249e;
import p162kd.C4252h;
import p162kd.C4261q;
import p162kd.C4263s;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: ed.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2212a {

    /* JADX INFO: renamed from: d */
    public static AbstractC2212a[] f6037d = {new C2777r(), new C3413f(), new C3416i(), new C2772m(), new C2763d0(), new C2764e(), new C2783x(), new C3852q(), new C4252h(), new C4263s(), new C4261q(), new C4249e(), new C3006d(), new C3009g(), new C3011i(), new C3014l(), new C3004b(), new C3842g(), new C3016n()};

    /* JADX INFO: renamed from: a */
    public Context f6038a = AppConfig.hostContext;

    /* JADX INFO: renamed from: b */
    public ClassLoader f6039b = AppConfig.hostClassLoader;

    /* JADX INFO: renamed from: c */
    public String f6040c;

    /* JADX INFO: renamed from: k */
    public static void m7964k() {
        for (AbstractC2212a abstractC2212a : f6037d) {
            abstractC2212a.m7966b();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m7965a(String str, Throwable th) {
        AbstractC8924d.m34264d(m7971g(), str, th);
    }

    /* JADX INFO: renamed from: b */
    public final void m7966b() {
        String strM7971g = m7971g();
        try {
            if (!m7973i()) {
                AbstractC8924d.m34267g(strM7971g, "skipped (disabled)");
            } else if (!mo7972h()) {
                AbstractC8924d.m34263c(strM7971g, "init failed");
            } else {
                mo7974j();
                AbstractC8924d.m34267g(strM7971g, "initialized");
            }
        } catch (Throwable th) {
            AbstractC8924d.m34264d(strM7971g, "execute error", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m7967c(String str, boolean z10) {
        return ConfigRepo.getBoolean(str, z10);
    }

    /* JADX INFO: renamed from: d */
    public float m7968d(String str, float f10) {
        return ConfigRepo.getFloat(str, f10);
    }

    /* JADX INFO: renamed from: e */
    public int m7969e(String str, int i10) {
        return ConfigRepo.getInt(str, i10);
    }

    /* JADX INFO: renamed from: f */
    public String m7970f(String str, String str2) {
        return ConfigRepo.getString(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public String m7971g() {
        InterfaceC2213b interfaceC2213b = (InterfaceC2213b) getClass().getAnnotation(InterfaceC2213b.class);
        return interfaceC2213b != null ? interfaceC2213b.tag() : getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo7972h();

    /* JADX INFO: renamed from: i */
    public boolean m7973i() {
        InterfaceC2213b interfaceC2213b;
        String strKey = this.f6040c;
        if ((strKey == null || strKey.isEmpty()) && (interfaceC2213b = (InterfaceC2213b) getClass().getAnnotation(InterfaceC2213b.class)) != null) {
            strKey = interfaceC2213b.key();
        }
        if (strKey == null || strKey.isEmpty()) {
            return true;
        }
        return ConfigRepo.getBoolean(strKey, false);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo7974j();

    /* JADX INFO: renamed from: l */
    public void m7975l(String str, boolean z10) {
        ConfigRepo.setBoolean(str, z10);
    }
}
