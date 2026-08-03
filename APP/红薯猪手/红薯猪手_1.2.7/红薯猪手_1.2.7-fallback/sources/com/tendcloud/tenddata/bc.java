package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bc {
    private static final java.lang.String a = "https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl/v2";
    private static final java.lang.String b = "hAF3uVnSYyk2qN3trMjXFVsijBTGcR";
    private static com.tendcloud.tenddata.bc c;
    private java.util.Map<java.lang.String, java.lang.Object> d;


    public enum a extends java.lang.Enum<com.tendcloud.tenddata.bc.a> {
        private static final /* synthetic */ com.tendcloud.tenddata.bc.a[] $VALUES = null;
        public static final com.tendcloud.tenddata.bc.a STOP = null;
        public static final com.tendcloud.tenddata.bc.a UNSTOP = null;
        private final int index;

        static {
                com.tendcloud.tenddata.bc$a r0 = new com.tendcloud.tenddata.bc$a
                java.lang.String r1 = "UNSTOP"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.tendcloud.tenddata.bc.a.UNSTOP = r0
                com.tendcloud.tenddata.bc$a r1 = new com.tendcloud.tenddata.bc$a
                java.lang.String r3 = "STOP"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.tendcloud.tenddata.bc.a.STOP = r1
                r3 = 2
                com.tendcloud.tenddata.bc$a[] r3 = new com.tendcloud.tenddata.bc.a[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.tendcloud.tenddata.bc.a.$VALUES = r3
                return
        }

        a(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.index = r3
                return
        }

        public static com.tendcloud.tenddata.bc.a valueOf(java.lang.String r1) {
                java.lang.Class<com.tendcloud.tenddata.bc$a> r0 = com.tendcloud.tenddata.bc.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.tendcloud.tenddata.bc$a r1 = (com.tendcloud.tenddata.bc.a) r1
                return r1
        }

        public static com.tendcloud.tenddata.bc.a[] values() {
                com.tendcloud.tenddata.bc$a[] r0 = com.tendcloud.tenddata.bc.a.$VALUES
                java.lang.Object r0 = r0.clone()
                com.tendcloud.tenddata.bc$a[] r0 = (com.tendcloud.tenddata.bc.a[]) r0
                return r0
        }

        public int index() {
                r1 = this;
                int r0 = r1.index
                return r0
        }
    }

    private bc() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            return
    }

    public static com.tendcloud.tenddata.bc a() {
            com.tendcloud.tenddata.bc r0 = new com.tendcloud.tenddata.bc
            r0.<init>()
            return r0
    }

    public static /* synthetic */ java.lang.String a(com.tendcloud.tenddata.bc r0, org.json.JSONObject r1, java.lang.String r2) {
            java.lang.String r0 = r0.a(r1, r2)
            return r0
    }

    private java.lang.String a(org.json.JSONObject r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "pageUrl"
            java.lang.Object r1 = r4.get(r1)
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r2 = "shortUrl"
            java.lang.Object r2 = r4.get(r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "is_retargeting"
            java.lang.Object r4 = r4.get(r2)
            r0.append(r4)
            r0.append(r1)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r4 = "hAF3uVnSYyk2qN3trMjXFVsijBTGcR"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = com.tendcloud.tenddata.y.c(r4)
            return r4
    }

    public static /* synthetic */ java.util.Map a(com.tendcloud.tenddata.bc r0) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.d
            return r0
    }

    public static /* synthetic */ void a(com.tendcloud.tenddata.bc r0, java.io.Closeable r1) {
            r0.a(r1)
            return
    }

    private void a(java.io.Closeable r1) {
            r0 = this;
            if (r1 == 0) goto La
            r1.close()     // Catch: java.io.IOException -> L6
            goto La
        L6:
            r1 = move-exception
            r1.printStackTrace()
        La:
            return
    }

    public com.tendcloud.tenddata.bc a(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.d = r1
            return r0
    }

    public void getShortUrl(com.tendcloud.tenddata.TDGenerateUrl r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            com.tendcloud.tenddata.bc$1 r1 = new com.tendcloud.tenddata.bc$1
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }
}
