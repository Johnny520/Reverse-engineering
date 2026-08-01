package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j32 {

    /* JADX INFO: renamed from: α */
    public final android.view.View f5305;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f5306;

    public j32(android.view.View r7, androidx.compose.p001ui.platform.AndroidComposeView r8) {
            r6 = this;
            n5 r8 = new n5
            r8.<init>(r7)
            android.view.Choreographer.getInstance()
            r6.<init>()
            r6.f5305 = r7
            long r7 = p000.r32.f9252
            g4 r0 = new g4
            java.lang.String r1 = ""
            r0.<init>(r1)
            java.lang.String r0 = r0.f4228
            int r0 = r0.length()
            int r1 = p000.r32.f9253
            r1 = 32
            long r1 = r7 >> r1
            int r1 = (int) r1
            r2 = 0
            if (r1 >= 0) goto L28
            r3 = r2
            goto L29
        L28:
            r3 = r1
        L29:
            if (r3 <= r0) goto L2c
            r3 = r0
        L2c:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r4
            int r7 = (int) r7
            if (r7 >= 0) goto L36
            goto L37
        L36:
            r2 = r7
        L37:
            if (r2 <= r0) goto L3a
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r3 != r1) goto L3f
            if (r0 == r7) goto L42
        L3f:
            p000.g81.m2269(r3, r0)
        L42:
            int r7 = p000.gl0.f4409
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            k1 r7 = new k1
            r8 = 9
            r7.<init>(r8, r6)
            qq0 r8 = p000.qq0.f9080
            oq0 r7 = p000.ln0.m3611(r8, r7)
            r6.f5306 = r7
            android.view.inputmethod.CursorAnchorInfo$Builder r6 = new android.view.inputmethod.CursorAnchorInfo$Builder
            r6.<init>()
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            return
    }
}
