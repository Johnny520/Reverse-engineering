package androidx.lifecycle;

import android.app.Activity;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: androidx.lifecycle.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0548y extends AbstractC0529f {
    final /* synthetic */ C0512A this$0;

    public C0548y(C0512A r1) {
        this.this$0 = r1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity r2) {
        AbstractC0307g.m703e(r2, "activity");
        this.this$0.m1244a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity r3) {
        AbstractC0307g.m703e(r3, "activity");
        C0512A r32 = this.this$0;
        int r02 = r32.f1448a + 1;
        r32.f1448a = r02;
        if (r02 == 1) goto L5;
        return;
    L5:
        if (r32.f1451d == false) goto L9;
        r32.f1453f.m1257d(EnumC0535l.ON_START);
        r32.f1451d = false;
        return;
    }
}
