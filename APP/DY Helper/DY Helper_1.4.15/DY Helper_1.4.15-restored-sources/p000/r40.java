package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class r40 {

    /* JADX INFO: renamed from: α */
    public static final int[] f9257 = null;

    /* JADX INFO: renamed from: β */
    public static final android.graphics.Rect f9258 = null;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            p000.r40.f9257 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            p000.r40.f9258 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final p000.ml1 m5061(android.view.View r5, androidx.compose.p001ui.platform.AndroidComposeView r6) {
            int[] r0 = p000.r40.f9257
            r5.getLocationInWindow(r0)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            r4 = r0[r3]
            r6.getLocationInWindow(r0)
            r6 = r0[r1]
            r0 = r0[r3]
            int r2 = r2 - r6
            float r6 = (float) r2
            int r4 = r4 - r0
            float r0 = (float) r4
            android.graphics.Rect r1 = p000.r40.f9258
            r5.getFocusedRect(r1)
            ml1 r5 = new ml1
            int r2 = r1.left
            float r2 = (float) r2
            float r6 = r6 + r2
            int r2 = r1.top
            float r2 = (float) r2
            float r2 = r2 + r0
            int r3 = r1.width()
            float r3 = (float) r3
            float r3 = r3 + r6
            int r4 = r1.top
            float r4 = (float) r4
            float r0 = r0 + r4
            int r1 = r1.height()
            float r1 = (float) r1
            float r0 = r0 + r1
            r5.<init>(r6, r2, r3, r0)
            return r5
    }

    /* JADX INFO: renamed from: β */
    public static final p000.q40 m5062(int r2) {
            r0 = 2
            r1 = 1
            if (r2 == r1) goto L3a
            if (r2 == r0) goto L34
            r0 = 17
            if (r2 == r0) goto L2d
            r0 = 33
            if (r2 == r0) goto L26
            r0 = 66
            if (r2 == r0) goto L1f
            r0 = 130(0x82, float:1.82E-43)
            if (r2 == r0) goto L18
            r2 = 0
            return r2
        L18:
            q40 r2 = new q40
            r0 = 6
            r2.<init>(r0)
            return r2
        L1f:
            q40 r2 = new q40
            r0 = 4
            r2.<init>(r0)
            return r2
        L26:
            q40 r2 = new q40
            r0 = 5
            r2.<init>(r0)
            return r2
        L2d:
            q40 r2 = new q40
            r0 = 3
            r2.<init>(r0)
            return r2
        L34:
            q40 r2 = new q40
            r2.<init>(r1)
            return r2
        L3a:
            q40 r2 = new q40
            r2.<init>(r0)
            return r2
    }
}
