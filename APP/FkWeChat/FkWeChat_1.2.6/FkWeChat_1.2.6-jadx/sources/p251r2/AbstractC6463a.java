package p251r2;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p265s1.AbstractC7112n0;
import p265s1.InterfaceC7089i2;

/* JADX INFO: renamed from: r2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6463a {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7089i2 m25630a(InterfaceC7089i2.a aVar, Resources resources, int i10) {
        Drawable drawable = resources.getDrawable(i10, null);
        drawable.getClass();
        return AbstractC7112n0.m28015c(((BitmapDrawable) drawable).getBitmap());
    }
}
