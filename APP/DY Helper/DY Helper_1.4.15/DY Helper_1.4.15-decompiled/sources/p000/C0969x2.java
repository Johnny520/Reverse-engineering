package p000;

/* JADX INFO: renamed from: x2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0969x2 implements p000.z91 {

    /* JADX INFO: renamed from: α */
    public final android.graphics.Path f11999;

    /* JADX INFO: renamed from: β */
    public android.graphics.RectF f12000;

    /* JADX INFO: renamed from: γ */
    public float[] f12001;

    public C0969x2(android.graphics.Path r1) {
            r0 = this;
            r0.<init>()
            r0.f11999 = r1
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.ml1 m6503() {
            r4 = this;
            android.graphics.RectF r0 = r4.f12000
            if (r0 != 0) goto Lb
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.f12000 = r0
        Lb:
            android.graphics.RectF r0 = r4.f12000
            r0.getClass()
            android.graphics.Path r4 = r4.f11999
            r1 = 1
            r4.computeBounds(r0, r1)
            ml1 r4 = new ml1
            float r1 = r0.left
            float r2 = r0.top
            float r3 = r0.right
            float r0 = r0.bottom
            r4.<init>(r1, r2, r3, r0)
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m6504(p000.z91 r3, p000.z91 r4, int r5) {
            r2 = this;
            if (r5 != 0) goto L5
            android.graphics.Path$Op r5 = android.graphics.Path.Op.DIFFERENCE
            goto L19
        L5:
            r0 = 1
            if (r5 != r0) goto Lb
            android.graphics.Path$Op r5 = android.graphics.Path.Op.INTERSECT
            goto L19
        Lb:
            r0 = 4
            if (r5 != r0) goto L11
            android.graphics.Path$Op r5 = android.graphics.Path.Op.REVERSE_DIFFERENCE
            goto L19
        L11:
            r0 = 2
            if (r5 != r0) goto L17
            android.graphics.Path$Op r5 = android.graphics.Path.Op.UNION
            goto L19
        L17:
            android.graphics.Path$Op r5 = android.graphics.Path.Op.XOR
        L19:
            boolean r0 = r3 instanceof p000.C0969x2
            java.lang.String r1 = "Unable to obtain android.graphics.Path"
            if (r0 == 0) goto L38
            x2 r3 = (p000.C0969x2) r3
            android.graphics.Path r3 = r3.f11999
            boolean r0 = r4 instanceof p000.C0969x2
            if (r0 == 0) goto L32
            x2 r4 = (p000.C0969x2) r4
            android.graphics.Path r4 = r4.f11999
            android.graphics.Path r2 = r2.f11999
            boolean r2 = r2.op(r3, r4, r5)
            return r2
        L32:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>(r1)
            throw r2
        L38:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>(r1)
            throw r2
    }
}
