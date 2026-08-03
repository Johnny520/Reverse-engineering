package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.FunctionalInterface
public interface InterfaceC5319 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۤۨ$ۥ, reason: contains not printable characters */
    public static class C5320 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.net.URL f19897;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.net.Authenticator.RequestorType f19898;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.String f19899;

        public C5320(java.net.URL r1, java.net.Authenticator.RequestorType r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.f19897 = r1
                r0.f19898 = r2
                r0.f19899 = r3
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.net.PasswordAuthentication m20122(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                java.net.PasswordAuthentication r0 = new java.net.PasswordAuthentication
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m20123() {
                r2 = this;
                java.net.Authenticator$RequestorType r0 = r2.f19898
                java.net.Authenticator$RequestorType r1 = java.net.Authenticator.RequestorType.PROXY
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m20124() {
                r2 = this;
                java.net.Authenticator$RequestorType r0 = r2.f19898
                java.net.Authenticator$RequestorType r1 = java.net.Authenticator.RequestorType.SERVER
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public java.lang.String m20125() {
                r1 = this;
                java.lang.String r0 = r1.f19899
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public java.net.Authenticator.RequestorType m20126() {
                r1 = this;
                java.net.Authenticator$RequestorType r0 = r1.f19898
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public java.net.URL m20127() {
                r1 = this;
                java.net.URL r0 = r1.f19897
                return r0
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    java.net.PasswordAuthentication m20121(Yue.InterfaceC5319.C5320 r1);
}
