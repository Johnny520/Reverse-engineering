package p000;

/* JADX INFO: renamed from: q2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0709q2 {

    /* JADX INFO: renamed from: α */
    public int f8799;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f8800;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f8801;

    /* JADX INFO: renamed from: δ */
    public java.lang.Object f8802;

    public C0709q2(android.graphics.Paint r1) {
            r0 = this;
            r0.<init>()
            r0.f8800 = r1
            r1 = 3
            r0.f8799 = r1
            return
    }

    public C0709q2(androidx.drawerlayout.widget.DrawerLayout r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.f8802 = r2
            d1 r2 = new d1
            r0 = 3
            r2.<init>(r0, r1)
            r1.f8801 = r2
            r1.f8799 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public int m4710(android.view.View r2, int r3) {
            r1 = this;
            java.lang.Object r1 = r1.f8802
            androidx.drawerlayout.widget.DrawerLayout r1 = (androidx.drawerlayout.widget.DrawerLayout) r1
            r0 = 3
            boolean r0 = r1.m450(r2, r0)
            if (r0 == 0) goto L1a
            int r1 = r2.getWidth()
            int r1 = -r1
            r2 = 0
            int r2 = java.lang.Math.min(r3, r2)
            int r1 = java.lang.Math.max(r1, r2)
            return r1
        L1a:
            int r1 = r1.getWidth()
            int r2 = r2.getWidth()
            int r2 = r1 - r2
            int r1 = java.lang.Math.min(r3, r1)
            int r1 = java.lang.Math.max(r2, r1)
            return r1
    }

    /* JADX INFO: renamed from: β */
    public void m4711(android.view.View r3, int r4) {
            r2 = this;
            int r0 = r3.getWidth()
            java.lang.Object r2 = r2.f8802
            androidx.drawerlayout.widget.DrawerLayout r2 = (androidx.drawerlayout.widget.DrawerLayout) r2
            r1 = 3
            boolean r1 = r2.m450(r3, r1)
            if (r1 == 0) goto L14
            int r4 = r4 + r0
            float r4 = (float) r4
        L11:
            float r0 = (float) r0
            float r4 = r4 / r0
            goto L1b
        L14:
            int r1 = r2.getWidth()
            int r1 = r1 - r4
            float r4 = (float) r1
            goto L11
        L1b:
            r2.m459(r3, r4)
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L25
            r4 = 4
            goto L26
        L25:
            r4 = 0
        L26:
            r3.setVisibility(r4)
            r2.invalidate()
            return
    }

    /* JADX INFO: renamed from: γ */
    public void m4712(float r3) {
            r2 = this;
            java.lang.Object r2 = r2.f8800
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.rint(r0)
            float r3 = (float) r0
            int r3 = (int) r3
            r2.setAlpha(r3)
            return
    }

    /* JADX INFO: renamed from: δ */
    public void m4713(int r2) {
            r1 = this;
            int r0 = r1.f8799
            if (r0 != r2) goto L5
            return
        L5:
            r1.f8799 = r2
            java.lang.Object r1 = r1.f8800
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            android.graphics.BlendMode r2 = p000.AbstractC0978xb.m6600(r2)
            r1.setBlendMode(r2)
            return
    }

    /* JADX INFO: renamed from: ε */
    public void m4714(long r1) {
            r0 = this;
            java.lang.Object r0 = r0.f8800
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            int r1 = p000.kn0.m3355(r1)
            r0.setColor(r1)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public void m4715(android.graphics.Shader r1) {
            r0 = this;
            r0.f8801 = r1
            java.lang.Object r0 = r0.f8800
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setShader(r1)
            return
    }

    /* JADX INFO: renamed from: η */
    public void m4716(int r2) {
            r1 = this;
            java.lang.Object r1 = r1.f8800
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            r0 = 1
            if (r2 != r0) goto La
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            goto Lc
        La:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
        Lc:
            r1.setStyle(r2)
            return
    }
}
