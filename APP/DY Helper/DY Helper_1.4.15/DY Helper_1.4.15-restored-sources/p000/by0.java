package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class by0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1884;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f1885;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f1886;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f1887;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.app.Activity f1888;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ boolean f1889;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f1890;

    public /* synthetic */ by0(p000.C0276f8 r2, android.app.Activity r3, int r4, java.lang.String r5, boolean r6, java.lang.String r7) {
            r1 = this;
            r0 = 0
            r1.f1884 = r0
            r1.<init>()
            r1.f1890 = r2
            r1.f1888 = r3
            r1.f1887 = r4
            r1.f1885 = r5
            r1.f1889 = r6
            r1.f1886 = r7
            return
    }

    public /* synthetic */ by0(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, android.app.Activity r6, boolean r7) {
            r1 = this;
            r0 = 1
            r1.f1884 = r0
            r1.<init>()
            r1.f1885 = r2
            r1.f1886 = r3
            r1.f1890 = r4
            r1.f1887 = r5
            r1.f1888 = r6
            r1.f1889 = r7
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r22 = this;
            r0 = r22
            int r1 = r0.f1884
            s62 r2 = p000.s62.f9751
            java.lang.Object r3 = r0.f1890
            switch(r1) {
                case 0: goto L31;
                default: goto Lb;
            }
        Lb:
            java.lang.String r3 = (java.lang.String) r3
            android.os.Handler r1 = com.example.dyhelper.p002ui.C0182.f2694
            java.util.LinkedHashMap r1 = com.example.dyhelper.p002ui.C0182.f2698
            java.lang.String r4 = r0.f1885
            java.lang.Object r1 = r1.remove(r4)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L20
            android.os.Handler r5 = com.example.dyhelper.p002ui.C0182.f2694
            r5.removeCallbacks(r1)
        L20:
            f52 r1 = p000.f52.f3753
            java.lang.String r5 = r0.f1886
            int r6 = r0.f1887
            com.example.dyhelper.p002ui.C0182.m1601(r4, r5, r3, r6, r1)
            android.app.Activity r1 = r0.f1888
            boolean r0 = r0.f1889
            com.example.dyhelper.p002ui.C0182.m1596(r1, r0)
            return r2
        L31:
            f8 r3 = (p000.C0276f8) r3
            android.app.Activity r4 = r0.f1888
            int r7 = r0.f1887
            java.lang.String r8 = r0.f1885
            boolean r9 = r0.f1889
            java.lang.String r1 = r0.f1886
            java.lang.String r13 = "下载视频"
            java.lang.String r14 = "/"
            qy0 r15 = p000.qy0.f9157
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L56
            r5.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = r3.m2047()     // Catch: java.lang.Throwable -> L56
            p000.qy0.m4959(r5, r0)     // Catch: java.lang.Throwable -> L56
            java.util.List r0 = r3.f3795     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L5b
            jz r0 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L56
            goto L5b
        L56:
            r0 = move-exception
            r20 = r2
            goto L1b8
        L5b:
            uh0 r6 = new uh0     // Catch: java.lang.Throwable -> L56
            r10 = 19
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L56
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r6)     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L56
        L6a:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L56
            p000.qy0.m4959(r5, r6)     // Catch: java.lang.Throwable -> L56
            goto L6a
        L7a:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L1ae
            java.util.Iterator r16 = r5.iterator()     // Catch: java.lang.Throwable -> L56
            r17 = 0
            r10 = r17
            r0 = 0
        L89:
            boolean r11 = r16.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r11 == 0) goto L18d
            int r10 = r0 + 1
            java.lang.Object r0 = r16.next()     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L56
            java.lang.String r11 = "dyhelper_video_"
            java.lang.String r12 = ".mp4"
            java.io.File r6 = r4.getCacheDir()     // Catch: java.lang.Throwable -> L56
            java.io.File r6 = java.io.File.createTempFile(r11, r12, r6)     // Catch: java.lang.Throwable -> L56
            java.lang.String r11 = r3.f3800     // Catch: java.lang.Throwable -> L14b
            int r12 = r5.size()     // Catch: java.lang.Throwable -> L14b
            r18 = r1
            java.lang.String r1 = p000.qy0.m5015(r15, r0)     // Catch: java.lang.Throwable -> L147
            r19 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L147
            r0.<init>()     // Catch: java.lang.Throwable -> L147
            r20 = r2
            java.lang.String r2 = "DYHelper: [VIDEO-DL] awemeId="
            r0.append(r2)     // Catch: java.lang.Throwable -> L13e
            r0.append(r11)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r2 = ", candidate="
            r0.append(r2)     // Catch: java.lang.Throwable -> L13e
            r0.append(r10)     // Catch: java.lang.Throwable -> L13e
            r0.append(r14)     // Catch: java.lang.Throwable -> L13e
            r0.append(r12)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r2 = ", url="
            r0.append(r2)     // Catch: java.lang.Throwable -> L13e
            r0.append(r1)     // Catch: java.lang.Throwable -> L13e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L13e
            p000.C0888ux.m5974(r0)     // Catch: java.lang.Throwable -> L13e
            r6.getClass()     // Catch: java.lang.Throwable -> L13e
            r1 = r10
            java.lang.String r10 = "下载视频"
            ig r11 = new ig     // Catch: java.lang.Throwable -> L136
            r0 = 29
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L136
            gy0 r12 = new gy0     // Catch: java.lang.Throwable -> L136
            r2 = 0
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L131
            r21 = r19
            r19 = r2
            r2 = r5
            r5 = r21
            p000.qy0.m4958(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L12d
            r10 = r7
            r11 = r9
            java.lang.String r9 = android.os.Environment.DIRECTORY_MOVIES     // Catch: java.lang.Throwable -> L12a
            r9.getClass()     // Catch: java.lang.Throwable -> L12a
            r5 = r4
            r4 = r15
            r7 = r18
            r4.m5032(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L121
            r4 = r5
            r6.delete()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r0 = "下载完成"
            java.lang.String r1 = "视频已保存"
            p000.qy0.m4993(r4, r0, r1, r13)     // Catch: java.lang.Throwable -> L11e
            xx0 r0 = new xx0     // Catch: java.lang.Throwable -> L11e
            r1 = 5
            r0.<init>(r4, r8, r1)     // Catch: java.lang.Throwable -> L11e
            r4.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L11e
            goto L1dd
        L11e:
            r0 = move-exception
            goto L1b8
        L121:
            r0 = move-exception
            r18 = r5
            r5 = r4
            r4 = r18
            r18 = r7
            goto L14f
        L12a:
            r0 = move-exception
        L12b:
            r5 = r15
            goto L14f
        L12d:
            r0 = move-exception
        L12e:
            r10 = r7
            r11 = r9
            goto L12b
        L131:
            r0 = move-exception
            r19 = r2
            r2 = r5
            goto L12e
        L136:
            r0 = move-exception
            r2 = r5
            r10 = r7
            r11 = r9
            r5 = r15
            r19 = 0
            goto L14f
        L13e:
            r0 = move-exception
        L13f:
            r2 = r5
            r11 = r9
            r1 = r10
            r5 = r15
            r19 = 0
            r10 = r7
            goto L14f
        L147:
            r0 = move-exception
        L148:
            r20 = r2
            goto L13f
        L14b:
            r0 = move-exception
            r18 = r1
            goto L148
        L14f:
            int r7 = r2.size()     // Catch: java.lang.Throwable -> L188
            java.lang.String r9 = r0.getMessage()     // Catch: java.lang.Throwable -> L188
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L188
            r12.<init>()     // Catch: java.lang.Throwable -> L188
            java.lang.String r15 = "DYHelper: [VIDEO-DL-RETRY] 候选 "
            r12.append(r15)     // Catch: java.lang.Throwable -> L188
            r12.append(r1)     // Catch: java.lang.Throwable -> L188
            r12.append(r14)     // Catch: java.lang.Throwable -> L188
            r12.append(r7)     // Catch: java.lang.Throwable -> L188
            java.lang.String r7 = " 失败: "
            r12.append(r7)     // Catch: java.lang.Throwable -> L188
            r12.append(r9)     // Catch: java.lang.Throwable -> L188
            java.lang.String r7 = r12.toString()     // Catch: java.lang.Throwable -> L188
            p000.C0888ux.m5974(r7)     // Catch: java.lang.Throwable -> L188
            r6.delete()     // Catch: java.lang.Throwable -> L11e
            r15 = r5
            r7 = r10
            r9 = r11
            r10 = r0
            r0 = r1
            r5 = r2
            r1 = r18
            r2 = r20
            goto L89
        L188:
            r0 = move-exception
            r6.delete()     // Catch: java.lang.Throwable -> L11e
            throw r0     // Catch: java.lang.Throwable -> L11e
        L18d:
            r20 = r2
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L11e
            if (r10 == 0) goto L197
            java.lang.String r17 = r10.getMessage()     // Catch: java.lang.Throwable -> L11e
        L197:
            r1 = r17
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11e
            r2.<init>()     // Catch: java.lang.Throwable -> L11e
            java.lang.String r3 = "视频全部候选下载失败: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L11e
            r2.append(r1)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L11e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11e
            throw r0     // Catch: java.lang.Throwable -> L11e
        L1ae:
            r20 = r2
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L11e
            java.lang.String r1 = "未找到可下载的视频候选地址"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11e
            throw r0     // Catch: java.lang.Throwable -> L11e
        L1b8:
            java.lang.String r1 = r0.getMessage()
            p000.qy0.m4994(r4, r1, r13)
            tx0 r1 = new tx0
            r2 = 3
            r1.<init>(r4, r0, r2)
            r4.runOnUiThread(r1)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DYHelper: 下载失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5974(r0)
        L1dd:
            return r20
    }
}
