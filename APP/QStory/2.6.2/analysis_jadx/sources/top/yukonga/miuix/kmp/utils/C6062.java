package top.yukonga.miuix.kmp.utils;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.InterfaceC1095;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰哲苏世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪哲苏兰;", "miuix"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class C6062 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1095 f16579;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0580 f16580;

    public C6062(InterfaceC0580 interfaceC0580, InterfaceC1095 interfaceC1095) {
        this.f16580 = interfaceC0580;
        this.f16579 = interfaceC1095;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6062)) {
            return false;
        }
        C6062 c6062 = (C6062) obj;
        return AbstractC4394.m8917(this.f16580, c6062.f16580) && AbstractC4394.m8917(this.f16579, c6062.f16579);
    }

    public final int hashCode() {
        InterfaceC0580 interfaceC0580 = this.f16580;
        int iHashCode = (interfaceC0580 == null ? 0 : interfaceC0580.hashCode()) * 31;
        InterfaceC1095 interfaceC1095 = this.f16579;
        return AbstractC0053.m140((iHashCode + (interfaceC1095 != null ? interfaceC1095.hashCode() : 0)) * 31, 961, true);
    }

    public final String toString() {
        return "PressableElement(interactionSource=" + this.f16580 + ", indicationNodeFactory=" + this.f16579 + ", enabled=true, role=null, delay=null)";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1095(androidx.compose.ui.AbstractC2128 r6) {
        /*
            r5 = this;
            top.yukonga.miuix.kmp.utils.飘花落叶言子世楪哲苏兰 r6 = (top.yukonga.miuix.kmp.utils.C6046) r6
            r6.getClass()
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r0 = r6.f16564
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r5.f16580
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r1)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L1a
            r6.m11357()
            r6.f16564 = r1
            r6.f16572 = r1
            r0 = r2
            goto L1b
        L1a:
            r0 = r3
        L1b:
            androidx.compose.foundation.飘花落叶言子苏楪兰哲世 r1 = r6.f16571
            androidx.compose.foundation.飘花落叶言子苏楪兰哲世 r5 = r5.f16579
            boolean r1 = kotlin.jvm.internal.AbstractC4394.m8917(r1, r5)
            if (r1 != 0) goto L28
            r6.f16571 = r5
            r0 = r2
        L28:
            boolean r5 = r6.f16570
            if (r5 == r2) goto L31
            androidx.compose.ui.node.AbstractC1785.m3344(r6)
            r6.f16570 = r2
        L31:
            boolean r5 = r6.f16567
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r1 = r6.f16564
            if (r1 != 0) goto L3d
            androidx.compose.foundation.飘花落叶言子苏楪兰哲世 r4 = r6.f16571
            if (r4 == 0) goto L3d
            r4 = r2
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r5 == r4) goto L50
            if (r1 != 0) goto L47
            androidx.compose.foundation.飘花落叶言子苏楪兰哲世 r5 = r6.f16571
            if (r5 == 0) goto L47
            r3 = r2
        L47:
            r6.f16567 = r3
            if (r3 != 0) goto L50
            androidx.compose.ui.node.飘花落叶言子楪苏哲世兰 r5 = r6.f16568
            if (r5 != 0) goto L50
            goto L51
        L50:
            r2 = r0
        L51:
            if (r2 == 0) goto L66
            androidx.compose.ui.node.飘花落叶言子楪苏哲世兰 r5 = r6.f16568
            if (r5 != 0) goto L5b
            boolean r0 = r6.f16567
            if (r0 != 0) goto L66
        L5b:
            if (r5 == 0) goto L60
            r6.m3358(r5)
        L60:
            r5 = 0
            r6.f16568 = r5
            r6.m11358()
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.C6062.mo1095(androidx.compose.ui.飘花落叶言子楪哲苏世兰):void");
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C6046(this.f16580, this.f16579);
    }
}
