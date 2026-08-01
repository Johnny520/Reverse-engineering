package defpackage;

/* JADX INFO: renamed from: ᛳᛵᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0475 extends defpackage.AbstractC0094 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0740 f2395;

    public C0475(defpackage.C0740 r1) {
            r0 = this;
            r0.f2395 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0094
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo588(defpackage.C0055 r7, defpackage.AbstractC2316 r8) {
            r6 = this;
            r0 = -144362725350958(0xffff7cb3ef0961d2, double:NaN)
            r0 = -144418559925806(0xffff7ca6ef0961d2, double:NaN)
            super.mo588(r7, r8)
            java.util.List r7 = defpackage.AbstractC1253.f5590
            ᛴᛸᲈᛳ r6 = r6.f2395
            java.util.ArrayList r0 = r6.f3494
            r6 = -381857236950574(0xfffea4b3ef0961d2, double:NaN)
            ᛶᲀᛵ r6 = defpackage.C1141.f5173
            r7 = -381883006754350(0xfffea4adef0961d2, double:NaN)
            java.lang.String r1 = "|"
            ᛴᛳᛷᛸ r4 = new ᛴᛳᛷᛸ
            r7 = 12
            r4.<init>(r7)
            r5 = 30
            r2 = 0
            r3 = 0
            java.lang.String r7 = defpackage.AbstractC1107.m2125(r0, r1, r2, r3, r4, r5)
            r6.getClass()
            r0 = -18885255798318(0xffffeed2ef0961d2, double:NaN)
            ᲀᲇᛸᛶ r6 = defpackage.C1141.f5112
            ᲁᛷᛶᛶ[] r8 = defpackage.C1141.f5221
            r0 = 94
            r8 = r8[r0]
            r6.m3168(r8, r7)
            r6 = -137293209181742(0xffff8321ef0961d2, double:NaN)
            java.lang.String r6 = "排序已保存"
            defpackage.AbstractC0209.m764(r6)
            return
    }

    @Override // defpackage.AbstractC0094
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final boolean mo589(defpackage.C0055 r3, defpackage.AbstractC2316 r4, defpackage.AbstractC2316 r5) {
            r2 = this;
            r0 = -144182336724526(0xffff7cddef0961d2, double:NaN)
            r0 = -144238171299374(0xffff7cd0ef0961d2, double:NaN)
            r0 = -144285415939630(0xffff7cc5ef0961d2, double:NaN)
            int r3 = r4.m3783()
            int r4 = r5.m3783()
            ᛴᛸᲈᛳ r2 = r2.f2395
            java.util.ArrayList r5 = r2.f3494
            r0 = -1
            if (r3 == r0) goto L48
            if (r4 != r0) goto L2a
            goto L48
        L2a:
            if (r3 < 0) goto L48
            int r0 = r5.size()
            if (r3 >= r0) goto L48
            if (r4 < 0) goto L48
            int r0 = r5.size()
            if (r4 >= r0) goto L48
            java.lang.Object r0 = r5.remove(r3)
            ᛳᛷᛸ r0 = (defpackage.C0515) r0
            r5.add(r4, r0)
            r2.notifyItemMoved(r3, r4)
            r2 = 1
            return r2
        L48:
            r2 = 0
            return r2
    }

    @Override // defpackage.AbstractC0094
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final void mo590() {
            r2 = this;
            r0 = -144315480710702(0xffff7cbeef0961d2, double:NaN)
            return
    }
}
