package Yue;

import Yue.C5048;
import Yue.C5058;
import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3654 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final C5058.C5060 f442;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final Handler f443;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۟$ۥ */
    public class RunnableC0214 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C5058.C5060 f6462;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Typeface f6463;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC0214(C5058.C5060 c5060, Typeface typeface) {
            this.f6462 = c5060;
            this.f6463 = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6462.mo1883(this.f6463);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۟$ۥ۟ */
    public class RunnableC0215 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C5058.C5060 f6465;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f6466;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC0215(C5058.C5060 c5060, int i) {
            this.f6465 = c5060;
            this.f6466 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6465.mo1882(this.f6466);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3654(@InterfaceC6391 C5058.C5060 c5060, @InterfaceC6391 Handler handler) {
        this.f442 = c5060;
        this.f443 = handler;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m724(int i) {
        this.f443.post(new RunnableC0215(this.f442, i));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m725(@InterfaceC6391 C5048.C5051 c5051) {
        if (c5051.m1867()) {
            m9986(c5051.f1232);
        } else {
            m724(c5051.f1233);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m9986(@InterfaceC6391 Typeface typeface) {
        this.f443.post(new RunnableC0214(this.f442, typeface));
    }

    public C3654(@InterfaceC6391 C5058.C5060 c5060) {
        this.f442 = c5060;
        this.f443 = C3655.m726();
    }
}
