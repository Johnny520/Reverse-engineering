package defpackage;

/* JADX INFO: renamed from: ᛲᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0400 implements defpackage.InterfaceC0721 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.graphics.drawable.Animatable f2053;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0798 f2054;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.widget.ImageView f2055;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f2056;

    public C0400(android.widget.ImageView r1, int r2) {
            r0 = this;
            r0.f2056 = r2
            r0.<init>()
            r0.f2055 = r1
            ᛴᲈᛶᛱ r2 = new ᛴᲈᛶᛱ
            r2.<init>(r1)
            r0.f2054 = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Target for: "
            r0.<init>(r1)
            android.widget.ImageView r2 = r2.f2055
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final void mo729(android.graphics.drawable.Drawable r4) {
            r3 = this;
            ᛴᲈᛶᛱ r0 = r3.f2054
            android.widget.ImageView r1 = r0.f3695
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            boolean r2 = r1.isAlive()
            if (r2 == 0) goto L13
            ᲈᲁᲀᲇ r2 = r0.f3694
            r1.removeOnPreDrawListener(r2)
        L13:
            r1 = 0
            r0.f3694 = r1
            java.util.ArrayList r0 = r0.f3696
            r0.clear()
            android.graphics.drawable.Animatable r0 = r3.f2053
            if (r0 == 0) goto L22
            r0.stop()
        L22:
            r3.m1163(r1)
            r3.f2053 = r1
            android.widget.ImageView r3 = r3.f2055
            r3.setImageDrawable(r4)
            return
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final void mo321() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m1163(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f2056
            android.widget.ImageView r1 = r1.f2055
            switch(r0) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setImageDrawable(r2)
            return
        Ld:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1.setImageBitmap(r2)
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final void mo730(java.lang.Object r2) {
            r1 = this;
            r1.m1163(r2)
            boolean r0 = r2 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto Lf
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
            r1.f2053 = r2
            r2.start()
            return
        Lf:
            r2 = 0
            r1.f2053 = r2
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final void mo731(defpackage.InterfaceC2076 r2) {
            r1 = this;
            android.widget.ImageView r1 = r1.f2055
            r0 = 1711866347(0x660901eb, float:1.617499E23)
            r1.setTag(r0, r2)
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo732(defpackage.C1622 r7) {
            r6 = this;
            ᛴᲈᛶᛱ r6 = r6.f2054
            java.util.ArrayList r0 = r6.f3696
            android.widget.ImageView r1 = r6.f3695
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingRight()
            int r3 = r3 + r2
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r4 = 0
            if (r2 == 0) goto L19
            int r2 = r2.width
            goto L1a
        L19:
            r2 = r4
        L1a:
            int r5 = r1.getWidth()
            int r2 = r6.m1743(r5, r2, r3)
            int r3 = r1.getPaddingTop()
            int r5 = r1.getPaddingBottom()
            int r5 = r5 + r3
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 == 0) goto L33
            int r4 = r3.height
        L33:
            int r3 = r1.getHeight()
            int r3 = r6.m1743(r3, r4, r5)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > 0) goto L41
            if (r2 != r4) goto L46
        L41:
            if (r3 > 0) goto L62
            if (r3 != r4) goto L46
            goto L62
        L46:
            boolean r2 = r0.contains(r7)
            if (r2 != 0) goto L4f
            r0.add(r7)
        L4f:
            ᲈᲁᲀᲇ r7 = r6.f3694
            if (r7 != 0) goto L61
            android.view.ViewTreeObserver r7 = r1.getViewTreeObserver()
            ᲈᲁᲀᲇ r0 = new ᲈᲁᲀᲇ
            r0.<init>(r6)
            r6.f3694 = r0
            r7.addOnPreDrawListener(r0)
        L61:
            return
        L62:
            r7.m2934(r2, r3)
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo733(defpackage.C1622 r1) {
            r0 = this;
            ᛴᲈᛶᛱ r0 = r0.f2054
            java.util.ArrayList r0 = r0.f3696
            r0.remove(r1)
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo734(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.m1163(r0)
            r1.f2053 = r0
            android.widget.ImageView r1 = r1.f2055
            r1.setImageDrawable(r2)
            return
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final void mo322() {
            r0 = this;
            android.graphics.drawable.Animatable r0 = r0.f2053
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo323() {
            r0 = this;
            android.graphics.drawable.Animatable r0 = r0.f2053
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo735(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.m1163(r0)
            r1.f2053 = r0
            android.widget.ImageView r1 = r1.f2055
            r1.setImageDrawable(r2)
            return
    }

    @Override // defpackage.InterfaceC0721
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final defpackage.InterfaceC2076 mo736() {
            r2 = this;
            android.widget.ImageView r2 = r2.f2055
            r0 = 1711866347(0x660901eb, float:1.617499E23)
            java.lang.Object r2 = r2.getTag(r0)
            r0 = 0
            if (r2 == 0) goto L18
            boolean r1 = r2 instanceof defpackage.InterfaceC2076
            if (r1 == 0) goto L13
            ᲇᛶᲁᛴ r2 = (defpackage.InterfaceC2076) r2
            return r2
        L13:
            java.lang.String r2 = "You must not call setTag() on a view Glide is targeting"
            defpackage.C2264.m3684(r2)
        L18:
            return r0
    }
}
