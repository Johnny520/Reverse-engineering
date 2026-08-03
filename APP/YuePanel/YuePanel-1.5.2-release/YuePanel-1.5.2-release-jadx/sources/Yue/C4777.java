package Yue;

import Yue.C6934;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4777 extends AbstractC8388 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final TimeInterpolator f10703 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final TimeInterpolator f10704 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String f10705 = "android:explode:screenBounds";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int[] f10706;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4777() {
        this.f10706 = new int[2];
        setPropagation(new C3823());
    }

    private void captureValues(C7995 c7995) {
        View view = c7995.f3178;
        view.getLocationOnScreen(this.f10706);
        int[] iArr = this.f10706;
        int i = iArr[0];
        int i2 = iArr[1];
        c7995.f3177.put(f10705, new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static float m14432(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static float m14433(View view, int i, int i2) {
        return m14432(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    @Override // Yue.AbstractC8388, Yue.AbstractC7956
    public void captureEndValues(@InterfaceC6391 C7995 c7995) {
        super.captureEndValues(c7995);
        captureValues(c7995);
    }

    @Override // Yue.AbstractC8388, Yue.AbstractC7956
    public void captureStartValues(@InterfaceC6391 C7995 c7995) {
        super.captureStartValues(c7995);
        captureValues(c7995);
    }

    @Override // Yue.AbstractC7956
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // Yue.AbstractC8388
    @InterfaceC6490
    public Animator onAppear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        if (c79952 == null) {
            return null;
        }
        Rect rect = (Rect) c79952.f3177.get(f10705);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m14434(viewGroup, rect, this.f10706);
        int[] iArr = this.f10706;
        return C7997.m4007(view, c79952, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f10703, this);
    }

    @Override // Yue.AbstractC8388
    @InterfaceC6490
    public Animator onDisappear(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        float f;
        float f2;
        if (c7995 == null) {
            return null;
        }
        Rect rect = (Rect) c7995.f3177.get(f10705);
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c7995.f3178.getTag(C6934.C1117.f20101);
        if (iArr != null) {
            f = (r7 - rect.left) + translationX;
            f2 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        m14434(viewGroup, rect, this.f10706);
        int[] iArr2 = this.f10706;
        return C7997.m4007(view, c7995, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], f10704, this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m14434(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.f10706);
        int[] iArr2 = this.f10706;
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            width = (view.getWidth() / 2) + i + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i2 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fM14432 = m14432(fCenterX, fCenterY);
        float fM14433 = m14433(view, width - i, iCenterY - i2);
        iArr[0] = Math.round((fCenterX / fM14432) * fM14433);
        iArr[1] = Math.round(fM14433 * (fCenterY / fM14432));
    }

    public C4777(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10706 = new int[2];
        setPropagation(new C3823());
    }
}
