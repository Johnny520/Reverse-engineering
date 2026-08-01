package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class a92 {
    /* JADX INFO: renamed from: α */
    public static java.lang.String[] m51(android.view.View r0) {
            java.lang.String[] r0 = r0.getReceiveContentMimeTypes()
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static p000.C0367hp m52(android.view.View r1, p000.C0367hp r2) {
            gp r0 = r2.f4783
            android.view.ContentInfo r0 = r0.mo2195()
            java.util.Objects.requireNonNull(r0)
            android.view.ContentInfo r1 = r1.performReceiveContent(r0)
            if (r1 != 0) goto L11
            r1 = 0
            return r1
        L11:
            if (r1 != r0) goto L14
            return r2
        L14:
            hp r2 = new hp
            n r0 = new n
            r0.<init>(r1)
            r2.<init>(r0)
            return r2
    }
}
