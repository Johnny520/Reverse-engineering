package androidx.compose.ui.platform;

import android.view.ActionMode;
import androidx.compose.foundation.text.selection.C0885;
import com.bumptech.glide.load.engine.C3004;
import kotlin.C5175;
import p052.InterfaceC6542;
import p112.C7327;
import p213.C7952;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1833 implements InterfaceC1874 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3004 f5324 = new C3004(new InterfaceC6542() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // p052.InterfaceC6542
        public /* bridge */ /* synthetic */ Object invoke() {
            m3427invoke();
            return C5175.f14739;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3427invoke() {
            this.this$0.f5325 = null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ActionMode f5325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5326;

    public C1833(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5326 = viewTreeObserverOnGlobalLayoutListenerC1884;
        TextToolbarStatus textToolbarStatus = TextToolbarStatus.Shown;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3455(C7327 c7327, C0885 c0885, C0885 c08852, C0885 c08853, C0885 c08854, C0885 c08855) {
        C3004 c3004 = this.f5324;
        c3004.f9535 = c7327;
        c3004.f9536 = c0885;
        c3004.f9531 = c08853;
        c3004.f9532 = c08852;
        c3004.f9533 = c08854;
        c3004.f9534 = c08855;
        ActionMode actionMode = this.f5325;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        TextToolbarStatus textToolbarStatus = TextToolbarStatus.Shown;
        this.f5325 = this.f5326.startActionMode(new C7952(c3004), 1);
    }
}
