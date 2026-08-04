package yyds;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: renamed from: yyds.ᲇᛲᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2402 extends AbstractC0649 {
    final /* synthetic */ C0910 this$0;

    /* JADX INFO: renamed from: yyds.ᲇᛲᛶᲇ$ᛲᲈᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C2403 extends AbstractC0649 {
        final /* synthetic */ C0910 this$0;

        public C2403(C0910 c0910) {
            this.this$0 = c0910;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C0910 c0910 = this.this$0;
            int i = c0910.f4145 + 1;
            c0910.f4145 = i;
            if (i == 1) {
                if (!c0910.f4141) {
                    c0910.f4142.removeCallbacks(c0910.f4140);
                } else {
                    c0910.f4139.m127(EnumC0637.ON_RESUME);
                    c0910.f4141 = false;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C0910 c0910 = this.this$0;
            int i = c0910.f4143 + 1;
            c0910.f4143 = i;
            if (i == 1 && c0910.f4144) {
                c0910.f4139.m127(EnumC0637.ON_START);
                c0910.f4144 = false;
            }
        }
    }

    public C2402(C0910 c0910) {
        this.this$0 = c0910;
    }

    @Override // yyds.AbstractC0649, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // yyds.AbstractC0649, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C0910 c0910 = this.this$0;
        int i = c0910.f4145 - 1;
        c0910.f4145 = i;
        if (i == 0) {
            c0910.f4142.postDelayed(c0910.f4140, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC2574.m4646(activity, new C2403(this.this$0));
    }

    @Override // yyds.AbstractC0649, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C0910 c0910 = this.this$0;
        int i = c0910.f4143 - 1;
        c0910.f4143 = i;
        if (i == 0 && c0910.f4141) {
            c0910.f4139.m127(EnumC0637.ON_STOP);
            c0910.f4144 = true;
        }
    }
}
