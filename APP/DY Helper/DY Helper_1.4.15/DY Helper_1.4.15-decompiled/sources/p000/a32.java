package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class a32 {

    /* JADX INFO: renamed from: α */
    public static final android.text.Layout.Alignment f57 = null;

    /* JADX INFO: renamed from: β */
    public static final android.text.Layout.Alignment f58 = null;

    static {
            android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r3 = r1
        La:
            if (r4 >= r2) goto L2c
            r5 = r0[r4]
            java.lang.String r6 = r5.name()
            java.lang.String r7 = "ALIGN_LEFT"
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L1c
            r1 = r5
            goto L29
        L1c:
            java.lang.String r6 = r5.name()
            java.lang.String r7 = "ALIGN_RIGHT"
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L29
            r3 = r5
        L29:
            int r4 = r4 + 1
            goto La
        L2c:
            p000.a32.f57 = r1
            p000.a32.f58 = r3
            return
    }
}
