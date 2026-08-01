package p086r0;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.XC_MethodHook;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p054c0.AbstractC0509a;

/* JADX INFO: renamed from: r0.K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0852K1 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2916a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0858M1 f2917b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0852K1(C0858M1 c0858m1, int i2) {
        this.f2916a = i2;
        this.f2917b = c0858m1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        switch (this.f2916a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                final Activity activity = obj instanceof Activity ? (Activity) obj : null;
                if (activity != null && AbstractC0299i.m511i0(activity.getClass().getName(), "LauncherUI", false) && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    final C0858M1 c0858m1 = this.f2917b;
                    final int i2 = 0;
                    decorView.post(new Runnable() { // from class: r0.J1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    C0858M1.m1756a(c0858m1, activity);
                                    break;
                                default:
                                    C0858M1.m1756a(c0858m1, activity);
                                    break;
                            }
                        }
                    });
                }
                break;
            default:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr);
                Boolean bool = objM258f0 instanceof Boolean ? (Boolean) objM258f0 : null;
                if (bool != null && bool.booleanValue()) {
                    Object obj2 = methodHookParam.thisObject;
                    final Activity activity2 = obj2 instanceof Activity ? (Activity) obj2 : null;
                    if (activity2 != null && AbstractC0299i.m511i0(activity2.getClass().getName(), "LauncherUI", false) && (window2 = activity2.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                        final C0858M1 c0858m12 = this.f2917b;
                        final int i3 = 1;
                        decorView2.post(new Runnable() { // from class: r0.J1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        C0858M1.m1756a(c0858m12, activity2);
                                        break;
                                    default:
                                        C0858M1.m1756a(c0858m12, activity2);
                                        break;
                                }
                            }
                        });
                    }
                    break;
                }
                break;
        }
    }
}
