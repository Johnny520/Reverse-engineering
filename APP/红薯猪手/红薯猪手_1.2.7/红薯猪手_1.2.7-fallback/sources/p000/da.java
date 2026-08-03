package p000;

/* JADX INFO: loaded from: classes.dex */
public class da implements android.app.Application.ActivityLifecycleCallbacks {
    public da() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity r3) {
            r2 = this;
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [79, 38, 126, -92, -69, 121, 90, 60} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [46, 69, 10, -51, -51, 16} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity r5, android.os.Bundle r6) {
            r4 = this;
            r0 = 8
            byte[] r1 = new byte[r0]
            r1 = {x0026: FILL_ARRAY_DATA , data: [-8, -27, 55, -50, -27, -70, -19, -1} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x002e: FILL_ARRAY_DATA , data: [-103, -122, 67, -89, -109, -45} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r5)
            byte[] r5 = new byte[r0]
            r5 = {x0036: FILL_ARRAY_DATA , data: [-95, -69, 113, -126, 70, -6, -70, -85} // fill-array
            byte[] r0 = new byte[r2]
            r0 = {x003e: FILL_ARRAY_DATA , data: [-50, -50, 5, -47, 50, -101} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r0)
            p000.h4.m189(r5, r6)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity r3) {
            r2 = this;
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [88, -1, -37, 51, 25, -107, 77, -27} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [57, -100, -81, 90, 111, -4} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            return
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity r3) {
            r2 = this;
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [-127, -60, 31, -105, -22, -89, -108, -34} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x001e: FILL_ARRAY_DATA , data: [-32, -89, 107, -2, -100, -50} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            return
    }
}
