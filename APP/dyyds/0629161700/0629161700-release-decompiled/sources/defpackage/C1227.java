package defpackage;

/* JADX INFO: renamed from: ᛷᛲᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1227 extends defpackage.AbstractViewOnTouchListenerC0027 {

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final /* synthetic */ int f5521;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f5522;

    public C1227(androidx.appcompat.view.menu.ActionMenuItemView r2) {
            r1 = this;
            r0 = 0
            r1.f5521 = r0
            r1.f5522 = r2
            r1.<init>(r2)
            return
    }

    public C1227(defpackage.C0962 r2, defpackage.C0962 r3) {
            r1 = this;
            r0 = 1
            r1.f5521 = r0
            r1.f5522 = r2
            r1.<init>(r3)
            return
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0027
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public boolean mo333() {
            r1 = this;
            int r0 = r1.f5521
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.mo333()
            return r1
        La:
            android.view.View r1 = r1.f5522
            ᛵᲀᛸᲈ r1 = (defpackage.C0962) r1
            ᲁᲀᛴᛷ r1 = r1.f4270
            ᛱᲈᛷᲀ r0 = r1.f8297
            if (r0 == 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1.m3340()
            r1 = 1
        L1a:
            return r1
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0027
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final boolean mo334() {
            r3 = this;
            int r0 = r3.f5521
            r1 = 1
            android.view.View r2 = r3.f5522
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            ᛵᲀᛸᲈ r2 = (defpackage.C0962) r2
            ᲁᲀᛴᛷ r3 = r2.f4270
            r3.m3342()
            return r1
        L10:
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            ᛴᛷᛵᛱ r0 = r2.f17
            if (r0 == 0) goto L2b
            ᛲᛲᛶᲁ r2 = r2.f18
            boolean r0 = r0.mo16(r2)
            if (r0 == 0) goto L2b
            ᲇᲁᛲᲀ r3 = r3.mo336()
            if (r3 == 0) goto L2b
            boolean r3 = r3.mo2605()
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            return r1
    }

    @Override // defpackage.AbstractViewOnTouchListenerC0027
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.InterfaceC2128 mo336() {
            r2 = this;
            int r0 = r2.f5521
            r1 = 0
            android.view.View r2 = r2.f5522
            switch(r0) {
                case 0: goto L16;
                default: goto L8;
            }
        L8:
            ᛵᲀᛸᲈ r2 = (defpackage.C0962) r2
            ᲁᲀᛴᛷ r2 = r2.f4270
            ᛲᲈᛸᛲ r2 = r2.f8286
            if (r2 != 0) goto L11
            goto L15
        L11:
            ᛶᲇᲀᛵ r1 = r2.m3338()
        L15:
            return r1
        L16:
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            ᲀᲈᛵᛳ r2 = r2.f23
            if (r2 == 0) goto L28
            ᛷᛷᛱᲁ r2 = (defpackage.C1309) r2
            ᲁᲀᛴᛷ r2 = r2.f5780
            ᛲᲈᛸᛲ r2 = r2.f8293
            if (r2 == 0) goto L28
            ᛶᲇᲀᛵ r1 = r2.m3338()
        L28:
            return r1
    }
}
