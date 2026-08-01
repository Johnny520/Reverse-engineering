package p000;

import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class e20 {

    /* JADX INFO: renamed from: a */
    public final View f1277a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e20(View view, ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        new e20(view);
        Choreographer.getInstance();
        this.f1277a = view;
        long j = l71.f3380b;
        int length = new C0200f8("").f1625e.length();
        int i = l71.f3381c;
        int i2 = (int) (j >> 32);
        int i3 = i2 < 0 ? 0 : i2;
        i3 = i3 > length ? length : i3;
        int i4 = (int) (j & 4294967295L);
        int i5 = i4 >= 0 ? i4 : 0;
        length = i5 <= length ? i5 : length;
        if (i3 != i2 || length != i4) {
            r60.m3402d(i3, length);
        }
        int i6 = u00.f6089e;
        new ArrayList();
        z60.m5422I(new C0310i7(10, this));
        new CursorAnchorInfo.Builder();
        new Matrix();
    }

    public e20(View view) {
        this.f1277a = view;
        z60.m5422I(new C0310i7(2, this));
    }
}
