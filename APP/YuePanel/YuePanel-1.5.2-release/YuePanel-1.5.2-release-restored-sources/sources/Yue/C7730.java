package Yue;

import Yue.C5111;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7730 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m3824(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) C5355.f13042)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) C5111.C0646.f12120)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) C5111.C0646.f12120)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) C5355.f13042)) + " s ";
        }
        C7610 c7610 = C7610.f2968;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        C5499.m17102(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m24575(AbstractC7724 abstractC7724, C7731 c7731, String str) {
        Logger loggerM3831 = C7733.f23261.m3831();
        StringBuilder sb = new StringBuilder();
        sb.append(c7731.m24585());
        sb.append(' ');
        C7610 c7610 = C7610.f2968;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C5499.m17102(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(abstractC7724.m3820());
        loggerM3831.fine(sb.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m24576(@InterfaceC6399 AbstractC7724 abstractC7724, @InterfaceC6399 C7731 c7731, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        long jMo24607;
        C5499.m17103(abstractC7724, "task");
        C5499.m17103(c7731, "queue");
        C5499.m17103(interfaceC5122, "block");
        boolean zIsLoggable = C7733.f23261.m3831().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jMo24607 = c7731.m24588().m24603().mo24607();
            m24575(abstractC7724, c7731, "starting");
        } else {
            jMo24607 = -1;
        }
        try {
            T tInvoke = interfaceC5122.invoke();
            C5437.m16930(1);
            if (zIsLoggable) {
                m24575(abstractC7724, c7731, "finished run in " + m3824(c7731.m24588().m24603().mo24607() - jMo24607));
            }
            C5437.m16929(1);
            return tInvoke;
        } catch (Throwable th) {
            C5437.m16930(1);
            if (zIsLoggable) {
                m24575(abstractC7724, c7731, "failed a run in " + m3824(c7731.m24588().m24603().mo24607() - jMo24607));
            }
            C5437.m16929(1);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m24577(@InterfaceC6399 AbstractC7724 abstractC7724, @InterfaceC6399 C7731 c7731, @InterfaceC6399 InterfaceC5122<String> interfaceC5122) {
        C5499.m17103(abstractC7724, "task");
        C5499.m17103(c7731, "queue");
        C5499.m17103(interfaceC5122, "messageBlock");
        if (C7733.f23261.m3831().isLoggable(Level.FINE)) {
            m24575(abstractC7724, c7731, interfaceC5122.invoke());
        }
    }
}
