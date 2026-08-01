package androidx.compose.p001ui.platform;

import android.view.ActionMode;
import androidx.compose.foundation.text.selection.C1723;
import com.bumptech.glide.load.engine.C3837;
import kotlin.C6008;
import p068.InterfaceC7372;
import p128.C8157;
import p229.C8782;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2668 implements InterfaceC2709 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3837 f5670 = new C3837(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
        {
            super(0);
        }

        @Override // p068.InterfaceC7372
        public /* bridge */ /* synthetic */ Object invoke() {
            m3997invoke();
            return C6008.f15084;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3997invoke() {
            this.this$0.f5671 = null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ActionMode f5671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f5672;

    public C2668(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        this.f5672 = viewTreeObserverOnGlobalLayoutListenerC2719;
        TextToolbarStatus textToolbarStatus = TextToolbarStatus.Shown;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4025(C8157 c8157, C1723 c1723, C1723 c17232, C1723 c17233, C1723 c17234, C1723 c17235) {
        C3837 c3837 = this.f5670;
        c3837.f9882 = c8157;
        c3837.f9883 = c1723;
        c3837.f9878 = c17233;
        c3837.f9879 = c17232;
        c3837.f9880 = c17234;
        c3837.f9881 = c17235;
        ActionMode actionMode = this.f5671;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        TextToolbarStatus textToolbarStatus = TextToolbarStatus.Shown;
        this.f5671 = this.f5672.startActionMode(new C8782(c3837), 1);
    }
}
