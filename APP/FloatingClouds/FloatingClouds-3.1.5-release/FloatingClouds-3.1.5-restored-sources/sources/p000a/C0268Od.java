package p000a;

import android.util.Log;
import java.util.List;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.Od */
/* JADX INFO: loaded from: classes.dex */
public final class C0268Od implements IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Object objM2206a;
        C0631i9.m1482e(c0173j8, "session");
        List<String> listM1757d0 = C0739o3.m1757d0("L4", "P4");
        boolean z = false;
        for (String str : listM1757d0) {
            try {
                if (C0173J8.m463a(c0173j8, "com.tencent.mm.plugin.fts.ui.FTSBaseMainUI", str, new Class[]{String.class}, new C0673kd(this)) != null) {
                    Log.i("SCP", "home search " + str + " hooked");
                    z = true;
                }
                objM2206a = C0413Wf.f1577a;
            } catch (Throwable th) {
                objM2206a = C0920xd.m2206a(th);
            }
            Throwable thM2189a = C0901wd.m2189a(objM2206a);
            if (thM2189a != null) {
                Log.w("SCP", "home search " + str + " hook failed: " + thM2189a.getMessage());
            }
            if (z) {
                break;
            }
        }
        if (z) {
            return;
        }
        Log.e("SCP", "home search hook failed on all candidates: " + listM1757d0);
    }
}
