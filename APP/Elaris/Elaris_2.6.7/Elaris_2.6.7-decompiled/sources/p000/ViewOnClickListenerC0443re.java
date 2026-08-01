package p000;

import android.app.Activity;
import android.view.View;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;

/* JADX INFO: renamed from: re */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0443re implements View.OnClickListener {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activityM292e = AbstractC0169w.m292e(view);
        if (activityM292e == null) {
            activityM292e = HookEntry.topActivity();
        }
        if (activityM292e == null) {
            return;
        }
        try {
            ClassLoader classLoader = AbstractC0260i5.f401v;
            if (classLoader == null) {
                try {
                    classLoader = activityM292e.getClassLoader();
                } catch (Throwable unused) {
                    classLoader = null;
                }
            }
            if (classLoader == null) {
                AbstractC0169w.m276W0(activityM292e, "未获取到 QQ 运行环境");
                return;
            }
            AbstractC0169w.m261P(classLoader);
            C0410pd c0410pdM316q = AbstractC0169w.m316q(activityM292e, view);
            if (c0410pdM316q != null) {
                AbstractC0169w.m260O0(activityM292e, classLoader, c0410pdM316q);
            } else {
                HookEntry.log("local voice entry target miss activity=".concat(activityM292e.getClass().getName()));
                AbstractC0169w.m276W0(activityM292e, "未识别当前聊天");
            }
        } catch (Throwable th) {
            AbstractC0169w.m276W0(activityM292e, "无法打开语音文件列表");
            HookEntry.log("local voice direct picker failed: " + th);
        }
    }
}
