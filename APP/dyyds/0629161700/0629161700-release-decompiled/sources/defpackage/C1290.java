package defpackage;

/* JADX INFO: renamed from: ᛷᛶᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1290 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5729;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5730;

    public /* synthetic */ C1290(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f5730 = r1
            r0.f5729 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f5730
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.Object r10 = r10.f5729
            switch(r0) {
                case 0: goto L244;
                case 1: goto L15f;
                default: goto La;
            }
        La:
            ᛱᛵᛴᛲ r10 = (defpackage.C0089) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            ᛱᲁᛳᲀ r12 = (defpackage.C0179) r12
            r0 = -138491505057326(0xffff820aef0961d2, double:NaN)
            java.io.File r0 = new java.io.File
            java.lang.String r12 = r12.f1215
            r0.<init>(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r1 = -137946044210734(0xffff8289ef0961d2, double:NaN)
            java.lang.String r1 = "尝试播放历史音频: "
            r12.<init>(r1)
            java.lang.String r1 = r0.getAbsolutePath()
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            defpackage.AbstractC1592.m2872(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r1 = -137993288850990(0xffff827eef0961d2, double:NaN)
            java.lang.String r1 = "文件是否存在: "
            r12.<init>(r1)
            boolean r1 = r0.exists()
            r12.append(r1)
            r1 = -138031943556654(0xffff8275ef0961d2, double:NaN)
            java.lang.String r1 = ", 文件大小: "
            r12.append(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L6b
            long r1 = r0.length()
            goto L6d
        L6b:
            r1 = 0
        L6d:
            r12.append(r1)
            r1 = -138070598262318(0xffff826cef0961d2, double:NaN)
            java.lang.String r1 = " bytes"
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            defpackage.AbstractC1592.m2872(r12)
            boolean r12 = r0.exists()
            if (r12 != 0) goto Ld0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = -138100663033390(0xffff8265ef0961d2, double:NaN)
            java.lang.String r11 = "音频文件不存在: "
            r10.<init>(r11)
            java.lang.String r11 = r0.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            defpackage.AbstractC0209.m764(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r11 = -138143612706350(0xffff825bef0961d2, double:NaN)
            java.lang.String r11 = "音频文件不存在: "
            r10.<init>(r11)
            java.lang.String r11 = r0.getAbsolutePath()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r11 = -515022697963054(0xfffe2b96ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r11 = defpackage.C0346.f1773
            r11.getClass()
            defpackage.C0346.m1040(r10)
            goto L15c
        Ld0:
            int r12 = r10.f848
            if (r12 != r11) goto Lee
            java.lang.Object r12 = r10.f850
            android.media.MediaPlayer r12 = (android.media.MediaPlayer) r12
            if (r12 == 0) goto Lee
            boolean r12 = r12.isPlaying()
            if (r12 != r3) goto Lee
            r10.m565()
            java.lang.Object r10 = r10.f842
            ᛱᲁᛲᛸ r10 = (defpackage.C0177) r10
            if (r10 == 0) goto L15c
            r11 = -1
            r10.m710(r11)
            goto L15c
        Lee:
            r10.m565()
            defpackage.AbstractC1171.m2257()
            android.media.MediaPlayer r12 = new android.media.MediaPlayer     // Catch: java.lang.Exception -> L11d
            r12.<init>()     // Catch: java.lang.Exception -> L11d
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L11d
            r12.setDataSource(r0)     // Catch: java.lang.Exception -> L11d
            r12.prepare()     // Catch: java.lang.Exception -> L11d
            r12.start()     // Catch: java.lang.Exception -> L11d
            ᲈᲁᛲᛱ r0 = new ᲈᲁᛲᛱ     // Catch: java.lang.Exception -> L11d
            r1 = 2
            r0.<init>(r1, r10)     // Catch: java.lang.Exception -> L11d
            r12.setOnCompletionListener(r0)     // Catch: java.lang.Exception -> L11d
            r10.f850 = r12     // Catch: java.lang.Exception -> L11d
            r10.f848 = r11     // Catch: java.lang.Exception -> L11d
            java.lang.Object r10 = r10.f842     // Catch: java.lang.Exception -> L11d
            ᛱᲁᛲᛸ r10 = (defpackage.C0177) r10     // Catch: java.lang.Exception -> L11d
            if (r10 == 0) goto L15c
            r10.m710(r11)     // Catch: java.lang.Exception -> L11d
            goto L15c
        L11d:
            r0 = move-exception
            r10 = r0
            r11 = -138186562379310(0xffff8251ef0961d2, double:NaN)
            java.lang.String r11 = "播放失败"
            r0 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r0 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r12 = defpackage.C0346.f1773
            r12.getClass()
            defpackage.C0346.m1038(r11, r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r0 = -138208037215790(0xffff824cef0961d2, double:NaN)
            java.lang.String r12 = "播放失败: "
            r11.<init>(r12)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            defpackage.AbstractC0209.m764(r10)
        L15c:
            ᲁᲀᛱᲁ r10 = defpackage.C1907.f8270
            return r10
        L15f:
            java.util.List r10 = (java.util.List) r10
            r6 = r11
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            int r12 = r10.size()
            if (r12 != r3) goto L1a2
            int r12 = r10.size()
            if (r12 == 0) goto L19a
            if (r12 != r3) goto L193
            java.lang.Object r10 = r10.get(r1)
            java.lang.String r10 = (java.lang.String) r10
            r12 = 4
            int r11 = defpackage.AbstractC1347.m2517(r6, r10, r11, r1, r12)
            if (r11 >= 0) goto L188
        L185:
            r12 = r2
            goto L22a
        L188:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            kotlin.Pair r12 = new kotlin.Pair
            r12.<init>(r11, r10)
            goto L22a
        L193:
            java.lang.String r10 = "List has more than one element."
            defpackage.C2264.m3684(r10)
            goto L243
        L19a:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r11 = "List is empty."
            r10.<init>(r11)
            throw r10
        L1a2:
            ᛱᛵᲇᲇ r12 = new ᛱᛵᲇᲇ
            if (r11 >= 0) goto L1a7
            r11 = r1
        L1a7:
            int r0 = r6.length()
            r12.<init>(r11, r0, r3)
            boolean r0 = r6 instanceof java.lang.String
            int r3 = r12.f9422
            int r12 = r12.f9423
            if (r0 == 0) goto L1f0
            if (r3 <= 0) goto L1ba
            if (r11 <= r12) goto L1be
        L1ba:
            if (r3 >= 0) goto L185
            if (r12 > r11) goto L185
        L1be:
            java.util.Iterator r0 = r10.iterator()
        L1c2:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1dd
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r5.length()
            boolean r5 = r5.regionMatches(r1, r7, r11, r8)
            if (r5 == 0) goto L1c2
            goto L1de
        L1dd:
            r4 = r2
        L1de:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L1ec
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            kotlin.Pair r12 = new kotlin.Pair
            r12.<init>(r10, r4)
            goto L22a
        L1ec:
            if (r11 == r12) goto L185
            int r11 = r11 + r3
            goto L1be
        L1f0:
            if (r3 <= 0) goto L1f4
            if (r11 <= r12) goto L1f8
        L1f4:
            if (r3 >= 0) goto L185
            if (r12 > r11) goto L185
        L1f8:
            r7 = r11
        L1f9:
            java.util.Iterator r11 = r10.iterator()
        L1fd:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L217
            java.lang.Object r0 = r11.next()
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            int r8 = r4.length()
            r9 = 0
            boolean r1 = defpackage.AbstractC1347.m2506(r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L1fd
            goto L218
        L217:
            r0 = r2
        L218:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L226
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            kotlin.Pair r12 = new kotlin.Pair
            r12.<init>(r10, r0)
            goto L22a
        L226:
            if (r7 == r12) goto L185
            int r7 = r7 + r3
            goto L1f9
        L22a:
            if (r12 == 0) goto L243
            java.lang.Object r10 = r12.getFirst()
            java.lang.Object r11 = r12.getSecond()
            java.lang.String r11 = (java.lang.String) r11
            int r11 = r11.length()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r10, r11)
        L243:
            return r2
        L244:
            char[] r10 = (char[]) r10
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            int r10 = defpackage.AbstractC1347.m2505(r11, r10, r12, r1)
            if (r10 >= 0) goto L255
            goto L262
        L255:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r10, r11)
        L262:
            return r2
    }
}
