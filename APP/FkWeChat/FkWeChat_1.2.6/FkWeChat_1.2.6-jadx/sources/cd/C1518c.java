package cd;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me.yun.fkwechat.core.config.AppConfig;
import okhttp3.internal.url._UrlKt;
import org.luckypray.dexkit.C5823a;
import p024b9.AbstractC1061t;
import p183m6.SharedPreferencesC5046p;
import p185m8.AbstractC5081g0;
import p299ub.AbstractC8621f0;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: cd.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1518c {

    /* JADX INFO: renamed from: b */
    public static volatile C5823a.e f4479b;

    /* JADX INFO: renamed from: c */
    public static SharedPreferencesC5046p f4480c;

    /* JADX INFO: renamed from: d */
    public static ClassLoader f4481d;

    /* JADX INFO: renamed from: a */
    public static final C1518c f4478a = new C1518c();

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f4482e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static final a f4483f = new a();

    /* JADX INFO: renamed from: g */
    public static final int f4484g = 8;

    /* JADX INFO: renamed from: cd.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements C5823a.a {
        @Override // org.luckypray.dexkit.C5823a.a
        /* JADX INFO: renamed from: a */
        public List mo5936a(String str, List list) {
            str.getClass();
            SharedPreferencesC5046p sharedPreferencesC5046p = C1518c.f4480c;
            String string = sharedPreferencesC5046p != null ? sharedPreferencesC5046p.getString(str, null) : null;
            if (TextUtils.isEmpty(string)) {
                return list;
            }
            if (string != null) {
                return AbstractC8621f0.m33112S0(string, new String[]{"\u0001"}, false, 0, 6, null);
            }
            return null;
        }

        @Override // org.luckypray.dexkit.C5823a.a
        /* JADX INFO: renamed from: b */
        public void mo5937b(String str, List list) {
            str.getClass();
            list.getClass();
            if (list.isEmpty()) {
                SharedPreferencesC5046p sharedPreferencesC5046p = C1518c.f4480c;
                if (sharedPreferencesC5046p != null) {
                    sharedPreferencesC5046p.remove(str);
                    return;
                }
                return;
            }
            SharedPreferencesC5046p sharedPreferencesC5046p2 = C1518c.f4480c;
            if (sharedPreferencesC5046p2 != null) {
                sharedPreferencesC5046p2.putString(str, AbstractC5081g0.m20585s0(list, "\u0001", null, null, 0, null, null, 62, null));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5933b() {
        C5823a.e eVar = f4479b;
        if (eVar != null) {
            eVar.close();
        }
        f4479b = null;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C5823a.e m5934c() {
        try {
            if (!f4482e.get()) {
                m5935d();
            }
            SharedPreferencesC5046p sharedPreferencesC5046p = f4480c;
            if (sharedPreferencesC5046p == null) {
                return null;
            }
            String str = AppConfig.moduleVersionCode + ":" + AppConfig.hostVersionCode;
            if (!AbstractC1061t.m3842c(str, sharedPreferencesC5046p.getString("last_version_tag", _UrlKt.FRAGMENT_ENCODE_SET))) {
                AbstractC8924d.m34267g("DexKitService", "Detected version change. Clearing cache...");
                m5933b();
                sharedPreferencesC5046p.clear();
                sharedPreferencesC5046p.putString("last_version_tag", str);
            }
            if (f4479b == null) {
                try {
                    String str2 = AppConfig.hostApkPath;
                    if (str2 == null) {
                        return null;
                    }
                    f4479b = C5823a.m23431f(str, str2);
                } catch (Throwable th) {
                    AbstractC8924d.m34264d("DexKitService", "Create RecyclableBridge failed", th);
                }
            }
            return f4479b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5935d() {
        AtomicBoolean atomicBoolean = f4482e;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            Context context = AppConfig.hostContext;
            if (context == null) {
                return;
            }
            f4481d = AppConfig.hostClassLoader;
            f4480c = new SharedPreferencesC5046p.a(context, "FkWeChat_DexKit_Cache").m20406a();
            System.loadLibrary("dexkit");
            C5823a.m23435k(15000L);
            C5823a.m23434j(f4483f);
            atomicBoolean.set(true);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DexKitService", "Init DexKitCacheBridge failed", th);
        }
    }
}
