package p000;

import android.app.Activity;
import com.p001mr.elaris.HookEntry;
import java.io.File;

/* JADX INFO: renamed from: p */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0396p implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f668a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f669b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f670c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ File f671d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f672e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f673f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f674g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f675h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0396p(ClassLoader classLoader, Object obj, File file, File file2, long j, String str, long j2, Activity activity) {
        this.f668a = classLoader;
        this.f669b = obj;
        this.f670c = file;
        this.f671d = file2;
        this.f672e = j;
        this.f673f = str;
        this.f674g = j2;
        this.f675h = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC0444s.m872a(this.f668a, this.f669b, this.f670c.getAbsolutePath(), this.f671d.getAbsolutePath(), this.f672e, this.f673f);
            HookEntry.logAlways("album video bubble send dispatched duration_ms=" + this.f672e + " bytes=" + this.f674g);
        } catch (Throwable th) {
            AbstractC0198e7.m343a("album-video-bubble", "dispatch", th);
            AbstractC0444s.m880i(this.f675h, "视频泡泡发送失败");
        }
    }
}
