package com.bumptech.glide.load.resource.drawable;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public class UnitDrawableDecoder implements ResourceDecoder<Drawable, Drawable> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@InterfaceC6391 Drawable drawable, @InterfaceC6391 Options options) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: decode(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/engine/Resource; */
    @Override // com.bumptech.glide.load.ResourceDecoder
    @InterfaceC6490
    public Resource<Drawable> decode(@InterfaceC6391 Drawable drawable, int i, int i2, @InterfaceC6391 Options options) {
        return NonOwnedDrawableResource.newInstance(drawable);
    }
}
