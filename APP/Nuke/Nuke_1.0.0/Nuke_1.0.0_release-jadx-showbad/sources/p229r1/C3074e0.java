package p229r1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.bumptech.glide.AbstractC1926h;

/* JADX INFO: renamed from: r1.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C3074e0 extends AbstractC1926h {

    /* JADX INFO: renamed from: b */
    public final WindowInsetsController f9788b;

    /* JADX INFO: renamed from: c */
    public final Window f9789c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3074e0(Window window) {
        this.f9788b = window.getInsetsController();
        this.f9789c = window;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1926h
    /* JADX INFO: renamed from: C */
    public void mo3584C(boolean z5) {
        m5396K(16, 16, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1926h
    /* JADX INFO: renamed from: D */
    public void mo3585D(boolean z5) {
        m5396K(8192, 8, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final void m5396K(int i5, int i6, boolean z5) {
        Window window = this.f9789c;
        if (window == null) {
            if (z5) {
                this.f9788b.setSystemBarsAppearance(i6, i6);
                return;
            } else {
                this.f9788b.setSystemBarsAppearance(0, i6);
                return;
            }
        }
        if (z5) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i5 | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i5) & decorView2.getSystemUiVisibility());
        }
    }
}
