package androidx.compose.ui.platform;

import android.view.ActionMode;
import androidx.compose.foundation.text.selection.C0885;
import com.bumptech.glide.load.engine.C3005;
import kotlin.C5176;
import p052.InterfaceC6543;
import p112.C7328;
import p213.C7953;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1833 implements InterfaceC1874 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3005 f5325 = new C3005(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // p052.InterfaceC6543
        public /* bridge */ /* synthetic */ Object invoke() {
            m3437invoke();
            return C5176.f14739;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3437invoke() {
            this.this$0.f5326 = null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ActionMode f5326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5327;

    public C1833(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5327 = viewTreeObserverOnGlobalLayoutListenerC1884;
        TextToolbarStatus textToolbarStatus = TextToolbarStatus.Shown;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3465(C7328 c7328, C0885 c0885, C0885 c08852, C0885 c08853, C0885 c08854, C0885 c08855) {
        C3005 c3005 = this.f5325;
        c3005.f9537 = c7328;
        c3005.f9538 = c0885;
        c3005.f9533 = c08853;
        c3005.f9534 = c08852;
        c3005.f9535 = c08854;
        c3005.f9536 = c08855;
        ActionMode actionMode = this.f5326;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        TextToolbarStatus textToolbarStatus = TextToolbarStatus.Shown;
        this.f5326 = this.f5327.startActionMode(new C7953(c3005), 1);
    }
}
