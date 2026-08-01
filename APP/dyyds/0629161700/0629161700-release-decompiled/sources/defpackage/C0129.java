package defpackage;

/* JADX INFO: renamed from: ᛱᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0129 extends defpackage.AbstractC2316 {

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final android.widget.TextView f1062;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final android.widget.TextView f1063;

    public C0129(android.widget.LinearLayout r3, android.widget.TextView r4, android.widget.TextView r5) {
            r2 = this;
            r0 = -129579447918126(0xffff8a25ef0961d2, double:NaN)
            r0 = -129618102623790(0xffff8a1cef0961d2, double:NaN)
            r0 = -129643872427566(0xffff8a16ef0961d2, double:NaN)
            r2.<init>(r3)
            r2.f1062 = r4
            r2.f1063 = r5
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final void m644(boolean r5) {
            r4 = this;
            android.widget.TextView r4 = r4.f1063
            android.content.Context r0 = r4.getContext()
            if (r5 == 0) goto L12
            r1 = -129699707002414(0xffff8a09ef0961d2, double:NaN)
        Ld:
            java.lang.String r1 = "显示"
            goto L18
        L12:
            r1 = -129712591904302(0xffff8a06ef0961d2, double:NaN)
            goto Ld
        L18:
            r4.setText(r1)
            if (r5 == 0) goto L25
            r1 = 1711669397(0x66060095, float:1.5820196E23)
            int r1 = r0.getColor(r1)
            goto L2c
        L25:
            r1 = 1711669487(0x660600ef, float:1.5820358E23)
            int r1 = r0.getColor(r1)
        L2c:
            r4.setTextColor(r1)
            r1 = 16
            r2 = 0
            if (r5 == 0) goto L4f
            r5 = 1711669380(0x66060084, float:1.5820166E23)
            int r5 = r0.getColor(r5)
            int r0 = defpackage.AbstractC2093.m3510(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r2)
            r1.setColor(r5)
            float r5 = (float) r0
            r1.setCornerRadius(r5)
            goto L75
        L4f:
            r5 = 1711669495(0x660600f7, float:1.5820373E23)
            int r5 = r0.getColor(r5)
            int r1 = defpackage.AbstractC2093.m3510(r1)
            r3 = 1711669362(0x66060072, float:1.5820133E23)
            int r0 = r0.getColor(r3)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r3.setShape(r2)
            r3.setColor(r5)
            float r5 = (float) r1
            r3.setCornerRadius(r5)
            r5 = 1
            r3.setStroke(r5, r0)
            r1 = r3
        L75:
            r4.setBackground(r1)
            return
    }
}
