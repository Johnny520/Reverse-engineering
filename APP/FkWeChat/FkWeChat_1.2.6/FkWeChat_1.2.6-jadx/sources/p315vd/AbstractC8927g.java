package p315vd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import me.yun.fkwechat.core.config.AppConfig;
import p262rd.C6620y;

/* JADX INFO: renamed from: vd.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8927g {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m34276a(Context context, String str) {
        if (context == null) {
            context = AppConfig.hostContext;
        }
        Toast.makeText(context, String.valueOf(str), 0).show();
    }

    /* JADX INFO: renamed from: b */
    public static void m34277b(final Context context, final String str) {
        try {
            C6620y.m26218d(String.valueOf(str), true);
        } catch (Throwable unused) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: vd.f
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8927g.m34276a(context, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m34278c(String str) {
        m34277b(null, str);
    }
}
