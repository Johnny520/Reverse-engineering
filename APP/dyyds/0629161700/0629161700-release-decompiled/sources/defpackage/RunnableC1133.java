package defpackage;

/* JADX INFO: renamed from: ᛶᛸᲇᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1133 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0055 f5035;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5036;

    public /* synthetic */ RunnableC1133(defpackage.C0055 r1, int r2) {
            r0 = this;
            r0.f5036 = r2
            r0.f5035 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r18 = this;
            r0 = r18
            int r1 = r0.f5036
            ᛱᛳᛶᛱ r0 = r0.f5035
            switch(r1) {
                case 0: goto L119;
                default: goto L9;
            }
        L9:
            ᛱᛳᛸᛶ r1 = r0.f658
            if (r1 == 0) goto L115
            ᛵᛳᲁᛳ r1 = (defpackage.C0857) r1
            long r4 = r1.f690
            java.util.ArrayList r6 = r1.f3898
            boolean r7 = r6.isEmpty()
            java.util.ArrayList r8 = r1.f3904
            boolean r9 = r8.isEmpty()
            java.util.ArrayList r10 = r1.f3899
            boolean r11 = r10.isEmpty()
            java.util.ArrayList r12 = r1.f3901
            boolean r13 = r12.isEmpty()
            if (r7 == 0) goto L33
            if (r9 == 0) goto L33
            if (r13 == 0) goto L33
            if (r11 == 0) goto L33
            goto L115
        L33:
            java.util.Iterator r14 = r6.iterator()
        L37:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L6c
            java.lang.Object r15 = r14.next()
            ᲈᛸᲈᛷ r15 = (defpackage.AbstractC2316) r15
            android.view.View r2 = r15.f9791
            android.view.ViewPropertyAnimator r3 = r2.animate()
            r16 = r6
            java.util.ArrayList r6 = r1.f3906
            r6.add(r15)
            android.view.ViewPropertyAnimator r6 = r3.setDuration(r4)
            r17 = r7
            r7 = 0
            android.view.ViewPropertyAnimator r6 = r6.alpha(r7)
            ᛷᲈᲀᲇ r7 = new ᛷᲈᲀᲇ
            r7.<init>(r1, r15, r3, r2)
            android.view.ViewPropertyAnimator r2 = r6.setListener(r7)
            r2.start()
            r6 = r16
            r7 = r17
            goto L37
        L6c:
            r16 = r6
            r17 = r7
            r16.clear()
            if (r9 != 0) goto La0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r8)
            java.util.ArrayList r3 = r1.f3903
            r3.add(r2)
            r8.clear()
            ᲁᲁᲈᛲ r3 = new ᲁᲁᲈᛲ
            r6 = 0
            r3.<init>(r1, r2, r6)
            if (r17 != 0) goto L9d
            java.lang.Object r2 = r2.get(r6)
            ᛳᛵᛴᛶ r2 = (defpackage.C0479) r2
            ᲈᛸᲈᛷ r2 = r2.f2408
            android.view.View r2 = r2.f9791
            java.util.WeakHashMap r6 = defpackage.AbstractC0858.f3911
            r2.postOnAnimationDelayed(r3, r4)
            goto La0
        L9d:
            r3.run()
        La0:
            if (r11 != 0) goto Lce
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r10)
            java.util.ArrayList r3 = r1.f3905
            r3.add(r2)
            r10.clear()
            ᲁᲁᲈᛲ r3 = new ᲁᲁᲈᛲ
            r6 = 1
            r3.<init>(r1, r2, r6)
            if (r17 != 0) goto Lcb
            r6 = 0
            java.lang.Object r2 = r2.get(r6)
            ᲇᲈᛶᛵ r2 = (defpackage.C2162) r2
            ᲈᛸᲈᛷ r2 = r2.f9215
            android.view.View r2 = r2.f9791
            java.util.WeakHashMap r6 = defpackage.AbstractC0858.f3911
            r2.postOnAnimationDelayed(r3, r4)
            goto Lce
        Lcb:
            r3.run()
        Lce:
            if (r13 != 0) goto L115
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r12)
            java.util.ArrayList r3 = r1.f3900
            r3.add(r2)
            r12.clear()
            ᲁᲁᲈᛲ r3 = new ᲁᲁᲈᛲ
            r6 = 2
            r3.<init>(r1, r2, r6)
            if (r17 == 0) goto Lf1
            if (r9 == 0) goto Lf1
            if (r11 != 0) goto Led
            goto Lf1
        Led:
            r3.run()
            goto L115
        Lf1:
            r6 = 0
            if (r17 != 0) goto Lf6
            goto Lf7
        Lf6:
            r4 = r6
        Lf7:
            if (r9 != 0) goto Lfc
            long r8 = r1.f689
            goto Lfd
        Lfc:
            r8 = r6
        Lfd:
            if (r11 != 0) goto L101
            long r6 = r1.f694
        L101:
            long r6 = java.lang.Math.max(r8, r6)
            long r6 = r6 + r4
            r1 = 0
            java.lang.Object r2 = r2.get(r1)
            ᲈᛸᲈᛷ r2 = (defpackage.AbstractC2316) r2
            android.view.View r2 = r2.f9791
            java.util.WeakHashMap r4 = defpackage.AbstractC0858.f3911
            r2.postOnAnimationDelayed(r3, r6)
            goto L116
        L115:
            r1 = 0
        L116:
            r0.f668 = r1
            return
        L119:
            boolean r1 = r0.f666
            if (r1 == 0) goto L137
            boolean r1 = r0.isLayoutRequested()
            if (r1 == 0) goto L124
            goto L137
        L124:
            boolean r1 = r0.f622
            if (r1 != 0) goto L12c
            r0.requestLayout()
            goto L137
        L12c:
            boolean r1 = r0.f679
            if (r1 == 0) goto L134
            r6 = 1
            r0.f684 = r6
            goto L137
        L134:
            r0.m446()
        L137:
            return
    }
}
