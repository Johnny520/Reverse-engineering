package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.p001ui.window.InterfaceC2933;
import p221.C8734;
import p221.C8735;
import p221.C8737;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1640 implements InterfaceC2933 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C8737 f2630;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C8735 f2631;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8735 f2632;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public LayoutDirection f2633;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C6686 f2634;

    public C1640(C6686 c6686) {
        this.f2634 = c6686;
    }

    @Override // androidx.compose.p001ui.window.InterfaceC2933
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long mo2186(C8734 c8734, long j, LayoutDirection layoutDirection, long j2) {
        C8737 c8737 = this.f2630;
        if (c8737 != null) {
            C8735 c8735 = this.f2632;
            if ((c8735 == null ? false : C8735.m13916(c8735.f22224, j)) && this.f2633 == layoutDirection) {
                C8735 c87352 = this.f2631;
                if (c87352 != null ? C8735.m13916(c87352.f22224, j2) : false) {
                    return c8737.f22225;
                }
            }
        }
        long jMo2186 = this.f2634.mo2186(c8734, j, layoutDirection, j2);
        this.f2632 = new C8735(j);
        this.f2633 = layoutDirection;
        this.f2631 = new C8735(j2);
        this.f2630 = new C8737(jMo2186);
        return jMo2186;
    }
}
