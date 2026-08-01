package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛷᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC0183 extends android.app.Fragment {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f710 = 0;

    /* JADX INFO: renamed from: xhss.ᛲᛷᛲᲀ$ᛷᛵᛵᲈ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
    public static final class C0184 implements android.app.Application.ActivityLifecycleCallbacks {
        public static final xhss.C0480 Companion = null;

        static {
                xhss.ᛵᛶᛲᲈ r0 = new xhss.ᛵᛶᛲᲈ
                r0.<init>()
                xhss.FragmentC0183.C0184.Companion = r0
                return
        }

        public C0184() {
                r0 = this;
                r0.<init>()
                return
        }

        public static final void registerIn(android.app.Activity r1) {
                xhss.ᛵᛶᛲᲈ r0 = xhss.FragmentC0183.C0184.Companion
                r0.getClass()
                xhss.ᛲᛷᛲᲀ$ᛷᛵᛵᲈ r0 = new xhss.ᛲᛷᛲᲀ$ᛷᛵᛵᲈ
                r0.<init>()
                r1.registerActivityLifecycleCallbacks(r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                int r0 = xhss.FragmentC0183.f710
                xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_CREATE
                xhss.AbstractC0627.m1101(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(android.app.Activity r1) {
                r0 = this;
                int r0 = xhss.FragmentC0183.f710
                xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_RESUME
                xhss.AbstractC0627.m1101(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(android.app.Activity r1) {
                r0 = this;
                int r0 = xhss.FragmentC0183.f710
                xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_START
                xhss.AbstractC0627.m1101(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(android.app.Activity r1) {
                r0 = this;
                int r0 = xhss.FragmentC0183.f710
                xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_DESTROY
                xhss.AbstractC0627.m1101(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(android.app.Activity r1) {
                r0 = this;
                int r0 = xhss.FragmentC0183.f710
                xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_PAUSE
                xhss.AbstractC0627.m1101(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(android.app.Activity r1) {
                r0 = this;
                int r0 = xhss.FragmentC0183.f710
                xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_STOP
                xhss.AbstractC0627.m1101(r1, r0)
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity r1, android.os.Bundle r2) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity r1) {
                r0 = this;
                return
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity r1) {
                r0 = this;
                return
        }
    }

    public FragmentC0183() {
            r0 = this;
            r0.<init>()
            return
    }
}
