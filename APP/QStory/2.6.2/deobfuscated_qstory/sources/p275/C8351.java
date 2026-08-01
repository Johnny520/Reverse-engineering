package p275;

import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏兰世子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8351 extends AbstractC8354 {
    @Override // p275.AbstractC8354
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo13847() {
        View view = this.f23036;
        view.getTranslationX();
        view.getTranslationY();
        int i = AbstractC8352.f23032[this.f23035.ordinal()];
        if (i == 1) {
            view.setTranslationX(view.getTranslationX() + (-view.getRight()));
        } else if (i == 2) {
            view.setTranslationY(view.getTranslationY() + (-view.getBottom()));
        } else if (i == 3) {
            view.setTranslationX(view.getTranslationX() + (((View) view.getParent()).getMeasuredWidth() - view.getLeft()));
        } else if (i == 4) {
            view.setTranslationY(view.getTranslationY() + (((View) view.getParent()).getMeasuredHeight() - view.getTop()));
        }
        view.getTranslationX();
        view.getTranslationY();
    }
}
