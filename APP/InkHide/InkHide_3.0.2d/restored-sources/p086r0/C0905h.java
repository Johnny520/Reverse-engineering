package p086r0;

import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import p011F0.AbstractC0120h;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0509a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0905h extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0908i f3197b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f3198c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0905h(C0908i c0908i, Context context, int i2) {
        this.f3196a = i2;
        this.f3197b = c0908i;
        this.f3198c = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0908i c0908i = this.f3197b;
        Context context = this.f3198c;
        Object obj = null;
        int i2 = this.f3196a;
        AbstractC0223g.m418e(methodHookParam, "param");
        switch (i2) {
            case 0:
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2442r()) {
                    C0908i.m1950a(c0908i, context, methodHookParam.thisObject);
                    break;
                }
                break;
            case 1:
                boolean z3 = AbstractC1126i.f3786a;
                if (C1124g.m2442r()) {
                    Object[] objArr = methodHookParam.args;
                    if (objArr != null && objArr.length != 0) {
                        obj = objArr[0];
                    }
                    C0908i.m1950a(c0908i, context, obj);
                    break;
                }
                break;
            default:
                boolean z4 = AbstractC1126i.f3786a;
                if (C1124g.m2442r()) {
                    C0908i c0908i2 = this.f3197b;
                    c0908i2.getClass();
                    if (C1124g.m2442r()) {
                        Object[] objArr2 = methodHookParam.args;
                        Object objM258f0 = objArr2 != null ? AbstractC0120h.m258f0(0, objArr2) : null;
                        String str = objM258f0 instanceof String ? (String) objM258f0 : null;
                        if (str != null) {
                            Object[] objArr3 = methodHookParam.args;
                            Object objM258f02 = objArr3 != null ? AbstractC0120h.m258f0(1, objArr3) : null;
                            Number number = objM258f02 instanceof Number ? (Number) objM258f02 : null;
                            if (number != null) {
                                long jLongValue = number.longValue();
                                if (!AbstractC0307q.m534d0(str) && jLongValue > 0) {
                                    Object[] objArr4 = methodHookParam.args;
                                    Object objM258f03 = objArr4 != null ? AbstractC0120h.m258f0(3, objArr4) : null;
                                    String str2 = objM258f03 instanceof String ? (String) objM258f03 : null;
                                    if (!(str2 != null ? C0908i.m1953f(str2) : false)) {
                                        c0908i2.m1958d(this.f3198c, str, jLongValue, null, "hook");
                                    }
                                }
                            }
                        }
                    }
                    methodHookParam.setResult((Object) null);
                    break;
                }
                break;
        }
    }
}
