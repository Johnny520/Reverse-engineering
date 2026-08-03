package p162l3;

import ac.RunnableC0059l;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p007a7.AbstractC0018a;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: l3.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2458l implements InterfaceC2454h {

    /* JADX INFO: renamed from: a */
    public final Context f8074a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2458l(Context context) {
        this.f8074a = context.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p162l3.InterfaceC2454h
    /* JADX INFO: renamed from: a */
    public void mo5845a(AbstractC0018a abstractC0018a) {
        ThreadFactoryC2447a threadFactoryC2447a = new ThreadFactoryC2447a("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), threadFactoryC2447a);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0059l(this, abstractC0018a, threadPoolExecutor, 20));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public SharedPreferences m5853b() {
        return AbstractC4302b.m8640c(this.f8074a, "Hchat_redpacket_config");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public int m5854c(String str, int i9) {
        try {
            return m5853b().getInt(str, i9);
        } catch (Throwable unused) {
            return i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public String m5855d(String str, String str2) {
        String string;
        try {
            string = m5853b().getString(str, str2);
        } catch (Throwable unused) {
        }
        return string != null ? string : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public boolean m5856e() {
        try {
            return m5853b().getBoolean("hb_auto_enable", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean m5857f() {
        int i9;
        if (!m5856e()) {
            return false;
        }
        try {
            i9 = m5853b().getInt("hb_grab_mode", 1);
        } catch (Throwable unused) {
            i9 = 1;
        }
        return i9 == 1;
    }

    public C2458l(Context context, ClassLoader classLoader) {
        classLoader.getClass();
        this.f8074a = context;
    }
}
