package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲇᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0421 extends xhss.AbstractC1202 implements xhss.InterfaceC0517 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public java.io.File f1485;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f1486;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object f1487;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f1488;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final /* synthetic */ java.io.File f1489;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f1490;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public java.io.File f1491;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public java.io.File f1492;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f1493;

    public C0421(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.io.File r4, xhss.InterfaceC0038 r5) {
            r0 = this;
            r0.f1490 = r1
            r0.f1493 = r2
            r0.f1486 = r3
            r0.f1489 = r4
            r0.<init>(r5)
            return
    }

    @Override // xhss.InterfaceC0517
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.Object mo115(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            xhss.ᛲᛸᲁᲇ r1 = (xhss.InterfaceC0197) r1
            xhss.ᛱᛴᛶᛴ r2 = (xhss.InterfaceC0038) r2
            xhss.ᛱᛴᛶᛴ r0 = r0.mo117(r1, r2)
            xhss.ᛴᲇᲈᛲ r0 = (xhss.C0421) r0
            xhss.ᛵᛷᲈᛶ r1 = xhss.C0500.f1817
            java.lang.Object r0 = r0.mo116(r1)
            return r0
    }

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final java.lang.Object mo116(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.f1487
            xhss.ᛲᛸᲁᲇ r1 = (xhss.InterfaceC0197) r1
            int r2 = r0.f1488
            java.lang.String r3 = r0.f1493
            r6 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
            android.content.Context r8 = r0.f1490
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L4a
            if (r2 != r9) goto L3d
            java.io.File r1 = r0.f1491
            java.io.File r2 = r0.f1492
            java.io.File r12 = r0.f1485
            xhss.C0614.m1058(r21)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L35
            r5 = r1
            r16 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
            r1 = r21
            goto L1ff
        L2b:
            r0 = move-exception
            r5 = r1
            r16 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
        L32:
            r1 = r0
            goto L426
        L35:
            r0 = move-exception
            r16 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
            goto L3e3
        L3d:
            r0 = -130902474983493(0xffff88f1e47a77bb, double:NaN)
            java.lang.String r0 = xhss.AbstractC0775.m1313(r0)
            xhss.C0532.m950(r0)
            return r11
        L4a:
            xhss.C0614.m1058(r21)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r12 = java.lang.System.currentTimeMillis()
            r2.append(r12)
            r12 = 95
            r2.append(r12)
            long r12 = java.lang.System.nanoTime()
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.io.File r12 = new java.io.File
            java.io.File r13 = r8.getCacheDir()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r15 = -130009121785925(0xffff89c1e47a77bb, double:NaN)
            java.lang.String r15 = xhss.AbstractC0775.m1313(r15)
            r14.<init>(r15)
            r14.append(r2)
            xhss.ᛲᛳᛴᲁ r15 = xhss.AbstractC0129.f587
            r15 = -80466674026565(0xffffb6d0e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r15)
            xhss.ᛲᛳᛴᲁ r15 = xhss.AbstractC0129.f587
            java.lang.Object r15 = r15.f617
            java.util.regex.Pattern r15 = (java.util.regex.Pattern) r15
            java.util.regex.Matcher r15 = r15.matcher(r3)
            boolean r16 = r15.find(r10)
            if (r16 != 0) goto La1
            r4 = r11
            r16 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
            goto Lab
        La1:
            r16 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
            xhss.ᛷᛱᛳᲁ r4 = new xhss.ᛷᛱᛳᲁ
            r4.<init>(r15)
        Lab:
            if (r4 == 0) goto Lcc
            java.lang.Object r4 = r4.f2151
            java.util.regex.Matcher r4 = (java.util.regex.Matcher) r4
            java.lang.String r4 = r4.group()
            java.util.Locale r5 = java.util.Locale.US
            r18 = -80505328732229(0xffffb6c7e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r18)
            java.lang.String r4 = r4.toLowerCase(r5)
            r18 = -80518213634117(0xffffb6c4e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r18)
            goto Lcd
        Lcc:
            r4 = r11
        Lcd:
            if (r4 == 0) goto L16c
            int r5 = r4.hashCode()
            switch(r5) {
                case 105441: goto L152;
                case 111145: goto L138;
                case 3198679: goto L11e;
                case 3198682: goto L104;
                case 3268712: goto Lf4;
                case 3645340: goto Ld8;
                default: goto Ld6;
            }
        Ld6:
            goto L16c
        Ld8:
            r18 = -80690012325957(0xffffb69ce47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r18)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Le9
            goto L16c
        Le9:
            r4 = -80805976442949(0xffffb681e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            goto L175
        Lf4:
            r18 = -80647062652997(0xffffb6a6e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r18)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L162
            goto L16c
        L104:
            r18 = -80668537489477(0xffffb6a1e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r18)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L114
            goto L16c
        L114:
            r4 = -80711487162437(0xffffb697e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            goto L175
        L11e:
            r18 = -80608407947333(0xffffb6afe47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r18)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L12e
            goto L16c
        L12e:
            r4 = -80737256966213(0xffffb691e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            goto L175
        L138:
            r18 = -80629882783813(0xffffb6aae47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r18)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L148
            goto L16c
        L148:
            r4 = -80784501606469(0xffffb686e47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            goto L175
        L152:
            r18 = -80591228078149(0xffffb6b3e47a77bb, double:NaN)
            java.lang.String r5 = xhss.AbstractC0775.m1313(r18)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L162
            goto L16c
        L162:
            r4 = -80763026769989(0xffffb68be47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
            goto L175
        L16c:
            r4 = -80831746246725(0xffffb67be47a77bb, double:NaN)
            java.lang.String r4 = xhss.AbstractC0775.m1313(r4)
        L175:
            r14.append(r4)
            java.lang.String r4 = r14.toString()
            r12.<init>(r13, r4)
            java.io.File r4 = new java.io.File
            java.io.File r5 = r8.getCacheDir()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = -130107906033733(0xffff89aae47a77bb, double:NaN)
            java.lang.String r14 = xhss.AbstractC0775.m1313(r14)
            r13.<init>(r14)
            r13.append(r2)
            r14 = -130176625510469(0xffff899ae47a77bb, double:NaN)
            java.lang.String r14 = xhss.AbstractC0775.m1313(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r4.<init>(r5, r13)
            java.io.File r5 = new java.io.File
            java.io.File r13 = r8.getCacheDir()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r18 = -130198100346949(0xffff8995e47a77bb, double:NaN)
            java.lang.String r15 = xhss.AbstractC0775.m1313(r18)
            r14.<init>(r15)
            r14.append(r2)
            r18 = -130266819823685(0xffff8985e47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r18)
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            r5.<init>(r13, r2)
            xhss.ᲇᛳᲇᛶ r2 = new xhss.ᲇᛳᲇᛶ     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            r2.<init>(r3, r12, r11, r10)     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            xhss.ᛲᛳᛲᛷ r2 = xhss.AbstractC0775.m1310(r1, r2)     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            xhss.ᲇᛳᲇᛶ r13 = new xhss.ᲇᛳᲇᛶ     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            java.lang.String r14 = r0.f1486     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            r13.<init>(r14, r5, r11, r9)     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            xhss.ᛲᛳᛲᛷ r1 = xhss.AbstractC0775.m1310(r1, r13)     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            xhss.ᛲᛳᛲᛷ[] r1 = new xhss.C0141[]{r2, r1}     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            r0.f1487 = r11     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            r0.f1485 = r12     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            r0.f1492 = r4     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            r0.f1491 = r5     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            r0.f1488 = r9     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            java.lang.Object r1 = xhss.AbstractC0007.m94(r1, r0)     // Catch: java.lang.Throwable -> L3db java.lang.Exception -> L3df
            xhss.ᛸᛴᛸᲈ r2 = xhss.EnumC0757.f2533
            if (r1 != r2) goto L1fe
            return r2
        L1fe:
            r2 = r4
        L1ff:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.Object r4 = r1.get(r10)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            xhss.ᛷᛸᲈᛸ r4 = (xhss.C0697) r4     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            xhss.ᛷᛸᲈᛸ r1 = (xhss.C0697) r1     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.Object r13 = r4.f2354     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.Object r14 = r1.f2354     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.Object r4 = r4.f2352     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r4 == 0) goto L3c7
            java.lang.Object r1 = r1.f2352     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r1 == 0) goto L3c7
            if (r13 == 0) goto L3c7
            boolean r1 = xhss.AbstractC0120.m342(r13)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r1 == 0) goto L233
            goto L3c7
        L233:
            if (r14 == 0) goto L3c7
            boolean r1 = xhss.AbstractC0120.m342(r14)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r1 == 0) goto L23d
            goto L3c7
        L23d:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.io.File r1 = xhss.C0263.m579(r1, r2)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r1 != 0) goto L27a
            java.io.File r1 = xhss.C0263.m577(r3, r2)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r1 != 0) goto L27a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            r5.delete()     // Catch: java.lang.Exception -> L25a
            r2.delete()     // Catch: java.lang.Exception -> L25a
            r12.delete()     // Catch: java.lang.Exception -> L25a
            return r1
        L25a:
            r0 = move-exception
            r2 = -130326949365829(0xffff8977e47a77bb, double:NaN)
        L260:
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            xhss.AbstractC0775.m1313(r6)
            xhss.AbstractC0775.m1313(r16)
            xhss.ᲇᲁᛱᛸ r3 = xhss.C1085.f3497
            r3.getClass()
            xhss.C1085.m1764(r2, r0)
            return r1
        L273:
            r0 = move-exception
            goto L32
        L276:
            r0 = move-exception
        L277:
            r1 = r5
            goto L3e3
        L27a:
            boolean r3 = r8 instanceof android.view.ContextThemeWrapper     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r3 == 0) goto L282
            r3 = r8
            android.view.ContextThemeWrapper r3 = (android.view.ContextThemeWrapper) r3     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            goto L283
        L282:
            r3 = r11
        L283:
            if (r3 == 0) goto L28b
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r3 != 0) goto L28f
        L28b:
            android.content.Context r3 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
        L28f:
            java.lang.reflect.Method r4 = xhss.C0614.f2118     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r4 == 0) goto L2a0
            java.lang.String r13 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r13}     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.lang.Object r3 = r4.invoke(r11, r3)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            goto L2a1
        L2a0:
            r3 = r11
        L2a1:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.io.File r13 = new java.io.File     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            java.io.File r0 = r0.f1489     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            if (r3 == 0) goto L30c
            int r13 = xhss.AbstractC1080.f3479     // Catch: java.lang.Throwable -> L30a
            xhss.ᲇᛵᛲᲁ r3 = xhss.C0915.m1509(r3)     // Catch: java.lang.Throwable -> L30a
            java.lang.Object r13 = r3.f3349     // Catch: java.lang.Throwable -> L30a
            xhss.ᛸᛵᲇᲈ r13 = (xhss.C0772) r13     // Catch: java.lang.Throwable -> L30a
            r14 = 2
            r13.f2551 = r14     // Catch: java.lang.Throwable -> L30a
            xhss.ᛷᛴᲀᛳ r3 = r3.m1687()     // Catch: java.lang.Throwable -> L30a
            r13 = -130365604071493(0xffff896ee47a77bb, double:NaN)
            java.lang.String r13 = xhss.AbstractC0775.m1313(r13)     // Catch: java.lang.Throwable -> L30a
            r3.f1795 = r13     // Catch: java.lang.Throwable -> L30a
            java.util.List r3 = r3.m1144()     // Catch: java.lang.Throwable -> L30a
            java.lang.Object r3 = xhss.AbstractC0713.m1240(r3)     // Catch: java.lang.Throwable -> L30a
            xhss.ᛲᲀᛱ r3 = (xhss.C0200) r3     // Catch: java.lang.Throwable -> L30a
            if (r3 == 0) goto L30c
            r13 = -130421438646341(0xffff8961e47a77bb, double:NaN)
            java.lang.String r11 = xhss.AbstractC0775.m1313(r13)     // Catch: java.lang.Throwable -> L30a
            java.lang.Long r13 = new java.lang.Long     // Catch: java.lang.Throwable -> L30a
            r14 = 0
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L30a
            r14 = -130464388319301(0xffff8957e47a77bb, double:NaN)
            java.lang.String r14 = xhss.AbstractC0775.m1313(r14)     // Catch: java.lang.Throwable -> L30a
            java.lang.Boolean r15 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L30a
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r11, r13, r14, r15}     // Catch: java.lang.Throwable -> L30a
            r3.m1024()     // Catch: java.lang.Throwable -> L30a
            java.lang.reflect.Method r13 = r3.f761     // Catch: java.lang.Throwable -> L30a
            java.lang.Object r3 = r3.f2045     // Catch: java.lang.Throwable -> L30a
            r14 = 5
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r14)     // Catch: java.lang.Throwable -> L30a
            java.lang.Object r11 = r13.invoke(r3, r11)     // Catch: java.lang.Throwable -> L30a
            goto L30c
        L307:
            r1 = r0
            goto L3c1
        L30a:
            r0 = move-exception
            goto L307
        L30c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30a
            r3.<init>()     // Catch: java.lang.Throwable -> L30a
            r13 = -130481568188485(0xffff8953e47a77bb, double:NaN)
            java.lang.String r13 = xhss.AbstractC0775.m1313(r13)     // Catch: java.lang.Throwable -> L30a
            r3.append(r13)     // Catch: java.lang.Throwable -> L30a
            r3.append(r11)     // Catch: java.lang.Throwable -> L30a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L30a
            r13 = -278176903563333(0xffff02ffe47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r13)     // Catch: java.lang.Throwable -> L30a
            r13 = -278078119315525(0xffff0316e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r13)     // Catch: java.lang.Throwable -> L30a
            int r13 = r3.length()     // Catch: java.lang.Throwable -> L30a
            if (r13 != 0) goto L33b
            goto L35d
        L33b:
            int r13 = r3.length()     // Catch: java.lang.Throwable -> L30a
            r14 = r10
        L340:
            if (r14 >= r13) goto L35d
            int r15 = r14 + 2000
            if (r15 <= r13) goto L347
            r15 = r13
        L347:
            java.lang.String r14 = r3.substring(r14, r15)     // Catch: java.lang.Throwable -> L30a
            r18 = -278112479053893(0xffff030ee47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r18)     // Catch: java.lang.Throwable -> L30a
            xhss.ᲇᲁᛱᛸ r18 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> L30a
            r18.getClass()     // Catch: java.lang.Throwable -> L30a
            xhss.C1085.m1750(r14)     // Catch: java.lang.Throwable -> L30a
            r14 = r15
            goto L340
        L35d:
            java.lang.Integer r3 = new java.lang.Integer     // Catch: java.lang.Throwable -> L30a
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L30a
            boolean r3 = xhss.AbstractC0007.m97(r11, r3)     // Catch: java.lang.Throwable -> L30a
            if (r3 == 0) goto L399
            java.io.File r3 = r0.getParentFile()     // Catch: java.lang.Throwable -> L30a
            if (r3 == 0) goto L371
            r3.mkdirs()     // Catch: java.lang.Throwable -> L30a
        L371:
            xhss.ᲇᲁᛱᛸ r3 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> L30a
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L30a
            r13 = -130515927926853(0xffff894be47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r13)     // Catch: java.lang.Throwable -> L30a
            java.lang.String r11 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L30a
            r13 = -130606122240069(0xffff8936e47a77bb, double:NaN)
            xhss.AbstractC0775.m1313(r13)     // Catch: java.lang.Throwable -> L30a
            r3.getClass()     // Catch: java.lang.Throwable -> L30a
            xhss.C1085.m1754(r1, r11)     // Catch: java.lang.Throwable -> L30a
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L30a
            xhss.C1085.m1748(r8, r0)     // Catch: java.lang.Throwable -> L30a
            goto L39a
        L399:
            r9 = r10
        L39a:
            r4.close()     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            r5.delete()     // Catch: java.lang.Exception -> L3a7
            r2.delete()     // Catch: java.lang.Exception -> L3a7
            r12.delete()     // Catch: java.lang.Exception -> L3a7
            goto L3bf
        L3a7:
            r0 = move-exception
            r1 = -130696316553285(0xffff8921e47a77bb, double:NaN)
            java.lang.String r1 = xhss.AbstractC0775.m1313(r1)
            xhss.AbstractC0775.m1313(r6)
            xhss.AbstractC0775.m1313(r16)
            xhss.ᲇᲁᛱᛸ r2 = xhss.C1085.f3497
            r2.getClass()
            xhss.C1085.m1764(r1, r0)
        L3bf:
            r10 = r9
            goto L41c
        L3c1:
            throw r1     // Catch: java.lang.Throwable -> L3c2
        L3c2:
            r0 = move-exception
            xhss.AbstractC0561.m1003(r4, r1)     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            throw r0     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
        L3c7:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L273 java.lang.Exception -> L276
            r5.delete()     // Catch: java.lang.Exception -> L3d3
            r2.delete()     // Catch: java.lang.Exception -> L3d3
            r12.delete()     // Catch: java.lang.Exception -> L3d3
            return r1
        L3d3:
            r0 = move-exception
            r2 = -130288294660165(0xffff8980e47a77bb, double:NaN)
            goto L260
        L3db:
            r0 = move-exception
            r1 = r0
            r2 = r4
            goto L426
        L3df:
            r0 = move-exception
            r2 = r4
            goto L277
        L3e3:
            r3 = -130734971258949(0xffff8918e47a77bb, double:NaN)
            java.lang.String r3 = xhss.AbstractC0775.m1313(r3)     // Catch: java.lang.Throwable -> L424
            xhss.AbstractC0775.m1313(r6)     // Catch: java.lang.Throwable -> L424
            xhss.AbstractC0775.m1313(r16)     // Catch: java.lang.Throwable -> L424
            xhss.ᲇᲁᛱᛸ r4 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> L424
            r4.getClass()     // Catch: java.lang.Throwable -> L424
            xhss.C1085.m1764(r3, r0)     // Catch: java.lang.Throwable -> L424
            r1.delete()     // Catch: java.lang.Exception -> L404
            r2.delete()     // Catch: java.lang.Exception -> L404
            r12.delete()     // Catch: java.lang.Exception -> L404
            goto L41c
        L404:
            r0 = move-exception
            r1 = -130825165572165(0xffff8903e47a77bb, double:NaN)
            java.lang.String r1 = xhss.AbstractC0775.m1313(r1)
            xhss.AbstractC0775.m1313(r6)
            xhss.AbstractC0775.m1313(r16)
            xhss.ᲇᲁᛱᛸ r2 = xhss.C1085.f3497
            r2.getClass()
            xhss.C1085.m1764(r1, r0)
        L41c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L421:
            r5 = r1
            goto L32
        L424:
            r0 = move-exception
            goto L421
        L426:
            r5.delete()     // Catch: java.lang.Exception -> L430
            r2.delete()     // Catch: java.lang.Exception -> L430
            r12.delete()     // Catch: java.lang.Exception -> L430
            goto L448
        L430:
            r0 = move-exception
            r2 = -130863820277829(0xffff88fae47a77bb, double:NaN)
            java.lang.String r2 = xhss.AbstractC0775.m1313(r2)
            xhss.AbstractC0775.m1313(r6)
            xhss.AbstractC0775.m1313(r16)
            xhss.ᲇᲁᛱᛸ r3 = xhss.C1085.f3497
            r3.getClass()
            xhss.C1085.m1764(r2, r0)
        L448:
            throw r1
    }

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.InterfaceC0038 mo117(java.lang.Object r7, xhss.InterfaceC0038 r8) {
            r6 = this;
            xhss.ᛴᲇᲈᛲ r0 = new xhss.ᛴᲇᲈᛲ
            java.lang.String r3 = r6.f1486
            java.io.File r4 = r6.f1489
            android.content.Context r1 = r6.f1490
            java.lang.String r2 = r6.f1493
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f1487 = r7
            return r0
    }
}
