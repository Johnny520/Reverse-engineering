package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class an {
    private final com.tendcloud.tenddata.an.a a;
    private final byte[] b;

    public enum a extends java.lang.Enum<com.tendcloud.tenddata.an.a> {
        private static final /* synthetic */ com.tendcloud.tenddata.an.a[] $VALUES = null;
        public static final com.tendcloud.tenddata.an.a EMPTY = null;
        public static final com.tendcloud.tenddata.an.a FORM = null;
        public static final com.tendcloud.tenddata.an.a JSON = null;
        public static final com.tendcloud.tenddata.an.a UNIVERSAL_STREAM = null;
        private java.lang.String name;

        static {
                com.tendcloud.tenddata.an$a r0 = new com.tendcloud.tenddata.an$a
                java.lang.String r1 = "UNIVERSAL_STREAM"
                r2 = 0
                java.lang.String r3 = "application/octet-stream"
                r0.<init>(r1, r2, r3)
                com.tendcloud.tenddata.an.a.UNIVERSAL_STREAM = r0
                com.tendcloud.tenddata.an$a r1 = new com.tendcloud.tenddata.an$a
                java.lang.String r3 = "JSON"
                r4 = 1
                java.lang.String r5 = "application/json"
                r1.<init>(r3, r4, r5)
                com.tendcloud.tenddata.an.a.JSON = r1
                com.tendcloud.tenddata.an$a r3 = new com.tendcloud.tenddata.an$a
                java.lang.String r5 = "FORM"
                r6 = 2
                java.lang.String r7 = "application/x-www-form-urlencoded"
                r3.<init>(r5, r6, r7)
                com.tendcloud.tenddata.an.a.FORM = r3
                com.tendcloud.tenddata.an$a r5 = new com.tendcloud.tenddata.an$a
                java.lang.String r7 = "EMPTY"
                r8 = 3
                java.lang.String r9 = ""
                r5.<init>(r7, r8, r9)
                com.tendcloud.tenddata.an.a.EMPTY = r5
                r7 = 4
                com.tendcloud.tenddata.an$a[] r7 = new com.tendcloud.tenddata.an.a[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.tendcloud.tenddata.an.a.$VALUES = r7
                return
        }

        a(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.name = r3
                return
        }

        public static com.tendcloud.tenddata.an.a valueOf(java.lang.String r1) {
                java.lang.Class<com.tendcloud.tenddata.an$a> r0 = com.tendcloud.tenddata.an.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.tendcloud.tenddata.an$a r1 = (com.tendcloud.tenddata.an.a) r1
                return r1
        }

        public static com.tendcloud.tenddata.an.a[] values() {
                com.tendcloud.tenddata.an$a[] r0 = com.tendcloud.tenddata.an.a.$VALUES
                java.lang.Object r0 = r0.clone()
                com.tendcloud.tenddata.an$a[] r0 = (com.tendcloud.tenddata.an.a[]) r0
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }
    }

    public an(com.tendcloud.tenddata.an.a r1, byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public void a(java.net.HttpURLConnection r3) {
            r2 = this;
            byte[] r0 = r2.b
            int r0 = r0.length
            r3.setFixedLengthStreamingMode(r0)
            com.tendcloud.tenddata.an$a r0 = r2.a
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Content-Type"
            r3.setRequestProperty(r1, r0)
            java.io.OutputStream r3 = r3.getOutputStream()     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r2.b     // Catch: java.lang.Throwable -> L1f
            r3.write(r0)     // Catch: java.lang.Throwable -> L1f
        L1a:
            r3.close()     // Catch: java.lang.Throwable -> L22
            goto L22
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L22
            goto L1a
        L22:
            return
    }

    public byte[] a() {
            r1 = this;
            byte[] r0 = r1.b
            return r0
    }

    public com.tendcloud.tenddata.an.a b() {
            r1 = this;
            com.tendcloud.tenddata.an$a r0 = r1.a
            return r0
    }
}
