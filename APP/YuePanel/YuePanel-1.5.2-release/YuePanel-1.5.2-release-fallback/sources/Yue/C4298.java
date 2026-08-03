package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4298 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean f13613;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    @Yue.InterfaceC5336(26)
    public android.content.res.Configuration f13614;

    public C4298(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f13613 = r1
            return
    }

    @Yue.InterfaceC5336(26)
    public C4298(boolean r2, @Yue.InterfaceC4418 android.content.res.Configuration r3) {
            r1 = this;
            java.lang.String r0 = "newConfig"
            Yue.C3329.m13906(r3, r0)
            r1.<init>(r2)
            r1.f13614 = r3
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.res.Configuration m16879() {
            r2 = this;
            android.content.res.Configuration r0 = r2.f13614
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m16880() {
            r1 = this;
            boolean r0 = r1.f13613
            return r0
    }
}
