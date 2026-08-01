package defpackage;

/* JADX INFO: renamed from: ᲁᲁᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1936 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0857 f8435;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.util.ArrayList f8436;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8437;

    public /* synthetic */ RunnableC1936(defpackage.C0857 r1, java.util.ArrayList r2, int r3) {
            r0 = this;
            r0.f8437 = r3
            r0.f8435 = r1
            r0.f8436 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            int r0 = r15.f8437
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            java.util.ArrayList r3 = r15.f8436
            switch(r0) {
                case 0: goto Ld7;
                case 1: goto L4a;
                default: goto La;
            }
        La:
            java.util.Iterator r0 = r3.iterator()
        Le:
            boolean r1 = r0.hasNext()
            ᛵᛳᲁᛳ r4 = r15.f8435
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            ᲈᛸᲈᛷ r1 = (defpackage.AbstractC2316) r1
            r4.getClass()
            android.view.View r5 = r1.f9791
            android.view.ViewPropertyAnimator r6 = r5.animate()
            java.util.ArrayList r7 = r4.f3902
            r7.add(r1)
            android.view.ViewPropertyAnimator r7 = r6.alpha(r2)
            long r8 = r4.f691
            android.view.ViewPropertyAnimator r7 = r7.setDuration(r8)
            ᛷᲈᲀᲇ r8 = new ᛷᲈᲀᲇ
            r8.<init>(r4, r1, r5, r6)
            android.view.ViewPropertyAnimator r1 = r7.setListener(r8)
            r1.start()
            goto Le
        L41:
            r3.clear()
            java.util.ArrayList r15 = r4.f3900
            r15.remove(r3)
            return
        L4a:
            java.util.Iterator r0 = r3.iterator()
        L4e:
            boolean r4 = r0.hasNext()
            ᛵᛳᲁᛳ r6 = r15.f8435
            if (r4 == 0) goto Lce
            java.lang.Object r4 = r0.next()
            r7 = r4
            ᲇᲈᛶᛵ r7 = (defpackage.C2162) r7
            java.util.ArrayList r4 = r6.f3907
            long r11 = r6.f694
            ᲈᛸᲈᛷ r5 = r7.f9215
            r8 = 0
            if (r5 != 0) goto L68
            r9 = r8
            goto L6b
        L68:
            android.view.View r5 = r5.f9791
            r9 = r5
        L6b:
            ᲈᛸᲈᛷ r5 = r7.f9216
            if (r5 == 0) goto L71
            android.view.View r8 = r5.f9791
        L71:
            r13 = r8
            if (r9 == 0) goto La4
            android.view.ViewPropertyAnimator r5 = r9.animate()
            android.view.ViewPropertyAnimator r8 = r5.setDuration(r11)
            ᲈᛸᲈᛷ r5 = r7.f9215
            r4.add(r5)
            int r5 = r7.f9212
            int r10 = r7.f9214
            int r5 = r5 - r10
            float r5 = (float) r5
            r8.translationX(r5)
            int r5 = r7.f9217
            int r10 = r7.f9213
            int r5 = r5 - r10
            float r5 = (float) r5
            r8.translationY(r5)
            android.view.ViewPropertyAnimator r14 = r8.alpha(r1)
            ᲁᛲᛲᛳ r5 = new ᲁᛲᛲᛳ
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            android.view.ViewPropertyAnimator r5 = r14.setListener(r5)
            r5.start()
        La4:
            if (r13 == 0) goto L4e
            android.view.ViewPropertyAnimator r8 = r13.animate()
            ᲈᛸᲈᛷ r5 = r7.f9216
            r4.add(r5)
            android.view.ViewPropertyAnimator r4 = r8.translationX(r1)
            android.view.ViewPropertyAnimator r4 = r4.translationY(r1)
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r11)
            android.view.ViewPropertyAnimator r4 = r4.alpha(r2)
            ᲁᛲᛲᛳ r5 = new ᲁᛲᛲᛳ
            r10 = 1
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            android.view.ViewPropertyAnimator r4 = r4.setListener(r5)
            r4.start()
            goto L4e
        Lce:
            r3.clear()
            java.util.ArrayList r15 = r6.f3905
            r15.remove(r3)
            return
        Ld7:
            java.util.Iterator r0 = r3.iterator()
        Ldb:
            boolean r2 = r0.hasNext()
            ᛵᛳᲁᛳ r5 = r15.f8435
            if (r2 == 0) goto L12c
            java.lang.Object r2 = r0.next()
            ᛳᛵᛴᛶ r2 = (defpackage.C0479) r2
            ᲈᛸᲈᛷ r6 = r2.f2408
            int r4 = r2.f2409
            int r7 = r2.f2407
            int r8 = r2.f2406
            int r2 = r2.f2405
            r5.getClass()
            r9 = r8
            android.view.View r8 = r6.f9791
            int r4 = r9 - r4
            int r9 = r2 - r7
            if (r4 == 0) goto L106
            android.view.ViewPropertyAnimator r2 = r8.animate()
            r2.translationX(r1)
        L106:
            if (r9 == 0) goto L10f
            android.view.ViewPropertyAnimator r2 = r8.animate()
            r2.translationY(r1)
        L10f:
            android.view.ViewPropertyAnimator r10 = r8.animate()
            java.util.ArrayList r2 = r5.f3908
            r2.add(r6)
            long r11 = r5.f689
            android.view.ViewPropertyAnimator r2 = r10.setDuration(r11)
            r7 = r4
            ᲈᛴᛵᛶ r4 = new ᲈᛴᛵᛶ
            r4.<init>(r5, r6, r7, r8, r9, r10)
            android.view.ViewPropertyAnimator r2 = r2.setListener(r4)
            r2.start()
            goto Ldb
        L12c:
            r3.clear()
            java.util.ArrayList r15 = r5.f3903
            r15.remove(r3)
            return
    }
}
