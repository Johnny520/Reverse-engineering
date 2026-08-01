package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vx0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11463;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f11464;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f11465;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f11466;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ boolean f11467;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f11468;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f11469;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f11470;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ java.lang.Object f11471;

    public /* synthetic */ vx0(android.app.Activity r2, p000.C0228dy r3, p000.C0964wy r4, java.lang.String r5, p000.C0299fv r6, int r7, boolean r8, p000.C0568n r9) {
            r1 = this;
            r0 = 1
            r1.f11463 = r0
            r1.<init>()
            r1.f11464 = r2
            r1.f11468 = r3
            r1.f11469 = r4
            r1.f11465 = r5
            r1.f11470 = r6
            r1.f11466 = r7
            r1.f11467 = r8
            r1.f11471 = r9
            return
    }

    public /* synthetic */ vx0(android.app.Activity r2, p000.C0299fv r3, java.lang.String r4, java.lang.String r5, p000.C0276f8 r6, java.lang.String r7, int r8, boolean r9) {
            r1 = this;
            r0 = 3
            r1.f11463 = r0
            r1.<init>()
            r1.f11464 = r2
            r1.f11470 = r3
            r1.f11465 = r4
            r1.f11468 = r5
            r1.f11471 = r6
            r1.f11469 = r7
            r1.f11466 = r8
            r1.f11467 = r9
            return
    }

    public /* synthetic */ vx0(android.app.Activity r2, java.lang.String r3, java.lang.String r4, int r5, java.lang.String r6, boolean r7, java.lang.String r8, p000.zx0 r9) {
            r1 = this;
            r0 = 0
            r1.f11463 = r0
            r1.<init>()
            r1.f11464 = r2
            r1.f11465 = r3
            r1.f11468 = r4
            r1.f11466 = r5
            r1.f11469 = r6
            r1.f11467 = r7
            r1.f11470 = r8
            r1.f11471 = r9
            return
    }

    public /* synthetic */ vx0(java.util.ArrayList r2, android.app.Activity r3, java.lang.String r4, p000.C0299fv r5, p000.C0276f8 r6, int r7, boolean r8, java.lang.String r9) {
            r1 = this;
            r0 = 2
            r1.f11463 = r0
            r1.<init>()
            r1.f11469 = r2
            r1.f11464 = r3
            r1.f11465 = r4
            r1.f11470 = r5
            r1.f11471 = r6
            r1.f11466 = r7
            r1.f11467 = r8
            r1.f11468 = r9
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r27 = this;
            r1 = r27
            int r0 = r1.f11463
            switch(r0) {
                case 0: goto L39c;
                case 1: goto L2af;
                case 2: goto Lb2;
                default: goto L7;
            }
        L7:
            android.app.Activity r3 = r1.f11464
            java.lang.Object r0 = r1.f11470
            fv r0 = (p000.C0299fv) r0
            java.lang.String r5 = r1.f11465
            java.lang.Object r2 = r1.f11468
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r1.f11471
            f8 r4 = (p000.C0276f8) r4
            java.lang.Object r6 = r1.f11469
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r1.f11466
            boolean r1 = r1.f11467
            java.lang.String r10 = "下载音频"
            java.lang.String r11 = "DYHelper"
            qy0 r8 = p000.qy0.f9157
            java.lang.String r9 = "[AUDIO-DL] awemeId="
            java.lang.String r0 = r0.f4139     // Catch: java.lang.Throwable -> L86
            java.lang.String r12 = android.os.Environment.DIRECTORY_MUSIC     // Catch: java.lang.Throwable -> L86
            r12.getClass()     // Catch: java.lang.Throwable -> L86
            android.net.Uri r12 = p000.qy0.m4985(r3, r0, r5, r2, r12)     // Catch: java.lang.Throwable -> L86
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L88
            java.io.OutputStream r2 = r0.openOutputStream(r12)     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L8a
            java.lang.String r0 = r4.f3800     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = p000.qy0.m5015(r8, r6)     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L88
            r8.append(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = ", url="
            r8.append(r0)     // Catch: java.lang.Throwable -> L88
            r8.append(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L88
            p000.C0888ux.m5975(r11, r0)     // Catch: java.lang.Throwable -> L88
            r4 = r7
            java.lang.String r7 = "下载音频"
            ig r8 = new ig     // Catch: java.lang.Throwable -> L88
            r0 = 27
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L88
            ig r9 = new ig     // Catch: java.lang.Throwable -> L88
            r0 = 28
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L88
            r26 = r6
            r6 = r1
            r1 = r26
            p000.qy0.m4956(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L88
            p000.qy0.m4999(r3, r12)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "下载完成"
            java.lang.String r1 = "音频已保存"
            p000.qy0.m4993(r3, r0, r1, r10)     // Catch: java.lang.Throwable -> L86
            xx0 r0 = new xx0     // Catch: java.lang.Throwable -> L86
            r1 = 4
            r0.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L86
            r3.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L86
            goto Laf
        L86:
            r0 = move-exception
            goto L96
        L88:
            r0 = move-exception
            goto L92
        L8a:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "无法打开输出流"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L88
            throw r0     // Catch: java.lang.Throwable -> L88
        L92:
            p000.qy0.m4987(r3, r12)     // Catch: java.lang.Throwable -> L86
            throw r0     // Catch: java.lang.Throwable -> L86
        L96:
            java.lang.String r1 = r0.getMessage()
            p000.qy0.m4994(r3, r1, r10)
            tx0 r1 = new tx0
            r2 = 2
            r1.<init>(r3, r0, r2)
            r3.runOnUiThread(r1)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "音频下载失败: "
            p000.AbstractC0602nx.m4143(r1, r0, r11)
        Laf:
            s62 r0 = p000.s62.f9751
            return r0
        Lb2:
            java.lang.Object r0 = r1.f11469
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.String r3 = r1.f11465
            java.lang.Object r0 = r1.f11470
            fv r0 = (p000.C0299fv) r0
            java.lang.String r4 = r0.f4139
            java.lang.Object r0 = r1.f11471
            r5 = r0
            f8 r5 = (p000.C0276f8) r5
            int r10 = r1.f11466
            boolean r12 = r1.f11467
            java.lang.Object r0 = r1.f11468
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            qy0 r6 = p000.qy0.f9157
            sm1 r14 = new sm1
            r14.<init>()
            java.util.Iterator r15 = r2.iterator()     // Catch: java.lang.Throwable -> L26d
            r0 = 0
        Ld9:
            boolean r7 = r15.hasNext()     // Catch: java.lang.Throwable -> L26d
            java.lang.String r8 = "下载图片"
            android.app.Activity r9 = r1.f11464
            java.lang.String r11 = "/"
            if (r7 == 0) goto L26f
            int r7 = r0 + 1
            java.lang.Object r16 = r15.next()     // Catch: java.lang.Throwable -> L26d
            r17 = r10
            r10 = r16
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L26d
            r16 = r12
            int r12 = r2.size()     // Catch: java.lang.Throwable -> L26d
            r18 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26d
            r15.<init>()     // Catch: java.lang.Throwable -> L26d
            r15.append(r7)     // Catch: java.lang.Throwable -> L26d
            r15.append(r11)     // Catch: java.lang.Throwable -> L26d
            r15.append(r12)     // Catch: java.lang.Throwable -> L26d
            java.lang.String r12 = r15.toString()     // Catch: java.lang.Throwable -> L26d
            int r15 = r7 * 100
            int r19 = r2.size()     // Catch: java.lang.Throwable -> L26d
            int r15 = r15 / r19
            p000.qy0.m4997(r15, r9, r8, r12)     // Catch: java.lang.Throwable -> L26d
            ky0 r8 = p000.qy0.m5008(r10)     // Catch: java.lang.Throwable -> L227
            java.lang.String r12 = r8.f6316     // Catch: java.lang.Throwable -> L21d
            int r15 = r2.size()     // Catch: java.lang.Throwable -> L21d
            java.lang.String r0 = p000.qy0.m4967(r0, r15, r3, r12)     // Catch: java.lang.Throwable -> L21d
            java.lang.String r12 = r8.f6315     // Catch: java.lang.Throwable -> L21d
            java.lang.String r15 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L21d
            r15.getClass()     // Catch: java.lang.Throwable -> L21d
            android.net.Uri r15 = p000.qy0.m4985(r9, r4, r0, r12, r15)     // Catch: java.lang.Throwable -> L21d
            android.content.ContentResolver r12 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L219
            java.io.OutputStream r12 = r12.openOutputStream(r15)     // Catch: java.lang.Throwable -> L219
            if (r12 == 0) goto L208
            r20 = r3
            java.lang.String r3 = r5.f3800     // Catch: java.lang.Throwable -> L204
            r21 = r5
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L1ff
            r22 = r9
            java.lang.String r9 = r8.f6315     // Catch: java.lang.Throwable -> L1f8
            r23 = r12
            java.lang.String r12 = r8.f6316     // Catch: java.lang.Throwable -> L1f8
            java.lang.String r10 = p000.qy0.m5015(r6, r10)     // Catch: java.lang.Throwable -> L1f8
            r24 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ef
            r6.<init>()     // Catch: java.lang.Throwable -> L1ef
            r25 = r8
            java.lang.String r8 = "DYHelper: [IMG-DL] awemeId="
            r6.append(r8)     // Catch: java.lang.Throwable -> L1e4
            r6.append(r3)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r3 = ", idx="
            r6.append(r3)     // Catch: java.lang.Throwable -> L1e4
            r6.append(r7)     // Catch: java.lang.Throwable -> L1e4
            r6.append(r11)     // Catch: java.lang.Throwable -> L1e4
            r6.append(r5)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r3 = ", mime="
            r6.append(r3)     // Catch: java.lang.Throwable -> L1e4
            r6.append(r9)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r3 = ", ext="
            r6.append(r3)     // Catch: java.lang.Throwable -> L1e4
            r6.append(r12)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r3 = ", dir="
            r6.append(r3)     // Catch: java.lang.Throwable -> L1e4
            r6.append(r4)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r3 = ", file="
            r6.append(r3)     // Catch: java.lang.Throwable -> L1e4
            r6.append(r0)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r0 = ", url="
            r6.append(r0)     // Catch: java.lang.Throwable -> L1e4
            r6.append(r10)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L1e4
            p000.C0888ux.m5974(r0)     // Catch: java.lang.Throwable -> L1e4
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L1e4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e4
            r3.<init>()     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r5 = "图片 "
            r3.append(r5)     // Catch: java.lang.Throwable -> L1e4
            r3.append(r7)     // Catch: java.lang.Throwable -> L1e4
            r3.append(r11)     // Catch: java.lang.Throwable -> L1e4
            r3.append(r0)     // Catch: java.lang.Throwable -> L1e4
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L1e4
            r3 = r7
            r5 = r11
            r12 = r16
            r10 = r17
            r9 = r22
            r8 = r23
            r6 = r24
            r7 = r25
            r11 = r0
            r6.m5022(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1dd
            r17 = r10
            r16 = r12
            p000.qy0.m4999(r9, r15)     // Catch: java.lang.Throwable -> L1d9
            int r0 = r14.f9967     // Catch: java.lang.Throwable -> L1d9
            int r0 = r0 + 1
            r14.f9967 = r0     // Catch: java.lang.Throwable -> L1d9
            goto L260
        L1d9:
            r0 = move-exception
            r7 = 0
            goto L230
        L1dd:
            r0 = move-exception
            r17 = r10
            r16 = r12
            goto L230
        L1e4:
            r0 = move-exception
            r3 = r7
            r5 = r11
            r9 = r22
            r6 = r24
            r7 = r25
            goto L230
        L1ef:
            r0 = move-exception
            r3 = r7
            r7 = r8
            r5 = r11
            r9 = r22
            r6 = r24
            goto L230
        L1f8:
            r0 = move-exception
            r3 = r7
            r7 = r8
            r5 = r11
            r9 = r22
            goto L230
        L1ff:
            r0 = move-exception
        L200:
            r3 = r7
            r7 = r8
            r5 = r11
            goto L230
        L204:
            r0 = move-exception
        L205:
            r21 = r5
            goto L200
        L208:
            r20 = r3
            r21 = r5
            r3 = r7
            r7 = r8
            r5 = r11
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L217
            java.lang.String r8 = "无法打开输出流"
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L217
            throw r0     // Catch: java.lang.Throwable -> L217
        L217:
            r0 = move-exception
            goto L230
        L219:
            r0 = move-exception
            r20 = r3
            goto L205
        L21d:
            r0 = move-exception
            r20 = r3
            r21 = r5
            r3 = r7
            r7 = r8
            r5 = r11
        L225:
            r15 = 0
            goto L230
        L227:
            r0 = move-exception
            r20 = r3
            r21 = r5
            r3 = r7
            r5 = r11
            r7 = 0
            goto L225
        L230:
            p000.qy0.m4987(r9, r15)     // Catch: java.lang.Throwable -> L26d
            p000.qy0.m4979(r7)     // Catch: java.lang.Throwable -> L26d
            int r7 = r2.size()     // Catch: java.lang.Throwable -> L26d
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L26d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26d
            r8.<init>()     // Catch: java.lang.Throwable -> L26d
            java.lang.String r9 = "DYHelper: [IMG-FAIL] 图片 "
            r8.append(r9)     // Catch: java.lang.Throwable -> L26d
            r8.append(r3)     // Catch: java.lang.Throwable -> L26d
            r8.append(r5)     // Catch: java.lang.Throwable -> L26d
            r8.append(r7)     // Catch: java.lang.Throwable -> L26d
            java.lang.String r5 = " 下载失败: "
            r8.append(r5)     // Catch: java.lang.Throwable -> L26d
            r8.append(r0)     // Catch: java.lang.Throwable -> L26d
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L26d
            p000.C0888ux.m5974(r0)     // Catch: java.lang.Throwable -> L26d
        L260:
            r0 = r3
            r12 = r16
            r10 = r17
            r15 = r18
            r3 = r20
            r5 = r21
            goto Ld9
        L26d:
            r0 = move-exception
            goto L2a9
        L26f:
            r5 = r11
            java.lang.String r0 = "下载完成"
            int r1 = r14.f9967     // Catch: java.lang.Throwable -> L26d
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L26d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26d
            r4.<init>()     // Catch: java.lang.Throwable -> L26d
            java.lang.String r6 = "已保存 "
            r4.append(r6)     // Catch: java.lang.Throwable -> L26d
            r4.append(r1)     // Catch: java.lang.Throwable -> L26d
            r4.append(r5)     // Catch: java.lang.Throwable -> L26d
            r4.append(r3)     // Catch: java.lang.Throwable -> L26d
            java.lang.String r1 = " 张图片"
            r4.append(r1)     // Catch: java.lang.Throwable -> L26d
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L26d
            p000.qy0.m4993(r9, r0, r1, r8)     // Catch: java.lang.Throwable -> L26d
            e9 r0 = new e9     // Catch: java.lang.Throwable -> L26d
            r1 = 19
            r0.<init>(r9, r14, r2, r1)     // Catch: java.lang.Throwable -> L26d
            r9.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L26d
            java.util.concurrent.ConcurrentHashMap r0 = p000.qy0.f9161
            r0.remove(r13)
            s62 r0 = p000.s62.f9751
            return r0
        L2a9:
            java.util.concurrent.ConcurrentHashMap r1 = p000.qy0.f9161
            r1.remove(r13)
            throw r0
        L2af:
            android.app.Activity r2 = r1.f11464
            java.lang.Object r0 = r1.f11468
            dy r0 = (p000.C0228dy) r0
            java.lang.String r3 = r0.f3324
            java.lang.Object r4 = r1.f11469
            wy r4 = (p000.C0964wy) r4
            java.lang.String r5 = r4.f11892
            java.lang.String r6 = r1.f11465
            java.lang.Object r7 = r1.f11470
            fv r7 = (p000.C0299fv) r7
            int r8 = r1.f11466
            boolean r9 = r1.f11467
            java.lang.Object r1 = r1.f11471
            n r1 = (p000.C0568n) r1
            qy0 r10 = p000.qy0.f9157
            java.lang.String r7 = r7.f4139
            java.lang.String r11 = "下载表情"
            java.lang.String r12 = "[COMMENT-EMOJI-TRANSCODE] image/webp -> image/gif, url="
            java.lang.String r13 = "DYHelper: [COMMENT-EMOJI-DL-INAPP] file="
            dz r14 = r4.f11894     // Catch: java.lang.Throwable -> L36e
            java.lang.String r15 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L36e
            r15.getClass()     // Catch: java.lang.Throwable -> L36e
            android.net.Uri r7 = p000.qy0.m4985(r2, r7, r6, r5, r15)     // Catch: java.lang.Throwable -> L36e
            android.content.ContentResolver r15 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L362
            java.io.OutputStream r15 = r15.openOutputStream(r7)     // Catch: java.lang.Throwable -> L362
            if (r15 == 0) goto L365
            r16 = r3
            java.lang.String r3 = p000.ln0.m3617(r16)     // Catch: java.lang.Throwable -> L362
            java.lang.String r3 = p000.qy0.m5015(r10, r3)     // Catch: java.lang.Throwable -> L362
            r27 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33c
            r11.<init>(r13)     // Catch: java.lang.Throwable -> L33c
            r11.append(r6)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r13 = ", mime="
            r11.append(r13)     // Catch: java.lang.Throwable -> L33c
            r11.append(r5)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r5 = ", strategy="
            r11.append(r5)     // Catch: java.lang.Throwable -> L33c
            r11.append(r14)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r5 = ", url="
            r11.append(r5)     // Catch: java.lang.Throwable -> L33c
            r11.append(r3)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r3 = r11.toString()     // Catch: java.lang.Throwable -> L33c
            p000.C0888ux.m5974(r3)     // Catch: java.lang.Throwable -> L33c
            r10.m5030(r0, r15, r4, r1)     // Catch: java.lang.Throwable -> L358
            r15.close()     // Catch: java.lang.Throwable -> L33c
            p000.qy0.m5006(r2, r8, r6, r9)     // Catch: java.lang.Throwable -> L33c
            dz r0 = p000.EnumC0229dz.f3336     // Catch: java.lang.Throwable -> L33c
            if (r14 != r0) goto L340
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = p000.ln0.m3617(r16)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r1 = p000.qy0.m5015(r10, r1)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r1 = r12.concat(r1)     // Catch: java.lang.Throwable -> L33c
            p000.C0888ux.m5975(r0, r1)     // Catch: java.lang.Throwable -> L33c
            goto L340
        L33c:
            r0 = move-exception
            r3 = r27
            goto L371
        L340:
            p000.qy0.m4999(r2, r7)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r0 = "下载完成"
            java.lang.String r1 = "表情已保存"
            r3 = r27
            p000.qy0.m4993(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L356
            xx0 r0 = new xx0     // Catch: java.lang.Throwable -> L356
            r1 = 1
            r0.<init>(r2, r6, r1)     // Catch: java.lang.Throwable -> L356
            r2.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L356
            goto L399
        L356:
            r0 = move-exception
            goto L371
        L358:
            r0 = move-exception
            r3 = r27
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L35d
        L35d:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r15, r1)     // Catch: java.lang.Throwable -> L356
            throw r0     // Catch: java.lang.Throwable -> L356
        L362:
            r0 = move-exception
            r3 = r11
            goto L371
        L365:
            r3 = r11
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L356
            java.lang.String r1 = "无法打开输出流"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L356
            throw r0     // Catch: java.lang.Throwable -> L356
        L36e:
            r0 = move-exception
            r3 = r11
            r7 = 0
        L371:
            p000.qy0.m4987(r2, r7)
            java.lang.String r1 = r0.getMessage()
            p000.qy0.m4994(r2, r1, r3)
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DYHelper: [COMMENT-EMOJI-DL-FAIL] "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            p000.C0888ux.m5974(r1)
            tx0 r1 = new tx0
            r3 = 1
            r1.<init>(r2, r0, r3)
            r2.runOnUiThread(r1)
        L399:
            s62 r0 = p000.s62.f9751
            return r0
        L39c:
            java.lang.String r0 = r1.f11465
            java.lang.Object r2 = r1.f11468
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r1.f11466
            java.lang.Object r2 = r1.f11469
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r1.f11467
            java.lang.Object r2 = r1.f11470
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f11471
            r13 = r3
            zx0 r13 = (p000.zx0) r13
            java.lang.String r14 = "下载原画质"
            qy0 r12 = p000.qy0.f9157
            java.lang.String r15 = "DYHelper: 原画质下载失败，准备降级: "
            java.lang.String r3 = "DYHelper: [ORIGINAL-VIDEO-DL] quality="
            java.lang.String r5 = ".mp4"
            android.app.Activity r1 = r1.f11464
            java.io.File r9 = r1.getCacheDir()
            java.lang.String r10 = "dyhelper_original_video_"
            java.io.File r5 = java.io.File.createTempFile(r10, r5, r9)
            java.lang.String r9 = p000.qy0.m5015(r12, r4)     // Catch: java.lang.Throwable -> L42a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42a
            r10.<init>(r3)     // Catch: java.lang.Throwable -> L42a
            r10.append(r0)     // Catch: java.lang.Throwable -> L42a
            java.lang.String r0 = ", url="
            r10.append(r0)     // Catch: java.lang.Throwable -> L42a
            r10.append(r9)     // Catch: java.lang.Throwable -> L42a
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L42a
            p000.C0888ux.m5974(r0)     // Catch: java.lang.Throwable -> L42a
            r5.getClass()     // Catch: java.lang.Throwable -> L42a
            java.lang.String r9 = "下载原画质"
            ig r10 = new ig     // Catch: java.lang.Throwable -> L42a
            r0 = 24
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L42a
            ig r11 = new ig     // Catch: java.lang.Throwable -> L42a
            r0 = 25
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42a
            r3 = r1
            p000.qy0.m4958(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L421
            r11 = r7
            r7 = r12
            java.lang.String r12 = android.os.Environment.DIRECTORY_MOVIES     // Catch: java.lang.Throwable -> L428
            r12.getClass()     // Catch: java.lang.Throwable -> L428
            r10 = r2
            r8 = r3
            r9 = r5
            r7.m5032(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L423
            r3 = r8
            r5 = r9
            r7 = r11
            java.lang.String r0 = "下载完成"
            java.lang.String r1 = "原画质视频已保存"
            p000.qy0.m4993(r3, r0, r1, r14)     // Catch: java.lang.Throwable -> L421
            xx0 r0 = new xx0     // Catch: java.lang.Throwable -> L421
            r1 = 0
            r0.<init>(r3, r7, r1)     // Catch: java.lang.Throwable -> L421
            r3.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L421
        L41d:
            r5.delete()
            goto L451
        L421:
            r0 = move-exception
            goto L42c
        L423:
            r0 = move-exception
            r3 = r8
            r5 = r9
        L426:
            r7 = r11
            goto L42c
        L428:
            r0 = move-exception
            goto L426
        L42a:
            r0 = move-exception
            r3 = r1
        L42c:
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L454
            p000.qy0.m4994(r3, r1, r14)     // Catch: java.lang.Throwable -> L454
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L454
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L454
            r1.<init>(r15)     // Catch: java.lang.Throwable -> L454
            r1.append(r0)     // Catch: java.lang.Throwable -> L454
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L454
            p000.C0888ux.m5974(r0)     // Catch: java.lang.Throwable -> L454
            e9 r0 = new e9     // Catch: java.lang.Throwable -> L454
            r1 = 17
            r0.<init>(r3, r13, r7, r1)     // Catch: java.lang.Throwable -> L454
            r3.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L454
            goto L41d
        L451:
            s62 r0 = p000.s62.f9751
            return r0
        L454:
            r0 = move-exception
            r5.delete()
            throw r0
    }
}
