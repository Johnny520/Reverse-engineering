package com.bumptech.glide.util;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.ListPreloader;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.transition.Transition;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ViewPreloadSizeProvider<T> implements ListPreloader.PreloadSizeProvider<T>, SizeReadyCallback {
    private int[] size;
    private SizeViewTarget viewTarget;

    public static final class SizeViewTarget extends CustomViewTarget<View, Object> {
        public SizeViewTarget(@InterfaceC6391 View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(@InterfaceC6490 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        public void onResourceCleared(@InterfaceC6490 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(@InterfaceC6391 Object obj, @InterfaceC6490 Transition<? super Object> transition) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewPreloadSizeProvider() {
    }

    @Override // com.bumptech.glide.ListPreloader.PreloadSizeProvider
    @InterfaceC6490
    public int[] getPreloadSize(@InterfaceC6391 T t, int i, int i2) {
        int[] iArr = this.size;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int i, int i2) {
        this.size = new int[]{i, i2};
        this.viewTarget = null;
    }

    public void setView(@InterfaceC6391 View view) {
        if (this.size == null && this.viewTarget == null) {
            SizeViewTarget sizeViewTarget = new SizeViewTarget(view);
            this.viewTarget = sizeViewTarget;
            sizeViewTarget.getSize(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ViewPreloadSizeProvider(@InterfaceC6391 View view) {
        SizeViewTarget sizeViewTarget = new SizeViewTarget(view);
        this.viewTarget = sizeViewTarget;
        sizeViewTarget.getSize(this);
    }
}
