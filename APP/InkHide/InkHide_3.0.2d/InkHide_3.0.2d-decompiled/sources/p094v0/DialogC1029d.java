package p094v0;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import p004C.C0066j;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p061e.AbstractDialogC0547w;
import p100y0.C1098d;

/* JADX INFO: renamed from: v0.d */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1029d extends AbstractDialogC0547w {

    /* JADX INFO: renamed from: f */
    public final String f3643f;

    /* JADX INFO: renamed from: g */
    public final String f3644g;

    /* JADX INFO: renamed from: h */
    public final C1098d f3645h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogC1029d(Context context, String str, String str2, boolean z2) {
        super(context, 0);
        this.f3644g = str;
        this.f3643f = str2;
        this.f3645h = new C1098d(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractDialogC0547w, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CharSequence charSequence = this.f3643f;
        if (charSequence != null && !AbstractC0307q.m534d0(charSequence)) {
            setTitle(charSequence);
        }
        C0066j c0066j = new C0066j(22, this);
        String str = this.f3644g;
        C1098d c1098d = this.f3645h;
        c1098d.m2367a(str, c0066j);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        WebView webView = c1098d.f3739b;
        if (frameLayout.indexOfChild(webView) == -1) {
            frameLayout.addView(webView, -1, -1);
        }
        setContentView(frameLayout);
        float f = AbstractC0503h.m991x().getResources().getDisplayMetrics().heightPixels * 0.6f;
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, (int) f);
        }
    }
}
