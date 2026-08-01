package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class of implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.util.ArrayList b;
    public final /* synthetic */ defpackage.uf c;

    public /* synthetic */ of(defpackage.uf r1, java.util.ArrayList r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.c = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            int r0 = r15.a
            switch(r0) {
                case 0: goto Lda;
                case 1: goto L48;
                default: goto L5;
            }
        L5:
            java.util.ArrayList r0 = r15.b
            int r1 = r0.size()
            r2 = 0
        Lc:
            uf r3 = r15.c
            if (r2 >= r1) goto L3f
            java.lang.Object r4 = r0.get(r2)
            int r2 = r2 + 1
            b00 r4 = (defpackage.b00) r4
            r3.getClass()
            android.view.View r5 = r4.a
            android.view.ViewPropertyAnimator r6 = r5.animate()
            java.util.ArrayList r7 = r3.o
            r7.add(r4)
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r7 = r6.alpha(r7)
            long r8 = r3.c
            android.view.ViewPropertyAnimator r7 = r7.setDuration(r8)
            pf r8 = new pf
            r8.<init>(r3, r4, r5, r6)
            android.view.ViewPropertyAnimator r3 = r7.setListener(r8)
            r3.start()
            goto Lc
        L3f:
            r0.clear()
            java.util.ArrayList r1 = r3.l
            r1.remove(r0)
            return
        L48:
            java.util.ArrayList r0 = r15.b
            int r1 = r0.size()
            r2 = 0
        L4f:
            uf r4 = r15.c
            if (r2 >= r1) goto Ld1
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            r5 = r3
            sf r5 = (defpackage.sf) r5
            java.util.ArrayList r9 = r4.r
            long r10 = r4.f
            b00 r3 = r5.a
            r6 = 0
            if (r3 != 0) goto L67
            r7 = r6
            goto L6a
        L67:
            android.view.View r3 = r3.a
            r7 = r3
        L6a:
            b00 r3 = r5.b
            if (r3 == 0) goto L70
            android.view.View r6 = r3.a
        L70:
            r12 = r6
            r13 = 0
            if (r7 == 0) goto La4
            android.view.ViewPropertyAnimator r3 = r7.animate()
            android.view.ViewPropertyAnimator r6 = r3.setDuration(r10)
            b00 r3 = r5.a
            r9.add(r3)
            int r3 = r5.e
            int r8 = r5.c
            int r3 = r3 - r8
            float r3 = (float) r3
            r6.translationX(r3)
            int r3 = r5.f
            int r8 = r5.d
            int r3 = r3 - r8
            float r3 = (float) r3
            r6.translationY(r3)
            android.view.ViewPropertyAnimator r14 = r6.alpha(r13)
            rf r3 = new rf
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            android.view.ViewPropertyAnimator r3 = r14.setListener(r3)
            r3.start()
        La4:
            if (r12 == 0) goto L4f
            android.view.ViewPropertyAnimator r6 = r12.animate()
            b00 r3 = r5.b
            r9.add(r3)
            android.view.ViewPropertyAnimator r3 = r6.translationX(r13)
            android.view.ViewPropertyAnimator r3 = r3.translationY(r13)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r10)
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r9 = r3.alpha(r7)
            rf r3 = new rf
            r8 = 1
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            android.view.ViewPropertyAnimator r3 = r9.setListener(r3)
            r3.start()
            goto L4f
        Ld1:
            r0.clear()
            java.util.ArrayList r1 = r4.n
            r1.remove(r0)
            return
        Lda:
            java.util.ArrayList r0 = r15.b
            int r1 = r0.size()
            r2 = 0
        Le1:
            uf r4 = r15.c
            if (r2 >= r1) goto L130
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            tf r3 = (defpackage.tf) r3
            b00 r5 = r3.a
            int r6 = r3.b
            int r7 = r3.c
            int r8 = r3.d
            int r3 = r3.e
            r4.getClass()
            r9 = r7
            android.view.View r7 = r5.a
            int r6 = r8 - r6
            int r8 = r3 - r9
            r3 = 0
            if (r6 == 0) goto L10b
            android.view.ViewPropertyAnimator r9 = r7.animate()
            r9.translationX(r3)
        L10b:
            if (r8 == 0) goto L114
            android.view.ViewPropertyAnimator r9 = r7.animate()
            r9.translationY(r3)
        L114:
            android.view.ViewPropertyAnimator r9 = r7.animate()
            java.util.ArrayList r3 = r4.p
            r3.add(r5)
            long r10 = r4.e
            android.view.ViewPropertyAnimator r10 = r9.setDuration(r10)
            qf r3 = new qf
            r3.<init>(r4, r5, r6, r7, r8, r9)
            android.view.ViewPropertyAnimator r3 = r10.setListener(r3)
            r3.start()
            goto Le1
        L130:
            r0.clear()
            java.util.ArrayList r1 = r4.m
            r1.remove(r0)
            return
    }
}
