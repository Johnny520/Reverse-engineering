package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.C0108;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.C1353;
import androidx.core.view.AbstractC2270;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import p188.AbstractC7773;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f762;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f764;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f765;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f766;

    public C0194(AbstractC1390 abstractC1390, Object obj, boolean z, C1353 c1353, boolean z2) {
        this.f761 = abstractC1390;
        this.f764 = z;
        this.f766 = c1353;
        this.f763 = z2;
        this.f765 = obj;
        this.f762 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m696(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f761;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC7773.f21097;
        C0108 c0108M354 = C0108.m354(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0108M354.f320;
        AbstractC2270.m4243(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0108M354.f320, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC3933.m8312(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC3933.m8312(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC3933.m8312(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c0108M354.m385(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC0216.m722(typedArray.getInt(3, -1), null));
            }
            c0108M354.m363();
        } catch (Throwable th) {
            c0108M354.m363();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object m697() {
        if (this.f764) {
            return null;
        }
        Object obj = this.f765;
        if (obj != null) {
            return obj;
        }
        AbstractC1374.m2506("Unexpected form of a provided value");
        C4211.m8602();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m698() {
        C0193 c0193 = (C0193) this.f761;
        Drawable checkMarkDrawable = c0193.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f764 || this.f763) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f764) {
                    drawableMutate.setTintList((ColorStateList) this.f766);
                }
                if (this.f763) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f765);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0193.getDrawableState());
                }
                c0193.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m699() {
        CompoundButton compoundButton = (CompoundButton) this.f761;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f764 || this.f763) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f764) {
                    drawableMutate.setTintList((ColorStateList) this.f766);
                }
                if (this.f763) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f765);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public /* synthetic */ C0194(TextView textView) {
        this.f766 = null;
        this.f765 = null;
        this.f764 = false;
        this.f763 = false;
        this.f761 = textView;
    }
}
