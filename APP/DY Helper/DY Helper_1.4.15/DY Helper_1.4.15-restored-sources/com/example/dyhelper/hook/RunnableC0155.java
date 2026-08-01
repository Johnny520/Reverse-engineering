package com.example.dyhelper.hook;

/* JADX INFO: renamed from: com.example.dyhelper.hook.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0155 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2397;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView f2398;

    public /* synthetic */ RunnableC0155(com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView r1, int r2) {
            r0 = this;
            r0.f2397 = r2
            r0.f2398 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f2397
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            r0 = 0
            com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView r1 = r1.f2398
            r1.f2252 = r0
            boolean r0 = r1.f2248
            if (r0 != 0) goto L21
            int r0 = r1.f2249
            if (r0 == 0) goto L21
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L21
            int r0 = r1.getWidth()
            if (r0 <= 0) goto L21
            r1.m1350()
        L21:
            return
        L22:
            com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView r1 = r1.f2398
            int r0 = r1.f2249
            if (r0 == 0) goto L41
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L41
            int r0 = r1.getWidth()
            if (r0 <= 0) goto L41
            boolean r0 = r1.f2248
            if (r0 != 0) goto L3c
            r1.m1350()
            goto L41
        L3c:
            float r0 = p000.h20.f4538
            com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView.m1347(r1, r0)
        L41:
            return
    }
}
