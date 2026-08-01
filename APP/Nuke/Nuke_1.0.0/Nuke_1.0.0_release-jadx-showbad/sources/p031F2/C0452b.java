package p031F2;

import android.util.Log;
import p000A.C0065i;
import p002A1.C0115D;
import p005A4.InterfaceC0162b;
import p049I2.AbstractC0797o;
import p056K2.C0887m;

/* JADX INFO: renamed from: F2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0452b {

    /* JADX INFO: renamed from: a */
    public static final C0887m f1350a = AbstractC0797o.m1396u(new C0065i(6));

    /* JADX INFO: renamed from: b */
    public static final C0887m f1351b;

    /* JADX INFO: renamed from: c */
    public static final C0115D f1352c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0451a f1353d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0887m c0887mM1396u = AbstractC0797o.m1396u(new C0065i(7));
        f1351b = c0887mM1396u;
        f1352c = new C0115D(11);
        EnumC0451a enumC0451a = EnumC0451a.f1348d;
        f1353d = enumC0451a;
        if (!((Boolean) c0887mM1396u.getValue()).booleanValue()) {
            System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "warn");
        }
        f1353d = enumC0451a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m737a(String str, Throwable th) {
        if (f1353d.ordinal() <= 2) {
            f1352c.getClass();
            if (((Boolean) f1351b.getValue()).booleanValue()) {
                Log.w("KavaRef", String.valueOf(str), th);
            } else {
                ((InterfaceC0162b) f1350a.getValue()).mo231c(String.valueOf(str), th);
            }
        }
    }
}
