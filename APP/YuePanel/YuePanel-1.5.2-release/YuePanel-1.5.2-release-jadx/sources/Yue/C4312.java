package Yue;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4312 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final String f817 = "kotlinx.coroutines.debug";

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final String f818 = "kotlinx.coroutines.stacktrace.recovery";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f8850 = "auto";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f8851 = "on";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f8852 = "off";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean f8853 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f8854;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f8855;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final AtomicLong f8856;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r0.equals(Yue.C4312.f8851) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r0.equals("") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r0 = true;
     */
    static {
        boolean z;
        String strM24501 = C7705.m24501(f817);
        if (strM24501 == null) {
            z = false;
        } else {
            int iHashCode = strM24501.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 3551) {
                    if (iHashCode == 109935) {
                    }
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.debug' has unrecognized value '" + strM24501 + '\'').toString());
            }
        }
        f8854 = z;
        f8855 = z && C7705.m24502(f818, true);
        f8856 = new AtomicLong(0L);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final void m1270(InterfaceC5122<Boolean> interfaceC5122) {
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m1271() {
        return f8853;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final AtomicLong m12457() {
        return f8856;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m12458() {
        return f8854;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m12459() {
        return f8855;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m12460() {
        f8856.set(0L);
    }
}
