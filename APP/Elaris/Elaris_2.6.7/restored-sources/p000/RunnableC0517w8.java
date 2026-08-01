package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import com.p001mr.elaris.AbstractC0169w;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: w8 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0517w8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f1002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f1003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0026b9 f1004c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0314l8 f1005d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Handler f1006e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f1007f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Activity f1008g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ClassLoader f1009h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0410pd f1010i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0527x2 f1011j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AtomicBoolean f1012k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0517w8(Context context, String str, C0026b9 c0026b9, C0314l8 c0314l8, Handler handler, int i, Activity activity, ClassLoader classLoader, C0410pd c0410pd, C0527x2 c0527x2, AtomicBoolean atomicBoolean) {
        this.f1002a = context;
        this.f1003b = str;
        this.f1004c = c0026b9;
        this.f1005d = c0314l8;
        this.f1006e = handler;
        this.f1007f = i;
        this.f1008g = activity;
        this.f1009h = classLoader;
        this.f1010i = c0410pd;
        this.f1011j = c0527x2;
        this.f1012k = atomicBoolean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        final Throwable th;
        File file;
        C0348na c0348na;
        try {
            File fileM662v0 = AbstractC0260i5.m662v0(this.f1002a, this.f1003b, this.f1004c.f65a, this.f1005d);
            try {
                int iM326v = AbstractC0169w.m326v(fileM662v0);
                if (iM326v <= 0) {
                    throw new IOException("script silk duration invalid");
                }
                C0348na c0348na2 = new C0348na(fileM662v0, iM326v);
                try {
                    boolean zPost = this.f1006e.post(new RunnableC0412q(this, c0348na2, 7, false));
                    this.f1005d.m754c();
                    if (zPost) {
                        return;
                    }
                    AbstractC0260i5.m590a(fileM662v0);
                    AbstractC0010a9.m73b();
                } catch (Throwable th2) {
                    th = th2;
                    file = null;
                    c0348na = c0348na2;
                    try {
                        final boolean z = this.f1005d.f528a || Thread.currentThread().isInterrupted();
                        if (!z) {
                            AbstractC0198e7.m343a("kk-tts", "generate", th);
                        }
                        Handler handler = this.f1006e;
                        final C0527x2 c0527x2 = this.f1011j;
                        final AtomicBoolean atomicBoolean = this.f1012k;
                        final Activity activity = this.f1008g;
                        final ClassLoader classLoader = this.f1009h;
                        final C0410pd c0410pd = this.f1010i;
                        final C0026b9 c0026b9 = this.f1004c;
                        final String str = this.f1003b;
                        boolean zPost2 = handler.post(new Runnable() { // from class: v8
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                String strReplace;
                                AbstractC0260i5.m551N((Dialog) c0527x2.f1027a, atomicBoolean);
                                if (z) {
                                    return;
                                }
                                Activity activity2 = activity;
                                if (AbstractC0260i5.m674z0(activity2)) {
                                    String message = th.getMessage();
                                    if (message == null) {
                                        strReplace = "";
                                    } else {
                                        strReplace = message.replace('\n', ' ').replace('\r', ' ');
                                        if (strReplace.length() > 160) {
                                            strReplace = strReplace.substring(0, 160);
                                        }
                                    }
                                    String lowerCase = strReplace.toLowerCase(Locale.US);
                                    AbstractC0260i5.m583X1(activity2, (lowerCase.contains("codec") || lowerCase.contains("decode") || lowerCase.contains("encode") || lowerCase.contains("track")) ? "当前设备无法转换该音频" : lowerCase.contains("script silk") ? "语音转换服务暂不可用" : (lowerCase.contains("http 429") || lowerCase.contains("http 5") || lowerCase.contains("timeout") || lowerCase.contains("connect") || lowerCase.contains("route to host") || lowerCase.contains("unknownhost")) ? "网络或语音服务繁忙，请稍后重试" : lowerCase.contains("too large") ? "生成的语音过大" : "语音生成失败");
                                    AbstractC0260i5.m562Q1(activity2, classLoader, c0410pd, c0026b9, str);
                                }
                            }
                        });
                        AbstractC0260i5.m590a(file);
                        this.f1005d.m754c();
                        if (zPost2) {
                            return;
                        }
                        AbstractC0260i5.m590a(c0348na != null ? c0348na.f600a : null);
                        AbstractC0010a9.m73b();
                    } catch (Throwable th3) {
                        AbstractC0260i5.m590a(file);
                        this.f1005d.m754c();
                        AbstractC0260i5.m590a(c0348na != null ? c0348na.f600a : null);
                        AbstractC0010a9.m73b();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                c0348na = null;
                file = fileM662v0;
            }
        } catch (Throwable th5) {
            th = th5;
            file = null;
            c0348na = null;
        }
    }
}
