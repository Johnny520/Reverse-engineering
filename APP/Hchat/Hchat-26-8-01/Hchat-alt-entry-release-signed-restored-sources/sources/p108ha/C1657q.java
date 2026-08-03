package p108ha;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p085fg.InterfaceC1231l;

/* JADX INFO: renamed from: ha.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1657q implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5448g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Class f5449h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1657q(C1659s c1659s, Class cls, int i9) {
        this.f5448g = i9;
        this.f5449h = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean zM4232e;
        boolean z9;
        switch (this.f5448g) {
            case 0:
                Method method = (Method) obj;
                method.getClass();
                zM4232e = C1659s.m4232e(this.f5449h, method);
                break;
            case 1:
                Method method2 = (Method) obj;
                method2.getClass();
                zM4232e = C1659s.m4234g(this.f5449h, method2);
                break;
            case 2:
                Method method3 = (Method) obj;
                method3.getClass();
                Class<?> returnType = method3.getReturnType();
                return Boolean.valueOf((returnType.isPrimitive() || returnType.equals(Void.TYPE) || returnType.equals(this.f5449h)) ? false : true);
            default:
                Field field = (Field) obj;
                field.getClass();
                if (Modifier.isStatic(field.getModifiers())) {
                    z9 = this.f5449h.isAssignableFrom(field.getType());
                }
                return Boolean.valueOf(z9);
        }
        return Boolean.valueOf(zM4232e);
    }

    public /* synthetic */ C1657q(Class cls, int i9) {
        this.f5448g = i9;
        this.f5449h = cls;
    }
}
