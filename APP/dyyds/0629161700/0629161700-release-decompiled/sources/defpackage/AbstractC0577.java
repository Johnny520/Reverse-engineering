package defpackage;

/* JADX INFO: renamed from: ᛳᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0577 {
    static {
            r0 = -96997826010670(0xffffa7c7ef0961d2, double:NaN)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.ArrayList m1372() {
            com.tencent.mmkv.MMKV r0 = defpackage.AbstractC0902.m1871()
            r1 = -96800257515054(0xffffa7f5ef0961d2, double:NaN)
            java.lang.String r1 = "color_picker_recent"
            r2 = -96886156860974(0xffffa7e1ef0961d2, double:NaN)
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L25
            r0 = -96890451828270(0xffffa7e0ef0961d2, double:NaN)
            java.lang.String r0 = ""
        L25:
            boolean r1 = defpackage.AbstractC1347.m2524(r0)
            if (r1 == 0) goto L31
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L31:
            r1 = -96894746795566(0xffffa7dfef0961d2, double:NaN)
            java.lang.String r1 = ","
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 6
            java.util.List r0 = defpackage.AbstractC1347.m2519(r0, r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r2 = defpackage.AbstractC0056.m467(r2)
            if (r2 == 0) goto L4c
            r1.add(r2)
            goto L4c
        L62:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final android.graphics.drawable.GradientDrawable m1373(int r2, boolean r3) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r1 = 0
            r0.setShape(r1)
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setCornerRadius(r1)
            r0.setColor(r2)
            if (r3 == 0) goto L19
            r2 = 4
            r3 = -1
            r0.setStroke(r2, r3)
            return r0
        L19:
            r2 = 1
            r3 = 436207616(0x1a000000, float:2.646978E-23)
            r0.setStroke(r2, r3)
            return r0
    }
}
