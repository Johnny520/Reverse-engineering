package Yue;

import java.io.Closeable;

/* JADX INFO: renamed from: Yue.ۥۣۡۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6544 {
    @InterfaceC6399
    @InterfaceC5572(name = "blackhole")
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC7472 m3013() {
        return new C3539();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC3603 m3014(@InterfaceC6399 InterfaceC7472 interfaceC7472) {
        C5499.m17103(interfaceC7472, "<this>");
        return new C7022(interfaceC7472);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final InterfaceC3604 m20870(@InterfaceC6399 InterfaceC7506 interfaceC7506) {
        C5499.m17103(interfaceC7506, "<this>");
        return new C7023(interfaceC7506);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T extends Closeable, R> R m20871(T t, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) throws Throwable {
        R rInvoke;
        C5499.m17103(interfaceC5124, "block");
        Throwable th = null;
        try {
            rInvoke = interfaceC5124.invoke(t);
            C5437.m16930(1);
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            C5437.m16929(1);
        } catch (Throwable th3) {
            C5437.m16930(1);
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable th4) {
                    C4741.m1656(th3, th4);
                }
            }
            C5437.m16929(1);
            th = th3;
            rInvoke = null;
        }
        if (th != null) {
            throw th;
        }
        C5499.m17100(rInvoke);
        return rInvoke;
    }
}
