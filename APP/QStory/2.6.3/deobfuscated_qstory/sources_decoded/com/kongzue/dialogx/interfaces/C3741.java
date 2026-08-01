package com.kongzue.dialogx.interfaces;

import android.view.View;
import android.widget.FrameLayout;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3741 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f11605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3738 f11606;

    public C3741(AbstractC3738 abstractC3738, View view) {
        this.f11606 = abstractC3738;
        this.f11605 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8061(DialogXFloatingWindowActivity dialogXFloatingWindowActivity) {
        WeakReference weakReference = new WeakReference(dialogXFloatingWindowActivity);
        AbstractC3738 abstractC3738 = this.f11606;
        abstractC3738.f11592 = weakReference;
        ((DialogXFloatingWindowActivity) weakReference.get()).setFromActivity(abstractC3738.m8058());
        FrameLayout frameLayoutM8041 = AbstractC3738.m8041(dialogXFloatingWindowActivity);
        if (frameLayoutM8041 == null) {
            return;
        }
        AbstractC3738.m8030(new RunnableC3742(this, 0, frameLayoutM8041));
    }
}
