package p001;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: ۟.fa */
/* JADX INFO: loaded from: classes.dex */
public final class C0215fa {

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC0191e0 f794;

    /* JADX INFO: renamed from: ۥ۟ */
    public final a f795;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f1456;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public long f1457;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public long f1458;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public long f1459;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public long f1460;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public long f1461;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public long f1462;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public long f1463;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public int f1464;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public int f1465;

    /* JADX INFO: renamed from: ۥ۠ */
    public int f796;

    /* JADX INFO: renamed from: ۟.fa$a */
    public static class a extends Handler {

        /* JADX INFO: renamed from: ۥ */
        public final C0215fa f797;

        /* JADX INFO: renamed from: ۟.fa$a$a, reason: collision with other inner class name */
        public class RunnableC0495a implements Runnable {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ Message f798;

            public RunnableC0495a(Message message) {
                this.f798 = message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sbM1039 = C0167c4.m1039("Unhandled stats message.");
                sbM1039.append(this.f798.what);
                throw new AssertionError(sbM1039.toString());
            }
        }

        public a(Looper looper, C0215fa c0215fa) {
            super(looper);
            this.f797 = c0215fa;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f797.f1456++;
                return;
            }
            if (i == 1) {
                this.f797.f1457++;
                return;
            }
            if (i == 2) {
                C0215fa c0215fa = this.f797;
                long j = message.arg1;
                int i2 = c0215fa.f1465 + 1;
                c0215fa.f1465 = i2;
                long j2 = c0215fa.f1459 + j;
                c0215fa.f1459 = j2;
                c0215fa.f1462 = j2 / ((long) i2);
                return;
            }
            if (i == 3) {
                C0215fa c0215fa2 = this.f797;
                long j3 = message.arg1;
                c0215fa2.f796++;
                long j4 = c0215fa2.f1460 + j3;
                c0215fa2.f1460 = j4;
                c0215fa2.f1463 = j4 / ((long) c0215fa2.f1465);
                return;
            }
            if (i != 4) {
                C0481z7.f1228.post(new RunnableC0495a(message));
                return;
            }
            C0215fa c0215fa3 = this.f797;
            Long l = (Long) message.obj;
            c0215fa3.f1464++;
            long jLongValue = l.longValue() + c0215fa3.f1458;
            c0215fa3.f1458 = jLongValue;
            c0215fa3.f1461 = jLongValue / ((long) c0215fa3.f1464);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0215fa(InterfaceC0191e0 interfaceC0191e0) {
        this.f794 = interfaceC0191e0;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = C0259ic.f866;
        HandlerC0245hc handlerC0245hc = new HandlerC0245hc(looper);
        handlerC0245hc.sendMessageDelayed(handlerC0245hc.obtainMessage(), 1000L);
        this.f795 = new a(handlerThread.getLooper(), this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public final C0229ga m855() {
        int i;
        int i2;
        C0238h5 c0238h5 = (C0238h5) this.f794;
        synchronized (c0238h5) {
            i = c0238h5.f831;
        }
        C0238h5 c0238h52 = (C0238h5) this.f794;
        synchronized (c0238h52) {
            i2 = c0238h52.f1496;
        }
        return new C0229ga(i, i2, this.f1456, this.f1457, this.f1458, this.f1459, this.f1460, this.f1461, this.f1462, this.f1463, this.f1464, this.f1465, this.f796, System.currentTimeMillis());
    }
}
