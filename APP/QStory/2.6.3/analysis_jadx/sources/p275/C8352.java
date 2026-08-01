package p275;

import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏兰世子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8352 extends AbstractC8355 {
    @Override // p275.AbstractC8355
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo13864() {
        View view = this.f23035;
        view.getTranslationX();
        view.getTranslationY();
        int i = AbstractC8353.f23031[this.f23034.ordinal()];
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
