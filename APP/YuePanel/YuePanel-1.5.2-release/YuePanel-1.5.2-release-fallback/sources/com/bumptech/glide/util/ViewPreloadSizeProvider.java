package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public class ViewPreloadSizeProvider<T> implements com.bumptech.glide.ListPreloader.PreloadSizeProvider<T>, com.bumptech.glide.request.target.SizeReadyCallback {
    private int[] size;
    private com.bumptech.glide.util.ViewPreloadSizeProvider.SizeViewTarget viewTarget;

    public static final class SizeViewTarget extends com.bumptech.glide.request.target.CustomViewTarget<android.view.View, java.lang.Object> {
        public SizeViewTarget(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadFailed(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.CustomViewTarget
        public void onResourceCleared(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.request.target.Target
        public void onResourceReady(@Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4544 com.bumptech.glide.request.transition.Transition<? super java.lang.Object> r2) {
                r0 = this;
                return
        }
    }

    public ViewPreloadSizeProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    public ViewPreloadSizeProvider(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.util.ViewPreloadSizeProvider$SizeViewTarget r0 = new com.bumptech.glide.util.ViewPreloadSizeProvider$SizeViewTarget
            r0.<init>(r2)
            r1.viewTarget = r0
            r0.getSize(r1)
            return
    }

    @Override // com.bumptech.glide.ListPreloader.PreloadSizeProvider
    @Yue.InterfaceC4544
    public int[] getPreloadSize(@Yue.InterfaceC4410 T r1, int r2, int r3) {
            r0 = this;
            int[] r1 = r0.size
            if (r1 != 0) goto L6
            r1 = 0
            return r1
        L6:
            int r2 = r1.length
            int[] r1 = java.util.Arrays.copyOf(r1, r2)
            return r1
    }

    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int r1, int r2) {
            r0 = this;
            int[] r1 = new int[]{r1, r2}
            r0.size = r1
            r1 = 0
            r0.viewTarget = r1
            return
    }

    public void setView(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            int[] r0 = r1.size
            if (r0 != 0) goto L13
            com.bumptech.glide.util.ViewPreloadSizeProvider$SizeViewTarget r0 = r1.viewTarget
            if (r0 == 0) goto L9
            goto L13
        L9:
            com.bumptech.glide.util.ViewPreloadSizeProvider$SizeViewTarget r0 = new com.bumptech.glide.util.ViewPreloadSizeProvider$SizeViewTarget
            r0.<init>(r2)
            r1.viewTarget = r0
            r0.getSize(r1)
        L13:
            return
    }
}
