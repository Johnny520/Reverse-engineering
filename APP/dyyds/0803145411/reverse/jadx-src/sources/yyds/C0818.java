package yyds;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: yyds.ᛴᛳᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0818 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC2053 f3749;

    public C0818(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f3749 = new C1116(nestedScrollView);
        } else {
            this.f3749 = new C0805(24);
        }
    }
}
