package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;
import p166.AbstractC8412;
import p185.C8546;
import p280.InterfaceC9086;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class PhotoViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f12255;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f12256;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f12257;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f12258;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f12259;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8546 f12260;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC8412 f12261;

    public PhotoViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f12259 = false;
        this.f12256 = 80;
        C4626 c4626 = new C4626(this, 0);
        this.f12256 = (int) ((80.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        this.f12260 = new C8546(getContext(), this, c4626);
        setBackgroundColor(0);
    }

    private View getCurrentImageView() {
        AbstractC8412 abstractC8412 = this.f12261;
        FrameLayout frameLayout = (FrameLayout) abstractC8412.getChildAt(abstractC8412.getCurrentItem());
        if (frameLayout == null) {
            return null;
        }
        return frameLayout.getChildAt(0);
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.f12260.m13577(false)) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:6:0x000c, B:15:0x001c, B:19:0x003d, B:20:0x004c, B:21:0x0054), top: B:26:0x000c }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action;
        boolean z = true;
        if (motionEvent.getPointerCount() > 1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        try {
            action = motionEvent.getAction();
        } catch (Exception unused) {
        }
        if (action != 0) {
            if (action == 1) {
                this.f12257 = 0.0f;
                this.f12258 = 0.0f;
                this.f12259 = false;
            } else if (action == 2) {
                float x = motionEvent.getX() - this.f12257;
                float y = motionEvent.getY() - this.f12258;
                this.f12261.dispatchTouchEvent(motionEvent);
                if (Math.abs(y) <= Math.abs(x)) {
                    z = false;
                }
                this.f12259 = z;
                this.f12257 = motionEvent.getX();
                this.f12258 = motionEvent.getY();
            } else if (action != 3) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f12257 = motionEvent.getX();
        this.f12258 = motionEvent.getY();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f12261 = (AbstractC8412) getChildAt(0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zM13586 = this.f12260.m13586(motionEvent);
        if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2) {
            return false;
        }
        getCurrentImageView();
        return zM13586 && this.f12259;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f12255 = getHeight() / 3;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        try {
            this.f12260.m13592(motionEvent);
        } catch (Exception unused) {
        }
        return true;
    }

    public void setOnDragChangeListener(InterfaceC9086 interfaceC9086) {
    }
}
