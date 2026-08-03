package Yue;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: Yue.ۥۢۡۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5572(name = "TimersKt")
public final class C7831 {

    /* JADX INFO: renamed from: Yue.ۥۢۡۥ۠$ۥ */
    @InterfaceC7507({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    public static final class C1375 extends TimerTask {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<TimerTask, C8107> f23443;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.util.TimerTask, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C1375(InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
            this.f23443 = interfaceC5124;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f23443.invoke(this);
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ */
    public static final Timer m3926(String str, boolean z, long j, long j2, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "action");
        Timer timerM24861 = m24861(str, z);
        timerM24861.scheduleAtFixedRate(new C1375(interfaceC5124), j, j2);
        return timerM24861;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Timer m3927(String str, boolean z, Date date, long j, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(date, "startAt");
        C5499.m17103(interfaceC5124, "action");
        Timer timerM24861 = m24861(str, z);
        timerM24861.scheduleAtFixedRate(new C1375(interfaceC5124), date, j);
        return timerM24861;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Timer m24853(String str, boolean z, long j, long j2, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        C5499.m17103(interfaceC5124, "action");
        Timer timerM24861 = m24861(str, z);
        timerM24861.scheduleAtFixedRate(new C1375(interfaceC5124), j, j2);
        return timerM24861;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Timer m24854(String str, boolean z, Date date, long j, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        C5499.m17103(date, "startAt");
        C5499.m17103(interfaceC5124, "action");
        Timer timerM24861 = m24861(str, z);
        timerM24861.scheduleAtFixedRate(new C1375(interfaceC5124), date, j);
        return timerM24861;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final TimerTask m24855(Timer timer, long j, long j2, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(timer, "<this>");
        C5499.m17103(interfaceC5124, "action");
        C1375 c1375 = new C1375(interfaceC5124);
        timer.schedule(c1375, j, j2);
        return c1375;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final TimerTask m24856(Timer timer, long j, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(timer, "<this>");
        C5499.m17103(interfaceC5124, "action");
        C1375 c1375 = new C1375(interfaceC5124);
        timer.schedule(c1375, j);
        return c1375;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final TimerTask m24857(Timer timer, Date date, long j, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(timer, "<this>");
        C5499.m17103(date, "time");
        C5499.m17103(interfaceC5124, "action");
        C1375 c1375 = new C1375(interfaceC5124);
        timer.schedule(c1375, date, j);
        return c1375;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final TimerTask m24858(Timer timer, Date date, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(timer, "<this>");
        C5499.m17103(date, "time");
        C5499.m17103(interfaceC5124, "action");
        C1375 c1375 = new C1375(interfaceC5124);
        timer.schedule(c1375, date);
        return c1375;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final TimerTask m24859(Timer timer, long j, long j2, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(timer, "<this>");
        C5499.m17103(interfaceC5124, "action");
        C1375 c1375 = new C1375(interfaceC5124);
        timer.scheduleAtFixedRate(c1375, j, j2);
        return c1375;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final TimerTask m24860(Timer timer, Date date, long j, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(timer, "<this>");
        C5499.m17103(date, "time");
        C5499.m17103(interfaceC5124, "action");
        C1375 c1375 = new C1375(interfaceC5124);
        timer.scheduleAtFixedRate(c1375, date, j);
        return c1375;
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Timer m24861(@InterfaceC6489 String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final Timer m24862(String str, boolean z, long j, long j2, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "action");
        Timer timerM24861 = m24861(str, z);
        timerM24861.schedule(new C1375(interfaceC5124), j, j2);
        return timerM24861;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final Timer m24863(String str, boolean z, Date date, long j, InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(date, "startAt");
        C5499.m17103(interfaceC5124, "action");
        Timer timerM24861 = m24861(str, z);
        timerM24861.schedule(new C1375(interfaceC5124), date, j);
        return timerM24861;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ Timer m24864(String str, boolean z, long j, long j2, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        C5499.m17103(interfaceC5124, "action");
        Timer timerM24861 = m24861(str, z);
        timerM24861.schedule(new C1375(interfaceC5124), j, j2);
        return timerM24861;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ Timer m24865(String str, boolean z, Date date, long j, InterfaceC5124 interfaceC5124, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        C5499.m17103(date, "startAt");
        C5499.m17103(interfaceC5124, "action");
        Timer timerM24861 = m24861(str, z);
        timerM24861.schedule(new C1375(interfaceC5124), date, j);
        return timerM24861;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final TimerTask m24866(InterfaceC5124<? super TimerTask, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "action");
        return new C1375(interfaceC5124);
    }
}
