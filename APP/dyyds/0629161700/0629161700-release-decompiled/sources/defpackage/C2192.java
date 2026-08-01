package defpackage;

/* JADX INFO: renamed from: ᲈᛲᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2192 extends android.view.WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.HashMap f9298;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0682 f9299;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.util.ArrayList f9300;

    public C2192(defpackage.C0682 r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f9298 = r0
            r1.f9299 = r2
            return
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(android.view.WindowInsetsAnimation r3) {
            r2 = this;
            r2.m3589(r3)
            ᛴᛵᲇᲇ r0 = r2.f9299
            java.lang.Object r0 = r0.f3285
            ᛱᛶᛴ r0 = (defpackage.C0112) r0
            int r1 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f387
            r1 = 0
            r0.f978 = r1
            java.util.HashMap r2 = r2.f9298
            r2.remove(r3)
            return
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(android.view.WindowInsetsAnimation r1) {
            r0 = this;
            r0.m3589(r1)
            ᛴᛵᲇᲇ r0 = r0.f9299
            java.lang.Object r0 = r0.f3285
            ᛱᛶᛴ r0 = (defpackage.C0112) r0
            r1 = 1
            r0.f978 = r1
            return
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsets onProgress(android.view.WindowInsets r5, java.util.List r6) {
            r4 = this;
            java.util.ArrayList r0 = r4.f9300
            if (r0 != 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r4.f9300 = r0
            java.util.Collections.unmodifiableList(r0)
            goto L16
        L13:
            r0.clear()
        L16:
            int r0 = r6.size()
            int r0 = r0 + (-1)
        L1c:
            if (r0 < 0) goto L3d
            java.lang.Object r1 = r6.get(r0)
            android.view.WindowInsetsAnimation r1 = (android.view.WindowInsetsAnimation) r1
            ᛸᛴᛱᛵ r2 = r4.m3589(r1)
            float r1 = r1.getFraction()
            ᛶᲈᛱᲈ r3 = r2.f6496
            java.lang.Object r3 = r3.f5356
            android.view.WindowInsetsAnimation r3 = (android.view.WindowInsetsAnimation) r3
            r3.setFraction(r1)
            java.util.ArrayList r1 = r4.f9300
            r1.add(r2)
            int r0 = r0 + (-1)
            goto L1c
        L3d:
            r6 = 0
            ᲈᛸᛱᲀ r5 = defpackage.C2300.m3730(r6, r5)
            ᛴᛵᲇᲇ r4 = r4.f9299
            java.lang.Object r6 = r4.f3285
            ᛱᛶᛴ r6 = (defpackage.C0112) r6
            java.util.Objects.toString(r5)
            int r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f387
            ᛷᛸᛳᛶ r0 = new ᛷᛸᛳᛶ
            java.lang.Object r4 = r4.f3286
            ᛷᛸᛳᛶ r4 = (defpackage.C1331) r4
            r0.<init>(r4)
            r6.m626(r5, r0)
            android.view.WindowInsets r4 = r5.m3731()
            return r4
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation r1, android.view.WindowInsetsAnimation.Bounds r2) {
            r0 = this;
            r0.m3589(r1)
            android.graphics.Insets r0 = r2.getLowerBound()
            ᛶᛳᛴᛲ r0 = defpackage.C1032.m1986(r0)
            android.graphics.Insets r1 = r2.getUpperBound()
            ᛶᛳᛴᛲ r1 = defpackage.C1032.m1986(r1)
            android.view.WindowInsetsAnimation$Bounds r2 = new android.view.WindowInsetsAnimation$Bounds
            android.graphics.Insets r0 = r0.m1987()
            android.graphics.Insets r1 = r1.m1987()
            r2.<init>(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1466 m3589(android.view.WindowInsetsAnimation r7) {
            r6 = this;
            java.util.HashMap r6 = r6.f9298
            java.lang.Object r0 = r6.get(r7)
            ᛸᛴᛱᛵ r0 = (defpackage.C1466) r0
            if (r0 != 0) goto L22
            ᛸᛴᛱᛵ r0 = new ᛸᛴᛱᛵ
            r0.<init>()
            android.view.WindowInsetsAnimation r1 = new android.view.WindowInsetsAnimation
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            ᛶᲈᛱᲈ r1 = new ᛶᲈᛱᲈ
            r1.<init>(r7)
            r0.f6496 = r1
            r6.put(r7, r0)
        L22:
            return r0
    }
}
