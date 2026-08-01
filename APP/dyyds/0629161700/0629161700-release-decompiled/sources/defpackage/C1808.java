package defpackage;

/* JADX INFO: renamed from: ᲁᛲᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1808 extends defpackage.AbstractC0263 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f7928;

    @Override // defpackage.AbstractC0263, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r2) {
            r1 = this;
            boolean r0 = r1.f7928
            if (r0 == 0) goto L7
            super.draw(r2)
        L7:
            return
    }

    @Override // defpackage.AbstractC0263, android.graphics.drawable.Drawable
    public final void setHotspot(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.f7928
            if (r0 == 0) goto L7
            super.setHotspot(r2, r3)
        L7:
            return
    }

    @Override // defpackage.AbstractC0263, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.f7928
            if (r0 == 0) goto L7
            super.setHotspotBounds(r2, r3, r4, r5)
        L7:
            return
    }

    @Override // defpackage.AbstractC0263, android.graphics.drawable.Drawable
    public final boolean setState(int[] r2) {
            r1 = this;
            boolean r0 = r1.f7928
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r1 = r1.f1521
            boolean r1 = r1.setState(r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // defpackage.AbstractC0263, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.f7928
            if (r0 == 0) goto L9
            boolean r1 = super.setVisible(r2, r3)
            return r1
        L9:
            r1 = 0
            return r1
    }
}
