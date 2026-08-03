package Yue;

import Yue.C7797;
import Yue.InterfaceC7788;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6205<T> implements InterfaceC7788<T> {

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ */
    public class C0937 implements InterfaceC7788.InterfaceC1355<T> {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f15278 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f15279 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f15280 = 3;

        /* JADX INFO: renamed from: ۥ */
        public final C6208 f1898 = new C6208();

        /* JADX INFO: renamed from: ۥ۟ */
        public final Handler f1899 = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Runnable f15281 = new RunnableC6206();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7788.InterfaceC1355 f15282;

        /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ$ۥ, reason: contains not printable characters */
        public class RunnableC6206 implements Runnable {
            public RunnableC6206() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C6209 c6209M2692 = C0937.this.f1898.m2692();
                while (c6209M2692 != null) {
                    int i = c6209M2692.f1904;
                    if (i == 1) {
                        C0937.this.f15282.mo506(c6209M2692.f15296, c6209M2692.f15297);
                    } else if (i == 2) {
                        C0937.this.f15282.mo9042(c6209M2692.f15296, (C7797.C1362) c6209M2692.f15301);
                    } else if (i != 3) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + c6209M2692.f1904);
                    } else {
                        C0937.this.f15282.mo505(c6209M2692.f15296, c6209M2692.f15297);
                    }
                    c6209M2692 = C0937.this.f1898.m2692();
                }
            }
        }

        public C0937(InterfaceC7788.InterfaceC1355 interfaceC1355) {
            this.f15282 = interfaceC1355;
        }

        @Override // Yue.InterfaceC7788.InterfaceC1355
        /* JADX INFO: renamed from: ۥ */
        public void mo505(int i, int i2) {
            m19104(C6209.m2694(3, i, i2));
        }

        @Override // Yue.InterfaceC7788.InterfaceC1355
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo506(int i, int i2) {
            m19104(C6209.m2694(1, i, i2));
        }

        @Override // Yue.InterfaceC7788.InterfaceC1355
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo9042(int i, C7797.C1362<T> c1362) {
            m19104(C6209.m19110(2, i, c1362));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m19104(C6209 c6209) {
            this.f1898.m19108(c6209);
            this.f1899.post(this.f15281);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ۟ */
    public class C0938 implements InterfaceC7788.InterfaceC1354<T> {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f15285 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f15286 = 2;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f15287 = 3;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f15288 = 4;

        /* JADX INFO: renamed from: ۥ */
        public final C6208 f1900 = new C6208();

        /* JADX INFO: renamed from: ۥ۟ */
        public final Executor f1901 = AsyncTask.THREAD_POOL_EXECUTOR;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public AtomicBoolean f15289 = new AtomicBoolean(false);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Runnable f15290 = new RunnableC6207();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7788.InterfaceC1354 f15291;

        /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public class RunnableC6207 implements Runnable {
            public RunnableC6207() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    C6209 c6209M2692 = C0938.this.f1900.m2692();
                    if (c6209M2692 == null) {
                        C0938.this.f15289.set(false);
                        return;
                    }
                    int i = c6209M2692.f1904;
                    if (i == 1) {
                        C0938.this.f1900.m2693(1);
                        C0938.this.f15291.mo9045(c6209M2692.f15296);
                    } else if (i == 2) {
                        C0938.this.f1900.m2693(2);
                        C0938.this.f1900.m2693(3);
                        C0938.this.f15291.mo507(c6209M2692.f15296, c6209M2692.f15297, c6209M2692.f15298, c6209M2692.f15299, c6209M2692.f15300);
                    } else if (i == 3) {
                        C0938.this.f15291.mo508(c6209M2692.f15296, c6209M2692.f15297);
                    } else if (i != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + c6209M2692.f1904);
                    } else {
                        C0938.this.f15291.mo9046((C7797.C1362) c6209M2692.f15301);
                    }
                }
            }
        }

        public C0938(InterfaceC7788.InterfaceC1354 interfaceC1354) {
            this.f15291 = interfaceC1354;
        }

        @Override // Yue.InterfaceC7788.InterfaceC1354
        /* JADX INFO: renamed from: ۥ */
        public void mo507(int i, int i2, int i3, int i4, int i5) {
            m19107(C6209.m2695(2, i, i2, i3, i4, i5, null));
        }

        @Override // Yue.InterfaceC7788.InterfaceC1354
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo508(int i, int i2) {
            m19106(C6209.m2694(3, i, i2));
        }

        @Override // Yue.InterfaceC7788.InterfaceC1354
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo9045(int i) {
            m19107(C6209.m19110(1, i, null));
        }

        @Override // Yue.InterfaceC7788.InterfaceC1354
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo9046(C7797.C1362<T> c1362) {
            m19106(C6209.m19110(4, 0, c1362));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m19105() {
            if (this.f15289.compareAndSet(false, true)) {
                this.f1901.execute(this.f15290);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m19106(C6209 c6209) {
            this.f1900.m19108(c6209);
            m19105();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m19107(C6209 c6209) {
            this.f1900.m19109(c6209);
            m19105();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ۟۟, reason: contains not printable characters */
    public static class C6208 {

        /* JADX INFO: renamed from: ۥ */
        public C6209 f1902;

        /* JADX INFO: renamed from: ۥ */
        public synchronized C6209 m2692() {
            C6209 c6209 = this.f1902;
            if (c6209 == null) {
                return null;
            }
            this.f1902 = c6209.f1903;
            return c6209;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public synchronized void m2693(int i) {
            C6209 c6209;
            while (true) {
                try {
                    c6209 = this.f1902;
                    if (c6209 == null || c6209.f1904 != i) {
                        break;
                    }
                    this.f1902 = c6209.f1903;
                    c6209.m19111();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c6209 != null) {
                C6209 c62092 = c6209.f1903;
                while (c62092 != null) {
                    C6209 c62093 = c62092.f1903;
                    if (c62092.f1904 == i) {
                        c6209.f1903 = c62093;
                        c62092.m19111();
                    } else {
                        c6209 = c62092;
                    }
                    c62092 = c62093;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public synchronized void m19108(C6209 c6209) {
            C6209 c62092 = this.f1902;
            if (c62092 == null) {
                this.f1902 = c6209;
                return;
            }
            while (true) {
                C6209 c62093 = c62092.f1903;
                if (c62093 == null) {
                    c62092.f1903 = c6209;
                    return;
                }
                c62092 = c62093;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public synchronized void m19109(C6209 c6209) {
            c6209.f1903 = this.f1902;
            this.f1902 = c6209;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡ۠ۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C6209 {

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static C6209 f15294;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final Object f15295 = new Object();

        /* JADX INFO: renamed from: ۥ */
        public C6209 f1903;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1904;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f15296;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f15297;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f15298;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f15299;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f15300;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Object f15301;

        /* JADX INFO: renamed from: ۥ */
        public static C6209 m2694(int i, int i2, int i3) {
            return m2695(i, i2, i3, 0, 0, 0, null);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static C6209 m2695(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            C6209 c6209;
            synchronized (f15295) {
                try {
                    c6209 = f15294;
                    if (c6209 == null) {
                        c6209 = new C6209();
                    } else {
                        f15294 = c6209.f1903;
                        c6209.f1903 = null;
                    }
                    c6209.f1904 = i;
                    c6209.f15296 = i2;
                    c6209.f15297 = i3;
                    c6209.f15298 = i4;
                    c6209.f15299 = i5;
                    c6209.f15300 = i6;
                    c6209.f15301 = obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c6209;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static C6209 m19110(int i, int i2, Object obj) {
            return m2695(i, i2, 0, 0, 0, 0, obj);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m19111() {
            this.f1903 = null;
            this.f15300 = 0;
            this.f15299 = 0;
            this.f15298 = 0;
            this.f15297 = 0;
            this.f15296 = 0;
            this.f1904 = 0;
            this.f15301 = null;
            synchronized (f15295) {
                try {
                    C6209 c6209 = f15294;
                    if (c6209 != null) {
                        this.f1903 = c6209;
                    }
                    f15294 = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // Yue.InterfaceC7788
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC7788.InterfaceC1355<T> mo2690(InterfaceC7788.InterfaceC1355<T> interfaceC1355) {
        return new C0937(interfaceC1355);
    }

    @Override // Yue.InterfaceC7788
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC7788.InterfaceC1354<T> mo2691(InterfaceC7788.InterfaceC1354<T> interfaceC1354) {
        return new C0938(interfaceC1354);
    }
}
