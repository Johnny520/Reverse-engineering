package p000;

/* JADX INFO: renamed from: d1 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0196d1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2836;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f2837;

    public /* synthetic */ RunnableC0196d1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2836 = r1
            r0.f2837 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r18 = this;
            r1 = r18
            int r0 = r1.f2836
            r2 = 3
            r3 = 0
            r5 = -1
            r7 = 2
            r8 = 1
            r9 = 0
            switch(r0) {
                case 0: goto L40a;
                case 1: goto L37a;
                case 2: goto L352;
                case 3: goto L2bf;
                case 4: goto L28a;
                case 5: goto L25a;
                case 6: goto L252;
                case 7: goto L223;
                case 8: goto L130;
                case 9: goto L128;
                case 10: goto L67;
                case 11: goto L57;
                case 12: goto L4f;
                case 13: goto L47;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r1.f2837
            va2 r0 = (p000.va2) r0
            android.widget.ProgressBar r2 = r0.f11211
            android.media.MediaPlayer r3 = r0.f11213
            if (r3 != 0) goto L1a
            goto L46
        L1a:
            int r4 = r3.getDuration()
            if (r4 >= r8) goto L21
            goto L22
        L21:
            r8 = r4
        L22:
            r2.setIndeterminate(r9)
            int r4 = r3.getCurrentPosition()
            long r4 = (long) r4
            r6 = 100
            long r4 = r4 * r6
            long r6 = (long) r8
            long r4 = r4 / r6
            int r4 = (int) r4
            r5 = 100
            int r4 = p000.j81.m2906(r4, r9, r5)
            r2.setProgress(r4)
            boolean r2 = r3.isPlaying()
            if (r2 == 0) goto L46
            android.os.Handler r0 = r0.f11212
            r2 = 400(0x190, double:1.976E-321)
            r0.postDelayed(r1, r2)
        L46:
            return
        L47:
            java.lang.Object r0 = r1.f2837
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r0.setScrollState(r9)
            return
        L4f:
            java.lang.Object r0 = r1.f2837
            h92 r0 = (p000.h92) r0
            r0.m2475(r9)
            return
        L57:
            java.lang.Object r0 = r1.f2837
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.ActionMenuView r0 = r0.f759
            if (r0 == 0) goto L66
            androidx.appcompat.widget.γ r0 = r0.f528
            if (r0 == 0) goto L66
            r0.m331()
        L66:
            return
        L67:
            java.lang.Object r0 = r1.f2837
            r2 = r0
            x22 r2 = (p000.x22) r2
            monitor-enter(r2)
            int r0 = r2.f12015     // Catch: java.lang.Throwable -> L125
            int r0 = r0 + r8
            r2.f12015 = r0     // Catch: java.lang.Throwable -> L125
            t22 r0 = r2.m6507()     // Catch: java.lang.Throwable -> L125
            monitor-exit(r2)
            if (r0 != 0) goto L7b
            goto L11a
        L7b:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r3 = r2.getName()
        L83:
            r4 = r0
            java.lang.String r0 = r4.f10139     // Catch: java.lang.Throwable -> La6
            r2.setName(r0)     // Catch: java.lang.Throwable -> La6
            java.lang.Object r0 = r1.f2837     // Catch: java.lang.Throwable -> La6
            x22 r0 = (p000.x22) r0     // Catch: java.lang.Throwable -> La6
            java.util.logging.Logger r7 = r0.f12010     // Catch: java.lang.Throwable -> La6
            w22 r10 = r4.f10141     // Catch: java.lang.Throwable -> La6
            r10.getClass()     // Catch: java.lang.Throwable -> La6
            java.util.logging.Level r0 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> La6
            boolean r11 = r7.isLoggable(r0)     // Catch: java.lang.Throwable -> La6
            if (r11 == 0) goto La8
            long r12 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = "starting"
            p000.p91.m4417(r7, r4, r10, r0)     // Catch: java.lang.Throwable -> La6
            goto La9
        La6:
            r0 = move-exception
            goto L105
        La8:
            r12 = r5
        La9:
            long r14 = r4.mo2576()     // Catch: java.lang.Throwable -> Le4
            if (r11 == 0) goto Lcd
            long r16 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La6
            long r16 = r16 - r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r0.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r11 = "finished run in "
            r0.append(r11)     // Catch: java.lang.Throwable -> La6
            java.lang.String r11 = p000.p91.m4427(r16)     // Catch: java.lang.Throwable -> La6
            r0.append(r11)     // Catch: java.lang.Throwable -> La6
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La6
            p000.p91.m4417(r7, r4, r10, r0)     // Catch: java.lang.Throwable -> La6
        Lcd:
            java.lang.Object r0 = r1.f2837     // Catch: java.lang.Throwable -> La6
            r7 = r0
            x22 r7 = (p000.x22) r7     // Catch: java.lang.Throwable -> La6
            monitor-enter(r7)     // Catch: java.lang.Throwable -> La6
            p000.x22.m6506(r7, r4, r14, r8)     // Catch: java.lang.Throwable -> Le1
            t22 r0 = r7.m6507()     // Catch: java.lang.Throwable -> Le1
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto L83
        Ldd:
            r2.setName(r3)
            goto L11a
        Le1:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La6
            throw r0     // Catch: java.lang.Throwable -> La6
        Le4:
            r0 = move-exception
            if (r11 == 0) goto L104
            long r14 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La6
            long r14 = r14 - r12
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r8.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r11 = "failed a run in "
            r8.append(r11)     // Catch: java.lang.Throwable -> La6
            java.lang.String r11 = p000.p91.m4427(r14)     // Catch: java.lang.Throwable -> La6
            r8.append(r11)     // Catch: java.lang.Throwable -> La6
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> La6
            p000.p91.m4417(r7, r4, r10, r8)     // Catch: java.lang.Throwable -> La6
        L104:
            throw r0     // Catch: java.lang.Throwable -> La6
        L105:
            java.lang.Object r1 = r1.f2837     // Catch: java.lang.Throwable -> L11b
            x22 r1 = (p000.x22) r1     // Catch: java.lang.Throwable -> L11b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L11b
            p000.x22.m6506(r1, r4, r5, r9)     // Catch: java.lang.Throwable -> L11e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11b
            boolean r1 = r0 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> L11b
            if (r1 == 0) goto L11d
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L11b
            r0.interrupt()     // Catch: java.lang.Throwable -> L11b
            goto Ldd
        L11a:
            return
        L11b:
            r0 = move-exception
            goto L121
        L11d:
            throw r0     // Catch: java.lang.Throwable -> L11b
        L11e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11b
            throw r0     // Catch: java.lang.Throwable -> L11b
        L121:
            r2.setName(r3)
            throw r0
        L125:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L128:
            java.lang.Object r0 = r1.f2837
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            r0.m543()
            return
        L130:
            java.lang.Object r0 = r1.f2837
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            xl1 r0 = r0.f1137
            if (r0 == 0) goto L222
            fr r0 = (p000.C0295fr) r0
            java.util.ArrayList r1 = r0.f4068
            java.util.ArrayList r2 = r0.f4072
            java.util.ArrayList r5 = r0.f4074
            java.util.ArrayList r6 = r0.f4073
            boolean r7 = r1.isEmpty()
            java.util.ArrayList r8 = r0.f4070
            boolean r10 = r8.isEmpty()
            java.util.ArrayList r11 = r0.f4071
            boolean r12 = r11.isEmpty()
            java.util.ArrayList r13 = r0.f4069
            boolean r14 = r13.isEmpty()
            if (r7 == 0) goto L162
            if (r10 == 0) goto L162
            if (r14 == 0) goto L162
            if (r12 == 0) goto L162
            goto L222
        L162:
            java.util.Iterator r15 = r1.iterator()
            boolean r16 = r15.hasNext()
            if (r16 != 0) goto L218
            r1.clear()
            if (r10 != 0) goto L1a0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r8)
            r6.add(r1)
            r8.clear()
            if (r7 == 0) goto L19b
            java.util.Iterator r8 = r1.iterator()
            boolean r15 = r8.hasNext()
            if (r15 != 0) goto L192
            r1.clear()
            r6.remove(r1)
            goto L1a0
        L192:
            java.lang.Object r0 = r8.next()
            p000.lz1.m3698(r0)
            r0 = 0
            throw r0
        L19b:
            java.lang.ClassCastException r0 = p000.lz1.m3685(r9, r1)
            throw r0
        L1a0:
            if (r12 != 0) goto L1d3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r11)
            r5.add(r1)
            r11.clear()
            if (r7 == 0) goto L1ce
            java.util.Iterator r6 = r1.iterator()
            boolean r8 = r6.hasNext()
            if (r8 != 0) goto L1c3
            r1.clear()
            r5.remove(r1)
            goto L1d3
        L1c3:
            java.lang.Object r0 = r6.next()
            r0.getClass()
            p000.C1080.m7264()
            goto L222
        L1ce:
            java.lang.ClassCastException r0 = p000.lz1.m3685(r9, r1)
            throw r0
        L1d3:
            if (r14 != 0) goto L222
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r13)
            r2.add(r1)
            r13.clear()
            if (r7 == 0) goto L206
            if (r10 == 0) goto L206
            if (r12 != 0) goto L1ea
            goto L206
        L1ea:
            java.util.Iterator r0 = r1.iterator()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L1fb
            r1.clear()
            r2.remove(r1)
            goto L222
        L1fb:
            java.lang.Object r0 = r0.next()
            r0.getClass()
            p000.C1080.m7264()
            goto L222
        L206:
            if (r10 != 0) goto L20b
            long r5 = r0.f12208
            goto L20c
        L20b:
            r5 = r3
        L20c:
            if (r12 != 0) goto L210
            long r3 = r0.f12209
        L210:
            java.lang.Math.max(r5, r3)
            java.lang.ClassCastException r0 = p000.lz1.m3685(r9, r1)
            throw r0
        L218:
            java.lang.Object r0 = r15.next()
            r0.getClass()
            p000.C1080.m7264()
        L222:
            return
        L223:
            java.lang.Object r0 = r1.f2837
            androidx.appcompat.widget.θ r0 = (androidx.appcompat.widget.C0035) r0
            androidx.appcompat.widget.DropDownListView r1 = r0.f834
            if (r1 == 0) goto L251
            boolean r1 = r1.isAttachedToWindow()
            if (r1 == 0) goto L251
            androidx.appcompat.widget.DropDownListView r1 = r0.f834
            int r1 = r1.getCount()
            androidx.appcompat.widget.DropDownListView r2 = r0.f834
            int r2 = r2.getChildCount()
            if (r1 <= r2) goto L251
            androidx.appcompat.widget.DropDownListView r1 = r0.f834
            int r1 = r1.getChildCount()
            int r2 = r0.f844
            if (r1 > r2) goto L251
            m5 r1 = r0.f831
            r1.setInputMethodMode(r7)
            r0.mo342()
        L251:
            return
        L252:
            java.lang.Object r0 = r1.f2837
            b70 r0 = (p000.b70) r0
            r0.m799(r8)
            return
        L25a:
            java.lang.Object r0 = r1.f2837
            o00 r0 = (p000.o00) r0
            android.animation.ValueAnimator r1 = r0.f7851
            int r3 = r0.f7852
            if (r3 == r8) goto L267
            if (r3 == r7) goto L26a
            goto L289
        L267:
            r1.cancel()
        L26a:
            r0.f7852 = r2
            java.lang.Object r0 = r1.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float[] r2 = new float[r7]
            r2[r9] = r0
            r0 = 0
            r2[r8] = r0
            r1.setFloatValues(r2)
            r0 = 500(0x1f4, float:7.0E-43)
            long r2 = (long) r0
            r1.setDuration(r2)
            r1.start()
        L289:
            return
        L28a:
            boolean r0 = p000.C1036yw.f12847
            if (r0 != 0) goto L28f
            goto L2be
        L28f:
            android.os.Handler r0 = p000.C1036yw.f12843     // Catch: java.lang.Throwable -> L2b7
            xw r0 = p000.C1036yw.m7035()     // Catch: java.lang.Throwable -> L2b7
            boolean r2 = r0.f12330     // Catch: java.lang.Throwable -> L2b7
            if (r2 == 0) goto L2a0
            java.lang.Object r2 = r1.f2837     // Catch: java.lang.Throwable -> L2b7
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L2b7
            p000.C1036yw.m7032(r2, r0)     // Catch: java.lang.Throwable -> L2b7
        L2a0:
            boolean r2 = r0.f12335     // Catch: java.lang.Throwable -> L2b7
            if (r2 == 0) goto L2ab
            java.lang.Object r2 = r1.f2837     // Catch: java.lang.Throwable -> L2b7
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.Throwable -> L2b7
            p000.C1036yw.m7033(r2, r0)     // Catch: java.lang.Throwable -> L2b7
        L2ab:
            boolean r2 = r0.f12330     // Catch: java.lang.Throwable -> L2b7
            if (r2 != 0) goto L2b7
            boolean r0 = r0.f12335     // Catch: java.lang.Throwable -> L2b7
            if (r0 != 0) goto L2b7
            p000.C1036yw.m7039()     // Catch: java.lang.Throwable -> L2b7
            goto L2be
        L2b7:
            android.os.Handler r0 = p000.C1036yw.f12843
            r2 = 10000(0x2710, double:4.9407E-320)
            r0.postDelayed(r1, r2)
        L2be:
            return
        L2bf:
            java.lang.Object r0 = r1.f2837
            q2 r0 = (p000.C0709q2) r0
            java.lang.Object r1 = r0.f8802
            androidx.drawerlayout.widget.DrawerLayout r1 = (androidx.drawerlayout.widget.DrawerLayout) r1
            java.lang.Object r3 = r0.f8800
            h92 r3 = (p000.h92) r3
            int r3 = r3.f4657
            int r4 = r0.f8799
            if (r4 != r2) goto L2d3
            r5 = r8
            goto L2d4
        L2d3:
            r5 = r9
        L2d4:
            r6 = 5
            if (r5 == 0) goto L2e6
            android.view.View r7 = r1.m453(r2)
            if (r7 == 0) goto L2e3
            int r10 = r7.getWidth()
            int r10 = -r10
            goto L2e4
        L2e3:
            r10 = r9
        L2e4:
            int r10 = r10 + r3
            goto L2ef
        L2e6:
            android.view.View r7 = r1.m453(r6)
            int r10 = r1.getWidth()
            int r10 = r10 - r3
        L2ef:
            if (r7 == 0) goto L351
            if (r5 == 0) goto L2f9
            int r3 = r7.getLeft()
            if (r3 < r10) goto L301
        L2f9:
            if (r5 != 0) goto L351
            int r3 = r7.getLeft()
            if (r3 <= r10) goto L351
        L301:
            int r3 = r1.m455(r7)
            if (r3 != 0) goto L351
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            kw r3 = (p000.C0490kw) r3
            java.lang.Object r0 = r0.f8800
            h92 r0 = (p000.h92) r0
            int r5 = r7.getTop()
            r0.m2477(r7, r10, r5)
            r3.f6132 = r8
            r1.invalidate()
            if (r4 != r2) goto L320
            r2 = r6
        L320:
            android.view.View r0 = r1.m453(r2)
            if (r0 == 0) goto L329
            r1.m451(r0)
        L329:
            boolean r0 = r1.f1088
            if (r0 != 0) goto L351
            long r10 = android.os.SystemClock.uptimeMillis()
            r16 = 0
            r17 = 0
            r14 = 3
            r15 = 0
            r12 = r10
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10, r12, r14, r15, r16, r17)
            int r2 = r1.getChildCount()
        L340:
            if (r9 >= r2) goto L34c
            android.view.View r3 = r1.getChildAt(r9)
            r3.dispatchTouchEvent(r0)
            int r9 = r9 + 1
            goto L340
        L34c:
            r0.recycle()
            r1.f1088 = r8
        L351:
            return
        L352:
            java.lang.Object r0 = r1.f2837     // Catch: java.lang.NullPointerException -> L35a java.lang.IllegalStateException -> L35c
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0     // Catch: java.lang.NullPointerException -> L35a java.lang.IllegalStateException -> L35c
            androidx.activity.ComponentActivity.m188(r0)     // Catch: java.lang.NullPointerException -> L35a java.lang.IllegalStateException -> L35c
            goto L378
        L35a:
            r0 = move-exception
            goto L35e
        L35c:
            r0 = move-exception
            goto L36c
        L35e:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L36b
            goto L378
        L36b:
            throw r0
        L36c:
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "Can not perform this action after onSaveInstanceState"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L379
        L378:
            return
        L379:
            throw r0
        L37a:
            java.lang.Object r0 = r1.f2837
            iu0 r0 = (p000.iu0) r0
            android.view.View r2 = r0.f5191
            u7 r7 = r0.f5189
            boolean r8 = r0.f5203
            if (r8 != 0) goto L388
            goto L401
        L388:
            boolean r8 = r0.f5201
            if (r8 == 0) goto L39c
            r0.f5201 = r9
            long r10 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r7.f10620 = r10
            r7.f10622 = r5
            r7.f10621 = r10
            r5 = 1056964608(0x3f000000, float:0.5)
            r7.f10623 = r5
        L39c:
            long r5 = r7.f10622
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3b1
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r10 = r7.f10622
            int r8 = r7.f10624
            long r12 = (long) r8
            long r10 = r10 + r12
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L3b1
            goto L3b7
        L3b1:
            boolean r5 = r0.m2804()
            if (r5 != 0) goto L3ba
        L3b7:
            r0.f5203 = r9
            goto L401
        L3ba:
            boolean r5 = r0.f5202
            if (r5 == 0) goto L3d5
            r0.f5202 = r9
            long r10 = android.os.SystemClock.uptimeMillis()
            r16 = 0
            r17 = 0
            r14 = 3
            r15 = 0
            r12 = r10
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r10, r12, r14, r15, r16, r17)
            r2.onTouchEvent(r5)
            r5.recycle()
        L3d5:
            long r5 = r7.f10621
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L402
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r5 = r7.m5791(r3)
            r6 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r6 = r6 * r5
            float r6 = r6 * r5
            r8 = 1082130432(0x40800000, float:4.0)
            float r5 = r5 * r8
            float r5 = r5 + r6
            long r8 = r7.f10621
            long r8 = r3 - r8
            r7.f10621 = r3
            float r3 = (float) r8
            float r3 = r3 * r5
            float r4 = r7.f10619
            float r3 = r3 * r4
            int r3 = (int) r3
            android.widget.ListView r0 = r0.f5205
            r0.scrollListBy(r3)
            java.util.WeakHashMap r0 = p000.b92.f1572
            r2.postOnAnimation(r1)
        L401:
            return
        L402:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot compute scroll delta before calling start()"
            r0.<init>(r1)
            throw r0
        L40a:
            java.lang.Object r0 = r1.f2837
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.p001ui.platform.AndroidComposeView) r0
            r0.removeCallbacks(r1)
            android.view.MotionEvent r2 = r0.f954
            if (r2 == 0) goto L42e
            int r1 = r2.getActionMasked()
            r3 = 10
            if (r1 == r3) goto L42e
            if (r1 == r8) goto L42e
            r3 = 7
            if (r1 == r3) goto L427
            r4 = 9
            if (r1 == r4) goto L427
            r3 = r7
        L427:
            long r4 = r0.f955
            r6 = 0
            r1 = r0
            r1.m380(r2, r3, r4, r6)
        L42e:
            return
    }
}
