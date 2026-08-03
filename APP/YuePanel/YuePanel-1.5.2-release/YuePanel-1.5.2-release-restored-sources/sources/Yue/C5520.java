package Yue;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5520 extends C6670 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۤ$ۥ */
    @InterfaceC7507({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    public static final class C0782 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0782 f1547 = new C0782();

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC5568
        @InterfaceC6489
        public static final Integer f1548;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f1548 = num;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    private final boolean m17149(int i) {
        Integer num = C0782.f1548;
        return num == null || num.intValue() >= i;
    }

    @Override // Yue.C6670
    /* JADX INFO: renamed from: ۥ */
    public void mo2264(@InterfaceC6399 Throwable th, @InterfaceC6399 Throwable th2) throws IllegalAccessException, InvocationTargetException {
        C5499.m17103(th, "cause");
        C5499.m17103(th2, "exception");
        if (m17149(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo2264(th, th2);
        }
    }

    @Override // Yue.C6670
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public List<Throwable> mo17150(@InterfaceC6399 Throwable th) {
        C5499.m17103(th, "exception");
        if (!m17149(19)) {
            return super.mo17150(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        C5499.m17102(suppressed, "exception.suppressed");
        return C3404.m7069(suppressed);
    }
}
