package defpackage;

/* JADX INFO: renamed from: ᛷᛷᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1313 extends defpackage.AbstractC1350 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f5805;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1630 f5806;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5807;

    public /* synthetic */ C1313(defpackage.C1630 r1, defpackage.InterfaceC0140 r2, int r3) {
            r0 = this;
            r0.f5807 = r3
            r0.f5806 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f5807
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛷᲈᛳᛳ r3 = (defpackage.InterfaceC1399) r3
            ᛱᛸᛲᲀ r4 = (defpackage.InterfaceC0140) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛷᛷᛶᛲ r2 = (defpackage.C1313) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
        L16:
            ᛱᛸᛲᲀ r2 = r2.mo389(r4, r3)
            ᛷᛷᛶᛲ r2 = (defpackage.C1313) r2
            java.lang.Object r2 = r2.mo390(r1)
            return r2
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final defpackage.InterfaceC0140 mo389(defpackage.InterfaceC0140 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.f5807
            ᲀᛲᛶᲈ r1 = r1.f5806
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            ᛷᛷᛶᛲ r3 = new ᛷᛷᛶᛲ
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            ᛷᛷᛶᛲ r3 = new ᛷᛷᛶᛲ
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.AbstractC0668
    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public final java.lang.Object mo390(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f5807
            ᲁᲀᛱᲁ r1 = defpackage.C1907.f8270
            ᛴᛵ r2 = defpackage.EnumC0670.f3246
            ᲀᛲᛶᲈ r3 = r10.f5806
            r4 = 1
            r5 = 0
            r6 = 0
            switch(r0) {
                case 0: goto Lb0;
                default: goto Le;
            }
        Le:
            int r0 = r10.f5805
            if (r0 == 0) goto L24
            if (r0 != r4) goto L15
            goto L24
        L15:
            r10 = -143770019864110(0xffff7d3def0961d2, double:NaN)
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r10)
            r1 = r6
            goto Laf
        L24:
            defpackage.AbstractC0762.m1680(r11)
        L27:
            boolean r11 = r3.f7269
            if (r11 == 0) goto Laf
            android.media.MediaPlayer r11 = r3.f7268
            if (r11 == 0) goto Laf
            boolean r0 = r11.isPlaying()
            if (r0 == 0) goto Laf
            int r0 = r11.getCurrentPosition()     // Catch: java.lang.Exception -> L51
            int r11 = r11.getDuration()     // Catch: java.lang.Exception -> L51
            if (r11 <= 0) goto La4
            int r6 = r0 * 100
            int r6 = r6 / r11
            android.widget.SeekBar r11 = r3.f7256     // Catch: java.lang.Exception -> L51
            r11.setProgress(r6)     // Catch: java.lang.Exception -> L51
            android.widget.TextView r11 = r3.f7262     // Catch: java.lang.Exception -> L51
            java.lang.String r0 = defpackage.C1630.m2981(r0)     // Catch: java.lang.Exception -> L51
            r11.setText(r0)     // Catch: java.lang.Exception -> L51
            goto La4
        L51:
            r11 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r6 = -143731365158446(0xffff7d46ef0961d2, double:NaN)
            java.lang.String r6 = "更新进度失败: "
            r0.<init>(r6)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r6 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r6 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r0 = r11.length()
            if (r0 != 0) goto L82
            goto La4
        L82:
            int r0 = r11.length()
            r6 = r5
        L87:
            if (r6 >= r0) goto La4
            int r7 = r6 + 2000
            if (r7 <= r0) goto L8e
            r7 = r0
        L8e:
            java.lang.String r6 = r11.substring(r6, r7)
            r8 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r8 = defpackage.C0346.f1773
            r8.getClass()
            defpackage.C0346.m1040(r6)
            r6 = r7
            goto L87
        La4:
            r10.f5805 = r4
            r6 = 100
            java.lang.Object r11 = defpackage.AbstractC0729.m1644(r6, r10)
            if (r11 != r2) goto L27
            r1 = r2
        Laf:
            return r1
        Lb0:
            android.widget.Spinner r0 = r3.f7245
            android.widget.TextView r7 = r3.f7273
            int r8 = r10.f5805
            if (r8 == 0) goto Ld0
            if (r8 != r4) goto Lc1
            defpackage.AbstractC0762.m1680(r11)     // Catch: java.lang.Exception -> Lbe
            goto Lea
        Lbe:
            r10 = move-exception
            goto L142
        Lc1:
            r10 = -101275613437486(0xffffa3e3ef0961d2, double:NaN)
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C2264.m3676(r10)
            r1 = r6
            goto L18b
        Ld0:
            defpackage.AbstractC0762.m1680(r11)
            r7.setVisibility(r5)     // Catch: java.lang.Exception -> Lbe
            ᛶᛸᛳ r11 = defpackage.AbstractC1572.f6948     // Catch: java.lang.Exception -> Lbe
            ᛴᛵᲁᛳ r11 = defpackage.ExecutorC0679.f3269     // Catch: java.lang.Exception -> Lbe
            ᛵᛵᲁᛲ r8 = new ᛵᛵᲁᛲ     // Catch: java.lang.Exception -> Lbe
            r8.<init>(r3, r6, r5)     // Catch: java.lang.Exception -> Lbe
            r10.f5805 = r4     // Catch: java.lang.Exception -> Lbe
            java.lang.Object r11 = defpackage.AbstractC0397.m1144(r11, r8, r10)     // Catch: java.lang.Exception -> Lbe
            if (r11 != r2) goto Lea
            r1 = r2
            goto L18b
        Lea:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> Lbe
            r3.f7254 = r11     // Catch: java.lang.Exception -> Lbe
            android.widget.ArrayAdapter r10 = new android.widget.ArrayAdapter     // Catch: java.lang.Exception -> Lbe
            android.content.Context r2 = r3.f7258     // Catch: java.lang.Exception -> Lbe
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r10.<init>(r2, r3, r11)     // Catch: java.lang.Exception -> Lbe
            r2 = 17367049(0x1090009, float:2.516295E-38)
            r10.setDropDownViewResource(r2)     // Catch: java.lang.Exception -> Lbe
            r0.setAdapter(r10)     // Catch: java.lang.Exception -> Lbe
            ᛶᲀᛵ r10 = defpackage.C1141.f5173     // Catch: java.lang.Exception -> Lbe
            r10.getClass()     // Catch: java.lang.Exception -> Lbe
            ᲀᲇᛸᛶ r10 = defpackage.C1141.f5216     // Catch: java.lang.Exception -> Lbe
            ᲁᛷᛶᛶ[] r2 = defpackage.C1141.f5221     // Catch: java.lang.Exception -> Lbe
            r3 = 143(0x8f, float:2.0E-43)
            r2 = r2[r3]     // Catch: java.lang.Exception -> Lbe
            java.lang.Object r10 = r10.m3169(r2)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> Lbe
            int r2 = r10.length()     // Catch: java.lang.Exception -> Lbe
            if (r2 <= 0) goto L13c
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Exception -> Lbe
        L11e:
            boolean r2 = r11.hasNext()     // Catch: java.lang.Exception -> Lbe
            if (r2 == 0) goto L136
            java.lang.Object r2 = r11.next()     // Catch: java.lang.Exception -> Lbe
            ᛶᛶᛶᛲ r2 = (defpackage.C1093) r2     // Catch: java.lang.Exception -> Lbe
            java.lang.String r2 = r2.f4889     // Catch: java.lang.Exception -> Lbe
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r10)     // Catch: java.lang.Exception -> Lbe
            if (r2 == 0) goto L133
            goto L137
        L133:
            int r5 = r5 + 1
            goto L11e
        L136:
            r5 = -1
        L137:
            if (r5 < 0) goto L13c
            r0.setSelection(r5)     // Catch: java.lang.Exception -> Lbe
        L13c:
            r10 = 8
            r7.setVisibility(r10)     // Catch: java.lang.Exception -> Lbe
            goto L18b
        L142:
            r2 = -101142469451310(0xffffa402ef0961d2, double:NaN)
            java.lang.String r11 = "加载音色列表失败"
            r2 = -514945388551726(0xfffe2ba8ef0961d2, double:NaN)
            r2 = -514979748290094(0xfffe2ba0ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r0 = defpackage.C0346.f1773
            r0.getClass()
            defpackage.C0346.m1038(r11, r10)
            r2 = -101181124156974(0xffffa3f9ef0961d2, double:NaN)
            java.lang.String r11 = "加载失败，请检查网络"
            r7.setText(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r2 = -101228368797230(0xffffa3eeef0961d2, double:NaN)
            java.lang.String r0 = "加载音色列表失败: "
            r11.<init>(r0)
            java.lang.String r10 = r10.getMessage()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            defpackage.AbstractC0209.m764(r10)
        L18b:
            return r1
    }
}
