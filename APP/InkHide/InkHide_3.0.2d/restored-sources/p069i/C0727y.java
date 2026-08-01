package p069i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p004C.C0064h;
import p006D.AbstractC0080i;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: i.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0727y {

    /* JADX INFO: renamed from: a */
    public final ImageView f2461a;

    /* JADX INFO: renamed from: b */
    public C0676f1 f2462b;

    /* JADX INFO: renamed from: c */
    public int f2463c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0727y(ImageView imageView) {
        this.f2461a = imageView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1376a() {
        C0676f1 c0676f1;
        ImageView imageView = this.f2461a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0705p0.m1336a(drawable);
        }
        if (drawable == null || (c0676f1 = this.f2462b) == null) {
            return;
        }
        C0719u.m1369d(drawable, c0676f1, imageView.getDrawableState());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1377b(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = this.f2461a;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0515a.f1642f;
        C0064h c0064hM114t = C0064h.m114t(context, attributeSet, iArr, i2);
        AbstractC1048L.m2289h(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0064hM114t.f309c, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0503h.m992y(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0705p0.m1336a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC0080i.m213c(imageView, c0064hM114t.m122l(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0080i.m214d(imageView, AbstractC0705p0.m1337b(typedArray.getInt(3, -1), null));
            }
            c0064hM114t.m130v();
        } catch (Throwable th) {
            c0064hM114t.m130v();
            throw th;
        }
    }
}
