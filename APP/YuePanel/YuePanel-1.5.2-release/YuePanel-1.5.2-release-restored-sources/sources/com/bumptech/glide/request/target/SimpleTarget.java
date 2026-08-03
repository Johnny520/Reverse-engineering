package com.bumptech.glide.request.target;

import Yue.InterfaceC6391;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class SimpleTarget<Z> extends BaseTarget<Z> {
    private final int height;
    private final int width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SimpleTarget() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void getSize(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
        if (Util.isValidDimensions(this.width, this.height)) {
            sizeReadyCallback.onSizeReady(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SimpleTarget(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
