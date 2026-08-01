package defpackage;

/* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1959 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f8523;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8524;

    public /* synthetic */ RunnableC1959(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8524 = r1
            r0.f8523 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            int r0 = r8.f8524
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Object r8 = r8.f8523
            switch(r0) {
                case 0: goto L1a5;
                case 1: goto L197;
                case 2: goto L191;
                case 3: goto Le9;
                case 4: goto Le3;
                case 5: goto L7a;
                case 6: goto L44;
                case 7: goto L3e;
                case 8: goto L1f;
                case 9: goto L13;
                default: goto Lb;
            }
        Lb:
            ᲇᲈᛷᛳ r8 = (defpackage.RunnableC2163) r8
            ᛷᲁᲈᲇ r8 = r8.f9218
            r8.m2545()
            return
        L13:
            ᛷᲇᲇᲀ r8 = (defpackage.C1394) r8
            ᛳᛸᛳᛸ r0 = r8.f6049
            if (r0 == 0) goto L1c
            r0.m1322()
        L1c:
            r8.f6049 = r2
            return
        L1f:
            ᛴᲀᲁᛲ r8 = (defpackage.C0755) r8
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r8.f3537
            int r1 = r8.f3540
            if (r1 != 0) goto L2e
            r8.f3539 = r3
            ᲈᛶᛱᛲ r1 = defpackage.EnumC2255.ON_PAUSE
            r0.m108(r1)
        L2e:
            int r1 = r8.f3541
            if (r1 != 0) goto L3d
            boolean r1 = r8.f3539
            if (r1 == 0) goto L3d
            ᲈᛶᛱᛲ r1 = defpackage.EnumC2255.ON_STOP
            r0.m108(r1)
            r8.f3542 = r3
        L3d:
            return
        L3e:
            ᛳᲀᲁᲈ r8 = (defpackage.C0548) r8
            r8.m1341()
            return
        L44:
            ᲁᛷᛴᲇ r8 = (defpackage.AbstractC1883) r8
            ᛵᛳᲀ r0 = r8.f8173
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L79
            boolean r1 = r0.isRemoving()
            if (r1 == 0) goto L55
            goto L79
        L55:
            android.app.Activity r1 = r0.getActivity()
            boolean r1 = defpackage.AbstractC1592.m2874(r1)
            if (r1 == 0) goto L60
            goto L79
        L60:
            ᲁᛷᛵ r1 = r8.f8178
            r8.f8178 = r2
            if (r1 == 0) goto L74
            java.lang.Object r2 = r1.f8180
            ᛷᲈᲀ r2 = (defpackage.C1403) r2
            r2.getClass()
            java.lang.Object r1 = r1.f8179
            ᛶᛳᲇᛵ r1 = (defpackage.RunnableC1049) r1
            r1.run()
        L74:
            r8.f8174 = r3
            r0.m1802()
        L79:
            return
        L7a:
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 0
            r8.setAlpha(r0)
            r0 = 1063339950(0x3f6147ae, float:0.88)
            r8.setScaleX(r0)
            r8.setScaleY(r0)
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r5 = -135841510235694(0xffff8473ef0961d2, double:NaN)
            java.lang.String r2 = "alpha"
            float[] r5 = new float[r4]
            r5 = {x01ca: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r8, r2, r5)
            r5 = -135867280039470(0xffff846def0961d2, double:NaN)
            java.lang.String r5 = "scaleX"
            float[] r6 = new float[r4]
            r6 = {x01d2: FILL_ARRAY_DATA , data: [1063339950, 1065353216} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r8, r5, r6)
            r6 = -135897344810542(0xffff8466ef0961d2, double:NaN)
            java.lang.String r6 = "scaleY"
            float[] r7 = new float[r4]
            r7 = {x01da: FILL_ARRAY_DATA , data: [1063339950, 1065353216} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r6, r7)
            r6 = 3
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r1] = r2
            r6[r3] = r5
            r6[r4] = r8
            r0.playTogether(r6)
            r1 = 180(0xb4, double:8.9E-322)
            r0.setDuration(r1)
            android.view.animation.DecelerateInterpolator r8 = new android.view.animation.DecelerateInterpolator
            r1 = 1073741824(0x40000000, float:2.0)
            r8.<init>(r1)
            r0.setInterpolator(r8)
            r0.start()
            return
        Le3:
            com.ss.android.ugc.awemes.MainActivity r8 = (com.ss.android.ugc.awemes.MainActivity) r8
            com.ss.android.ugc.awemes.MainActivity.m292(r8)
            return
        Le9:
            ᛶᲇᲀᲀ r8 = (defpackage.C1174) r8
            java.lang.String r0 = "fetchFonts result is not OK. ("
            java.lang.Object r2 = r8.f5297
            monitor-enter(r2)
            ᛸᛷᲀᲈ r3 = r8.f5296     // Catch: java.lang.Throwable -> Lf7
            if (r3 != 0) goto Lfa
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf7
            goto L18c
        Lf7:
            r8 = move-exception
            goto L18f
        Lfa:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf7
            ᛲᛳᲈᲁ r2 = r8.m2283()     // Catch: java.lang.Throwable -> L10b
            int r3 = r2.f1552     // Catch: java.lang.Throwable -> L10b
            if (r3 != r4) goto L10d
            java.lang.Object r4 = r8.f5297     // Catch: java.lang.Throwable -> L10b
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L10b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L108
            goto L10d
        L108:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L108
            throw r0     // Catch: java.lang.Throwable -> L10b
        L10b:
            r0 = move-exception
            goto L17b
        L10d:
            if (r3 != 0) goto L164
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L15f
            android.content.Context r0 = r8.f5299     // Catch: java.lang.Throwable -> L15f
            ᛲᛳᲈᲁ[] r3 = new defpackage.C0275[]{r2}     // Catch: java.lang.Throwable -> L15f
            android.graphics.Typeface r0 = defpackage.AbstractC0796.m1726(r0, r3, r1)     // Catch: java.lang.Throwable -> L15f
            android.content.Context r1 = r8.f5299     // Catch: java.lang.Throwable -> L15f
            android.net.Uri r2 = r2.f1550     // Catch: java.lang.Throwable -> L15f
            java.nio.MappedByteBuffer r1 = defpackage.C1825.m3224(r1, r2)     // Catch: java.lang.Throwable -> L15f
            if (r1 == 0) goto L157
            if (r0 == 0) goto L157
            java.lang.String r2 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L152
            ᛲᛶᛲᲁ r2 = new ᛲᛶᛲᲁ     // Catch: java.lang.Throwable -> L152
            ᲀᛶᛴᲇ r1 = defpackage.AbstractC1754.m3147(r1)     // Catch: java.lang.Throwable -> L152
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L152
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L15f
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L10b
            java.lang.Object r0 = r8.f5297     // Catch: java.lang.Throwable -> L10b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L10b
            ᛸᛷᲀᲈ r1 = r8.f5296     // Catch: java.lang.Throwable -> L149
            if (r1 == 0) goto L14b
            r1.mo1879(r2)     // Catch: java.lang.Throwable -> L149
            goto L14b
        L149:
            r1 = move-exception
            goto L150
        L14b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L149
            r8.m2285()     // Catch: java.lang.Throwable -> L10b
            goto L18c
        L150:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L149
            throw r1     // Catch: java.lang.Throwable -> L10b
        L152:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L15f
            throw r0     // Catch: java.lang.Throwable -> L15f
        L157:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L15f
            java.lang.String r1 = "Unable to open file."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15f
            throw r0     // Catch: java.lang.Throwable -> L15f
        L15f:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L10b
            throw r0     // Catch: java.lang.Throwable -> L10b
        L164:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L10b
            r2.append(r3)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r0 = ")"
            r2.append(r0)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L10b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10b
            throw r1     // Catch: java.lang.Throwable -> L10b
        L17b:
            java.lang.Object r1 = r8.f5297
            monitor-enter(r1)
            ᛸᛷᲀᲈ r2 = r8.f5296     // Catch: java.lang.Throwable -> L186
            if (r2 == 0) goto L188
            r2.mo1878(r0)     // Catch: java.lang.Throwable -> L186
            goto L188
        L186:
            r8 = move-exception
            goto L18d
        L188:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L186
            r8.m2285()
        L18c:
            return
        L18d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L186
            throw r8
        L18f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf7
            throw r8
        L191:
            ᛸᛶᛵᲀ r8 = (defpackage.DialogC1507) r8
            defpackage.DialogC1507.m2737(r8)
            return
        L197:
            ᛶᛳᲀᲈ r8 = (defpackage.ViewOnLayoutChangeListenerC1047) r8
            ᛶᛵᛵᲇ r8 = r8.f4638
            r8.m2049()
            r8.m2048()
            r8.m2046()
            return
        L1a5:
            ᛶᛵᛵᲇ r8 = (defpackage.ViewOnTouchListenerC1074) r8
            r8.m2049()
            r8.m2048()
            r8.m2046()
            return
    }
}
