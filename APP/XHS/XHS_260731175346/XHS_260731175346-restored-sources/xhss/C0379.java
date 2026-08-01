package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛶᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0379 extends android.view.WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.util.ArrayList f1369;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.HashMap f1370;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0230 f1371;

    public C0379(xhss.C0230 r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1370 = r0
            r1.f1371 = r2
            return
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(android.view.WindowInsetsAnimation r3) {
            r2 = this;
            r2.m733(r3)
            xhss.ᛳᛱᛲᲀ r0 = r2.f1371
            java.lang.Object r0 = r0.f894
            xhss.ᛷᛴᛱᲀ r0 = (xhss.C0644) r0
            int r1 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f97
            r1 = 0
            r0.f2205 = r1
            java.util.HashMap r2 = r2.f1370
            r2.remove(r3)
            return
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(android.view.WindowInsetsAnimation r1) {
            r0 = this;
            r0.m733(r1)
            xhss.ᛳᛱᛲᲀ r0 = r0.f1371
            java.lang.Object r0 = r0.f894
            xhss.ᛷᛴᛱᲀ r0 = (xhss.C0644) r0
            r1 = 1
            r0.f2205 = r1
            return
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsets onProgress(android.view.WindowInsets r5, java.util.List r6) {
            r4 = this;
            java.util.ArrayList r0 = r4.f1369
            if (r0 != 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r4.f1369 = r0
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
            xhss.ᲇᲇᛱᲀ r2 = r4.m733(r1)
            float r1 = r1.getFraction()
            xhss.ᲇᛵᛲᲁ r3 = r2.f3532
            java.lang.Object r3 = r3.f3349
            android.view.WindowInsetsAnimation r3 = (android.view.WindowInsetsAnimation) r3
            r3.setFraction(r1)
            java.util.ArrayList r1 = r4.f1369
            r1.add(r2)
            int r0 = r0 + (-1)
            goto L1c
        L3d:
            r6 = 0
            xhss.ᲀᛳᛲᛶ r5 = xhss.C0847.m1430(r6, r5)
            xhss.ᛳᛱᛲᲀ r4 = r4.f1371
            java.lang.Object r6 = r4.f894
            xhss.ᛷᛴᛱᲀ r6 = (xhss.C0644) r6
            java.util.Objects.toString(r5)
            int r0 = com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout.f97
            xhss.ᲇᲇᛱ r0 = new xhss.ᲇᲇᛱ
            java.lang.Object r4 = r4.f893
            xhss.ᲇᲇᛱ r4 = (xhss.C1096) r4
            r0.<init>(r4)
            r6.m1126(r5, r0)
            android.view.WindowInsets r4 = r5.m1431()
            return r4
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation r1, android.view.WindowInsetsAnimation.Bounds r2) {
            r0 = this;
            r0.m733(r1)
            android.graphics.Insets r0 = r2.getLowerBound()
            xhss.ᲀᲈᲈᛸ r0 = xhss.C0921.m1514(r0)
            android.graphics.Insets r1 = r2.getUpperBound()
            xhss.ᲀᲈᲈᛸ r1 = xhss.C0921.m1514(r1)
            android.view.WindowInsetsAnimation$Bounds r2 = new android.view.WindowInsetsAnimation$Bounds
            android.graphics.Insets r0 = r0.m1516()
            android.graphics.Insets r1 = r1.m1516()
            r2.<init>(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1097 m733(android.view.WindowInsetsAnimation r7) {
            r6 = this;
            java.util.HashMap r6 = r6.f1370
            java.lang.Object r0 = r6.get(r7)
            xhss.ᲇᲇᛱᲀ r0 = (xhss.C1097) r0
            if (r0 != 0) goto L24
            xhss.ᲇᲇᛱᲀ r0 = new xhss.ᲇᲇᛱᲀ
            r0.<init>()
            android.view.WindowInsetsAnimation r1 = new android.view.WindowInsetsAnimation
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            xhss.ᲇᛵᛲᲁ r1 = new xhss.ᲇᛵᛲᲁ
            r2 = 24
            r1.<init>(r2, r7)
            r0.f3532 = r1
            r6.put(r7, r0)
        L24:
            return r0
    }
}
