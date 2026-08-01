package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.InterfaceC2100;
import p205.C7905;
import p205.C7906;
import p205.C7908;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0800 implements InterfaceC2100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C7908 f2285;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7906 f2286;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7906 f2287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public LayoutDirection f2288;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5856 f2289;

    public C0800(C5856 c5856) {
        this.f2289 = c5856;
    }

    @Override // androidx.compose.ui.window.InterfaceC2100
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long mo1626(C7905 c7905, long j, LayoutDirection layoutDirection, long j2) {
        C7908 c7908 = this.f2285;
        if (c7908 != null) {
            C7906 c7906 = this.f2287;
            if ((c7906 == null ? false : C7906.m13357(c7906.f21879, j)) && this.f2288 == layoutDirection) {
                C7906 c79062 = this.f2286;
                if (c79062 != null ? C7906.m13357(c79062.f21879, j2) : false) {
                    return c7908.f21880;
                }
            }
        }
        long jMo1626 = this.f2289.mo1626(c7905, j, layoutDirection, j2);
        this.f2287 = new C7906(j);
        this.f2288 = layoutDirection;
        this.f2286 = new C7906(j2);
        this.f2285 = new C7908(jMo1626);
        return jMo1626;
    }
}
