package Yue;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Yue.ۥۢۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7836 extends C7140 {

    /* JADX INFO: renamed from: ۥ۟ */
    public final WeakReference<Context> f3110;

    public C7836(@InterfaceC6391 Context context, @InterfaceC6391 Resources resources) {
        super(resources);
        this.f3110 = new WeakReference<>(context);
    }

    @Override // Yue.C7140, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawableM3428 = m3428(i);
        Context context = this.f3110.get();
        if (drawableM3428 != null && context != null) {
            C7124.m22248().m22267(context, i, drawableM3428);
        }
        return drawableM3428;
    }
}
