package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bf extends defpackage.eu {
    public static final /* synthetic */ int y = 0;
    public defpackage.af x;

    @Override // defpackage.eu
    public final void e(android.graphics.Canvas r2) {
            r1 = this;
            af r0 = r1.x
            android.graphics.RectF r0 = r0.q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            super.e(r2)
            return
        Le:
            r2.save()
            af r0 = r1.x
            android.graphics.RectF r0 = r0.q
            r2.clipOutRect(r0)
            super.e(r2)
            r2.restore()
            return
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
            r2 = this;
            af r0 = new af
            af r1 = r2.x
            r0.<init>(r1)
            r2.x = r0
            return r2
    }

    public final void n(float r3, float r4, float r5, float r6) {
            r2 = this;
            af r0 = r2.x
            android.graphics.RectF r0 = r0.q
            float r1 = r0.left
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
            float r1 = r0.top
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
            float r1 = r0.right
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L1e
            float r1 = r0.bottom
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L1d
            goto L1e
        L1d:
            return
        L1e:
            r0.set(r3, r4, r5, r6)
            r2.invalidateSelf()
            return
    }
}
