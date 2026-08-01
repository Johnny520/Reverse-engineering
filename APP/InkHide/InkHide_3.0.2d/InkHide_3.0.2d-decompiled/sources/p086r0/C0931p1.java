package p086r0;

import java.lang.reflect.Method;
import p011F0.AbstractC0120h;
import p025M0.InterfaceC0193a;
import p025M0.InterfaceC0204l;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.p1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0931p1 implements InterfaceC0193a, InterfaceC0204l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0943t1 f3315a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [r0.t1.handleHook(android.content.Context, de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam):void, r0.t1.y(java.lang.Class, java.lang.String):void] */
    public /* synthetic */ C0931p1(C0943t1 c0943t1) {
        this.f3315a = c0943t1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0193a
    /* JADX INFO: renamed from: b */
    public Object mo7b() {
        return new C0934q1(this.f3315a, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public Object mo8c(Object obj) {
        Method method = (Method) obj;
        AbstractC0223g.m415b(method);
        this.f3315a.getClass();
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        return name + "(" + AbstractC0120h.m260h0(parameterTypes, ",", new C0925n1(2), 30) + ")";
    }
}
