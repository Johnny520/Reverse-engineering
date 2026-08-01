package defpackage;

/* JADX INFO: renamed from: ᛷᛴᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1265 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.MenuC1701 f5668;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0254 f5669;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1681 f5670;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1606 f5671;

    public RunnableC1265(defpackage.C1606 r1, defpackage.C1681 r2, defpackage.C0254 r3, defpackage.MenuC1701 r4) {
            r0 = this;
            r0.<init>()
            r0.f5671 = r1
            r0.f5670 = r2
            r0.f5669 = r3
            r0.f5668 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            ᛸᲈᛸᲈ r0 = r3.f5671
            java.lang.Object r0 = r0.f7101
            ᛸᛱᛷᛸ r0 = (defpackage.ViewOnKeyListenerC1423) r0
            ᲀᛵᲁᲀ r1 = r3.f5670
            if (r1 == 0) goto L15
            r2 = 1
            r0.f6233 = r2
            ᲀᛷᛱᲇ r1 = r1.f7492
            r2 = 0
            r1.m3082(r2)
            r0.f6233 = r2
        L15:
            ᛲᛲᛶᲁ r0 = r3.f5669
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L2a
            boolean r1 = r0.hasSubMenu()
            if (r1 == 0) goto L2a
            r1 = 4
            r2 = 0
            ᲀᛷᛱᲇ r3 = r3.f5668
            r3.m3085(r0, r2, r1)
        L2a:
            return
    }
}
