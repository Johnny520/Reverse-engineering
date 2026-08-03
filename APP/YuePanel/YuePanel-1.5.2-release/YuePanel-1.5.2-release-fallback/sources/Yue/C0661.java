package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0661 extends java.net.Authenticator {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f1715 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C0661.InterfaceC0662 f1716;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.InterfaceC5319 f1717;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f1718;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۡ۠$ۥ, reason: contains not printable characters */
    public interface InterfaceC0662 {
        void remove();

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        Yue.C0661 mo4334(Yue.C0661 r1);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        void mo4335(Yue.InterfaceC5319 r1, java.net.HttpURLConnection r2);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۡ۠$ۥ۟, reason: contains not printable characters */
    public static class C0663 implements Yue.C0661.InterfaceC0662 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.ThreadLocal<Yue.C0661> f1719;

        static {
                java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
                r0.<init>()
                Yue.C0661.C0663.f1719 = r0
                Yue.ۥ۟ۢۡ۠ r0 = new Yue.ۥ۟ۢۡ۠
                r0.<init>()
                java.net.Authenticator.setDefault(r0)
                return
        }

        public C0663() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.C0661.InterfaceC0662
        public void remove() {
                r1 = this;
                java.lang.ThreadLocal<Yue.ۥ۟ۢۡ۠> r0 = Yue.C0661.C0663.f1719
                r0.remove()
                return
        }

        @Override // Yue.C0661.InterfaceC0662
        /* JADX INFO: renamed from: ۥ */
        public Yue.C0661 mo4334(Yue.C0661 r1) {
                r0 = this;
                java.lang.ThreadLocal<Yue.ۥ۟ۢۡ۠> r1 = Yue.C0661.C0663.f1719
                java.lang.Object r1 = r1.get()
                Yue.ۥ۟ۢۡ۠ r1 = (Yue.C0661) r1
                return r1
        }

        @Override // Yue.C0661.InterfaceC0662
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4335(Yue.InterfaceC5319 r2, java.net.HttpURLConnection r3) {
                r1 = this;
                java.lang.ThreadLocal<Yue.ۥ۟ۢۡ۠> r3 = Yue.C0661.C0663.f1719
                Yue.ۥ۟ۢۡ۠ r0 = new Yue.ۥ۟ۢۡ۠
                r0.<init>(r2)
                r3.set(r0)
                return
        }
    }

    static {
            java.lang.String r0 = "org.jsoup.helper.RequestAuthHandler"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L14 java.lang.ClassNotFoundException -> L1b
            r1 = 0
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Exception -> L14 java.lang.ClassNotFoundException -> L1b
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L14 java.lang.ClassNotFoundException -> L1b
            Yue.ۥ۟ۢۡ۠$ۥ r0 = (Yue.C0661.InterfaceC0662) r0     // Catch: java.lang.Exception -> L14 java.lang.ClassNotFoundException -> L1b
            Yue.C0661.f1716 = r0     // Catch: java.lang.Exception -> L14 java.lang.ClassNotFoundException -> L1b
            goto L22
        L14:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L1b:
            Yue.ۥ۟ۢۡ۠$ۥ۟ r0 = new Yue.ۥ۟ۢۡ۠$ۥ۟
            r0.<init>()
            Yue.C0661.f1716 = r0
        L22:
            return
    }

    public C0661() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1718 = r0
            return
    }

    public C0661(Yue.InterfaceC5319 r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1718 = r0
            r1.f1717 = r2
            return
    }

    @Override // java.net.Authenticator
    public final java.net.PasswordAuthentication getPasswordAuthentication() {
            r5 = this;
            Yue.ۥ۟ۢۡ۠$ۥ r0 = Yue.C0661.f1716
            Yue.ۥ۟ۢۡ۠ r0 = r0.mo4334(r5)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r2 = r0.f1718
            int r2 = r2 + 1
            r0.f1718 = r2
            r3 = 5
            if (r2 <= r3) goto L14
            return r1
        L14:
            Yue.ۥۡۦۤۨ r2 = r0.f1717
            if (r2 != 0) goto L19
            return r1
        L19:
            Yue.ۥۡۦۤۨ$ۥ r1 = new Yue.ۥۡۦۤۨ$ۥ
            java.net.URL r2 = r5.getRequestingURL()
            java.net.Authenticator$RequestorType r3 = r5.getRequestorType()
            java.lang.String r4 = r5.getRequestingPrompt()
            r1.<init>(r2, r3, r4)
            Yue.ۥۡۦۤۨ r0 = r0.f1717
            java.net.PasswordAuthentication r0 = r0.m20121(r1)
            return r0
    }
}
