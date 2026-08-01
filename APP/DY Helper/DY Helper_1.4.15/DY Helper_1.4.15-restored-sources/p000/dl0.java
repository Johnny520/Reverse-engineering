package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class dl0 {

    /* JADX INFO: renamed from: α */
    public static final android.os.Handler f3213 = null;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.dl0.f3213 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static android.widget.TextView m1773(android.app.Activity r3, p000.C0277f9 r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, p000.p70 r8) {
            r0 = 1096810496(0x41600000, float:14.0)
            android.widget.TextView r3 = p000.lz1.m3683(r3, r5, r0)
            int r5 = android.graphics.Color.parseColor(r6)
            r3.setTextColor(r5)
            r5 = 0
            r6 = 1
            r3.setTypeface(r5, r6)
            r5 = 17
            r3.setGravity(r5)
            r5 = 20
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r4.invoke(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r5 = r4.invoke(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r3.setPadding(r0, r2, r5, r1)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            int r7 = android.graphics.Color.parseColor(r7)
            r5.setColor(r7)
            r7 = 10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r4 = r4.invoke(r7)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5.setCornerRadius(r4)
            r3.setBackground(r5)
            r3.setClickable(r6)
            b9 r4 = new b9
            r5 = 5
            r4.<init>(r5, r8)
            r3.setOnClickListener(r4)
            return r3
    }
}
