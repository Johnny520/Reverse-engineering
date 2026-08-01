package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class td2 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ java.lang.String f10341;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ boolean f10342;

    public /* synthetic */ td2(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f10341 = r1
            r0.f10342 = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            java.lang.String r0 = r1.f10341
            boolean r1 = r1.f10342
            java.lang.Thread r1 = p000.AbstractC0602nx.m4139(r2, r0, r1)
            return r1
    }
}
