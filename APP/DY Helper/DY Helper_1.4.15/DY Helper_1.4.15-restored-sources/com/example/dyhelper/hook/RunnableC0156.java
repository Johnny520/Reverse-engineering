package com.example.dyhelper.hook;

/* JADX INFO: renamed from: com.example.dyhelper.hook.β */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0156 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2399;

    public /* synthetic */ RunnableC0156(int r1) {
            r0 = this;
            r0.f2399 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f2399
            switch(r0) {
                case 0: goto L5f;
                default: goto L5;
            }
        L5:
            float r0 = p000.h20.f4538
            r1 = 1029785518(0x3d6147ae, float:0.055)
            float r0 = r0 + r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 % r1
            p000.h20.f4538 = r0
            java.util.WeakHashMap r0 = p000.h20.f4536
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L1c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L52
            java.lang.Object r3 = r0.next()
            com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView r3 = (com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView) r3
            int r4 = r3.f2249
            if (r4 == 0) goto L4c
            boolean r4 = r3.isAttachedToWindow()
            if (r4 != 0) goto L33
            goto L4c
        L33:
            int r2 = r3.getVisibility()
            if (r2 != 0) goto L4a
            boolean r2 = r3.isShown()
            if (r2 == 0) goto L4a
            int r2 = r3.getWidth()
            if (r2 <= 0) goto L4a
            float r2 = p000.h20.f4538
            com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView.m1347(r3, r2)
        L4a:
            r2 = 1
            goto L1c
        L4c:
            r3.f2248 = r1
            r0.remove()
            goto L1c
        L52:
            if (r2 == 0) goto L5c
            android.os.Handler r0 = p000.h20.f4535
            r1 = 120(0x78, double:5.93E-322)
            r0.postDelayed(r5, r1)
            goto L5e
        L5c:
            p000.h20.f4537 = r1
        L5e:
            return
        L5f:
            java.util.WeakHashMap r0 = p000.g20.f4214
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L69:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r0.next()
            com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView r1 = (com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView) r1
            boolean r2 = r1.isAttachedToWindow()
            if (r2 != 0) goto L7f
            r0.remove()
            goto L69
        L7f:
            r1.m1352()
            goto L69
        L83:
            java.util.WeakHashMap r0 = p000.g20.f4214
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8f
            r5 = 0
            p000.g20.f4215 = r5
            goto L96
        L8f:
            android.os.Handler r0 = p000.g20.f4213
            r1 = 50
            r0.postDelayed(r5, r1)
        L96:
            return
    }
}
