package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q92 {

    /* JADX INFO: renamed from: α */
    public final java.util.LinkedHashMap f8929;

    public q92() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f8929 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m4818() {
            r2 = this;
            java.util.LinkedHashMap r2 = r2.f8929
            java.util.Collection r0 = r2.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            m92 r1 = (p000.m92) r1
            r1.m3800()
            goto La
        L1a:
            r2.clear()
            return
    }
}
