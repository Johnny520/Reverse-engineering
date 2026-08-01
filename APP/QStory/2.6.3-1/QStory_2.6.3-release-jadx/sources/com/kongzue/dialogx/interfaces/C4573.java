package com.kongzue.dialogx.interfaces;

import android.view.View;
import android.widget.FrameLayout;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4573 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f11950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4570 f11951;

    public C4573(AbstractC4570 abstractC4570, View view) {
        this.f11951 = abstractC4570;
        this.f11950 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8620(DialogXFloatingWindowActivity dialogXFloatingWindowActivity) {
        WeakReference weakReference = new WeakReference(dialogXFloatingWindowActivity);
        AbstractC4570 abstractC4570 = this.f11951;
        abstractC4570.f11937 = weakReference;
        ((DialogXFloatingWindowActivity) weakReference.get()).setFromActivity(abstractC4570.m8617());
        FrameLayout frameLayoutM8600 = AbstractC4570.m8600(dialogXFloatingWindowActivity);
        if (frameLayoutM8600 == null) {
            return;
        }
        AbstractC4570.m8589(new RunnableC4574(this, 0, frameLayoutM8600));
    }
}
