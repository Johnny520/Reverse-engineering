package defpackage;

/* JADX INFO: renamed from: ᲁᛶᲀᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1874 extends defpackage.AbstractC1830 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8129;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ com.kongzue.dialogx.interfaces.AbstractC0008 f8130;

    public /* synthetic */ C1874(com.kongzue.dialogx.interfaces.AbstractC0008 r1, int r2) {
            r0 = this;
            r0.f8129 = r2
            r0.f8130 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC1830
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo3227() {
            r2 = this;
            int r0 = r2.f8129
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r2 = r2.f8130
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            ᲀᲇᲈᛳ r2 = (defpackage.C1776) r2
            ᛷᛷᛸᛱ r0 = r2.f1241
            android.view.View r0 = r0.f5822
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r0
            float r0 = r0.getY()
            r2.f7843 = r0
            return
        L16:
            ᲀᲀᛲᛴ r2 = (defpackage.C1732) r2
            ᛳᛳᛴᛸ r0 = r2.f4767
            android.widget.RelativeLayout r0 = r0.f2158
            float r0 = r0.getY()
            r2.f7677 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "#TouchDown: "
            r0.<init>(r1)
            float r2 = r2.f7677
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.kongzue.dialogx.interfaces.AbstractC0008.m245(r2)
            return
    }
}
