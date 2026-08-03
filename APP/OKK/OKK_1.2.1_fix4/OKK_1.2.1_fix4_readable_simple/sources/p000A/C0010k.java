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

    public C0010k(int r1, C0011l[] r2) {
        this.f28a = r1;
        this.f29b = r2;
    }

    @Override // p008E.InterfaceC0166t
    /* JADX INFO: renamed from: j */
    public boolean mo18j(View r2) {
        ((BottomSheetBehavior) this.f29b).m1835B(this.f28a);
        return true;
    }

    public C0010k(BottomSheetBehavior r1, int r2) {
        this.f29b = r1;
        this.f28a = r2;
    }
}
