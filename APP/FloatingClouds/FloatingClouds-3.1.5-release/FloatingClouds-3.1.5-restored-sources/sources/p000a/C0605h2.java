package p000a;

import android.os.Bundle;
import java.util.Arrays;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0605h2 implements IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        Object objM2206a;
        Object objM2206a2;
        C0631i9.m1482e(c0173j8, "session");
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"=== BlockContactInfo handleHook START ==="}, 1));
        if (C0002A1.m13b(c0173j8.f608a, "com.tencent.mm.plugin.profile.ui.ContactInfoUI") == null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"BlockContactInfo: ERROR - com.tencent.mm.plugin.profile.ui.ContactInfoUI not found"}, 1));
            return;
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"BlockContactInfo: found com.tencent.mm.plugin.profile.ui.ContactInfoUI"}, 1));
        try {
            C0173J8.m463a(c0173j8, "com.tencent.mm.plugin.profile.ui.ContactInfoUI", "onCreate", new Class[]{Bundle.class}, new C0586g2(0));
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"BlockContactInfo: hooked onCreate (afterHookedMethod)"}, 1));
            objM2206a = C0413Wf.f1577a;
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        Throwable thM2189a = C0901wd.m2189a(objM2206a);
        if (thM2189a != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"BlockContactInfo: hook onCreate FAILED", thM2189a}, 2));
        }
        try {
            C0173J8.m463a(c0173j8, "com.tencent.mm.plugin.profile.ui.ContactInfoUI", "onResume", new Class[0], new C0586g2(1));
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"BlockContactInfo: hooked onResume (fallback)"}, 1));
            objM2206a2 = C0413Wf.f1577a;
        } catch (Throwable th2) {
            objM2206a2 = C0920xd.m2206a(th2);
        }
        Throwable thM2189a2 = C0901wd.m2189a(objM2206a2);
        if (thM2189a2 != null) {
            C0908x1.m2194b(Arrays.copyOf(new Object[]{"BlockContactInfo: hook onResume FAILED", thM2189a2}, 2));
        }
        C0908x1.m2194b(Arrays.copyOf(new Object[]{"=== BlockContactInfo handleHook DONE ==="}, 1));
    }
}
