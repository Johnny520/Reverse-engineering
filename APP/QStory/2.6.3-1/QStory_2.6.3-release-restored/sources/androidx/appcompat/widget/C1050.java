package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.C0960;
import com.davemorrissey.labs.subscaleview.C0328R;
import p206.AbstractC8623;
import p206.C8614;
import p206.MenuC8631;
import p206.SubMenuC8604;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1050 extends C8614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* synthetic */ C1044 f1149;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f1150 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050(C1044 c1044, Context context, SubMenuC8604 subMenuC8604, View view) {
        super(C0328R.attr.actionOverflowMenuStyle, 0, context, view, subMenuC8604, false);
        this.f1149 = c1044;
        if ((subMenuC8604.f21454.f21568 & 32) != 32) {
            View view2 = c1044.f1136;
            this.f21529 = view2 == null ? (View) c1044.f1135 : view2;
        }
        C0960 c0960 = c1044.f1119;
        this.f21539 = c0960;
        AbstractC8623 abstractC8623 = this.f21540;
        if (abstractC8623 != null) {
            abstractC8623.mo1261(c0960);
        }
    }

    @Override // p206.C8614
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1265() {
        int i = this.f1150;
        C1044 c1044 = this.f1149;
        switch (i) {
            case 0:
                c1044.f1128 = null;
                super.mo1265();
                break;
            default:
                MenuC8631 menuC8631 = c1044.f1140;
                if (menuC8631 != null) {
                    menuC8631.m13713(true);
                }
                c1044.f1129 = null;
                super.mo1265();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050(C1044 c1044, Context context, MenuC8631 menuC8631, View view) {
        super(C0328R.attr.actionOverflowMenuStyle, 0, context, view, menuC8631, true);
        this.f1149 = c1044;
        this.f21536 = 8388613;
        C0960 c0960 = c1044.f1119;
        this.f21539 = c0960;
        AbstractC8623 abstractC8623 = this.f21540;
        if (abstractC8623 != null) {
            abstractC8623.mo1261(c0960);
        }
    }
}
