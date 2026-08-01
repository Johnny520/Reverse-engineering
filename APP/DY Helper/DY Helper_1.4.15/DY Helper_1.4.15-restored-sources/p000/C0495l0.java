package p000;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0495l0 implements p000.InterfaceC0209de {

    /* JADX INFO: renamed from: α */
    public android.graphics.Canvas f6337;

    /* JADX INFO: renamed from: β */
    public android.graphics.Rect f6338;

    /* JADX INFO: renamed from: γ */
    public android.graphics.Rect f6339;

    public C0495l0() {
            r1 = this;
            r1.<init>()
            android.graphics.Canvas r0 = p000.AbstractC0532m0.f6880
            r1.f6337 = r0
            return
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: α */
    public final void mo1722(float r1, float r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.f6337
            r0.scale(r1, r2)
            return
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: β */
    public final void mo1723(p000.C0534m2 r9, long r10, long r12, long r14, p000.C0709q2 r16) {
            r8 = this;
            android.graphics.Rect r0 = r8.f6338
            if (r0 != 0) goto L12
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f6338 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f6339 = r0
        L12:
            android.graphics.Canvas r0 = r8.f6337
            if (r9 == 0) goto L5c
            android.graphics.Bitmap r9 = r9.f6906
            android.graphics.Rect r1 = r8.f6338
            r1.getClass()
            r2 = 32
            long r3 = r10 >> r2
            int r3 = (int) r3
            r1.left = r3
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r4
            int r10 = (int) r10
            r1.top = r10
            long r6 = r12 >> r2
            int r11 = (int) r6
            int r3 = r3 + r11
            r1.right = r3
            long r6 = r12 & r4
            int r11 = (int) r6
            int r10 = r10 + r11
            r1.bottom = r10
            android.graphics.Rect r8 = r8.f6339
            r8.getClass()
            r10 = 0
            int r3 = (int) r10
            r8.left = r3
            int r10 = (int) r10
            r8.top = r10
            long r6 = r14 >> r2
            int r11 = (int) r6
            int r3 = r3 + r11
            r8.right = r3
            long r2 = r14 & r4
            int r11 = (int) r2
            int r10 = r10 + r11
            r8.bottom = r10
            r10 = r16
            java.lang.Object r10 = r10.f8800
            android.graphics.Paint r10 = (android.graphics.Paint) r10
            r0.drawBitmap(r9, r1, r8, r10)
            return
        L5c:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "Unable to obtain android.graphics.Bitmap"
            r8.<init>(r9)
            throw r8
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: γ */
    public final void mo1724(float r1, float r2, float r3, float r4, int r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.f6337
            if (r5 != 0) goto L7
            android.graphics.Region$Op r5 = android.graphics.Region.Op.DIFFERENCE
            goto L9
        L7:
            android.graphics.Region$Op r5 = android.graphics.Region.Op.INTERSECT
        L9:
            r0.clipRect(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: δ */
    public final void mo1725(float r1, float r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.f6337
            r0.translate(r1, r2)
            return
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: ε */
    public final void mo1726(p000.z91 r2, p000.C0709q2 r3) {
            r1 = this;
            android.graphics.Canvas r1 = r1.f6337
            boolean r0 = r2 instanceof p000.C0969x2
            if (r0 == 0) goto L12
            x2 r2 = (p000.C0969x2) r2
            android.graphics.Path r2 = r2.f11999
            java.lang.Object r3 = r3.f8800
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r1.drawPath(r2, r3)
            return
        L12:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Unable to obtain android.graphics.Path"
            r1.<init>(r2)
            throw r1
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: ζ */
    public final void mo1727() {
            r0 = this;
            android.graphics.Canvas r0 = r0.f6337
            r0.restore()
            return
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: η */
    public final void mo1728(float r1, float r2, float r3, float r4, float r5, float r6, p000.C0709q2 r7) {
            r0 = this;
            android.graphics.Canvas r0 = r0.f6337
            java.lang.Object r7 = r7.f8800
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            r0.drawRoundRect(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: θ */
    public final void mo1729() {
            r0 = this;
            android.graphics.Canvas r0 = r0.f6337
            r0.save()
            return
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: ι */
    public final void mo1730() {
            r0 = this;
            android.graphics.Canvas r0 = r0.f6337
            r0.disableZ()
            return
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: κ */
    public final void mo1731(float r1, float r2, float r3, float r4, p000.C0709q2 r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.f6337
            android.graphics.Paint r5 = p000.pd2.m4500(r5)
            r0.drawRect(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: λ */
    public final void mo1732(p000.z91 r2) {
            r1 = this;
            android.graphics.Canvas r1 = r1.f6337
            boolean r0 = r2 instanceof p000.C0969x2
            if (r0 == 0) goto L10
            x2 r2 = (p000.C0969x2) r2
            android.graphics.Path r2 = r2.f11999
            android.graphics.Region$Op r0 = android.graphics.Region.Op.INTERSECT
            r1.clipPath(r2, r0)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Unable to obtain android.graphics.Path"
            r1.<init>(r2)
            throw r1
    }

    @Override // p000.InterfaceC0209de
    /* JADX INFO: renamed from: μ */
    public final void mo1733() {
            r0 = this;
            android.graphics.Canvas r0 = r0.f6337
            r0.enableZ()
            return
    }
}
