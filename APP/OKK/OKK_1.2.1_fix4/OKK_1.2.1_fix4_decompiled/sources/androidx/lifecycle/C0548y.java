package androidx.lifecycle;

import android.app.Activity;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0548y extends AbstractC0529f {
    final /* synthetic */ C0512A this$0;

    public C0548y(C0512A c0512a) {
        this.this$0 = c0512a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        this.this$0.m1244a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC0307g.m703e(activity, "activity");
        C0512A c0512a = this.this$0;
        int i2 = c0512a.f1448a + 1;
        c0512a.f1448a = i2;
        if (i2 == 1 && c0512a.f1451d) {
            c0512a.f1453f.m1257d(EnumC0535l.ON_START);
            c0512a.f1451d = false;
        }
    }
}
