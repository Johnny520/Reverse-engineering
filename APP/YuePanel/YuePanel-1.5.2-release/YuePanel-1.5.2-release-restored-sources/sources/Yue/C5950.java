package Yue;

import org.slf4j.IMarkerFactory;
import org.slf4j.impl.StaticMarkerBinder;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5950 {

    /* JADX INFO: renamed from: ۥ */
    public static IMarkerFactory f1792;

    static {
        try {
            f1792 = m2611();
        } catch (Exception e) {
            C8157.m26828("Unexpected failure while binding MarkerFactory", e);
        } catch (NoClassDefFoundError unused) {
            f1792 = new C3525();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static IMarkerFactory m2611() throws NoClassDefFoundError {
        try {
            return StaticMarkerBinder.getSingleton().getMarkerFactory();
        } catch (NoSuchMethodError unused) {
            return StaticMarkerBinder.SINGLETON.getMarkerFactory();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static InterfaceC5949 m2612(String str) {
        return f1792.mo590(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static IMarkerFactory m18705() {
        return f1792;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static InterfaceC5949 m18706(String str) {
        return f1792.mo589(str);
    }
}
