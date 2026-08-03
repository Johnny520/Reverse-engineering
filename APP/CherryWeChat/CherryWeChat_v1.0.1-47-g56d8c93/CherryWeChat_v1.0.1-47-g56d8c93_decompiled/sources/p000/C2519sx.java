package p000;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: sx */
/* JADX INFO: loaded from: classes.dex */
public final class C2519sx {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2476rx f8815a;

    public C2519sx(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f8815a = new C2433qx(nestedScrollView);
        } else {
            this.f8815a = new C1517hw(5);
        }
    }
}
