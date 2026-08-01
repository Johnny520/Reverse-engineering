package androidx.compose.ui.layout;

import androidx.compose.ui.node.InterfaceC1737;
import androidx.compose.ui.unit.LayoutDirection;
import p052.InterfaceC6558;
import p205.C7908;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1708 implements InterfaceC7896 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f4980;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3129(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724) {
        abstractC1708.getClass();
        if (abstractC1724 instanceof InterfaceC1737) {
            ((InterfaceC1737) abstractC1724).mo3164(abstractC1708.f4980);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m3130(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, int i, int i2, InterfaceC6558 interfaceC6558, int i3) {
        if ((i3 & 8) != 0) {
            interfaceC6558 = AbstractC1725.f5001;
        }
        abstractC1708.getClass();
        m3129(abstractC1708, abstractC1724);
        abstractC1724.mo3128(C7908.m13362((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC1724.f4995), 0.0f, interfaceC6558);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m3132(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC1708.mo3091() == LayoutDirection.Ltr || abstractC1708.mo3090() == 0) {
            m3129(abstractC1708, abstractC1724);
            abstractC1724.mo3128(C7908.m13362(j, abstractC1724.f4995), 0.0f, null);
        } else {
            int iMo3090 = (abstractC1708.mo3090() - abstractC1724.f4999) - ((int) (j >> 32));
            m3129(abstractC1708, abstractC1724);
            abstractC1724.mo3128(C7908.m13362((((long) iMo3090) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC1724.f4995), 0.0f, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m3133(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, int i, int i2) {
        InterfaceC6558 interfaceC6558 = AbstractC1725.f5001;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (abstractC1708.mo3091() == LayoutDirection.Ltr || abstractC1708.mo3090() == 0) {
            m3129(abstractC1708, abstractC1724);
            abstractC1724.mo3128(C7908.m13362(j, abstractC1724.f4995), 0.0f, interfaceC6558);
        } else {
            int iMo3090 = (abstractC1708.mo3090() - abstractC1724.f4999) - ((int) (j >> 32));
            m3129(abstractC1708, abstractC1724);
            abstractC1724.mo3128(C7908.m13362((((long) iMo3090) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), abstractC1724.f4995), 0.0f, interfaceC6558);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m3134(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, long j) {
        abstractC1708.getClass();
        m3129(abstractC1708, abstractC1724);
        abstractC1724.mo3128(C7908.m13362(j, abstractC1724.f4995), 0.0f, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract int mo3090();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public abstract LayoutDirection mo3091();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract InterfaceC1695 mo3092();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public float mo3093(AbstractC1720 abstractC1720) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3135(AbstractC1724 abstractC1724, int i, int i2, float f) {
        m3129(this, abstractC1724);
        abstractC1724.mo3128(C7908.m13362((((long) i2) & 4294967295L) | (((long) i) << 32), abstractC1724.f4995), f, null);
    }
}
