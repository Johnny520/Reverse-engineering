package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3314 extends ImageView implements InterfaceC7838, InterfaceC7842 {
    private final C3278 mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C3312 mImageHelper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3314(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m349();
        }
        C3312 c3312 = this.mImageHelper;
        if (c3312 != null) {
            c3312.m6770();
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportBackgroundTintList() {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            return c3278.m6723();
        }
        return null;
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            return c3278.m6724();
        }
        return null;
    }

    @Override // Yue.InterfaceC7842
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public ColorStateList getSupportImageTintList() {
        C3312 c3312 = this.mImageHelper;
        if (c3312 != null) {
            return c3312.m6771();
        }
        return null;
    }

    @Override // Yue.InterfaceC7842
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    public PorterDuff.Mode getSupportImageTintMode() {
        C3312 c3312 = this.mImageHelper;
        if (c3312 != null) {
            return c3312.m6772();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m6773() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6726(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4525 int i) {
        super.setBackgroundResource(i);
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6727(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C3312 c3312 = this.mImageHelper;
        if (c3312 != null) {
            c3312.m6770();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@InterfaceC6490 Drawable drawable) {
        C3312 c3312 = this.mImageHelper;
        if (c3312 != null && drawable != null && !this.mHasLevel) {
            c3312.m6775(drawable);
        }
        super.setImageDrawable(drawable);
        C3312 c33122 = this.mImageHelper;
        if (c33122 != null) {
            c33122.m6770();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.m381();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@InterfaceC4525 int i) {
        C3312 c3312 = this.mImageHelper;
        if (c3312 != null) {
            c3312.m6776(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@InterfaceC6490 Uri uri) {
        super.setImageURI(uri);
        C3312 c3312 = this.mImageHelper;
        if (c3312 != null) {
            c3312.m6770();
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6729(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7838
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3278 c3278 = this.mBackgroundTintHelper;
        if (c3278 != null) {
            c3278.m6730(mode);
        }
    }

    @Override // Yue.InterfaceC7842
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@InterfaceC6490 ColorStateList colorStateList) {
        C3312 c3312 = this.mImageHelper;
        if (c3312 != null) {
            c3312.m6778(colorStateList);
        }
    }

    @Override // Yue.InterfaceC7842
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@InterfaceC6490 PorterDuff.Mode mode) {
        C3312 c3312 = this.mImageHelper;
        if (c3312 != null) {
            c3312.m6779(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3314(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3314(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(C7834.m3931(context), attributeSet, i);
        this.mHasLevel = false;
        C7772.m3866(this, getContext());
        C3278 c3278 = new C3278(this);
        this.mBackgroundTintHelper = c3278;
        c3278.m6725(attributeSet, i);
        C3312 c3312 = new C3312(this);
        this.mImageHelper = c3312;
        c3312.m6774(attributeSet, i);
    }
}
