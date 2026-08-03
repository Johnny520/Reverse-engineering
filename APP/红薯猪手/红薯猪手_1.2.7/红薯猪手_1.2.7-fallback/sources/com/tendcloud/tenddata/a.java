package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final com.tendcloud.tenddata.a ENV = null;
    private static volatile java.util.List<java.lang.String> FeaturesList = null;
    public static final java.lang.String MF_JSON = "UNIFIED_SDK_JSON";
    public static final com.tendcloud.tenddata.a UNIVERSAL = null;
    private static final com.tendcloud.tenddata.a[] service = null;
    private int indexNum;
    private java.lang.String nameString;



    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tendcloud.tenddata.a.FeaturesList = r0
            com.tendcloud.tenddata.a$1 r0 = new com.tendcloud.tenddata.a$1
            java.lang.String r1 = "ENV"
            r2 = 2
            r0.<init>(r1, r2)
            com.tendcloud.tenddata.a.ENV = r0
            com.tendcloud.tenddata.a$2 r1 = new com.tendcloud.tenddata.a$2
            java.lang.String r3 = "SDK"
            r4 = 99
            r1.<init>(r3, r4)
            com.tendcloud.tenddata.a.UNIVERSAL = r1
            com.tendcloud.tenddata.a[] r2 = new com.tendcloud.tenddata.a[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            com.tendcloud.tenddata.a.service = r2
            return
    }

    public a(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.nameString = r1
            r0.indexNum = r2
            r0.addFeatures2List(r1)
            return
    }

    public a(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.nameString = r1
            r0.indexNum = r2
            return
    }

    private void addFeatures2List(java.lang.String r2) {
            r1 = this;
            boolean r0 = com.tendcloud.tenddata.y.b(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L13
            java.util.List<java.lang.String> r0 = com.tendcloud.tenddata.a.FeaturesList     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L13
            java.util.List<java.lang.String> r0 = com.tendcloud.tenddata.a.FeaturesList     // Catch: java.lang.Throwable -> L13
            r0.add(r2)     // Catch: java.lang.Throwable -> L13
        L13:
            return
    }

    public static java.util.ArrayList<com.tendcloud.tenddata.a> getFeaturesList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            java.util.List<java.lang.String> r2 = com.tendcloud.tenddata.a.FeaturesList     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2e
            if (r1 >= r2) goto L2e
            java.util.List<java.lang.String> r2 = com.tendcloud.tenddata.a.FeaturesList     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.a r2 = valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L2b
            java.util.List<java.lang.String> r2 = com.tendcloud.tenddata.a.FeaturesList     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2e
            com.tendcloud.tenddata.a r2 = valueOf(r2)     // Catch: java.lang.Throwable -> L2e
            r0.add(r2)     // Catch: java.lang.Throwable -> L2e
        L2b:
            int r1 = r1 + 1
            goto L6
        L2e:
            return r0
    }

    public static java.util.List<java.lang.String> getFeaturesNameList() {
            java.util.List<java.lang.String> r0 = com.tendcloud.tenddata.a.FeaturesList
            return r0
    }

    public static com.tendcloud.tenddata.a valueOf(java.lang.String r2) {
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.ENV
            java.lang.String r1 = r0.name()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            com.tendcloud.tenddata.a r0 = com.tendcloud.tenddata.a.UNIVERSAL
            java.lang.String r1 = r0.name()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L1a
            return r0
        L1a:
            r2 = 0
            return r2
    }

    public static com.tendcloud.tenddata.a[] values() {
            com.tendcloud.tenddata.a[] r0 = com.tendcloud.tenddata.a.service
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            com.tendcloud.tenddata.a[] r0 = (com.tendcloud.tenddata.a[]) r0
            return r0
    }

    public abstract java.lang.String getCert();

    public java.lang.String getDataFolder() {
            r2 = this;
            java.lang.String r0 = "td_database"
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            int r1 = r2.index()
            r0.append(r1)
            java.lang.String r1 = "SaaS"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int getFileLimitType() {
            r1 = this;
            r0 = 1
            return r0
    }

    public abstract java.lang.String getHost();

    public abstract java.lang.String getIP();

    public abstract java.lang.String getMessageFormat();

    public java.lang.String getRootFolder() {
            r1 = this;
            java.lang.String r0 = "__database_reborn_January_one__"
            return r0
    }

    public abstract java.lang.String getUrl();

    public int index() {
            r1 = this;
            int r0 = r1.indexNum
            return r0
    }

    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.nameString
            return r0
    }

    public boolean needToSendData() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            return
    }
}
