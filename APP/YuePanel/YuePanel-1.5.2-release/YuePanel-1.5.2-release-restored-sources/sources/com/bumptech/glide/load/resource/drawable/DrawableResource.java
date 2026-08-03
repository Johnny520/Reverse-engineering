package com.bumptech.glide.load.resource.drawable;

import Yue.InterfaceC6391;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public abstract class DrawableResource<T extends Drawable> implements Resource<T>, Initializable {
    protected final T drawable;

    public DrawableResource(T t) {
        this.drawable = (T) Preconditions.checkNotNull(t);
    }

    public void initialize() {
        T t = this.drawable;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof GifDrawable) {
            ((GifDrawable) t).getFirstFrame().prepareToDraw();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public final T get() {
        Drawable.ConstantState constantState = this.drawable.getConstantState();
        return constantState == null ? this.drawable : (T) constantState.newDrawable();
    }
}
