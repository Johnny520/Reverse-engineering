package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.InterfaceC2100;
import p205.C7904;
import p205.C7905;
import p205.C7907;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0800 implements InterfaceC2100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C7907 f2284;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7905 f2285;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7905 f2286;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public LayoutDirection f2287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5851 f2288;

    public C0800(C5851 c5851) {
        this.f2288 = c5851;
    }

    @Override // androidx.compose.ui.window.InterfaceC2100
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long mo1616(C7904 c7904, long j, LayoutDirection layoutDirection, long j2) {
        C7907 c7907 = this.f2284;
        if (c7907 != null) {
            C7905 c7905 = this.f2286;
            if ((c7905 == null ? false : C7905.m13329(c7905.f21882, j)) && this.f2287 == layoutDirection) {
                C7905 c79052 = this.f2285;
                if (c79052 != null ? C7905.m13329(c79052.f21882, j2) : false) {
                    return c7907.f21883;
                }
            }
        }
        long jMo1616 = this.f2288.mo1616(c7904, j, layoutDirection, j2);
        this.f2286 = new C7905(j);
        this.f2287 = layoutDirection;
        this.f2285 = new C7905(j2);
        this.f2284 = new C7907(jMo1616);
        return jMo1616;
    }
}
