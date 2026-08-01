package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛶᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0286 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1098;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1099;

    public /* synthetic */ RunnableC0286(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1098 = r1
            r0.f1099 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0286(java.lang.String r1, java.lang.String r2, xhss.C1197 r3) {
            r0 = this;
            r1 = 2
            r0.f1098 = r1
            r0.<init>()
            r0.f1099 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            int r0 = r15.f1098
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Object r15 = r15.f1099
            switch(r0) {
                case 0: goto L1fd;
                case 1: goto L1f2;
                case 2: goto L95;
                case 3: goto L76;
                case 4: goto L13;
                default: goto Lb;
            }
        Lb:
            xhss.ᛸᛶᲀᲁ r15 = (xhss.RunnableC0778) r15
            xhss.ᛲᛲᲀᛷ r15 = r15.f2565
            r15.m367()
            return
        L13:
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.util.Iterator r15 = r15.iterator()
        L19:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r15.next()
            int r1 = r4 + 1
            if (r4 < 0) goto L71
            android.view.View r0 = (android.view.View) r0
            android.view.ViewPropertyAnimator r3 = r0.animate()
            r3.cancel()
            r3 = 0
            r0.setAlpha(r3)
            android.content.res.Resources r5 = r0.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r6 = 1094713344(0x41400000, float:12.0)
            float r5 = r5 * r6
            r0.setTranslationY(r5)
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r5)
            android.view.ViewPropertyAnimator r0 = r0.translationY(r3)
            long r3 = (long) r4
            r5 = 30
            long r3 = r3 * r5
            r5 = 80
            long r3 = r3 + r5
            android.view.ViewPropertyAnimator r0 = r0.setStartDelay(r3)
            r3 = 220(0xdc, double:1.087E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r3)
            r0.start()
            r4 = r1
            goto L19
        L71:
            xhss.AbstractC0086.m244()
            throw r2
        L75:
            return
        L76:
            xhss.ᛷᛸᛴᛵ r15 = (xhss.C0684) r15
            androidx.lifecycle.ᛷᛵᛵᲈ r0 = r15.f2317
            int r1 = r15.f2311
            if (r1 != 0) goto L85
            r15.f2312 = r3
            xhss.ᲈᲀᛵᛸ r1 = xhss.EnumC1174.ON_PAUSE
            r0.m28(r1)
        L85:
            int r1 = r15.f2314
            if (r1 != 0) goto L94
            boolean r1 = r15.f2312
            if (r1 == 0) goto L94
            xhss.ᲈᲀᛵᛸ r1 = xhss.EnumC1174.ON_STOP
            r0.m28(r1)
            r15.f2316 = r3
        L94:
            return
        L95:
            xhss.ᲈᲇᲁᛲ r15 = (xhss.C1197) r15
            xhss.ᲈᛵᲈᛶ r0 = xhss.C1144.f3704
            java.lang.ref.WeakReference r5 = xhss.C1144.f3706
            if (r5 == 0) goto L1f1
            java.lang.Object r5 = r5.get()
            if (r5 != 0) goto La5
            goto L1f1
        La5:
            java.util.List r0 = r0.m1843(r5)
            if (r0 != 0) goto Lad
            goto L1f1
        Lad:
            java.util.Iterator r6 = r0.iterator()
            r7 = r4
        Lb2:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Le9
            java.lang.Object r8 = r6.next()
            java.lang.Object r8 = xhss.C1144.m1830(r8)
            java.util.Set r8 = xhss.C1144.m1842(r8)
            if (r8 == 0) goto Lcd
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto Lcd
            goto Le6
        Lcd:
            java.util.Iterator r8 = r8.iterator()
        Ld1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Le6
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            xhss.ᛷᛸᛵᛶ r10 = r15.f3854
            boolean r9 = r10.containsKey(r9)
            if (r9 == 0) goto Ld1
            goto Lea
        Le6:
            int r7 = r7 + 1
            goto Lb2
        Le9:
            r7 = -1
        Lea:
            r8 = -278211263301701(0xffff02f7e47a77bb, double:NaN)
            if (r7 >= 0) goto L111
            r1 = -307876602415173(0xfffee7fce47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r1 = -307953911826501(0xfffee7eae47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r1 = -307983976597573(0xfffee7e3e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r0.size()
        /* removed unused decoded string */ 
            goto L1f1
        L111:
            java.lang.Class r15 = r5.getClass()     // Catch: java.lang.Throwable -> L15e
            java.lang.reflect.Method[] r15 = r15.getMethods()     // Catch: java.lang.Throwable -> L15e
            r10 = -308018336335941(0xfffee7dbe47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Throwable -> L15e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15e
            r0.<init>()     // Catch: java.lang.Throwable -> L15e
            int r6 = r15.length     // Catch: java.lang.Throwable -> L15e
            r10 = r4
        L128:
            if (r10 >= r6) goto L164
            r11 = r15[r10]     // Catch: java.lang.Throwable -> L15e
            java.lang.String r12 = r11.getName()     // Catch: java.lang.Throwable -> L15e
            r13 = -308087055812677(0xfffee7cbe47a77bb, double:NaN)
            java.lang.String r13 = "notifyItemChanged"     // Catch: java.lang.Throwable -> L15e
            boolean r12 = xhss.AbstractC0007.m97(r12, r13)     // Catch: java.lang.Throwable -> L15e
            if (r12 == 0) goto L161
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> L15e
            r13 = -308164365224005(0xfffee7b9e47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Throwable -> L15e
            int r13 = r12.length     // Catch: java.lang.Throwable -> L15e
            if (r13 != 0) goto L150
            r12 = r2
            goto L152
        L150:
            r12 = r12[r4]     // Catch: java.lang.Throwable -> L15e
        L152:
            java.lang.Class r13 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L15e
            boolean r12 = xhss.AbstractC0007.m97(r12, r13)     // Catch: java.lang.Throwable -> L15e
            if (r12 == 0) goto L161
            r0.add(r11)     // Catch: java.lang.Throwable -> L15e
            goto L161
        L15e:
            r15 = move-exception
            goto L1d7
        L161:
            int r10 = r10 + 1
            goto L128
        L164:
            java.util.Iterator r15 = r0.iterator()     // Catch: java.lang.Throwable -> L15e
        L168:
            boolean r4 = r15.hasNext()     // Catch: java.lang.Throwable -> L15e
            if (r4 == 0) goto L17c
            java.lang.Object r4 = r15.next()     // Catch: java.lang.Throwable -> L15e
            r6 = r4
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L15e
            int r6 = r6.getParameterCount()     // Catch: java.lang.Throwable -> L15e
            if (r6 != r1) goto L168
            goto L17d
        L17c:
            r4 = r2
        L17d:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L15e
            if (r4 == 0) goto L196
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L15e
            r0 = -308263149471813(0xfffee7a2e47a77bb, double:NaN)
            java.lang.String r0 = "revokeTrace"     // Catch: java.lang.Throwable -> L15e
            java.lang.Object[] r15 = new java.lang.Object[]{r15, r0}     // Catch: java.lang.Throwable -> L15e
            r4.invoke(r5, r15)     // Catch: java.lang.Throwable -> L15e
            goto L1bd
        L196:
            java.util.Iterator r15 = r0.iterator()     // Catch: java.lang.Throwable -> L15e
        L19a:
            boolean r0 = r15.hasNext()     // Catch: java.lang.Throwable -> L15e
            if (r0 == 0) goto L1ae
            java.lang.Object r0 = r15.next()     // Catch: java.lang.Throwable -> L15e
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L15e
            int r1 = r1.getParameterCount()     // Catch: java.lang.Throwable -> L15e
            if (r1 != r3) goto L19a
            r2 = r0
        L1ae:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L15e
            if (r2 == 0) goto L1c9
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L15e
            java.lang.Object[] r15 = new java.lang.Object[]{r15}     // Catch: java.lang.Throwable -> L15e
            r2.invoke(r5, r15)     // Catch: java.lang.Throwable -> L15e
        L1bd:
            r0 = -308314689079365(0xfffee796e47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Throwable -> L15e
        /* removed unused decoded string */ // Catch: java.lang.Throwable -> L15e
            goto L1d4
        L1c9:
            r0 = -308396293457989(0xfffee783e47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Throwable -> L15e
        /* removed unused decoded string */ // Catch: java.lang.Throwable -> L15e
        L1d4:
            xhss.ᛵᛷᲈᛶ r15 = xhss.C0500.f1817     // Catch: java.lang.Throwable -> L15e
            goto L1dd
        L1d7:
            xhss.ᲈᛳᛱᲇ r0 = new xhss.ᲈᛳᛱᲇ
            r0.<init>(r15)
            r15 = r0
        L1dd:
            java.lang.Throwable r15 = xhss.AbstractC0134.m364(r15)
            if (r15 == 0) goto L1f1
            r0 = -308507962607685(0xfffee769e47a77bb, double:NaN)
        /* removed unused decoded string */ 
            r15.getMessage()
        /* removed unused decoded string */ 
        L1f1:
            return
        L1f2:
            android.app.Activity r15 = (android.app.Activity) r15
            xhss.ᛴᛶᛴᛲ r0 = xhss.C0371.f1353
            r0.getClass()
            xhss.C0371.m722(r15)
            return
        L1fd:
            xhss.ᛲᛳᛲᛲ r15 = (xhss.C0140) r15
            java.lang.String r0 = "fetchFonts result is not OK. ("
            java.lang.Object r2 = r15.f610
            monitor-enter(r2)
            xhss.ᛱᛱᛷᛸ r3 = r15.f608     // Catch: java.lang.Throwable -> L20b
            if (r3 != 0) goto L20e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20b
            goto L2a0
        L20b:
            r15 = move-exception
            goto L2a3
        L20e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20b
            xhss.ᛵᛶᲈᛳ r2 = r15.m370()     // Catch: java.lang.Throwable -> L21f
            int r3 = r2.f1791     // Catch: java.lang.Throwable -> L21f
            if (r3 != r1) goto L221
            java.lang.Object r1 = r15.f610     // Catch: java.lang.Throwable -> L21f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L21f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21c
            goto L221
        L21c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21c
            throw r0     // Catch: java.lang.Throwable -> L21f
        L21f:
            r0 = move-exception
            goto L28f
        L221:
            if (r3 != 0) goto L278
            java.lang.String r0 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L273
            android.content.Context r0 = r15.f605     // Catch: java.lang.Throwable -> L273
            xhss.ᛵᛶᲈᛳ[] r1 = new xhss.C0486[]{r2}     // Catch: java.lang.Throwable -> L273
            android.graphics.Typeface r0 = xhss.AbstractC0101.m270(r0, r1, r4)     // Catch: java.lang.Throwable -> L273
            android.content.Context r1 = r15.f605     // Catch: java.lang.Throwable -> L273
            android.net.Uri r2 = r2.f1789     // Catch: java.lang.Throwable -> L273
            java.nio.MappedByteBuffer r1 = xhss.AbstractC0694.m1215(r1, r2)     // Catch: java.lang.Throwable -> L273
            if (r1 == 0) goto L26b
            if (r0 == 0) goto L26b
            java.lang.String r2 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L266
            xhss.ᲇᛸᛶ r2 = new xhss.ᲇᛸᛶ     // Catch: java.lang.Throwable -> L266
            xhss.ᲁᛸᛱᲀ r1 = xhss.AbstractC0473.m857(r1)     // Catch: java.lang.Throwable -> L266
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L266
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L273
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L21f
            java.lang.Object r0 = r15.f610     // Catch: java.lang.Throwable -> L21f
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L21f
            xhss.ᛱᛱᛷᛸ r1 = r15.f608     // Catch: java.lang.Throwable -> L25d
            if (r1 == 0) goto L25f
            r1.mo105(r2)     // Catch: java.lang.Throwable -> L25d
            goto L25f
        L25d:
            r1 = move-exception
            goto L264
        L25f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25d
            r15.m371()     // Catch: java.lang.Throwable -> L21f
            goto L2a0
        L264:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25d
            throw r1     // Catch: java.lang.Throwable -> L21f
        L266:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L273
            throw r0     // Catch: java.lang.Throwable -> L273
        L26b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L273
            java.lang.String r1 = "Unable to open file."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L273
            throw r0     // Catch: java.lang.Throwable -> L273
        L273:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L21f
            throw r0     // Catch: java.lang.Throwable -> L21f
        L278:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L21f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L21f
            r2.append(r3)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r0 = ")"
            r2.append(r0)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L21f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L21f
            throw r1     // Catch: java.lang.Throwable -> L21f
        L28f:
            java.lang.Object r1 = r15.f610
            monitor-enter(r1)
            xhss.ᛱᛱᛷᛸ r2 = r15.f608     // Catch: java.lang.Throwable -> L29a
            if (r2 == 0) goto L29c
            r2.mo106(r0)     // Catch: java.lang.Throwable -> L29a
            goto L29c
        L29a:
            r15 = move-exception
            goto L2a1
        L29c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29a
            r15.m371()
        L2a0:
            return
        L2a1:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29a
            throw r15
        L2a3:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20b
            throw r15
    }
}
