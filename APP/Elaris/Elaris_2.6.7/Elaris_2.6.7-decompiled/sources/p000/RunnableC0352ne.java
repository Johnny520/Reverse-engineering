package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: ne */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0352ne implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0347n9 f608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0507ve f609c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Handler f610d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f611e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f612f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ClassLoader f613g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0410pd f614h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean[] f615i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Dialog f616j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0352ne(Context context, C0347n9 c0347n9, C0507ve c0507ve, Handler handler, int i, Activity activity, ClassLoader classLoader, C0410pd c0410pd, boolean[] zArr, Dialog dialog) {
        this.f607a = context;
        this.f608b = c0347n9;
        this.f609c = c0507ve;
        this.f610d = handler;
        this.f611e = i;
        this.f612f = activity;
        this.f613g = classLoader;
        this.f614h = c0410pd;
        this.f615i = zArr;
        this.f616j = dialog;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, IF, IGET, INVOKE, IF, IGET, IGET] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0003 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: ne */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: ne */
    /* JADX DEBUG: Multi-variable search result rejected for r6v16, resolved type: ne */
    /* JADX DEBUG: Multi-variable search result rejected for r6v23, resolved type: ne */
    /* JADX DEBUG: Multi-variable search result rejected for r6v24, resolved type: ne */
    /* JADX DEBUG: Multi-variable search result rejected for r6v25, resolved type: ne */
    /* JADX DEBUG: Multi-variable search result rejected for r6v27, resolved type: ne */
    /* JADX DEBUG: Multi-variable search result rejected for r6v28, resolved type: ne */
    /* JADX DEBUG: Multi-variable search result rejected for r6v29, resolved type: ne */
    /* JADX DEBUG: Multi-variable search result rejected for r6v30, resolved type: ne */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: all -> 0x00a9, PHI: r1
  0x0075: PHI (r1v3 na) = (r1v2 na), (r1v4 na) binds: [B:19:0x0073, B:29:0x00a6] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a9, blocks: (B:8:0x0028, B:20:0x0075), top: B:41:0x0003 }] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v26 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0348na c0348naM288c = null;
        try {
            try {
                try {
                    try {
                        c0348naM288c = AbstractC0169w.m288c(this.f607a, this.f608b, this.f609c);
                        this.f610d.post(new RunnableC0412q(this, c0348naM288c, 10, false));
                        boolean z = this.f609c.f977a;
                        this = z;
                        if (z) {
                            boolean zExists = c0348naM288c.f600a.exists();
                            this = zExists;
                            if (zExists) {
                                c0348naM288c.f600a.delete();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                } catch (IOException e) {
                    String strM242F0 = AbstractC0169w.m242F0(e.getMessage());
                    HookEntry.log("local voice direct file prepare failed: ".concat(strM242F0));
                    this.f610d.post(new RunnableC0412q(this, strM242F0, 11));
                    this = this;
                    if (c0348naM288c != null) {
                        boolean z2 = this.f609c.f977a;
                        this = z2;
                        if (z2) {
                            boolean zExists2 = c0348naM288c.f600a.exists();
                            this = zExists2;
                            if (zExists2) {
                                File file = c0348naM288c.f600a;
                                file.delete();
                                this = file;
                            }
                        }
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            if (c0348naM288c != null && this.f609c.f977a && c0348naM288c.f600a.exists()) {
                try {
                    c0348naM288c.f600a.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
