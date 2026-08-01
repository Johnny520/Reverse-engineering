package p000;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: s3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0448s3 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LinearLayout f827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f829c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f830d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnApplyWindowInsetsListenerC0448s3(LinearLayout linearLayout, int i, int i2, int i3) {
        this.f827a = linearLayout;
        this.f828b = i;
        this.f829c = i2;
        this.f830d = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
        int i = insets.left;
        int i2 = this.f828b;
        this.f827a.setPadding(i + i2, this.f829c + insets.top, i2 + insets.right, this.f830d + insets.bottom);
        return windowInsets;
    }
}
