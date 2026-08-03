package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class az {
    private static int a = 2;
    private static int b = 6;
    private static int c = 6;
    private static int d = -40;
    private static int e = 4;
    private com.tendcloud.tenddata.az.b f;


    public class a {
        private byte band;
        private java.lang.String bssid;
        private byte channel;
        private byte rssi;
        private java.lang.String ssid;
        public final /* synthetic */ com.tendcloud.tenddata.az this$0;

        public a(com.tendcloud.tenddata.az r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.String r1 = ""
                r0.ssid = r1
                java.lang.String r1 = "00:00:00:00:00:00"
                r0.bssid = r1
                r1 = -127(0xffffffffffffff81, float:NaN)
                r0.rssi = r1
                r1 = 1
                r0.band = r1
                r0.channel = r1
                return
        }

        public a(com.tendcloud.tenddata.az r1, java.lang.String r2, java.lang.String r3, byte r4, byte r5, byte r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.ssid = r2
                r0.bssid = r3
                r0.rssi = r4
                r0.band = r5
                r0.channel = r6
                return
        }

        public com.tendcloud.tenddata.az.a cloneBssEntry() {
                r8 = this;
                com.tendcloud.tenddata.az$a r7 = new com.tendcloud.tenddata.az$a
                com.tendcloud.tenddata.az r1 = r8.this$0
                java.lang.String r2 = r8.ssid
                java.lang.String r3 = r8.bssid
                byte r4 = r8.rssi
                byte r5 = r8.band
                byte r6 = r8.channel
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        public byte getBand() {
                r1 = this;
                byte r0 = r1.band
                return r0
        }

        public java.lang.String getBssid() {
                r1 = this;
                java.lang.String r0 = r1.bssid
                return r0
        }

        public byte getChannel() {
                r1 = this;
                byte r0 = r1.channel
                return r0
        }

        public byte getRssi() {
                r1 = this;
                byte r0 = r1.rssi
                return r0
        }

        public java.lang.String getSsid() {
                r1 = this;
                java.lang.String r0 = r1.ssid
                return r0
        }

        public void setBand(byte r1) {
                r0 = this;
                r0.band = r1
                return
        }

        public void setBssid(java.lang.String r1) {
                r0 = this;
                r0.bssid = r1
                return
        }

        public void setChannel(byte r1) {
                r0 = this;
                r0.channel = r1
                return
        }

        public void setRssi(byte r1) {
                r0 = this;
                r0.rssi = r1
                return
        }

        public void setSsid(java.lang.String r1) {
                r0 = this;
                r0.ssid = r1
                return
        }
    }

    public static class b {
        public static final int DEFAULT_MAX_BSS_ENTRIES = 50;
        public static final int DEFAULT_MAX_FINGERPRINTS = 10;
        public static final int DEFAULT_MIN_FINGERPRINTS = 3;
        public static final int DEFAULT_RSSI_THRESHOLD = -85;
        private int maxBssEntries;
        private int maxFingerprints;
        private int minFingerprints;
        private int rssiThreshold;

        public b() {
                r1 = this;
                r1.<init>()
                r0 = 10
                r1.maxFingerprints = r0
                r0 = 3
                r1.minFingerprints = r0
                r0 = 50
                r1.maxBssEntries = r0
                r0 = -85
                r1.rssiThreshold = r0
                return
        }

        public int getMaxBssEntries() {
                r1 = this;
                int r0 = r1.maxBssEntries
                return r0
        }

        public int getMaxFingerprints() {
                r1 = this;
                int r0 = r1.maxFingerprints
                return r0
        }

        public int getMinFingerprints() {
                r1 = this;
                int r0 = r1.minFingerprints
                return r0
        }

        public int getRssiThreshold() {
                r1 = this;
                int r0 = r1.rssiThreshold
                return r0
        }

        public void setMaxBssEntries(int r1) {
                r0 = this;
                r0.maxBssEntries = r1
                return
        }

        public void setMaxFingerprints(int r1) {
                r0 = this;
                r0.maxFingerprints = r1
                return
        }

        public void setMinFingerprints(int r1) {
                r0 = this;
                r0.minFingerprints = r1
                return
        }

        public void setRssiThreshold(int r1) {
                r0 = this;
                r0.rssiThreshold = r1
                return
        }
    }

    public class c {
        private java.util.List<com.tendcloud.tenddata.az.a> bsslist;
        private java.util.Map<java.lang.String, com.tendcloud.tenddata.az.a> bssmap;
        private long poiId;
        public final /* synthetic */ com.tendcloud.tenddata.az this$0;
        private int timestamp;

        public c(com.tendcloud.tenddata.az r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public com.tendcloud.tenddata.az.c cloneFingerprint() {
                r4 = this;
                com.tendcloud.tenddata.az$c r0 = new com.tendcloud.tenddata.az$c
                com.tendcloud.tenddata.az r1 = r4.this$0
                r0.<init>(r1)
                int r1 = r4.timestamp
                r0.setTimestamp(r1)
                long r1 = r4.poiId
                r0.setPoiId(r1)
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                java.util.List<com.tendcloud.tenddata.az$a> r2 = r4.bsslist
                java.util.Iterator r2 = r2.iterator()
            L1c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L30
                java.lang.Object r3 = r2.next()
                com.tendcloud.tenddata.az$a r3 = (com.tendcloud.tenddata.az.a) r3
                com.tendcloud.tenddata.az$a r3 = r3.cloneBssEntry()
                r1.add(r3)
                goto L1c
            L30:
                r0.setBsslist(r1)
                return r0
        }

        public java.util.List<com.tendcloud.tenddata.az.a> getBsslist() {
                r1 = this;
                java.util.List<com.tendcloud.tenddata.az$a> r0 = r1.bsslist
                return r0
        }

        public java.util.Map<java.lang.String, com.tendcloud.tenddata.az.a> getBssmap(boolean r4) {
                r3 = this;
                java.util.Map<java.lang.String, com.tendcloud.tenddata.az$a> r0 = r3.bssmap
                if (r0 == 0) goto L6
                if (r4 == 0) goto L29
            L6:
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                r3.bssmap = r4
                java.util.List<com.tendcloud.tenddata.az$a> r4 = r3.bsslist
                java.util.Iterator r4 = r4.iterator()
            L13:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L29
                java.lang.Object r0 = r4.next()
                com.tendcloud.tenddata.az$a r0 = (com.tendcloud.tenddata.az.a) r0
                java.util.Map<java.lang.String, com.tendcloud.tenddata.az$a> r1 = r3.bssmap
                java.lang.String r2 = r0.getBssid()
                r1.put(r2, r0)
                goto L13
            L29:
                java.util.Map<java.lang.String, com.tendcloud.tenddata.az$a> r4 = r3.bssmap
                return r4
        }

        public long getPoiId() {
                r2 = this;
                long r0 = r2.poiId
                return r0
        }

        public int getTimestamp() {
                r1 = this;
                int r0 = r1.timestamp
                return r0
        }

        public void setBsslist(java.util.List<com.tendcloud.tenddata.az.a> r1) {
                r0 = this;
                r0.bsslist = r1
                return
        }

        public void setPoiId(long r1) {
                r0 = this;
                r0.poiId = r1
                return
        }

        public void setTimestamp(int r1) {
                r0 = this;
                r0.timestamp = r1
                return
        }
    }

    public class d {
        public com.tendcloud.tenddata.az.c fp1;
        public com.tendcloud.tenddata.az.c fp2;
        public double score;
        public final /* synthetic */ com.tendcloud.tenddata.az this$0;

        public d(com.tendcloud.tenddata.az r1, com.tendcloud.tenddata.az.c r2, com.tendcloud.tenddata.az.c r3, double r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.fp1 = r2
                r0.fp2 = r3
                r0.score = r4
                return
        }
    }

    public class e {
        public java.lang.Object key;
        public final /* synthetic */ com.tendcloud.tenddata.az this$0;
        public java.lang.Object value;

        public e(com.tendcloud.tenddata.az r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.value = r3
                return
        }
    }

    public az() {
            r1 = this;
            com.tendcloud.tenddata.az$b r0 = new com.tendcloud.tenddata.az$b
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public az(com.tendcloud.tenddata.az.b r1) {
            r0 = this;
            r0.<init>()
            r0.f = r1
            return
    }

    public double a(int r8, int r9) {
            r7 = this;
            r0 = 0
            if (r8 >= 0) goto L25
            if (r9 < 0) goto L7
            goto L25
        L7:
            int r9 = r9 + r8
            int r9 = r9 / 2
            double r2 = (double) r9
            double r8 = (double) r8
            double r8 = r8 - r2
            double r8 = java.lang.Math.abs(r8)
            int r4 = com.tendcloud.tenddata.az.a
            double r5 = (double) r4
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L1b
            double r0 = (double) r4
            double r0 = r8 - r0
        L1b:
            double r0 = r0 + r2
            double r0 = r0 / r2
            int r8 = com.tendcloud.tenddata.az.b
            double r8 = (double) r8
            double r8 = java.lang.Math.pow(r0, r8)
            return r8
        L25:
            return r0
    }

    public double a(com.tendcloud.tenddata.az.c r19, com.tendcloud.tenddata.az.c r20) {
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = r19
            java.util.Map r3 = r2.getBssmap(r1)
            r4 = r20
            java.util.Map r5 = r4.getBssmap(r1)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Set r7 = r3.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r10 = r1
            r11 = r10
            r12 = 0
            r14 = 0
        L22:
            boolean r16 = r7.hasNext()
            if (r16 == 0) goto L6f
            java.lang.Object r16 = r7.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r17 = r16.getValue()
            r1 = r17
            com.tendcloud.tenddata.az$a r1 = (com.tendcloud.tenddata.az.a) r1
            java.lang.Object r8 = r16.getKey()
            java.lang.Object r8 = r5.get(r8)
            com.tendcloud.tenddata.az$a r8 = (com.tendcloud.tenddata.az.a) r8
            byte r9 = r1.getRssi()
            int r11 = r11 + r9
            if (r8 != 0) goto L4b
            r6.add(r1)
            goto L6b
        L4b:
            int r10 = r10 + 1
            byte r9 = r1.getRssi()
            byte r2 = r8.getRssi()
            double r16 = r0.b(r9, r2)
            double r12 = r12 + r16
            byte r1 = r1.getRssi()
            byte r2 = r8.getRssi()
            double r1 = r0.a(r1, r2)
            double r16 = r16 * r1
            double r14 = r16 + r14
        L6b:
            r2 = r19
            r1 = 0
            goto L22
        L6f:
            r1 = 0
            if (r10 != 0) goto L74
            return r1
        L74:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L7c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto La5
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getValue()
            com.tendcloud.tenddata.az$a r8 = (com.tendcloud.tenddata.az.a) r8
            byte r8 = r8.getRssi()
            int r11 = r11 + r8
            java.lang.Object r8 = r7.getKey()
            boolean r8 = r3.containsKey(r8)
            if (r8 != 0) goto L7c
            java.lang.Object r7 = r7.getValue()
            r6.add(r7)
            goto L7c
        La5:
            java.util.List r3 = r19.getBsslist()
            int r3 = r3.size()
            java.util.List r4 = r20.getBsslist()
            int r4 = r4.size()
            int r4 = r4 + r3
            r3 = 0
            int r4 = r4 - r3
            int r11 = r11 / r4
            com.tendcloud.tenddata.az$b r3 = r0.f
            int r3 = r3.getRssiThreshold()
            double r4 = (double) r11
            r7 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r4 = r4 + r7
            int r4 = (int) r4
            int r3 = java.lang.Math.max(r3, r4)
            java.util.Iterator r4 = r6.iterator()
            r8 = r1
        Ld0:
            boolean r1 = r4.hasNext()
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 == 0) goto Le6
            java.lang.Object r1 = r4.next()
            com.tendcloud.tenddata.az$a r1 = (com.tendcloud.tenddata.az.a) r1
            byte r1 = r1.getRssi()
            if (r1 <= r3) goto Ld0
            double r8 = r8 + r5
            goto Ld0
        Le6:
            int r10 = r10 * 2
            double r1 = (double) r10
            double r1 = r1 + r8
            double r8 = r8 / r1
            double r14 = r14 / r12
            int r1 = com.tendcloud.tenddata.az.e
            double r1 = (double) r1
            double r1 = java.lang.Math.pow(r8, r1)
            double r5 = r5 - r1
            double r5 = r5 * r14
            return r5
    }

    public double a(com.tendcloud.tenddata.az.c r5, java.util.List<com.tendcloud.tenddata.az.c> r6) {
            r4 = this;
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        L6:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r6.next()
            com.tendcloud.tenddata.az$c r2 = (com.tendcloud.tenddata.az.c) r2
            double r2 = r4.a(r2, r5)
            double r0 = java.lang.Math.max(r2, r0)
            goto L6
        L1b:
            return r0
    }

    public double a(java.util.List<com.tendcloud.tenddata.az.c> r6, java.util.List<com.tendcloud.tenddata.az.c> r7) {
            r5 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 != 0) goto L38
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lf
            goto L38
        Lf:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r5.b(r6, r7, r0)
            r6 = 0
            java.util.Iterator r7 = r0.iterator()
        L1c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r7.next()
            com.tendcloud.tenddata.az$d r0 = (com.tendcloud.tenddata.az.d) r0
            com.tendcloud.tenddata.az$c r3 = r0.fp1
            if (r3 == 0) goto L1c
            com.tendcloud.tenddata.az$c r3 = r0.fp2
            if (r3 == 0) goto L1c
            double r3 = r0.score
            double r1 = r1 + r3
            int r6 = r6 + 1
            goto L1c
        L36:
            double r6 = (double) r6
            double r1 = r1 / r6
        L38:
            return r1
    }

    public double a(java.util.List<com.tendcloud.tenddata.az.c> r8, java.util.List<com.tendcloud.tenddata.az.c> r9, java.util.List<com.tendcloud.tenddata.az.c> r10) {
            r7 = this;
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 != 0) goto L5c
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto Lf
            goto L5c
        Lf:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r7.b(r8, r9, r0)
            r8 = 0
            java.util.Iterator r9 = r0.iterator()
        L1c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r9.next()
            com.tendcloud.tenddata.az$d r0 = (com.tendcloud.tenddata.az.d) r0
            com.tendcloud.tenddata.az$c r3 = r0.fp1
            if (r3 == 0) goto L3a
            com.tendcloud.tenddata.az$c r4 = r0.fp2
            if (r4 == 0) goto L3a
            double r5 = r0.score
            double r1 = r1 + r5
            int r8 = r8 + 1
            com.tendcloud.tenddata.az$c r0 = r7.b(r3, r4)
            goto L55
        L3a:
            int r3 = r10.size()
            com.tendcloud.tenddata.az$b r4 = r7.f
            int r4 = r4.getMinFingerprints()
            if (r3 >= r4) goto L1c
            com.tendcloud.tenddata.az$c r3 = r0.fp1
            if (r3 != 0) goto L51
            com.tendcloud.tenddata.az$c r0 = r0.fp2
            com.tendcloud.tenddata.az$c r0 = r0.cloneFingerprint()
            goto L55
        L51:
            com.tendcloud.tenddata.az$c r0 = r3.cloneFingerprint()
        L55:
            r10.add(r0)
            goto L1c
        L59:
            double r8 = (double) r8
            double r1 = r1 / r8
            return r1
        L5c:
            r10.addAll(r8)
            r10.addAll(r9)
            return r1
    }

    public double b(int r4, int r5) {
            r3 = this;
            if (r4 >= 0) goto L23
            if (r5 < 0) goto L5
            goto L23
        L5:
            int r4 = java.lang.Math.max(r4, r5)
            double r4 = (double) r4
            int r0 = com.tendcloud.tenddata.az.d
            double r1 = (double) r0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L14
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L22
        L14:
            r1 = 4638707616191610880(0x4060000000000000, double:128.0)
            double r4 = r4 + r1
            int r0 = r0 + 128
            double r0 = (double) r0
            double r4 = r4 / r0
            int r0 = com.tendcloud.tenddata.az.c
            double r0 = (double) r0
            double r4 = java.lang.Math.pow(r4, r0)
        L22:
            return r4
        L23:
            r4 = 0
            return r4
    }

    public com.tendcloud.tenddata.az.c b(com.tendcloud.tenddata.az.c r17, com.tendcloud.tenddata.az.c r18) {
            r16 = this;
            r7 = r16
            r0 = 0
            r1 = r17
            java.util.Map r8 = r1.getBssmap(r0)
            r1 = r18
            java.util.Map r9 = r1.getBssmap(r0)
            java.util.TreeMap r10 = new java.util.TreeMap
            r10.<init>()
            com.tendcloud.tenddata.az$c r11 = new com.tendcloud.tenddata.az$c
            r11.<init>(r7)
            long r2 = r18.getPoiId()
            r11.setPoiId(r2)
            int r0 = r18.getTimestamp()
            r11.setTimestamp(r0)
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            r11.setBsslist(r12)
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L37:
            boolean r0 = r13.hasNext()
            r1 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            if (r0 == 0) goto La0
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getValue()
            com.tendcloud.tenddata.az$a r3 = (com.tendcloud.tenddata.az.a) r3
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r0 = r9.get(r0)
            com.tendcloud.tenddata.az$a r0 = (com.tendcloud.tenddata.az.a) r0
            if (r0 != 0) goto L74
            byte r0 = r3.getRssi()
            int r0 = -r0
            double r4 = (double) r0
        L60:
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            boolean r0 = r10.containsKey(r0)
            if (r0 == 0) goto L6c
            double r4 = r4 + r1
            goto L60
        L6c:
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r10.put(r0, r3)
            goto L37
        L74:
            com.tendcloud.tenddata.az$a r14 = new com.tendcloud.tenddata.az$a
            java.lang.String r2 = r0.getSsid()
            java.lang.String r4 = r0.getBssid()
            byte r1 = r0.getRssi()
            byte r3 = r3.getRssi()
            int r1 = r1 + r3
            int r1 = r1 / 2
            byte r5 = (byte) r1
            byte r6 = r0.getBand()
            byte r15 = r0.getChannel()
            r0 = r14
            r1 = r16
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.add(r14)
            goto L37
        La0:
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le2
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r8.containsKey(r4)
            if (r4 != 0) goto La8
            java.lang.Object r4 = r3.getValue()
            com.tendcloud.tenddata.az$a r4 = (com.tendcloud.tenddata.az.a) r4
            byte r4 = r4.getRssi()
            int r4 = -r4
            double r4 = (double) r4
        Lca:
            java.lang.Double r6 = java.lang.Double.valueOf(r4)
            boolean r6 = r10.containsKey(r6)
            if (r6 == 0) goto Ld6
            double r4 = r4 + r1
            goto Lca
        Ld6:
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object r3 = r3.getValue()
            r10.put(r4, r3)
            goto La8
        Le2:
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lea:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L120
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            double r2 = -r2
            int r2 = (int) r2
            byte r2 = (byte) r2
            int r3 = r12.size()
            com.tendcloud.tenddata.az$b r4 = r7.f
            int r4 = r4.getMaxBssEntries()
            if (r3 >= r4) goto L120
            com.tendcloud.tenddata.az$b r3 = r7.f
            int r3 = r3.getRssiThreshold()
            if (r2 >= r3) goto L118
            goto L120
        L118:
            java.lang.Object r1 = r1.getValue()
            r12.add(r1)
            goto Lea
        L120:
            return r11
    }

    public void b(java.util.List<com.tendcloud.tenddata.az.c> r13, java.util.List<com.tendcloud.tenddata.az.c> r14, java.util.List<com.tendcloud.tenddata.az.d> r15) {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r13 = r13.iterator()
        L13:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r13.next()
            com.tendcloud.tenddata.az$c r3 = (com.tendcloud.tenddata.az.c) r3
            java.util.Iterator r10 = r14.iterator()
        L23:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r10.next()
            r7 = r4
            com.tendcloud.tenddata.az$c r7 = (com.tendcloud.tenddata.az.c) r7
            r2.add(r7)
            double r8 = r12.a(r3, r7)
            com.tendcloud.tenddata.az$d r11 = new com.tendcloud.tenddata.az$d
            r4 = r11
            r5 = r12
            r6 = r3
            r4.<init>(r5, r6, r7, r8)
            r0.add(r11)
            goto L23
        L43:
            r1.add(r3)
            goto L13
        L47:
            com.tendcloud.tenddata.az$1 r13 = new com.tendcloud.tenddata.az$1
            r13.<init>(r12)
            java.util.Collections.sort(r0, r13)
            r15.clear()
            java.util.Iterator r13 = r0.iterator()
        L56:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L80
            java.lang.Object r14 = r13.next()
            com.tendcloud.tenddata.az$d r14 = (com.tendcloud.tenddata.az.d) r14
            com.tendcloud.tenddata.az$c r0 = r14.fp1
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L56
            com.tendcloud.tenddata.az$c r0 = r14.fp2
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L56
            com.tendcloud.tenddata.az$c r0 = r14.fp1
            r1.remove(r0)
            com.tendcloud.tenddata.az$c r0 = r14.fp2
            r2.remove(r0)
            r15.add(r14)
            goto L56
        L80:
            java.util.Iterator r13 = r1.iterator()
        L84:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L9f
            java.lang.Object r14 = r13.next()
            r5 = r14
            com.tendcloud.tenddata.az$c r5 = (com.tendcloud.tenddata.az.c) r5
            com.tendcloud.tenddata.az$d r14 = new com.tendcloud.tenddata.az$d
            r6 = 0
            r7 = 0
            r3 = r14
            r4 = r12
            r3.<init>(r4, r5, r6, r7)
            r15.add(r14)
            goto L84
        L9f:
            java.util.Iterator r13 = r2.iterator()
        La3:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lbe
            java.lang.Object r14 = r13.next()
            r3 = r14
            com.tendcloud.tenddata.az$c r3 = (com.tendcloud.tenddata.az.c) r3
            com.tendcloud.tenddata.az$d r14 = new com.tendcloud.tenddata.az$d
            r2 = 0
            r4 = 0
            r0 = r14
            r1 = r12
            r0.<init>(r1, r2, r3, r4)
            r15.add(r14)
            goto La3
        Lbe:
            return
    }
}
