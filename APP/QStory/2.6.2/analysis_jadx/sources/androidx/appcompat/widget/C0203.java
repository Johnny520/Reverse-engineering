package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.C0113;
import com.davemorrissey.labs.subscaleview.R;
import p190.AbstractC7793;
import p190.C7784;
import p190.MenuC7801;
import p190.SubMenuC7774;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0203 extends C7784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* synthetic */ C0197 f804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f805 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203(C0197 c0197, Context context, SubMenuC7774 subMenuC7774, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC7774, false);
        this.f804 = c0197;
        if ((subMenuC7774.f21112.f21226 & 32) != 32) {
            View view2 = c0197.f791;
            this.f21187 = view2 == null ? (View) c0197.f790 : view2;
        }
        C0113 c0113 = c0197.f774;
        this.f21197 = c0113;
        AbstractC7793 abstractC7793 = this.f21198;
        if (abstractC7793 != null) {
            abstractC7793.mo700(c0113);
        }
    }

    @Override // p190.C7784
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo704() {
        int i = this.f805;
        C0197 c0197 = this.f804;
        switch (i) {
            case 0:
                c0197.f783 = null;
                super.mo704();
                break;
            default:
                MenuC7801 menuC7801 = c0197.f795;
                if (menuC7801 != null) {
                    menuC7801.m13126(true);
                }
                c0197.f784 = null;
                super.mo704();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203(C0197 c0197, Context context, MenuC7801 menuC7801, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, menuC7801, true);
        this.f804 = c0197;
        this.f21194 = 8388613;
        C0113 c0113 = c0197.f774;
        this.f21197 = c0113;
        AbstractC7793 abstractC7793 = this.f21198;
        if (abstractC7793 != null) {
            abstractC7793.mo700(c0113);
        }
    }
}
