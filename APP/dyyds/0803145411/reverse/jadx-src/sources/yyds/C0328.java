package yyds;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛲᛴᛴᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0328 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f1717;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public Parcelable f1718;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Object f1719;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f1720;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Object f1721;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f1722;

    public /* synthetic */ C0328(TextView textView) {
        this.f1718 = null;
        this.f1719 = null;
        this.f1720 = false;
        this.f1722 = false;
        this.f1721 = textView;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m996() {
        CompoundButton compoundButton = (CompoundButton) this.f1721;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1720 || this.f1722) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f1720) {
                    drawableMutate.setTintList((ColorStateList) this.f1718);
                }
                if (this.f1722) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1719);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m997() {
        C1923 c1923 = (C1923) this.f1721;
        Drawable checkMarkDrawable = c1923.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1720 || this.f1722) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f1720) {
                    drawableMutate.setTintList((ColorStateList) this.f1718);
                }
                if (this.f1722) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f1719);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c1923.getDrawableState());
                }
                c1923.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Bundle m998(String str) {
        if (!this.f1722) {
            C0188.m800("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = (Bundle) this.f1718;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1718;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1718;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1718 = null;
        return bundle2;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m999(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f1721;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC1592.f8089;
        C0644 c0644M1535 = C0644.m1535(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        Context context2 = compoundButton.getContext();
        TypedArray typedArray2 = (TypedArray) c0644M1535.f3099;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC1256.m2535(compoundButton, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC1367.m2767(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC1367.m2767(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC1367.m2767(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c0644M1535.m1556(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC2137.m4076(typedArray.getInt(3, -1), null));
            }
            c0644M1535.m1568();
        } catch (Throwable th) {
            c0644M1535.m1568();
            throw th;
        }
    }

    public C0328() {
        this.f1721 = new C0422();
        this.f1717 = true;
    }
}
