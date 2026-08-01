package defpackage;

/* JADX INFO: renamed from: ᲈᛳᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2214 extends defpackage.AbstractC0728 {

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final defpackage.C2300 f9461 = null;

    static {
            android.view.WindowInsets r0 = android.view.WindowInsets.CONSUMED
            r1 = 0
            ᲈᛸᛱᲀ r0 = defpackage.C2300.m3730(r1, r0)
            defpackage.C2214.f9461 = r0
            return
    }

    public C2214(defpackage.C2300 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.AbstractC2148, defpackage.C0377
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public defpackage.C1032 mo357(int r1) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f9129
            int r1 = defpackage.AbstractC1573.m2858(r1)
            android.graphics.Insets r0 = r0.getInsets(r1)
            ᛶᛳᛴᛲ r0 = defpackage.C1032.m1986(r0)
            return r0
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo1123(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // defpackage.AbstractC2148
    /* JADX INFO: renamed from: ᲇᛳᛴᲈ */
    public defpackage.C1032 mo359(int r1) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f9129
            int r1 = defpackage.AbstractC1573.m2858(r1)
            android.graphics.Insets r0 = r0.getInsetsIgnoringVisibility(r1)
            ᛶᛳᛴᛲ r0 = defpackage.C1032.m1986(r0)
            return r0
    }

    @Override // defpackage.C0377
    /* JADX INFO: renamed from: ᲇᲀᛲᛱ */
    public boolean mo360(int r1) {
            r0 = this;
            android.view.WindowInsets r0 = r0.f9129
            int r1 = defpackage.AbstractC1573.m2858(r1)
            boolean r0 = r0.isVisible(r1)
            return r0
    }
}
