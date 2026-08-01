package defpackage;

/* JADX INFO: renamed from: ᛸᛷᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1529 extends defpackage.AbstractC0762 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f6742;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f6743;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6744;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f6745;

    public C1529(defpackage.C0235 r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f6744 = r0
            r1.<init>()
            r1.f6745 = r2
            r1.f6742 = r3
            r1.f6743 = r0
            return
    }

    public C1529(defpackage.C1783 r2) {
            r1 = this;
            r0 = 1
            r1.f6744 = r0
            r1.<init>()
            r1.f6745 = r2
            r2 = 0
            r1.f6743 = r2
            r1.f6742 = r2
            return
    }

    @Override // defpackage.AbstractC0762, defpackage.InterfaceC2045
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo1689() {
            r2 = this;
            int r0 = r2.f6744
            java.lang.Object r1 = r2.f6745
            switch(r0) {
                case 0: goto L19;
                default: goto L7;
            }
        L7:
            boolean r0 = r2.f6743
            if (r0 == 0) goto Lc
            goto L18
        Lc:
            r0 = 1
            r2.f6743 = r0
            ᲀᲈᛶᲀ r1 = (defpackage.C1783) r1
            ᲇᛴᲇᛵ r2 = r1.f7859
            if (r2 == 0) goto L18
            r2.mo1689()
        L18:
            return
        L19:
            ᛲᛱᛶᛲ r1 = (defpackage.C0235) r1
            androidx.appcompat.widget.Toolbar r2 = r1.f1415
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    @Override // defpackage.InterfaceC2045
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo1855() {
            r3 = this;
            int r0 = r3.f6744
            java.lang.Object r1 = r3.f6745
            switch(r0) {
                case 0: goto L26;
                default: goto L7;
            }
        L7:
            int r0 = r3.f6742
            int r0 = r0 + 1
            r3.f6742 = r0
            ᲀᲈᛶᲀ r1 = (defpackage.C1783) r1
            java.util.ArrayList r2 = r1.f7861
            int r2 = r2.size()
            if (r0 != r2) goto L25
            ᲇᛴᲇᛵ r0 = r1.f7859
            if (r0 == 0) goto L1e
            r0.mo1855()
        L1e:
            r0 = 0
            r3.f6742 = r0
            r3.f6743 = r0
            r1.f7858 = r0
        L25:
            return
        L26:
            boolean r0 = r3.f6743
            if (r0 != 0) goto L33
            ᛲᛱᛶᛲ r1 = (defpackage.C0235) r1
            androidx.appcompat.widget.Toolbar r0 = r1.f1415
            int r3 = r3.f6742
            r0.setVisibility(r3)
        L33:
            return
    }

    @Override // defpackage.AbstractC0762, defpackage.InterfaceC2045
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public void mo1690() {
            r1 = this;
            int r0 = r1.f6744
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            r0 = 1
            r1.f6743 = r0
            return
    }
}
