package com.kongzue.dialogx.interfaces;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4572 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f11947;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4570 f11948;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11949;

    public /* synthetic */ RunnableC4572(View view, AbstractC4570 abstractC4570, int i) {
        this.f11949 = i;
        this.f11947 = view;
        this.f11948 = abstractC4570;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11949;
        View view = this.f11947;
        AbstractC4570 abstractC4570 = this.f11948;
        switch (i) {
            case 0:
                if (view.getParent() != abstractC4570.m8616()) {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    abstractC4570.m8616().addView(view);
                } else {
                    AbstractC4570.m8599(((AbstractC4570) view.getTag()).mo8609().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                }
                break;
            default:
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                } else if (abstractC4570.m8616() != null) {
                    abstractC4570.m8616().removeView(view);
                }
                AbstractC4570.m8584();
                break;
        }
    }
}
