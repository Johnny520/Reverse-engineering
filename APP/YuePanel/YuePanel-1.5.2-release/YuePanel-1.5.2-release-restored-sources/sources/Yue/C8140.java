package Yue;

import android.os.UserHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۣۣۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8140 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public static Method f3243;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6490
    public static Constructor<UserHandle> f3244;

    /* JADX INFO: renamed from: Yue.ۥۣۣۣۢ$ۥ */
    @InterfaceC7113(24)
    public static class C1439 {
        private C1439() {
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public static UserHandle m4166(int i) {
            return UserHandle.getUserHandleForUid(i);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static Method m4164() throws NoSuchMethodException {
        if (f3243 == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f3243 = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f3243;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static Constructor<UserHandle> m4165() throws NoSuchMethodException {
        if (f3244 == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f3244 = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f3244;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static UserHandle m26773(int i) {
        return C1439.m4166(i);
    }
}
