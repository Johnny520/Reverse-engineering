package androidx.compose.foundation;

import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.text.selection.C0914;
import androidx.compose.foundation.text.selection.C0936;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.semantics.C1947;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import p205.C7892;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/飘花落叶言子苏世楪哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子苏世哲兰楪;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C1079 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0936 f3207;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1083 f3208;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0914 f3209;

    public C1079(C0914 c0914, C0936 c0936, InterfaceC1083 interfaceC1083) {
        this.f3209 = c0914;
        this.f3207 = c0936;
        this.f3208 = interfaceC1083;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.f3208.hashCode() + ((this.f3207.hashCode() + AbstractC0053.m140(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m141(AbstractC0053.m140(AbstractC0053.m144(this.f3209.hashCode() * 961, Float.NaN, 31), 31, true), 31, 9205357640488583168L), Float.NaN, 31), Float.NaN, 31), 31, true)) * 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C1076 c1076 = (C1076) abstractC2128;
        c1076.getClass();
        InterfaceC1083 interfaceC1083 = c1076.f3202;
        View view = c1076.f3201;
        InterfaceC7895 interfaceC7895 = c1076.f3200;
        c1076.f3197 = this.f3209;
        c1076.f3203 = this.f3207;
        InterfaceC1083 interfaceC10832 = this.f3208;
        c1076.f3202 = interfaceC10832;
        View viewM3327 = AbstractC1785.m3327(c1076);
        InterfaceC7895 interfaceC78952 = AbstractC1785.m3336(c1076).f5098;
        if (c1076.f3199 != null) {
            C1947 c1947 = AbstractC1075.f3192;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !interfaceC10832.mo1941()) || !C7892.m13290(Float.NaN, Float.NaN) || !C7892.m13290(Float.NaN, Float.NaN) || !interfaceC10832.equals(interfaceC1083) || !viewM3327.equals(view) || !AbstractC4394.m8917(interfaceC78952, interfaceC7895)) {
                c1076.m1987();
            }
        }
        c1076.m1986();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C1076(this.f3209, this.f3207, this.f3208);
    }
}
