package yyds;

import android.content.Context;
import android.view.View;
import com.p000ss.android.ugc.aweme.yyds.R;

/* JADX INFO: renamed from: yyds.ᛳᛷᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0640 extends C1649 {

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1313 f3075;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3076 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640(C1313 c1313, Context context, SubMenuC1011 subMenuC1011, View view) {
        super(context, subMenuC1011, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f3075 = c1313;
        if ((subMenuC1011.f4600.f5262 & 32) != 32) {
            View view2 = c1313.f6014;
            this.f8391 = view2 == null ? (View) c1313.f6016 : view2;
        }
        C0052 c0052 = c1313.f6022;
        this.f8389 = c0052;
        AbstractC2356 abstractC2356 = this.f8390;
        if (abstractC2356 != null) {
            abstractC2356.mo1508(c0052);
        }
    }

    @Override // yyds.C1649
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void mo1534() {
        int i = this.f3076;
        C1313 c1313 = this.f3075;
        switch (i) {
            case 0:
                c1313.f6012 = null;
                super.mo1534();
                break;
            default:
                MenuC0836 menuC0836 = c1313.f6004;
                if (menuC0836 != null) {
                    menuC0836.m1914(true);
                }
                c1313.f6013 = null;
                super.mo1534();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640(C1313 c1313, Context context, MenuC0836 menuC0836, View view) {
        super(context, menuC0836, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f3075 = c1313;
        this.f8398 = 8388613;
        C0052 c0052 = c1313.f6022;
        this.f8389 = c0052;
        AbstractC2356 abstractC2356 = this.f8390;
        if (abstractC2356 != null) {
            abstractC2356.mo1508(c0052);
        }
    }
}
