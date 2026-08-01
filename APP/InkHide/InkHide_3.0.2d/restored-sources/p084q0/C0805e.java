package p084q0;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XC_MethodHook;
import p054c0.AbstractC0509a;

/* JADX INFO: renamed from: q0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0805e extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0806f f2677b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0805e(C0806f c0806f, int i2) {
        this.f2676a = i2;
        this.f2677b = c0806f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f2676a) {
            case 0:
                Activity activity = (Activity) methodHookParam.thisObject;
                C0806f.m1470a(this.f2677b, activity, activity.getIntent());
                break;
            default:
                Intent intent = (Intent) methodHookParam.args[0];
                C0806f.m1470a(this.f2677b, (Activity) methodHookParam.thisObject, intent);
                break;
        }
    }
}
