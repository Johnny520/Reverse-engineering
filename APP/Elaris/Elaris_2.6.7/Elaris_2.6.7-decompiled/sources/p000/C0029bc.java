package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: bc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0029bc extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Method f68a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0029bc(Method method) {
        super(48);
        this.f68a = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0 A[SYNTHETIC] */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Integer numValueOf;
        String str;
        Field fieldM362B;
        Field fieldM362B2;
        if (AbstractC0219fc.m393f()) {
            Object result = methodHookParam == null ? null : methodHookParam.getResult();
            if (result == null || !result.getClass().isArray()) {
                return;
            }
            int length = Array.getLength(result);
            Class<?> componentType = result.getClass().getComponentType();
            if (System.currentTimeMillis() < AbstractC0219fc.f273o) {
                methodHookParam.setResult(Array.newInstance(componentType, 0));
                AbstractC0219fc.m389b(null, null);
                AbstractC0219fc.m395h(this.f68a.getDeclaringClass(), length);
                return;
            }
            AbstractC0219fc.m387a();
            for (int i = 0; i < length; i++) {
                Object obj = Array.get(result, i);
                if (obj != null) {
                    try {
                        Class<?> cls = obj.getClass();
                        Class cls2 = Integer.TYPE;
                        fieldM362B2 = AbstractC0219fc.m362B(cls, cls2, "id");
                        if (fieldM362B2 == null) {
                            fieldM362B2 = AbstractC0219fc.m362B(obj.getClass(), cls2, "a");
                        }
                        if (fieldM362B2 == null) {
                            fieldM362B2 = AbstractC0219fc.m409v(obj.getClass(), cls2);
                        }
                    } catch (Throwable unused) {
                    }
                    if (fieldM362B2 == null) {
                        numValueOf = null;
                    } else {
                        fieldM362B2.setAccessible(true);
                        numValueOf = Integer.valueOf(fieldM362B2.getInt(obj));
                    }
                    if (numValueOf != null && numValueOf.intValue() == 14787861) {
                        return;
                    }
                    try {
                        fieldM362B = AbstractC0219fc.m362B(obj.getClass(), String.class, "title");
                        if (fieldM362B == null) {
                            fieldM362B = AbstractC0219fc.m362B(obj.getClass(), String.class, "a");
                        }
                        if (fieldM362B == null) {
                            fieldM362B = AbstractC0219fc.m409v(obj.getClass(), String.class);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (fieldM362B == null) {
                        str = null;
                        if (!"复读".equals(str)) {
                            return;
                        }
                    } else {
                        fieldM362B.setAccessible(true);
                        Object obj2 = fieldM362B.get(obj);
                        if (obj2 instanceof String) {
                            str = (String) obj2;
                        }
                        if (!"复读".equals(str)) {
                        }
                    }
                }
            }
            try {
                Object objM390c = AbstractC0219fc.m390c(componentType);
                Object objNewInstance = Array.newInstance(componentType, length + 1);
                System.arraycopy(result, 0, objNewInstance, 0, length);
                Array.set(objNewInstance, length, objM390c);
                methodHookParam.setResult(objNewInstance);
                if (AbstractC0219fc.f271m) {
                    return;
                }
                AbstractC0219fc.f271m = true;
                HookEntry.log("repeater legacy long press menu add success");
            } catch (Throwable th) {
                AbstractC0000a.m3d(th, new StringBuilder("repeater legacy long press menu add failed reason="), ": ");
            }
        }
    }
}
