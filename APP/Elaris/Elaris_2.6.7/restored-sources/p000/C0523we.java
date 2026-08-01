package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: we */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0523we extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017d  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Intent intent;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        try {
            if (Boolean.TRUE.equals(AbstractC0539xe.f1079b.get())) {
                return;
            }
            boolean zRuntimeBool = HookEntry.runtimeBool(Prefs.KEY_EXTERNAL_BROWSER);
            boolean zRuntimeBool2 = HookEntry.runtimeBool(Prefs.KEY_UNBLOCK_RISK_WEB);
            if (zRuntimeBool || zRuntimeBool2) {
                Object obj = methodHookParam.thisObject;
                Context context = obj instanceof Context ? (Context) obj : null;
                Object[] objArr = methodHookParam.args;
                if (objArr == null) {
                    return;
                }
                char c = 0;
                for (Object obj2 : objArr) {
                    if (context == null && (obj2 instanceof Context)) {
                        context = (Context) obj2;
                    }
                }
                if (context == null) {
                    return;
                }
                Object[] objArr2 = methodHookParam.args;
                int length = objArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        intent = null;
                        break;
                    }
                    Object obj3 = objArr2[i];
                    if (obj3 instanceof Intent) {
                        intent = (Intent) obj3;
                        break;
                    } else if ((obj3 instanceof Intent[]) && ((Intent[]) obj3).length > 0) {
                        intent = ((Intent[]) obj3)[c];
                        break;
                    } else {
                        i++;
                        c = 0;
                    }
                }
                if (intent == null) {
                    return;
                }
                ComponentName component = intent.getComponent();
                String str = component == null ? "" : component.getClassName() + "/" + component.getShortClassName();
                Member member = methodHookParam.method;
                String strM1078E = member instanceof Method ? AbstractC0497v4.m1078E((Method) member) : "unknown";
                String strM1150c = AbstractC0539xe.m1150c(intent);
                if (AbstractC0539xe.m1152e(strM1150c)) {
                    if (AbstractC0539xe.m1154g(strM1150c) || AbstractC0539xe.m1153f(context, intent, str)) {
                        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                            AbstractC0497v4.m1076C("web guard skipped internal auth/security web before rewrite; upstream=" + strM1078E + ", activity=" + AbstractC0260i5.m535H1(AbstractC0497v4.m1088g(context), 180) + ", comp=" + AbstractC0260i5.m535H1(str, 180) + ", host=" + AbstractC0260i5.m535H1(AbstractC0539xe.m1151d(strM1150c), 120));
                            return;
                        }
                        return;
                    }
                    if (zRuntimeBool2) {
                        String strM1159l = AbstractC0539xe.m1159l(strM1150c);
                        if (!AbstractC0539xe.m1152e(strM1159l) || strM1159l.equals(strM1150c)) {
                            z = false;
                        } else {
                            try {
                                intent.putExtra("url", strM1159l);
                            } catch (Throwable unused) {
                            }
                            try {
                                intent.putExtra("key_url", strM1159l);
                            } catch (Throwable unused2) {
                            }
                            try {
                                intent.putExtra("target_url", strM1159l);
                            } catch (Throwable unused3) {
                            }
                            try {
                                intent.putExtra("raw_url", strM1159l);
                            } catch (Throwable unused4) {
                            }
                            try {
                                intent.putExtra("web_url", strM1159l);
                            } catch (Throwable unused5) {
                            }
                            try {
                                intent.setData(Uri.parse(strM1159l));
                            } catch (Throwable unused6) {
                            }
                            AbstractC0497v4.m1076C("unwrapped QQ risk url");
                            strM1150c = strM1159l;
                            z = true;
                        }
                    }
                    if (AbstractC0539xe.m1154g(strM1150c)) {
                        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                            AbstractC0497v4.m1076C("external browser kept internal auth/security web in QQ; upstream=" + strM1078E + ", activity=" + AbstractC0260i5.m535H1(AbstractC0497v4.m1088g(context), 180) + ", comp=" + AbstractC0260i5.m535H1(str, 180) + ", host=" + AbstractC0260i5.m535H1(AbstractC0539xe.m1151d(strM1150c), 120));
                            return;
                        }
                        return;
                    }
                    if (zRuntimeBool) {
                        if (AbstractC0539xe.m1152e(strM1150c)) {
                            z2 = true;
                            String strM1159l2 = AbstractC0539xe.m1159l(strM1150c);
                            if (AbstractC0539xe.m1152e(strM1159l2) && !strM1159l2.equals(strM1150c)) {
                                String strM1151d = AbstractC0539xe.m1151d(strM1159l2);
                                if ("qq.com".equals(strM1151d) || strM1151d.endsWith(".qq.com")) {
                                }
                            } else if (AbstractC0539xe.m1156i(strM1150c)) {
                                z3 = true;
                            } else {
                                String strM1151d2 = AbstractC0539xe.m1151d(strM1150c);
                                z4 = "qq.com".equals(strM1151d2) || strM1151d2.endsWith(".qq.com");
                            }
                            z3 = !z4;
                        } else {
                            z3 = false;
                            z2 = true;
                        }
                        if (!z3) {
                            if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                                AbstractC0497v4.m1076C("external browser kept QQ official link in QQ; upstream=" + strM1078E + ", activity=" + AbstractC0260i5.m535H1(AbstractC0497v4.m1088g(context), 180) + ", comp=" + AbstractC0260i5.m535H1(str, 180) + ", host=" + AbstractC0260i5.m535H1(AbstractC0539xe.m1151d(strM1150c), 120));
                                return;
                            }
                            return;
                        }
                    } else {
                        z2 = true;
                    }
                    if (zRuntimeBool && AbstractC0539xe.m1157j(intent, component, str, z, strM1150c)) {
                        if (AbstractC0539xe.m1152e(strM1150c)) {
                            System.currentTimeMillis();
                        }
                        if (AbstractC0539xe.m1158k(context, intent, strM1150c)) {
                            AbstractC0539xe.m1152e(strM1150c);
                            methodHookParam.setResult(null);
                            AbstractC0497v4.m1076C("redirected QQ web link to external browser; upstream=" + strM1078E + ", rootStart=" + z2 + ", skipConfirm=false");
                        }
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC0000a.m2c("tryHandleWebIntent failed: ", th);
        }
    }
}
