package Yue;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "CloseableKt")
public final class C3849 {
    @InterfaceC6839
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ */
    public static final void m904(@InterfaceC6489 Closeable closeable, @InterfaceC6489 Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C4741.m1656(th, th2);
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T extends Closeable, R> R m905(T t, InterfaceC5124<? super T, ? extends R> interfaceC5124) throws IOException {
        C5499.m17103(interfaceC5124, "block");
        try {
            R rInvoke = interfaceC5124.invoke(t);
            C5437.m16930(1);
            if (C6671.m3162(1, 1, 0)) {
                m904(t, null);
            } else if (t != null) {
                t.close();
            }
            C5437.m16929(1);
            return rInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5437.m16930(1);
                if (C6671.m3162(1, 1, 0)) {
                    m904(t, th);
                } else if (t != null) {
                    try {
                        t.close();
                    } catch (Throwable unused) {
                    }
                }
                C5437.m16929(1);
                throw th2;
            }
        }
    }
}
