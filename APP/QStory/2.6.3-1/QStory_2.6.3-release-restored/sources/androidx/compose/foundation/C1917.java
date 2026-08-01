package androidx.compose.foundation;

import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.text.selection.C1752;
import androidx.compose.foundation.text.selection.C1774;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.semantics.C2782;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p221.C8722;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/飘花落叶言子苏世楪哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子苏世哲兰楪;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class C1917 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1774 f3553;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1921 f3554;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1752 f3555;

    public C1917(C1752 c1752, C1774 c1774, InterfaceC1921 interfaceC1921) {
        this.f3555 = c1752;
        this.f3553 = c1774;
        this.f3554 = interfaceC1921;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.f3554.hashCode() + ((this.f3553.hashCode() + AbstractC0900.m701(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m702(AbstractC0900.m701(AbstractC0900.m705(this.f3555.hashCode() * 961, Float.NaN, 31), 31, true), 31, 9205357640488583168L), Float.NaN, 31), Float.NaN, 31), 31, true)) * 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1914 c1914 = (C1914) abstractC2961;
        c1914.getClass();
        InterfaceC1921 interfaceC1921 = c1914.f3548;
        View view = c1914.f3547;
        InterfaceC8725 interfaceC8725 = c1914.f3546;
        c1914.f3543 = this.f3555;
        c1914.f3549 = this.f3553;
        InterfaceC1921 interfaceC19212 = this.f3554;
        c1914.f3548 = interfaceC19212;
        View viewM3897 = AbstractC2620.m3897(c1914);
        InterfaceC8725 interfaceC87252 = AbstractC2620.m3906(c1914).f5444;
        if (c1914.f3545 != null) {
            C2782 c2782 = AbstractC1913.f3538;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !interfaceC19212.mo2511()) || !C8722.m13877(Float.NaN, Float.NaN) || !C8722.m13877(Float.NaN, Float.NaN) || !interfaceC19212.equals(interfaceC1921) || !viewM3897.equals(view) || !AbstractC5227.m9466(interfaceC87252, interfaceC8725)) {
                c1914.m2557();
            }
        }
        c1914.m2556();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1914(this.f3555, this.f3553, this.f3554);
    }
}
