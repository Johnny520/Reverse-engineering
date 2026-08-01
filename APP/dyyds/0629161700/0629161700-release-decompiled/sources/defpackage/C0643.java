package defpackage;

/* JADX INFO: renamed from: ᛴᛳᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0643 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f3166;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC1270 f3167;

    public /* synthetic */ C0643(defpackage.AbstractC1270 r1, int r2) {
            r0 = this;
            r0.f3166 = r2
            r0.f3167 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int m1475() {
            r1 = this;
            int r0 = r1.f3166
            ᛷᛵᛱᲀ r1 = r1.f3167
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            int r1 = r1.m2402()
            return r1
        Lc:
            int r1 = r1.m2380()
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int m1476() {
            r1 = this;
            int r0 = r1.f3166
            ᛷᛵᛱᲀ r1 = r1.f3167
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            int r0 = r1.f5683
            int r1 = r1.m2397()
        Ld:
            int r0 = r0 - r1
            return r0
        Lf:
            int r0 = r1.f5690
            int r1 = r1.m2389()
            goto Ld
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1477(android.view.View r1) {
            r0 = this;
            int r0 = r0.f3166
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r0 = (defpackage.C0840) r0
            int r1 = defpackage.AbstractC1270.m2377(r1)
            int r0 = r0.bottomMargin
        L11:
            int r1 = r1 + r0
            return r1
        L13:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r0 = (defpackage.C0840) r0
            int r1 = defpackage.AbstractC1270.m2374(r1)
            int r0 = r0.rightMargin
            goto L11
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m1478(android.view.View r1) {
            r0 = this;
            int r0 = r0.f3166
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r0 = (defpackage.C0840) r0
            int r1 = defpackage.AbstractC1270.m2370(r1)
            int r0 = r0.topMargin
        L11:
            int r1 = r1 - r0
            return r1
        L13:
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r0 = (defpackage.C0840) r0
            int r1 = defpackage.AbstractC1270.m2375(r1)
            int r0 = r0.leftMargin
            goto L11
    }
}
