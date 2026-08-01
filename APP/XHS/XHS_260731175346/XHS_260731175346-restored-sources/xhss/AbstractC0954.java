package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛵᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0954 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f3093;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object f3094;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f3095;

    public AbstractC0954(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            r0.f3094 = r1
            return
    }

    public AbstractC0954(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f3094 = r1
            r0.f3095 = r2
            r0.f3093 = r3
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static long m1548(int r2, int r3) {
            long r0 = (long) r2
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r3
            long r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public android.view.View m1549() {
            r3 = this;
            java.lang.Object r0 = r3.f3094
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L1e
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.AbstractC0001.m35()
            android.view.LayoutInflater r0 = xhss.AbstractC0968.m1604(r0)
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout
            android.app.Activity r2 = com.kongzue.dialogx.interfaces.AbstractC0001.m35()
            r1.<init>(r2)
            r2 = 0
            android.view.View r0 = r0.inflate(r2, r1, r2)
            r3.f3094 = r0
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public void m1550(android.view.ViewGroup r4, com.kongzue.dialogx.interfaces.AbstractC0001 r5) {
            r3 = this;
            android.view.View r0 = r3.m1549()
            if (r0 != 0) goto L8
            goto L80
        L8:
            android.view.View r0 = r3.m1549()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == r4) goto L80
            r0 = -109(0xffffffffffffff93, float:NaN)
            java.lang.Object r0 = r4.getTag(r0)
            android.view.View r1 = r3.m1549()
            java.lang.String r1 = r1.toString()
            if (r0 != r1) goto L23
            goto L80
        L23:
            android.view.View r0 = r3.m1549()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L3e
            android.view.View r0 = r3.m1549()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r3.m1549()
            r0.removeView(r1)
        L3e:
            android.view.View r0 = r3.m1549()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L4f
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
        L4f:
            android.view.View r1 = r3.m1549()
            r4.addView(r1, r0)
            android.view.View r4 = r3.m1549()
            r3.mo137(r5, r4)
            android.view.View r4 = r3.m1549()
            int r0 = r5.hashCode()
            int r1 = r3.f3095
            if (r0 != r1) goto L71
            int r0 = r4.hashCode()
            int r1 = r3.f3093
            if (r0 == r1) goto L80
        L71:
            int r5 = r5.hashCode()
            r3.f3095 = r5
            int r4 = r4.hashCode()
            r3.f3093 = r4
            r3.m1549()
        L80:
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public abstract void mo137(com.kongzue.dialogx.interfaces.AbstractC0001 r1, android.view.View r2);
}
