package p000;

import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0240h1 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean z;
        int i;
        int iM1092k;
        int iM1092k2;
        boolean z2;
        Object obj;
        String lowerCase;
        if (!HookEntry.runtimeBool(Prefs.KEY_CHAT_EDGE_GUARD)) {
            return;
        }
        Object obj2 = methodHookParam.thisObject;
        int i2 = Integer.MIN_VALUE;
        try {
            if (obj2 instanceof View) {
                try {
                    ((View) obj2).getContext();
                } catch (Throwable unused) {
                }
            }
            iM1092k = AbstractC0497v4.m1092k(obj2, AbstractC0260i5.m624i1(), 0, "chatType");
            iM1092k2 = AbstractC0497v4.m1092k(obj2, AbstractC0260i5.m624i1(), 0, "uinType");
        } catch (Throwable th) {
            th = th;
            z = false;
            i = Integer.MIN_VALUE;
        }
        if (iM1092k != 2 && iM1092k2 != 1) {
            z = iM1092k == 1 || iM1092k == 100 || iM1092k2 == 0;
            try {
                String strM1084c = AbstractC0497v4.m1084c(obj2, 0, AbstractC0260i5.m624i1(), new int[]{0});
                AbstractC0260i5.m535H1(strM1084c, 700);
                lowerCase = strM1084c.toLowerCase();
            } catch (Throwable th2) {
                th = th2;
                i = iM1092k2;
                i2 = iM1092k;
                th.toString();
                int i3 = i;
                iM1092k = i2;
                iM1092k2 = i3;
            }
            if (!lowerCase.contains("chattype=2") && !lowerCase.contains("chattype:2") && !lowerCase.contains("troop") && !lowerCase.contains("groupuin")) {
                if (!lowerCase.contains("troopuin")) {
                    z2 = false;
                }
                Object[] objArr = methodHookParam.args;
                obj = (objArr != null || objArr.length == 0) ? null : objArr[0];
                Object obj3 = methodHookParam.thisObject;
                if (obj instanceof Float) {
                    return;
                }
                float fFloatValue = ((Float) obj).floatValue();
                if (Float.isNaN(fFloatValue) || fFloatValue >= 0.0f) {
                    return;
                }
                if (!z || (!z2 && iM1092k != 1 && iM1092k != 100 && iM1092k2 != 0)) {
                    if (obj3 == null) {
                        return;
                    }
                    try {
                        String name = obj3.getClass().getName();
                        String strM1004e = AbstractC0463t2.m1004e("target.chat_right_swipe.drawer_class");
                        if (!"com.tencent.aio.frame.drawer.DrawerFrameViewGroup".equals(name)) {
                            if (!name.equals(strM1004e)) {
                                return;
                            }
                        }
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                methodHookParam.setResult(Boolean.FALSE);
                return;
            }
        }
        z2 = true;
        z = true;
        Object[] objArr2 = methodHookParam.args;
        if (objArr2 != null) {
        }
        Object obj32 = methodHookParam.thisObject;
        if (obj instanceof Float) {
        }
    }
}
