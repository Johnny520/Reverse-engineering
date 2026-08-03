package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class TextDrawableHelper {

    @InterfaceC6490
    private TextAppearance textAppearance;
    private float textHeight;
    private float textWidth;
    private final TextPaint textPaint = new TextPaint(1);
    private final TextAppearanceFontCallback fontCallback = new TextAppearanceFontCallback() { // from class: com.google.android.material.internal.TextDrawableHelper.1
        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
            TextDrawableHelper.this.textSizeDirty = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.delegate.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(@InterfaceC6391 Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            TextDrawableHelper.this.textSizeDirty = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.delegate.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }
    };
    private boolean textSizeDirty = true;

    @InterfaceC6490
    private WeakReference<TextDrawableDelegate> delegate = new WeakReference<>(null);

    public interface TextDrawableDelegate {
        @InterfaceC6391
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public TextDrawableHelper(@InterfaceC6490 TextDrawableDelegate textDrawableDelegate) {
        setDelegate(textDrawableDelegate);
    }

    private float calculateTextHeight(@InterfaceC6490 String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.textPaint.getFontMetrics().ascent);
    }

    private float calculateTextWidth(@InterfaceC6490 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void refreshTextDimens(String str) {
        this.textWidth = calculateTextWidth(str);
        this.textHeight = calculateTextHeight(str);
        this.textSizeDirty = false;
    }

    @InterfaceC6490
    public TextAppearance getTextAppearance() {
        return this.textAppearance;
    }

    public float getTextHeight(@InterfaceC6490 String str) {
        if (!this.textSizeDirty) {
            return this.textHeight;
        }
        refreshTextDimens(str);
        return this.textHeight;
    }

    @InterfaceC6391
    public TextPaint getTextPaint() {
        return this.textPaint;
    }

    public float getTextWidth(String str) {
        if (!this.textSizeDirty) {
            return this.textWidth;
        }
        refreshTextDimens(str);
        return this.textWidth;
    }

    public boolean isTextWidthDirty() {
        return this.textSizeDirty;
    }

    public void setDelegate(@InterfaceC6490 TextDrawableDelegate textDrawableDelegate) {
        this.delegate = new WeakReference<>(textDrawableDelegate);
    }

    public void setTextAppearance(@InterfaceC6490 TextAppearance textAppearance, Context context) {
        if (this.textAppearance != textAppearance) {
            this.textAppearance = textAppearance;
            if (textAppearance != null) {
                textAppearance.updateMeasureState(context, this.textPaint, this.fontCallback);
                TextDrawableDelegate textDrawableDelegate = this.delegate.get();
                if (textDrawableDelegate != null) {
                    this.textPaint.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
                this.textSizeDirty = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = this.delegate.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.onTextSizeChange();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    public void setTextSizeDirty(boolean z) {
        this.textSizeDirty = z;
    }

    public void setTextWidthDirty(boolean z) {
        this.textSizeDirty = z;
    }

    public void updateTextPaintDrawState(Context context) {
        this.textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
    }
}
