package p000;

/* JADX INFO: renamed from: jd */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0427jd {

    /* JADX INFO: renamed from: α */
    public final android.graphics.Matrix f5427;

    /* JADX INFO: renamed from: β */
    public final int[] f5428;

    public C0427jd() {
            r1 = this;
            r1.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.f5427 = r0
            r0 = 2
            int[] r0 = new int[r0]
            r1.f5428 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public void m2954(android.view.View r20, float[] r21) {
            r19 = this;
            r0 = r19
            r1 = r21
            android.graphics.Matrix r2 = r0.f5427
            r2.reset()
            r3 = r20
            r3.transformMatrixToGlobal(r2)
            android.view.ViewParent r4 = r3.getParent()
        L12:
            boolean r5 = r4 instanceof android.view.View
            if (r5 == 0) goto L1e
            r3 = r4
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r4 = r3.getParent()
            goto L12
        L1e:
            int[] r0 = r0.f5428
            r3.getLocationOnScreen(r0)
            r4 = 0
            r5 = r0[r4]
            r6 = 1
            r7 = r0[r6]
            r3.getLocationInWindow(r0)
            r3 = r0[r4]
            r0 = r0[r6]
            int r3 = r3 - r5
            float r3 = (float) r3
            int r0 = r0 - r7
            float r0 = (float) r0
            r2.postTranslate(r3, r0)
            r2.getValues(r1)
            r0 = r1[r4]
            r2 = r1[r6]
            r3 = 2
            r5 = r1[r3]
            r7 = 3
            r8 = r1[r7]
            r9 = 4
            r10 = r1[r9]
            r11 = 5
            r12 = r1[r11]
            r13 = 6
            r14 = r1[r13]
            r15 = 7
            r16 = r1[r15]
            r17 = 8
            r18 = r1[r17]
            r1[r4] = r0
            r1[r6] = r8
            r0 = 0
            r1[r3] = r0
            r1[r7] = r14
            r1[r9] = r2
            r1[r11] = r10
            r1[r13] = r0
            r1[r15] = r16
            r1[r17] = r0
            r2 = 9
            r1[r2] = r0
            r2 = 10
            r3 = 1065353216(0x3f800000, float:1.0)
            r1[r2] = r3
            r2 = 11
            r1[r2] = r0
            r2 = 12
            r1[r2] = r5
            r2 = 13
            r1[r2] = r12
            r2 = 14
            r1[r2] = r0
            r0 = 15
            r1[r0] = r18
            return
    }
}
