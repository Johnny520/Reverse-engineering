package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0379 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final long f898 = 10;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<Yue.C0379> f899 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C5787<Yue.C0379.InterfaceC0381, java.lang.Long> f900;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.ArrayList<Yue.C0379.InterfaceC0381> f901;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C0379.C0380 f902;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C0379.AbstractC0382 f903;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public long f904;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f905;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ, reason: contains not printable characters */
    public class C0380 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0379 f906;

        public C0380(Yue.C0379 r1) {
                r0 = this;
                r0.f906 = r1
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m1502() {
                r3 = this;
                Yue.ۥ۟۠ۦۧ r0 = r3.f906
                long r1 = android.os.SystemClock.uptimeMillis()
                r0.f904 = r1
                Yue.ۥ۟۠ۦۧ r0 = r3.f906
                long r1 = r0.f904
                r0.m1497(r1)
                Yue.ۥ۟۠ۦۧ r0 = r3.f906
                java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r0 = r0.f901
                int r0 = r0.size()
                if (r0 <= 0) goto L22
                Yue.ۥ۟۠ۦۧ r0 = r3.f906
                Yue.ۥ۟۠ۦۧ$ۥ۟۟ r0 = r0.m1498()
                r0.mo1504()
            L22:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC0381 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        boolean mo1503(long r1);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC0382 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C0379.C0380 f907;

        public AbstractC0382(Yue.C0379.C0380 r1) {
                r0 = this;
                r0.<init>()
                r0.f907 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public abstract void mo1504();
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C0383 extends Yue.C0379.AbstractC0382 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.Runnable f908;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.os.Handler f909;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public long f910;

        /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        public class RunnableC0384 implements java.lang.Runnable {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0379.C0383 f911;

            public RunnableC0384(Yue.C0379.C0383 r1) {
                    r0 = this;
                    r0.f911 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    Yue.ۥ۟۠ۦۧ$ۥ۟۟۟ r0 = r3.f911
                    long r1 = android.os.SystemClock.uptimeMillis()
                    r0.f910 = r1
                    Yue.ۥ۟۠ۦۧ$ۥ۟۟۟ r0 = r3.f911
                    Yue.ۥ۟۠ۦۧ$ۥ r0 = r0.f907
                    r0.m1502()
                    return
            }
        }

        public C0383(Yue.C0379.C0380 r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = -1
                r2.f910 = r0
                Yue.ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ r3 = new Yue.ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ
                r3.<init>(r2)
                r2.f908 = r3
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.myLooper()
                r3.<init>(r0)
                r2.f909 = r3
                return
        }

        @Override // Yue.C0379.AbstractC0382
        /* JADX INFO: renamed from: ۥ */
        public void mo1504() {
                r4 = this;
                long r0 = android.os.SystemClock.uptimeMillis()
                long r2 = r4.f910
                long r0 = r0 - r2
                r2 = 10
                long r2 = r2 - r0
                r0 = 0
                long r0 = java.lang.Math.max(r2, r0)
                android.os.Handler r2 = r4.f909
                java.lang.Runnable r3 = r4.f908
                r2.postDelayed(r3, r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(16)
    public static class C0385 extends Yue.C0379.AbstractC0382 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.view.Choreographer f912;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.view.Choreographer.FrameCallback f913;

        /* JADX INFO: renamed from: Yue.ۥ۟۠ۦۧ$ۥ۟۟۟۟$ۥ, reason: contains not printable characters */
        public class ChoreographerFrameCallbackC0386 implements android.view.Choreographer.FrameCallback {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0379.C0385 f914;

            public ChoreographerFrameCallbackC0386(Yue.C0379.C0385 r1) {
                    r0 = this;
                    r0.f914 = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long r1) {
                    r0 = this;
                    Yue.ۥ۟۠ۦۧ$ۥ۟۟۟۟ r1 = r0.f914
                    Yue.ۥ۟۠ۦۧ$ۥ r1 = r1.f907
                    r1.m1502()
                    return
            }
        }

        public C0385(Yue.C0379.C0380 r1) {
                r0 = this;
                r0.<init>(r1)
                android.view.Choreographer r1 = android.view.Choreographer.getInstance()
                r0.f912 = r1
                Yue.ۥ۟۠ۦۧ$ۥ۟۟۟۟$ۥ r1 = new Yue.ۥ۟۠ۦۧ$ۥ۟۟۟۟$ۥ
                r1.<init>(r0)
                r0.f913 = r1
                return
        }

        @Override // Yue.C0379.AbstractC0382
        /* JADX INFO: renamed from: ۥ */
        public void mo1504() {
                r2 = this;
                android.view.Choreographer r0 = r2.f912
                android.view.Choreographer$FrameCallback r1 = r2.f913
                r0.postFrameCallback(r1)
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            Yue.C0379.f899 = r0
            return
    }

    public C0379() {
            r2 = this;
            r2.<init>()
            Yue.ۥۢ۟ۡ r0 = new Yue.ۥۢ۟ۡ
            r0.<init>()
            r2.f900 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f901 = r0
            Yue.ۥ۟۠ۦۧ$ۥ r0 = new Yue.ۥ۟۠ۦۧ$ۥ
            r0.<init>(r2)
            r2.f902 = r0
            r0 = 0
            r2.f904 = r0
            r0 = 0
            r2.f905 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static long m1493() {
            java.lang.ThreadLocal<Yue.ۥ۟۠ۦۧ> r0 = Yue.C0379.f899
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            java.lang.Object r0 = r0.get()
            Yue.ۥ۟۠ۦۧ r0 = (Yue.C0379) r0
            long r0 = r0.f904
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C0379 m1494() {
            java.lang.ThreadLocal<Yue.ۥ۟۠ۦۧ> r0 = Yue.C0379.f899
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L10
            Yue.ۥ۟۠ۦۧ r1 = new Yue.ۥ۟۠ۦۧ
            r1.<init>()
            r0.set(r1)
        L10:
            java.lang.Object r0 = r0.get()
            Yue.ۥ۟۠ۦۧ r0 = (Yue.C0379) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m1495(Yue.C0379.InterfaceC0381 r4, long r5) {
            r3 = this;
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r0 = r3.f901
            int r0 = r0.size()
            if (r0 != 0) goto Lf
            Yue.ۥ۟۠ۦۧ$ۥ۟۟ r0 = r3.m1498()
            r0.mo1504()
        Lf:
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r0 = r3.f901
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L1c
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r0 = r3.f901
            r0.add(r4)
        L1c:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L30
            Yue.ۥۢ۟ۡ<Yue.ۥ۟۠ۦۧ$ۥ۟, java.lang.Long> r0 = r3.f900
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 + r5
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r0.put(r4, r5)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m1496() {
            r2 = this;
            boolean r0 = r2.f905
            if (r0 == 0) goto L21
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r0 = r2.f901
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L1e
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r1 = r2.f901
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L1b
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r1 = r2.f901
            r1.remove(r0)
        L1b:
            int r0 = r0 + (-1)
            goto Lc
        L1e:
            r0 = 0
            r2.f905 = r0
        L21:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m1497(long r6) {
            r5 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 0
        L5:
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r3 = r5.f901
            int r3 = r3.size()
            if (r2 >= r3) goto L24
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r3 = r5.f901
            java.lang.Object r3 = r3.get(r2)
            Yue.ۥ۟۠ۦۧ$ۥ۟ r3 = (Yue.C0379.InterfaceC0381) r3
            if (r3 != 0) goto L18
            goto L21
        L18:
            boolean r4 = r5.m1499(r3, r0)
            if (r4 == 0) goto L21
            r3.mo1503(r6)
        L21:
            int r2 = r2 + 1
            goto L5
        L24:
            r5.m1496()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.C0379.AbstractC0382 m1498() {
            r2 = this;
            Yue.ۥ۟۠ۦۧ$ۥ۟۟ r0 = r2.f903
            if (r0 != 0) goto Ld
            Yue.ۥ۟۠ۦۧ$ۥ۟۟۟۟ r0 = new Yue.ۥ۟۠ۦۧ$ۥ۟۟۟۟
            Yue.ۥ۟۠ۦۧ$ۥ r1 = r2.f902
            r0.<init>(r1)
            r2.f903 = r0
        Ld:
            Yue.ۥ۟۠ۦۧ$ۥ۟۟ r0 = r2.f903
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m1499(Yue.C0379.InterfaceC0381 r5, long r6) {
            r4 = this;
            Yue.ۥۢ۟ۡ<Yue.ۥ۟۠ۦۧ$ۥ۟, java.lang.Long> r0 = r4.f900
            java.lang.Object r0 = r0.get(r5)
            java.lang.Long r0 = (java.lang.Long) r0
            r1 = 1
            if (r0 != 0) goto Lc
            return r1
        Lc:
            long r2 = r0.longValue()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L1a
            Yue.ۥۢ۟ۡ<Yue.ۥ۟۠ۦۧ$ۥ۟, java.lang.Long> r6 = r4.f900
            r6.remove(r5)
            return r1
        L1a:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m1500(Yue.C0379.InterfaceC0381 r3) {
            r2 = this;
            Yue.ۥۢ۟ۡ<Yue.ۥ۟۠ۦۧ$ۥ۟, java.lang.Long> r0 = r2.f900
            r0.remove(r3)
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r0 = r2.f901
            int r3 = r0.indexOf(r3)
            if (r3 < 0) goto L16
            java.util.ArrayList<Yue.ۥ۟۠ۦۧ$ۥ۟> r0 = r2.f901
            r1 = 0
            r0.set(r3, r1)
            r3 = 1
            r2.f905 = r3
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m1501(Yue.C0379.AbstractC0382 r1) {
            r0 = this;
            r0.f903 = r1
            return
    }
}
