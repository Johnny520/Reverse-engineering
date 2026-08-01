package defpackage;

/* JADX INFO: renamed from: ᛷᛶᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1304 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f5766;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f5767;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f5768;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Object f5769;

    public AbstractC1304() {
            r0 = this;
            r0.<init>()
            ᛸᛵᛴᛲ r0 = defpackage.C1487.f6574
            if (r0 != 0) goto Le
            ᛸᛵᛴᛲ r0 = new ᛸᛵᛴᛲ
            r0.<init>()
            defpackage.C1487.f6574 = r0
        Le:
            return
    }

    public AbstractC1304(int r4) {
            r3 = this;
            r3.<init>()
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            if (r0 != 0) goto L13
            ᲈᛴᛵᲈ r3 = defpackage.AbstractC0042.f556
            java.lang.String r3 = ">>>"
            java.lang.String r4 = "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki"
            android.util.Log.e(r3, r4)
            return
        L13:
            r3.f5768 = r4
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            android.view.LayoutInflater r0 = defpackage.AbstractC1668.m3063(r0)
            android.widget.RelativeLayout r1 = new android.widget.RelativeLayout
            android.app.Activity r2 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            r1.<init>(r2)
            r2 = 0
            android.view.View r4 = r0.inflate(r4, r1, r2)
            r3.f5769 = r4
            return
    }

    public AbstractC1304(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.f5769 = r1
            return
    }

    public boolean hasNext() {
            r1 = this;
            int r0 = r1.f5768
            java.lang.Object r1 = r1.f5769
            ᛴᛴᲁᲇ r1 = (defpackage.C0665) r1
            int r1 = r1.f3221
            if (r0 >= r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public void remove() {
            r3 = this;
            java.lang.Object r0 = r3.f5769
            ᛴᛴᲁᲇ r0 = (defpackage.C0665) r0
            r3.m2419()
            int r1 = r3.f5767
            r2 = -1
            if (r1 == r2) goto L1b
            r0.m1500()
            int r1 = r3.f5767
            r0.m1495(r1)
            r3.f5767 = r2
            int r0 = r0.f3230
            r3.f5766 = r0
            return
        L1b:
            java.lang.String r3 = "Call next() before removing element from the iterator."
            defpackage.C2264.m3676(r3)
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public void m2417() {
            r3 = this;
        L0:
            int r0 = r3.f5768
            java.lang.Object r1 = r3.f5769
            ᛴᛴᲁᲇ r1 = (defpackage.C0665) r1
            int r2 = r1.f3221
            if (r0 >= r2) goto L15
            int[] r1 = r1.f3226
            r1 = r1[r0]
            if (r1 >= 0) goto L15
            int r0 = r0 + 1
            r3.f5768 = r0
            goto L0
        L15:
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.view.View m2418() {
            r4 = this;
            java.lang.Object r0 = r4.f5769
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L20
            android.app.Activity r0 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            android.view.LayoutInflater r0 = defpackage.AbstractC1668.m3063(r0)
            int r1 = r4.f5768
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            android.app.Activity r3 = com.kongzue.dialogx.interfaces.AbstractC0008.m243()
            r2.<init>(r3)
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            r4.f5769 = r0
        L20:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m2419() {
            r1 = this;
            java.lang.Object r0 = r1.f5769
            ᛴᛴᲁᲇ r0 = (defpackage.C0665) r0
            int r0 = r0.f3230
            int r1 = r1.f5766
            if (r0 != r1) goto Lb
            return
        Lb:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int m2420(int r2) {
            r1 = this;
            int r0 = r1.f5766
            if (r2 >= r0) goto L10
            java.lang.Object r0 = r1.f5769
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r1.f5767
            int r1 = r1 + r2
            short r1 = r0.getShort(r1)
            return r1
        L10:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m2421(android.view.ViewGroup r4, com.kongzue.dialogx.interfaces.AbstractC0008 r5) {
            r3 = this;
            android.view.View r0 = r3.m2418()
            if (r0 != 0) goto L8
            goto L80
        L8:
            android.view.View r0 = r3.m2418()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == r4) goto L80
            r0 = -109(0xffffffffffffff93, float:NaN)
            java.lang.Object r0 = r4.getTag(r0)
            android.view.View r1 = r3.m2418()
            java.lang.String r1 = r1.toString()
            if (r0 != r1) goto L23
            goto L80
        L23:
            android.view.View r0 = r3.m2418()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L3e
            android.view.View r0 = r3.m2418()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r3.m2418()
            r0.removeView(r1)
        L3e:
            android.view.View r0 = r3.m2418()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L4f
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
        L4f:
            android.view.View r1 = r3.m2418()
            r4.addView(r1, r0)
            android.view.View r4 = r3.m2418()
            r3.mo1529(r5, r4)
            android.view.View r4 = r3.m2418()
            int r0 = r5.hashCode()
            int r1 = r3.f5767
            if (r0 != r1) goto L71
            int r0 = r4.hashCode()
            int r1 = r3.f5766
            if (r0 == r1) goto L80
        L71:
            int r5 = r5.hashCode()
            r3.f5767 = r5
            int r4 = r4.hashCode()
            r3.f5766 = r4
            r3.m2418()
        L80:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public abstract void mo1529(com.kongzue.dialogx.interfaces.AbstractC0008 r1, android.view.View r2);
}
