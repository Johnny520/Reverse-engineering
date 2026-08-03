package Yue;

import Yue.InterfaceC4225;
import Yue.InterfaceC5542;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5555 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC4047 m2290(@InterfaceC6489 InterfaceC5542 interfaceC5542) {
        return new C5545(interfaceC5542);
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥ۠ۦ۟ۨ.ۥ۟۟۟(Yue.ۥ۠ۦ۟ۡ, int, java.lang.Object):Yue.ۥ۠ۦ۟ۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @InterfaceC5572(name = "Job")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ InterfaceC5542 m2291(InterfaceC5542 interfaceC5542) {
        return C5553.m2286(interfaceC5542);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC4047 m17215(InterfaceC5542 interfaceC5542, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5542 = null;
        }
        return C5553.m2286(interfaceC5542);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC5542 m17216(InterfaceC5542 interfaceC5542, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5542 = null;
        }
        return m2291(interfaceC5542);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m17218(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6489 CancellationException cancellationException) {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507);
        if (interfaceC5542 != null) {
            interfaceC5542.mo6939(cancellationException);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m17219(@InterfaceC6399 InterfaceC5542 interfaceC5542, @InterfaceC6399 String str, @InterfaceC6489 Throwable th) {
        interfaceC5542.mo6939(C4739.m1654(str, th));
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m17220(InterfaceC4225 interfaceC4225, Throwable th) throws Throwable {
        InterfaceC4225.InterfaceC0357 interfaceC0357 = interfaceC4225.get(InterfaceC5542.f13507);
        C5557 c5557 = interfaceC0357 instanceof C5557 ? (C5557) interfaceC0357 : null;
        if (c5557 == null) {
            return false;
        }
        c5557.mo9588(m17240(th, c5557));
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m17221(InterfaceC4225 interfaceC4225, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C5553.m17191(interfaceC4225, cancellationException);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m17222(InterfaceC5542 interfaceC5542, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        C5553.m17192(interfaceC5542, str, th);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ boolean m17223(InterfaceC4225 interfaceC4225, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return m17220(interfaceC4225, th);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final Object m17224(@InterfaceC6399 InterfaceC5542 interfaceC5542, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        InterfaceC5542.C0790.m2276(interfaceC5542, null, 1, null);
        Object objMo17163 = interfaceC5542.mo17163(interfaceC4199);
        return objMo17163 == C5508.m17142() ? objMo17163 : C8107.f3222;
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final /* synthetic */ void m17226(InterfaceC4225 interfaceC4225, Throwable th) throws Throwable {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507);
        if (interfaceC5542 == null) {
            return;
        }
        for (InterfaceC5542 interfaceC55422 : interfaceC5542.mo17159()) {
            C5557 c5557 = interfaceC55422 instanceof C5557 ? (C5557) interfaceC55422 : null;
            if (c5557 != null) {
                c5557.mo9588(m17240(th, interfaceC5542));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m17227(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6489 CancellationException cancellationException) {
        InterfaceC7326<InterfaceC5542> interfaceC7326Mo17159;
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507);
        if (interfaceC5542 == null || (interfaceC7326Mo17159 = interfaceC5542.mo17159()) == null) {
            return;
        }
        Iterator<InterfaceC5542> it = interfaceC7326Mo17159.iterator();
        while (it.hasNext()) {
            it.next().mo6939(cancellationException);
        }
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final /* synthetic */ void m17229(InterfaceC5542 interfaceC5542, Throwable th) throws Throwable {
        for (InterfaceC5542 interfaceC55422 : interfaceC5542.mo17159()) {
            C5557 c5557 = interfaceC55422 instanceof C5557 ? (C5557) interfaceC55422 : null;
            if (c5557 != null) {
                c5557.mo9588(m17240(th, interfaceC5542));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final void m17230(@InterfaceC6399 InterfaceC5542 interfaceC5542, @InterfaceC6489 CancellationException cancellationException) {
        Iterator<InterfaceC5542> it = interfaceC5542.mo17159().iterator();
        while (it.hasNext()) {
            it.next().mo6939(cancellationException);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m17231(InterfaceC4225 interfaceC4225, Throwable th, int i, Object obj) throws Throwable {
        if ((i & 1) != 0) {
            th = null;
        }
        m17226(interfaceC4225, th);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m17232(InterfaceC4225 interfaceC4225, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C5553.m17200(interfaceC4225, cancellationException);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m17233(InterfaceC5542 interfaceC5542, Throwable th, int i, Object obj) throws Throwable {
        if ((i & 1) != 0) {
            th = null;
        }
        m17229(interfaceC5542, th);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m17234(InterfaceC5542 interfaceC5542, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C5553.m17203(interfaceC5542, cancellationException);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final InterfaceC4433 m17235(@InterfaceC6399 InterfaceC5542 interfaceC5542, @InterfaceC6399 InterfaceC4433 interfaceC4433) {
        return interfaceC5542.mo17160(new C4435(interfaceC4433));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final void m17236(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507);
        if (interfaceC5542 != null) {
            C5553.m17212(interfaceC5542);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final void m17237(@InterfaceC6399 InterfaceC5542 interfaceC5542) {
        if (!interfaceC5542.mo5773()) {
            throw interfaceC5542.mo17161();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final InterfaceC5542 m17238(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507);
        if (interfaceC5542 != null) {
            return interfaceC5542;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC4225).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final boolean m17239(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507);
        return interfaceC5542 != null && interfaceC5542.mo5773();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final Throwable m17240(Throwable th, InterfaceC5542 interfaceC5542) {
        return th == null ? new C5543("Job was cancelled", null, interfaceC5542) : th;
    }
}
