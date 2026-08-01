package p229r1;

import android.view.View;
import android.view.Window;
import com.bumptech.glide.AbstractC1926h;

/* JADX INFO: renamed from: r1.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3072d0 extends AbstractC1926h {

    /* JADX INFO: renamed from: b */
    public final Window f9784b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3072d0(Window window) {
        this.f9784b = window;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1926h
    /* JADX INFO: renamed from: C */
    public final void mo3584C(boolean z5) {
        Window window = this.f9784b;
        if (!z5) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.AbstractC1926h
    /* JADX INFO: renamed from: D */
    public final void mo3585D(boolean z5) {
        Window window = this.f9784b;
        if (!z5) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
