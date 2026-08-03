package Yue;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4479 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C0413 f915 = C0413.f917;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final InterfaceC4479 f916 = new C0413.C4480();

    /* JADX INFO: renamed from: Yue.ۥ۠۟ۧۢ$ۥ */
    public static final class C0413 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ C0413 f917 = new C0413();

        /* JADX INFO: renamed from: Yue.ۥ۠۟ۧۢ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4480 implements InterfaceC4479 {
            @Override // Yue.InterfaceC4479
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ */
            public List<InetAddress> mo1404(@InterfaceC6399 String str) throws UnknownHostException {
                C5499.m17103(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C5499.m17102(allByName, "getAllByName(hostname)");
                    return C3411.m8926(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    List<InetAddress> mo1404(@InterfaceC6399 String str) throws UnknownHostException;
}
