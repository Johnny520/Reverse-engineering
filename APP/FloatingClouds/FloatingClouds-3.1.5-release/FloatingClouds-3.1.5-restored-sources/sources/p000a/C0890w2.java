package p000a;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: a.w2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0890w2 implements InterfaceC0182K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomSheetBehavior f3494b;

    public C0890w2(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f3494b = bottomSheetBehavior;
        this.f3493a = i;
    }

    @Override // p000a.InterfaceC0182K
    /* JADX INFO: renamed from: a */
    public final boolean mo493a(View view) {
        this.f3494b.m3099C(this.f3493a);
        return true;
    }
}
