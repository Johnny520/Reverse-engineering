package yyds;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛷᛸᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1607 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8177;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f8178;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f8179;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f8180;

    public C1607(C0716 c0716) {
        this.f8177 = 3;
        this.f8180 = AbstractC2217.m4205(150, new C0052(21, this));
        this.f8179 = c0716;
    }

    public String toString() {
        int i = this.f8177;
        Object obj = this.f8179;
        switch (i) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                Integer num = (Integer) obj;
                sb.append(num == null ? "" : num.toString());
                sb.append(":");
                Integer num2 = (Integer) this.f8180;
                return AbstractC2104.m4015(sb, num2 != null ? num2.toString() : "", "]");
            case 4:
                StringBuilder sb2 = new StringBuilder();
                if (((EnumC0940) obj) == EnumC0940.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f8178);
                sb2.append(' ');
                sb2.append((String) this.f8180);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m3307() {
        C2731 c2731;
        ImageView imageView = (ImageView) this.f8179;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC2137.m4075(drawable);
        }
        if (drawable == null || (c2731 = (C2731) this.f8180) == null) {
            return;
        }
        int[] drawableState = imageView.getDrawableState();
        PorterDuff.Mode mode = C1541.f7386;
        C1542.m3173(drawable, c2731, drawableState);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m3308(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f8179;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1592.f8111;
        C0644 c0644M1535 = C0644.m1535(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        Context context2 = imageView.getContext();
        TypedArray typedArray2 = (TypedArray) c0644M1535.f3099;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC1256.m2535(imageView, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC1367.m2767(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC2137.m4075(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c0644M1535.m1556(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC2137.m4076(typedArray.getInt(3, -1), null));
            }
            c0644M1535.m1568();
        } catch (Throwable th) {
            c0644M1535.m1568();
            throw th;
        }
    }

    public C1607(EnumC0940 enumC0940, int i, String str) {
        this.f8177 = 4;
        this.f8179 = enumC0940;
        this.f8178 = i;
        this.f8180 = str;
    }

    public C1607(ImageView imageView) {
        this.f8177 = 0;
        this.f8178 = 0;
        this.f8179 = imageView;
    }

    public C1607(int i, C0680 c0680, C1607 c1607) {
        this.f8177 = 2;
        this.f8178 = i;
        this.f8179 = c0680;
        this.f8180 = c1607;
    }

    public C1607(Integer num, Integer num2, int i) {
        this.f8177 = 1;
        this.f8179 = num;
        this.f8180 = num2;
        this.f8178 = i;
    }

    public C1607(int i, C0680 c0680) {
        this.f8177 = 5;
        this.f8178 = i;
        this.f8179 = c0680;
    }
}
