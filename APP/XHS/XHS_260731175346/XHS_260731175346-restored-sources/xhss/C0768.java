package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛵᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0768 extends xhss.AbstractC0463 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2542;

    public /* synthetic */ C0768(xhss.C0623 r1, int r2) {
            r0 = this;
            r0.f2542 = r2
            r0.<init>(r1)
            return
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public java.lang.Object mo837(java.lang.Object r8) {
            r7 = this;
            int r7 = r7.f2542
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            r6 = 0
            switch(r7) {
                case 2: goto L2b2;
                case 3: goto L2a5;
                case 4: goto L286;
                case 5: goto L233;
                case 6: goto L1ad;
                case 7: goto L127;
                case 8: goto La1;
                case 9: goto L1b;
                case 10: goto L13;
                default: goto L12;
            }
        L12:
            return r8
        L13:
            if (r8 != 0) goto L16
            goto L1a
        L16:
            java.lang.String r6 = r8.toString()
        L1a:
            return r6
        L1b:
            if (r8 != 0) goto L1f
            goto La0
        L1f:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r5.isAssignableFrom(r7)
            if (r7 == 0) goto L2e
            r6 = r8
            java.lang.Long r6 = (java.lang.Long) r6
            goto La0
        L2e:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r3.isAssignableFrom(r7)
            if (r7 == 0) goto L43
            java.lang.Integer r8 = (java.lang.Integer) r8
            long r7 = r8.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            goto La0
        L43:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r2.isAssignableFrom(r7)
            if (r7 == 0) goto L58
            java.lang.Double r8 = (java.lang.Double) r8
            long r7 = r8.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            goto La0
        L58:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r1.isAssignableFrom(r7)
            if (r7 == 0) goto L6d
            java.math.BigDecimal r8 = (java.math.BigDecimal) r8
            long r7 = r8.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            goto La0
        L6d:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r0.isAssignableFrom(r7)
            if (r7 == 0) goto L82
            java.lang.Float r8 = (java.lang.Float) r8
            long r7 = r8.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            goto La0
        L82:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r4.isAssignableFrom(r7)
            if (r7 == 0) goto L95
            java.lang.String r7 = r8.toString()
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            goto La0
        L95:
            java.lang.Class r7 = r8.getClass()
            java.lang.String r8 = r5.getName()
            xhss.C0532.m960(r7, r8)
        La0:
            return r6
        La1:
            if (r8 != 0) goto La5
            goto L126
        La5:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r3.isAssignableFrom(r7)
            if (r7 == 0) goto Lb4
            r6 = r8
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L126
        Lb4:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r5.isAssignableFrom(r7)
            if (r7 == 0) goto Lc9
            java.lang.Long r8 = (java.lang.Long) r8
            int r7 = r8.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            goto L126
        Lc9:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r2.isAssignableFrom(r7)
            if (r7 == 0) goto Lde
            java.lang.Double r8 = (java.lang.Double) r8
            int r7 = r8.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            goto L126
        Lde:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r1.isAssignableFrom(r7)
            if (r7 == 0) goto Lf3
            java.math.BigDecimal r8 = (java.math.BigDecimal) r8
            int r7 = r8.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            goto L126
        Lf3:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r0.isAssignableFrom(r7)
            if (r7 == 0) goto L108
            java.lang.Float r8 = (java.lang.Float) r8
            int r7 = r8.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            goto L126
        L108:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r4.isAssignableFrom(r7)
            if (r7 == 0) goto L11b
            java.lang.String r7 = r8.toString()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            goto L126
        L11b:
            java.lang.Class r7 = r8.getClass()
            java.lang.String r8 = r3.getName()
            xhss.C0532.m960(r7, r8)
        L126:
            return r6
        L127:
            if (r8 != 0) goto L12b
            goto L1ac
        L12b:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r0.isAssignableFrom(r7)
            if (r7 == 0) goto L13a
            r6 = r8
            java.lang.Float r6 = (java.lang.Float) r6
            goto L1ac
        L13a:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r3.isAssignableFrom(r7)
            if (r7 == 0) goto L14f
            java.lang.Integer r8 = (java.lang.Integer) r8
            float r7 = r8.floatValue()
            java.lang.Float r6 = java.lang.Float.valueOf(r7)
            goto L1ac
        L14f:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r5.isAssignableFrom(r7)
            if (r7 == 0) goto L164
            java.lang.Long r8 = (java.lang.Long) r8
            float r7 = r8.floatValue()
            java.lang.Float r6 = java.lang.Float.valueOf(r7)
            goto L1ac
        L164:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r1.isAssignableFrom(r7)
            if (r7 == 0) goto L179
            java.math.BigDecimal r8 = (java.math.BigDecimal) r8
            float r7 = r8.floatValue()
            java.lang.Float r6 = java.lang.Float.valueOf(r7)
            goto L1ac
        L179:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r2.isAssignableFrom(r7)
            if (r7 == 0) goto L18e
            java.lang.Double r8 = (java.lang.Double) r8
            float r7 = r8.floatValue()
            java.lang.Float r6 = java.lang.Float.valueOf(r7)
            goto L1ac
        L18e:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r4.isAssignableFrom(r7)
            if (r7 == 0) goto L1a1
            java.lang.String r7 = r8.toString()
            java.lang.Float r6 = java.lang.Float.valueOf(r7)
            goto L1ac
        L1a1:
            java.lang.Class r7 = r8.getClass()
            java.lang.String r8 = r0.getName()
            xhss.C0532.m960(r7, r8)
        L1ac:
            return r6
        L1ad:
            if (r8 != 0) goto L1b1
            goto L232
        L1b1:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r2.isAssignableFrom(r7)
            if (r7 == 0) goto L1c0
            r6 = r8
            java.lang.Double r6 = (java.lang.Double) r6
            goto L232
        L1c0:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r3.isAssignableFrom(r7)
            if (r7 == 0) goto L1d5
            java.lang.Integer r8 = (java.lang.Integer) r8
            double r7 = r8.doubleValue()
            java.lang.Double r6 = java.lang.Double.valueOf(r7)
            goto L232
        L1d5:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r5.isAssignableFrom(r7)
            if (r7 == 0) goto L1ea
            java.lang.Long r8 = (java.lang.Long) r8
            double r7 = r8.doubleValue()
            java.lang.Double r6 = java.lang.Double.valueOf(r7)
            goto L232
        L1ea:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r1.isAssignableFrom(r7)
            if (r7 == 0) goto L1ff
            java.math.BigDecimal r8 = (java.math.BigDecimal) r8
            double r7 = r8.doubleValue()
            java.lang.Double r6 = java.lang.Double.valueOf(r7)
            goto L232
        L1ff:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r0.isAssignableFrom(r7)
            if (r7 == 0) goto L214
            java.lang.Float r8 = (java.lang.Float) r8
            double r7 = r8.doubleValue()
            java.lang.Double r6 = java.lang.Double.valueOf(r7)
            goto L232
        L214:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r4.isAssignableFrom(r7)
            if (r7 == 0) goto L227
            java.lang.String r7 = r8.toString()
            java.lang.Double r6 = java.lang.Double.valueOf(r7)
            goto L232
        L227:
            java.lang.Class r7 = r8.getClass()
            java.lang.String r8 = r2.getName()
            xhss.C0532.m960(r7, r8)
        L232:
            return r6
        L233:
            if (r8 != 0) goto L236
            goto L285
        L236:
            java.lang.Class r7 = r8.getClass()
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            boolean r7 = r0.isAssignableFrom(r7)
            if (r7 == 0) goto L246
            r6 = r8
            java.util.Date r6 = (java.util.Date) r6
            goto L285
        L246:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r5.isAssignableFrom(r7)
            if (r7 == 0) goto L25c
            java.util.Date r6 = new java.util.Date
            java.lang.Long r8 = (java.lang.Long) r8
            long r7 = r8.longValue()
            r6.<init>(r7)
            goto L285
        L25c:
            java.lang.Class r7 = r8.getClass()
            boolean r7 = r4.isAssignableFrom(r7)
            if (r7 == 0) goto L27a
            java.text.DateFormat r7 = java.text.DateFormat.getInstance()     // Catch: java.text.ParseException -> L273
            java.lang.String r8 = r8.toString()     // Catch: java.text.ParseException -> L273
            java.util.Date r6 = r7.parse(r8)     // Catch: java.text.ParseException -> L273
            goto L285
        L273:
            r7 = move-exception
            xhss.ᛷᛴᛵᛴ r8 = new xhss.ᛷᛴᛵᛴ
            r8.<init>(r7)
            throw r8
        L27a:
            java.lang.Class r7 = r8.getClass()
            java.lang.String r8 = r0.getName()
            xhss.C0532.m960(r7, r8)
        L285:
            return r6
        L286:
            if (r8 != 0) goto L289
            goto L2a4
        L289:
            java.lang.Class r7 = r8.getClass()
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r7 = r0.isAssignableFrom(r7)
            if (r7 == 0) goto L299
            r6 = r8
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            goto L2a4
        L299:
            java.lang.Class r7 = r8.getClass()
            java.lang.String r8 = r0.getName()
            xhss.C0532.m960(r7, r8)
        L2a4:
            return r6
        L2a5:
            if (r8 != 0) goto L2a8
            goto L2b1
        L2a8:
            java.math.BigInteger r6 = new java.math.BigInteger
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
        L2b1:
            return r6
        L2b2:
            if (r8 != 0) goto L2b5
            goto L2be
        L2b5:
            java.math.BigDecimal r6 = new java.math.BigDecimal
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
        L2be:
            return r6
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public java.lang.Object mo838() {
            r1 = this;
            int r0 = r1.f2542
            switch(r0) {
                case 0: goto L10;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = super.mo838()
            return r1
        La:
            xhss.ᛸᛱᲈᛵ r1 = new xhss.ᛸᛱᲈᛵ
            r1.<init>()
            return r1
        L10:
            xhss.ᛸᛱᲈᛵ r1 = new xhss.ᛸᛱᲈᛵ
            r1.<init>()
            return r1
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public void mo839(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            int r0 = r1.f2542
            switch(r0) {
                case 0: goto Lf;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.mo839(r2, r3, r4)
            return
        L9:
            java.util.Map r2 = (java.util.Map) r2
            r2.put(r3, r4)
            return
        Lf:
            xhss.ᛸᛲᛷᲇ r2 = (xhss.C0735) r2
            r2.put(r3, r4)
            return
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public void mo840(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f2542
            switch(r0) {
                case 0: goto Lf;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.mo840(r2, r3)
            return
        L9:
            xhss.ᛸᛱᲈᛵ r2 = (xhss.C0731) r2
            r2.add(r3)
            return
        Lf:
            xhss.ᛸᛱᲈᛵ r2 = (xhss.C0731) r2
            r2.add(r3)
            return
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public xhss.AbstractC0463 mo841(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f2542
            switch(r0) {
                case 0: goto L11;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            xhss.ᛵᛳᲈᛶ r1 = super.mo841(r2)
            return r1
        La:
            xhss.ᛷᛱᛳᲁ r1 = r1.f1675
            java.lang.Object r1 = r1.f2152
            xhss.ᛸᛵᛷᲁ r1 = (xhss.C0768) r1
            return r1
        L11:
            xhss.ᛷᛱᛳᲁ r1 = r1.f1675
            java.lang.Object r1 = r1.f2153
            xhss.ᛸᛵᛷᲁ r1 = (xhss.C0768) r1
            return r1
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public java.lang.Object mo842() {
            r1 = this;
            int r0 = r1.f2542
            switch(r0) {
                case 0: goto L10;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = super.mo842()
            return r1
        La:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            return r1
        L10:
            xhss.ᛸᛲᛷᲇ r1 = new xhss.ᛸᛲᛷᲇ
            r1.<init>()
            return r1
    }

    @Override // xhss.AbstractC0463
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public xhss.AbstractC0463 mo843(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f2542
            switch(r0) {
                case 0: goto L11;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            xhss.ᛵᛳᲈᛶ r1 = super.mo843(r2)
            return r1
        La:
            xhss.ᛷᛱᛳᲁ r1 = r1.f1675
            java.lang.Object r1 = r1.f2152
            xhss.ᛸᛵᛷᲁ r1 = (xhss.C0768) r1
            return r1
        L11:
            xhss.ᛷᛱᛳᲁ r1 = r1.f1675
            java.lang.Object r1 = r1.f2153
            xhss.ᛸᛵᛷᲁ r1 = (xhss.C0768) r1
            return r1
    }
}
