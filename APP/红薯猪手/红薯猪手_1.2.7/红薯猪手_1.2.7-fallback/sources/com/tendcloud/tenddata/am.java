package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class am {
    private static final int a = 15000;
    private static final int b = 15000;
    private java.net.URL c;
    private com.tendcloud.tenddata.aq d;
    private com.tendcloud.tenddata.ap e;
    private com.tendcloud.tenddata.an f;
    private java.lang.String g;
    private java.lang.String h;
    private java.lang.String i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.am$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class a {
        private com.tendcloud.tenddata.an body;
        private java.lang.String cert;
        private int connectionTimeout;
        private com.tendcloud.tenddata.ap headers;
        private java.lang.String host;
        private java.lang.String ip;
        private com.tendcloud.tenddata.aq method;
        private int readTimeout;
        private java.net.URL url;

        public a() {
                r1 = this;
                r1.<init>()
                r0 = 15000(0x3a98, float:2.102E-41)
                r1.connectionTimeout = r0
                r1.readTimeout = r0
                return
        }

        public com.tendcloud.tenddata.am.a body(com.tendcloud.tenddata.an r1) {
                r0 = this;
                r0.body = r1
                return r0
        }

        public com.tendcloud.tenddata.am build() {
                r12 = this;
                com.tendcloud.tenddata.am r11 = new com.tendcloud.tenddata.am
                java.net.URL r1 = r12.url
                com.tendcloud.tenddata.aq r2 = r12.method
                com.tendcloud.tenddata.ap r3 = r12.headers
                com.tendcloud.tenddata.an r4 = r12.body
                int r5 = r12.connectionTimeout
                int r6 = r12.readTimeout
                java.lang.String r7 = r12.cert
                java.lang.String r8 = r12.host
                java.lang.String r9 = r12.ip
                r10 = 0
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }

        public com.tendcloud.tenddata.am.a cert(java.lang.String r1) {
                r0 = this;
                r0.cert = r1
                return r0
        }

        public com.tendcloud.tenddata.am.a connectionTimeout(int r1) {
                r0 = this;
                r0.connectionTimeout = r1
                return r0
        }

        public com.tendcloud.tenddata.am.a header(com.tendcloud.tenddata.ap r1) {
                r0 = this;
                r0.headers = r1
                return r0
        }

        public com.tendcloud.tenddata.am.a host(java.lang.String r1) {
                r0 = this;
                r0.host = r1
                return r0
        }

        public com.tendcloud.tenddata.am.a ip(java.lang.String r1) {
                r0 = this;
                r0.ip = r1
                return r0
        }

        public com.tendcloud.tenddata.am.a method(com.tendcloud.tenddata.aq r1) {
                r0 = this;
                r0.method = r1
                return r0
        }

        public com.tendcloud.tenddata.am.a readTimeout(int r1) {
                r0 = this;
                r0.readTimeout = r1
                return r0
        }

        public com.tendcloud.tenddata.am.a url(java.lang.String r2) {
                r1 = this;
                java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L8
                r0.<init>(r2)     // Catch: java.net.MalformedURLException -> L8
                r1.url = r0     // Catch: java.net.MalformedURLException -> L8
                return r1
            L8:
                r2 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r2)
                throw r0
        }
    }

    private am(java.net.URL r1, com.tendcloud.tenddata.aq r2, com.tendcloud.tenddata.ap r3, com.tendcloud.tenddata.an r4, int r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r0.f = r4
            r0.j = r5
            r0.k = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
    }

    public /* synthetic */ am(java.net.URL r1, com.tendcloud.tenddata.aq r2, com.tendcloud.tenddata.ap r3, com.tendcloud.tenddata.an r4, int r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.tendcloud.tenddata.am.AnonymousClass1 r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public com.tendcloud.tenddata.aq a() {
            r1 = this;
            com.tendcloud.tenddata.aq r0 = r1.d
            return r0
    }

    public com.tendcloud.tenddata.ar a(com.tendcloud.tenddata.a r8) {
            r7 = this;
            java.lang.String r0 = "TD_app_pefercen_profile"
            java.lang.String r1 = ""
            com.tendcloud.tenddata.ar r1 = com.tendcloud.tenddata.ar.a(r1)
            r2 = 0
            com.tendcloud.tenddata.ar r1 = r7.a(r2)     // Catch: java.lang.Throwable -> L1c8
            java.net.URL r3 = r7.c     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r8 = r8.name()     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r5 = "SDK"
            boolean r8 = r8.equals(r5)     // Catch: java.lang.Throwable -> L1c8
            if (r8 == 0) goto L7b
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r5 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r8 != r5) goto L7b
            com.tendcloud.tenddata.ai.a(r4)     // Catch: java.lang.Throwable -> L1c8
            r8 = r2
        L2b:
            java.util.Queue<java.lang.String> r5 = com.tendcloud.tenddata.ai.a     // Catch: java.lang.Throwable -> L1c8
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L1c8
            if (r8 > r5) goto L7b
            java.lang.String r5 = com.tendcloud.tenddata.ai.a()     // Catch: java.lang.Throwable -> L1c8
            r7.h = r5     // Catch: java.lang.Throwable -> L1c8
            java.net.URL r5 = com.tendcloud.tenddata.ai.a(r3, r5)     // Catch: java.lang.Throwable -> L1c8
            r7.c = r5     // Catch: java.lang.Throwable -> L1c8
            boolean r5 = r3.equals(r5)     // Catch: java.lang.Throwable -> L1c8
            if (r5 == 0) goto L4e
            java.lang.String r5 = r7.h     // Catch: java.lang.Throwable -> L1c8
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L1c8
            if (r5 == 0) goto L4e
            goto L7b
        L4e:
            com.tendcloud.tenddata.ar r1 = r7.a(r2)     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r5 = r7.h     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ai.a(r5)     // Catch: java.lang.Throwable -> L1c8
            int r5 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r6 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r5 == r6) goto L78
            android.content.Context r8 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r2 = "TD_sdk_last_send_url"
            java.net.URL r3 = r7.c     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.s.a(r8, r0, r2, r3)     // Catch: java.lang.Throwable -> L1c8
            android.content.Context r8 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r2 = "TD_sdk_last_send_host"
            java.lang.String r3 = r7.h     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.s.a(r8, r0, r2, r3)     // Catch: java.lang.Throwable -> L1c8
            goto L7b
        L78:
            int r8 = r8 + 1
            goto L2b
        L7b:
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r0 = r7.i     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ak.b(r8, r0)     // Catch: java.lang.Throwable -> L1c8
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r0 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            r2 = 2
            if (r8 == r0) goto L9c
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r0 = com.tendcloud.tenddata.ak.b(r8)     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ak.a(r8, r0, r2)     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ak.a(r8)     // Catch: java.lang.Throwable -> L1c8
            return r1
        L9c:
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r8 = com.tendcloud.tenddata.ak.a(r8, r2)     // Catch: java.lang.Throwable -> L1c8
            r0 = 3
            r3 = 1
            if (r8 == 0) goto Lca
            java.net.URL r8 = r7.c     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = com.tendcloud.tenddata.ak.a(r4, r2)     // Catch: java.lang.Throwable -> L1c8
            java.net.URL r8 = com.tendcloud.tenddata.ak.a(r8, r4)     // Catch: java.lang.Throwable -> L1c8
            r7.c = r8     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ar r1 = r7.a(r3)     // Catch: java.lang.Throwable -> L1c8
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r3 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r8 != r3) goto L1b1
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            r3 = 0
            com.tendcloud.tenddata.ak.a(r8, r3, r2)     // Catch: java.lang.Throwable -> L1c8
            goto L1b1
        Lca:
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r8 = com.tendcloud.tenddata.ak.a(r8, r3)     // Catch: java.lang.Throwable -> L1c8
            if (r8 == 0) goto Lfc
            java.net.URL r8 = r7.c     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = com.tendcloud.tenddata.ak.a(r4, r3)     // Catch: java.lang.Throwable -> L1c8
            java.net.URL r8 = com.tendcloud.tenddata.ak.a(r8, r4)     // Catch: java.lang.Throwable -> L1c8
            r7.c = r8     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ar r1 = r7.a(r3)     // Catch: java.lang.Throwable -> L1c8
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r4 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r8 == r4) goto Lfc
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = com.tendcloud.tenddata.ak.a(r8, r3)     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ak.a(r8, r4, r2)     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ak.a(r8)     // Catch: java.lang.Throwable -> L1c8
        Lfc:
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r4 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r8 != r4) goto L133
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r8 = com.tendcloud.tenddata.ak.a(r8, r0)     // Catch: java.lang.Throwable -> L1c8
            if (r8 == 0) goto L133
            java.net.URL r8 = r7.c     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = com.tendcloud.tenddata.ak.a(r4, r0)     // Catch: java.lang.Throwable -> L1c8
            java.net.URL r8 = com.tendcloud.tenddata.ak.a(r8, r4)     // Catch: java.lang.Throwable -> L1c8
            r7.c = r8     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ar r1 = r7.a(r3)     // Catch: java.lang.Throwable -> L1c8
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r4 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r8 == r4) goto L133
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = com.tendcloud.tenddata.ak.a(r8, r0)     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ak.a(r8, r4, r2)     // Catch: java.lang.Throwable -> L1c8
        L133:
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r4 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r8 != r4) goto L16b
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            r4 = 4
            java.lang.String r8 = com.tendcloud.tenddata.ak.a(r8, r4)     // Catch: java.lang.Throwable -> L1c8
            if (r8 == 0) goto L16b
            java.net.URL r8 = r7.c     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r5 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r5 = com.tendcloud.tenddata.ak.a(r5, r4)     // Catch: java.lang.Throwable -> L1c8
            java.net.URL r8 = com.tendcloud.tenddata.ak.a(r8, r5)     // Catch: java.lang.Throwable -> L1c8
            r7.c = r8     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ar r1 = r7.a(r3)     // Catch: java.lang.Throwable -> L1c8
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r5 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r8 == r5) goto L16b
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r4 = com.tendcloud.tenddata.ak.a(r8, r4)     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ak.a(r8, r4, r2)     // Catch: java.lang.Throwable -> L1c8
        L16b:
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r2 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r8 != r2) goto L1b1
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            int r8 = com.tendcloud.tenddata.aj.b(r8)     // Catch: java.lang.Throwable -> L1c8
            if (r8 != r0) goto L1b1
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            boolean r8 = com.tendcloud.tenddata.aj.c(r8)     // Catch: java.lang.Throwable -> L1c8
            if (r8 != 0) goto L1b1
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r8 = com.tendcloud.tenddata.aj.a(r8)     // Catch: java.lang.Throwable -> L1c8
            boolean r2 = com.tendcloud.tenddata.y.b(r8)     // Catch: java.lang.Throwable -> L1c8
            if (r2 != 0) goto L1b1
            java.net.URL r2 = r7.c     // Catch: java.lang.Throwable -> L1c8
            java.net.URL r2 = com.tendcloud.tenddata.ak.a(r2, r8)     // Catch: java.lang.Throwable -> L1c8
            r7.c = r2     // Catch: java.lang.Throwable -> L1c8
            java.lang.String r2 = r7.h     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.aj.updateTimeStamp(r2)     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ar r1 = r7.a(r3)     // Catch: java.lang.Throwable -> L1c8
            int r2 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r3 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r2 == r3) goto L1b1
            java.lang.String r2 = r7.h     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.ak.a(r2, r8)     // Catch: java.lang.Throwable -> L1c8
        L1b1:
            int r8 = r1.b()     // Catch: java.lang.Throwable -> L1c8
            int r2 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L1c8
            if (r8 != r2) goto L1c8
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            int r8 = com.tendcloud.tenddata.aj.b(r8)     // Catch: java.lang.Throwable -> L1c8
            if (r8 >= r0) goto L1c8
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L1c8
            com.tendcloud.tenddata.aj.updateFailureCountWithHost(r8)     // Catch: java.lang.Throwable -> L1c8
        L1c8:
            return r1
    }

    public com.tendcloud.tenddata.ar a(boolean r8) {
            r7 = this;
            java.lang.String r0 = "Host"
            r1 = 0
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L98
            java.net.URL r4 = r7.c     // Catch: java.lang.Throwable -> L98
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Throwable -> L98
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L98
            r1 = 15000(0x3a98, float:2.102E-41)
            r4.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L95
            r4.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L95
            java.net.URL r1 = r7.c     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L3f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = "https://"
            boolean r1 = r1.startsWith(r5)     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto L3f
            java.util.HashMap<java.lang.Long, java.lang.String> r1 = com.tendcloud.tenddata.ah.a     // Catch: java.lang.Throwable -> L95
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L95
            long r5 = r5.getId()     // Catch: java.lang.Throwable -> L95
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L95
            java.lang.String r6 = r7.h     // Catch: java.lang.Throwable -> L95
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L3f
            com.tendcloud.tenddata.ah.setHostNameVerifyAllowAll(r4)     // Catch: java.lang.Throwable -> L95
        L3f:
            java.lang.String r8 = r7.g     // Catch: java.lang.Throwable -> L95
            boolean r8 = com.tendcloud.tenddata.y.b(r8)     // Catch: java.lang.Throwable -> L95
            if (r8 != 0) goto L4c
            java.lang.String r8 = r7.g     // Catch: java.lang.Throwable -> L95
            com.tendcloud.tenddata.ah.a(r4, r8)     // Catch: java.lang.Throwable -> L95
        L4c:
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L95
            boolean r8 = com.tendcloud.tenddata.y.b(r8)     // Catch: java.lang.Throwable -> L95
            if (r8 != 0) goto L71
            java.net.URL r8 = r7.c     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = r8.getHost()     // Catch: java.lang.Throwable -> L95
            boolean r8 = com.tendcloud.tenddata.y.b(r8)     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L63
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L95
            goto L69
        L63:
            java.net.URL r8 = r7.c     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = r8.getHost()     // Catch: java.lang.Throwable -> L95
        L69:
            r4.setRequestProperty(r0, r8)     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L95
            r4.setRequestProperty(r0, r8)     // Catch: java.lang.Throwable -> L95
        L71:
            com.tendcloud.tenddata.aq r8 = r7.d     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L78
            r8.a(r4)     // Catch: java.lang.Throwable -> L95
        L78:
            com.tendcloud.tenddata.ap r8 = r7.e     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L7f
            r8.a(r4)     // Catch: java.lang.Throwable -> L95
        L7f:
            com.tendcloud.tenddata.an r8 = r7.f     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L86
            r8.a(r4)     // Catch: java.lang.Throwable -> L95
        L86:
            r4.connect()     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = r7.h     // Catch: java.lang.Throwable -> L95
            com.tendcloud.tenddata.an r0 = r7.f     // Catch: java.lang.Throwable -> L95
            com.tendcloud.tenddata.ar r8 = com.tendcloud.tenddata.ar.a(r8, r4, r2, r0)     // Catch: java.lang.Throwable -> L95
            r4.disconnect()
            goto La6
        L95:
            r8 = move-exception
            r1 = r4
            goto L99
        L98:
            r8 = move-exception
        L99:
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> La7
            com.tendcloud.tenddata.ar r8 = com.tendcloud.tenddata.ar.a(r8)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto La6
            r1.disconnect()
        La6:
            return r8
        La7:
            r8 = move-exception
            if (r1 == 0) goto Lad
            r1.disconnect()
        Lad:
            throw r8
    }

    public com.tendcloud.tenddata.ar b() {
            r3 = this;
            java.lang.String r0 = ""
            com.tendcloud.tenddata.ar r0 = com.tendcloud.tenddata.ar.a(r0)
            r1 = 0
            com.tendcloud.tenddata.ar r0 = r3.a(r1)     // Catch: java.lang.Throwable -> L2e
            int r1 = r0.b()     // Catch: java.lang.Throwable -> L2e
            int r2 = com.tendcloud.tenddata.ar.a()     // Catch: java.lang.Throwable -> L2e
            if (r1 != r2) goto L2e
            java.lang.String r1 = r3.h     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = com.tendcloud.tenddata.aj.a(r1)     // Catch: java.lang.Throwable -> L2e
            boolean r2 = com.tendcloud.tenddata.y.b(r1)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L2e
            java.net.URL r2 = r3.c     // Catch: java.lang.Throwable -> L2e
            java.net.URL r1 = com.tendcloud.tenddata.ak.a(r2, r1)     // Catch: java.lang.Throwable -> L2e
            r3.c = r1     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            com.tendcloud.tenddata.ar r0 = r3.a(r1)     // Catch: java.lang.Throwable -> L2e
        L2e:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "\n url: "
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            java.net.URL r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = "\n method: "
            r0.append(r1)
            com.tendcloud.tenddata.aq r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = "\n headers: "
            r0.append(r1)
            com.tendcloud.tenddata.ap r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = "\n content length: "
            r0.append(r1)
            com.tendcloud.tenddata.an r1 = r3.f
            java.lang.String r2 = ""
            if (r1 == 0) goto L34
            byte[] r1 = r1.a()
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L35
        L34:
            r1 = r2
        L35:
            r0.append(r1)
            java.lang.String r1 = "\n content Type: "
            r0.append(r1)
            com.tendcloud.tenddata.an r1 = r3.f
            if (r1 == 0) goto L45
            com.tendcloud.tenddata.an$a r2 = r1.b()
        L45:
            r0.append(r2)
            java.lang.String r1 = "\n host: "
            r0.append(r1)
            java.lang.String r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = "\n ip: "
            r0.append(r1)
            java.lang.String r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = "\n connectionTimeout: "
            r0.append(r1)
            int r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = "\n readTimeout: "
            r0.append(r1)
            int r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = "\n cert:  "
            r0.append(r1)
            java.lang.String r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
