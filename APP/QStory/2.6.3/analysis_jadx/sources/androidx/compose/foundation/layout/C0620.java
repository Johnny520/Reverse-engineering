package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.node.AbstractC1754;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4339;
import p205.AbstractC7897;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0620 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f1726;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f1727;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public float f1728;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public float f1729;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f1730;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m1388(androidx.compose.ui.layout.InterfaceC1653 r7) {
        /*
            r6 = this;
            float r0 = r6.f1729
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f1729
            int r0 = r7.mo1343(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f1728
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f1728
            int r3 = r7.mo1343(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f1726
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f1726
            int r4 = r7.mo1343(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f1730
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.f1730
            int r6 = r7.mo1343(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = p205.AbstractC7897.m13325(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.C0620.m1388(androidx.compose.ui.layout.飘花落叶言子世兰哲楪苏):long");
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1074(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        long jM1388 = m1388(abstractC1754);
        if (C7898.m13332(jM1388)) {
            return C7898.m13338(jM1388);
        }
        if (!this.f1727) {
            i = AbstractC7897.m13327(i, jM1388);
        }
        return AbstractC7897.m13320(interfaceC1698.mo3057(i), jM1388);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1075(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        long jM1388 = m1388(abstractC1754);
        if (C7898.m13331(jM1388)) {
            return C7898.m13337(jM1388);
        }
        if (!this.f1727) {
            i = AbstractC7897.m13320(i, jM1388);
        }
        return AbstractC7897.m13327(interfaceC1698.mo3058(i), jM1388);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1076(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        long jM1388 = m1388(abstractC1754);
        if (C7898.m13332(jM1388)) {
            return C7898.m13338(jM1388);
        }
        if (!this.f1727) {
            i = AbstractC7897.m13327(i, jM1388);
        }
        return AbstractC7897.m13320(interfaceC1698.mo3054(i), jM1388);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1077(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        long jM1388 = m1388(abstractC1754);
        if (C7898.m13331(jM1388)) {
            return C7898.m13337(jM1388);
        }
        if (!this.f1727) {
            i = AbstractC7897.m13320(i, jM1388);
        }
        return AbstractC7897.m13327(interfaceC1698.mo3059(i), jM1388);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        int iM13341;
        int iM13337;
        int iM13340;
        int iM13338;
        long jM13325;
        long jM1388 = m1388(interfaceC1653);
        if (this.f1727) {
            jM13325 = AbstractC7897.m13321(j, jM1388);
        } else {
            if (Float.isNaN(this.f1726)) {
                iM13341 = C7898.m13341(j);
                int iM133372 = C7898.m13337(jM1388);
                if (iM13341 > iM133372) {
                    iM13341 = iM133372;
                }
            } else {
                iM13341 = C7898.m13341(jM1388);
            }
            if (Float.isNaN(this.f1729)) {
                iM13337 = C7898.m13337(j);
                int iM133412 = C7898.m13341(jM1388);
                if (iM13337 < iM133412) {
                    iM13337 = iM133412;
                }
            } else {
                iM13337 = C7898.m13337(jM1388);
            }
            if (Float.isNaN(this.f1730)) {
                iM13340 = C7898.m13340(j);
                int iM133382 = C7898.m13338(jM1388);
                if (iM13340 > iM133382) {
                    iM13340 = iM133382;
                }
            } else {
                iM13340 = C7898.m13340(jM1388);
            }
            if (Float.isNaN(this.f1728)) {
                iM13338 = C7898.m13338(j);
                int iM133402 = C7898.m13340(jM1388);
                if (iM13338 < iM133402) {
                    iM13338 = iM133402;
                }
            } else {
                iM13338 = C7898.m13338(jM1388);
            }
            jM13325 = AbstractC7897.m13325(iM13341, iM13337, iM13340, iM13338);
        }
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(jM13325);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C0595(abstractC1724Mo3055, 2));
    }
}
