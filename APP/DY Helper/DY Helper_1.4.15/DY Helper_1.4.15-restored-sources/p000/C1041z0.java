package p000;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1041z0 extends p000.p80 implements p000.f80 {
    @Override // p000.f80
    /* JADX INFO: renamed from: α */
    public final java.lang.Object mo10(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L38
            jw1 r6 = (p000.jw1) r6
            long r5 = r6.f5615
            a80 r7 = (p000.a80) r7
            java.lang.Object r4 = r4.receiver
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.p001ui.platform.AndroidComposeView) r4
            java.lang.Class r1 = androidx.compose.p001ui.platform.AndroidComposeView.f872
            android.content.Context r1 = r4.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r2 = r1.getDisplayMetrics()
            float r2 = r2.density
            android.content.res.Configuration r1 = r1.getConfiguration()
            float r1 = r1.fontScale
            zr r3 = new zr
            r3.<init>(r2, r1)
            en r1 = new en
            r1.<init>(r3, r5, r7)
            n1 r5 = p000.C0570n1.f7349
            boolean r4 = r5.m3931(r4, r0, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L38:
            p000.C1080.m7264()
            return r0
    }
}
