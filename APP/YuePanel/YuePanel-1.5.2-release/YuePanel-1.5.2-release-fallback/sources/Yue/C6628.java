package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6628 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ boolean f23131 = false;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.net.URL f23132;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.StringBuilder f23133;

    static {
            return
    }

    public C6628(java.net.URL r2) {
            r1 = this;
            r1.<init>()
            r1.f23132 = r2
            java.lang.String r2 = r2.getQuery()
            if (r2 == 0) goto L1a
            java.lang.StringBuilder r2 = Yue.C5973.m22113()
            java.net.URL r0 = r1.f23132
            java.lang.String r0 = r0.getQuery()
            r2.append(r0)
            r1.f23133 = r2
        L1a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m25470(java.lang.String r4, boolean r5, java.lang.StringBuilder r6) throws java.io.UnsupportedEncodingException {
            r0 = 0
        L1:
            int r1 = r4.length()
            if (r0 >= r1) goto L49
            int r1 = r4.codePointAt(r0)
            r2 = 32
            if (r1 != r2) goto L1e
            if (r5 == 0) goto L18
            r1 = 43
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            goto L1a
        L18:
            java.lang.String r1 = "%20"
        L1a:
            r6.append(r1)
            goto L46
        L1e:
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 <= r2) goto L42
            java.lang.String r2 = new java.lang.String
            char[] r3 = java.lang.Character.toChars(r1)
            r2.<init>(r3)
            java.nio.charset.Charset r3 = Yue.C1726.f5381
            java.lang.String r3 = r3.name()
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)
            r6.append(r2)
            int r1 = java.lang.Character.charCount(r1)
            r2 = 2
            if (r1 != r2) goto L46
            int r0 = r0 + 1
            goto L46
        L42:
            char r1 = (char) r1
            r6.append(r1)
        L46:
            int r0 = r0 + 1
            goto L1
        L49:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m25471(java.lang.String r1) {
            java.nio.charset.Charset r0 = Yue.C1726.f5381     // Catch: java.io.UnsupportedEncodingException -> Lb
            java.lang.String r0 = r0.name()     // Catch: java.io.UnsupportedEncodingException -> Lb
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> Lb
            return r1
        Lb:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m25472(Yue.InterfaceC1478.InterfaceC1480 r5) throws java.io.UnsupportedEncodingException {
            r4 = this;
            java.lang.StringBuilder r0 = r4.f23133
            if (r0 != 0) goto Lb
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            r4.f23133 = r0
            goto L10
        Lb:
            r1 = 38
            r0.append(r1)
        L10:
            java.lang.StringBuilder r0 = r4.f23133
            java.lang.String r1 = r5.key()
            java.nio.charset.Charset r2 = Yue.C1726.f5381
            java.lang.String r3 = r2.name()
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r3)
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r5 = r5.value()
            java.lang.String r1 = r2.name()
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r1)
            r0.append(r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.net.URL m25473() {
            r9 = this;
            java.net.URI r8 = new java.net.URI     // Catch: java.lang.Throwable -> L73
            java.net.URL r0 = r9.f23132     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r0.getProtocol()     // Catch: java.lang.Throwable -> L73
            java.net.URL r0 = r9.f23132     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r0.getUserInfo()     // Catch: java.lang.Throwable -> L73
            java.net.URL r0 = r9.f23132     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r0.getHost()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = m25471(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = java.net.IDN.toASCII(r0)     // Catch: java.lang.Throwable -> L73
            java.net.URL r0 = r9.f23132     // Catch: java.lang.Throwable -> L73
            int r4 = r0.getPort()     // Catch: java.lang.Throwable -> L73
            r6 = 0
            r7 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r0 = Yue.C5973.m22113()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r8.toASCIIString()     // Catch: java.lang.Throwable -> L73
            r0.append(r1)     // Catch: java.lang.Throwable -> L73
            java.net.URL r1 = r9.f23132     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L73
            r2 = 0
            m25470(r1, r2, r0)     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r1 = r9.f23133     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L51
            r1 = 63
            r0.append(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r1 = r9.f23133     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = Yue.C5973.m22128(r1)     // Catch: java.lang.Throwable -> L73
            r3 = 1
            m25470(r1, r3, r0)     // Catch: java.lang.Throwable -> L73
        L51:
            java.net.URL r1 = r9.f23132     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r1.getRef()     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L67
            r1 = 35
            r0.append(r1)     // Catch: java.lang.Throwable -> L73
            java.net.URL r1 = r9.f23132     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = r1.getRef()     // Catch: java.lang.Throwable -> L73
            m25470(r1, r2, r0)     // Catch: java.lang.Throwable -> L73
        L67:
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = Yue.C5973.m22128(r0)     // Catch: java.lang.Throwable -> L73
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L73
            r9.f23132 = r1     // Catch: java.lang.Throwable -> L73
            return r1
        L73:
            java.net.URL r0 = r9.f23132
            return r0
    }
}
