package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: bd */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0030bd extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f69a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f70b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0030bd(String str, Method method) {
        super(82);
        this.f69a = str;
        this.f70b = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c8  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object objValueOf;
        if (HookEntry.runtimeBool(Prefs.KEY_MEDIA_CLICK_TO_LOAD)) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            boolean zM345a = AbstractC0204ed.m345a(stackTrace);
            String str = this.f69a;
            if (!zM345a) {
                AbstractC0204ed.m347c("rich_media_unmatched", str, stackTrace);
                return;
            }
            Class<?> returnType = this.f70b.getReturnType();
            Class<?> cls = Integer.TYPE;
            if (returnType == cls || returnType == Integer.class) {
                objValueOf = Integer.MAX_VALUE;
            } else {
                Class<?> cls2 = Long.TYPE;
                if (returnType == cls2 || returnType == Long.class) {
                    objValueOf = Long.MAX_VALUE;
                } else {
                    Class<?> cls3 = Short.TYPE;
                    if (returnType == cls3 || returnType == Short.class) {
                        objValueOf = Short.MAX_VALUE;
                    } else {
                        Class<?> cls4 = Byte.TYPE;
                        if (returnType == cls4 || returnType == Byte.class) {
                            objValueOf = (byte) 127;
                        } else {
                            Class<?> cls5 = Float.TYPE;
                            if (returnType == cls5 || returnType == Float.class) {
                                objValueOf = Float.valueOf(Float.MAX_VALUE);
                            } else {
                                Class<?> cls6 = Double.TYPE;
                                if (returnType == cls6 || returnType == Double.class) {
                                    objValueOf = Double.valueOf(Double.MAX_VALUE);
                                } else if (returnType == null || returnType == Void.TYPE) {
                                    objValueOf = null;
                                } else if (returnType == Boolean.TYPE || returnType == Boolean.class) {
                                    objValueOf = Boolean.FALSE;
                                } else if (returnType == cls4 || returnType == Byte.class) {
                                    objValueOf = (byte) 0;
                                } else if (returnType == cls3 || returnType == Short.class) {
                                    objValueOf = (short) 0;
                                } else if (returnType == Character.TYPE || returnType == Character.class) {
                                    objValueOf = (char) 0;
                                } else if (returnType == cls || returnType == Integer.class) {
                                    objValueOf = 0;
                                } else if (returnType == cls2 || returnType == Long.class) {
                                    objValueOf = 0L;
                                } else if (returnType == cls5 || returnType == Float.class) {
                                    objValueOf = Float.valueOf(0.0f);
                                } else if (returnType == cls6 || returnType == Double.class) {
                                    objValueOf = Double.valueOf(0.0d);
                                }
                            }
                        }
                    }
                }
            }
            methodHookParam.setResult(objValueOf);
            AbstractC0204ed.m346b("rich_media_auto_load_blocked", str, stackTrace);
        }
    }
}
