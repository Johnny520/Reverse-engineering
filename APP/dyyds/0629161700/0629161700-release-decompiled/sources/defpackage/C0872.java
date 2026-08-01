package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0872 extends defpackage.AbstractC0762 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C2010 f3943;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3944;

    public /* synthetic */ C0872(defpackage.C2010 r1, int r2) {
            r0 = this;
            r0.f3944 = r2
            r0.f3943 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC2045
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo1855() {
            r3 = this;
            int r0 = r3.f3944
            r1 = 0
            ᲇᛲᲇᲁ r3 = r3.f3943
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            r3.f8677 = r1
            androidx.appcompat.widget.ActionBarContainer r3 = r3.f8680
            r3.requestLayout()
            return
        L10:
            boolean r0 = r3.f8676
            if (r0 == 0) goto L21
            android.view.View r0 = r3.f8693
            if (r0 == 0) goto L21
            r2 = 0
            r0.setTranslationY(r2)
            androidx.appcompat.widget.ActionBarContainer r0 = r3.f8680
            r0.setTranslationY(r2)
        L21:
            androidx.appcompat.widget.ActionBarContainer r0 = r3.f8680
            r2 = 8
            r0.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContainer r0 = r3.f8680
            r2 = 0
            r0.setTransitioning(r2)
            r3.f8677 = r1
            ᛴᛵᲇᲇ r0 = r3.f8671
            if (r0 == 0) goto L3d
            ᛶᛸᛴᲇ r2 = r3.f8684
            r0.m1565(r2)
            r3.f8684 = r1
            r3.f8671 = r1
        L3d:
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = r3.f8682
            if (r3 == 0) goto L46
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            r3.requestApplyInsets()
        L46:
            return
    }
}
