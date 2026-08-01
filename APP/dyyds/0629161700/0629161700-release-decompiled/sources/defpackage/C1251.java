package defpackage;

/* JADX INFO: renamed from: ᛷᛴᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1251 extends android.net.ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0703 f5582;

    public C1251(defpackage.C0703 r1) {
            r0 = this;
            r0.f5582 = r1
            r0.<init>()
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network r2) {
            r1 = this;
            ᲀᛸᛶᛱ r2 = new ᲀᛸᛶᛱ
            r0 = 1
            r2.<init>(r1, r0)
            android.os.Handler r1 = defpackage.AbstractC1754.m3141()
            r1.post(r2)
            return
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network r2) {
            r1 = this;
            ᲀᛸᛶᛱ r2 = new ᲀᛸᛶᛱ
            r0 = 0
            r2.<init>(r1, r0)
            android.os.Handler r1 = defpackage.AbstractC1754.m3141()
            r1.post(r2)
            return
    }
}
