package p000;

import android.content.ComponentName;
import android.content.Intent;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Os */
/* JADX INFO: loaded from: classes.dex */
public final class C0637Os extends XC_MethodHook {
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        super.beforeHookedMethod(methodHookParam);
        if (methodHookParam == null || !C0680Ps.f2178b.m2024e()) {
            return;
        }
        Object[] objArr = methodHookParam.args;
        Object obj = (objArr == null || objArr.length <= 0) ? null : objArr[0];
        Intent intent = obj instanceof Intent ? (Intent) obj : null;
        if (intent == null) {
            return;
        }
        String strM625r = AbstractC0295Gu.m625r(-5158255720501L);
        String strM625r2 = AbstractC0295Gu.m625r(-3843995727925L);
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        if (AbstractC0585Nj.m1134a(className, strM625r) || AbstractC0585Nj.m1134a(className, strM625r2)) {
            intent.setComponent(new ComponentName(AbstractC0295Gu.m625r(-3556232919093L), AbstractC0295Gu.m625r(-4170413242421L)));
        }
        AbstractC0295Gu.m625r(-4393751541813L);
        ComponentName component2 = intent.getComponent();
        if (component2 != null) {
            component2.getClassName();
        }
    }
}
