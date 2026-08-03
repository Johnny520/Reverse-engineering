package com.google.android.material.bottomsheet;

import Yue.C8439;
import Yue.C8472;
import Yue.InterfaceC6391;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class InsetsAnimationCallback extends C8439.AbstractC1537 {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation;
    private final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    @Override // Yue.C8439.AbstractC1537
    public void onEnd(@InterfaceC6391 C8439 c8439) {
        this.view.setTranslationY(0.0f);
    }

    @Override // Yue.C8439.AbstractC1537
    public void onPrepare(@InterfaceC6391 C8439 c8439) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // Yue.C8439.AbstractC1537
    @InterfaceC6391
    public C8472 onProgress(@InterfaceC6391 C8472 c8472, @InterfaceC6391 List<C8439> list) {
        Iterator<C8439> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().m28229() & C8472.C8483.m28355()) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, r0.m28227()));
                break;
            }
        }
        return c8472;
    }

    @Override // Yue.C8439.AbstractC1537
    @InterfaceC6391
    public C8439.C1536 onStart(@InterfaceC6391 C8439 c8439, @InterfaceC6391 C8439.C1536 c1536) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i = this.startY - this.tmpLocation[1];
        this.startTranslationY = i;
        this.view.setTranslationY(i);
        return c1536;
    }
}
