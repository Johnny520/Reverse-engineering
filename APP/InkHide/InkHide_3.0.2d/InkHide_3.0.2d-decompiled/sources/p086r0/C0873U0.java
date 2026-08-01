package p086r0;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;

/* JADX INFO: renamed from: r0.U0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0873U0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3005a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0881Y0 f3006b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f3007c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f3008d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Class f3009e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0873U0(C0881Y0 c0881y0, Context context, Class cls, Class cls2, int i2) {
        this.f3005a = i2;
        this.f3006b = c0881y0;
        this.f3007c = context;
        this.f3008d = cls;
        this.f3009e = cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3005a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object result = methodHookParam.getResult();
                if (result != null) {
                    this.f3006b.f3047k = result;
                    this.f3006b.m1799k(this.f3007c, result, this.f3008d, this.f3009e);
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3005a) {
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                if (!this.f3006b.f3048l && this.f3006b.m1799k(this.f3007c, methodHookParam.thisObject, this.f3008d, this.f3009e) && !AbstractC0223g.m414a(methodHookParam.method.getName(), "notifyDataSetChanged")) {
                    methodHookParam.setResult((Object) null);
                    this.f3006b.m1793G(methodHookParam.thisObject);
                }
                break;
        }
    }
}
