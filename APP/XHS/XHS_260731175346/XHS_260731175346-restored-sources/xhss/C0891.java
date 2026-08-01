package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0891 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout f2871;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public com.kongzue.dialogx.util.views.MaxRelativeLayout f2872;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0450 f2873;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public java.util.ArrayList f2874;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public float f2875;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int f2876;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0259 f2877;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public android.widget.TextView f2878;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public android.widget.RelativeLayout f2879;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public android.widget.RelativeLayout f2880;

    public C0891(xhss.C0259 r2) {
            r1 = this;
            r1.<init>()
            r1.f2877 = r2
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.f2875 = r0
            boolean r0 = r2.mo50()
            int r0 = r2.m65(r0)
            if (r0 == 0) goto L1c
            boolean r0 = r2.mo50()
            int r2 = r2.m65(r0)
            goto L1f
        L1c:
            r2 = 1678442557(0x640b003d, float:1.0256458E22)
        L1f:
            r1.f2876 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final long m1454(android.view.animation.Animation r5) {
            r4 = this;
            if (r5 != 0) goto L10
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r4.f2872
            android.view.animation.Animation r0 = r0.getAnimation()
            if (r0 == 0) goto L10
            com.kongzue.dialogx.util.views.MaxRelativeLayout r5 = r4.f2872
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
            xhss.ᛳᛴᛵ r4 = r4.f2877
            long r4 = r4.f89
            r2 = -1
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L2f
            return r4
        L2f:
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m1455() {
            r11 = this;
            xhss.ᛳᛴᛵ r0 = r11.f2877
            xhss.ᛶᛵᲇᛸ r1 = r0.f95
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r11.f2871
            if (r2 == 0) goto L101
            android.app.Activity r2 = r0.m54()
            if (r2 != 0) goto L10
            goto L101
        L10:
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r11.f2871
            boolean r3 = r0.f93
            r2.f98 = r3
            int[] r3 = r0.f94
            r4 = 0
            r5 = r3[r4]
            r6 = 1
            r7 = r3[r6]
            r8 = 2
            r9 = r3[r8]
            r10 = 3
            r3 = r3[r10]
            int[] r2 = r2.f105
            r2[r4] = r5
            r2[r6] = r7
            r2[r8] = r9
            r2[r10] = r3
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r11.f2872
            xhss.ᛶᛵᲇᛸ r3 = xhss.AbstractC1069.f3451
            r2.getClass()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r11.f2872
            r2.getClass()
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r11.f2872
            r2.setMinWidth(r4)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r2 = r11.f2872
            r2.setMinHeight(r4)
            r1.getClass()
            r1.getClass()
            boolean r1 = r0.mo50()
            r2 = 1678049313(0x64050021, float:9.813705E21)
            r3 = 1678049416(0x64050088, float:9.813821E21)
            if (r1 == 0) goto L57
            r2 = r3
        L57:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.mo50()
            int r1 = r1.intValue()
            android.widget.TextView r2 = r11.f2878
            android.content.res.Resources r3 = r0.m58()
            int r3 = r3.getColor(r1)
            r2.setTextColor(r3)
            xhss.ᛵᛲᲇᛴ r2 = r11.f2873
            android.content.res.Resources r3 = r0.m58()
            int r1 = r3.getColor(r1)
            r2.f1607 = r1
            android.graphics.Paint r2 = r2.f1629
            if (r2 == 0) goto L82
            r2.setColor(r1)
        L82:
            float r1 = r0.f961
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L9e
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L9e
            float r2 = r11.f2875
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L9e
            xhss.ᛵᛲᲇᛴ r2 = r11.f2873
            r2.m831(r1)
            float r1 = r0.f961
            r11.f2875 = r1
        L9e:
            float r1 = r0.f958
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Ld3
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r11.f2872
            xhss.ᛴᲈᛵᛶ r2 = new xhss.ᛴᲈᛵᛶ
            r2.<init>(r8, r11)
            r1.setOutlineProvider(r2)
            com.kongzue.dialogx.util.views.MaxRelativeLayout r1 = r11.f2872
            r1.setClipToOutline(r6)
            java.util.ArrayList r1 = r11.f2874
            if (r1 == 0) goto Ld3
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto Lc4
            goto Ld3
        Lc4:
            java.lang.Object r11 = r1.next()
            android.view.View r11 = (android.view.View) r11
            r11.getClass()
            java.lang.ClassCastException r11 = new java.lang.ClassCastException
            r11.<init>()
            throw r11
        Ld3:
            android.widget.TextView r1 = r11.f2878
            java.lang.String r2 = r0.f953
            r3 = 0
            if (r2 != 0) goto Le0
            int r2 = r0.f957
            xhss.AbstractC0390.m784(r2)
            r2 = r3
        Le0:
            com.kongzue.dialogx.interfaces.AbstractC0001.m41(r1, r2)
            android.widget.TextView r1 = r11.f2878
            com.kongzue.dialogx.interfaces.AbstractC0001.m45(r1, r3)
            android.widget.RelativeLayout r1 = r11.f2880
            r2 = 8
            r1.setVisibility(r2)
            android.widget.RelativeLayout r1 = r11.f2879
            r1.setVisibility(r4)
            boolean r0 = r0.f960
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r11 = r11.f2871
            if (r0 == 0) goto Lfe
            r11.setOnClickListener(r3)
            return
        Lfe:
            r11.setClickable(r4)
        L101:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1456(android.view.View r3) {
            r2 = this;
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r3 = r2.f2871
            if (r3 != 0) goto L5
            goto L21
        L5:
            xhss.ᛳᛴᛵ r3 = r2.f2877
            android.app.Activity r0 = r3.m54()
            if (r0 != 0) goto Le
            goto L21
        Le:
            boolean r0 = r3.f81
            if (r0 != 0) goto L21
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r0 = r2.f2871
            if (r0 == 0) goto L21
            r1 = 1
            r3.f81 = r1
            xhss.ᲈᛱᛳᛲ r3 = new xhss.ᲈᛱᛳᛲ
            r3.<init>(r2, r1)
            r0.post(r3)
        L21:
            return
    }
}
