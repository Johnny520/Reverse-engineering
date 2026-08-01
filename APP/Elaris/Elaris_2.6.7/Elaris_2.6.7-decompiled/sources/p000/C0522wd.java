package p000;

import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: wd */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0522wd extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        int iIntValue;
        Object tag;
        int i;
        if (!HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT) || (objArr = methodHookParam.args) == null || objArr.length == 0) {
            return;
        }
        Object obj = objArr[0];
        if ((obj instanceof CharSequence) && AbstractC0260i5.m525E0((CharSequence) obj)) {
            Object obj2 = methodHookParam.thisObject;
            if (obj2 instanceof View) {
                View view = (View) obj2;
                for (int i2 = 0; view != null && i2 < 6; i2++) {
                    Integer num = (Integer) AbstractC0538xd.f1073d.get(view);
                    if (num != null && num.intValue() > 0) {
                        iIntValue = num.intValue();
                        break;
                    }
                    if (AbstractC0260i5.m519C0(view)) {
                        i = 0;
                        for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                            for (Field field : superclass.getDeclaredFields()) {
                                try {
                                    if (!Modifier.isStatic(field.getModifiers()) && field.getType() == Integer.TYPE) {
                                        String lowerCase = field.getName().toLowerCase();
                                        if (lowerCase.contains("num") || lowerCase.contains("count") || lowerCase.contains("unread") || lowerCase.contains("badge") || "j".equals(lowerCase) || "mnum".equals(lowerCase)) {
                                            field.setAccessible(true);
                                            int i3 = field.getInt(view);
                                            if (i3 > i && i3 < 1000000) {
                                                i = i3;
                                            }
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i > 0) {
                        iIntValue = i;
                        break;
                    } else {
                        Object parent = view.getParent();
                        view = parent instanceof View ? (View) parent : null;
                    }
                }
                iIntValue = 0;
                if (iIntValue <= 99) {
                    View view2 = (View) methodHookParam.thisObject;
                    int i4 = 0;
                    for (int i5 = 0; view2 != null && i5 < 7; i5++) {
                        int iM1143c = AbstractC0538xd.m1143c(view2, 0, AbstractC0260i5.m624i1());
                        if (iM1143c > i4) {
                            i4 = iM1143c;
                        }
                        try {
                            tag = view2.getTag();
                        } catch (Throwable unused2) {
                            tag = null;
                        }
                        int iM1143c2 = AbstractC0538xd.m1143c(tag, 0, AbstractC0260i5.m624i1());
                        if (iM1143c2 > i4) {
                            i4 = iM1143c2;
                        }
                        Object parent2 = view2.getParent();
                        view2 = parent2 instanceof View ? (View) parent2 : null;
                    }
                    iIntValue = i4;
                }
                if (iIntValue > 99) {
                    methodHookParam.args[0] = String.valueOf(iIntValue);
                }
            }
        }
    }
}
