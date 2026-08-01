package com.kongzue.dialogx.interfaces;

import android.view.View;
import android.widget.FrameLayout;
import com.kongzue.dialogx.util.DialogXFloatingWindowActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3740 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f11600;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3737 f11601;

    public C3740(AbstractC3737 abstractC3737, View view) {
        this.f11601 = abstractC3737;
        this.f11600 = view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m8074(DialogXFloatingWindowActivity dialogXFloatingWindowActivity) {
        WeakReference weakReference = new WeakReference(dialogXFloatingWindowActivity);
        AbstractC3737 abstractC3737 = this.f11601;
        abstractC3737.f11587 = weakReference;
        ((DialogXFloatingWindowActivity) weakReference.get()).setFromActivity(abstractC3737.m8071());
        FrameLayout frameLayoutM8054 = AbstractC3737.m8054(dialogXFloatingWindowActivity);
        if (frameLayoutM8054 == null) {
            return;
        }
        AbstractC3737.m8043(new RunnableC3741(this, 0, frameLayoutM8054));
    }
}
