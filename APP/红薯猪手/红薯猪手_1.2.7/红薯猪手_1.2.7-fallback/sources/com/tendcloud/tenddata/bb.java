package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bb {
    private static int a = 2;
    private static int b = 6;
    private static int c = 6;
    private static int d = -40;
    private static int e = 4;
    private com.tendcloud.tenddata.ay f;


    public class a {
        public com.tendcloud.tenddata.ba fp1;
        public com.tendcloud.tenddata.ba fp2;
        public double score;
        public final /* synthetic */ com.tendcloud.tenddata.bb this$0;

        public a(com.tendcloud.tenddata.bb r1, com.tendcloud.tenddata.ba r2, com.tendcloud.tenddata.ba r3, double r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.fp1 = r2
                r0.fp2 = r3
                r0.score = r4
                return
        }
    }

    public class b {
        public java.lang.Object key;
        public final /* synthetic */ com.tendcloud.tenddata.bb this$0;
        public java.lang.Object value;

        public b(com.tendcloud.tenddata.bb r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.value = r3
                return
        }
    }

    public bb() {
            r1 = this;
            com.tendcloud.tenddata.ay r0 = new com.tendcloud.tenddata.ay
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public bb(com.tendcloud.tenddata.ay r1) {
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
            int r4 = com.tendcloud.tenddata.bb.a
            double r5 = (double) r4
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L1b
            double r0 = (double) r4
            double r0 = r8 - r0
        L1b:
            double r0 = r0 + r2
            double r0 = r0 / r2
            int r8 = com.tendcloud.tenddata.bb.b
            double r8 = (double) r8
            double r8 = java.lang.Math.pow(r0, r8)
            return r8
        L25:
            return r0
    }

    public double a(com.tendcloud.tenddata.ba r19, com.tendcloud.tenddata.ba r20) {
            r18 = this;
            r0 = r18
            r1 = 0
            r2 = r19
            java.util.Map r3 = r2.a(r1)
            r4 = r20
            java.util.Map r5 = r4.a(r1)
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
            if (r16 == 0) goto L6e
            java.lang.Object r16 = r7.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r17 = r16.getValue()
            r1 = r17
            com.tendcloud.tenddata.ax r1 = (com.tendcloud.tenddata.ax) r1
            java.lang.Object r8 = r16.getKey()
            java.lang.Object r8 = r5.get(r8)
            com.tendcloud.tenddata.ax r8 = (com.tendcloud.tenddata.ax) r8
            byte r9 = r1.c()
            int r11 = r11 + r9
            if (r8 != 0) goto L4b
            r6.add(r1)
            goto L6a
        L4b:
            int r10 = r10 + 1
            byte r9 = r1.c()
            byte r2 = r8.c()
            double r16 = r0.b(r9, r2)
            double r12 = r12 + r16
            byte r1 = r1.c()
            byte r2 = r8.c()
            double r1 = r0.a(r1, r2)
            double r1 = r1 * r16
            double r14 = r14 + r1
        L6a:
            r2 = r19
            r1 = 0
            goto L22
        L6e:
            r1 = 0
            if (r10 != 0) goto L73
            return r1
        L73:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L7b:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto La4
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getValue()
            com.tendcloud.tenddata.ax r8 = (com.tendcloud.tenddata.ax) r8
            byte r8 = r8.c()
            int r11 = r11 + r8
            java.lang.Object r8 = r7.getKey()
            boolean r8 = r3.containsKey(r8)
            if (r8 != 0) goto L7b
            java.lang.Object r7 = r7.getValue()
            r6.add(r7)
            goto L7b
        La4:
            java.util.List r3 = r19.c()
            int r3 = r3.size()
            java.util.List r4 = r20.c()
            int r4 = r4.size()
            int r4 = r4 + r3
            r3 = 0
            int r4 = r4 - r3
            int r11 = r11 / r4
            com.tendcloud.tenddata.ay r3 = r0.f
            int r3 = r3.d()
            double r4 = (double) r11
            r7 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r4 = r4 + r7
            int r4 = (int) r4
            int r3 = java.lang.Math.max(r3, r4)
            java.util.Iterator r4 = r6.iterator()
            r8 = r1
        Lcf:
            boolean r1 = r4.hasNext()
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 == 0) goto Le5
            java.lang.Object r1 = r4.next()
            com.tendcloud.tenddata.ax r1 = (com.tendcloud.tenddata.ax) r1
            byte r1 = r1.c()
            if (r1 <= r3) goto Lcf
            double r8 = r8 + r5
            goto Lcf
        Le5:
            int r10 = r10 * 2
            double r1 = (double) r10
            double r1 = r1 + r8
            double r8 = r8 / r1
            double r14 = r14 / r12
            int r1 = com.tendcloud.tenddata.bb.e
            double r1 = (double) r1
            double r1 = java.lang.Math.pow(r8, r1)
            double r5 = r5 - r1
            double r5 = r5 * r14
            return r5
    }

    public double a(com.tendcloud.tenddata.ba r5, java.util.List<com.tendcloud.tenddata.ba> r6) {
            r4 = this;
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
        L6:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r6.next()
            com.tendcloud.tenddata.ba r2 = (com.tendcloud.tenddata.ba) r2
            double r2 = r4.a(r2, r5)
            double r0 = java.lang.Math.max(r2, r0)
            goto L6
        L1b:
            return r0
    }

    public double a(java.util.List<com.tendcloud.tenddata.ba> r6, java.util.List<com.tendcloud.tenddata.ba> r7) {
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
            com.tendcloud.tenddata.bb$a r0 = (com.tendcloud.tenddata.bb.a) r0
            com.tendcloud.tenddata.ba r3 = r0.fp1
            if (r3 == 0) goto L1c
            com.tendcloud.tenddata.ba r3 = r0.fp2
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

    public double a(java.util.List<com.tendcloud.tenddata.ba> r8, java.util.List<com.tendcloud.tenddata.ba> r9, java.util.List<com.tendcloud.tenddata.ba> r10) {
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
            com.tendcloud.tenddata.bb$a r0 = (com.tendcloud.tenddata.bb.a) r0
            com.tendcloud.tenddata.ba r3 = r0.fp1
            if (r3 == 0) goto L3a
            com.tendcloud.tenddata.ba r4 = r0.fp2
            if (r4 == 0) goto L3a
            double r5 = r0.score
            double r1 = r1 + r5
            int r8 = r8 + 1
            com.tendcloud.tenddata.ba r0 = r7.b(r3, r4)
            goto L55
        L3a:
            int r3 = r10.size()
            com.tendcloud.tenddata.ay r4 = r7.f
            int r4 = r4.b()
            if (r3 >= r4) goto L1c
            com.tendcloud.tenddata.ba r3 = r0.fp1
            if (r3 != 0) goto L51
            com.tendcloud.tenddata.ba r0 = r0.fp2
            com.tendcloud.tenddata.ba r0 = r0.d()
            goto L55
        L51:
            com.tendcloud.tenddata.ba r0 = r3.d()
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
            int r0 = com.tendcloud.tenddata.bb.d
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
            int r0 = com.tendcloud.tenddata.bb.c
            double r0 = (double) r0
            double r4 = java.lang.Math.pow(r4, r0)
        L22:
            return r4
        L23:
            r4 = 0
            return r4
    }

    public com.tendcloud.tenddata.ba b(com.tendcloud.tenddata.ba r18, com.tendcloud.tenddata.ba r19) {
            r17 = this;
            r0 = r17
            r1 = 0
            r2 = r18
            java.util.Map r2 = r2.a(r1)
            r3 = r19
            java.util.Map r1 = r3.a(r1)
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            com.tendcloud.tenddata.ba r5 = new com.tendcloud.tenddata.ba
            r5.<init>()
            long r6 = r19.b()
            r5.setPoiId(r6)
            int r3 = r19.a()
            r5.setTimestamp(r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r5.setBsslist(r3)
            java.util.Set r6 = r2.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r7 = r6.hasNext()
            r8 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            if (r7 == 0) goto L9a
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r10 = r7.getValue()
            com.tendcloud.tenddata.ax r10 = (com.tendcloud.tenddata.ax) r10
            java.lang.Object r7 = r7.getKey()
            java.lang.Object r7 = r1.get(r7)
            com.tendcloud.tenddata.ax r7 = (com.tendcloud.tenddata.ax) r7
            if (r7 != 0) goto L74
            byte r7 = r10.c()
            int r7 = -r7
            double r11 = (double) r7
        L60:
            java.lang.Double r7 = java.lang.Double.valueOf(r11)
            boolean r7 = r4.containsKey(r7)
            if (r7 == 0) goto L6c
            double r11 = r11 + r8
            goto L60
        L6c:
            java.lang.Double r7 = java.lang.Double.valueOf(r11)
            r4.put(r7, r10)
            goto L37
        L74:
            com.tendcloud.tenddata.ax r8 = new com.tendcloud.tenddata.ax
            java.lang.String r12 = r7.a()
            java.lang.String r13 = r7.b()
            byte r9 = r7.c()
            byte r10 = r10.c()
            int r10 = r10 + r9
            int r10 = r10 / 2
            byte r14 = (byte) r10
            byte r15 = r7.d()
            byte r16 = r7.e()
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r3.add(r8)
            goto L37
        L9a:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        La2:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Ldc
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            boolean r7 = r2.containsKey(r7)
            if (r7 != 0) goto La2
            java.lang.Object r7 = r6.getValue()
            com.tendcloud.tenddata.ax r7 = (com.tendcloud.tenddata.ax) r7
            byte r7 = r7.c()
            int r7 = -r7
            double r10 = (double) r7
        Lc4:
            java.lang.Double r7 = java.lang.Double.valueOf(r10)
            boolean r7 = r4.containsKey(r7)
            if (r7 == 0) goto Ld0
            double r10 = r10 + r8
            goto Lc4
        Ld0:
            java.lang.Double r7 = java.lang.Double.valueOf(r10)
            java.lang.Object r6 = r6.getValue()
            r4.put(r7, r6)
            goto La2
        Ldc:
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Le4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L11a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.Double r4 = (java.lang.Double) r4
            double r6 = r4.doubleValue()
            double r6 = -r6
            int r4 = (int) r6
            byte r4 = (byte) r4
            int r6 = r3.size()
            com.tendcloud.tenddata.ay r7 = r0.f
            int r7 = r7.c()
            if (r6 >= r7) goto L11a
            com.tendcloud.tenddata.ay r6 = r0.f
            int r6 = r6.d()
            if (r4 >= r6) goto L112
            goto L11a
        L112:
            java.lang.Object r2 = r2.getValue()
            r3.add(r2)
            goto Le4
        L11a:
            return r5
    }

    public void b(java.util.List<com.tendcloud.tenddata.ba> r13, java.util.List<com.tendcloud.tenddata.ba> r14, java.util.List<com.tendcloud.tenddata.bb.a> r15) {
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
            com.tendcloud.tenddata.ba r3 = (com.tendcloud.tenddata.ba) r3
            java.util.Iterator r10 = r14.iterator()
        L23:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r10.next()
            r7 = r4
            com.tendcloud.tenddata.ba r7 = (com.tendcloud.tenddata.ba) r7
            r2.add(r7)
            double r8 = r12.a(r3, r7)
            com.tendcloud.tenddata.bb$a r11 = new com.tendcloud.tenddata.bb$a
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
            com.tendcloud.tenddata.bb$1 r13 = new com.tendcloud.tenddata.bb$1
            r13.<init>(r12)
            java.util.Collections.sort(r0, r13)
            r15.clear()
            java.util.Iterator r13 = r0.iterator()
        L56:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L80
            java.lang.Object r14 = r13.next()
            com.tendcloud.tenddata.bb$a r14 = (com.tendcloud.tenddata.bb.a) r14
            com.tendcloud.tenddata.ba r0 = r14.fp1
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L56
            com.tendcloud.tenddata.ba r0 = r14.fp2
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L56
            com.tendcloud.tenddata.ba r0 = r14.fp1
            r1.remove(r0)
            com.tendcloud.tenddata.ba r0 = r14.fp2
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
            com.tendcloud.tenddata.ba r5 = (com.tendcloud.tenddata.ba) r5
            com.tendcloud.tenddata.bb$a r14 = new com.tendcloud.tenddata.bb$a
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
            com.tendcloud.tenddata.ba r3 = (com.tendcloud.tenddata.ba) r3
            com.tendcloud.tenddata.bb$a r14 = new com.tendcloud.tenddata.bb$a
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
