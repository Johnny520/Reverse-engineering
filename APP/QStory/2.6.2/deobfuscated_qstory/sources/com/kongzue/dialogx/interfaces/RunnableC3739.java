package com.kongzue.dialogx.interfaces;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3739 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f11597;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3737 f11598;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11599;

    public /* synthetic */ RunnableC3739(View view, AbstractC3737 abstractC3737, int i) {
        this.f11599 = i;
        this.f11597 = view;
        this.f11598 = abstractC3737;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11599;
        View view = this.f11597;
        AbstractC3737 abstractC3737 = this.f11598;
        switch (i) {
            case 0:
                if (view.getParent() != abstractC3737.m8070()) {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    abstractC3737.m8070().addView(view);
                } else {
                    AbstractC3737.m8053(((AbstractC3737) view.getTag()).mo8063().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                }
                break;
            default:
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                } else if (abstractC3737.m8070() != null) {
                    abstractC3737.m8070().removeView(view);
                }
                AbstractC3737.m8038();
                break;
        }
    }
}
