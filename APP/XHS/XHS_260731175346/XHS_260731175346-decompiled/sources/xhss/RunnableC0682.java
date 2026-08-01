package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛷᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0682 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2303;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0259 f2304;

    public /* synthetic */ RunnableC0682(xhss.C0259 r1, int r2) {
            r0 = this;
            r0.f2303 = r2
            r0.f2304 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f2303
            r1 = 0
            xhss.ᛳᛴᛵ r9 = r9.f2304
            switch(r0) {
                case 0: goto L24;
                case 1: goto L16;
                default: goto L8;
            }
        L8:
            xhss.ᲀᲀ r0 = r9.m570()
            if (r0 == 0) goto L15
            xhss.ᲀᲀ r9 = r9.m570()
            r9.m1456(r1)
        L15:
            return
        L16:
            xhss.ᲀᲀ r0 = r9.m570()
            if (r0 == 0) goto L23
            xhss.ᲀᲀ r9 = r9.m570()
            r9.m1455()
        L23:
            return
        L24:
            xhss.ᛶᛵᲇᛸ r0 = r9.f95
            r0.getClass()
            r0.getClass()
            r9.mo50()
            r0.getClass()
            r9.mo50()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            xhss.ᲀᲀ r2 = new xhss.ᲀᲀ
            r2.<init>(r9)
            r0.<init>(r2)
            r9.f956 = r0
            xhss.ᲀᲀ r0 = r9.m570()
            if (r0 == 0) goto L1e3
            xhss.ᲀᲀ r0 = r9.m570()
            xhss.ᛳᛴᛵ r2 = r0.f2877
            int r3 = r0.f2876
            android.view.View r3 = r2.m53(r3)
            xhss.ᛶᛵᲇᛸ r4 = r2.f95
            if (r3 != 0) goto L59
            goto L1b7
        L59:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r2.f959 = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r3)
            r2.f79 = r5
            r5 = 1678245969(0x64080051, float:1.003512E22)
            android.view.View r5 = r3.findViewById(r5)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r5 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r5
            r0.f2871 = r5
            r5 = 1678245957(0x64080045, float:1.0035106E22)
            android.view.View r5 = r3.findViewById(r5)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r5 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r5
            r0.f2872 = r5
            r5 = 1678245968(0x64080050, float:1.0035119E22)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r0.f2879 = r5
            r4.getClass()
            android.app.Activity r4 = r2.m54()
            r2.mo50()
            xhss.ᛵᛲᲇᛴ r5 = new xhss.ᛵᛲᲇᛴ
            r5.<init>(r4)
            r4 = 0
            r5.f1612 = r4
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r6
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r6
            int r6 = (int) r7
            r5.f1602 = r6
            r6 = -1
            r5.f1607 = r6
            r7 = 1127481344(0x43340000, float:180.0)
            r5.f1616 = r7
            r7 = 1117782016(0x42a00000, float:80.0)
            r5.f1615 = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r5.f1629 = r7
            r5.f1613 = r4
            r7 = 1120403456(0x42c80000, float:100.0)
            r5.f1608 = r7
            r5.f1617 = r4
            r5.f1622 = r4
            r5.f1628 = r4
            r5.m828()
            r0.f2873 = r5
            android.widget.RelativeLayout r7 = r0.f2879
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r8.<init>(r6, r6)
            r7.addView(r5, r8)
            r5 = 1678245965(0x6408004d, float:1.0035115E22)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r0.f2880 = r5
            r5 = 1678246184(0x64080128, float:1.0035362E22)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0.f2878 = r5
            java.util.ArrayList r3 = com.kongzue.dialogx.interfaces.AbstractC0001.m39(r3)
            r0.f2874 = r3
            android.view.View r3 = r2.m59()
            if (r3 == 0) goto L104
            android.view.View r3 = r2.m59()
            r5 = 0
            r3.setTranslationZ(r5)
        L104:
            xhss.ᛶᛵᲇᛸ r3 = xhss.AbstractC1069.f3451
            java.lang.ref.WeakReference r3 = r2.f959
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            java.util.ArrayList r3 = com.kongzue.dialogx.interfaces.AbstractC0001.m39(r3)
            r0.f2874 = r3
            boolean r3 = r2.mo50()
            r5 = 1678049342(0x6405003e, float:9.813738E21)
            r6 = 1678049341(0x6405003d, float:9.813737E21)
            if (r3 == 0) goto L122
            r3 = r6
            goto L123
        L122:
            r3 = r5
        L123:
            r2.m60(r3)
            r3 = 1097859072(0x41700000, float:15.0)
            int r3 = r2.m64(r3)
            float r3 = (float) r3
            r2.mo50()
            boolean r7 = r2.mo50()
            if (r7 == 0) goto L137
            r5 = r6
        L137:
            int r5 = r2.m60(r5)
            java.util.ArrayList r6 = r0.f2874
            if (r6 == 0) goto L159
            java.util.Iterator r3 = r6.iterator()
            boolean r5 = r3.hasNext()
            if (r5 != 0) goto L14a
            goto L171
        L14a:
            java.lang.Object r9 = r3.next()
            android.view.View r9 = (android.view.View) r9
            r9.getClass()
            java.lang.ClassCastException r9 = new java.lang.ClassCastException
            r9.<init>()
            throw r9
        L159:
            android.content.res.Resources r6 = r2.m58()
            r7 = 1678180549(0x640700c5, float:9.961464E21)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
            r6.setColor(r5)
            r6.setCornerRadius(r3)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r3 = r0.f2872
            r3.setBackground(r6)
        L171:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r0.f2871
            r5 = 1
            r3.setClickable(r5)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r0.f2871
            r3.m72(r2)
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r0.f2871
            xhss.ᲀᲈᛵᛸ r6 = new xhss.ᲀᲈᛵᛸ
            r7 = 2
            r6.<init>(r7, r0)
            r3.f111 = r6
            int r3 = r2.f957
            if (r3 == 0) goto L19a
            if (r3 == r5) goto L19a
            xhss.ᛵᛲᲇᛴ r3 = r0.f2873
            r3.f1624 = r5
            xhss.ᲈᛱᛳᛲ r5 = new xhss.ᲈᛱᛳᛲ
            r5.<init>(r0, r4)
            r6 = 100
            r3.postDelayed(r5, r6)
        L19a:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r0.f2871
            xhss.ᛶᛵᲇᛸ r4 = new xhss.ᛶᛵᲇᛸ
            r4.<init>(r0)
            r3.f107 = r4
            java.lang.ref.WeakReference r3 = r2.f956
            if (r3 == 0) goto L1b4
            java.lang.Object r3 = r3.get()
            if (r3 == r0) goto L1b4
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r2.f956 = r3
        L1b4:
            r0.m1455()
        L1b7:
            java.lang.ref.WeakReference r0 = r9.f959
            if (r0 != 0) goto L1bd
            r0 = r1
            goto L1c3
        L1bd:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L1c3:
            if (r0 == 0) goto L1e3
            java.lang.ref.WeakReference r0 = r9.f959
            if (r0 != 0) goto L1cb
            r0 = r1
            goto L1d1
        L1cb:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L1d1:
            r0.setTag(r9)
            java.lang.ref.WeakReference r9 = r9.f959
            if (r9 != 0) goto L1d9
            goto L1e0
        L1d9:
            java.lang.Object r9 = r9.get()
            r1 = r9
            android.view.View r1 = (android.view.View) r1
        L1e0:
            com.kongzue.dialogx.interfaces.AbstractC0001.m32(r1)
        L1e3:
            return
    }
}
