package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.widget.InterfaceC3131;
import io.ktor.client.plugins.AbstractC4765;
import p269.AbstractC9019;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1043 extends CheckBox implements InterfaceC3131 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0974 f1115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1038 f1116;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1059 f1117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1041 f1118;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC0988.m1157(context);
        AbstractC0999.m1167(getContext(), this);
        C1041 c1041 = new C1041(this);
        this.f1118 = c1041;
        c1041.m1256(attributeSet, i);
        C1038 c1038 = new C1038(this);
        this.f1116 = c1038;
        c1038.m1226(attributeSet, i);
        C1059 c1059 = new C1059(this);
        this.f1117 = c1059;
        c1059.m1267(attributeSet, i);
        getEmojiTextViewHelper().m1095(attributeSet, i);
    }

    private C0974 getEmojiTextViewHelper() {
        if (this.f1115 == null) {
            this.f1115 = new C0974(this);
        }
        return this.f1115;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1038 c1038 = this.f1116;
        if (c1038 != null) {
            c1038.m1238();
        }
        C1059 c1059 = this.f1117;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1038 c1038 = this.f1116;
        if (c1038 != null) {
            return c1038.m1241();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1038 c1038 = this.f1116;
        if (c1038 != null) {
            return c1038.m1242();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC3131
    public ColorStateList getSupportButtonTintList() {
        C1041 c1041 = this.f1118;
        if (c1041 != null) {
            return (ColorStateList) c1041.f1111;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C1041 c1041 = this.f1118;
        if (c1041 != null) {
            return (PorterDuff.Mode) c1041.f1110;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1117.m1269();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1117.m1268();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m1094(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1038 c1038 = this.f1116;
        if (c1038 != null) {
            c1038.m1224();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1038 c1038 = this.f1116;
        if (c1038 != null) {
            c1038.m1223(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1041 c1041 = this.f1118;
        if (c1041 != null) {
            if (c1041.f1107) {
                c1041.f1107 = false;
            } else {
                c1041.f1107 = true;
                c1041.m1259();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1117;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1059 c1059 = this.f1117;
        if (c1059 != null) {
            c1059.m1270();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m1093(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC9019) getEmojiTextViewHelper().f906.f16359).mo13548(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1038 c1038 = this.f1116;
        if (c1038 != null) {
            c1038.m1218(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1038 c1038 = this.f1116;
        if (c1038 != null) {
            c1038.m1221(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC3131
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C1041 c1041 = this.f1118;
        if (c1041 != null) {
            c1041.f1111 = colorStateList;
            c1041.f1109 = true;
            c1041.m1259();
        }
    }

    @Override // androidx.core.widget.InterfaceC3131
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C1041 c1041 = this.f1118;
        if (c1041 != null) {
            c1041.f1110 = mode;
            c1041.f1108 = true;
            c1041.m1259();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1059 c1059 = this.f1117;
        c1059.m1272(colorStateList);
        c1059.m1270();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1059 c1059 = this.f1117;
        c1059.m1274(mode);
        c1059.m1270();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC4765.m8871(getContext(), i));
    }
}
