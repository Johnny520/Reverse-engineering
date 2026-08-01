package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.C0113;
import com.davemorrissey.labs.subscaleview.R;
import p190.AbstractC7794;
import p190.C7785;
import p190.MenuC7802;
import p190.SubMenuC7775;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0203 extends C7785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* synthetic */ C0197 f804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f805 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203(C0197 c0197, Context context, SubMenuC7775 subMenuC7775, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC7775, false);
        this.f804 = c0197;
        if ((subMenuC7775.f21109.f21223 & 32) != 32) {
            View view2 = c0197.f791;
            this.f21184 = view2 == null ? (View) c0197.f790 : view2;
        }
        C0113 c0113 = c0197.f774;
        this.f21194 = c0113;
        AbstractC7794 abstractC7794 = this.f21195;
        if (abstractC7794 != null) {
            abstractC7794.mo701(c0113);
        }
    }

    @Override // p190.C7785
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo705() {
        int i = this.f805;
        C0197 c0197 = this.f804;
        switch (i) {
            case 0:
                c0197.f783 = null;
                super.mo705();
                break;
            default:
                MenuC7802 menuC7802 = c0197.f795;
                if (menuC7802 != null) {
                    menuC7802.m13154(true);
                }
                c0197.f784 = null;
                super.mo705();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203(C0197 c0197, Context context, MenuC7802 menuC7802, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, menuC7802, true);
        this.f804 = c0197;
        this.f21191 = 8388613;
        C0113 c0113 = c0197.f774;
        this.f21194 = c0113;
        AbstractC7794 abstractC7794 = this.f21195;
        if (abstractC7794 != null) {
            abstractC7794.mo701(c0113);
        }
    }
}
