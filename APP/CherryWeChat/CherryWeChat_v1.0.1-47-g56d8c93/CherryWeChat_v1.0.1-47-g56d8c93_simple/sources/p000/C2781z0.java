package p000;

import android.content.Context;
import android.view.View;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2781z0 extends C2728xr {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f9440l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0130D0 f9441m;

    public C2781z0(C0130D0 r9, Context r10, MenuC2204lr r11, View r12) {
        this.f9440l = 1;
        this.f9441m = r9;
        super(r10, r11, r12, true, R.attr.actionOverflowMenuStyle, 0);
        this.f9320f = 8388613;
        C0132D2 r92 = r9.f324w;
        this.f9322h = r92;
        AbstractC2642vr r102 = this.f9323i;
        if (r102 == null) goto L6;
        r102.mo216e(r92);
        return;
    }

    @Override // p000.C2728xr
    /* JADX INFO: renamed from: c */
    public final void mo5292c() {
        switch(this.f9440l) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C0130D0 r0 = this.f9441m;
        MenuC2204lr r1 = r0.f304c;
        if (r1 == null) goto L7;
        r1.m4430c(true);
    L7:
        r0.f320s = null;
        super.mo5292c();
        return;
    L9:
        C0130D0 r12 = this.f9441m;
        r12.f321t = null;
        r12.getClass();
        super.mo5292c();
    }

    public C2781z0(C0130D0 r9, Context r10, SubMenuC0214Ez r11, View r12) {
        this.f9440l = 0;
        this.f9441m = r9;
        super(r10, r11, r12, false, R.attr.actionOverflowMenuStyle, 0);
        if ((r11.f630A.f8515x & 32) == 32) goto L9;
        View r102 = r9.f310i;
        if (r102 != null) goto L8;
        r102 = (View) r9.f309h;
    L8:
        this.f9319e = r102;
    L9:
        C0132D2 r92 = r9.f324w;
        this.f9322h = r92;
        AbstractC2642vr r103 = this.f9323i;
        if (r103 == null) goto L13;
        r103.mo216e(r92);
        return;
    }
}
