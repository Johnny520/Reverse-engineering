package defpackage;

/* JADX INFO: renamed from: ᛶᛱᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1017 implements android.animation.Animator.AnimatorListener {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f4528;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f4529;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f4530;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public float f4531;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC2316 f4532;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.AbstractC2316 f4533;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public float f4534;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final float f4535;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final float f4536;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final float f4537;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public float f4538;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f4539;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final float f4540;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int f4541;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0375 f4542;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final android.animation.ValueAnimator f4543;

    public C1017(defpackage.C0375 r1, defpackage.AbstractC2316 r2, int r3, float r4, float r5, float r6, float r7, int r8, defpackage.AbstractC2316 r9) {
            r0 = this;
            r0.<init>()
            r0.f4542 = r1
            r0.f4539 = r8
            r0.f4532 = r9
            r1 = 0
            r0.f4529 = r1
            r0.f4530 = r1
            r0.f4541 = r3
            r0.f4533 = r2
            r0.f4537 = r4
            r0.f4540 = r5
            r0.f4536 = r6
            r0.f4535 = r7
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x003c: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r0.f4543 = r1
            ᛳᛵᛳᛵ r3 = new ᛳᛵᛳᛵ
            r4 = 1
            r3.<init>(r4, r0)
            r1.addUpdateListener(r3)
            android.view.View r2 = r2.f9791
            r1.setTarget(r2)
            r1.addListener(r0)
            r1 = 0
            r0.f4534 = r1
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.f4534 = r1
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r5) {
            r4 = this;
            r4.m1968(r5)
            boolean r5 = r4.f4529
            if (r5 == 0) goto L8
            goto L39
        L8:
            int r5 = r4.f4539
            ᲈᛸᲈᛷ r0 = r4.f4532
            ᛲᲇᛷᲁ r1 = r4.f4542
            if (r5 > 0) goto L18
            ᛱᛵᛷᲈ r4 = r1.f1934
            ᛱᛳᛶᛱ r5 = r1.f1945
            r4.mo588(r5, r0)
            goto L2e
        L18:
            java.util.ArrayList r2 = r1.f1938
            android.view.View r3 = r0.f9791
            r2.add(r3)
            r2 = 1
            r4.f4528 = r2
            if (r5 <= 0) goto L2e
            ᛱᛳᛶᛱ r2 = r1.f1945
            ᛱᲈᛷᲀ r3 = new ᛱᲈᛷᲀ
            r3.<init>(r1, r4, r5)
            r2.post(r3)
        L2e:
            android.view.View r4 = r1.f1941
            android.view.View r5 = r0.f9791
            if (r4 != r5) goto L39
            if (r5 != r4) goto L39
            r4 = 0
            r1.f1941 = r4
        L39:
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1968(android.animation.Animator r2) {
            r1 = this;
            boolean r2 = r1.f4530
            r0 = 1
            if (r2 != 0) goto La
            ᲈᛸᲈᛷ r2 = r1.f4533
            r2.m3791(r0)
        La:
            r1.f4530 = r0
            return
    }
}
