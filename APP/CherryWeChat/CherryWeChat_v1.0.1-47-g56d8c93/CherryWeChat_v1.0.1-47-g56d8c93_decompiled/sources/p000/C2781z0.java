package p000;

import android.content.Context;
import android.view.View;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2781z0 extends C2728xr {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f9440l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0130D0 f9441m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2781z0(C0130D0 c0130d0, Context context, MenuC2204lr menuC2204lr, View view) {
        super(context, menuC2204lr, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f9441m = c0130d0;
        this.f9320f = 8388613;
        C0132D2 c0132d2 = c0130d0.f324w;
        this.f9322h = c0132d2;
        AbstractC2642vr abstractC2642vr = this.f9323i;
        if (abstractC2642vr != null) {
            abstractC2642vr.mo216e(c0132d2);
        }
    }

    @Override // p000.C2728xr
    /* JADX INFO: renamed from: c */
    public final void mo5292c() {
        switch (this.f9440l) {
            case 0:
                C0130D0 c0130d0 = this.f9441m;
                c0130d0.f321t = null;
                c0130d0.getClass();
                super.mo5292c();
                break;
            default:
                C0130D0 c0130d02 = this.f9441m;
                MenuC2204lr menuC2204lr = c0130d02.f304c;
                if (menuC2204lr != null) {
                    menuC2204lr.m4430c(true);
                }
                c0130d02.f320s = null;
                super.mo5292c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2781z0(C0130D0 c0130d0, Context context, SubMenuC0214Ez subMenuC0214Ez, View view) {
        super(context, subMenuC0214Ez, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f9441m = c0130d0;
        if ((subMenuC0214Ez.f630A.f8515x & 32) != 32) {
            View view2 = c0130d0.f310i;
            this.f9319e = view2 == null ? (View) c0130d0.f309h : view2;
        }
        C0132D2 c0132d2 = c0130d0.f324w;
        this.f9322h = c0132d2;
        AbstractC2642vr abstractC2642vr = this.f9323i;
        if (abstractC2642vr != null) {
            abstractC2642vr.mo216e(c0132d2);
        }
    }
}
