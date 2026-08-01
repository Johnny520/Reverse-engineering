package defpackage;

/* JADX INFO: renamed from: ᛱᛳᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0060 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int f695;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public float f696;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0207 f697;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.widget.RelativeLayout f698;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public com.kongzue.dialogx.util.views.MaxRelativeLayout f699;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public java.util.ArrayList f700;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0525 f701;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout f702;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.widget.RelativeLayout f703;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.widget.TextView f704;

    public C0060(defpackage.C0525 r2) {
            r1 = this;
            r1.<init>()
            r1.f701 = r2
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.f696 = r0
            boolean r0 = r2.mo270()
            int r0 = r2.m264(r0)
            if (r0 == 0) goto L1c
            boolean r0 = r2.mo270()
            int r2 = r2.m264(r0)
            goto L1f
        L1c:
            r2 = 1712062597(0x660c0085, float:1.6528522E23)
        L1f:
            r1.f695 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m476() {
            r11 = this;
            ᛳᛸᛳᛸ r0 = r11.f701
            ᲈᛴᛵᲈ r1 = r0.f375
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r11.f702
            if (r2 == 0) goto Lff
            android.app.Activity r2 = r0.m271()
            if (r2 != 0) goto L10
            goto Lff
        L10:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r11.f702
            boolean r3 = r0.f367
            r2.f397 = r3
            int[] r3 = r0.f380
            r4 = 0
            r5 = r3[r4]
            r6 = 1
            r7 = r3[r6]
            r8 = 2
            r9 = r3[r8]
            r10 = 3
            r3 = r3[r10]
            int[] r2 = r2.f392
            r2[r4] = r5
            r2[r6] = r7
            r2[r8] = r9
            r2[r10] = r3
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r11.f699
            ᲈᛴᛵᲈ r3 = defpackage.AbstractC0042.f556
            r2.getClass()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r11.f699
            r2.getClass()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r11.f699
            r2.setMinWidth(r4)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r11.f699
            r2.setMinHeight(r4)
            r1.getClass()
            r1.getClass()
            boolean r1 = r0.mo270()
            r2 = 1711669290(0x6606002a, float:1.5820003E23)
            r3 = 1711669516(0x6606010c, float:1.582041E23)
            if (r1 == 0) goto L57
            r2 = r3
        L57:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.mo270()
            int r1 = r1.intValue()
            android.widget.TextView r2 = r11.f704
            android.content.res.Resources r3 = r0.m263()
            int r3 = r3.getColor(r1)
            r2.setTextColor(r3)
            ᛱᲇᲁᲈ r2 = r11.f697
            android.content.res.Resources r3 = r0.m263()
            int r1 = r3.getColor(r1)
            r2.f1289 = r1
            android.graphics.Paint r2 = r2.f1291
            if (r2 == 0) goto L82
            r2.setColor(r1)
        L82:
            float r1 = r0.f2583
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L9e
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L9e
            float r2 = r11.f696
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L9e
            ᛱᲇᲁᲈ r2 = r11.f697
            r2.m756(r1)
            float r1 = r0.f2583
            r11.f696 = r1
        L9e:
            float r1 = r0.f2590
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Ld1
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r11.f699
            ᛳᛳᲁᲀ r2 = new ᛳᛳᲁᲀ
            r2.<init>(r8, r11)
            r1.setOutlineProvider(r2)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r11.f699
            r1.setClipToOutline(r6)
            java.util.ArrayList r1 = r11.f700
            if (r1 == 0) goto Ld1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto Lc4
            goto Ld1
        Lc4:
            java.lang.Object r11 = r1.next()
            android.view.View r11 = (android.view.View) r11
            r11.getClass()
            defpackage.C2264.m3679()
            return
        Ld1:
            android.widget.TextView r1 = r11.f704
            java.lang.CharSequence r2 = r0.f2586
            r3 = 0
            if (r2 != 0) goto Lde
            int r2 = r0.f2584
            defpackage.AbstractC0225.m812(r2)
            r2 = r3
        Lde:
            com.kongzue.dialogx.interfaces.AbstractC0008.m246(r1, r2)
            android.widget.TextView r1 = r11.f704
            com.kongzue.dialogx.interfaces.AbstractC0008.m250(r1, r3)
            android.widget.RelativeLayout r1 = r11.f703
            r2 = 8
            r1.setVisibility(r2)
            android.widget.RelativeLayout r1 = r11.f698
            r1.setVisibility(r4)
            boolean r0 = r0.f2591
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r11 = r11.f702
            if (r0 == 0) goto Lfc
            r11.setOnClickListener(r3)
            return
        Lfc:
            r11.setClickable(r4)
        Lff:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m477(android.view.View r3) {
            r2 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f702
            if (r3 != 0) goto L5
            goto L21
        L5:
            ᛳᛸᛳᛸ r3 = r2.f701
            android.app.Activity r0 = r3.m271()
            if (r0 != 0) goto Le
            goto L21
        Le:
            boolean r0 = r3.f381
            if (r0 != 0) goto L21
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.f702
            if (r0 == 0) goto L21
            r1 = 1
            r3.f381 = r1
            ᛵᛴᛳᲈ r3 = new ᛵᛴᛳᲈ
            r3.<init>(r2, r1)
            r0.post(r3)
        L21:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final long m478(android.view.animation.Animation r5) {
            r4 = this;
            if (r5 != 0) goto L10
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r4.f699
            android.view.animation.Animation r0 = r0.getAnimation()
            if (r0 == 0) goto L10
            com.kongzue.dialogx.util.views.MaxRelativeLayout r5 = r4.f699
            android.view.animation.Animation r5 = r5.getAnimation()
        L10:
            if (r5 == 0) goto L22
            long r0 = r5.getDuration()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1d
            goto L22
        L1d:
            long r0 = r5.getDuration()
            goto L24
        L22:
            r0 = 300(0x12c, double:1.48E-321)
        L24:
            ᛳᛸᛳᛸ r4 = r4.f701
            long r4 = r4.f383
            r2 = -1
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L2f
            return r4
        L2f:
            return r0
    }
}
