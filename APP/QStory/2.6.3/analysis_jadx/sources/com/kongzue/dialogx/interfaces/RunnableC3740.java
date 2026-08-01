package com.kongzue.dialogx.interfaces;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3740 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f11602;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3738 f11603;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11604;

    public /* synthetic */ RunnableC3740(View view, AbstractC3738 abstractC3738, int i) {
        this.f11604 = i;
        this.f11602 = view;
        this.f11603 = abstractC3738;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11604;
        View view = this.f11602;
        AbstractC3738 abstractC3738 = this.f11603;
        switch (i) {
            case 0:
                if (view.getParent() != abstractC3738.m8057()) {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    abstractC3738.m8057().addView(view);
                } else {
                    AbstractC3738.m8040(((AbstractC3738) view.getTag()).mo8050().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                }
                break;
            default:
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                } else if (abstractC3738.m8057() != null) {
                    abstractC3738.m8057().removeView(view);
                }
                AbstractC3738.m8025();
                break;
        }
    }
}
