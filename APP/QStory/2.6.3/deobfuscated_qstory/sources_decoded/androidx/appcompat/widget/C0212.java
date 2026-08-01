package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.appcompat.app.C0108;
import java.lang.ref.WeakReference;
import p188.AbstractC7773;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0212 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C0140 f814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0140 f815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C0140 f816;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0140 f817;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0140 f818;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextView f819;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f820;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C0140 f821;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C0140 f822;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public Typeface f824;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0224 f825;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f826 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f823 = -1;

    public C0212(TextView textView) {
        this.f819 = textView;
        this.f825 = new C0224(textView);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0140 m706(Context context, C0130 c0130, int i) {
        ColorStateList colorStateListM632;
        synchronized (c0130) {
            colorStateListM632 = c0130.f572.m632(context, i);
        }
        if (colorStateListM632 == null) {
            return null;
        }
        C0140 c0140 = new C0140();
        c0140.f601 = true;
        c0140.f600 = colorStateListM632;
        return c0140;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:273:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m707(android.util.AttributeSet r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0212.m707(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final PorterDuff.Mode m708() {
        C0140 c0140 = this.f821;
        if (c0140 != null) {
            return (PorterDuff.Mode) c0140.f599;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ColorStateList m709() {
        C0140 c0140 = this.f821;
        if (c0140 != null) {
            return (ColorStateList) c0140.f600;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m710() {
        C0140 c0140 = this.f818;
        TextView textView = this.f819;
        if (c0140 != null || this.f817 != null || this.f816 != null || this.f815 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m711(compoundDrawables[0], this.f818);
            m711(compoundDrawables[1], this.f817);
            m711(compoundDrawables[2], this.f816);
            m711(compoundDrawables[3], this.f815);
        }
        if (this.f814 == null && this.f822 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m711(compoundDrawablesRelative[0], this.f814);
        m711(compoundDrawablesRelative[2], this.f822);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m711(Drawable drawable, C0140 c0140) {
        if (drawable == null || c0140 == null) {
            return;
        }
        C0130.m537(drawable, c0140, this.f819.getDrawableState());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m712(ColorStateList colorStateList) {
        if (this.f821 == null) {
            this.f821 = new C0140();
        }
        C0140 c0140 = this.f821;
        c0140.f600 = colorStateList;
        c0140.f601 = colorStateList != null;
        this.f818 = c0140;
        this.f817 = c0140;
        this.f816 = c0140;
        this.f815 = c0140;
        this.f814 = c0140;
        this.f822 = c0140;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m713(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC7773.f21095);
        C0108 c0108 = new C0108(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f819;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m715(context, c0108);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0214.m717(textView, string);
        }
        c0108.m363();
        Typeface typeface = this.f824;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f826);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m714(PorterDuff.Mode mode) {
        if (this.f821 == null) {
            this.f821 = new C0140();
        }
        C0140 c0140 = this.f821;
        c0140.f599 = mode;
        c0140.f602 = mode != null;
        this.f818 = c0140;
        this.f817 = c0140;
        this.f816 = c0140;
        this.f815 = c0140;
        this.f814 = c0140;
        this.f822 = c0140;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m715(Context context, C0108 c0108) {
        String string;
        int i = this.f826;
        TypedArray typedArray = (TypedArray) c0108.f320;
        this.f826 = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f823 = i3;
            if (i3 != -1) {
                this.f826 &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f820 = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f824 = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f824 = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f824 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f824 = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f823;
        int i7 = this.f826;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM388 = c0108.m388(i5, this.f826, new C0232(this, i6, i7, new WeakReference(this.f819)));
                if (typefaceM388 != null) {
                    if (i2 < 28 || this.f823 == -1) {
                        this.f824 = typefaceM388;
                    } else {
                        this.f824 = AbstractC0213.m716(Typeface.create(typefaceM388, 0), this.f823, (this.f826 & 2) != 0);
                    }
                }
                this.f820 = this.f824 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f824 != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f823 == -1) {
            this.f824 = Typeface.create(string, this.f826);
        } else {
            this.f824 = AbstractC0213.m716(Typeface.create(string, 0), this.f823, (this.f826 & 2) != 0);
        }
    }
}
