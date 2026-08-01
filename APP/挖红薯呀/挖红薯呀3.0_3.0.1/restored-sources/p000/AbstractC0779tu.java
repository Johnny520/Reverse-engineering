package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: tu */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0779tu {

    /* JADX INFO: renamed from: a */
    public static final int[] f6044a = new int[2];

    /* JADX INFO: renamed from: b */
    public static final Rect f6045b = new Rect();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final st0 m4225a(View view, ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        int[] iArr = f6044a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        viewTreeObserverOnGlobalLayoutListenerC0875w3.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(f6045b);
        float f2 = (i - i3) + r1.left;
        return new st0(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C0665qu m4226b(int i) {
        if (i == 1) {
            return new C0665qu(2);
        }
        if (i == 2) {
            return new C0665qu(1);
        }
        if (i == 17) {
            return new C0665qu(3);
        }
        if (i == 33) {
            return new C0665qu(5);
        }
        if (i == 66) {
            return new C0665qu(4);
        }
        if (i != 130) {
            return null;
        }
        return new C0665qu(6);
    }
}
