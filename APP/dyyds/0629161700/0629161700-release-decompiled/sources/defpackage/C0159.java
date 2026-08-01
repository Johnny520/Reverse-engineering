package defpackage;

/* JADX INFO: renamed from: ᛱᲀᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0159 extends defpackage.AbstractViewOnTouchListenerC0027 {

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0911 f1129;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0616 f1130;

    public C0159(defpackage.C0616 r1, defpackage.C0616 r2, defpackage.C0911 r3) {
            r0 = this;
            r0.f1130 = r1
            r0.f1129 = r3
            r0.<init>(r2)
            return
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0027
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo334() {
            r2 = this;
            ᛴᛱᲀᛸ r2 = r2.f1130
            ᲀᲀᛴᲁ r0 = r2.getInternalPopup()
            boolean r0 = r0.mo1586()
            if (r0 != 0) goto L19
            ᲀᲀᛴᲁ r0 = r2.f3017
            int r1 = defpackage.AbstractC0044.m387(r2)
            int r2 = defpackage.AbstractC0044.m386(r2)
            r0.mo1580(r1, r2)
        L19:
            r2 = 1
            return r2
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0027
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.InterfaceC2128 mo336() {
            r0 = this;
            ᛵᛶᛵᛶ r0 = r0.f1129
            return r0
    }
}
