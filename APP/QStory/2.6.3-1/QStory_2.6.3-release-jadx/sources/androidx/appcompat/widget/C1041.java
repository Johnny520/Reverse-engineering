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
import androidx.appcompat.app.C0955;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.C2188;
import androidx.core.view.AbstractC3103;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import p204.AbstractC8602;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1041 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object f1106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f1107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f1108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f1109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f1110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f1111;

    public C1041(AbstractC2225 abstractC2225, Object obj, boolean z, C2188 c2188, boolean z2) {
        this.f1106 = abstractC2225;
        this.f1109 = z;
        this.f1111 = c2188;
        this.f1108 = z2;
        this.f1110 = obj;
        this.f1107 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m1256(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f1106;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC8602.f21442;
        C0955 c0955M914 = C0955.m914(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        AbstractC3103.m4803(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0955M914.f665, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC4765.m8871(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC4765.m8871(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC4765.m8871(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c0955M914.m945(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC1063.m1282(typedArray.getInt(3, -1), null));
            }
            c0955M914.m923();
        } catch (Throwable th) {
            c0955M914.m923();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object m1257() {
        if (this.f1109) {
            return null;
        }
        Object obj = this.f1110;
        if (obj != null) {
            return obj;
        }
        AbstractC2209.m3066("Unexpected form of a provided value");
        C5043.m9161();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m1258() {
        C1040 c1040 = (C1040) this.f1106;
        Drawable checkMarkDrawable = c1040.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1109 || this.f1108) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f1109) {
                    drawableMutate.setTintList((ColorStateList) this.f1111);
                }
                if (this.f1108) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1110);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c1040.getDrawableState());
                }
                c1040.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m1259() {
        CompoundButton compoundButton = (CompoundButton) this.f1106;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1109 || this.f1108) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f1109) {
                    drawableMutate.setTintList((ColorStateList) this.f1111);
                }
                if (this.f1108) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1110);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public /* synthetic */ C1041(TextView textView) {
        this.f1111 = null;
        this.f1110 = null;
        this.f1109 = false;
        this.f1108 = false;
        this.f1106 = textView;
    }
}
