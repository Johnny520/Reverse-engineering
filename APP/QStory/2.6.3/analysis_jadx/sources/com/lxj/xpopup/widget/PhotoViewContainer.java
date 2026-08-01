package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;
import p150.AbstractC7583;
import p169.C7717;
import p264.InterfaceC8257;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class PhotoViewContainer extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f11910;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f11911;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f11912;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f11913;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f11914;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7717 f11915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC7583 f11916;

    public PhotoViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11914 = false;
        this.f11911 = 80;
        C3794 c3794 = new C3794(this, 0);
        this.f11911 = (int) ((80.0f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
        this.f11915 = new C7717(getContext(), this, c3794);
        setBackgroundColor(0);
    }

    private View getCurrentImageView() {
        AbstractC7583 abstractC7583 = this.f11916;
        FrameLayout frameLayout = (FrameLayout) abstractC7583.getChildAt(abstractC7583.getCurrentItem());
        if (frameLayout == null) {
            return null;
        }
        return frameLayout.getChildAt(0);
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.f11915.m13018(false)) {
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:6:0x000c, B:15:0x001c, B:19:0x003d, B:20:0x004c, B:21:0x0054), top: B:26:0x000c }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getPointerCount()
            r1 = 1
            if (r0 <= r1) goto Lc
            boolean r5 = super.dispatchTouchEvent(r6)
            return r5
        Lc:
            int r0 = r6.getAction()     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L54
            r2 = 0
            if (r0 == r1) goto L4c
            r3 = 2
            if (r0 == r3) goto L1c
            r1 = 3
            if (r0 == r1) goto L4c
            goto L60
        L1c:
            float r0 = r6.getX()     // Catch: java.lang.Exception -> L60
            float r3 = r5.f11912     // Catch: java.lang.Exception -> L60
            float r0 = r0 - r3
            float r3 = r6.getY()     // Catch: java.lang.Exception -> L60
            float r4 = r5.f11913     // Catch: java.lang.Exception -> L60
            float r3 = r3 - r4
            飘花落叶言子兰苏楪哲世.飘花落叶言子楪苏世兰哲 r4 = r5.f11916     // Catch: java.lang.Exception -> L60
            r4.dispatchTouchEvent(r6)     // Catch: java.lang.Exception -> L60
            float r3 = java.lang.Math.abs(r3)     // Catch: java.lang.Exception -> L60
            float r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Exception -> L60
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3c
            goto L3d
        L3c:
            r1 = r2
        L3d:
            r5.f11914 = r1     // Catch: java.lang.Exception -> L60
            float r0 = r6.getX()     // Catch: java.lang.Exception -> L60
            r5.f11912 = r0     // Catch: java.lang.Exception -> L60
            float r0 = r6.getY()     // Catch: java.lang.Exception -> L60
            r5.f11913 = r0     // Catch: java.lang.Exception -> L60
            goto L60
        L4c:
            r0 = 0
            r5.f11912 = r0     // Catch: java.lang.Exception -> L60
            r5.f11913 = r0     // Catch: java.lang.Exception -> L60
            r5.f11914 = r2     // Catch: java.lang.Exception -> L60
            goto L60
        L54:
            float r0 = r6.getX()     // Catch: java.lang.Exception -> L60
            r5.f11912 = r0     // Catch: java.lang.Exception -> L60
            float r0 = r6.getY()     // Catch: java.lang.Exception -> L60
            r5.f11913 = r0     // Catch: java.lang.Exception -> L60
        L60:
            boolean r5 = super.dispatchTouchEvent(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lxj.xpopup.widget.PhotoViewContainer.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f11916 = (AbstractC7583) getChildAt(0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zM13027 = this.f11915.m13027(motionEvent);
        if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2) {
            return false;
        }
        getCurrentImageView();
        return zM13027 && this.f11914;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11910 = getHeight() / 3;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        try {
            this.f11915.m13033(motionEvent);
        } catch (Exception unused) {
        }
        return true;
    }

    public void setOnDragChangeListener(InterfaceC8257 interfaceC8257) {
    }
}
