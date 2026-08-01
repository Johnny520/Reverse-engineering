package defpackage;

/* JADX INFO: renamed from: ᲇᛵᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2052 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0525 f8845;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f8846;

    public /* synthetic */ RunnableC2052(defpackage.C0525 r1, int r2) {
            r0 = this;
            r0.f8846 = r2
            r0.f8845 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f8846
            r1 = 0
            ᛳᛸᛳᛸ r9 = r9.f8845
            switch(r0) {
                case 0: goto L24;
                case 1: goto L16;
                default: goto L8;
            }
        L8:
            ᛱᛳᲀᛷ r0 = r9.m1320()
            if (r0 == 0) goto L15
            ᛱᛳᲀᛷ r9 = r9.m1320()
            r9.m477(r1)
        L15:
            return
        L16:
            ᛱᛳᲀᛷ r0 = r9.m1320()
            if (r0 == 0) goto L23
            ᛱᛳᲀᛷ r9 = r9.m1320()
            r9.m476()
        L23:
            return
        L24:
            ᲈᛴᛵᲈ r0 = r9.f375
            r0.getClass()
            r0.getClass()
            r9.mo270()
            r0.getClass()
            r9.mo270()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            ᛱᛳᲀᛷ r2 = new ᛱᛳᲀᛷ
            r2.<init>(r9)
            r0.<init>(r2)
            r9.f2588 = r0
            ᛱᛳᲀᛷ r0 = r9.m1320()
            if (r0 == 0) goto L1e4
            ᛱᛳᲀᛷ r0 = r9.m1320()
            ᛳᛸᛳᛸ r2 = r0.f701
            int r3 = r0.f695
            android.view.View r3 = r2.m266(r3)
            ᲈᛴᛵᲈ r4 = r2.f375
            if (r3 != 0) goto L59
            goto L1b8
        L59:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r2.f2592 = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r2.f376 = r5
            r5 = 1711865999(0x6609008f, float:1.6174363E23)
            android.view.View r5 = r3.findViewById(r5)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r5 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r5
            r0.f702 = r5
            r5 = 1711865964(0x6609006c, float:1.61743E23)
            android.view.View r5 = r3.findViewById(r5)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r5 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r5
            r0.f699 = r5
            r5 = 1711865998(0x6609008e, float:1.6174361E23)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r0.f698 = r5
            r4.getClass()
            android.app.Activity r4 = r2.m271()
            r2.mo270()
            ᛱᲇᲁᲈ r5 = new ᛱᲇᲁᲈ
            r5.<init>(r4)
            r4 = 0
            r5.f1294 = r4
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r6
            int r6 = (int) r7
            r5.f1292 = r6
            r6 = -1
            r5.f1289 = r6
            r7 = 1127481344(0x43340000, float:180.0)
            r5.f1295 = r7
            r7 = 1117782016(0x42a00000, float:80.0)
            r5.f1281 = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r5.f1291 = r7
            r5.f1296 = r4
            r7 = 1120403456(0x42c80000, float:100.0)
            r5.f1301 = r7
            r5.f1287 = r4
            r5.f1297 = r4
            r5.f1299 = r4
            r5.m759()
            r0.f697 = r5
            android.widget.RelativeLayout r7 = r0.f698
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r8.<init>(r6, r6)
            r7.addView(r5, r8)
            r5 = 1711865995(0x6609008b, float:1.6174356E23)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r0.f703 = r5
            r5 = 1711867064(0x660904b8, float:1.6176281E23)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f704 = r5
            java.util.ArrayList r3 = com.kongzue.dialogx.interfaces.AbstractC0008.m240(r3)
            r0.f700 = r3
            android.view.View r3 = r2.m262()
            if (r3 == 0) goto L104
            android.view.View r3 = r2.m262()
            r5 = 0
            r3.setTranslationZ(r5)
        L104:
            ᲈᛴᛵᲈ r3 = defpackage.AbstractC0042.f556
            java.lang.ref.WeakReference r3 = r2.f2592
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            java.util.ArrayList r3 = com.kongzue.dialogx.interfaces.AbstractC0008.m240(r3)
            r0.f700 = r3
            boolean r3 = r2.mo270()
            r5 = 1711669356(0x6606006c, float:1.5820122E23)
            r6 = 1711669355(0x6606006b, float:1.582012E23)
            if (r3 == 0) goto L122
            r3 = r6
            goto L123
        L122:
            r3 = r5
        L123:
            r2.m259(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            int r3 = r2.m258(r3)
            float r3 = (float) r3
            r2.mo270()
            boolean r7 = r2.mo270()
            if (r7 == 0) goto L137
            r5 = r6
        L137:
            int r5 = r2.m259(r5)
            java.util.ArrayList r6 = r0.f700
            if (r6 == 0) goto L158
            java.util.Iterator r3 = r6.iterator()
            boolean r5 = r3.hasNext()
            if (r5 != 0) goto L14a
            goto L170
        L14a:
            java.lang.Object r9 = r3.next()
            android.view.View r9 = (android.view.View) r9
            r9.getClass()
            defpackage.C2264.m3679()
            goto L1e4
        L158:
            android.content.res.Resources r6 = r2.m263()
            r7 = 1711800679(0x66080167, float:1.6056693E23)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
            r6.setColor(r5)
            r6.setCornerRadius(r3)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r3 = r0.f699
            r3.setBackground(r6)
        L170:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r0.f702
            r5 = 1
            r3.setClickable(r5)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r0.f702
            r3.m277(r2)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r0.f702
            ᲁᛲᲇᲁ r6 = new ᲁᛲᲇᲁ
            r7 = 2
            r6.<init>(r7, r0)
            r3.f391 = r6
            int r3 = r2.f2584
            if (r3 == 0) goto L199
            if (r3 == r5) goto L199
            ᛱᲇᲁᲈ r3 = r0.f697
            r3.f1298 = r5
            ᛵᛴᛳᲈ r5 = new ᛵᛴᛳᲈ
            r5.<init>(r0, r4)
            r6 = 100
            r3.postDelayed(r5, r6)
        L199:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r0.f702
            ᲁᲁᛷᲈ r4 = new ᲁᲁᛷᲈ
            r5 = 13
            r4.<init>(r5, r0)
            r3.f399 = r4
            java.lang.ref.WeakReference r3 = r2.f2588
            if (r3 == 0) goto L1b5
            java.lang.Object r3 = r3.get()
            if (r3 == r0) goto L1b5
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r2.f2588 = r3
        L1b5:
            r0.m476()
        L1b8:
            java.lang.ref.WeakReference r0 = r9.f2592
            if (r0 != 0) goto L1be
            r0 = r1
            goto L1c4
        L1be:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L1c4:
            if (r0 == 0) goto L1e4
            java.lang.ref.WeakReference r0 = r9.f2592
            if (r0 != 0) goto L1cc
            r0 = r1
            goto L1d2
        L1cc:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L1d2:
            r0.setTag(r9)
            java.lang.ref.WeakReference r9 = r9.f2592
            if (r9 != 0) goto L1da
            goto L1e1
        L1da:
            java.lang.Object r9 = r9.get()
            r1 = r9
            android.view.View r1 = (android.view.View) r1
        L1e1:
            com.kongzue.dialogx.interfaces.AbstractC0008.m247(r1)
        L1e4:
            return
    }
}
