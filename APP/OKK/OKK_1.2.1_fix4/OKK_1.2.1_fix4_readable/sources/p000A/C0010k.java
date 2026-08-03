package p000A;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p008E.InterfaceC0166t;

/* JADX INFO: renamed from: A.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0010k implements InterfaceC0166t {

    /* JADX INFO: renamed from: a */
    public final int f28a;

    /* JADX INFO: renamed from: b */
    public final Object f29b;

    public C0010k(int i2, C0011l[] c0011lArr) {
        this.f28a = i2;
        this.f29b = c0011lArr;
    }

    @Override // p008E.InterfaceC0166t
    /* JADX INFO: renamed from: j */
    public boolean mo18j(View view) {
        ((BottomSheetBehavior) this.f29b).m1835B(this.f28a);
        return true;
    }

    public C0010k(BottomSheetBehavior bottomSheetBehavior, int i2) {
        this.f29b = bottomSheetBehavior;
        this.f28a = i2;
    }
}
