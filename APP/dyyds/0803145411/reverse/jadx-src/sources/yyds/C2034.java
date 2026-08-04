package yyds;

import android.os.Build;
import androidx.activity.C0033;

/* JADX INFO: renamed from: yyds.ᲀᛷᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2034 implements InterfaceC0108 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2748 f10137;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0033 f10138;

    public C2034(C0033 c0033, C2748 c2748) {
        this.f10138 = c0033;
        this.f10137 = c2748;
    }

    @Override // yyds.InterfaceC0108
    public final void cancel() {
        C0033 c0033 = this.f10138;
        C0217 c0217 = c0033.f40;
        C2748 c2748 = this.f10137;
        c0217.remove(c2748);
        c2748.f7378.remove(this);
        if (Build.VERSION.SDK_INT >= 33) {
            c2748.f7379 = null;
            c0033.m23();
        }
    }
}
