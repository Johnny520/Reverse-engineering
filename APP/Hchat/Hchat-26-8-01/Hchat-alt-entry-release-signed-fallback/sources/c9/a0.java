package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1094h;

    public /* synthetic */ a0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f1093g = r2
            r0.f1094h = r1
            r0.<init>()
            return
    }

    public a0(java.util.Comparator r2) {
            r1 = this;
            r0 = 8
            r1.f1093g = r0
            r1.<init>()
            r1.f1094h = r2
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f1093g
            switch(r0) {
                case 0: goto L459;
                case 1: goto L439;
                case 2: goto L419;
                case 3: goto L3ef;
                case 4: goto L3c3;
                case 5: goto L38b;
                case 6: goto L363;
                case 7: goto L333;
                case 8: goto L319;
                case 9: goto L2f9;
                case 10: goto L2c7;
                case 11: goto L2ab;
                case 12: goto L28b;
                case 13: goto L26b;
                case 14: goto L240;
                case 15: goto L223;
                case 16: goto L203;
                case 17: goto L1e3;
                case 18: goto L1be;
                case 19: goto L19e;
                case 20: goto L17d;
                case 21: goto L158;
                case 22: goto L138;
                case 23: goto L118;
                case 24: goto Lf3;
                case 25: goto Lce;
                case 26: goto La2;
                case 27: goto L82;
                case 28: goto L2e;
                default: goto L5;
            }
        L5:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r5.f1094h
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            boolean r7 = r1.contains(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r6 = r0.contains(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            int r6 = r7.compareTo(r6)
            return r6
        L2e:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r5.f1094h
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r6 == 0) goto L56
            java.util.Collection r6 = r6.values()
            if (r6 == 0) goto L56
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Comparable r6 = tf.m.D1(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L56
            long r3 = r6.longValue()
            goto L57
        L56:
            r3 = r1
        L57:
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.get(r7)
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L79
            java.util.Collection r7 = r7.values()
            if (r7 == 0) goto L79
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Comparable r7 = tf.m.D1(r7)
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L79
            long r1 = r7.longValue()
        L79:
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            int r6 = r6.compareTo(r7)
            return r6
        L82:
            java.lang.Object r0 = r5.f1094h
            c9.a0 r0 = (c9.a0) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L8d
            goto La1
        L8d:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Comparable r6 = (java.lang.Comparable) r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            int r0 = a7.a.m(r6, r7)
        La1:
            return r0
        La2:
            java.lang.Object r0 = r5.f1094h
            r4.m r0 = (r4.m) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto Lad
            goto Lcd
        Lad:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            r8.d r6 = (r8.d) r6
            int r6 = r6.f11609c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getValue()
            r8.d r7 = (r8.d) r7
            int r7 = r7.f11609c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r0 = r6.compareTo(r7)
        Lcd:
            return r0
        Lce:
            qd.j r6 = (qd.j) r6
            qd.j r7 = (qd.j) r7
            java.lang.Object r0 = r5.f1094h
            qe.k r0 = (qe.k) r0
            qe.l r6 = r0.d(r6, r7)
            int r6 = r6.ordinal()
            r7 = 1
            if (r6 == r7) goto Lf2
            r0 = 2
            if (r6 == r0) goto Lf2
            r7 = 3
            if (r6 == r7) goto Lf1
            r7 = 4
            if (r6 == r7) goto Lf1
            r7 = 5
            if (r6 == r7) goto Lef
            r7 = 0
            goto Lf2
        Lef:
            r7 = -2
            goto Lf2
        Lf1:
            r7 = -1
        Lf2:
            return r7
        Lf3:
            java.lang.Object r0 = r5.f1094h
            c9.a0 r0 = (c9.a0) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto Lfe
            goto L117
        Lfe:
            qb.g r6 = (qb.g) r6
            java.lang.String r6 = r6.f10820b
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = j8.b.l(r0, r6, r0)
            qb.g r7 = (qb.g) r7
            java.lang.String r7 = r7.f10820b
            java.lang.String r7 = r7.toLowerCase(r0)
            r7.getClass()
            int r0 = r6.compareTo(r7)
        L117:
            return r0
        L118:
            java.lang.Object r0 = r5.f1094h
            c9.z r0 = (c9.z) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L123
            goto L137
        L123:
            qb.g r6 = (qb.g) r6
            boolean r6 = r6.f10821c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            qb.g r7 = (qb.g) r7
            boolean r7 = r7.f10821c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r0 = r6.compareTo(r7)
        L137:
            return r0
        L138:
            java.lang.Object r0 = r5.f1094h
            a9.h r0 = (a9.h) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L143
            goto L157
        L143:
            p8.i r6 = (p8.i) r6
            int r6 = r6.f10372b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            p8.i r7 = (p8.i) r7
            int r7 = r7.f10372b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r0 = r6.compareTo(r7)
        L157:
            return r0
        L158:
            java.lang.Object r0 = r5.f1094h
            c9.z r0 = (c9.z) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L163
            goto L17c
        L163:
            wb.jv r6 = (wb.jv) r6
            java.lang.String r6 = r6.f17141b
            java.util.Locale r0 = java.util.Locale.CHINA
            java.lang.String r6 = j8.b.l(r0, r6, r0)
            wb.jv r7 = (wb.jv) r7
            java.lang.String r7 = r7.f17141b
            java.lang.String r7 = r7.toLowerCase(r0)
            r7.getClass()
            int r0 = r6.compareTo(r7)
        L17c:
            return r0
        L17d:
            wb.jv r7 = (wb.jv) r7
            java.lang.Object r0 = r5.f1094h
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.lang.String r7 = r7.f17140a
            boolean r7 = r0.contains(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            wb.jv r6 = (wb.jv) r6
            java.lang.String r6 = r6.f17140a
            boolean r6 = r0.contains(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            int r6 = r7.compareTo(r6)
            return r6
        L19e:
            java.lang.Object r0 = r5.f1094h
            a9.h r0 = (a9.h) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L1a9
            goto L1bd
        L1a9:
            hb.t r6 = (hb.t) r6
            long r0 = r6.f5464a
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            hb.t r7 = (hb.t) r7
            long r0 = r7.f5464a
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            int r0 = r6.compareTo(r7)
        L1bd:
            return r0
        L1be:
            java.lang.Object r0 = r5.f1094h
            c9.a0 r0 = (c9.a0) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L1c9
            goto L1e2
        L1c9:
            wb.jv r6 = (wb.jv) r6
            java.lang.String r6 = r6.f17141b
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = j8.b.l(r0, r6, r0)
            wb.jv r7 = (wb.jv) r7
            java.lang.String r7 = r7.f17141b
            java.lang.String r7 = r7.toLowerCase(r0)
            r7.getClass()
            int r0 = r6.compareTo(r7)
        L1e2:
            return r0
        L1e3:
            java.lang.Object r0 = r5.f1094h
            c9.a0 r0 = (c9.a0) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L1ee
            goto L202
        L1ee:
            wb.jv r6 = (wb.jv) r6
            boolean r6 = r6.f17146g
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            wb.jv r7 = (wb.jv) r7
            boolean r7 = r7.f17146g
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r0 = r6.compareTo(r7)
        L202:
            return r0
        L203:
            java.lang.Object r0 = r5.f1094h
            c9.z r0 = (c9.z) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L20e
            goto L222
        L20e:
            wb.jv r6 = (wb.jv) r6
            boolean r6 = r6.f17142c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            wb.jv r7 = (wb.jv) r7
            boolean r7 = r7.f17142c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r0 = r6.compareTo(r7)
        L222:
            return r0
        L223:
            android.text.style.URLSpan r6 = (android.text.style.URLSpan) r6
            java.lang.Object r0 = r5.f1094h
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r6 = r0.getSpanStart(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.text.style.URLSpan r7 = (android.text.style.URLSpan) r7
            int r7 = r0.getSpanStart(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r6 = r6.compareTo(r7)
            return r6
        L240:
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6
            java.lang.Object r0 = r5.f1094h
            fb.l1 r0 = (fb.l1) r0
            java.lang.String r6 = r6.getName()
            r6.getClass()
            int r6 = fb.l1.a(r0, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.zip.ZipEntry r7 = (java.util.zip.ZipEntry) r7
            java.lang.String r7 = r7.getName()
            r7.getClass()
            int r7 = fb.l1.a(r0, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r6 = r6.compareTo(r7)
            return r6
        L26b:
            java.lang.Object r0 = r5.f1094h
            c9.a0 r0 = (c9.a0) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L276
            goto L28a
        L276:
            fb.d1 r7 = (fb.d1) r7
            long r0 = r7.f3486d
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            fb.d1 r6 = (fb.d1) r6
            long r0 = r6.f3486d
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            int r0 = r7.compareTo(r6)
        L28a:
            return r0
        L28b:
            java.lang.Object r0 = r5.f1094h
            fb.r r0 = (fb.r) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L296
            goto L2aa
        L296:
            fb.d1 r7 = (fb.d1) r7
            long r0 = r7.f3496n
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            fb.d1 r6 = (fb.d1) r6
            long r0 = r6.f3496n
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            int r0 = r7.compareTo(r6)
        L2aa:
            return r0
        L2ab:
            java.lang.Object r0 = r5.f1094h
            fb.r r0 = (fb.r) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L2b6
            goto L2c6
        L2b6:
            fb.p0 r6 = (fb.p0) r6
            fb.r0 r6 = r6.f3697a
            java.lang.String r6 = r6.f3744a
            fb.p0 r7 = (fb.p0) r7
            fb.r0 r7 = r7.f3697a
            java.lang.String r7 = r7.f3744a
            int r0 = r6.compareTo(r7)
        L2c6:
            return r0
        L2c7:
            java.lang.Object r0 = r5.f1094h
            fb.r r0 = (fb.r) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L2d2
            goto L2f8
        L2d2:
            java.io.File r6 = (java.io.File) r6
            java.lang.String r6 = r6.getName()
            r6.getClass()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            r6.getClass()
            java.io.File r7 = (java.io.File) r7
            java.lang.String r7 = r7.getName()
            r7.getClass()
            java.lang.String r7 = r7.toLowerCase(r0)
            r7.getClass()
            int r0 = r6.compareTo(r7)
        L2f8:
            return r0
        L2f9:
            java.lang.Object r0 = r5.f1094h
            c9.a0 r0 = (c9.a0) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L304
            goto L318
        L304:
            f2.q r6 = (f2.q) r6
            int r6 = r6.f3215f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            f2.q r7 = (f2.q) r7
            int r7 = r7.f3215f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r0 = r6.compareTo(r7)
        L318:
            return r0
        L319:
            java.lang.Object r0 = r5.f1094h
            java.util.Comparator r0 = (java.util.Comparator) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L324
            goto L332
        L324:
            b8.c r0 = x1.f0.Z
            f2.q r6 = (f2.q) r6
            x1.f0 r6 = r6.f3212c
            f2.q r7 = (f2.q) r7
            x1.f0 r7 = r7.f3212c
            int r0 = r0.compare(r6, r7)
        L332:
            return r0
        L333:
            java.lang.Object r0 = r5.f1094h
            a9.h r0 = (a9.h) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L33e
            goto L362
        L33e:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r0 = r7.compareTo(r6)
        L362:
            return r0
        L363:
            java.lang.Object r0 = r5.f1094h
            c9.a0 r0 = (c9.a0) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L36e
            goto L38a
        L36e:
            da.f r7 = (da.f) r7
            android.widget.TextView r7 = r7.f2151b
            float r7 = r7.getTextSize()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            da.f r6 = (da.f) r6
            android.widget.TextView r6 = r6.f2151b
            float r6 = r6.getTextSize()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            int r0 = r7.compareTo(r6)
        L38a:
            return r0
        L38b:
            da.f r6 = (da.f) r6
            java.lang.Object r0 = r5.f1094h
            da.h r0 = (da.h) r0
            android.view.View r1 = r6.f2150a
            android.widget.TextView r6 = r6.f2151b
            r0.getClass()
            java.lang.String r6 = da.h.r(r1, r6)
            java.lang.String r6 = da.h.n(r6)
            int r6 = r6.length()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            da.f r7 = (da.f) r7
            android.view.View r0 = r7.f2150a
            android.widget.TextView r7 = r7.f2151b
            java.lang.String r7 = da.h.r(r0, r7)
            java.lang.String r7 = da.h.n(r7)
            int r7 = r7.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r6 = r6.compareTo(r7)
            return r6
        L3c3:
            java.lang.Object r0 = r5.f1094h
            da.g r0 = (da.g) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L3ce
            goto L3ee
        L3ce:
            da.e r7 = (da.e) r7
            da.f r7 = r7.f2147a
            android.widget.TextView r7 = r7.f2151b
            float r7 = r7.getTextSize()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            da.e r6 = (da.e) r6
            da.f r6 = r6.f2147a
            android.widget.TextView r6 = r6.f2151b
            float r6 = r6.getTextSize()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            int r0 = r7.compareTo(r6)
        L3ee:
            return r0
        L3ef:
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r5.f1094h
            a9.h r2 = (a9.h) r2
            int r2 = r2.compare(r6, r7)
            if (r2 == 0) goto L404
            goto L418
        L404:
            da.e r6 = (da.e) r6
            boolean r6 = r6.f2149c
            if (r6 == 0) goto L40c
            r6 = r1
            goto L40d
        L40c:
            r6 = r0
        L40d:
            da.e r7 = (da.e) r7
            boolean r7 = r7.f2149c
            if (r7 == 0) goto L414
            r0 = r1
        L414:
            int r2 = r6.compareTo(r0)
        L418:
            return r2
        L419:
            java.lang.Object r0 = r5.f1094h
            a9.h r0 = (a9.h) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L424
            goto L438
        L424:
            hb.t r6 = (hb.t) r6
            long r0 = r6.f5464a
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            hb.t r7 = (hb.t) r7
            long r0 = r7.f5464a
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            int r0 = r6.compareTo(r7)
        L438:
            return r0
        L439:
            java.lang.Object r0 = r5.f1094h
            c9.h1 r0 = (c9.h1) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L444
            goto L458
        L444:
            tf.w r6 = (tf.w) r6
            int r6 = r6.f13170a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            tf.w r7 = (tf.w) r7
            int r7 = r7.f13170a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            int r0 = r6.compareTo(r7)
        L458:
            return r0
        L459:
            java.lang.Object r0 = r5.f1094h
            c9.z r0 = (c9.z) r0
            int r0 = r0.compare(r6, r7)
            if (r0 == 0) goto L464
            goto L470
        L464:
            wb.jv r6 = (wb.jv) r6
            java.lang.String r6 = r6.f17141b
            wb.jv r7 = (wb.jv) r7
            java.lang.String r7 = r7.f17141b
            int r0 = a7.a.m(r6, r7)
        L470:
            return r0
    }
}
