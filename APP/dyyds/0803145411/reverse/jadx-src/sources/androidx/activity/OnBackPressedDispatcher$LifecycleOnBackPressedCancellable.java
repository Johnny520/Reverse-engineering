package androidx.activity;

import android.os.Build;
import androidx.lifecycle.C0038;
import yyds.C0217;
import yyds.C2034;
import yyds.C2748;
import yyds.EnumC0637;
import yyds.InterfaceC0108;
import yyds.InterfaceC0657;
import yyds.InterfaceC2345;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0657, InterfaceC0108 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2034 f34;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0038 f35;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0033 f36;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2748 f37;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0033 c0033, C0038 c0038, C2748 c2748) {
        this.f36 = c0033;
        this.f35 = c0038;
        this.f37 = c2748;
        c0038.m122(this);
    }

    @Override // yyds.InterfaceC0108
    public final void cancel() {
        this.f35.m126(this);
        this.f37.f7378.remove(this);
        C2034 c2034 = this.f34;
        if (c2034 != null) {
            c2034.cancel();
        }
        this.f34 = null;
    }

    @Override // yyds.InterfaceC0657
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo20(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
        if (enumC0637 != EnumC0637.ON_START) {
            if (enumC0637 != EnumC0637.ON_STOP) {
                if (enumC0637 == EnumC0637.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C2034 c2034 = this.f34;
                if (c2034 != null) {
                    c2034.cancel();
                    return;
                }
                return;
            }
        }
        C0033 c0033 = this.f36;
        C0217 c0217 = c0033.f40;
        C2748 c2748 = this.f37;
        c0217.addLast(c2748);
        C2034 c20342 = new C2034(c0033, c2748);
        c2748.f7378.add(c20342);
        if (Build.VERSION.SDK_INT >= 33) {
            c0033.m23();
            c2748.f7379 = c0033.f41;
        }
        this.f34 = c20342;
    }
}
