package p000;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: zb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0568zb extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1156a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f1157b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0203ec f1158c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Class f1159d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Field f1160e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ClassLoader f1161f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0568zb(String str, Method method, C0203ec c0203ec, Class cls, Field field, ClassLoader classLoader) {
        super(20);
        this.f1156a = str;
        this.f1157b = method;
        this.f1158c = c0203ec;
        this.f1159d = cls;
        this.f1160e = field;
        this.f1161f = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj = methodHookParam == null ? null : methodHookParam.thisObject;
        if (obj == null) {
            return;
        }
        AbstractC0219fc.m368H(obj.getClass(), this.f1156a, this.f1157b, this.f1158c, this.f1159d, this.f1160e, this.f1161f);
    }
}
