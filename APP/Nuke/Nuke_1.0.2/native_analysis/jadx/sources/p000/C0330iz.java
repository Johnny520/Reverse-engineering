package p000;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: iz */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0330iz implements gs1, bq0, uk2 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4845h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f4846i;

    public /* synthetic */ C0330iz(int i, Object obj) {
        this.f4845h = i;
        this.f4846i = obj;
    }

    @Override // p000.gs1
    /* JADX INFO: renamed from: a */
    public Object mo2023a() {
        int i = this.f4845h;
        Object obj = this.f4846i;
        switch (i) {
            case 0:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    tp0 tp0Var = h72.f3884a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + h72.m2117b(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + h72.m2117b(constructor) + "' with no args", e3.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return m83.f6517a.mo2304a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // p000.uk2
    /* JADX INFO: renamed from: d */
    public vk2 mo686d(th2 th2Var) {
        File file = (File) this.f4846i;
        file.getClass();
        File fileM5901g0 = wi0.m5901g0(file, th2Var.f10774c);
        return new vk2(wi0.m5901g0(fileM5901g0, "data"), wi0.m5901g0(fileM5901g0, "cache"), null);
    }

    @Override // p000.bq0
    public Object get() {
        return new lp0();
    }
}
