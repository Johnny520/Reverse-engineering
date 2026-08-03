package p000;

import android.content.ComponentName;
import android.content.Intent;
import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: Os */
/* JADX INFO: loaded from: classes.dex */
public final class C0637Os extends XC_MethodHook {
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam r5) {
        super.beforeHookedMethod(r5);
        if (r5 != null) goto L5;
        return;
    L5:
        if (C0680Ps.f2178b.m2024e() == false) goto L31;
        Object[] r52 = r5.args;
        String r0 = null;
        if (r52 != null) goto L9;
    L11:
        Object r53 = null;
    L13:
        if ((r53 instanceof Intent) == false) goto L15;
        Intent r54 = (Intent) r53;
    L16:
        if (r54 == null) goto L33;
        String r1 = AbstractC0295Gu.m625r(-5158255720501L);
        String r2 = AbstractC0295Gu.m625r(-3843995727925L);
        ComponentName r3 = r54.getComponent();
        if (r3 == null) goto L22;
        r0 = r3.getClassName();
    L22:
        if (AbstractC0585Nj.m1134a(r0, r1) == false) goto L24;
    L25:
        r54.setComponent(new ComponentName(AbstractC0295Gu.m625r(-3556232919093L), AbstractC0295Gu.m625r(-4170413242421L)));
    L26:
        AbstractC0295Gu.m625r(-4393751541813L);
        ComponentName r55 = r54.getComponent();
        if (r55 == null) goto L32;
        r55.getClassName();
        return;
    L32:
        return;
    L24:
        if (AbstractC0585Nj.m1134a(r0, r2) == false) goto L26;
    L33:
        return;
    L15:
        r54 = null;
        goto L16
    L9:
        if (r52.length <= 0) goto L11;
        r53 = r52[0];
        goto L13
    }
}
