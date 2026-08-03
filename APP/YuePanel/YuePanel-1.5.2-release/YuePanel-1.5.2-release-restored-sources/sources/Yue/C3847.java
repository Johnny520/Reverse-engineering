package Yue;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3847 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0272 f7343 = new C0272(null);

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final Method f548;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final Method f549;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final Method f7344;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۨۦ$ۥ */
    public static final class C0272 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۤۨۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0272(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C3847 m903() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new C3847(method3, method2, method);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0272() {
        }
    }

    public C3847(@InterfaceC6489 Method method, @InterfaceC6489 Method method2, @InterfaceC6489 Method method3) {
        this.f548 = method;
        this.f549 = method2;
        this.f7344 = method3;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final Object m901(@InterfaceC6399 String str) {
        C5499.m17103(str, "closer");
        Method method = this.f548;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f549;
                C5499.m17100(method2);
                method2.invoke(objInvoke, str);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m902(@InterfaceC6489 Object obj) {
        if (obj != null) {
            try {
                Method method = this.f7344;
                C5499.m17100(method);
                method.invoke(obj, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
